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
		//FormActions.clickOn(FRecepcionModalForm.Buttons.botonAceptarRecepcion);
		FormActions.enterText(FRecepcionModalForm.IngresarDatos.input_MontoRecepcion, "12000");
		FormActions.clickOn(FRecepcionModalForm.Buttons.botonAceptarRecepcion);
		FormActions.clickOn(FRecepcionModalForm.Buttons.botonSeleccionRecepcion);
		//FormActions.clickOn(FRecepcionModalForm.Buttons.botonGuardarRecepcion);
		FormActions.clickOn(FRecepcionModalForm.Buttons.botonSiguienteRecepcion);
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

	@Cuando("diligencia el formulario de recepción de fondos agregar las {int} formas de pago")
	public void diligencia_el_formulario_de_recepción_de_fondos_agregar_las_formas_de_pago(Integer int1) {
		FormActions.clickOn(FRecepcionModalForm.Buttons.botonNuevo);
//		FormActions.selectByText(FRecepcionModalForm.Seleccion.formaRecepcion, "CONTABLE");
		FormActions.selectByText(FRecepcionModalForm.Seleccion.formaRecepcion, "CUENTA DE AHORROS");
		FormActions.enterText(FRecepcionModalForm.IngresarDatos.input_MontoRecepcion, "6000");
		FormActions.selectByText(FRecepcionModalForm.Seleccion.cliente, "EVELIN");
		FormActions.clickOn(FRecepcionModalForm.Buttons.botonCuentaCliente);
		FormActions.enterTextAndEnter(FRecepcionModalForm.IngresarDatos.inputprimerCliente, "EVELIN");
//		GridActions.clickNewRecord(FRecepcionModalForm.grid);
		FormActions.clickOn(FRecepcionModalForm.Grid.gridPrimerCliente);
		FormActions.clickOn(FRecepcionModalForm.Buttons.botonAceptarRecepcion);

//Cliente2
		FormActions.clickOn(FRecepcionModalForm.Buttons.botonNuevo);
		FormActions.selectByText(FRecepcionModalForm.Seleccion.formaRecepcion, "CUENTA DE AHORROS");
		FormActions.enterText(FRecepcionModalForm.IngresarDatos.input_MontoRecepcion, "6000");
		FormActions.selectByText(FRecepcionModalForm.Seleccion.cliente, "ITALIA");
		FormActions.clickOn(FRecepcionModalForm.Buttons.botonCuentaCliente);
		FormActions.enterTextAndEnter(FRecepcionModalForm.IngresarDatos.inputprimerCliente, "ITALIA");
//		GridActions.clickNewRecord(FRecepcionModalForm.grid);
		FormActions.clickOn(FRecepcionModalForm.Grid.gridPrimerCliente);		
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
	
}
