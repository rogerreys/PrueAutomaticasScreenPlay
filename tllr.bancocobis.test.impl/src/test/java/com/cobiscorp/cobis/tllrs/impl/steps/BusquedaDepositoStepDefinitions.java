package com.cobiscorp.cobis.tllrs.impl.steps;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

import com.cobiscorp.cobis.serenity.actions.FormActions;
import com.cobiscorp.cobis.serenity.actions.ValidationActions;
import com.cobiscorp.cobis.tllrs.test.FBusquedaDepositoForm;
import com.cobiscorp.cobis.tllrs.test.FCancelacionNormalForm;
import com.cobiscorp.cobis.tllrs.test.FDetalleBusquedaDeposito;
import com.cobiscorp.cobis.tllrs.test.FDetalleOperacionApertura;
import com.cobiscorp.cobis.tllrs.test.FFormasDePago;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.waits.WaitUntil;

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
		FormActions.clickOn(FDetalleBusquedaDeposito.Buttons.botonOpcionesApertura);
		FormActions.clickOn(FDetalleBusquedaDeposito.Buttons.botonCancelacionNormal);
	}
	
	
	
	//JCMA QA-S465034
	@Cuando("se diligencia el formulario de Cancelación")
	public void se_diligencia_el_formulario_de_cancelacion(){
		FormActions.selectByText(FCancelacionNormalForm.Seleccion.solicitante, "FERNANDA DIAZ DE LEON");
		FormActions.enterText(FCancelacionNormalForm.IngresarDatos.inputObservacion, "Obervación de prueba");
		FormActions.clickOn(FCancelacionNormalForm.Buttons.botonSiguienteop);
	}
	
	//JCMA QA-S465034
	@Cuando("se diligencia el formulario de forma de pago")
	public void se_diligencia_el_formulario_de_forma_de_pago(){
		FormActions.clickOn(FFormasDePago.Buttons.botonNuevo);
		FormActions.selectByText(FFormasDePago.Seleccion.formaRecepcion, "CONTABLE");
		FormActions.enterText(FFormasDePago.IngresarDatos.input_MontoRecepcion, "7048.32");
		FormActions.selectByText(FFormasDePago.Seleccion.beneficiario, "FERNANDA DIAZ DE LEON");
		FormActions.clickOn(FFormasDePago.Buttons.botonAceptarPago);
		FormActions.clickOn(FFormasDePago.Buttons.botonGuardar);
	}
	
	//JCMA QA-S465034
	@Entonces("el Certificado de Depósito se cancela cambiando el estado del mismo")
	public void el_certificado_de_deposito_se_cancela_cambiando_el_estado_del_mismo(){
		ValidationActions.isEquals(FDetalleOperacionApertura.CabeceraInformacion.estadoApertura, "CAN");
	}
	
/*MAAV Apertura de un certificado de depósito Persona Natural_Vencimiento_Capitalización SI_moneda pesos_ND a una Cta. Sin fondos*/
	
	@Cuando("se busca el certificado de depósito por el {string} con {string}")
	public void se_busca_el_certificado_de_deposito_por_el_con(String numero_de_operacion, String numero_de_cuenta) {
	    FormActions.selectByText(FBusquedaDepositoForm.Seleccion.buscarPor, numero_de_operacion);
	    FormActions.enterText(FBusquedaDepositoForm.IngresarDatos.input_BuscarTodos, numero_de_cuenta);
	    FormActions.clickOn(FBusquedaDepositoForm.Buttons.botonBuscar);
	    FormActions.clickOn(FBusquedaDepositoForm.GridListaP.gridPrimerCliente);
	}
	
	
	@Cuando("se presiona el botón siguiente")
	public void se_presiona_el_botón_siguiente() {
		FormActions.clickOn(FCancelacionNormalForm.Buttons.botonSiguientecli);
	}
	
	@Cuando("se diligencia el formulario de Cancelación con el {string} y con {string}")
	public void se_diligencia_el_formulario_de_cancelacion_con_el_y_con(String numero_de_solicitante ,String observacion) {
		FormActions.selectByText(FCancelacionNormalForm.Seleccion.solicitante,numero_de_solicitante);
		FormActions.enterText(FCancelacionNormalForm.IngresarDatos.inputObservacion, observacion);
		FormActions.clickOn(FCancelacionNormalForm.Buttons.botonSiguienteop);
	}
	
}

