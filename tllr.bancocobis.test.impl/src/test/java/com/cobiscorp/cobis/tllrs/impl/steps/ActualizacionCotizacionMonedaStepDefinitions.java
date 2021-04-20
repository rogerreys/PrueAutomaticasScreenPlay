package com.cobiscorp.cobis.tllrs.impl.steps;

import com.cobiscorp.cobis.serenity.actions.FormActions;
import com.cobiscorp.cobis.serenity.actions.GridActions;
import com.cobiscorp.cobis.tllrs.test.AdminActualizacionCotizacionMoneda;


import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;

public class ActualizacionCotizacionMonedaStepDefinitions {
	
	@Cuando("selecciona en el Listado de Moneda  {int}")
	public void selecciona_en_el_Listado_de_Moneda(Integer int1) {
		FormActions.clickOn(AdminActualizacionCotizacionMoneda.FiltroCotizacion.Buttons._444218);
		GridActions.selectRecord(AdminActualizacionCotizacionMoneda.FILTROMONEDA,int1);
	}

	@Cuando("hace clic en el botón Buscar, se despliega en la grilla cotizaciones")
	public void hace_clic_en_el_botón_Buscar_se_despliega_en_la_grilla_cotizaciones() throws InterruptedException {
		FormActions.clickOn(AdminActualizacionCotizacionMoneda.FiltroCotizacion.Buttons._9LN);
		Thread.sleep(2000);
	}

	@Cuando("selecciona check de  Busqueda Avanzada , se despliega busqueda avanzada cotizaciones")
	public void selecciona_check_de_Busqueda_Avanzada_se_despliega_busqueda_avanzada_cotizaciones() {
		FormActions.clickOn(AdminActualizacionCotizacionMoneda.FiltroCotizacion.Buttons._160218);
	}

	@Cuando("se selecciona Fechas de búsqueda {string} y {string} en cotizaciones")
	public void se_selecciona_Fechas_de_búsqueda_y_en_cotizaciones(String string, String string2) {
		FormActions.EnterDate(AdminActualizacionCotizacionMoneda.FiltroCotizacion.FECHAINICIAL, string);
		FormActions.EnterDate(AdminActualizacionCotizacionMoneda.FiltroCotizacion.FECHAFINAL, string2);
	}

	@Entonces("se hace clic en el botón Buscar, se despliega en la grilla cotizaciones")
	public void se_hace_clic_en_el_botón_Buscar_se_despliega_en_la_grilla_cotizaciones() throws InterruptedException {
		hace_clic_en_el_botón_Buscar_se_despliega_en_la_grilla_cotizaciones();
	}
	
	@Cuando("se hace clic en el botón de Gráfico Fluctaciones, se despliega Grafico con las cotizaciones")
	public void se_hace_clic_en_el_botón_de_Gráfico_Fluctaciones_se_despliega_Grafico_con_las_cotizaciones() {
		FormActions.clickOn(AdminActualizacionCotizacionMoneda.FiltroCotizacion.Buttons._782218);
	}

	@Cuando("se hace clic en el Botón Lupa, se presenta pantalla de Cotizaciones")
	public void se_hace_clic_en_el_Botón_Lupa_se_presenta_pantalla_de_Cotizaciones() {
		FormActions.clickOn(AdminActualizacionCotizacionMoneda.FiltroCotizacion.Buttons._323218);
	}

	@Entonces("se hace clic en Cabecera se deliega cabecera")
	public void se_hace_clic_en_Cabecera_se_deliega_cabecera() throws InterruptedException{
		FormActions.clickOn(AdminActualizacionCotizacionMoneda.FiltroCotizacion.Buttons._HBE);
		Thread.sleep(10000);
		
	}
	
	@Cuando("hace clic en botón Nuevo, se ingresa {string} y {string} y {string} y {string} mensaje de ingreso de Cotización")
	public void hace_clic_en_botón_Nuevo_se_ingresa_y_y_y_mensaje_de_ingreso_de_Cotización(String string, String string2, String string3, String string4) throws InterruptedException {
		FormActions.clickOn(AdminActualizacionCotizacionMoneda.FiltroCotizacion.Buttons._BNC);
		FormActions.EnterDate(AdminActualizacionCotizacionMoneda.FiltroCotizacion.FECHANUEVO, string);
		FormActions.enterText(AdminActualizacionCotizacionMoneda.FiltroCotizacion.VALORCOMPRA, string2);
		FormActions.enterText(AdminActualizacionCotizacionMoneda.FiltroCotizacion.VALORVENTA, string3);
		FormActions.enterText(AdminActualizacionCotizacionMoneda.FiltroCotizacion.COTIZACIONBANCO, string4);
		FormActions.clickOn(AdminActualizacionCotizacionMoneda.FiltroCotizacion.Buttons._BCN);

	}

	@Cuando("se selecciona de la grilla, se hace clic en el botón Eliminar y se acepta Eliminación, mensaje de Eliminación")
	public void se_selecciona_de_la_grilla_se_hace_clic_en_el_botón_Eliminar_y_se_acepta_Eliminación_mensaje_de_Eliminación()  {
		FormActions.clickOn(AdminActualizacionCotizacionMoneda.FiltroCotizacion.Buttons._BEN);
		FormActions.clickOn(AdminActualizacionCotizacionMoneda.FiltroCotizacion.Buttons._BAE);
		GridActions.selectRecord(AdminActualizacionCotizacionMoneda.FILTRODCOTIZACION,1);

	}


	@Cuando("se edita {string} y {string} y {string}, mensaje de edición de Cotización")
	public void se_edita_y_y_mensaje_de_edición_de_Cotización(String string, String string2, String string3){
		FormActions.clickOn(AdminActualizacionCotizacionMoneda.FiltroCotizacion.Buttons._BAN);
		FormActions.enterText(AdminActualizacionCotizacionMoneda.FiltroCotizacion.VALORCOMPRA, string);
		FormActions.enterText(AdminActualizacionCotizacionMoneda.FiltroCotizacion.VALORVENTA, string2);
		FormActions.enterText(AdminActualizacionCotizacionMoneda.FiltroCotizacion.COTIZACIONBANCO, string3);
		FormActions.clickOn(AdminActualizacionCotizacionMoneda.FiltroCotizacion.Buttons._BCN);

	}


}