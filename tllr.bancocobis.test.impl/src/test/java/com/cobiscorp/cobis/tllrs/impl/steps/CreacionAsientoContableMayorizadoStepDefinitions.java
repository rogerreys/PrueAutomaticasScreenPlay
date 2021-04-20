package com.cobiscorp.cobis.tllrs.impl.steps;

import com.cobiscorp.cobis.serenity.actions.FormActions;
import com.cobiscorp.cobis.serenity.actions.GridActions;

import com.cobiscorp.cobis.tllrs.test.AdminCreacionAsientoContableMayorizado;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;

public class CreacionAsientoContableMayorizadoStepDefinitions {
	
	@Cuando("se hace clic en el botón Guardar, se señala campos obligatorios")
	public void se_hace_clic_en_el_botón_Guardar_se_señala_campos_obligatorios() {
		FormActions.clickOn(AdminCreacionAsientoContableMayorizado.FiltroComprobanteContable.Buttons._N1G); 
	}

	@Cuando("se ingresa y selecciona los campos {string} y {string} y {int} y {int} sección “Comprobante contables”")
	public static void se_ingresa_y_selecciona_los_campos_y_y_y_sección_Comprobante_contables(String string, String string2, Integer int1, Integer int2) {
		FormActions.EnterDate(AdminCreacionAsientoContableMayorizado.FiltroComprobanteContable.FECHA, string);
		FormActions.enterText(AdminCreacionAsientoContableMayorizado.FiltroComprobanteContable.DESCRIPCION, string2);
		FormActions.clickOn(AdminCreacionAsientoContableMayorizado.FiltroComprobanteContable.Buttons._541628);
		FormActions.clickOn(AdminCreacionAsientoContableMayorizado.FiltroComprobanteContable.Buttons._541628);
		GridActions.selectRecord(AdminCreacionAsientoContableMayorizado.FILTRORIGEN, int1);
		FormActions.clickOn(AdminCreacionAsientoContableMayorizado.FiltroComprobanteContable.Buttons._958628);
		GridActions.selectRecord(AdminCreacionAsientoContableMayorizado.FILTRORIGEN, int2);
	}

	@Cuando("se hace clic en el botón Guardar,se emite mensaje “No Ha ingresado Registros En la Grilla de Detalles”")
	public void se_hace_clic_en_el_botón_Guardar_se_emite_mensaje_No_Ha_ingresado_Registros_En_la_Grilla_de_Detalles() {
		FormActions.clickOn(AdminCreacionAsientoContableMayorizado.FiltroComprobanteContable.Buttons._N1G);
	}

	@Cuando("hace clic en el botón Nuevo")
	public void hace_clic_en_el_botón_Nuevo() {
		FormActions.scrollTotheEndOfThePage();
		FormActions.clickOn(AdminCreacionAsientoContableMayorizado.FiltroComprobanteContable.Buttons._82959);
	}

	@Cuando("realiza el ingreso en {string} y {string} y {int} y {int} y {string} y {string}")
	public void realiza_el_ingreso_en_y_y_y_y_y(String string, String string2, Integer int1, Integer int2, String string3, String string4) {
		FormActions.enterTextAndTab(AdminCreacionAsientoContableMayorizado.FiltroComprobanteContable.CUENTA, string);
		FormActions.selectByText(AdminCreacionAsientoContableMayorizado.FiltroComprobanteContable.ORIGEN, string2);
		FormActions.clickOn(AdminCreacionAsientoContableMayorizado.FiltroComprobanteContable.Buttons._BPTS);
		GridActions.selectRecord(AdminCreacionAsientoContableMayorizado.FILTRORIGEN, int1);
		FormActions.clickOn(AdminCreacionAsientoContableMayorizado.FiltroComprobanteContable.Buttons._BSTS);
		GridActions.selectRecord(AdminCreacionAsientoContableMayorizado.FILTRORIGEN, int2);
		GridActions.scrollToRight("QV_2194_82959");
		GridActions.scrollToRight("QV_2194_82959");
		FormActions.enterTextAndTab(AdminCreacionAsientoContableMayorizado.FiltroComprobanteContable.CONCEPTO, string3);
		FormActions.enterTextAndTab(AdminCreacionAsientoContableMayorizado.FiltroComprobanteContable.VALORMN, string4);
		FormActions.clickOn(AdminCreacionAsientoContableMayorizado.FiltroComprobanteContable.Buttons._BCN);
	}

