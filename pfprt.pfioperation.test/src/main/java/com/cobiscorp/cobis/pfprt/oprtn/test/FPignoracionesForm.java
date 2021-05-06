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

public class FPignoracionesForm{
	public static final FiltroBusquedaPignoracion filtroBusquedaPignoracion = Singleton.getInstance(FiltroBusquedaPignoracion.class);

	public static final GridListaPignoraciones gridListaPignoraciones = Singleton.getInstance(GridListaPignoraciones.class);
	private FPignoracionesForm() {
		throw new IllegalStateException("FPignoracionesForm is a utility class");
	}
	public static class Buttons {
		private Buttons() {
			throw new IllegalStateException("Buttons is a utility class");
		}

	}
	

	public static class FiltroBusquedaPignoracion {
	
		private FiltroBusquedaPignoracion() {
			throw new IllegalStateException("FPignoracionesForm is a utility class");
		}
		
		public static final NumeroOperacion numeroOperacion = Singleton.getInstance(NumeroOperacion.class);

		public static class NumeroOperacion extends COBISInputValue {
			public NumeroOperacion() {
				this.init("VA_NUMEROOPERACINO_761778","NumerodeDeposito");
			}
		}			
	}
	
	public static class GridListaPignoraciones extends COBISGrid {
		public GridListaPignoraciones() {
			this.init("QV_1201_41343", "QV_1201_41343");
		} 

	public static class Buttons {
		private Buttons() {
			throw new IllegalStateException("Buttons Grid is a utility class");
		}


		public static final BtnVAGRIDROWCOMMMNNN943778IdVAGRIDROWCOMMMNNN943778 btnVAGRIDROWCOMMMNNN943778IdVAGRIDROWCOMMMNNN943778 = Singleton.getInstance(BtnVAGRIDROWCOMMMNNN943778IdVAGRIDROWCOMMMNNN943778.class);

		public static class BtnVAGRIDROWCOMMMNNN943778IdVAGRIDROWCOMMMNNN943778 extends COBISButton {
			public BtnVAGRIDROWCOMMMNNN943778IdVAGRIDROWCOMMMNNN943778() {
				this.init("VA_GRIDROWCOMMMNNN_943778","ImageButton943778");
			}
		}

	}
		public static final IdOperacion idOperacion = Singleton.getInstance(IdOperacion.class);
		public static final NumeroOperacion numeroOperacion = Singleton.getInstance(NumeroOperacion.class);
		public static final Secuencial secuencial = Singleton.getInstance(Secuencial.class);
		public static final Fecha fecha = Singleton.getInstance(Fecha.class);
		public static final CodigoMotivo codigoMotivo = Singleton.getInstance(CodigoMotivo.class);
		public static final CodigoProducto codigoProducto = Singleton.getInstance(CodigoProducto.class);
		public static final Producto producto = Singleton.getInstance(Producto.class);
		public static final Motivo motivo = Singleton.getInstance(Motivo.class);
		public static final CuentaReferencia cuentaReferencia = Singleton.getInstance(CuentaReferencia.class);
		public static final Observacion observacion = Singleton.getInstance(Observacion.class);
		public static final Monto monto = Singleton.getInstance(Monto.class);

		public static class IdOperacion extends COBISInputValue {
			public IdOperacion() {
				this.init("VA_TEXTINPUTBOXMRQ_385778","IdOperacion");
			}
		}			

		public static class NumeroOperacion extends COBISInputValue {
			public NumeroOperacion() {
				this.init("VA_TEXTINPUTBOXTXQ_138778","NumeroOperacion");
			}
		}			

		public static class Secuencial extends COBISInputValue {
			public Secuencial() {
				this.init("VA_TEXTINPUTBOXANV_478778","Secuencial");
			}
		}			

		public static class Fecha extends COBISDatePicker {
			public Fecha() {
				this.init("VA_DATEFIELDZMZUXW_131778","Fecha");
			}
		}			

		public static class CodigoMotivo extends COBISInputValue {
			public CodigoMotivo() {
				this.init("VA_TEXTINPUTBOXHST_873778","CodigoMotivo");
			}
		}			

		public static class CodigoProducto extends COBISInputValue {
			public CodigoProducto() {
				this.init("VA_TEXTINPUTBOXQOK_752778","CodigoProducto");
			}
		}			

		public static class Producto extends COBISDropDownList {
			public Producto() {
				this.init("VA_TEXTINPUTBOXLUB_302778","Producto");
			}
		}			

		public static class Motivo extends COBISInputTextButton {
			public Motivo() {
				this.init("VA_TEXTINPUTBOXQAI_599778","Motivo");
			}
		}			

		public static class CuentaReferencia extends COBISInputValue {
			public CuentaReferencia() {
				this.init("VA_TEXTINPUTBOXSDW_668778","Referencia");
			}
		}			

		public static class Observacion extends COBISInputValue {
			public Observacion() {
				this.init("VA_TEXTINPUTBOXXKJ_315778","Observacion");
			}
		}			

		public static class Monto extends COBISInputValue {
			public Monto() {
				this.init("VA_TEXTINPUTBOXGNJ_641778","Monto");
			}
		}			
	}
}
