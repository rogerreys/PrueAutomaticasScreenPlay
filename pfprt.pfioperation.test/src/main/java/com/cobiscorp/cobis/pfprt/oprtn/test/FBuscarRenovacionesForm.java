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

public class FBuscarRenovacionesForm{

	public static final GridListaRenovaciones gridListaRenovaciones = Singleton.getInstance(GridListaRenovaciones.class);
	private FBuscarRenovacionesForm() {
		throw new IllegalStateException("FBuscarRenovacionesForm is a utility class");
	}
	
	public static class GridListaRenovaciones extends COBISGrid {
		public GridListaRenovaciones() {
			this.init("QV_4799_62086", "QV_4799_62086");
		} 

		public static final Operacion operacion = Singleton.getInstance(Operacion.class);
		public static final Monto monto = Singleton.getInstance(Monto.class);
		public static final FechaEmision fechaEmision = Singleton.getInstance(FechaEmision.class);
		public static final FechaVencimiento fechaVencimiento = Singleton.getInstance(FechaVencimiento.class);
		public static final Tasa tasa = Singleton.getInstance(Tasa.class);
		public static final TotalInteresPagado totalInteresPagado = Singleton.getInstance(TotalInteresPagado.class);
		public static final Contador contador = Singleton.getInstance(Contador.class);

		public static class Operacion extends COBISInputValue {
			public Operacion() {
				this.init("VA_TEXTINPUTBOXHFL_522693","Operacion");
			}
		}			

		public static class Monto extends COBISInputValue {
			public Monto() {
				this.init("VA_TEXTINPUTBOXYKP_741693","Monto");
			}
		}			

		public static class FechaEmision extends COBISDatePicker {
			public FechaEmision() {
				this.init("VA_DATEFIELDGIJXGB_797693","FechadeEmision");
			}
		}			

		public static class FechaVencimiento extends COBISDatePicker {
			public FechaVencimiento() {
				this.init("VA_DATEFIELDPQGBDX_932693","FechadeVencimiento");
			}
		}			

		public static class Tasa extends COBISInputValue {
			public Tasa() {
				this.init("VA_TEXTINPUTBOXXCU_291693","Tasa");
			}
		}			

		public static class TotalInteresPagado extends COBISInputValue {
			public TotalInteresPagado() {
				this.init("VA_TEXTINPUTBOXJKT_850693","TotaldeInteresPagados");
			}
		}			

		public static class Contador extends COBISInputValue {
			public Contador() {
				this.init("VA_TEXTINPUTBOXJYK_404693","Contador");
			}
		}			
	}
}
