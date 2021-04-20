package com.cobiscorp.cobis.tllrs.impl.steps;

import com.cobiscorp.cobis.serenity.actions.FormActions;
import com.cobiscorp.cobis.serenity.actions.GridActions;
import com.cobiscorp.cobis.tllrs.test.ComprobanteTipo;

import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;

public class ComprobanteTipoImpresionStepDefinitions {
	@Dado("hace clic en No. Comprobante y seleccionar de pantalla   {string},  se carga comprobante tipo")
	public void hace_clic_en_No_Comprobante_y_seleccionar_de_pantalla_se_carga_comprobante_tipo(String NoComprobante) {
		FormActions.clickOn(ComprobanteTipo.FormComprobanteTipo.Buttons.BUTTON_No_COMPROBANTE_TIPO);
		GridActions.selectRecord(ComprobanteTipo.FormComprobanteTipo.grillaOficinaOrigen, Integer.parseInt(NoComprobante));
	}

	@Entonces("se hace clic en el botón {string},se despliega pantalla {string}")
	public void se_hace_clic_en_el_botón_se_despliega_pantalla(String string, String string2) throws InterruptedException {
		FormActions.clickOn(ComprobanteTipo.FormComprobanteTipo.Buttons.BUTTON_IMPRIMIR);
		/*
		 * El uso del thread sleep es porque la pantalla de impresión del comprobante contable tipo no se encuentra como target
		 * o elemento que se pueda mapear
		 */
		Thread.sleep(2000);
		
	}

}
