/*
 * Esta aplicacion es parte de los paquetes bancarios propiedad de COBISCORP.
 * Su uso no autorizado queda expresamente prohibido asi como cualquier
 * alteracion o agregado hecho por alguno de sus usuarios sin el debido
 * consentimiento por escrito de COBISCORP.
 * Este programa esta protegido por la ley de derechos de autor y por las
 * convenciones internacionales de propiedad intelectual. Su uso no
 * autorizado dara derecho a COBISCORP para obtener ordenes de secuestro
 * o retencion y para perseguir penalmente a los autores de cualquier infraccion.
 */
package com.cobiscorp.cobis.pfprt.oprtn.test;
import com.cobiscorp.cobis.utils.base.Singleton;
import com.cobiscorp.cobis.utils.controls.impl.*;

public class FPagoModalForm{
	public static final ListaDetallePagos listaDetallePagos = Singleton.getInstance(ListaDetallePagos.class);

	private FPagoModalForm() {
		throw new IllegalStateException("FPagoModalForm is a utility class");
	}
	public static class Buttons {
		private Buttons() {
			throw new IllegalStateException("Buttons is a utility class");
		}
		public static final CmdCommand1IdCMTPFPRTMB11 cmdCommand1IdCMTPFPRTMB11 = Singleton.getInstance(CmdCommand1IdCMTPFPRTMB11.class);
		
		public static class CmdCommand1IdCMTPFPRTMB11 extends COBISButton{
			public CmdCommand1IdCMTPFPRTMB11 () {
				this.init("CM_TPFPRTMB_1_1", "Aceptar");
			}
		}
	
		public static final CmdCommand2IdCMTPFPRTMBHP4 cmdCommand2IdCMTPFPRTMBHP4 = Singleton.getInstance(CmdCommand2IdCMTPFPRTMBHP4.class);
		
		public static class CmdCommand2IdCMTPFPRTMBHP4 extends COBISButton{
			public CmdCommand2IdCMTPFPRTMBHP4 () {
				this.init("CM_TPFPRTMB_HP4", "Cancelar");
			}
		}
	

	}
	

	public static class ListaDetallePagos {
	
		private ListaDetallePagos() {
			throw new IllegalStateException("FPagoModalForm is a utility class");
		}
		
		public static final CodigoFormaPago codigoFormaPago = Singleton.getInstance(CodigoFormaPago.class);
		public static final CodigoMoneda codigoMoneda = Singleton.getInstance(CodigoMoneda.class);
		public static final Monto monto = Singleton.getInstance(Monto.class);
		public static final Cliente cliente = Singleton.getInstance(Cliente.class);
		public static final CodigoBancoAch codigoBancoAch = Singleton.getInstance(CodigoBancoAch.class);
		public static final TipoCliente tipoCliente = Singleton.getInstance(TipoCliente.class);
		public static final TipoDocumentoBeneficiario tipoDocumentoBeneficiario = Singleton.getInstance(TipoDocumentoBeneficiario.class);
		public static final IdBeneficiario idBeneficiario = Singleton.getInstance(IdBeneficiario.class);
		public static final NombreBeneficiario nombreBeneficiario = Singleton.getInstance(NombreBeneficiario.class);
		public static final TipoCuentaAch tipoCuentaAch = Singleton.getInstance(TipoCuentaAch.class);
		public static final CodigoBanco codigoBanco = Singleton.getInstance(CodigoBanco.class);
		public static final CuentaReferencia cuentaReferencia = Singleton.getInstance(CuentaReferencia.class);
		public static final TipoPago tipoPago = Singleton.getInstance(TipoPago.class);

		public static class CodigoFormaPago extends COBISComboBox {
			public CodigoFormaPago() {
				this.init("VA_6153GLOUJHFTGTN_748373","FormadePago");
			}
		}			

		public static class CodigoMoneda extends COBISComboBox {
			public CodigoMoneda() {
				this.init("VA_CUENTAREFERECNA_374373","Moneda");
			}
		}			

		public static class Monto extends COBISInputValue {
			public Monto() {
				this.init("VA_MONTOTKRTOOHBQR_207373","Monto");
			}
		}			

		public static class Cliente extends COBISComboBox {
			public Cliente() {
				this.init("VA_CLIENTETAHDVAHD_570373","Beneficiario");
			}
		}			

		public static class CodigoBancoAch extends COBISComboBox {
			public CodigoBancoAch() {
				this.init("VA_7558GZVZIZYAPIA_583373","BancoBeneficiario");
			}
		}			

		public static class TipoCliente extends COBISRadioButtonList {
			public TipoCliente() {
				this.init("VA_TIPOCLIENTEAHLS_600373","TipodeCliente");
			}
		}			

		public static class TipoDocumentoBeneficiario extends COBISComboBox {
			public TipoDocumentoBeneficiario() {
				this.init("VA_TIPODOCUMENTIRO_871373","TipodeIdentificacion");
			}
		}			

		public static class IdBeneficiario extends COBISInputValue {
			public IdBeneficiario() {
				this.init("VA_4601EOSFSMSQKPR_770373","CedulaBeneficiario");
			}
		}			

		public static class NombreBeneficiario extends COBISInputValue {
			public NombreBeneficiario() {
				this.init("VA_4225PWCIWIGLKDT_647373","NombreBeneficiario");
			}
		}			

		public static class TipoCuentaAch extends COBISComboBox {
			public TipoCuentaAch() {
				this.init("VA_1560KLVKZRJLBWV_401373","TipodeCuentaDestino");
			}
		}			

		public static class CodigoBanco extends COBISDropDownList {
			public CodigoBanco() {
				this.init("VA_CODIGOBANCOSMUI_112373","Banco");
			}
		}			

		public static class CuentaReferencia extends COBISInputTextButton {
			public CuentaReferencia() {
				this.init("VA_CUENTAREFEREAAN_689373","Cuenta");
			}
		}			

		public static class TipoPago extends COBISComboBox {
			public TipoPago() {
				this.init("VA_TIPOPAGOMKOJSZS_163373","TipoPago");
			}
		}			
	}
}
