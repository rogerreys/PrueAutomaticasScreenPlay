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

public class FAutorizacionesForm{
	public static final DetalleOperacion detalleOperacion = Singleton.getInstance(DetalleOperacion.class);
	public static final FiltroBusquedaAutorizacion filtroBusquedaAutorizacion = Singleton.getInstance(FiltroBusquedaAutorizacion.class);

	public static final GridDetalleAutorizacion gridDetalleAutorizacion = Singleton.getInstance(GridDetalleAutorizacion.class);
	private FAutorizacionesForm() {
		throw new IllegalStateException("FAutorizacionesForm is a utility class");
	}
	public static class Buttons {
		private Buttons() {
			throw new IllegalStateException("Buttons is a utility class");
		}
		public static final CmdCommand1IdCMTPFPRTNLP71 cmdCommand1IdCMTPFPRTNLP71 = Singleton.getInstance(CmdCommand1IdCMTPFPRTNLP71.class);
		
		public static class CmdCommand1IdCMTPFPRTNLP71 extends COBISButton{
			public CmdCommand1IdCMTPFPRTNLP71 () {
				this.init("CM_TPFPRTNL_P71", "Buscar");
			}
		}
	

	}
	

	public static class DetalleOperacion {
	
		private DetalleOperacion() {
			throw new IllegalStateException("FAutorizacionesForm is a utility class");
		}
		
		public static final NumeroOperacion numeroOperacion = Singleton.getInstance(NumeroOperacion.class);

		public static class NumeroOperacion extends COBISInputValue {
			public NumeroOperacion() {
				this.init("VA_NUMEROOPERACINO_506283","NodeDPF");
			}
		}			
	}

	public static class FiltroBusquedaAutorizacion {
	
		private FiltroBusquedaAutorizacion() {
			throw new IllegalStateException("FAutorizacionesForm is a utility class");
		}
		
		public static final Tipo tipo = Singleton.getInstance(Tipo.class);

		public static class Tipo extends COBISComboBox {
			public Tipo() {
				this.init("VA_TIPOLRIBSFRHCHZ_230283","Tipoautorizacion");
			}
		}			
	}
	
	public static class GridDetalleAutorizacion extends COBISGrid {
		public GridDetalleAutorizacion() {
			this.init("QV_BM19_FAQ27", "QV_BM19_FAQ27");
		} 

		public static final NumeroOperacion numeroOperacion = Singleton.getInstance(NumeroOperacion.class);
		public static final Operador operador = Singleton.getInstance(Operador.class);
		public static final Spread spread = Singleton.getInstance(Spread.class);
		public static final Fecha fecha = Singleton.getInstance(Fecha.class);
		public static final Utilizado utilizado = Singleton.getInstance(Utilizado.class);
		public static final Usuario usuario = Singleton.getInstance(Usuario.class);
		public static final Tasa tasa = Singleton.getInstance(Tasa.class);
		public static final Tipo tipo = Singleton.getInstance(Tipo.class);
		public static final DescripcionTipo descripcionTipo = Singleton.getInstance(DescripcionTipo.class);
		public static final Secuencial secuencial = Singleton.getInstance(Secuencial.class);
		public static final NuevoValorAnti nuevoValorAnti = Singleton.getInstance(NuevoValorAnti.class);
		public static final Estado estado = Singleton.getInstance(Estado.class);
		public static final IdOperacion idOperacion = Singleton.getInstance(IdOperacion.class);

		public static class NumeroOperacion extends COBISInputValue {
			public NumeroOperacion() {
				this.init("VA_TEXTINPUTBOXBUK_984283","NodeDPF");
			}
		}			

		public static class Operador extends COBISComboBox {
			public Operador() {
				this.init("VA_COMBOBOXVMUVIIZ_719283","Operador");
			}
		}			

		public static class Spread extends COBISInputValue {
			public Spread() {
				this.init("VA_TEXTINPUTBOXCQJ_987283","Spread");
			}
		}			

		public static class Fecha extends COBISDatePicker {
			public Fecha() {
				this.init("VA_DATEFIELDENSGTY_513283","FechaIngreso");
			}
		}			

		public static class Utilizado extends COBISInputValue {
			public Utilizado() {
				this.init("VA_TEXTINPUTBOXTER_254283","Utilizado");
			}
		}			

		public static class Usuario extends COBISInputValue {
			public Usuario() {
				this.init("VA_TEXTINPUTBOXJXY_519283","Usuario");
			}
		}			

		public static class Tasa extends COBISInputValue {
			public Tasa() {
				this.init("VA_TEXTINPUTBOXBFQ_648283","Tasa");
			}
		}			

		public static class Tipo extends COBISInputValue {
			public Tipo() {
				this.init("VA_COMBOBOXFSKSIEU_730283","Tipo");
			}
		}			

		public static class DescripcionTipo extends COBISInputValue {
			public DescripcionTipo() {
				this.init("VA_TEXTINPUTBOXTKK_283283","Descripciontipo");
			}
		}			

		public static class Secuencial extends COBISInputValue {
			public Secuencial() {
				this.init("VA_TEXTINPUTBOXPXC_108283","Secuencial");
			}
		}			

		public static class NuevoValorAnti extends COBISInputValue {
			public NuevoValorAnti() {
				this.init("VA_TEXTINPUTBOXAXT_898283","NuevoValorAnti");
			}
		}			

		public static class Estado extends COBISInputValue {
			public Estado() {
				this.init("VA_TEXTINPUTBOXNNJ_642283","Estado");
			}
		}			

		public static class IdOperacion extends COBISInputValue {
			public IdOperacion() {
				this.init("VA_TEXTINPUTBOXPUB_691283","IdOperacion");
			}
		}			
	}
}
