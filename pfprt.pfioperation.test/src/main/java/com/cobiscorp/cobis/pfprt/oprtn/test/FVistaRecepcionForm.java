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

public class FVistaRecepcionForm{
	public static final FiltroBusquedaRecepcion filtroBusquedaRecepcion = Singleton.getInstance(FiltroBusquedaRecepcion.class);
	public static final ContextoPFI contextoPFI = Singleton.getInstance(ContextoPFI.class);

	public static final GridListaDetalleRecepcion gridListaDetalleRecepcion = Singleton.getInstance(GridListaDetalleRecepcion.class);
	private FVistaRecepcionForm() {
		throw new IllegalStateException("FVistaRecepcionForm is a utility class");
	}
	public static class Buttons {
		private Buttons() {
			throw new IllegalStateException("Buttons is a utility class");
		}
		public static final CmdCommand1IdCMTPFPRTXUP2T cmdCommand1IdCMTPFPRTXUP2T = Singleton.getInstance(CmdCommand1IdCMTPFPRTXUP2T.class);
		
		public static class CmdCommand1IdCMTPFPRTXUP2T extends COBISButton{
			public CmdCommand1IdCMTPFPRTXUP2T () {
				this.init("CM_TPFPRTXU_P2T", "Anterior");
			}
		}
	
		public static final CmdCommand2IdCMTPFPRTXUHPX cmdCommand2IdCMTPFPRTXUHPX = Singleton.getInstance(CmdCommand2IdCMTPFPRTXUHPX.class);
		
		public static class CmdCommand2IdCMTPFPRTXUHPX extends COBISButton{
			public CmdCommand2IdCMTPFPRTXUHPX () {
				this.init("CM_TPFPRTXU_HPX", "Siguiente");
			}
		}
	
		public static final CmdCommand3IdCMTPFPRTXU7OV cmdCommand3IdCMTPFPRTXU7OV = Singleton.getInstance(CmdCommand3IdCMTPFPRTXU7OV.class);
		
		public static class CmdCommand3IdCMTPFPRTXU7OV extends COBISButton{
			public CmdCommand3IdCMTPFPRTXU7OV () {
				this.init("CM_TPFPRTXU_7OV", "Guardar");
			}
		}
	

	}
	

	public static class FiltroBusquedaRecepcion {
	
		private FiltroBusquedaRecepcion() {
			throw new IllegalStateException("FVistaRecepcionForm is a utility class");
		}
		
		public static final NumeroOperacion numeroOperacion = Singleton.getInstance(NumeroOperacion.class);

		public static class NumeroOperacion extends COBISInputValue {
			public NumeroOperacion() {
				this.init("VA_NUMEROOPERACNNN_890921","NumeroOperacion");
			}
		}			
	}

	public static class ContextoPFI {
	
		private ContextoPFI() {
			throw new IllegalStateException("FVistaRecepcionForm is a utility class");
		}
		
		public static final MontoRecepcion montoRecepcion = Singleton.getInstance(MontoRecepcion.class);

		public static class MontoRecepcion extends COBISInputValue {
			public MontoRecepcion() {
				this.init("VA_MONTORECEPCIONN_767921","Totalarecibir");
			}
		}			
	}
	
	public static class GridListaDetalleRecepcion extends COBISGrid {
		public GridListaDetalleRecepcion() {
			this.init("QV_6933_39827", "QV_6933_39827");
		} 

