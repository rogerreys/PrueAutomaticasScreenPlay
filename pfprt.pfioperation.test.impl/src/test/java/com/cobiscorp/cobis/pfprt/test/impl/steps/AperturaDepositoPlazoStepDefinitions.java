package com.cobiscorp.cobis.pfprt.test.impl.steps;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

import java.util.ArrayList;
import java.util.Arrays;

import org.openqa.selenium.Keys;

import com.cobiscorp.cobis.pfprt.oprtn.test.AdminAperturaPlazoFijo;
import com.cobiscorp.cobis.pfprt.oprtn.test.FBusquedaClienteForm;
import com.cobiscorp.cobis.pfprt.oprtn.test.FDetalleOperacionApertura;
import com.cobiscorp.cobis.pfprt.oprtn.test.FFormasDePago;
import com.cobiscorp.cobis.pfprt.oprtn.test.FRecepcionModalFormManual;
import com.cobiscorp.cobis.pfprt.oprtn.test.FVistaOperacionFormManual;
import com.cobiscorp.cobis.serenity.actions.BaseActions;
import com.cobiscorp.cobis.serenity.actions.ContainerActions;
import com.cobiscorp.cobis.serenity.actions.FormActions;
import com.cobiscorp.cobis.serenity.actions.GridActions;
import com.cobiscorp.cobis.serenity.actions.ValidationActions;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

public class AperturaDepositoPlazoStepDefinitions {

