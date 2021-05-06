package com.cobiscorp.cobis.pfprt.test.impl.steps;

import java.util.ArrayList;
import com.cobiscorp.cobis.pfprt.oprtn.test.AdminAperturaPlazoFijo;
import com.cobiscorp.cobis.pfprt.oprtn.test.FBloqueosForm;
import com.cobiscorp.cobis.pfprt.oprtn.test.FBusquedaClienteForm;
import com.cobiscorp.cobis.pfprt.oprtn.test.FBusquedaDepositoForm;
import com.cobiscorp.cobis.pfprt.oprtn.test.FCancelacionForm;
import com.cobiscorp.cobis.pfprt.oprtn.test.FCancelacionNormalForm;
import com.cobiscorp.cobis.pfprt.oprtn.test.FCatalogoForm;
import com.cobiscorp.cobis.pfprt.oprtn.test.FCuentasForm;
import com.cobiscorp.cobis.pfprt.oprtn.test.FDetalleBusquedaDeposito;
import com.cobiscorp.cobis.pfprt.oprtn.test.FDetalleOperacionApertura;
import com.cobiscorp.cobis.pfprt.oprtn.test.FDetalleOperacionForm;
import com.cobiscorp.cobis.pfprt.oprtn.test.FFormasDePago;
import com.cobiscorp.cobis.pfprt.oprtn.test.FPagoForm;
import com.cobiscorp.cobis.pfprt.oprtn.test.FPagoModalForm;
import com.cobiscorp.cobis.pfprt.oprtn.test.FRecepcionModalFormManual;
import com.cobiscorp.cobis.pfprt.oprtn.test.FVistaCancelacionForm;
import com.cobiscorp.cobis.pfprt.oprtn.test.FVistaOperacionFormManual;
import com.cobiscorp.cobis.pfprt.oprtn.test.FVistaPagoForm;
import com.cobiscorp.cobis.pfprt.oprtn.test.FVistaTitularesForm;
import com.cobiscorp.cobis.serenity.actions.BaseActions;
import com.cobiscorp.cobis.serenity.actions.ContainerActions;
import com.cobiscorp.cobis.serenity.actions.FormActions;
import com.cobiscorp.cobis.serenity.actions.GridActions;
import com.cobiscorp.cobis.serenity.actions.HeaderActions;
import com.cobiscorp.cobis.serenity.actions.ValidationActions;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;

public class BusquedaDepositoStepDefinitions {
	ArrayList<String> nombre  = new ArrayList<String>();

	@Cuando("se busca el certificado de depósito por {string} con {string}")
	public void se_busca_el_certificado_de_depósito_por_con(String numero_de_operacion, String numero) {
	    FormActions.selectByText(FBusquedaDepositoForm.Seleccion.buscarPor, numero_de_operacion);
	    FormActions.enterText(FBusquedaDepositoForm.IngresarDatos.input_BuscarTodos, numero);
	    FormActions.clickOn(FBusquedaDepositoForm.Buttons.botonBuscar);
		FormActions.clickOn(FBusquedaDepositoForm.GridListaP.gridPrimerCliente);
	}

	@Cuando("presiona el botón Aceptar")
	public void presiona_el_botón_Aceptar() {
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
		HeaderActions.clickAction(FDetalleBusquedaDeposito.Buttons.botonOpcionesApertura);
		HeaderActions.clickAction(FDetalleBusquedaDeposito.Buttons.botonCancelacionNormal);
	}
	
	
	
	//JCMA QA-S465034
	@Cuando("se diligencia el formulario de Cancelación")
	public void se_diligencia_el_formulario_de_cancelacion(){
		FormActions.selectByText(FCancelacionNormalForm.Seleccion.solicitante, "FERNANDA DIAZ DE LEON");
		FormActions.enterText(FCancelacionNormalForm.IngresarDatos.inputObservacion, "Obervación de prueba");
		FormActions.clickOn(FCancelacionNormalForm.Buttons.botonSiguienteop);
	}
	
