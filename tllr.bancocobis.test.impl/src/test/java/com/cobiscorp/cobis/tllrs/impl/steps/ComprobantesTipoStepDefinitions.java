package com.cobiscorp.cobis.tllrs.impl.steps;

import com.cobiscorp.cobis.serenity.actions.FormActions;
import com.cobiscorp.cobis.tllrs.test.ComprobanteTipo;
import io.cucumber.java.es.Cuando;

public class ComprobantesTipoStepDefinitions {
	@Cuando("se hace clic en el botón Guardar Comprobante Tipo")
	public void se_hace_clic_en_el_botón_Guardar_Comprobante_Tipo() {
		FormActions.clickOn(ComprobanteTipo.FormComprobanteTipo.Buttons.BUTTON_GUARDAR);
	}

	@Cuando("se señala campos obligatorios de comprobante contable tipo")
	public void se_señala_campos_obligatorios_de_comprobante_contable_tipo() {
		FormActions.scrollToBeginingOfThePage();
	}

	@Cuando("se ingresa y selecciona los campos obligatorios del comprobante  sección “Comprobante contables”")
	public void se_ingresa_y_selecciona_los_campos_obligatorios_del_comprobante_sección_Comprobante_contables() {
		FormActions.enterText(ComprobanteTipo.FormComprobanteTipo.descripcion, "COMPROBANTE TIPO PRUEBA");
		FormActions.clickOn(ComprobanteTipo.FormComprobanteTipo.oficinaOrigen);
		FormActions.clickOn(ComprobanteTipo.FormComprobanteTipo.oficinaOrigenGrid);
		FormActions.clickOn(ComprobanteTipo.FormComprobanteTipo.areaOrigen);
		FormActions.clickOn(ComprobanteTipo.FormComprobanteTipo.areaOrigenGrid);
	}

	@Cuando("se emite mensaje “No Ha ingresado Registros En la Grilla de Detalles”")
	public void se_emite_mensaje_No_Ha_ingresado_Registros_En_la_Grilla_de_Detalles() {
//		FormActions.validateMessage(ComprobanteTipo.FormComprobanteTipo.MESSAGE_ERROR_INGRESO_GRILLA);
	}

	@Cuando("hace clic en el botón Nuevo, realiza el ingreso en grilla de Cuenta Débito por un valor <<X>>")
	public void hace_clic_en_el_botón_Nuevo_realiza_el_ingreso_en_grilla_de_Cuenta_Débito_por_un_valor_X(String x) {
		FormActions.clickOn(ComprobanteTipo.FormComprobanteTipo.botonNuevoAsientoContable);
		FormActions.enterText(ComprobanteTipo.FormComprobanteTipo.inputCuenta, "1311150");
		FormActions.clickOn(ComprobanteTipo.FormComprobanteTipo.botonAbrirGrillaOficina);
		FormActions.clickOn(ComprobanteTipo.FormComprobanteTipo.botonAbrirGrillaOficina);
		FormActions.clickOn(ComprobanteTipo.FormComprobanteTipo.oficinaOrigenGrid);
		FormActions.clickOn(ComprobanteTipo.FormComprobanteTipo.botonAbrirGrillaArea);
		FormActions.clickOn(ComprobanteTipo.FormComprobanteTipo.areaOrigenGrid);
		FormActions.enterText(ComprobanteTipo.FormComprobanteTipo.concepto,"COMPROBANTE TIPO PRUEBA");
		FormActions.enterText(ComprobanteTipo.FormComprobanteTipo.valor,x);
		FormActions.clickOn(ComprobanteTipo.FormComprobanteTipo.botonCheck);
	}
	@Cuando("hace clic en el botón Nuevo, realiza el ingreso en grilla de Cuenta Débito por un valor {string}")
	public void hace_clic_en_el_botón_Nuevo_realiza_el_ingreso_en_grilla_de_Cuenta_Débito_por_un_valor(String valorMN) {
		FormActions.clickOn(ComprobanteTipo.FormComprobanteTipo.botonNuevoAsientoContable);
		FormActions.enterText(ComprobanteTipo.FormComprobanteTipo.inputCuenta, "1311150");
		FormActions.clickOn(ComprobanteTipo.FormComprobanteTipo.botonAbrirGrillaOficina);
		FormActions.clickOn(ComprobanteTipo.FormComprobanteTipo.botonAbrirGrillaOficina);
		FormActions.clickOn(ComprobanteTipo.FormComprobanteTipo.oficinaOrigenGrid);
		FormActions.clickOn(ComprobanteTipo.FormComprobanteTipo.botonAbrirGrillaArea);
		FormActions.clickOn(ComprobanteTipo.FormComprobanteTipo.areaOrigenGrid);
		FormActions.enterText(ComprobanteTipo.FormComprobanteTipo.concepto,"COMPROBANTE TIPO PRUEBA");
		FormActions.enterText(ComprobanteTipo.FormComprobanteTipo.valor,valorMN);
		FormActions.clickOn(ComprobanteTipo.FormComprobanteTipo.botonCheck);
	}

