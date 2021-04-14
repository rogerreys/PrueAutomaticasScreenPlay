package com.cobiscorp.cobis.tllrs.impl.steps;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

import org.openqa.selenium.Keys;

import com.cobiscorp.cobis.serenity.actions.FormActions;
import com.cobiscorp.cobis.serenity.actions.GridActions;
import com.cobiscorp.cobis.serenity.actions.ValidationActions;
import com.cobiscorp.cobis.tllrs.test.AdminAperturaPlazoFijo;
import com.cobiscorp.cobis.tllrs.test.AdminAsientoContableMayorizado;
import com.cobiscorp.cobis.tllrs.test.AdminClientes;
import com.cobiscorp.cobis.tllrs.test.CabeceraCliente;
import com.cobiscorp.cobis.tllrs.test.FBusquedaClienteForm;
import com.cobiscorp.cobis.tllrs.test.FDetalleOperacionApertura;
import com.cobiscorp.cobis.tllrs.test.FFormasDePago;
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

	/*RSRM El usuario crea una Apertura Deposito a Plazo */
	@Cuando("navega desde menu hacia Apertura")
	public void navega_desde_menu_hacia_Apertura() {
		//FormActions.selectMenuOption("Depósitos a Plazo>>Apertura");
	}

	@Cuando("realiza la busqueda de un {string}")
	public void realiza_la_busqueda_de_un_cliente(String string) {
		FormActions.clickOn(AdminAperturaPlazoFijo.Buttons.nuevoCliente);
		FormActions.clickOn(AdminAperturaPlazoFijo.Buttons.botonBuscarCliente);	
		FormActions.enterText(FBusquedaClienteForm.FiltroBusquedaCliente.input_IDENTIFICACION, string);
		FormActions.clickOn(FBusquedaClienteForm.Buttons.botonBuscarCliente);
		FormActions.clickOn(FBusquedaClienteForm.GridListaP.gridPrimerCliente);
		FormActions.clickOn(AdminAperturaPlazoFijo.ButtonsRow.buttonsAcceptRow);
		FormActions.clickOn(AdminAperturaPlazoFijo.Buttons.botonSiguiente);		
	}

	@Cuando("diligencia el formulario de Operación")
	public void diligencia_el_formulario_de_Operación() {
		FormActions.selectByText(FVistaOperacionForm.Seleccion.producto, "CERTIFICADO VIP");
		FormActions.selectByText(FVistaOperacionForm.Seleccion.formaPago, "PERIODICA");
		FormActions.selectByText(FVistaOperacionForm.Seleccion.frecuenciaPago, "MENSUAL");
		FormActions.selectByText(FVistaOperacionForm.Seleccion.categoria, "NOMINATIVO");
		FormActions.enterText(FVistaOperacionForm.IngresarDatos.input_Monto, "12000");
		FormActions.enterText(FVistaOperacionForm.IngresarDatos.input_Plazo, "35");
		FormActions.clickOn(FVistaOperacionForm.Buttons.botonSimular);
		FormActions.clickOn(FVistaOperacionForm.Buttons.botonAceptarModal);
		FormActions.clickOn(FVistaOperacionForm.Buttons.botonSiguiente);
	}

	@Entonces("el Certificado de Depósito es creado desplegando la pantalla Detalle de la Operación en estado ING")
	public void el_certificado_de_deposito_es_creado_desplegando_la_pantalla_detalle_de_la_operacion_en_estado_ing(){
		ValidationActions.isEquals(FDetalleOperacionApertura.CabeceraInformacion.estadoApertura, "ING");
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
		FormActions.enterText(FBusquedaClienteForm.FiltroBusquedaCliente.input_IDENTIFICACION, string);
		FormActions.clickOn(FBusquedaClienteForm.Buttons.botonBuscarCliente);
		FormActions.clickOn(FBusquedaClienteForm.GridListaP.gridPrimerCliente);
		FormActions.clickOn(AdminAperturaPlazoFijo.ButtonsRow.buttonsAcceptRow);
		FormActions.clickOn(AdminAperturaPlazoFijo.Buttons.botonSiguiente);
	}
	
	@Cuando("diligencia el formulario de recepción de fondos")
	public void diligencia_el_formulario_de_recepción_de_fondos(){
		FormActions.clickOn(FRecepcionModalForm.Buttons.botonNuevo);
		FormActions.selectByText(FRecepcionModalForm.Seleccion.formaRecepcion, "CONTABLE");
		FormActions.enterText(FRecepcionModalForm.IngresarDatos.input_MontoRecepcion, "12000");
		FormActions.clickOn(FRecepcionModalForm.Buttons.botonAceptarRecepcion);
		FormActions.clickOn(FRecepcionModalForm.Buttons.botonSeleccionRecepcion);
		FormActions.clickOn(FRecepcionModalForm.Buttons.botonGuardarRecepcion);
	}
	
	@Cuando("diligencia el formulario formas de pago")
	public void diligencia_el_formulario_formas_de_pago(){
		FormActions.clickOn(FFormasDePago.Buttons.botonNuevo);
		FormActions.selectByText(FFormasDePago.Seleccion.formaRecepcion, "CONTABLE");
		FormActions.enterText(FFormasDePago.IngresarDatos.input_MontoRecepcion, "70.60");
		FormActions.selectByText(FFormasDePago.Seleccion.beneficiario, "LORENA GARCIA ");
		FormActions.clickOn(FFormasDePago.Buttons.botonAceptarPago);
		FormActions.clickOn(FFormasDePago.Buttons.botonGuardar);
	}
	
	
	/*RSRM Apertura de un certificado de depósito Persona Natural_Vencimiento_Capitaliza SI_2 formas de recepción*/
	@Cuando("realiza la busqueda por nombre de {string}")
	public void realiza_la_busqueda_por_nombre_de_cliente(String string){
		FormActions.clickOn(AdminAperturaPlazoFijo.Buttons.nuevoCliente);
		FormActions.clickOn(AdminAperturaPlazoFijo.Buttons.botonBuscarCliente);	
		FormActions.enterText(FBusquedaClienteForm.FiltroBusquedaCliente.input_NOMBRE, string);
		FormActions.clickOn(FBusquedaClienteForm.Buttons.botonBuscarCliente);
		FormActions.clickOn(FBusquedaClienteForm.GridListaP.gridPrimerCliente);
		FormActions.clickOn(AdminAperturaPlazoFijo.ButtonsRow.buttonsAcceptRow);		
	}
	
	@Cuando("nuevamente realiza la busqueda por nombre de un {string} tipo indistinta")
	public void nuevamente_realiza_la_busqueda_por_nombre_de_un_tipo_indistinta(String string) {
		FormActions.clickOn(AdminAperturaPlazoFijo.Buttons.nuevoCliente);
		FormActions.selectByText(AdminAperturaPlazoFijo.tipoCuenta, "INDISTINTA");
		FormActions.clickOn(AdminAperturaPlazoFijo.Buttons.botonBuscarCliente);
		FormActions.enterText(FBusquedaClienteForm.FiltroBusquedaCliente.input_NOMBRE, string);
		FormActions.clickOn(FBusquedaClienteForm.Buttons.botonBuscarCliente);
		FormActions.clickOn(FBusquedaClienteForm.GridListaP.gridPrimerCliente);
		FormActions.clickOn(AdminAperturaPlazoFijo.ButtonsRow.buttonsAcceptRow);
		FormActions.clickOn(AdminAperturaPlazoFijo.Buttons.botonSiguiente);
		
	}
	
	@Cuando("diligencia el formulario de Operación con capitaliza")
	public void diligencia_el_formulario_de_operacion_con_capitaliza(){
		FormActions.selectByText(FVistaOperacionForm.Seleccion.producto, "CERTIFICADO VIP");
		FormActions.selectByText(FVistaOperacionForm.Seleccion.formaPago, "VENCIMIENTO");
		FormActions.selectByText(FVistaOperacionForm.Seleccion.capitalizaInteres, "SI");
		FormActions.selectByText(FVistaOperacionForm.Seleccion.categoria, "NOMINATIVO");
		FormActions.enterText(FVistaOperacionForm.IngresarDatos.input_Monto, "12000");
		FormActions.enterText(FVistaOperacionForm.IngresarDatos.input_Plazo, "35");
		FormActions.clickOn(FVistaOperacionForm.Buttons.botonSimular);
		FormActions.clickOn(FVistaOperacionForm.Buttons.botonAceptarModal);
		FormActions.clickOn(FVistaOperacionForm.Buttons.botonSiguiente);
	}
	@Cuando("diligencia el formulario de Operación {string},{string},{string},{string},{string}")
	public void diligencia_el_formulario_de_Operación(String producto, String forma_pago, String capitaliza, String categoria, String moneda) {
		FormActions.selectByText(FVistaOperacionForm.Seleccion.producto, producto);
		FormActions.selectByText(FVistaOperacionForm.Seleccion.formaPago, forma_pago);
		FormActions.selectByText(FVistaOperacionForm.Seleccion.capitalizaInteres, capitaliza);
		FormActions.selectByText(FVistaOperacionForm.Seleccion.categoria, categoria);
		FormActions.selectByText(FVistaOperacionForm.Seleccion.moneda, moneda);
		FormActions.enterText(FVistaOperacionForm.IngresarDatos.input_Monto, "12000");
		FormActions.enterText(FVistaOperacionForm.IngresarDatos.input_Plazo, "35");
		FormActions.clickOn(FVistaOperacionForm.Buttons.botonSimular);
		FormActions.clickOn(FVistaOperacionForm.Buttons.botonAceptarModal);
		FormActions.clickOn(FVistaOperacionForm.Buttons.botonSiguiente);
	}

	@Cuando("diligencia el formulario de recepción de fondos agregar las dos formas de pago de {string} y {string}")
	public void diligencia_el_formulario_de_recepción_de_fondos_agregar_las_dos_formas_de_pago_de_y(String string, String string2) {
		//Cliente1
		FormActions.clickOn(FRecepcionModalForm.Buttons.botonNuevo);
		FormActions.selectByText(FRecepcionModalForm.Seleccion.formaRecepcion, "CUENTA DE AHORROS");
		FormActions.enterText(FRecepcionModalForm.IngresarDatos.input_MontoRecepcion, "6000");
		FormActions.selectByText(FRecepcionModalForm.Seleccion.cliente, string);
		FormActions.clickOn(FRecepcionModalForm.Buttons.botonCuentaCliente);
		FormActions.enterTextAndEnter(FRecepcionModalForm.IngresarDatos.inputprimerCliente, string);
		GridActions.selectRecord(FRecepcionModalForm.grid, 1); 
		FormActions.clickOn(FRecepcionModalForm.Buttons.botonAceptarRecepcion);

//Cliente2
		FormActions.clickOn(FRecepcionModalForm.Buttons.botonNuevo);
		FormActions.selectByText(FRecepcionModalForm.Seleccion.formaRecepcion, "CUENTA DE AHORROS");
		FormActions.enterText(FRecepcionModalForm.IngresarDatos.input_MontoRecepcion, "6000");
		FormActions.selectByText(FRecepcionModalForm.Seleccion.cliente, string2);
		FormActions.clickOn(FRecepcionModalForm.Buttons.botonCuentaCliente);
		FormActions.enterTextAndEnter(FRecepcionModalForm.IngresarDatos.inputprimerCliente, string2);
		GridActions.selectRecord(FRecepcionModalForm.grid, 1); 		
		FormActions.clickOn(FRecepcionModalForm.Buttons.botonAceptarRecepcion);
		
		FormActions.clickOn(FRecepcionModalForm.Buttons.botonSeleccionRecepcion);
		FormActions.clickOn(FRecepcionModalForm.Buttons.botonGuardarRecepcion);
	}
	
	/*JCMA Apertura de un certificado de depósito Persona Natural_Periódico_pago mensual_Capitalizacion NO_con 2 titulares*/
	@Cuando("realiza la busqueda de un solo {string}")
	public void realiza_la_busqueda_de_un_solo_cliente(String string){
		FormActions.clickOn(AdminAperturaPlazoFijo.Buttons.nuevoCliente);
		FormActions.clickOn(AdminAperturaPlazoFijo.Buttons.botonBuscarCliente);
		FormActions.enterText(FBusquedaClienteForm.FiltroBusquedaCliente.input_IDENTIFICACION, string);
		FormActions.selectByText(FBusquedaClienteForm.Seleccion.tipoCliente, "PERSONA NATURAL");
		FormActions.clickOn(FBusquedaClienteForm.Buttons.botonBuscarCliente);
		FormActions.clickOn(FBusquedaClienteForm.GridListaP.gridPrimerCliente);
		FormActions.clickOn(AdminAperturaPlazoFijo.ButtonsRow.buttonsAcceptRow);
		FormActions.clickOn(AdminAperturaPlazoFijo.Buttons.botonSiguiente);
	}
	
	@Cuando("diligencia el formulario de Operación con moneda dolar")
	public void diligencia_el_formulario_de_operacion_con_moneda_dolar(){
		FormActions.selectByText(FVistaOperacionForm.Seleccion.producto, "CERTIFICADO VIP");
		FormActions.selectByText(FVistaOperacionForm.Seleccion.formaPago, "VENCIMIENTO");
		FormActions.selectByText(FVistaOperacionForm.Seleccion.categoria, "NOMINATIVO");
		//FormActions.selectByText(FVistaOperacionForm.Seleccion.categoria, "NOMINATIVO");
		FormActions.selectByText(FVistaOperacionForm.Seleccion.moneda, "DOLAR");
		FormActions.enterText(FVistaOperacionForm.IngresarDatos.input_Monto, "12000");
		FormActions.enterText(FVistaOperacionForm.IngresarDatos.input_Plazo, "35");
		FormActions.clickOn(FVistaOperacionForm.Buttons.botonSimular);
		FormActions.clickOn(FVistaOperacionForm.Buttons.botonAceptarModal);
		FormActions.clickOn(FVistaOperacionForm.Buttons.botonSiguiente);
	}
	
	
	/*RSRM Apertura de un certificado de depósito Persona Jurídica al Vencimiento 2 titulares(Indistinta)_Capitalizable NO_pesos*/
	@Cuando("realiza la busqueda de {string} cliente juridico")
	public void realiza_la_busqueda_de_un_cliente_juridico(String string) {
		FormActions.clickOn(AdminAperturaPlazoFijo.Buttons.nuevoCliente);
		FormActions.clickOn(AdminAperturaPlazoFijo.Buttons.botonBuscarCliente);	
		FormActions.enterText(FBusquedaClienteForm.FiltroBusquedaCliente.input_NOMBRE, string);
		FormActions.selectByText(FBusquedaClienteForm.Seleccion.tipoCliente, "PERSONA JURIDICA");
		FormActions.clickOn(FBusquedaClienteForm.Buttons.botonBuscarCliente);
		FormActions.clickOn(FBusquedaClienteForm.GridListaP.gridPrimerClienteJuridico);
		FormActions.clickOn(AdminAperturaPlazoFijo.ButtonsRow.buttonsAcceptRow);
	}

	@Cuando("diligencia el formulario de recepción de fondos a persona juridica")
	public void diligencia_el_formulario_de_recepción_de_fondos_a_persona_juridica() {
		FormActions.clickOn(FRecepcionModalForm.Buttons.botonNuevo);
		FormActions.selectByText(FRecepcionModalForm.Seleccion.formaRecepcion, "CONTABLE");
		FormActions.enterText(FRecepcionModalForm.IngresarDatos.input_MontoRecepcion, "12000");
		FormActions.clickOn(FRecepcionModalForm.Buttons.botonAceptarRecepcion);
		FormActions.clickOn(FRecepcionModalForm.Buttons.botonSeleccionRecepcion);
		FormActions.clickOn(FRecepcionModalForm.Buttons.botonSiguienteRecepcion);
	}

