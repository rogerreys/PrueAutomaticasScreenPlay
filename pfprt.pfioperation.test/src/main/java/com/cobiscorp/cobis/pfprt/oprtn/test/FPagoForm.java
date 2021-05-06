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

public class FPagoForm{
	public static final FiltroBusquedaPago filtroBusquedaPago = Singleton.getInstance(FiltroBusquedaPago.class);
	public static final ContextoPFI contextoPFI = Singleton.getInstance(ContextoPFI.class);

	public static final GridListaDetallePagos gridListaDetallePagos = Singleton.getInstance(GridListaDetallePagos.class);
	private FPagoForm() {
		throw new IllegalStateException("FPagoForm is a utility class");
	}
	public static class Buttons {
		private Buttons() {
			throw new IllegalStateException("Buttons is a utility class");
		}

	}
	

	public static class FiltroBusquedaPago {
	
		private FiltroBusquedaPago() {
			throw new IllegalStateException("FPagoForm is a utility class");
		}
		
		public static final IdOperacion idOperacion = Singleton.getInstance(IdOperacion.class);

		public static class IdOperacion extends COBISInputValue {
			public IdOperacion() {
				this.init("VA_6629NFLFHHABCPD_113559","IdOperacion");
			}
		}			
	}

	public static class ContextoPFI {
	
		private ContextoPFI() {
			throw new IllegalStateException("FPagoForm is a utility class");
		}
		
		public static final MontoPago montoPago = Singleton.getInstance(MontoPago.class);

		public static class MontoPago extends COBISInputValue {
			public MontoPago() {
				this.init("VA_MONTOPIGNORADDD_908559","Totalapagar");
			}
		}			
	}
	
	public static class GridListaDetallePagos extends COBISGrid {
		public GridListaDetallePagos() {
			this.init("QV_3793_41782", "QV_3793_41782");
		} 

		public static final IdOperacion idOperacion = Singleton.getInstance(IdOperacion.class);
		public static final FormaPago formaPago = Singleton.getInstance(FormaPago.class);
		public static final Nombre nombre = Singleton.getInstance(Nombre.class);
		public static final NumeroOperacion numeroOperacion = Singleton.getInstance(NumeroOperacion.class);
		public static final Monto monto = Singleton.getInstance(Monto.class);
		public static final Secuencial secuencial = Singleton.getInstance(Secuencial.class);
		public static final CuentaReferencia cuentaReferencia = Singleton.getInstance(CuentaReferencia.class);
		public static final CodigoFormaPago codigoFormaPago = Singleton.getInstance(CodigoFormaPago.class);
		public static final Porcentaje porcentaje = Singleton.getInstance(Porcentaje.class);
		public static final Cliente cliente = Singleton.getInstance(Cliente.class);
		public static final Usuario usuario = Singleton.getInstance(Usuario.class);
		public static final CodigoOficina codigoOficina = Singleton.getInstance(CodigoOficina.class);
		public static final IdSesion idSesion = Singleton.getInstance(IdSesion.class);
		public static final TipoCliente tipoCliente = Singleton.getInstance(TipoCliente.class);
		public static final TipoCuentaAch tipoCuentaAch = Singleton.getInstance(TipoCuentaAch.class);
		public static final CodigoBancoAch codigoBancoAch = Singleton.getInstance(CodigoBancoAch.class);
		public static final Descripcion descripcion = Singleton.getInstance(Descripcion.class);
		public static final CodigoMoneda codigoMoneda = Singleton.getInstance(CodigoMoneda.class);
		public static final CodigoBanco codigoBanco = Singleton.getInstance(CodigoBanco.class);

		public static class IdOperacion extends COBISInputValue {
			public IdOperacion() {
				this.init("VA_TEXTINPUTBOXEXE_885559","IdOperacion");
			}
		}			

		public static class FormaPago extends COBISInputValue {
			public FormaPago() {
				this.init("VA_TEXTINPUTBOXRBL_720559","FormadePago");
			}
		}			

		public static class Nombre extends COBISInputValue {
			public Nombre() {
				this.init("VA_TEXTINPUTBOXQHA_123559","Beneficiario");
			}
		}			

		public static class NumeroOperacion extends COBISInputValue {
			public NumeroOperacion() {
				this.init("VA_TEXTINPUTBOXYQA_386559","NumeroOperacion");
			}
		}			

		public static class Monto extends COBISInputValue {
			public Monto() {
				this.init("VA_TEXTINPUTBOXAJD_294559","Monto");
			}
		}			

		public static class Secuencial extends COBISInputValue {
			public Secuencial() {
				this.init("VA_TEXTINPUTBOXTSS_333559","Secuencial");
			}
		}			

		public static class CuentaReferencia extends COBISInputValue {
			public CuentaReferencia() {
				this.init("VA_TEXTINPUTBOXRDH_790559","Cuenta");
			}
		}			

		public static class CodigoFormaPago extends COBISInputValue {
			public CodigoFormaPago() {
				this.init("VA_TEXTINPUTBOXUEQ_469559","CodigoFormaPago");
			}
		}			

		public static class Porcentaje extends COBISInputValue {
			public Porcentaje() {
				this.init("VA_TEXTINPUTBOXYQF_148559","Porcentaje");
			}
		}			

		public static class Cliente extends COBISInputValue {
			public Cliente() {
				this.init("VA_TEXTINPUTBOXYQI_113559","Cliente");
			}
		}			

		public static class Usuario extends COBISInputValue {
			public Usuario() {
				this.init("VA_TEXTINPUTBOXLFY_132559","Usuario");
			}
		}			

		public static class CodigoOficina extends COBISInputValue {
			public CodigoOficina() {
				this.init("VA_TEXTINPUTBOXOVB_212559","CodigoOficina");
			}
		}			

		public static class IdSesion extends COBISInputValue {
			public IdSesion() {
				this.init("VA_TEXTINPUTBOXSFU_391559","IdSesion");
			}
		}			

		public static class TipoCliente extends COBISInputValue {
			public TipoCliente() {
				this.init("VA_TEXTINPUTBOXAKC_931559","TipoCliente");
			}
		}			

		public static class TipoCuentaAch extends COBISInputValue {
			public TipoCuentaAch() {
				this.init("VA_TEXTINPUTBOXZNX_306559","TipoCuentaAch");
			}
		}			

		public static class CodigoBancoAch extends COBISInputValue {
			public CodigoBancoAch() {
				this.init("VA_TEXTINPUTBOXSLZ_995559","CodigoBancoAch");
			}
		}			

		public static class Descripcion extends COBISInputValue {
			public Descripcion() {
				this.init("VA_TEXTINPUTBOXHZN_598559","Descripcion");
			}
		}			

		public static class CodigoMoneda extends COBISInputValue {
			public CodigoMoneda() {
				this.init("VA_TEXTINPUTBOXOQK_487559","Moneda");
			}
		}			

		public static class CodigoBanco extends COBISComboBox {
			public CodigoBanco() {
				this.init("VA_TEXTINPUTBOXJQG_770559","Banco");
			}
		}			
	}
}
