package com.cobiscorp.cobis.tllrs.impl.steps;

import com.cobiscorp.cobis.serenity.actions.FormActions;
import com.cobiscorp.cobis.serenity.actions.GridActions;
import com.cobiscorp.cobis.tllrs.test.AdminBusquedaImpresionComprobante;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;

public class BusquedaImpresionComprobanteStepDefinitions {
	
	@Cuando("se hace clic en el botón Buscar se carga pantalla sección “Buscar Comprobante”")
	public void se_hace_clic_en_el_botón_Buscar_se_carga_pantalla_sección_Buscar_Comprobante() {
		FormActions.clickOn(AdminBusquedaImpresionComprobante.FiltroComprobanteContable.Buttons._BK3); 
	}

	@Cuando("se hace clic en el botón Buscar Comprobantes")
	public void se_hace_clic_en_el_botón_Buscar_Comprobantes() {
		FormActions.clickOn(AdminBusquedaImpresionComprobante.FiltroComprobanteContable.Buttons._NT0);
	}

	@Cuando("se señala campos obligatorios de búsqueda de comprobante")
	public void se_señala_campos_obligatorios_de_búsqueda_de_comprobante() {

	}

	@Cuando("se selecciona los campos obligatorios en sección “Buscar Comprobante”")
	public void se_selecciona_los_campos_obligatorios_en_sección_Buscar_Comprobante() {
		FormActions.clickOn(AdminBusquedaImpresionComprobante.FiltroComprobanteContable.Buttons._915628);
		GridActions.selectRecord(AdminBusquedaImpresionComprobante.FILTROBUSCARCOMPROBANTE, 3);
		FormActions.clickOn(AdminBusquedaImpresionComprobante.FiltroComprobanteContable.Buttons._621628);
		GridActions.selectRecord(AdminBusquedaImpresionComprobante.FILTROBUSCARCOMPROBANTE, 1);
	}

	@Cuando("se selecciona fecha inicial y fecha final")
	public void se_selecciona_fecha_inicial_y_fecha_final() {
		FormActions.EnterDate(AdminBusquedaImpresionComprobante.FiltroComprobanteContable.FECHAINICIAL, "10122019");
		FormActions.EnterDate(AdminBusquedaImpresionComprobante.FiltroComprobanteContable.FECHAFINAL, "31122019");
	}

	@Cuando("se hace clic en el botón Buscar Comprobantes, se muestra en la grilla comprobantes contables")
	public void se_hace_clic_en_el_botón_Buscar_Comprobantes_se_muestra_en_la_grilla_comprobantes_contables() {
		FormActions.clickOn(AdminBusquedaImpresionComprobante.FiltroComprobanteContable.Buttons._NT0);
	}

	@Cuando("se hace clic en el botón Volver, se carga pantalla “Comprobante Contable”")
	public void se_hace_clic_en_el_botón_Volver_se_carga_pantalla_Comprobante_Contable() {
		FormActions.clickOn(AdminBusquedaImpresionComprobante.FiltroComprobanteContable.Buttons._M1M);
		se_hace_clic_en_el_botón_Buscar_se_carga_pantalla_sección_Buscar_Comprobante();
		se_selecciona_los_campos_obligatorios_en_sección_Buscar_Comprobante();
	}

	@Cuando("se selecciona Comprobante desde y comprobante hasta")
	public void se_selecciona_Comprobante_desde_y_comprobante_hasta() {
		FormActions.enterText(AdminBusquedaImpresionComprobante.FiltroComprobanteContable.COMPROBANTEDESDE, "1");
		FormActions.enterText(AdminBusquedaImpresionComprobante.FiltroComprobanteContable.COMPROBANTEHASTA, "8");
		se_hace_clic_en_el_botón_Buscar_Comprobantes();
		FormActions.clickOn(AdminBusquedaImpresionComprobante.FiltroComprobanteContable.Buttons._M1M);
		AsientoContableMayorizadoStepDefinitions.el_ingresa_y_selecciona_los_valores();
		AsientoContableMayorizadoStepDefinitions.selecciona_Checkbox_Mayorizado();

	}

	@Cuando("se hace clic en el botón Limpiar")
	public void se_hace_clic_en_el_botón_Limpiar() {
		FormActions.clickOn(AdminBusquedaImpresionComprobante.FiltroComprobanteContable.Buttons._M1F);
	}

	@Entonces("se carga pantalla “Comprobante Contable”, inicial")
	public void se_carga_pantalla_Comprobante_Contable_inicial() {

	}

}