	//JCMA QA-S465034
	@Cuando("se diligencia el formulario de forma de pago de {string} con {string} el {string}")
	public void se_diligencia_el_formulario_de_forma_de_pago(String nombre, String formaPago, String monto){ 
		FormActions.clickOn(FFormasDePago.Buttons.botonNuevo);
		FormActions.selectByText(FFormasDePago.Seleccion.formaRecepcion, formaPago);
		FormActions.enterText(FFormasDePago.IngresarDatos.input_MontoRecepcion, monto);
		FormActions.selectByText(FFormasDePago.Seleccion.beneficiario, nombre);
		FormActions.clickOn(FFormasDePago.Buttons.botonAceptarPago);
		FormActions.clickOn(FFormasDePago.Buttons.botonGuardar);
	}
	
	//JCMA QA-S465034
	@Entonces("el Certificado de Depósito se cancela cambiando el estado del mismo a {string}")
	public void el_certificado_de_deposito_se_cancela_cambiando_el_estado_del_mismo(String estado){
		ContainerActions.closeActiveTabContainer();
		ContainerActions.changeToIframe("shellTab");
		ContainerActions.activeIframe();
		//BaseActions.takeScreenshot();
		ValidationActions.isEquals(FDetalleOperacionApertura.CabeceraInformacion.estadoApertura, estado);	
	}
	
	/*MAAV Verificar la Cancelación de un Certificado de Depósito con 2 Formas de Pago*/
	
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
	public void se_diligencia_el_formulario_de_cancelacion_con_el_y_con(String nombre_solicitante ,String observacion) {
		FormActions.selectByText(FCancelacionNormalForm.Seleccion.solicitante,nombre_solicitante);
		FormActions.enterText(FCancelacionNormalForm.IngresarDatos.inputObservacion, observacion);
		FormActions.clickOn(FCancelacionNormalForm.Buttons.botonSiguienteop);
	}
	
	@Cuando("se diligencia el formulario de forma de pago con {string}, {string}, {string} y {string}, {string}")
	public void se_diligencia_el_formulario_de_forma_de_pago_y(String formaRecepcionFP, String cantidad1, String nombre_beneficiario,String formaRecepcionFP2, String cantidad2) {
		FormActions.clickOn(FFormasDePago.Buttons.botonNuevo);
		FormActions.selectByText(FFormasDePago.Seleccion.formaRecepcion, formaRecepcionFP);
		FormActions.enterText(FFormasDePago.IngresarDatos.input_MontoRecepcion, cantidad1);
		FormActions.selectByText(FFormasDePago.Seleccion.beneficiario, nombre_beneficiario);
		FormActions.clickOn(FFormasDePago.Buttons.botonAceptarPago);
		FormActions.clickOn(FFormasDePago.Buttons.botonNuevo);
		FormActions.selectByText(FFormasDePago.Seleccion.formaRecepcion, formaRecepcionFP2);
		FormActions.enterText(FFormasDePago.IngresarDatos.input_MontoRecepcion, cantidad2);
		FormActions.selectByText(FFormasDePago.Seleccion.beneficiario, nombre_beneficiario);
		FormActions.clickOn(FFormasDePago.Buttons.botonAceptarPago);	
		FormActions.clickOn(FFormasDePago.Buttons.botonGuardar);
	}
	
