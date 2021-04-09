package com.cobiscorp.cobis.tllrs.impl.steps;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

import org.openqa.selenium.Keys;

import com.cobiscorp.cobis.serenity.actions.FormActions;
import com.cobiscorp.cobis.tllrs.test.AdminAperturaPlazoFijo;
import com.cobiscorp.cobis.tllrs.test.AdminClientes;
import com.cobiscorp.cobis.tllrs.test.FBusquedaClienteForm;
import com.cobiscorp.cobis.tllrs.test.FRecepcionModalForm;
import com.cobiscorp.cobis.tllrs.test.FVistaOperacionForm;
import com.cobiscorp.cobis.tllrs.test.FormBienes;
import com.cobiscorp.cobis.tllrs.test.TarjetaCredito;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

public class AperturaDepositoPlazoStepDefinitions {

	@Cuando("navega desde menu hacia Apertura")
	public void navega_desde_menu_hacia_Apertura() {
		//FormActions.selectMenuOption("Depósitos a Plazo>>Apertura");
	}

	@Cuando("abre la opcion cliente")
	public void abre_la_opcion_cliente() {
		FormActions.clickOn(AdminAperturaPlazoFijo.Buttons.nuevoCliente);
		FormActions.clickOn(AdminAperturaPlazoFijo.Buttons.botonBuscarCliente);	
	}

	@Cuando("realiza la busqueda de un {string}")
	public void realiza_la_busqueda_de_un_cliente(String string) {
		FormActions.selectByText(FBusquedaClienteForm.Seleccion.tipoCliente, "PERSONA NATURAL");
		FormActions.enterText(FBusquedaClienteForm.FiltroBusquedaCliente.input_IDENTIFICACION, string);
		FormActions.clickOn(FBusquedaClienteForm.Buttons.botonBuscarCliente);
		FormActions.clickOn(FBusquedaClienteForm.GridListaP.gridPrimerCliente);
		FormActions.clickOn(AdminAperturaPlazoFijo.ButtonsRow.buttonsAcceptRow);
		FormActions.clickOn(AdminAperturaPlazoFijo.Buttons.botonSiguiente);
		
	}

	

	@Cuando("realiza el registro de un nuevo DPF para un cliente")
	public void realiza_el_registro_de_un_nuevo_DPF_para_un_cliente() {
		FormActions.selectByText(FVistaOperacionForm.Seleccion.producto, "CERTIFICADO VIP");
		FormActions.selectByText(FVistaOperacionForm.Seleccion.formaPago, "VENCIMIENTO");
//		FormActions.selectByText(FVistaOperacionForm.Seleccion.fercuenciaPago, "MENSUAL");
//		FormActions.selectByText(FVistaOperacionForm.Seleccion.capitalizaInteres, "SI");
		FormActions.selectByText(FVistaOperacionForm.Seleccion.categoria, "NOMINATIVO");
		FormActions.enterText(FVistaOperacionForm.IngresarDatos.input_Monto, "12000");
//		FormActions.selectByText(FVistaOperacionForm.Seleccion.moneda, "DOLAR");
		FormActions.enterText(FVistaOperacionForm.IngresarDatos.input_Plazo, "35");
		FormActions.clickOn(FVistaOperacionForm.Buttons.botonSimular);
		FormActions.clickOn(FVistaOperacionForm.Buttons.botonAceptarModal);
		FormActions.clickOn(FVistaOperacionForm.Buttons.botonSiguiente);
		
		//Recepcion
		FormActions.clickOn(FRecepcionModalForm.Buttons.botonNuevo);
//		FormActions.enterText(FRecepcionModalForm.IngresarDatos.input_MontoRecepcion, "12000");
		FormActions.selectByText(FRecepcionModalForm.Seleccion.formaRecepcion, "CONTABLE");
		FormActions.clickOn(FRecepcionModalForm.Buttons.botonAceptarRecepcion);
		FormActions.enterText(FRecepcionModalForm.IngresarDatos.input_MontoRecepcion, "12000");
		FormActions.clickOn(FRecepcionModalForm.Buttons.botonAceptarRecepcion);
		FormActions.clickOn(FRecepcionModalForm.Buttons.botonSeleccionRecepcion);
		FormActions.clickOn(FRecepcionModalForm.Buttons.botonGuardarRecepcion);
	}

