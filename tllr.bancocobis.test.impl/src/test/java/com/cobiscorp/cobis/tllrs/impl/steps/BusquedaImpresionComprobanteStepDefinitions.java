package com.cobiscorp.cobis.tllrs.impl.steps;

import com.cobiscorp.cobis.serenity.actions.FormActions;
import com.cobiscorp.cobis.serenity.actions.GridActions;
import com.cobiscorp.cobis.tllrs.test.AdminBusquedaImpresionComprobante;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;

public class BusquedaImpresionComprobanteStepDefinitions {
	//1
	@Cuando("se hace clic en el botón Buscar se carga pantalla sección “Buscar Comprobante”")
	public void se_hace_clic_en_el_botón_Buscar_se_carga_pantalla_sección_Buscar_Comprobante() {
		FormActions.clickOn(AdminBusquedaImpresionComprobante.FiltroComprobanteContable.Buttons._BK3); 
	}
	//2
	@Cuando("se hace clic en el botón Buscar Comprobantes,se señala campos obligatorios de búsqueda de comprobante")
	public void se_hace_clic_en_el_botón_Buscar_Comprobantes_se_señala_campos_obligatorios_de_búsqueda_de_comprobante() {
		FormActions.clickOn(AdminBusquedaImpresionComprobante.FiltroComprobanteContable.Buttons._NT0);
	}
	//3
	@Cuando("se ingresa campos {int} y {int}  de búsqueda de comprobante")
	public void se_ingresa_campos_y_de_búsqueda_de_comprobante(Integer int1, Integer int2) {
		FormActions.clickOn(AdminBusquedaImpresionComprobante.FiltroComprobanteContable.Buttons._915628);
		GridActions.selectRecord(AdminBusquedaImpresionComprobante.FILTROBUSCARCOMPROBANTE, int1);
		FormActions.clickOn(AdminBusquedaImpresionComprobante.FiltroComprobanteContable.Buttons._621628);
		GridActions.selectRecord(AdminBusquedaImpresionComprobante.FILTROBUSCARCOMPROBANTE, int2);
	}
	//4
	@Cuando("se selecciona {string} y {string}")
	public void se_selecciona_y(String string, String string2) {
		FormActions.EnterDate(AdminBusquedaImpresionComprobante.FiltroComprobanteContable.FECHAINICIAL, string);
		FormActions.EnterDate(AdminBusquedaImpresionComprobante.FiltroComprobanteContable.FECHAFINAL, string2);
	}
	//5
	@Cuando("se hace clic en el botón Buscar Comprobantes, se muestra en la grilla comprobantes contables")
	public void se_hace_clic_en_el_botón_Buscar_Comprobantes_se_muestra_en_la_grilla_comprobantes_contables() {
		FormActions.clickOn(AdminBusquedaImpresionComprobante.FiltroComprobanteContable.Buttons._NT0);
	}
	//6
	@Cuando("se hace clic en el botón Volver, se carga pantalla “Comprobante Contable”")
	public void se_hace_clic_en_el_botón_Volver_se_carga_pantalla_Comprobante_Contable() {
		FormActions.clickOn(AdminBusquedaImpresionComprobante.FiltroComprobanteContable.Buttons._M1M);
	}
	//7
	@Cuando("se selecciona {string} y {string} para buscar por intervalo")
	public void se_selecciona_y_para_buscar_por_intervalor(String string, String string2) {
		FormActions.enterText(AdminBusquedaImpresionComprobante.FiltroComprobanteContable.COMPROBANTEDESDE, string);
		FormActions.enterText(AdminBusquedaImpresionComprobante.FiltroComprobanteContable.COMPROBANTEHASTA, string2);

	}
	//8
	@Cuando("se selecciona los campos obligatorios en sección “Buscar Comprobante”")
	public void se_selecciona_los_campos_obligatorios_en_sección_Buscar_Comprobante() {
		AsientoContableMayorizadoStepDefinitions.el_ingresa_y_selecciona_los_valores();
		AsientoContableMayorizadoStepDefinitions.selecciona_Checkbox_Mayorizado();
	}
	//9
	@Entonces("se hace clic en el botón Limpiar, carga pantalla “Comprobante Contable” inicial")
	public void se_hace_clic_en_el_botón_Limpiar_carga_pantalla_Comprobante_Contable_inicial() {
		FormActions.clickOn(AdminBusquedaImpresionComprobante.FiltroComprobanteContable.Buttons._M1F);
	}
	//10
	@Cuando("se selecciona de la grilla {int}, se carga pantalla “Comprobante Contable”")
	public void se_selecciona_de_la_grilla_se_carga_pantalla_Comprobante_Contable(Integer int1) {
		GridActions.selectRecord(AdminBusquedaImpresionComprobante.SELECCIONARCOMPROBANTE, int1);
	}
	//11
	@Entonces("se hace clic en el botón Imprimir,se despliega “Reporte Planillas Contables”")
	public void se_hace_clic_en_el_botón_Imprimir_se_despliega_Reporte_Planillas_Contables() {
		FormActions.clickOn(AdminBusquedaImpresionComprobante.FiltroComprobanteContable.Buttons._FM5);
	}
	

}
