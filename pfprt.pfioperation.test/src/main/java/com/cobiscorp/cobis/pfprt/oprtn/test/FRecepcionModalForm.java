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

public class FRecepcionModalForm{
	public static final ListaDetalleRecepcion listaDetalleRecepcion = Singleton.getInstance(ListaDetalleRecepcion.class);

	private FRecepcionModalForm() {
		throw new IllegalStateException("FRecepcionModalForm is a utility class");
	}
	public static class Buttons {
		private Buttons() {
			throw new IllegalStateException("Buttons is a utility class");
		}
		public static final CmdCommand1IdCMTPFPRTULO1P cmdCommand1IdCMTPFPRTULO1P = Singleton.getInstance(CmdCommand1IdCMTPFPRTULO1P.class);
		
		public static class CmdCommand1IdCMTPFPRTULO1P extends COBISButton{
			public CmdCommand1IdCMTPFPRTULO1P () {
				this.init("CM_TPFPRTUL_O1P", "Aceptar");
			}
		}
	
		public static final CmdCommand2IdCMTPFPRTULYD2 cmdCommand2IdCMTPFPRTULYD2 = Singleton.getInstance(CmdCommand2IdCMTPFPRTULYD2.class);
		
		public static class CmdCommand2IdCMTPFPRTULYD2 extends COBISButton{
			public CmdCommand2IdCMTPFPRTULYD2 () {
				this.init("CM_TPFPRTUL_YD2", "Cancelar");
			}
		}
	

	}
	

	public static class ListaDetalleRecepcion {
	
		private ListaDetalleRecepcion() {
			throw new IllegalStateException("FRecepcionModalForm is a utility class");
		}
		
		public static final CodigoFormaPago codigoFormaPago = Singleton.getInstance(CodigoFormaPago.class);
		public static final CodigoMoneda codigoMoneda = Singleton.getInstance(CodigoMoneda.class);
		public static final Monto monto = Singleton.getInstance(Monto.class);
		public static final Cliente cliente = Singleton.getInstance(Cliente.class);
		public static final CodigoBanco codigoBanco = Singleton.getInstance(CodigoBanco.class);
		public static final CuentaReferencia cuentaReferencia = Singleton.getInstance(CuentaReferencia.class);
		public static final TipoPago tipoPago = Singleton.getInstance(TipoPago.class);

		public static class CodigoFormaPago extends COBISComboBox {
			public CodigoFormaPago() {
				this.init("VA_CODIGOAPAGOKIMV_550386","FormadeRecepcion");
			}
		}			

		public static class CodigoMoneda extends COBISComboBox {
			public CodigoMoneda() {
				this.init("VA_CODIGOMONEDAITE_767386","Moneda");
			}
		}			

		public static class Monto extends COBISInputValue {
			public Monto() {
				this.init("VA_MONTOIZNJERYLGS_823386","Monto");
			}
		}			

		public static class Cliente extends COBISComboBox {
			public Cliente() {
				this.init("VA_CLIENTESCJFYNZM_349386","Cliente");
			}
		}			

		public static class CodigoBanco extends COBISDropDownList {
			public CodigoBanco() {
				this.init("VA_CODIGOBANCODKND_854386","Banco");
			}
		}			

		public static class CuentaReferencia extends COBISInputTextButton {
			public CuentaReferencia() {
				this.init("VA_CUENTAREFEREAAA_719386","Cuenta");
			}
		}			

		public static class TipoPago extends COBISComboBox {
			public TipoPago() {
				this.init("VA_TIPOPAGOUUEFUJJ_431386","TipoPago");
			}
		}			
	}
}