	@Cuando("se emite mensaje “El comprobante no se encuentra cuadrado, Verifique por favor”")
	public void se_emite_mensaje_El_comprobante_no_se_encuentra_cuadrado_Verifique_por_favor() {
//		FormActions.validateMessage(ComprobanteTipo.FormComprobanteTipo.MESSAGE_ERROR_CUADRAR);
	}

	@Cuando("hace clic en el botón Nuevo, se habilita la edición en la grilla")
	public void hace_clic_en_el_botón_Nuevo_se_habilita_la_edición_en_la_grilla() {
		FormActions.clickOn(ComprobanteTipo.FormComprobanteTipo.botonNuevoAsientoContable);
	}
	
	
	@Cuando("hace clic en el botón Aceptar, se señala campos obligatorios en la Grilla de Detalle")
	public void hace_clic_en_el_botón_Aceptar_se_señala_campos_obligatorios_en_la_Grilla_de_Detalle() {
		FormActions.clickOn(ComprobanteTipo.FormComprobanteTipo.botonCheck);
	}
	@Cuando("hace clic en el botón Aceptar")
	public void hace_clic_en_el_botón_Aceptar() {
		FormActions.clickOn(ComprobanteTipo.FormComprobanteTipo.botonCheck);
	}

	@Cuando("se señala campos obligatorios en la Grilla de Detalle")
	public void se_señala_campos_obligatorios_en_la_Grilla_de_Detalle() {
		FormActions.scrollToBeginingOfThePage();
	}

	@Cuando("se hace clic en el botón Cancelar")
	public void se_hace_clic_en_el_botón_Cancelar() {
		FormActions.clickOn(ComprobanteTipo.FormComprobanteTipo.Buttons.BUTTON_CANCELAR);
	}
	
	
	@Cuando("se muestra pantalla Comprobantes Tipo")
	public void se_muestra_pantalla_Comprobantes_Tipo() {
		FormActions.scrollToBeginingOfThePage();
	}
	
	//Metodos del feature @CrearAsientoContableNoModificable
	@Cuando("selecciona Checkbox “Modificable”")
	public void selecciona_Checkbox_Modificable() {
	   FormActions.clickOn(ComprobanteTipo.FormComprobanteTipo.modificable);
	}

	@Cuando("hace clic en el botón Nuevo, realiza el ingreso en grilla de Cuenta Crédito por un valor <<X>>")
	public void hace_clic_en_el_botón_Nuevo_realiza_el_ingreso_en_grilla_de_Cuenta_Crédito_por_un_valor_X() {
		FormActions.clickOn(ComprobanteTipo.FormComprobanteTipo.botonNuevoAsientoContable);
		FormActions.enterText(ComprobanteTipo.FormComprobanteTipo.inputCuenta, "1311150");
		FormActions.selectByText(ComprobanteTipo.FormComprobanteTipo.tipoMovimiento, "CREDITO");
		FormActions.clickOn(ComprobanteTipo.FormComprobanteTipo.botonAbrirGrillaOficina);
		FormActions.clickOn(ComprobanteTipo.FormComprobanteTipo.botonAbrirGrillaOficina);
		FormActions.clickOn(ComprobanteTipo.FormComprobanteTipo.oficinaOrigenGrid);
		FormActions.clickOn(ComprobanteTipo.FormComprobanteTipo.botonAbrirGrillaArea);
		FormActions.clickOn(ComprobanteTipo.FormComprobanteTipo.areaOrigenGrid);
		FormActions.enterText(ComprobanteTipo.FormComprobanteTipo.concepto,"COMPROBANTE TIPO PRUEBA");
		FormActions.enterText(ComprobanteTipo.FormComprobanteTipo.valor,"1580");
		FormActions.clickOn(ComprobanteTipo.FormComprobanteTipo.botonCheck);
	}

	@Cuando("se emite mensaje de “Operación realizada con éxito”")
	public void se_emite_mensaje_de_Operación_realizada_con_éxito() {
//		FormActions.validateMessage(ComprobanteTipo.FormComprobanteTipo.MESSAGE_EXITOSO);
	}

	@Cuando("en la sección “Comprobante contables “se muestran los campos como no editables")
	public void en_la_sección_Comprobante_contables_se_muestran_los_campos_como_no_editables() {
		FormActions.scrollToBeginingOfThePage();
	}
}
