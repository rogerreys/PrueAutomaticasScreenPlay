package com.cobiscorp.cobis.tllrs.impl.steps;

import com.cobiscorp.cobis.serenity.actions.FormActions;
import com.cobiscorp.cobis.serenity.actions.GridActions;
import com.cobiscorp.cobis.tllrs.test.AdminAsientoContableMayorizado;
import com.cobiscorp.cobis.tllrs.test.AdminClientes;
import com.cobiscorp.cobis.tllrs.test.BusquedaClientes;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;

public class AsientoContableMayorizadoStepDefinitions {
	
	@Cuando("el ingresa y selecciona los valores")
	public void el_ingresa_y_selecciona_los_valores() {
		FormActions.EnterDate(AdminAsientoContableMayorizado.Cliente.fechaNacimiento, "17092019");
		FormActions.enterText(AdminAsientoContableMayorizado.Cliente.descripcion, "PRUEBA");
		FormActions.clickOn(AdminAsientoContableMayorizado.Cliente.oficinaOrigen);
		FormActions.clickOn(AdminAsientoContableMayorizado.Cliente.oficinaOrigen);
		FormActions.clickOn(AdminAsientoContableMayorizado.Cliente.oficinaOrigenGrid);
		FormActions.clickOn(AdminAsientoContableMayorizado.Cliente.areaOrigen);
		FormActions.clickOn(AdminAsientoContableMayorizado.Cliente.areaOrigenGrid);
		
	}
	
	@Cuando("selecciona Checkbox Mayorizado")
	public void selecciona_Checkbox_Mayorizado() {
		FormActions.clickOn(AdminAsientoContableMayorizado.Cliente.mayorizado);
		
	  
	}
	@Cuando("realiza el ingreso en la grilla, registro de Cuenta Debito por un valor x")
	public void realiza_el_ingreso_en_la_grilla_registro_de_Cuenta_Debito_por_un_valor_x() {
		FormActions.clickOn(AdminAsientoContableMayorizado.FiltroNuevoAsiento.Buttons._1);
		FormActions.clickOn(AdminAsientoContableMayorizado.FiltroNuevoAsiento.Buttons._2);
		GridActions.selectRecord(AdminAsientoContableMayorizado.gridCliente , 3);
		FormActions.clickOn(AdminAsientoContableMayorizado.FiltroNuevoAsiento.Buttons._3);
		GridActions.selectRecord(AdminAsientoContableMayorizado.gridCliente2 , 2);
		FormActions.clickOn(AdminAsientoContableMayorizado.FiltroNuevoAsiento.Buttons._4);
		GridActions.selectRecord(AdminAsientoContableMayorizado.gridCliente3 , 1);
		FormActions.enterText(AdminAsientoContableMayorizado.FiltroNuevoAsiento.descripcion, "PRUEBA");
		FormActions.scrollTotheEndOfThePage();
		FormActions.clickOn(AdminAsientoContableMayorizado.FiltroNuevoAsiento.valormn);	
		FormActions.enterText(AdminAsientoContableMayorizado.FiltroNuevoAsiento.valormn, "1230");	
	}

	@Cuando("realiza el ingreso en la grilla, registro de Cuenta Credito por un valor x")
	public void realiza_el_ingreso_en_la_grilla_registro_de_Cuenta_Credito_por_un_valor_x() {
	   
	}

	@Cuando("se hace click en el boton guardar")
	public void se_hace_click_en_el_boton_guardar() {
	   
	}

	@Entonces("se emite mensaje de {string}")
	public void se_emite_mensaje_de(String string) {
	   
	}
	

	@Cuando("en la  sección Comprobante contables” se muestran los campos como no editables")
	public void en_la_sección_Comprobante_contables_se_muestran_los_campos_como_no_editables() {
	    
	}

	@Entonces("se carga la Cabecera de Comprobante Contable")
	public void se_carga_la_Cabecera_de_Comprobante_Contable() {
	
	}
}
