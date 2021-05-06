package com.cobiscorp.cobis.pfprt.test.impl.steps;

import com.cobiscorp.cobis.pfprt.oprtn.test.FBusquedaDepositoForm;
import com.cobiscorp.cobis.pfprt.oprtn.test.FCancelacionForm;
import com.cobiscorp.cobis.pfprt.oprtn.test.FCuentasForm;
import com.cobiscorp.cobis.pfprt.oprtn.test.FDetalleOperacionForm;
import com.cobiscorp.cobis.pfprt.oprtn.test.FPagoForm;
import com.cobiscorp.cobis.pfprt.oprtn.test.FPagoModalForm;
import com.cobiscorp.cobis.pfprt.oprtn.test.FVistaCancelacionForm;
import com.cobiscorp.cobis.pfprt.oprtn.test.FVistaPagoForm;
import com.cobiscorp.cobis.pfprt.oprtn.test.FVistaTitularesForm;
import com.cobiscorp.cobis.serenity.actions.BaseActions;
import com.cobiscorp.cobis.serenity.actions.FormActions;
import com.cobiscorp.cobis.serenity.actions.GridActions;
import com.cobiscorp.cobis.serenity.actions.HeaderActions;
import com.cobiscorp.cobis.serenity.actions.ValidationActions;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;

public class CancelacionCertificado {
	@Cuando("se busca el certificado de depósito por {string} con {string}")
	public void se_busca_el_certificado_de_depósito_por_con(String numero_operacion, String numero) {
		FormActions.selectByText(FBusquedaDepositoForm.Seleccion.buscarPor, numero_operacion);
		FormActions.enterText(FBusquedaDepositoForm.IngresarDatos.input_BuscarTodos, numero);
		FormActions.clickOn(FBusquedaDepositoForm.Buttons.botonBuscar);
		FormActions.clickOn(FBusquedaDepositoForm.GridListaP.gridPrimerCliente);
	}

	@Cuando("se presiona el menú acciones, escoge la opción {string}")
	public void se_presiona_el_menú_acciones_escoge_la_opción(String opcion) {
		HeaderActions.clickActionByText(opcion);
	}

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


}