	@Cuando("se diligencia el formulario de forma de pago con cuenta {string}, {string}, {string}, {string}, {string}, {string}")
	public void se_diligencia_el_formulario_de_forma_de_pago_con_cuenta(String formaRecepcionFP, String cantidad1, String nombre_beneficiario,String formaRecepcionFP2,String cantidad2, String cuenta) {
		FormActions.clickOn(FFormasDePago.Buttons.botonNuevo);
		FormActions.selectByText(FFormasDePago.Seleccion.formaRecepcion, formaRecepcionFP);
		FormActions.enterText(FFormasDePago.IngresarDatos.input_MontoRecepcion, cantidad1);
		FormActions.selectByText(FFormasDePago.Seleccion.beneficiario, nombre_beneficiario);
		FormActions.clickOn(FFormasDePago.Buttons.botonCuentaCliente);
		GridActions.selectRecord(FRecepcionModalFormManual.grid,Integer.parseInt(cuenta) ); 
		FormActions.clickOn(FFormasDePago.Buttons.botonAceptarPago);
		FormActions.clickOn(FFormasDePago.Buttons.botonNuevo);
		FormActions.selectByText(FFormasDePago.Seleccion.formaRecepcion, formaRecepcionFP2);
		FormActions.enterText(FFormasDePago.IngresarDatos.input_MontoRecepcion, cantidad2);
		FormActions.selectByText(FFormasDePago.Seleccion.beneficiario, nombre_beneficiario);
		FormActions.clickOn(FFormasDePago.Buttons.botonAceptarPago);	
		FormActions.clickOn(FFormasDePago.Buttons.botonGuardar);
	}
	
	
	/*MAAV Modificación de Certificados de Depósito-Parte 3*/
	
	
	@Cuando("en el formulario de clientes agregar un {string} y con tipo {string}")
	public void en_el_formulario_de_clientes_agregar_y_con_tipo(String cliente_persona_natural, String tipo_cuenta){
		FormActions.clickOn(AdminAperturaPlazoFijo.Buttons.nuevoCliente);
		FormActions.selectByText(AdminAperturaPlazoFijo.tipoCuenta, tipo_cuenta);
		FormActions.clickOn(AdminAperturaPlazoFijo.Buttons.botonBuscarCliente);
		FormActions.enterText(FBusquedaClienteForm.FiltroBusquedaCliente.input_BARRA_BUSCAR_IDENTIFICACION, cliente_persona_natural);
		FormActions.clickOn(FBusquedaClienteForm.Buttons.botonBuscar);
		FormActions.clickOn(FBusquedaClienteForm.GridListaP.gridClienteNatural);
		FormActions.clickOn(FBusquedaClienteForm.Buttons.botonSiguiente);
		FormActions.clickOn(AdminAperturaPlazoFijo.ButtonsRow.buttonsAcceptRow);
		FormActions.clickOn(AdminAperturaPlazoFijo.Buttons.botonSiguiente);
	}
	
	@Cuando("se diligencia el formulario de Operaciones con {string} y {string} a {string}")
	public void se_diligencia_el_formulario_de_operaciones_modificando_la_forma_de_pago(String forma_de_pago , String frecuencia, String plazo){
		FormActions.selectByText(FVistaOperacionFormManual.Seleccion.formaPago, forma_de_pago);
		FormActions.selectByText(FVistaOperacionFormManual.Seleccion.frecuenciaPago, frecuencia);
		FormActions.enterText(FVistaOperacionFormManual.IngresarDatos.input_Plazo, plazo);
		FormActions.clickOn(FVistaOperacionFormManual.Buttons.botonSimular);
		FormActions.clickOn(FVistaOperacionFormManual.Buttons.botonAceptarModal);
		FormActions.clickOn(FVistaOperacionFormManual.Buttons.botonSiguiente);
		FormActions.clickOn(FRecepcionModalFormManual.Buttons.botonSiguienteRecepcion);
	}
	
	@Cuando("se diligencia el formulario de forma de pago modificacion con {string},{string}")
	public void se_diligencia_el_formulario_de_forma_de_pago_modificacion_con(String formaRecepcionFP, String nombre_beneficiario){
		FormActions.clickOn(FFormasDePago.Buttons.botonNuevo);
		FormActions.selectByText(FFormasDePago.Seleccion.formaRecepcion, formaRecepcionFP);
		FormActions.enterText(FFormasDePago.IngresarDatos.input_MontoRecepcion, "2683.82");
		FormActions.selectByText(FFormasDePago.Seleccion.beneficiario, nombre_beneficiario);
		FormActions.clickOn(FFormasDePago.Buttons.botonAceptarPago);
		FormActions.clickOn(FFormasDePago.Buttons.botonGuardar);
		
	}
	
