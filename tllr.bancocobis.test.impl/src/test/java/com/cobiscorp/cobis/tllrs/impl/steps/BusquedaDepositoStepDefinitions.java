package com.cobiscorp.cobis.tllrs.impl.steps;

import com.cobiscorp.cobis.serenity.actions.FormActions;
import com.cobiscorp.cobis.serenity.actions.ValidationActions;
import com.cobiscorp.cobis.tllrs.test.FBusquedaDepositoForm;
import com.cobiscorp.cobis.tllrs.test.FDetalleOperacionApertura;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;

public class BusquedaDepositoStepDefinitions {

	@Cuando("se busca el certificado de depósito por {string} con {string}")
	public void se_busca_el_certificado_de_depósito_por_con(String numero_de_operacion, String numero) {
	    FormActions.selectByText(FBusquedaDepositoForm.Seleccion.buscarPor, numero_de_operacion);
	    FormActions.enterText(FBusquedaDepositoForm.IngresarDatos.input_BuscarTodos, numero);
	    FormActions.clickOn(FBusquedaDepositoForm.Buttons.botonBuscar);
	}

	@Cuando("presionar sobre el DPF en el grid de resultados")
	public void presionar_sobre_el_DPF_en_el_grid_de_resultados() {
		 FormActions.clickOn(FBusquedaDepositoForm.GridListaP.gridPrimerCliente);
	}

	@Cuando("se abre el menú de acciones escoger la opción Activar")
	public void se_abre_el_menú_de_acciones_escoger_la_opción_Activar() {
		FormActions.clickOn(FDetalleOperacionApertura.Buttons.botonOpcionesApertura);
	}
	@Cuando("presiona el botón Aceptar")
	public void presiona_el_botón_Aceptar() {
		FormActions.clickOn(FDetalleOperacionApertura.Buttons.botonActivar);
		FormActions.clickOn(FDetalleOperacionApertura.Buttons.botonAceptar);
	}
	@Entonces("el Certificado de Depósito se muestra un mensaje de excepcion {string} y se mantiene en estado {string}")
	public void el_Certificado_de_Depósito_se_muestra_un_mensaje_de_excepcion_y_se_mantiene_en_estado(String mensajeExcepcion, String estado) {
		ValidationActions.isEquals(FDetalleOperacionApertura.MensajeExcepcion.mensajeInformacion, mensajeExcepcion );
		ValidationActions.isEquals(FDetalleOperacionApertura.CabeceraInformacion.estadoApertura, estado);
	}
	
	//JCMA QA-S465034
	@Cuando("se presiona el menú acciones, escogiendo la opción Cancelación Normal")
	public void se_presiona_el_menu_acciones_escogiendo_la_opcion_cancelacion_normal(){
		FormActions.clickOn(FDetalleOperacionApertura.Buttons.botonOpcionesApertura);
		FormActions.clickOn(FDetalleOperacionApertura.Buttons.botonActivar);
	}
	
	//JCMA QA-S465034
	@Cuando("se presiona el botón siguientes")
	public void se_presiona_el_boton_siguientes(){
		
	}
	
	//JCMA QA-S465034
	@Cuando("se diligencia el formulario de Cancelación")
	public void se_diligencia_el_formulario_de_cancelacion(){
		
	}
	
	@Cuando("se diligencia el formulario de forma de pago")
	public void se_diligencia_el_formulario_de_forma_de_pago(){
		
	}
	
	@Entonces("el Certificado de Depósito se cancela cambiando el estado del mismo")
	public void el_certificado_de_deposito_se_cancela_cambiando_el_estado_del_mismo(){
		
	}
	
}