	@Cuando("se hace clic en el botón Guardar, se emite mensaje “El comprobante no se encuentra cuadrado, Verifique por favor”")
	public void se_hace_clic_en_el_botón_Guardar_se_emite_mensaje_El_comprobante_no_se_encuentra_cuadrado_Verifique_por_favor() {
		FormActions.clickOn(AdminCreacionAsientoContableMayorizado.FiltroComprobanteContable.Buttons._N1G);
	}

	@Cuando("se hace clic en el botón Limpiar, se muestra pantalla Comprobantes Contables")
	public void se_hace_clic_en_el_botón_Limpiar_se_muestra_pantalla_Comprobantes_Contables() {
		FormActions.clickOn(AdminCreacionAsientoContableMayorizado.FiltroComprobanteContable.Buttons._M1F);
		FormActions.scrollToBeginingOfThePage();
		FormActions.scrollToBeginingOfThePage();
	}
	
	@Entonces("se hace clic en el botón Guardar,se señala los campos obligatorios")
	public void se_hace_clic_en_el_botón_Guardar_se_señala_los_campos_obligatorios() {
		FormActions.clickOn(AdminCreacionAsientoContableMayorizado.FiltroComprobanteContable.Buttons._N1G); 
	}
	
	@Cuando("selecciona Checkbox “Mayorizado”")
	public void selecciona_Checkbox_Mayorizado() {
		FormActions.clickOn(AdminCreacionAsientoContableMayorizado.FiltroComprobanteContable.MAYORIZADO);
	}

	@Cuando("realiza el ingreso en grilla de Cuenta Débito con valores en {string} y {string} y {int} y {int} y {string} y {string}")
	public void realiza_el_ingreso_en_grilla_de_Cuenta_Débito_con_valores_en_y_y_y_y_y(String string, String string2, Integer int1, Integer int2, String string3, String string4) {
		realiza_el_ingreso_en_y_y_y_y_y(string, string2, int1, int2, string3, string4);
	}

	@Cuando("realiza el ingreso en grilla de Cuenta Crédito con valores en {string} y {string} y {int} y {int} y {string} y {string}")
	public void realiza_el_ingreso_en_grilla_de_Cuenta_Crédito_con_valores_en_y_y_y_y_y(String string, String string2, Integer int1, Integer int2, String string3, String string4) {
		realiza_el_ingreso_en_y_y_y_y_y(string, string2, int1, int2, string3, string4);
	}

	@Cuando("se hace clic en el botón Guardar,se emite mensaje de “Operación realizada con éxito”")
	public void se_hace_clic_en_el_botón_Guardar_se_emite_mensaje_de_Operación_realizada_con_éxito() {
		FormActions.clickOn(AdminCreacionAsientoContableMayorizado.FiltroComprobanteContable.Buttons._N1G);
	}

	@Entonces("en la sección Comprobante contables” se muestran los campos como no editables se carga la Cabecera de Comprobante Contable")
	public void en_la_sección_Comprobante_contables_se_muestran_los_campos_como_no_editables_se_carga_la_Cabecera_de_Comprobante_Contable() {
		FormActions.scrollToBeginingOfThePage();
		FormActions.scrollToBeginingOfThePage();
	}
	
	@Cuando("se selecciona “Comprobante Tipo”")
	public void se_selecciona_Comprobante_Tipo() {
		FormActions.clickOn(AdminCreacionAsientoContableMayorizado.FiltroComprobanteContable.Buttons._544628);
	}
	
	@Cuando("se carga los datos {int} en sección “Comprobante contables” y “Detalle de Comprobante”")
	public void se_carga_los_datos_en_sección_Comprobante_contables_y_Detalle_de_Comprobante(Integer int1) {
		GridActions.selectRecord(AdminCreacionAsientoContableMayorizado.FILTRORIGEN , int1);
	}

}