	@Cuando("se actualiza la forma de pago del Certificado de Depósito con {string}")
	public void se_actualiza_la_forma_de_pago_del_certificado_de_deposito(String forma_de_pago) throws InterruptedException{
		FormActions.clickOn(FDetalleOperacionApertura.BarraOpciones.pestañaOperacion);
		Thread.sleep(2000);
		ValidationActions.isEquals(FVistaOperacionFormManual.Seleccion.validarFormaPago, forma_de_pago);
		//BaseActions.takeScreenshot();
	}
	
	@Cuando("se diligencia el formulario de forma de pago con {string} y {string} y {string}")
	public void se_diligencia_el_formulario_de_forma_de_pago_multimoneda(String formaRecepcion,String monto, String solicitante){
		FormActions.clickOn(FFormasDePago.Buttons.botonNuevo);
		FormActions.selectByText(FFormasDePago.Seleccion.formaRecepcion, formaRecepcion);
		FormActions.enterText(FFormasDePago.IngresarDatos.input_MontoRecepcion, monto);
		FormActions.selectByText(FFormasDePago.Seleccion.beneficiario, solicitante);
		FormActions.clickOn(FFormasDePago.Buttons.botonCuentaCliente);
		FormActions.clickOn(FFormasDePago.Grid.gridPrimerCliente);
		FormActions.clickOn(FFormasDePago.Buttons.botonAceptarPago);
		FormActions.clickOn(FFormasDePago.Buttons.botonGuardar);
	}
	