		public static final IdOperacion idOperacion = Singleton.getInstance(IdOperacion.class);
		public static final Moneda moneda = Singleton.getInstance(Moneda.class);
		public static final FormaPago formaPago = Singleton.getInstance(FormaPago.class);
		public static final Monto monto = Singleton.getInstance(Monto.class);
		public static final CuentaReferencia cuentaReferencia = Singleton.getInstance(CuentaReferencia.class);
		public static final CodigoFormaPago codigoFormaPago = Singleton.getInstance(CodigoFormaPago.class);
		public static final CodigoProductoCobis codigoProductoCobis = Singleton.getInstance(CodigoProductoCobis.class);
		public static final NumeroOperacion numeroOperacion = Singleton.getInstance(NumeroOperacion.class);
		public static final Cliente cliente = Singleton.getInstance(Cliente.class);
		public static final Fecha fecha = Singleton.getInstance(Fecha.class);
		public static final Usuario usuario = Singleton.getInstance(Usuario.class);
		public static final IdSesion idSesion = Singleton.getInstance(IdSesion.class);
		public static final DiasTransito diasTransito = Singleton.getInstance(DiasTransito.class);
		public static final CodigoMoneda codigoMoneda = Singleton.getInstance(CodigoMoneda.class);
		public static final Secuencial secuencial = Singleton.getInstance(Secuencial.class);
		public static final Impuesto impuesto = Singleton.getInstance(Impuesto.class);
		public static final Cotizacion cotizacion = Singleton.getInstance(Cotizacion.class);
		public static final CodigoBanco codigoBanco = Singleton.getInstance(CodigoBanco.class);

		public static class IdOperacion extends COBISInputValue {
			public IdOperacion() {
				this.init("VA_TEXTINPUTBOXPAU_913921","IdOperacion");
			}
		}			

		public static class Moneda extends COBISInputValue {
			public Moneda() {
				this.init("VA_TEXTINPUTBOXXBN_426921","Moneda");
			}
		}			

		public static class FormaPago extends COBISInputValue {
			public FormaPago() {
				this.init("VA_TEXTINPUTBOXWTK_553921","FormadeRecepcion");
			}
		}			

		public static class Monto extends COBISInputValue {
			public Monto() {
				this.init("VA_TEXTINPUTBOXPHC_299921","Monto");
			}
		}			

		public static class CuentaReferencia extends COBISInputValue {
			public CuentaReferencia() {
				this.init("VA_TEXTINPUTBOXUQE_589921","Cuenta");
			}
		}			

		public static class CodigoFormaPago extends COBISInputValue {
			public CodigoFormaPago() {
				this.init("VA_TEXTINPUTBOXCLE_900921","CodigoFormaPago");
			}
		}			

		public static class CodigoProductoCobis extends COBISInputValue {
			public CodigoProductoCobis() {
				this.init("VA_TEXTINPUTBOXZHG_193921","CodigoProductoCobis");
			}
		}			

		public static class NumeroOperacion extends COBISInputValue {
			public NumeroOperacion() {
				this.init("VA_TEXTINPUTBOXHLB_667921","NumeroOperacion");
			}
		}			

		public static class Cliente extends COBISInputValue {
			public Cliente() {
				this.init("VA_TEXTINPUTBOXGVD_609921","Cliente");
			}
		}			

		public static class Fecha extends COBISDatePicker {
			public Fecha() {
				this.init("VA_DATEFIELDXOZAEZ_883921","Fecha");
			}
		}			

		public static class Usuario extends COBISInputValue {
			public Usuario() {
				this.init("VA_TEXTINPUTBOXBMB_198921","Usuario");
			}
		}			

		public static class IdSesion extends COBISInputValue {
			public IdSesion() {
				this.init("VA_TEXTINPUTBOXNLI_380921","IdSesion");
			}
		}			

		public static class DiasTransito extends COBISInputValue {
			public DiasTransito() {
				this.init("VA_TEXTINPUTBOXFUX_414921","DiasTransito");
			}
		}			

		public static class CodigoMoneda extends COBISInputValue {
			public CodigoMoneda() {
				this.init("VA_TEXTINPUTBOXEBI_832921","CodigoMoneda");
			}
		}			

		public static class Secuencial extends COBISInputValue {
			public Secuencial() {
				this.init("VA_TEXTINPUTBOXYDU_126921","Secuencial");
			}
		}			

		public static class Impuesto extends COBISInputValue {
			public Impuesto() {
				this.init("VA_TEXTINPUTBOXIKC_393921","Impuesto");
			}
		}			

		public static class Cotizacion extends COBISInputValue {
			public Cotizacion() {
				this.init("VA_TEXTINPUTBOXGWG_586921","Cotizacion");
			}
		}			

		public static class CodigoBanco extends COBISComboBox {
			public CodigoBanco() {
				this.init("VA_TEXTINPUTBOXWES_438921","Banco");
			}
		}			
	}
}
