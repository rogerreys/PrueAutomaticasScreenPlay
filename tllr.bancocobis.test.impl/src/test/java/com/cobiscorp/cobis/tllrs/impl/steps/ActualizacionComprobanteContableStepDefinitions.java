//package com.cobiscorp.cobis.tllrs.impl.steps;
//
//import com.cobiscorp.cobis.serenity.actions.FormActions;
//import com.cobiscorp.cobis.serenity.actions.GridActions;
//import com.cobiscorp.cobis.tllrs.test.AdminActualizacionComprobanteContable;
//import com.cobiscorp.cobis.tllrs.test.AdminBusquedaImpresionComprobante;
//import com.cobiscorp.cobis.tllrs.test.AdminCreacionAsientoContableMayorizado;
//
//import io.cucumber.java.es.Cuando;
//import io.cucumber.java.es.Entonces;
//
//public class ActualizacionComprobanteContableStepDefinitions {
//	
//	CreacionAsientoContableMayorizadoStepDefinitions ca = new CreacionAsientoContableMayorizadoStepDefinitions();
//	
//	@Cuando("se ingresa campos {int} y {int}  en búsqueda de comprobante")
//	public void se_ingresa_campos_y_en_búsqueda_de_comprobante(Integer int1, Integer int2) {
//		FormActions.clickOn(AdminBusquedaImpresionComprobante.FiltroComprobanteContable.Buttons._915628);
//		GridActions.selectRecord(AdminBusquedaImpresionComprobante.FILTROBUSCARCOMPROBANTE, int1);
//		FormActions.clickOn(AdminBusquedaImpresionComprobante.FiltroComprobanteContable.Buttons._621628);
//		GridActions.selectRecord(AdminBusquedaImpresionComprobante.FILTROBUSCARCOMPROBANTE, int2);
//	}
//
//	@Cuando("se hace clic en el botón Buscar Comprobantes, se muestra en la grilla todos los comprobantes contables")
//	public void se_hace_clic_en_el_botón_Buscar_Comprobantes_se_muestra_en_la_grilla_todos_los_comprobantes_contables() {
//		FormActions.clickOn(AdminBusquedaImpresionComprobante.FiltroComprobanteContable.Buttons._NT0);
//	}
//
//	@Cuando("se selecciona de la grilla {int}, se carga vista “Comprobante Contable”")
//	public void se_selecciona_de_la_grilla_se_carga_vista_Comprobante_Contable(Integer int1) {
//		GridActions.selectRecord(AdminBusquedaImpresionComprobante.SELECCIONARCOMPROBANTE, int1);
//	}
//
//	@Cuando("se edita campos {string} y {int} y {int}  en “Sección-Comprobante Contable”")
//	public void se_edita_campos_y_y_en_Sección_Comprobante_Contable(String string, Integer int1, Integer int2) {
//		FormActions.enterText(AdminCreacionAsientoContableMayorizado.FiltroComprobanteContable.DESCRIPCION, string);
//		FormActions.clickOn(AdminCreacionAsientoContableMayorizado.FiltroComprobanteContable.Buttons._541628);
//		GridActions.selectRecord(AdminCreacionAsientoContableMayorizado.FILTRORIGEN, int1);
//		FormActions.clickOn(AdminCreacionAsientoContableMayorizado.FiltroComprobanteContable.Buttons._958628);
//		GridActions.selectRecord(AdminCreacionAsientoContableMayorizado.FILTRORIGEN, int2);
//	}
//
//	@Cuando("se hace clic en el botón “Guardar”, se emite mensaje “Operación realizada con éxito”")
//	public void se_hace_clic_en_el_botón_Guardar_se_emite_mensaje_Operación_realizada_con_éxito() {
//		FormActions.clickOn(AdminCreacionAsientoContableMayorizado.FiltroComprobanteContable.Buttons._N1G);
//	}
//
//	@Cuando("se selecciona de la grilla filaMDebito, se hace clic en el botón Eliminar y se acepta Eliminación")
//	public void se_selecciona_de_la_grilla_filaMDebito_se_hace_clic_en_el_botón_Eliminar_y_se_acepta_Eliminación() {
//		FormActions.scrollTotheEndOfThePage();
//		GridActions.scrollToRight("QV_2194_82959");
//		GridActions.scrollToRight("QV_2194_82959");
//		FormActions.clickOn(AdminActualizacionComprobanteContable.FiltroComprobanteContable.Buttons._BEN);
//		FormActions.clickOn(AdminActualizacionComprobanteContable.FiltroComprobanteContable.Buttons._BAE);
//	}
//
//	
//	@Cuando("hace clic en Nuevo, realiza el ingreso en la grilla con {string} y {string} y {int} y {int} y {string} y {string}")
//	public void hace_clic_en_Nuevo_realiza_el_ingreso_en_la_grilla_con_y_y_y_y_y(String string, String string2, Integer int1, Integer int2, String string3, String string4) throws InterruptedException {
//		FormActions.scrollTotheEndOfThePage();
//		GridActions.scrollToLeft("QV_2194_82959");
//		GridActions.scrollToLeft("QV_2194_82959");
//		FormActions.clickOn(AdminCreacionAsientoContableMayorizado.FiltroComprobanteContable.Buttons._82959);
//		ca.realiza_el_ingreso_en_y_y_y_y_y(string, string2, int1, int2, string3, string4);
//		Thread.sleep(3000);
//	}
//
//
//	@Cuando("se selecciona de la grilla detalle filaMDebito, se hace clic en el botón Editar")
//	public void se_selecciona_de_la_grilla_detalle_filaMDebito_se_hace_clic_en_el_botón_Editar() {
//		FormActions.clickOn(AdminActualizacionComprobanteContable.FiltroComprobanteContable.Buttons._BAND);
//		
//	}
//
//	@Cuando("se edita campos {string} y {int} y {int} y {string}, se hace clic en Aceptar")
//	public void se_edita_campos_y_y_y_se_hace_clic_en_Aceptar(String string, Integer int1, Integer int2, String string2) {
//		FormActions.enterTextAndTab(AdminCreacionAsientoContableMayorizado.FiltroComprobanteContable.CUENTA, string);
//		FormActions.clickOn(AdminCreacionAsientoContableMayorizado.FiltroComprobanteContable.Buttons._BPTS);
//		GridActions.selectRecord(AdminCreacionAsientoContableMayorizado.FILTRORIGEN, int1);
//		FormActions.clickOn(AdminCreacionAsientoContableMayorizado.FiltroComprobanteContable.Buttons._BSTS);
//		GridActions.selectRecord(AdminCreacionAsientoContableMayorizado.FILTRORIGEN, int2);
//		GridActions.scrollToRight("QV_2194_82959");
//		GridActions.scrollToRight("QV_2194_82959");
//		FormActions.enterText(AdminCreacionAsientoContableMayorizado.FiltroComprobanteContable.VALORMN, string2);
//		FormActions.clickOn(AdminActualizacionComprobanteContable.FiltroComprobanteContable.Buttons._BACND);
//	}
//
//	@Cuando("se selecciona de la grilla detalle filaMCrédito, se hace clic en el botón Editar")
//	public void se_selecciona_de_la_grilla_detalle_filaMCrédito_se_hace_clic_en_el_botón_Editar() {
//		FormActions.clickOn(AdminActualizacionComprobanteContable.FiltroComprobanteContable.Buttons._BANC);
//	}
//	
//	@Cuando("se edita los campos {string} y {int} y {int} y {string}, se hace clic en Aceptar")
//	public void se_edita_los_campos_y_y_y_se_hace_clic_en_Aceptar(String string, Integer int1, Integer int2, String string2) throws InterruptedException {
//		FormActions.enterTextAndTab(AdminActualizacionComprobanteContable.FiltroComprobanteContable.CUENTA, string);
//		FormActions.clickOn(AdminCreacionAsientoContableMayorizado.FiltroComprobanteContable.Buttons._BPTS);
//		GridActions.selectRecord(AdminCreacionAsientoContableMayorizado.FILTRORIGEN, int1);
//		FormActions.clickOn(AdminCreacionAsientoContableMayorizado.FiltroComprobanteContable.Buttons._BSTS);
//		GridActions.selectRecord(AdminCreacionAsientoContableMayorizado.FILTRORIGEN, int2);
//		GridActions.scrollToRight("QV_2194_82959");
//		GridActions.scrollToRight("QV_2194_82959");
//		FormActions.enterText(AdminCreacionAsientoContableMayorizado.FiltroComprobanteContable.VALORMN, string2);
//		FormActions.clickOn(AdminActualizacionComprobanteContable.FiltroComprobanteContable.Buttons._BACNC);
//		Thread.sleep(3000);
//	}
//	
//	@Entonces("se carga la Cabecera de Comprobante Contable")
//	public void se_carga_la_Cabecera_de_Comprobante_Contable() {
//		FormActions.scrollToBeginingOfThePage();;
//	}
//
//}