	@Cuando("se presiona el menú acciones escogiendo la opción Modificación")
	public void se_presiona_el_menu_acciones_escogiendo_la_opcion_modificacion(){
		HeaderActions.clickAction(FDetalleOperacionApertura.Buttons.botonOpcionesApertura);
		HeaderActions.clickAction(FDetalleOperacionApertura.Buttons.botonModificacion);
	}
	@Cuando("en el formulario realiza la busqueda por {string} por {string}, {string}, {string} tipo {string}")
	public void en_el_formulario_realiza_la_busqueda_por_por_tipo(String cliente, String entidad, String tipo, String buscar_por, String tipoCuenta) {
		if(cliente.length()>0){
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
		FormActions.clickOn(AdminAperturaPlazoFijo.Buttons.botonSiguiente);
	}
	
	@Cuando("se diligencia el formulario de Operaciones modificando el {string}")
	public void se_diligencia_el_formulario_de_operaciones_modificando_el_monto(String monto){
		FormActions.enterText(FVistaOperacionFormManual.IngresarDatos.input_Monto, monto);
		FormActions.clickOn(FVistaOperacionFormManual.Buttons.botonSimular);
		FormActions.clickOn(FVistaOperacionFormManual.Buttons.botonAceptarModal);
		FormActions.clickOn(FVistaOperacionFormManual.Buttons.botonSiguiente);	
	}
	
	@Cuando("se diligencia el formulario de forma de recepcion {string} con {string}")
	public void se_diligencia_el_formulario_de_forma_de_recepcion(String monto, String tipo){
		FormActions.clickOn(AdminAperturaPlazoFijo.ButtonsRow.buttonsDeleteRow);
		FormActions.clickOn(AdminAperturaPlazoFijo.Buttons.botonAceptarEliminacion);
		FormActions.clickOn(FRecepcionModalFormManual.Buttons.botonNuevo);
		FormActions.selectByText(FRecepcionModalFormManual.Seleccion.formaRecepcion, tipo);
		FormActions.enterText(FRecepcionModalFormManual.IngresarDatos.input_MontoRecepcion, monto);
		FormActions.clickOn(FRecepcionModalFormManual.Buttons.botonAceptarRecepcion);
		FormActions.clickOn(FRecepcionModalFormManual.Buttons.botonSeleccionRecepcion);
		FormActions.clickOn(FRecepcionModalFormManual.Buttons.botonGuardarRecepcion);
		
	}
	
	@Cuando("se actualiza el {string} del Certificado de Depósito")
	public void se_actualiza_el_monto_del_certificado_de_deposito(String monto){
		ValidationActions.isEquals(FDetalleOperacionApertura.CabeceraInformacion.montoApertura, monto);
	}
	
	@Cuando("se diligencia el formulario de Operaciones modificando la forma de pago con {string}")
	public void se_diligencia_el_formulario_de_operaciones_modificando_la_forma_de_pago(String tipo){
		FormActions.selectByText(FVistaOperacionFormManual.Seleccion.formaPago, tipo);
		FormActions.clickOn(FVistaOperacionFormManual.Buttons.botonSimular);
		FormActions.clickOn(FVistaOperacionFormManual.Buttons.botonAceptarModal);
		FormActions.clickOn(FVistaOperacionFormManual.Buttons.botonSiguiente);
	}
	@Cuando("se diligencia el formulario forma de recepción")
	public void se_diligencia_el_formulario_forma_de_recepcion(){
		FormActions.clickOn(FRecepcionModalFormManual.Buttons.botonGuardarRecepcion);
	}
	
	@Cuando("se actualiza la forma de pago del Certificado de Depósito a {string}")
	public void se_actualiza_la_forma_de_pago_del_certificado_de_deposito_a(String estado){
		FormActions.clickOn(FDetalleOperacionApertura.BarraOpciones.pestañaOperacion);
		BaseActions.getValue(FVistaOperacionFormManual.Seleccion.formaPago);
		ValidationActions.isEquals(FVistaOperacionFormManual.Seleccion.validarFormaPago, estado);
	}
	
	//RSRM - QA-S465778-Modificación de Certificados de Depósito - Verificar un Certificado de Depósito adicionando un Cliente
	@Cuando("diligencia el formulario de Operación {string},{string},{string},{string},{string},{string},{string}")
	public void diligencia_el_formulario_de_Operación(String producto, String forma_pago, String capitaliza, String categoria, String moneda, String monto, String plazo) {
		if(producto.length()>0){FormActions.selectByText(FVistaOperacionFormManual.Seleccion.producto, producto); } 
		if(forma_pago.length()>0){FormActions.selectByText(FVistaOperacionFormManual.Seleccion.formaPago, forma_pago); }
		if(capitaliza.length()>0){FormActions.selectByText(FVistaOperacionFormManual.Seleccion.capitalizaInteres, capitaliza); }
		if(categoria.length()>0){FormActions.selectByText(FVistaOperacionFormManual.Seleccion.categoria, categoria); }
		if(moneda.length()>0){FormActions.selectByText(FVistaOperacionFormManual.Seleccion.moneda, moneda); }
		if(monto.length()>0){FormActions.enterText(FVistaOperacionFormManual.IngresarDatos.input_Monto, monto); }
		if(plazo.length()>0){FormActions.enterText(FVistaOperacionFormManual.IngresarDatos.input_Plazo, plazo); }
		FormActions.clickOn(FVistaOperacionFormManual.Buttons.botonSimular);
		FormActions.clickOn(FVistaOperacionFormManual.Buttons.botonAceptarModal);
		FormActions.clickOn(FVistaOperacionFormManual.Buttons.botonSiguiente);
	}

	@Dado("diligencia el formulario de Recepción de fondos {string} a {string} con {string} y guardar")
	public void diligencia_el_formulario_de_Recepción_de_fondos_a_con_y_guardar(String formaRecepcion, String cliente, String mondo) {
		FormActions.clickOn(FRecepcionModalFormManual.Buttons.botonBorrarRecepcion);
		FormActions.clickOn(FRecepcionModalFormManual.Buttons.botonAceptarBorrarRecepcion);
		if(formaRecepcion.length()>0 && cliente.length()>0 && mondo.length()>0){FormActions.clickOn(FRecepcionModalFormManual.Buttons.botonNuevo); }
		else if(formaRecepcion.length()>0 && mondo.length()>0){FormActions.clickOn(FRecepcionModalFormManual.Buttons.botonNuevo); }
		if(formaRecepcion.length()>0){FormActions.enterTextAndTab(FRecepcionModalFormManual.IngresarDatos.inputFormaRecepcion, formaRecepcion); }
		if(mondo.length()>0){FormActions.enterText(FRecepcionModalFormManual.IngresarDatos.input_MontoRecepcion, mondo);}
		if(cliente.length()>0  && mondo.length()>0){FormActions.enterTextAndEnter(FRecepcionModalFormManual.IngresarDatos.inputprimerCliente, cliente);}
		if(formaRecepcion.length()>0 && cliente.length()>0 && mondo.length()>0){
			FormActions.clickOn(FRecepcionModalFormManual.Buttons.botonCuentaCliente);
			FormActions.clickOn(FRecepcionModalFormManual.Grid.gridPrimerCliente);
			FormActions.clickOn(FRecepcionModalFormManual.Buttons.botonAceptarRecepcion);
		}	
		else if(formaRecepcion.length()>0 && mondo.length()>0){FormActions.clickOn(FRecepcionModalFormManual.Buttons.botonAceptarRecepcion); }
		
		FormActions.clickOn(FRecepcionModalFormManual.Buttons.botonSeleccionRecepcion);
		FormActions.clickOn(FRecepcionModalFormManual.Buttons.botonGuardarRecepcion);
	}

	@Entonces("se actualiza el Certificado de Depósito con el nuevo Cliente {string} y se mantiene en estado {string}")
	public void se_actualiza_el_Certificado_de_Depósito_con_el_nuevo_Cliente_y_se_mantiene_en_estado(String cliente, String estado) {
		FormActions.clickOn(FDetalleOperacionApertura.Buttons.botonEtiquetaTitulares);
		FormActions.clickOn(FDetalleOperacionApertura.GridTitulares.gridTitularesPrimerNombre);
		ValidationActions.isEquals(FDetalleOperacionApertura.CabeceraInformacion.estadoApertura, estado);
		
	}
	
	//RSRM - QA-S465778-Modificación de Certificados de Depósito - Verificar un Certificado de Depósito adicionando un forma de recepción

	@Entonces("se actualiza el Certificado de Depósito con el Certificado de Depósito y se mantiene en estado {string}")
	public void se_actualiza_el_Certificado_de_Depósito_con_el_Certificado_de_Depósito_y_se_mantiene_en_estado(String estado) {
		FormActions.clickOn(FDetalleOperacionApertura.Buttons.botonEtiquetaRecepcionFondos);
		FormActions.clickOn(FDetalleOperacionApertura.GridTitulares.gridPrimerRecepcionFondos);
		ValidationActions.isEquals(FDetalleOperacionApertura.CabeceraInformacion.estadoApertura, estado);
	}
	
	//JCMA QA-S467398
	@Cuando("se presiona el menú acciones, escoger la opción Anulación")
	public void se_presiona_el_menu_acciones_escoger_la_opcion_anulacion (){
		HeaderActions.clickAction(FDetalleOperacionApertura.Buttons.botonOpcionesApertura);
		HeaderActions.clickAction(FDetalleOperacionApertura.Buttons.botonAnular);
	}
	
	//JCMA AQ-S467398
	@Cuando("se ingresa una Observación en la pantalla Anular {string}")
	public void se_ingresa_una_Observacion_en_la_pantalla_Anular(String observacion){
		FormActions.enterText(FDetalleOperacionApertura.IngresarDatos.input_Observaciones, observacion);
		FormActions.clickOn(FDetalleOperacionApertura.Buttons.botonAceptarObservacion);
		FormActions.clickOn(FDetalleOperacionApertura.Buttons.botonAceptarObservacionMensaje);
	}
	
	@Cuando("el Certificado de Depósito es anulado, cambiando el estado en la pantalla Datos de Certificado a {string}")
	public void el_Certificado_de_Depósito_es_anulado_cambiando_el_estado_en_la_pantalla_Datos_de_Certificado(String estado){
		ValidationActions.isEquals(FDetalleOperacionApertura.CabeceraInformacion.estadoApertura, estado);
	}
	
	//#QA-S471520
	@Cuando("se presiona el menú acciones, escoger la opción Bloqueos")
	public void se_presiona_el_menu_acciones_escoger_la_opcion_Bloqueos(){
		//HeaderActions.clickAction(FDetalleBusquedaDeposito.Buttons.botonOpcionesApertura);
		HeaderActions.clickAction(FDetalleBusquedaDeposito.Buttons.botonBloqueos);
		//ValidationActions.isEquals(GBloquear.TextoDetalleOperacion.porcentajeBloqueo, "Disponible - 100.00 %");
	}
	
	//#QA-S471520
	@Cuando("se presiona el menú acciones, escoger la opción {string}")
	public void se_presiona_el_menu_acciones_escoger_la_opcion(String opcion){		
		HeaderActions.clickActionByText(opcion);
	}
	
	//#QA-S471520
	@Cuando("se debe ingresar los datos en el formulario Bloqueo, presionar el botón Nuevo llenar los campos {string}, {string}, {string}, {string}")	
	public void se_debe_ingresar_los_datos_en_el_formulario_Bloqueo_presionar_el_boton_Nuevo_llenar_los_campos_motivo_observacion_monto_total(String motivo, String observacion, String monto, String porcentaje){
		double montoNumerico = 0;
		GridActions.clickNewRecord(FBloqueosForm.gridListaBloqueos);
		FormActions.clickOn(FBloqueosForm.Buttons.botonCatalogo);
		
		switch (motivo) {
		case "DETERIORO":
			GridActions.selectRecord(FCatalogoForm.gridListaCatalogos, 1);
			break;
		case "REQUERIMIENTO JUDICIAL":
			GridActions.selectRecord(FCatalogoForm.gridListaCatalogos, 2);
			break;
		case "MIGRACION":
			GridActions.selectRecord(FCatalogoForm.gridListaCatalogos, 3);
			break;
		case "PERDIDA":
			GridActions.selectRecord(FCatalogoForm.gridListaCatalogos, 4);
			break;
		case "ROBO":
			GridActions.selectRecord(FCatalogoForm.gridListaCatalogos, 5);
			break;
		}
		
		FormActions.enterText(FBloqueosForm.GridListaBloqueos.observacion, observacion);
		
		switch (porcentaje) {
		case "total":
			FormActions.enterText(FBloqueosForm.GridListaBloqueos.monto, monto);
			GridActions.clickAcceptRecord(FBloqueosForm.gridListaBloqueos, 1);
			FormActions.clickOn(FBloqueosForm.Buttons.botonCerrarBloqueo);
			break;
		case "parcial":			
			montoNumerico = Double.parseDouble(monto) * 0.8; 
			FormActions.enterText(FBloqueosForm.GridListaBloqueos.monto, String.valueOf(montoNumerico));
			GridActions.clickAcceptRecord(FBloqueosForm.gridListaBloqueos, 1);
			FormActions.clickOn(FBloqueosForm.Buttons.botonCerrarBloqueo);
			break;
		case "superior":
			montoNumerico = Double.parseDouble(monto) * 1.2; 
			FormActions.enterText(FBloqueosForm.GridListaBloqueos.monto, String.valueOf(montoNumerico));
			GridActions.clickAcceptRecord(FBloqueosForm.gridListaBloqueos, 1);
			break;
		}
		
		BaseActions.takeScreenshot();		
	}
	
	//#QA-S471520
	@Cuando("se genera el bloqueo del Certificado de Depósito por el {string} {string}")
	public void se_genera_el_bloqueo_del_Certificado_de_Deposito_por_el_monto_total(String monto, String porcentaje){
		switch (porcentaje) {
		case "total":
			ValidationActions.isEquals(FDetalleOperacionForm.ResumenInformacion.montoBloqueado, monto);
			BaseActions.takeScreenshot();
			break;
		case "parcial":
			ValidationActions.isEquals(FDetalleOperacionForm.ResumenInformacion.montoBloqueado, monto);
			BaseActions.takeScreenshot();
			break;
		case "superior":
			ValidationActions.isEquals(FBloqueosForm.MensajeExcepcion.mensajeInformacion, "Excepción de negocio: 16 - 141069 - [BL_retencion] Monto a bloquear mayor que monto del plazo fijo");
			BaseActions.takeScreenshot();
			break;
		}
	}
	
	//Inicio Cancelacion Certificado
	@Cuando("presiona el botón siguientes")
	public void presiona_el_botón_siguientes() {
	    FormActions.clickOn(FVistaTitularesForm.Buttons.cmdCommand2IdCMTPFPRTMQFFB);
	}
	
	@Cuando("diligencia el formulario de Cancelación {string},{string},{string},{string},{string},{string},{string},{string}")
	public void diligencia_el_formulario_de_Cancelación(String capital, String saldo, String impuesto, String total, String interesGanado, String interesPagado, String solicitante, String observacion) {
	    if(capital.length()>0){ FormActions.enterText(FCancelacionForm.DetalleOperacion.monto, capital); }
	    if(saldo.length()>0){ FormActions.enterText(FCancelacionForm.DetalleOperacion.interesGanado, saldo); }
	    if(impuesto.length()>0){ FormActions.enterText(FCancelacionForm.DetalleCancelacion.impuesto, impuesto); }
	    if(total.length()>0){ FormActions.enterText(FCancelacionForm.DetalleCancelacion.montoCancelacion, total); }
	    if(interesGanado.length()>0){ FormActions.enterText(FCancelacionForm.DetalleOperacion.totalInteresGanado, interesGanado); }
	    if(interesPagado.length()>0){ FormActions.enterText(FCancelacionForm.DetalleOperacion.totalInteresPagado, interesPagado); }
	    if(solicitante.length()>0){ FormActions.selectByText(FCancelacionForm.DetalleCancelacion.clienteSolicitante, solicitante); }
	    if(observacion.length()>0){ FormActions.enterText(FCancelacionForm.DetalleCancelacion.observacion, observacion); }
	    FormActions.clickOn(FVistaCancelacionForm.Buttons.cmdCommand1IdCMTPFPRTXO7N);
	}
	
	@Cuando("llena el formulario de forma de pago {string} a {string},{string},{string} con {string}")
	public void llena_el_formulario_de_forma_de_pago_a_con(String formaRecepcion, String beneficiario, String columna, String cuenta, String montoPago) {
		GridActions.clickNewRecord(FPagoForm.gridListaDetallePagos);
		FormActions.selectByText(FPagoModalForm.listaDetallePagos.codigoFormaPago, formaRecepcion);
		if(formaRecepcion.equals("CUENTA DE AHORROS")){
			FormActions.enterText(FPagoModalForm.listaDetallePagos.monto, montoPago);
			FormActions.selectByText(FPagoModalForm.listaDetallePagos.cliente, beneficiario);
			FormActions.clickTextButton(FPagoModalForm.listaDetallePagos.cuentaReferencia);
			GridActions.selectRecordByColumnAndText(FCuentasForm.gridListaCuentas, Integer.parseInt(columna), cuenta);
		}else{
			FormActions.enterText(FPagoModalForm.listaDetallePagos.monto, montoPago);
			FormActions.selectByText(FPagoModalForm.listaDetallePagos.cliente, beneficiario);
		}
		FormActions.clickOn(FPagoModalForm.Buttons.cmdCommand1IdCMTPFPRTMB11);
		FormActions.clickOn(FVistaPagoForm.Buttons.cmdCommand3IdCMTPFPRTYP273);
	}
	
	@Entonces("el sistema despliega un mensaje informativo indicando que la cuenta se encuentra {string}")
	public void el_sistema_despliega_un_mensaje_informativo_indicando_que_la_cuenta_se_encuentra(String string) {
		BaseActions.takeScreenshot();
	}
	@Entonces("en la pantalla emergente de los números de cuenta no se visualiza la cuenta cerrada")
	public void en_la_pantalla_emergente_de_los_números_de_cuenta_no_se_visualiza_la_cuenta_cerrada() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	
	//Fin Cancelación Certificado

}

