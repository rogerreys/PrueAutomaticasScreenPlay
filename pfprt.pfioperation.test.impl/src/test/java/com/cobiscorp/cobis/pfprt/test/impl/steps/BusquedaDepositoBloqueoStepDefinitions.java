package com.cobiscorp.cobis.pfprt.test.impl.steps;

import com.cobiscorp.cobis.pfprt.oprtn.test.FBloqueosForm;
import com.cobiscorp.cobis.pfprt.oprtn.test.FBusquedaDepositoForm;
import com.cobiscorp.cobis.pfprt.oprtn.test.FCatalogoForm;
import com.cobiscorp.cobis.pfprt.oprtn.test.FDetalleOperacionForm;
import com.cobiscorp.cobis.serenity.actions.*;

import io.cucumber.java.es.Cuando;

public class BusquedaDepositoBloqueoStepDefinitions {
	
	@Cuando("se busca el certificado de depósito por {string} con {string}")
	public void se_busca_el_certificado_de_depósito_por_con(String numero_de_operacion, String numero) {
	    FormActions.selectByText(FBusquedaDepositoForm.Seleccion.buscarPor, numero_de_operacion);
	    FormActions.enterText(FBusquedaDepositoForm.IngresarDatos.input_BuscarTodos, numero);
	    FormActions.clickOn(FBusquedaDepositoForm.Buttons.botonBuscar);
		FormActions.clickOn(FBusquedaDepositoForm.GridListaP.gridPrimerCliente);
	}
	
	@Cuando("se presiona el menú acciones, escoger la opción {string}")
	public void se_presiona_el_menu_acciones_escoger_la_opcion(String opcion){		
		HeaderActions.clickActionByText(opcion);
	}
	
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

}