	@Entonces("se debe mostrar la creacion de la Apertura al cliente previamente seleccionado")
	public void se_debe_mostrar_la_creacion_de_la_Apertura_al_cliente_previamente_seleccionado() {
		/*
		FormActions.clickOn(DesignerHeader.BOTON_DROPDOWN);
		FormActions.clickOn(DesignerHeader.ACTIVAR);
		FormActions.clickOn(DesignerHeader.BOTON_ACEPTAR_MODAL_ACTIVAR);
		*/
	}

	
	/*JCMA Apertura de un certificado de depósito Persona Natural_Periódico_pago mensual_Capitalizacion NO_con 2 titulares*/
	
	@Cuando("realiza la busqueda de {string}")
	public void realiza_la_busqueda_de_cliente(String string){
		FormActions.clickOn(AdminAperturaPlazoFijo.Buttons.nuevoCliente);
		FormActions.clickOn(AdminAperturaPlazoFijo.Buttons.botonBuscarCliente);	
		FormActions.enterText(FBusquedaClienteForm.FiltroBusquedaCliente.input_IDENTIFICACION, string);
		FormActions.clickOn(FBusquedaClienteForm.Buttons.botonBuscarCliente);
		FormActions.clickOn(FBusquedaClienteForm.GridListaP.gridPrimerCliente);
		FormActions.clickOn(AdminAperturaPlazoFijo.ButtonsRow.buttonsAcceptRow);		
	}
	
	@Cuando("nuevamente realiza la busqueda de un {string} tipo conjunta")
	public void nuevamente_realiza_la_busqueda_de_un_cliente_tipo_conjunta(String string){
		FormActions.clickOn(AdminAperturaPlazoFijo.Buttons.nuevoCliente);
		FormActions.selectByText(AdminAperturaPlazoFijo.tipoCuenta, "CONJUNTA");
		FormActions.clickOn(AdminAperturaPlazoFijo.Buttons.botonBuscarCliente);
		FormActions.enterText(FBusquedaClienteForm.FiltroBusquedaCliente.input_IDENTIFICACION, "74489");
		FormActions.clickOn(FBusquedaClienteForm.Buttons.botonBuscarCliente);
		FormActions.clickOn(FBusquedaClienteForm.GridListaP.gridSegundoCliente);
		FormActions.clickOn(AdminAperturaPlazoFijo.ButtonsRow.buttonsAcceptRow);
		FormActions.clickOn(AdminAperturaPlazoFijo.Buttons.botonSiguiente);
	}
	
	@Cuando("diligencia el formulario de Operación")
	public void diligencia_el_formulario_de_operacion(){
		FormActions.selectByText(FVistaOperacionForm.Seleccion.producto, "CERTIFICADO VIP");
		FormActions.selectByText(FVistaOperacionForm.Seleccion.formaPago, "VENCIMIENTO");
		FormActions.selectByText(FVistaOperacionForm.Seleccion.categoria, "NOMINATIVO");
		FormActions.enterText(FVistaOperacionForm.IngresarDatos.input_Monto, "12000");
		FormActions.enterText(FVistaOperacionForm.IngresarDatos.input_Plazo, "35");
		FormActions.clickOn(FVistaOperacionForm.Buttons.botonSimular);
		FormActions.clickOn(FVistaOperacionForm.Buttons.botonAceptarModal);
		FormActions.clickOn(FVistaOperacionForm.Buttons.botonSiguiente);
	}
	
	@Cuando("diligencia el formulario de recepción de fondos")
	public void diligencia_el_formulario_de_recepción_de_fondos(){
		
	}
	
	@Cuando("diligencia el formulario formas de pago")
	public void diligencia_el_formulario_formas_de_pago(){
		
	}
	
	@Entonces("el Certificado de Depósito es creado desplegando la pantalla Detalle de la Operación en estado ING")
	public void el_certificado_de_deposito_es_creado_desplegando_la_pantalla_detalle_de_la_operacion_en_estado_ing(){
		
	}
	
}
