//package com.cobiscorp.cobis.tllrs.impl.steps;
//
//import org.openqa.selenium.By;
//
//import com.cobiscorp.cobis.serenity.actions.FormActions;
//import com.cobiscorp.cobis.serenity.actions.GridActions;
//import com.cobiscorp.cobis.tllrs.test.ComprobanteTipo;
//
//import io.cucumber.java.ast.Cuando;
//import io.cucumber.java.es.Entonces;
//
//public class ActualizacionComprobanteContableTipoStepDefinitions {
//	@Cuando("se edita campos {string}  {string}  {string} en  Sección “Comprobante Contable”    Tipo")
//	public void se_edita_campos_en_Sección_Comprobante_Contable_Tipo(String descripcion, String oficinaOrigen, String AOrigen) {
//		FormActions.enterText(ComprobanteTipo.FormComprobanteTipo.descripcion,descripcion);
//		FormActions.clickOn(ComprobanteTipo.FormComprobanteTipo.oficinaOrigen);
//		GridActions.selectRecord(ComprobanteTipo.FormComprobanteTipo.grillaOficinaOrigen,Integer.parseInt(oficinaOrigen));
//		FormActions.clickOn(ComprobanteTipo.FormComprobanteTipo.areaOrigen);
//		GridActions.selectRecord(ComprobanteTipo.FormComprobanteTipo.grillaAreaOrigen, Integer.parseInt(AOrigen));
//	}
//
//	@Cuando("se hace clic en el botón “Guardar”, se emite mensaje “Operación realizada con éxito”  comprobante tipo")
//	public void se_hace_clic_en_el_botón_Guardar_se_emite_mensaje_Operación_realizada_con_éxito_comprobante_tipo() {
//		FormActions.clickOn(ComprobanteTipo.FormComprobanteTipo.Buttons.BUTTON_GUARDAR);
//		FormActions.validateMessage(ComprobanteTipo.FormComprobanteTipo.MESSAGE_EXITOSO);
//	}
//
//	@Cuando("se selecciona de la grilla detalle tipo {string}, se hace clic en el botón Eliminar y se acepta Eliminación")
//	public void se_selecciona_de_la_grilla_detalle_tipo_se_hace_clic_en_el_botón_Eliminar_y_se_acepta_Eliminación(String movimiento) throws InterruptedException {
//		GridActions.clickDeleteRowByColumnAndText(ComprobanteTipo.GridMovimientos, 2, movimiento);
//		GridActions.clickConfirmDelete(true);
//	}
//
//	@Cuando("hace clic en el botón Nuevo, realiza el ingreso grilla  detalle tipo  {string} {string} {string} {string} {string} {string}")
//	public void hace_clic_en_el_botón_Nuevo_realiza_el_ingreso_grilla_detalle_tipo(String CUENTA, String TIPOMOVIMIENTO, String OFICINAORIGEN, String CONCEPTO, String AREAORIGEN, String VALORMN) {
//		FormActions.clickOn(ComprobanteTipo.FormComprobanteTipo.botonNuevoAsientoContable);
//		FormActions.enterText(ComprobanteTipo.FormComprobanteTipo.inputCuenta, CUENTA);
//		FormActions.selectByText(ComprobanteTipo.FormComprobanteTipo.tipoMovimiento,TIPOMOVIMIENTO);
//		FormActions.enterText(ComprobanteTipo.FormComprobanteTipo.inputOficinaOrigen, OFICINAORIGEN);
//		FormActions.enterText(ComprobanteTipo.FormComprobanteTipo.inputAreaOrigen, AREAORIGEN);
//		FormActions.enterText(ComprobanteTipo.FormComprobanteTipo.concepto,CONCEPTO);
//		FormActions.enterText(ComprobanteTipo.FormComprobanteTipo.valor,VALORMN);
//		FormActions.clickOn(ComprobanteTipo.FormComprobanteTipo.botonCheck);
//	}
//
//	@Cuando("se selecciona de la grilla detalle  tipo {string}, se hace clic en el botón Editar")
//	public void se_selecciona_de_la_grilla_detalle_tipo_se_hace_clic_en_el_botón_Editar(String movimiento) {
//		GridActions.clickEditRecordByColumnAndText(ComprobanteTipo.GridMovimientos, 2, movimiento);
//	}
//
//	@Cuando("se edita campos detalle tipo   {string} {string} , {string} {string}, se hace clic en el botón Aceptar")
//	public void se_edita_campos_detalle_tipo_se_hace_clic_en_el_botón_Aceptar(String cuenta, String OOrigen, String AOrigen, String valorMN) {
//		FormActions.enterText(ComprobanteTipo.FormComprobanteTipo.inputCuenta, cuenta);
//		FormActions.enterText(ComprobanteTipo.FormComprobanteTipo.inputOficinaOrigen, OOrigen);
//		FormActions.enterText(ComprobanteTipo.FormComprobanteTipo.inputAreaOrigen, AOrigen);
//		FormActions.enterText(ComprobanteTipo.FormComprobanteTipo.valor,valorMN);
//		FormActions.clickOn(ComprobanteTipo.FormComprobanteTipo.botonUpdate);
//		FormActions.clickOn(ComprobanteTipo.FormComprobanteTipo.botonUpdate);
//	}
//
//
//	@Entonces("se carga la Cabecera de Comprobante Contable Tipo")
//	public void se_carga_la_Cabecera_de_Comprobante_Contable_Tipo() {
//		FormActions.clickOn(ComprobanteTipo.FormComprobanteTipo.Buttons.BUTTON_ABRIR_CABECERA);
//	}
//
//}
