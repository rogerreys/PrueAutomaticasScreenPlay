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

public class ModalListaDescripcionPagosForm{

	public static final GridListaDescripcionPagos gridListaDescripcionPagos = Singleton.getInstance(GridListaDescripcionPagos.class);
	private ModalListaDescripcionPagosForm() {
		throw new IllegalStateException("ModalListaDescripcionPagosForm is a utility class");
	}
	public static class Buttons {
		private Buttons() {
			throw new IllegalStateException("Buttons is a utility class");
		}
		public static final CmdCommand1IdCMTPFPRTYGT3P cmdCommand1IdCMTPFPRTYGT3P = Singleton.getInstance(CmdCommand1IdCMTPFPRTYGT3P.class);
		
		public static class CmdCommand1IdCMTPFPRTYGT3P extends COBISButton{
			public CmdCommand1IdCMTPFPRTYGT3P () {
				this.init("CM_TPFPRTYG_T3P", "Emitir");
			}
		}
	
		public static final CmdCommand2IdCMTPFPRTYGYTT cmdCommand2IdCMTPFPRTYGYTT = Singleton.getInstance(CmdCommand2IdCMTPFPRTYGYTT.class);
		
		public static class CmdCommand2IdCMTPFPRTYGYTT extends COBISButton{
			public CmdCommand2IdCMTPFPRTYGYTT () {
				this.init("CM_TPFPRTYG_YTT", "Cancelar");
			}
		}
	

	}
	
	
	public static class GridListaDescripcionPagos extends COBISGrid {
		public GridListaDescripcionPagos() {
			this.init("QV_9475_70845", "QV_9475_70845");
		} 

		public static final FormaPago formaPago = Singleton.getInstance(FormaPago.class);
		public static final Beneficiario beneficiario = Singleton.getInstance(Beneficiario.class);
		public static final Monto monto = Singleton.getInstance(Monto.class);
		public static final Cuenta cuenta = Singleton.getInstance(Cuenta.class);
		public static final PorcentajePago porcentajePago = Singleton.getInstance(PorcentajePago.class);
		public static final Cliente cliente = Singleton.getInstance(Cliente.class);
		public static final CodFP codFP = Singleton.getInstance(CodFP.class);
		public static final MonedaPago monedaPago = Singleton.getInstance(MonedaPago.class);
		public static final Producto producto = Singleton.getInstance(Producto.class);
		public static final Oficina oficina = Singleton.getInstance(Oficina.class);
		public static final TipoCliente tipoCliente = Singleton.getInstance(TipoCliente.class);
		public static final CiNit ciNit = Singleton.getInstance(CiNit.class);
		public static final TipoCuentaAch tipoCuentaAch = Singleton.getInstance(TipoCuentaAch.class);
		public static final CodigoBancoAch codigoBancoAch = Singleton.getInstance(CodigoBancoAch.class);
		public static final BancoAch bancoAch = Singleton.getInstance(BancoAch.class);

		public static class FormaPago extends COBISDropDownList {
			public FormaPago() {
				this.init("VA_TEXTINPUTBOXJDY_632586","FormadePago");
			}
		}			

		public static class Beneficiario extends COBISInputValue {
			public Beneficiario() {
				this.init("VA_TEXTINPUTBOXVZH_620586","Beneficiario");
			}
		}			

		public static class Monto extends COBISInputValue {
			public Monto() {
				this.init("VA_TEXTINPUTBOXCOF_114586","Monto");
			}
		}			

		public static class Cuenta extends COBISInputValue {
			public Cuenta() {
				this.init("VA_TEXTINPUTBOXBGF_225586","Cuenta");
			}
		}			

		public static class PorcentajePago extends COBISInputValue {
			public PorcentajePago() {
				this.init("VA_TEXTINPUTBOXMHR_799586","Pago");
			}
		}			

		public static class Cliente extends COBISInputValue {
			public Cliente() {
				this.init("VA_TEXTINPUTBOXIKH_857586","Cliente");
			}
		}			

		public static class CodFP extends COBISInputValue {
			public CodFP() {
				this.init("VA_TEXTINPUTBOXULS_523586","CodFP");
			}
		}			

		public static class MonedaPago extends COBISInputValue {
			public MonedaPago() {
				this.init("VA_TEXTINPUTBOXFEG_724586","MonedaPago");
			}
		}			

		public static class Producto extends COBISInputValue {
			public Producto() {
				this.init("VA_TEXTINPUTBOXNKQ_910586","Producto");
			}
		}			

		public static class Oficina extends COBISInputValue {
			public Oficina() {
				this.init("VA_TEXTINPUTBOXTAF_357586","Oficina");
			}
		}			

		public static class TipoCliente extends COBISInputValue {
			public TipoCliente() {
				this.init("VA_TEXTINPUTBOXWHI_369586","TipoCliente");
			}
		}			

		public static class CiNit extends COBISInputValue {
			public CiNit() {
				this.init("VA_TEXTINPUTBOXTEA_459586","CINIT");
			}
		}			

		public static class TipoCuentaAch extends COBISInputValue {
			public TipoCuentaAch() {
				this.init("VA_TEXTINPUTBOXTBN_544586","TipoCtaACH");
			}
		}			

		public static class CodigoBancoAch extends COBISInputValue {
			public CodigoBancoAch() {
				this.init("VA_TEXTINPUTBOXORO_862586","CodBancoACH");
			}
		}			

		public static class BancoAch extends COBISInputValue {
			public BancoAch() {
				this.init("VA_TEXTINPUTBOXMLE_688586","BancoACH");
			}
		}			
	}
}
