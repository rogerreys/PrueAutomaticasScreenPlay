package com.cobiscorp.cobis.tllrs.impl.steps;

import com.cobiscorp.cobis.serenity.actions.FormActions;
import com.cobiscorp.cobis.serenity.actions.GridActions;
import com.cobiscorp.cobis.tllrs.test.AdminAsientoContableMayorizadoTipo;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;

public class AsientoContableMayorizadoTipoStepDefinitions {
	
	@Cuando("se selecciona “Comprobante Tipo”")
	public void se_selecciona_Comprobante_Tipo() {
		FormActions.clickOn(AdminAsientoContableMayorizadoTipo.ComprobanteTipo.Buttons._VA_4483GJDPRVFSBRL_544628);
	}

	@Cuando("se Carga los datos en sección “Comprobante contables” y “Detalle de Comprobante”")
	public void se_Carga_los_datos_en_sección_Comprobante_contables_y_Detalle_de_Comprobante() {
		GridActions.selectRecord(AdminAsientoContableMayorizadoTipo.VALORESCOMPROBANTETIPO , 1);
	}

	@Cuando("selecciona Checkbox “Mayorizado”")
	public void selecciona_Checkbox_Mayorizado() {
		FormActions.clickOn(AdminAsientoContableMayorizadoTipo.Mayorizado.MAYORIZADOCHECK);
	}

	@Cuando("se hace clic en el botón Guardar")
	public void se_hace_clic_en_el_botón_Guardar() {
		FormActions.scrollTotheEndOfThePage();
		FormActions.clickOn(AdminAsientoContableMayorizadoTipo.ComprobanteTipo.Buttons._CM_TCNMNGDF_N1G);
	}

	@Cuando("en la sección “Comprobante contables” se muestran los campos como no editables")
	public void en_la_sección_Comprobante_contables_se_muestran_los_campos_como_no_editables() {
		FormActions.scrollToBeginingOfThePage();
	}
	
	@Entonces("se carga la Cabecera de Comprobante Contable Tipo")
	public void se_carga_la_Cabecera_de_Comprobante_Contable_Tipo() {

	}

}