//	@Entonces("es creado Certificado de Depósito desplegando la pantalla Detalle de la Operación en estado ING")
//	public void es_creado_Certificado_de_Depósito_desplegando_la_pantalla_Detalle_de_la_Operación_en_estado_ING() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
	
	
	/*RSRM  Apertura de un certificado de depósito Persona Jurídica_ Periódico_1 titular(indistinta)_Pago mensual_Capitalizable SI_dólares (multimoneda)*/
	
	@Cuando("diligencia el formulario de recepción de fondos a {string}")
	public void diligencia_el_formulario_de_recepción_de_fondos_a(String formaRecepcion) {
	   
	}
	@Cuando("diligencia el formulario de forma de pago")
	public void diligencia_el_formulario_de_forma_de_pago() {
		FormActions.clickOn(FFormasDePago.Buttons.botonNuevo);
		FormActions.selectByText(FFormasDePago.Seleccion.formaRecepcion, "CONTABLE");
		FormActions.enterText(FFormasDePago.IngresarDatos.input_MontoRecepcion, "70.60");
		FormActions.selectByText(FFormasDePago.Seleccion.beneficiario, "BANCO TE CREEMOS");
		FormActions.clickOn(FFormasDePago.Buttons.botonAceptarPago);
		FormActions.clickOn(FFormasDePago.Buttons.botonGuardar);
	}	
	

	@Cuando("diligencia el formulario de Operación periodico {string},{string},{string},{string},{string},{string}")
	public void diligencia_el_formulario_de_operacion_periodico(String producto, String forma_pago, String frecuencia, String capitaliza, String categoria, String moneda) {
		FormActions.selectByText(FVistaOperacionForm.Seleccion.producto, producto);
		FormActions.selectByText(FVistaOperacionForm.Seleccion.formaPago, forma_pago);
		FormActions.selectByText(FVistaOperacionForm.Seleccion.frecuenciaPago, frecuencia);
		FormActions.selectByText(FVistaOperacionForm.Seleccion.capitalizaInteres, capitaliza);
		FormActions.selectByText(FVistaOperacionForm.Seleccion.categoria, categoria);
		FormActions.selectByText(FVistaOperacionForm.Seleccion.moneda, moneda);
		FormActions.enterText(FVistaOperacionForm.IngresarDatos.input_Monto, "12000");
		FormActions.enterText(FVistaOperacionForm.IngresarDatos.input_Plazo, "35");
		FormActions.clickOn(FVistaOperacionForm.Buttons.botonSimular);
		FormActions.clickOn(FVistaOperacionForm.Buttons.botonAceptarModal);
		FormActions.clickOn(FVistaOperacionForm.Buttons.botonSiguiente);
	}
	
	@Cuando("diligencia el formulario de recepción de fondos periodico")
	public void diligencia_el_formulario_de_recepción_de_fondos_periodico(){
		FormActions.clickOn(FRecepcionModalForm.Buttons.botonNuevo);
		FormActions.selectByText(FRecepcionModalForm.Seleccion.formaRecepcion, "CONTABLE");
		FormActions.enterText(FRecepcionModalForm.IngresarDatos.input_MontoRecepcion, "12000");
		FormActions.clickOn(FRecepcionModalForm.Buttons.botonAceptarRecepcion);
		FormActions.clickOn(FRecepcionModalForm.Buttons.botonSeleccionRecepcion);
		FormActions.clickOn(FRecepcionModalForm.Buttons.botonSiguienteRecepcion);
	}
	
}