	/*RSRM El usuario crea una Apertura Deposito a Plazo */
	@Cuando("realiza la busqueda de {string} por {string}, {string}, {string} y siguiente")
	public void realiza_la_busqueda_de_por_y_siguiente(String cliente, String entidad, String tipo, String buscar_por) {
		
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
				FormActions.enterText(FBusquedaClienteForm.FiltroBusquedaCliente.input_BARRA_BUSCAR, cliente );
			}
			else if(buscar_por.equals("Código")){ 
				FormActions.clickOn(FBusquedaClienteForm.Buttons.botonBuscarPorCodigo);
				FormActions.enterText(FBusquedaClienteForm.FiltroBusquedaCliente.input_BARRA_BUSCAR_CODIGO, cliente );
			}
			else{
				FormActions.enterText(FBusquedaClienteForm.FiltroBusquedaCliente.input_BARRA_BUSCAR_IDENTIFICACION, cliente );
			}
		}
		FormActions.clickOn(FBusquedaClienteForm.Buttons.botonBuscar);
		if(tipo.equals("Persona Natural")){ FormActions.clickOn(FBusquedaClienteForm.GridListaP.gridClienteNatural); }
		else{ FormActions.clickOn(FBusquedaClienteForm.GridListaP.gridClienteJuridico); }
		FormActions.clickOn(FBusquedaClienteForm.Buttons.botonSiguiente);
		FormActions.clickOn(AdminAperturaPlazoFijo.ButtonsRow.buttonsAcceptRow);
		
		FormActions.clickOn(AdminAperturaPlazoFijo.Buttons.botonSiguiente);		
	}

	@Entonces("el Certificado de Depósito es creado desplegando la pantalla Detalle de la Operación en estado ING")
	public void el_certificado_de_deposito_es_creado_desplegando_la_pantalla_detalle_de_la_operacion_en_estado_ing(){
		ValidationActions.isEquals(FDetalleOperacionApertura.CabeceraInformacion.estadoApertura, "ING");
	}

	/*JCMA Apertura de un certificado de depósito Persona Natural_Periódico_pago mensual_Capitalizacion NO_con 2 titulares*/	
	//JCMA #QA-S459574
	
	/*RSRM Apertura de un certificado de depósito Persona Natural_Vencimiento_Capitaliza SI_2 formas de recepción*/
	@Cuando("realiza la busqueda por nombre de {string}")
	public void realiza_la_busqueda_por_nombre_de_cliente(String cliente){
		FormActions.clickOn(AdminAperturaPlazoFijo.Buttons.nuevoCliente);
		FormActions.clickOn(AdminAperturaPlazoFijo.Buttons.botonBuscarCliente);	
		FormActions.enterText(FBusquedaClienteForm.FiltroBusquedaCliente.input_NOMBRE, cliente);
		FormActions.clickOn(FBusquedaClienteForm.Buttons.botonBuscarCliente);
		FormActions.clickOn(FBusquedaClienteForm.GridListaP.gridPrimerCliente);
		FormActions.clickOn(AdminAperturaPlazoFijo.ButtonsRow.buttonsAcceptRow);		
	}
	
	@Cuando("diligencia el formulario de Operación {string},{string},{string},{string},{string},{string},{string},{string}")
	public void diligencia_el_formulario_de_Operación(String producto, String forma_pago, String frecuencia, String capitaliza, String categoria, String moneda, String monto, String plazo) {
		if(producto.length()>0){FormActions.selectByText(FVistaOperacionFormManual.Seleccion.producto, producto); } 
		if(forma_pago.length()>0){FormActions.selectByText(FVistaOperacionFormManual.Seleccion.formaPago, forma_pago); }
		if(frecuencia.length()>0){FormActions.selectByText(FVistaOperacionFormManual.Seleccion.frecuenciaPago, frecuencia); }
		if(capitaliza.length()>0){FormActions.selectByText(FVistaOperacionFormManual.Seleccion.capitalizaInteres, capitaliza); }
		if(categoria.length()>0){FormActions.selectByText(FVistaOperacionFormManual.Seleccion.categoria, categoria); }
		if(moneda.length()>0){FormActions.selectByText(FVistaOperacionFormManual.Seleccion.moneda, moneda); }
		if(monto.length()>0){FormActions.enterText(FVistaOperacionFormManual.IngresarDatos.input_Monto, monto); }
		if(plazo.length()>0){FormActions.enterText(FVistaOperacionFormManual.IngresarDatos.input_Plazo, plazo); }
		FormActions.clickOn(FVistaOperacionFormManual.Buttons.botonSimular);
		FormActions.clickOn(FVistaOperacionFormManual.Buttons.botonAceptarModal);
		FormActions.clickOn(FVistaOperacionFormManual.Buttons.botonSiguiente);
	}

	@Dado("diligencia el formulario de recepción de fondos {string} a {string},{string} con {string}")
	public void diligencia_el_formulario_de_recepción_de_fondos_a_con(String formaRecepcion, String cliente, String cuenta, String monto) {
		if(formaRecepcion.length()>0 && cliente.length()>0 && monto.length()>0){FormActions.clickOn(FRecepcionModalFormManual.Buttons.botonNuevo); }
		else if(formaRecepcion.length()>0 && monto.length()>0){FormActions.clickOn(FRecepcionModalFormManual.Buttons.botonNuevo); }
		if(formaRecepcion.length()>0){FormActions.enterTextAndTab(FRecepcionModalFormManual.IngresarDatos.inputFormaRecepcion, formaRecepcion); }
		if(monto.length()>0){FormActions.enterText(FRecepcionModalFormManual.IngresarDatos.input_MontoRecepcion, monto);}
		if(cliente.length()>0  && monto.length()>0){FormActions.enterTextAndEnter(FRecepcionModalFormManual.IngresarDatos.inputprimerCliente, cliente);}
		if(formaRecepcion.length()>0 && cliente.length()>0 && monto.length()>0){
		FormActions.clickOn(FRecepcionModalFormManual.Buttons.botonCuentaCliente);
			GridActions.selectRecord(FRecepcionModalFormManual.grid,Integer.parseInt(cuenta) ); 
		FormActions.clickOn(FRecepcionModalFormManual.Buttons.botonAceptarRecepcion);
		}	
		else if(formaRecepcion.length()>0 && monto.length()>0){FormActions.clickOn(FRecepcionModalFormManual.Buttons.botonAceptarRecepcion); }
		
		FormActions.clickOn(FRecepcionModalFormManual.Buttons.botonSeleccionRecepcion);
	}

	@Dado("diligencia el formulario de recepción de fondos {string} a {string},{string} con {string} y guardar")
	public void diligencia_el_formulario_de_recepción_de_fondos_a_con_y_guardar(String formaRecepcion, String cliente, String cuenta, String monto) {
		if(formaRecepcion.length()>0 && cliente.length()>0 && monto.length()>0){FormActions.clickOn(FRecepcionModalFormManual.Buttons.botonNuevo); }
		else if(formaRecepcion.length()>0 && monto.length()>0){FormActions.clickOn(FRecepcionModalFormManual.Buttons.botonNuevo); }
		if(formaRecepcion.length()>0){FormActions.enterTextAndTab(FRecepcionModalFormManual.IngresarDatos.inputFormaRecepcion, formaRecepcion); }
		if(monto.length()>0){FormActions.enterText(FRecepcionModalFormManual.IngresarDatos.input_MontoRecepcion, monto);}
		if(cliente.length()>0  && monto.length()>0){FormActions.enterTextAndEnter(FRecepcionModalFormManual.IngresarDatos.inputprimerCliente, cliente);}
		if(formaRecepcion.length()>0 && cliente.length()>0 && monto.length()>0){
		FormActions.clickOn(FRecepcionModalFormManual.Buttons.botonCuentaCliente);
			GridActions.selectRecord(FRecepcionModalFormManual.grid,Integer.parseInt(cuenta) ); 
		FormActions.clickOn(FRecepcionModalFormManual.Buttons.botonAceptarRecepcion);
		}	
		else if(formaRecepcion.length()>0 && monto.length()>0){FormActions.clickOn(FRecepcionModalFormManual.Buttons.botonAceptarRecepcion); }
		
		FormActions.clickOn(FRecepcionModalFormManual.Buttons.botonSeleccionRecepcion);
		FormActions.clickOn(FRecepcionModalFormManual.Buttons.botonGuardarRecepcion);
	}
	
	/*JCMA Apertura de un certificado de depósito Persona Natural_Periódico_pago mensual_Capitalizacion NO_con 2 titulares*/
	
	/*RSRM Apertura de un certificado de depósito Persona Jurídica al Vencimiento 2 titulares(Indistinta)_Capitalizable NO_pesos*/
	@Cuando("realiza la busqueda de {string} por {string}, {string}, {string}")
	public void realiza_la_busqueda_de_por(String cliente, String entidad, String tipo, String buscar_por) {
		
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
				FormActions.enterText(FBusquedaClienteForm.FiltroBusquedaCliente.input_BARRA_BUSCAR, cliente );
			}
			else if(buscar_por.equals("Código")){ 
				FormActions.clickOn(FBusquedaClienteForm.Buttons.botonBuscarPorCodigo);
				FormActions.enterText(FBusquedaClienteForm.FiltroBusquedaCliente.input_BARRA_BUSCAR_CODIGO, cliente );
		}
			else{
				FormActions.enterText(FBusquedaClienteForm.FiltroBusquedaCliente.input_BARRA_BUSCAR_IDENTIFICACION, cliente );
			}
		}
		
		FormActions.clickOn(FBusquedaClienteForm.Buttons.botonBuscar);
		if(tipo.equals("Persona Natural")){ FormActions.clickOn(FBusquedaClienteForm.GridListaP.gridClienteNatural); }
		else{ FormActions.clickOn(FBusquedaClienteForm.GridListaP.gridClienteJuridico); }
		FormActions.clickOn(FBusquedaClienteForm.Buttons.botonSiguiente);
		FormActions.clickOn(AdminAperturaPlazoFijo.ButtonsRow.buttonsAcceptRow);
	}

	@Cuando("nuevamente realiza la busqueda de {string} por {string}, {string}, {string} tipo {string}")
	public void nuevamente_realiza_la_busqueda_de_por_tipo(String cliente, String entidad, String tipo, String buscar_por, String tipoCuenta) {
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
				FormActions.enterText(FBusquedaClienteForm.FiltroBusquedaCliente.input_BARRA_BUSCAR, cliente );
			}
			else if(buscar_por.equals("Código")){ 
				FormActions.clickOn(FBusquedaClienteForm.Buttons.botonBuscarPorCodigo);
				FormActions.enterText(FBusquedaClienteForm.FiltroBusquedaCliente.input_BARRA_BUSCAR_CODIGO, cliente );
			}
			else{
				FormActions.enterText(FBusquedaClienteForm.FiltroBusquedaCliente.input_BARRA_BUSCAR_IDENTIFICACION, cliente );
			}
		}
		
		FormActions.clickOn(FBusquedaClienteForm.Buttons.botonBuscar);
		if(tipo.equals("Persona Natural")){ FormActions.clickOn(FBusquedaClienteForm.GridListaP.gridClienteNatural); }
		else{ FormActions.clickOn(FBusquedaClienteForm.GridListaP.gridClienteJuridico); }
		FormActions.clickOn(FBusquedaClienteForm.Buttons.botonSiguiente);
		FormActions.clickOn(AdminAperturaPlazoFijo.ButtonsRow.buttonsAcceptRow);
	}

	@Cuando("nuevamente realiza la busqueda de {string} por {string}, {string}, {string} tipo {string} y siguente")
	public void nuevamente_realiza_la_busqueda_de_por_tipo_y_siguente(String cliente, String entidad, String tipo, String buscar_por, String tipoCuenta) {
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
				FormActions.enterText(FBusquedaClienteForm.FiltroBusquedaCliente.input_BARRA_BUSCAR, cliente );
			}
			else if(buscar_por.equals("Código")){ 
				FormActions.clickOn(FBusquedaClienteForm.Buttons.botonBuscarPorCodigo);
				FormActions.enterText(FBusquedaClienteForm.FiltroBusquedaCliente.input_BARRA_BUSCAR_CODIGO, cliente );
			}
			else{
				FormActions.enterText(FBusquedaClienteForm.FiltroBusquedaCliente.input_BARRA_BUSCAR_IDENTIFICACION, cliente );
			}
		}
		
		FormActions.clickOn(FBusquedaClienteForm.Buttons.botonBuscar);
		if(tipo.equals("Persona Natural")){ FormActions.clickOn(FBusquedaClienteForm.GridListaP.gridClienteNatural); }
		else{ FormActions.clickOn(FBusquedaClienteForm.GridListaP.gridClienteJuridico); }
		FormActions.clickOn(FBusquedaClienteForm.Buttons.botonSiguiente);
		FormActions.clickOn(AdminAperturaPlazoFijo.ButtonsRow.buttonsAcceptRow);	
		FormActions.clickOn(AdminAperturaPlazoFijo.Buttons.botonSiguiente);
	}


	/*RSRM  Apertura de un certificado de depósito Persona Jurídica_ Periódico_1 titular(indistinta)_Pago mensual_Capitalizable SI_dólares (multimoneda)*/
	@Cuando("diligencia el formulario de recepción de fondos {string} a {string} y {string} con {int}")
	public void diligencia_el_formulario_de_recepción_de_fondos_a_y_con(String formaRecepcion, String cliente_persona_juridica, String cliente_persona_natural, Integer mondo) {
		//Cliente1
		FormActions.clickOn(FRecepcionModalFormManual.Buttons.botonNuevo);
		FormActions.selectByText(FRecepcionModalFormManual.Seleccion.formaRecepcion, formaRecepcion);
		FormActions.enterText(FRecepcionModalFormManual.IngresarDatos.input_MontoRecepcion, mondo.toString());
		FormActions.selectByText(FRecepcionModalFormManual.Seleccion.cliente, cliente_persona_juridica);
		FormActions.clickOn(FRecepcionModalFormManual.Buttons.botonCuentaCliente);
		FormActions.enterTextAndEnter(FRecepcionModalFormManual.IngresarDatos.inputprimerCliente, cliente_persona_juridica);
		GridActions.selectRecord(FRecepcionModalFormManual.grid, 1); 
		FormActions.clickOn(FRecepcionModalFormManual.Buttons.botonAceptarRecepcion);
	
		//Cliente2
		FormActions.clickOn(FRecepcionModalFormManual.Buttons.botonNuevo);
		FormActions.selectByText(FRecepcionModalFormManual.Seleccion.formaRecepcion, formaRecepcion);
		FormActions.enterText(FRecepcionModalFormManual.IngresarDatos.input_MontoRecepcion, mondo.toString());
		FormActions.selectByText(FRecepcionModalFormManual.Seleccion.cliente, cliente_persona_natural);
		FormActions.clickOn(FRecepcionModalFormManual.Buttons.botonCuentaCliente);
		FormActions.enterTextAndEnter(FRecepcionModalFormManual.IngresarDatos.inputprimerCliente, cliente_persona_natural);
		GridActions.selectRecord(FRecepcionModalFormManual.grid, 1); 		
		FormActions.clickOn(FRecepcionModalFormManual.Buttons.botonAceptarRecepcion);
	   
		FormActions.clickOn(FRecepcionModalFormManual.Buttons.botonSeleccionRecepcion);
		FormActions.clickOn(FRecepcionModalFormManual.Buttons.botonSiguienteRecepcion);
	}

	/*MAAV Apertura de un certificado de depósito Persona Natural_Periódico_pago trimestral_Capitalización NO_moneda pesos*/

	/*MAAV Apertura de un certificado de depósito Persona Natural_Vencimiento_Capitalización SI_moneda pesos_ND a una Cta. Sin fondos*/
	
	@Dado("diligencia el formulario de recepción de fondos {string} a {string},{string} con {string} y siguiente")
	public void diligencia_el_formulario_de_recepción_de_fondos_a_y_siguiente(String formaRecepcion, String cliente, String cuenta, String monto) {
		if(formaRecepcion.length()>0 && cliente.length()>0 && monto.length()>0){FormActions.clickOn(FRecepcionModalFormManual.Buttons.botonNuevo); }
		else if(formaRecepcion.length()>0 && monto.length()>0){FormActions.clickOn(FRecepcionModalFormManual.Buttons.botonNuevo); }
		if(formaRecepcion.length()>0){FormActions.enterTextAndTab(FRecepcionModalFormManual.IngresarDatos.inputFormaRecepcion, formaRecepcion); }
		if(monto.length()>0){FormActions.enterText(FRecepcionModalFormManual.IngresarDatos.input_MontoRecepcion, monto);}
		if(cliente.length()>0  && monto.length()>0){FormActions.enterTextAndEnter(FRecepcionModalFormManual.IngresarDatos.inputprimerCliente, cliente);}
		if(formaRecepcion.length()>0 && cliente.length()>0 && monto.length()>0){
		FormActions.clickOn(FRecepcionModalFormManual.Buttons.botonCuentaCliente);
		GridActions.selectRecord(FRecepcionModalFormManual.grid,Integer.parseInt(cuenta) ); 
		FormActions.clickOn(FRecepcionModalFormManual.Buttons.botonAceptarRecepcion);
		}	
		else if(formaRecepcion.length()>0 && monto.length()>0){FormActions.clickOn(FRecepcionModalFormManual.Buttons.botonAceptarRecepcion); }
		
		FormActions.clickOn(FRecepcionModalFormManual.Buttons.botonSeleccionRecepcion);
		FormActions.clickOn(FRecepcionModalFormManual.Buttons.botonSiguienteRecepcion);
	}
	
	@Entonces("se despliega el mensaje No hay disponible en la cuenta")
	public void se_despliega_el_mensaje_No_hay_disponible_en_la_cuenta(){
		ValidationActions.isEquals(FRecepcionModalFormManual.Notificaciones.InformacionCuenta, "Excepción de negocio: 16 - 141144 - [BL_disponible_ctas] No hay disponible en la cuenta");
        }
	
	@Entonces("se despliega el mensaje cuenta bloqueada contra retiro o debito")
	public void se_despliega_el_mensaje_cuenta_bloqueada_contra_retiro_o_debito(){
		 ValidationActions.isEquals(FRecepcionModalFormManual.Notificaciones.InformacionCuenta, "Excepción de negocio: 16 - 201008 - [BL_disponible_ctas] Cuenta bloqueada CONTRA RETIRO O DEBITO");
	}
	
	/********************** JCMA Apertura de un certificado de depósito Persona Jurídica_ al Vencimiento_3 titulares(Conjunta)_Capitalizable SI_pesos ********************/
	
	
    /*RSRM  Apertura de un certificado de depósito para Persona Jurídica_con 1 titular(indistinta)_Periódico_con 2 formas de pago de interés*/
	@Cuando("diligencia el formulario de recepción de fondos {string} a {string} con {string} y siguiente")
	public void diligencia_el_formulario_de_recepción_de_fondos_a_con_y_siguiente(String formaRecepcion, String cliente_persona_natural, String monto) {
		FormActions.clickOn(FRecepcionModalFormManual.Buttons.botonNuevo);
		FormActions.enterTextAndTab(FRecepcionModalFormManual.IngresarDatos.inputFormaRecepcion, formaRecepcion);
		FormActions.enterText(FRecepcionModalFormManual.IngresarDatos.input_MontoRecepcion, monto);
		FormActions.enterTextAndEnter(FRecepcionModalFormManual.IngresarDatos.inputprimerCliente, cliente_persona_natural);
		FormActions.clickOn(FRecepcionModalFormManual.Buttons.botonCuentaCliente);
		FormActions.clickOn(FRecepcionModalFormManual.Grid.gridPrimerCliente);
		FormActions.clickOn(FRecepcionModalFormManual.Buttons.botonAceptarRecepcion);
		FormActions.clickOn(FRecepcionModalFormManual.Buttons.botonSeleccionRecepcion);
		FormActions.clickOn(FRecepcionModalFormManual.Buttons.botonGuardarRecepcion);
	}
	
	@Cuando("diligencia formulario ingresando las dos formas de pago {string} y {string} a {string} y {string} con {string}")
	public void diligencia_formulario_ingresando_las_dos_formas_de_pago_y_a_y_con(String formaRecepcion, String formaRecepcion2, String cliente_persona_juridica, String cliente_persona_natural, String monto) {
		FormActions.clickOn(FFormasDePago.Buttons.botonNuevo);
		FormActions.selectByText(FFormasDePago.Seleccion.formaRecepcion, formaRecepcion);
		FormActions.enterText(FFormasDePago.IngresarDatos.input_MontoRecepcion, monto);
		FormActions.selectByText(FFormasDePago.Seleccion.beneficiario, cliente_persona_juridica);
		if(formaRecepcion.equals("CUENTA DE AHORROS")){
		FormActions.clickOn(FFormasDePago.Buttons.botonCuentaCliente);
			FormActions.clickOn(FFormasDePago.Grid.gridPrimerCliente);}
		FormActions.clickOn(FFormasDePago.Buttons.botonAceptarPago);
		
		FormActions.clickOn(FFormasDePago.Buttons.botonNuevo);
		FormActions.selectByText(FFormasDePago.Seleccion.formaRecepcion, formaRecepcion2);
		FormActions.enterText(FFormasDePago.IngresarDatos.input_MontoRecepcion, monto);
		FormActions.selectById(FFormasDePago.Seleccion.beneficiario, cliente_persona_natural);
		if(formaRecepcion2.equals("CUENTA DE AHORROS")){
			FormActions.clickOn(FFormasDePago.Buttons.botonCuentaCliente);
			FormActions.clickOn(FFormasDePago.Grid.gridPrimerCliente);}
		FormActions.clickOn(FFormasDePago.Buttons.botonAceptarPago);
		
		FormActions.clickOn(FFormasDePago.Buttons.botonGuardar);
	}
	
		
	@Dado("diligencia formulario de forma de pago {string} a {string},{string} con {string}")
	public void diligencia_formulario_de_forma_de_pago_a_con(String formaRecepcion, String cliente, String cuenta, String monto) {
	
		FormActions.clickOn(FFormasDePago.Buttons.botonNuevo);
		FormActions.selectByText(FFormasDePago.Seleccion.formaRecepcion, formaRecepcion);
		FormActions.enterText(FFormasDePago.IngresarDatos.input_MontoRecepcion, monto);
		FormActions.selectByText(FFormasDePago.Seleccion.beneficiario, cliente);
		if(formaRecepcion.equals("CUENTA DE AHORROS")){
		FormActions.clickOn(FFormasDePago.Buttons.botonCuentaCliente);
		GridActions.selectRecord(FRecepcionModalFormManual.grid,Integer.parseInt(cuenta) ); }
		FormActions.clickOn(FFormasDePago.Buttons.botonAceptarPago);
		
		FormActions.clickOn(FFormasDePago.Buttons.botonGuardar);
	}
	
}
