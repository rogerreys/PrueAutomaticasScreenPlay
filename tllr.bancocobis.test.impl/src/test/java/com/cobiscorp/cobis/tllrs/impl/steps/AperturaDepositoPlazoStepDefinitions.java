package com.cobiscorp.cobis.tllrs.impl.steps;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

import java.util.ArrayList;
import java.util.Arrays;

import org.openqa.selenium.Keys;

import com.cobiscorp.cobis.serenity.actions.BaseActions;
import com.cobiscorp.cobis.serenity.actions.ContainerActions;
import com.cobiscorp.cobis.serenity.actions.FormActions;
import com.cobiscorp.cobis.serenity.actions.GridActions;
import com.cobiscorp.cobis.serenity.actions.ValidationActions;
import com.cobiscorp.cobis.tllrs.test.AdminAperturaPlazoFijo;
import com.cobiscorp.cobis.tllrs.test.AdminAsientoContableMayorizado;
import com.cobiscorp.cobis.tllrs.test.AdminClientes;
import com.cobiscorp.cobis.tllrs.test.CabeceraCliente;
import com.cobiscorp.cobis.tllrs.test.FBusquedaClienteForm;
import com.cobiscorp.cobis.tllrs.test.FBusquedaDepositoForm;
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
	ArrayList<String> nombre  = new ArrayList<String>();

	/*RSRM El usuario crea una Apertura Deposito a Plazo */
	@Cuando("realiza la busqueda de {string} por {string}, {string}, {string} y siguiente")
	public void realiza_la_busqueda_de_por_y_siguiente(String cliente, String entidad, String tipo, String buscar_por) {
		if(tipo.equals("Persona Natural")){ nombre.addAll(Arrays.asList( cliente.split(" "))); }
		else{ nombre.add(cliente); }
		FormActions.clickOn(AdminAperturaPlazoFijo.Buttons.nuevoCliente);
		FormActions.clickOn(AdminAperturaPlazoFijo.Buttons.botonBuscarCliente);	
		if(entidad!=null){
			FormActions.clickOn(FBusquedaClienteForm.Buttons.botonEntidad);
			if(entidad.equals("Cliente")){ FormActions.clickOn(FBusquedaClienteForm.Buttons.botonEntidadCliente); }
		}
		if(tipo!=null){
			FormActions.clickOn(FBusquedaClienteForm.Buttons.botonTipo);
			if(tipo.equals("Persona Natural")){ FormActions.clickOn(FBusquedaClienteForm.Buttons.botonTipoNatural); }
			else{ FormActions.clickOn(FBusquedaClienteForm.Buttons.botonTipoJuridico); }
		}
		if(buscar_por!=null){
			FormActions.clickOn(FBusquedaClienteForm.Buttons.botonBuscarPor);
			if(buscar_por.equals("Nombre")){ 
				FormActions.clickOn(FBusquedaClienteForm.Buttons.botonBuscarPorNombre);
				FormActions.enterText(FBusquedaClienteForm.FiltroBusquedaCliente.input_BARRA_BUSCAR, nombre.get(0) );
			}
			else if(buscar_por.equals("Código")){ 
				FormActions.clickOn(FBusquedaClienteForm.Buttons.botonBuscarPorCodigo);
				FormActions.enterText(FBusquedaClienteForm.FiltroBusquedaCliente.input_BARRA_BUSCAR_CODIGO, nombre.get(0) );
			}
			else{
				FormActions.enterText(FBusquedaClienteForm.FiltroBusquedaCliente.input_BARRA_BUSCAR_IDENTIFICACION, nombre.get(0) );
			}
		}
		
		FormActions.clickOn(FBusquedaClienteForm.Buttons.botonBuscar);
		if(tipo.equals("Persona Natural")){ FormActions.clickOn(FBusquedaClienteForm.GridListaP.gridClienteNatural); }
		else{ FormActions.clickOn(FBusquedaClienteForm.GridListaP.gridClienteJuridico); }
		FormActions.clickOn(FBusquedaClienteForm.Buttons.botonSiguiente);
		FormActions.clickOn(AdminAperturaPlazoFijo.ButtonsRow.buttonsAcceptRow);
		nombre.clear();
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
	//JCMA #QA-S459574
	@Cuando("realiza la busqueda de {string}")
	public void realiza_la_busqueda_de_cliente(String string){		
		FormActions.clickOn(AdminAperturaPlazoFijo.Buttons.nuevoCliente);
		FormActions.clickOn(AdminAperturaPlazoFijo.Buttons.botonBuscarCliente);
		FormActions.enterText(FBusquedaClienteForm.FiltroBusquedaCliente.input_BARRA_BUSCAR_IDENTIFICACION, string);
		FormActions.clickOn(FBusquedaClienteForm.Buttons.botonBuscar);
		FormActions.clickOn(FBusquedaClienteForm.GridListaP.gridClienteNatural);
		FormActions.clickOn(FBusquedaClienteForm.Buttons.botonSiguiente);
		FormActions.clickOn(AdminAperturaPlazoFijo.ButtonsRow.buttonsAcceptRow);
	}
	
	@Cuando("nuevamente realiza la busqueda de un {string} tipo conjunta")
	public void nuevamente_realiza_la_busqueda_de_un_cliente_tipo_conjunta(String string){
		FormActions.clickOn(AdminAperturaPlazoFijo.Buttons.nuevoCliente);
		FormActions.selectByText(AdminAperturaPlazoFijo.tipoCuenta, "CONJUNTA");
		FormActions.clickOn(AdminAperturaPlazoFijo.Buttons.botonBuscarCliente);
		FormActions.enterText(FBusquedaClienteForm.FiltroBusquedaCliente.input_BARRA_BUSCAR_IDENTIFICACION, string);
		FormActions.clickOn(FBusquedaClienteForm.Buttons.botonBuscar);
		FormActions.clickOn(FBusquedaClienteForm.GridListaP.gridClienteNatural);
		FormActions.clickOn(FBusquedaClienteForm.Buttons.botonSiguiente);
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
	public void realiza_la_busqueda_por_nombre_de_cliente(String cliente){
		nombre.addAll(Arrays.asList( cliente.split(" "))); 
		FormActions.clickOn(AdminAperturaPlazoFijo.Buttons.nuevoCliente);
		FormActions.clickOn(AdminAperturaPlazoFijo.Buttons.botonBuscarCliente);	
		FormActions.enterText(FBusquedaClienteForm.FiltroBusquedaCliente.input_NOMBRE, nombre.get(0));
		FormActions.clickOn(FBusquedaClienteForm.Buttons.botonBuscarCliente);
		FormActions.clickOn(FBusquedaClienteForm.GridListaP.gridPrimerCliente);
		FormActions.clickOn(AdminAperturaPlazoFijo.ButtonsRow.buttonsAcceptRow);		
	}
	
//	@Cuando("nuevamente realiza la busqueda por nombre de un {string} tipo indistinta")
//	public void nuevamente_realiza_la_busqueda_por_nombre_de_un_tipo_indistinta(String string) {
//		nombre = string.split(" ");
//		FormActions.clickOn(AdminAperturaPlazoFijo.Buttons.nuevoCliente);
//		FormActions.selectByText(AdminAperturaPlazoFijo.tipoCuenta, "INDISTINTA");
//		FormActions.clickOn(AdminAperturaPlazoFijo.Buttons.botonBuscarCliente);
//		FormActions.enterText(FBusquedaClienteForm.FiltroBusquedaCliente.input_NOMBRE, nombre[0]);
//		FormActions.clickOn(FBusquedaClienteForm.Buttons.botonBuscarCliente);
//		FormActions.clickOn(FBusquedaClienteForm.GridListaP.gridPrimerCliente);
//		FormActions.clickOn(AdminAperturaPlazoFijo.ButtonsRow.buttonsAcceptRow);
//		FormActions.clickOn(AdminAperturaPlazoFijo.Buttons.botonSiguiente);
//	}
	
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
	@Dado("diligencia el formulario de recepción de fondos {string} a {string} con {string}")
	public void diligencia_el_formulario_de_recepción_de_fondos_a_con(String formaRecepcion, String cliente_persona_natural, String mondo) {
		FormActions.clickOn(FRecepcionModalForm.Buttons.botonNuevo);
		FormActions.enterTextAndTab(FRecepcionModalForm.IngresarDatos.inputFormaRecepcion, formaRecepcion);
		FormActions.enterTextAndTab(FRecepcionModalForm.IngresarDatos.input_MontoRecepcion, mondo);
		FormActions.selectByText(FRecepcionModalForm.Seleccion.cliente, cliente_persona_natural);
		FormActions.clickOn(FRecepcionModalForm.Buttons.botonCuentaCliente);
		FormActions.clickOn(FRecepcionModalForm.Grid.gridPrimerCliente);
		FormActions.clickOn(FRecepcionModalForm.Buttons.botonAceptarRecepcion);
		FormActions.clickOn(FRecepcionModalForm.Buttons.botonSeleccionRecepcion);
	}

	@Dado("diligencia el formulario de recepción de fondos {string} a {string} con {string} y guardar")
	public void diligencia_el_formulario_de_recepción_de_fondos_a_con_y_guardar(String formaRecepcion, String cliente_persona_natural1, String mondo) {
		FormActions.clickOn(FRecepcionModalForm.Buttons.botonNuevo);
		FormActions.enterTextAndTab(FRecepcionModalForm.IngresarDatos.inputFormaRecepcion, formaRecepcion);
		FormActions.enterText(FRecepcionModalForm.IngresarDatos.input_MontoRecepcion, mondo);
		FormActions.enterTextAndEnter(FRecepcionModalForm.IngresarDatos.inputprimerCliente, cliente_persona_natural1);
		FormActions.clickOn(FRecepcionModalForm.Buttons.botonCuentaCliente);
		FormActions.clickOn(FRecepcionModalForm.Grid.gridPrimerCliente);
//		FormActions.clickOn(FRecepcionModalForm.Grid.gridSegundoCliente);
		FormActions.clickOn(FRecepcionModalForm.Buttons.botonAceptarRecepcion);
		FormActions.clickOn(FRecepcionModalForm.Buttons.botonSeleccionRecepcion);
		FormActions.clickOn(FRecepcionModalForm.Buttons.botonGuardarRecepcion);
	}
	
	/*JCMA Apertura de un certificado de depósito Persona Natural_Periódico_pago mensual_Capitalizacion NO_con 2 titulares*/
	@Cuando("realiza la busqueda de un solo {string}")
	public void realiza_la_busqueda_de_un_solo_cliente(String string){
		FormActions.clickOn(AdminAperturaPlazoFijo.Buttons.nuevoCliente);
		FormActions.clickOn(AdminAperturaPlazoFijo.Buttons.botonBuscarCliente);
		FormActions.enterText(FBusquedaClienteForm.FiltroBusquedaCliente.input_BARRA_BUSCAR_IDENTIFICACION, string);
		FormActions.clickOn(FBusquedaClienteForm.Buttons.botonBuscar);
		FormActions.clickOn(FBusquedaClienteForm.GridListaP.gridClienteNatural);
		FormActions.clickOn(FBusquedaClienteForm.Buttons.botonSiguiente);
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
	@Cuando("realiza la busqueda de {string} por {string}, {string}, {string}")
	public void realiza_la_busqueda_de_por(String cliente, String entidad, String tipo, String buscar_por) {
		if(tipo.equals("Persona Natural")){ nombre.addAll(Arrays.asList( cliente.split(" "))); }
		else{ nombre.add(cliente); }
		
		FormActions.clickOn(AdminAperturaPlazoFijo.Buttons.nuevoCliente);
		FormActions.clickOn(AdminAperturaPlazoFijo.Buttons.botonBuscarCliente);
		if(entidad!=null){
			FormActions.clickOn(FBusquedaClienteForm.Buttons.botonEntidad);
			if(entidad.equals("Cliente")){ FormActions.clickOn(FBusquedaClienteForm.Buttons.botonEntidadCliente); }
		}
		if(tipo!=null){
			FormActions.clickOn(FBusquedaClienteForm.Buttons.botonTipo);
			if(tipo.equals("Persona Natural")){ FormActions.clickOn(FBusquedaClienteForm.Buttons.botonTipoNatural); }
			else{ FormActions.clickOn(FBusquedaClienteForm.Buttons.botonTipoJuridico); }
		}
		if(buscar_por!=null){
			FormActions.clickOn(FBusquedaClienteForm.Buttons.botonBuscarPor);
			if(buscar_por.equals("Nombre")){ 
				FormActions.clickOn(FBusquedaClienteForm.Buttons.botonBuscarPorNombre);
				FormActions.enterText(FBusquedaClienteForm.FiltroBusquedaCliente.input_BARRA_BUSCAR, nombre.get(0) );
			}
			else if(buscar_por.equals("Código")){ 
				FormActions.clickOn(FBusquedaClienteForm.Buttons.botonBuscarPorCodigo);
				FormActions.enterText(FBusquedaClienteForm.FiltroBusquedaCliente.input_BARRA_BUSCAR_CODIGO, nombre.get(0) );
		}
			else{
				FormActions.enterText(FBusquedaClienteForm.FiltroBusquedaCliente.input_BARRA_BUSCAR_IDENTIFICACION, nombre.get(0) );
			}
		}
		
		FormActions.clickOn(FBusquedaClienteForm.Buttons.botonBuscar);
		if(tipo.equals("Persona Natural")){ FormActions.clickOn(FBusquedaClienteForm.GridListaP.gridClienteNatural); }
		else{ FormActions.clickOn(FBusquedaClienteForm.GridListaP.gridClienteJuridico); }
		FormActions.clickOn(FBusquedaClienteForm.Buttons.botonSiguiente);
		FormActions.clickOn(AdminAperturaPlazoFijo.ButtonsRow.buttonsAcceptRow);
		nombre.clear();
	}

	@Cuando("nuevamente realiza la busqueda de {string} por {string}, {string}, {string} tipo {string}")
	public void nuevamente_realiza_la_busqueda_de_por_tipo(String cliente, String entidad, String tipo, String buscar_por, String tipoCuenta) {
		if(tipo.equals("Persona Natural")){ nombre.addAll(Arrays.asList( cliente.split(" "))); }
		else{ nombre.add(cliente); }
		FormActions.clickOn(AdminAperturaPlazoFijo.Buttons.nuevoCliente);
		FormActions.clickOn(AdminAperturaPlazoFijo.Buttons.botonBuscarCliente);
		FormActions.selectByText(AdminAperturaPlazoFijo.tipoCuenta, tipoCuenta);
		if(entidad!=null){
			FormActions.clickOn(FBusquedaClienteForm.Buttons.botonEntidad);
			if(entidad.equals("Cliente")){ FormActions.clickOn(FBusquedaClienteForm.Buttons.botonEntidadCliente); }
		}
		if(tipo!=null){
			FormActions.clickOn(FBusquedaClienteForm.Buttons.botonTipo);
			if(tipo.equals("Persona Natural")){ FormActions.clickOn(FBusquedaClienteForm.Buttons.botonTipoNatural); }
			else{ FormActions.clickOn(FBusquedaClienteForm.Buttons.botonTipoJuridico); }
		}
		if(buscar_por!=null){
			FormActions.clickOn(FBusquedaClienteForm.Buttons.botonBuscarPor);
			if(buscar_por.equals("Nombre")){ 
				FormActions.clickOn(FBusquedaClienteForm.Buttons.botonBuscarPorNombre);
		FormActions.enterText(FBusquedaClienteForm.FiltroBusquedaCliente.input_BARRA_BUSCAR, nombre.get(0) );
			}
			else if(buscar_por.equals("Código")){ 
				FormActions.clickOn(FBusquedaClienteForm.Buttons.botonBuscarPorCodigo);
				FormActions.enterText(FBusquedaClienteForm.FiltroBusquedaCliente.input_BARRA_BUSCAR_CODIGO, nombre.get(0) );
			}
			else{
				FormActions.enterText(FBusquedaClienteForm.FiltroBusquedaCliente.input_BARRA_BUSCAR_IDENTIFICACION, nombre.get(0) );
			}
		}
		
		FormActions.clickOn(FBusquedaClienteForm.Buttons.botonBuscar);
		if(tipo.equals("Persona Natural")){ FormActions.clickOn(FBusquedaClienteForm.GridListaP.gridClienteNatural); }
		else{ FormActions.clickOn(FBusquedaClienteForm.GridListaP.gridClienteJuridico); }
		FormActions.clickOn(FBusquedaClienteForm.Buttons.botonSiguiente);
		FormActions.clickOn(AdminAperturaPlazoFijo.ButtonsRow.buttonsAcceptRow);
		nombre.clear();
		FormActions.clickOn(AdminAperturaPlazoFijo.Buttons.botonSiguiente);
	}

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

	/*RSRM  Apertura de un certificado de depósito Persona Jurídica_ Periódico_1 titular(indistinta)_Pago mensual_Capitalizable SI_dólares (multimoneda)*/
	@Cuando("diligencia el formulario de recepción de fondos {string} a {string} y {string} con {int}")
	public void diligencia_el_formulario_de_recepción_de_fondos_a_y_con(String formaRecepcion, String cliente_persona_juridica, String cliente_persona_natural, Integer mondo) {
		//Cliente1
		FormActions.clickOn(FRecepcionModalForm.Buttons.botonNuevo);
		FormActions.selectByText(FRecepcionModalForm.Seleccion.formaRecepcion, formaRecepcion);
		FormActions.enterText(FRecepcionModalForm.IngresarDatos.input_MontoRecepcion, mondo.toString());
		FormActions.selectByText(FRecepcionModalForm.Seleccion.cliente, cliente_persona_juridica);
		FormActions.clickOn(FRecepcionModalForm.Buttons.botonCuentaCliente);
		FormActions.enterTextAndEnter(FRecepcionModalForm.IngresarDatos.inputprimerCliente, cliente_persona_juridica);
		GridActions.selectRecord(FRecepcionModalForm.grid, 1); 
		FormActions.clickOn(FRecepcionModalForm.Buttons.botonAceptarRecepcion);
	
		//Cliente2
		FormActions.clickOn(FRecepcionModalForm.Buttons.botonNuevo);
		FormActions.selectByText(FRecepcionModalForm.Seleccion.formaRecepcion, formaRecepcion);
		FormActions.enterText(FRecepcionModalForm.IngresarDatos.input_MontoRecepcion, mondo.toString());
		FormActions.selectByText(FRecepcionModalForm.Seleccion.cliente, cliente_persona_natural);
		FormActions.clickOn(FRecepcionModalForm.Buttons.botonCuentaCliente);
		FormActions.enterTextAndEnter(FRecepcionModalForm.IngresarDatos.inputprimerCliente, cliente_persona_natural);
		GridActions.selectRecord(FRecepcionModalForm.grid, 1); 		
		FormActions.clickOn(FRecepcionModalForm.Buttons.botonAceptarRecepcion);
	   
		FormActions.clickOn(FRecepcionModalForm.Buttons.botonSeleccionRecepcion);
		FormActions.clickOn(FRecepcionModalForm.Buttons.botonSiguienteRecepcion);
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
	
	/*MAAV Apertura de un certificado de depósito Persona Natural_Periódico_pago trimestral_Capitalización NO_moneda pesos*/

	@Cuando("diligencia el formulario de Operación con moneda pesos {string},{string},{string},{string},{string},{string}")
	public void diligencia_el_formulario_de_operacion_con_moneda_pesos(String producto, String forma_pago, String frecuencia, String capitaliza, String categoria, String moneda){
		FormActions.selectByText(FVistaOperacionForm.Seleccion.producto, producto);
		FormActions.selectByText(FVistaOperacionForm.Seleccion.formaPago, forma_pago);
		FormActions.selectByText(FVistaOperacionForm.Seleccion.frecuenciaPago, frecuencia);
		FormActions.selectByText(FVistaOperacionForm.Seleccion.capitalizaInteres, capitaliza);
		FormActions.selectByText(FVistaOperacionForm.Seleccion.categoria, categoria);
		FormActions.selectByText(FVistaOperacionForm.Seleccion.moneda, moneda);
		FormActions.enterText(FVistaOperacionForm.IngresarDatos.input_Monto, "255000");
		FormActions.enterText(FVistaOperacionForm.IngresarDatos.input_Plazo, "40");
		FormActions.clickOn(FVistaOperacionForm.Buttons.botonSimular);
		FormActions.clickOn(FVistaOperacionForm.Buttons.botonAceptarModal);
		FormActions.clickOn(FVistaOperacionForm.Buttons.botonSiguiente);
	}

	@Cuando("diligencia el formulario de recepción de fondos pesos con {string}")
	public void diligencia_el_formulario_de_recepción_de_fondos_pesos(String formaRecepcionFC){
		FormActions.clickOn(FRecepcionModalForm.Buttons.botonNuevo);
		FormActions.selectByText(FRecepcionModalForm.Seleccion.formaRecepcion, formaRecepcionFC);
		FormActions.clickOn(FRecepcionModalForm.Buttons.botonAceptarRecepcion);
		FormActions.enterText(FRecepcionModalForm.IngresarDatos.input_MontoRecepcion, "255000");
		FormActions.clickOn(FRecepcionModalForm.Buttons.botonAceptarRecepcion);
		FormActions.clickOn(FRecepcionModalForm.Buttons.botonSiguienteRecepcion);
	}
	
	@Cuando("diligencia el formulario formas de pago pesos con {string},{string}")
	public void diligencia_el_formulario_formas_de_pago_pesos(String formaRecepcionFP, String nombre_beneficiario){
		FormActions.clickOn(FFormasDePago.Buttons.botonNuevo);
		FormActions.selectByText(FFormasDePago.Seleccion.formaRecepcion, formaRecepcionFP);
		FormActions.enterText(FFormasDePago.IngresarDatos.input_MontoRecepcion, "2283.67");
		FormActions.selectByText(FFormasDePago.Seleccion.beneficiario, nombre_beneficiario);
		FormActions.clickOn(FFormasDePago.Buttons.botonAceptarPago);
		FormActions.clickOn(FFormasDePago.Buttons.botonGuardar);
	}
	
	/*MAAV Apertura de un certificado de depósito Persona Natural_Vencimiento_Capitalización SI_moneda pesos_ND a una Cta. Sin fondos*/
	
	@Cuando("diligencia el formulario de Operación vencimiento con moneda pesos {string},{string},{string},{string},{string}")
	public void diligencia_el_formulario_de_operacion_vencimiento_con_moneda_pesos(String producto, String forma_pago, String capitaliza, String categoria, String moneda){
		FormActions.selectByText(FVistaOperacionForm.Seleccion.producto, producto);
		FormActions.selectByText(FVistaOperacionForm.Seleccion.formaPago, forma_pago);
		FormActions.selectByText(FVistaOperacionForm.Seleccion.capitalizaInteres, capitaliza);
		FormActions.selectByText(FVistaOperacionForm.Seleccion.categoria, categoria);
		FormActions.selectByText(FVistaOperacionForm.Seleccion.moneda, moneda);
		FormActions.enterText(FVistaOperacionForm.IngresarDatos.input_Monto, "255000");
		FormActions.enterText(FVistaOperacionForm.IngresarDatos.input_Plazo, "40");
		FormActions.clickOn(FVistaOperacionForm.Buttons.botonSimular);
		FormActions.clickOn(FVistaOperacionForm.Buttons.botonAceptarModal);
		FormActions.clickOn(FVistaOperacionForm.Buttons.botonSiguiente);
	}
	
	@Cuando("diligencia el formulario de recepción de fondos cta con {string},{string}")
	public void diligencia_el_formulario_de_recepción_de_fondos_cta(String formaRecepcionFC,String nombre_cliente){
		FormActions.clickOn(FRecepcionModalForm.Buttons.botonNuevo);
		FormActions.selectByText(FRecepcionModalForm.Seleccion.formaRecepcion, formaRecepcionFC);
		FormActions.clickOn(FRecepcionModalForm.Buttons.botonAceptarRecepcion);
		FormActions.enterText(FRecepcionModalForm.IngresarDatos.input_MontoRecepcion, "255000");
		FormActions.selectByText(FRecepcionModalForm.Seleccion.cliente, nombre_cliente);
		FormActions.clickOn(FRecepcionModalForm.Buttons.botonCuentaCliente);
		FormActions.clickOn(FRecepcionModalForm.Grid.gridPrimerCliente);
		FormActions.clickOn(FRecepcionModalForm.Buttons.botonAceptarRecepcion);
		//FormActions.clickOn(FRecepcionModalForm.Buttons.botonSiguienteRecepcion);
	}
	
	@Entonces("se despliega el mensaje No hay disponible en la cuenta")
	public void se_despliega_el_mensaje_No_hay_disponible_en_la_cuenta(){
		ValidationActions.isEquals(FRecepcionModalForm.Notificaciones.InformacionCuenta, "Excepción de negocio: 16 - 141144 - [BL_disponible_ctas] No hay disponible en la cuenta");
	}
	
	/********************** JCMA Apertura de un certificado de depósito Persona Jurídica_ al Vencimiento_3 titulares(Conjunta)_Capitalizable SI_pesos ********************/
	@Cuando("nuevamente realiza la busqueda de un {string} tipo indistinta")
	public void nuevamente_realiza_la_busqueda_de_un_cliente_persona_natural_tipo_indistinta(String string){
		FormActions.clickOn(AdminAperturaPlazoFijo.Buttons.nuevoCliente);
		FormActions.selectByText(AdminAperturaPlazoFijo.tipoCuenta, "INDISTINTA");
		FormActions.clickOn(AdminAperturaPlazoFijo.Buttons.botonBuscarCliente);
		FormActions.enterText(FBusquedaClienteForm.FiltroBusquedaCliente.input_IDENTIFICACION, string);
		FormActions.clickOn(FBusquedaClienteForm.Buttons.botonBuscarCliente);
		FormActions.clickOn(FBusquedaClienteForm.GridListaP.gridPrimerCliente);
		FormActions.clickOn(AdminAperturaPlazoFijo.ButtonsRow.buttonsAcceptRow);
	}
	
	@Cuando("nuevamente realiza la busqueda de otro {string} tipo indistinta")
	public void nuevamente_realiza_la_busqueda_de_otro_cliente_persona_natural_tipo_indistinta(String string){
		FormActions.clickOn(AdminAperturaPlazoFijo.Buttons.nuevoCliente);
		FormActions.selectByText(AdminAperturaPlazoFijo.tipoCuenta, "INDISTINTA");
		FormActions.clickOn(AdminAperturaPlazoFijo.Buttons.botonBuscarCliente);
		FormActions.enterText(FBusquedaClienteForm.FiltroBusquedaCliente.input_IDENTIFICACION, string);
		FormActions.clickOn(FBusquedaClienteForm.Buttons.botonBuscarCliente);
		FormActions.clickOn(FBusquedaClienteForm.GridListaP.gridPrimerCliente);
		FormActions.clickOn(AdminAperturaPlazoFijo.ButtonsRow.buttonsAcceptRow);
		FormActions.clickOn(AdminAperturaPlazoFijo.Buttons.botonSiguiente);
	}
	
	
    /*RSRM  Apertura de un certificado de depósito para Persona Jurídica_con 1 titular(indistinta)_Periódico_con 2 formas de pago de interés*/
	@Cuando("diligencia el formulario de recepción de fondos {string} a {string} con {string} y siguiente")
	public void diligencia_el_formulario_de_recepción_de_fondos_a_con_y_siguiente(String formaRecepcion, String cliente_persona_natural, String monto) {
		FormActions.clickOn(FRecepcionModalForm.Buttons.botonNuevo);
		FormActions.enterTextAndTab(FRecepcionModalForm.IngresarDatos.inputFormaRecepcion, formaRecepcion);
		FormActions.enterText(FRecepcionModalForm.IngresarDatos.input_MontoRecepcion, monto);
		FormActions.enterTextAndEnter(FRecepcionModalForm.IngresarDatos.inputprimerCliente, cliente_persona_natural);
		FormActions.clickOn(FRecepcionModalForm.Buttons.botonCuentaCliente);
		FormActions.clickOn(FRecepcionModalForm.Grid.gridPrimerCliente);
//		FormActions.clickOn(FRecepcionModalForm.Grid.gridSegundoCliente);
		FormActions.clickOn(FRecepcionModalForm.Buttons.botonAceptarRecepcion);
		FormActions.clickOn(FRecepcionModalForm.Buttons.botonSeleccionRecepcion);
		FormActions.clickOn(FRecepcionModalForm.Buttons.botonGuardarRecepcion);
	}
	
	@Cuando("diligencia formulario ingresando las dos formas de pago {string} y {string} a {string} y {string} con {string}")
	public void diligencia_formulario_ingresando_las_dos_formas_de_pago_y_a_y_con(String formaRecepcion, String formaRecepcion2, String cliente_persona_juridica, String cliente_persona_natural, String monto) {
		FormActions.clickOn(FFormasDePago.Buttons.botonNuevo);
		FormActions.selectByText(FFormasDePago.Seleccion.formaRecepcion, formaRecepcion);
		FormActions.enterText(FFormasDePago.IngresarDatos.input_MontoRecepcion, monto);
		FormActions.selectByText(FFormasDePago.Seleccion.beneficiario, cliente_persona_juridica);
		FormActions.clickOn(FFormasDePago.Buttons.botonCuentaCliente);
		FormActions.clickOn(FFormasDePago.Grid.gridPrimerCliente);
		FormActions.clickOn(FFormasDePago.Buttons.botonAceptarPago);
		
		FormActions.clickOn(FFormasDePago.Buttons.botonNuevo);
		FormActions.selectByText(FFormasDePago.Seleccion.formaRecepcion, formaRecepcion2);
		FormActions.enterText(FFormasDePago.IngresarDatos.input_MontoRecepcion, monto);
		FormActions.selectById(FFormasDePago.Seleccion.beneficiario, cliente_persona_natural);
		if(formaRecepcion2 != "EFECTIVO"){
			FormActions.clickOn(FFormasDePago.Buttons.botonCuentaCliente);
			FormActions.clickOn(FFormasDePago.Grid.gridPrimerCliente);}
		FormActions.clickOn(FFormasDePago.Buttons.botonAceptarPago);
		
		FormActions.clickOn(FFormasDePago.Buttons.botonGuardar);
	}
	
}
