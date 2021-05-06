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

public class FMovimientosForm{

	public static final GridListaMovimientos gridListaMovimientos = Singleton.getInstance(GridListaMovimientos.class);
	private FMovimientosForm() {
		throw new IllegalStateException("FMovimientosForm is a utility class");
	}
	
	public static class GridListaMovimientos extends COBISGrid {
		public GridListaMovimientos() {
			this.init("QV_2804_58025", "QV_2804_58025");
		} 

		public static final Fecha fecha = Singleton.getInstance(Fecha.class);
		public static final Transaccion transaccion = Singleton.getInstance(Transaccion.class);
		public static final FormaPago formaPago = Singleton.getInstance(FormaPago.class);
		public static final Moneda moneda = Singleton.getInstance(Moneda.class);
		public static final Monto monto = Singleton.getInstance(Monto.class);
		public static final MontoMonedaLocal montoMonedaLocal = Singleton.getInstance(MontoMonedaLocal.class);
		public static final Estado estado = Singleton.getInstance(Estado.class);
		public static final Secuencial secuencial = Singleton.getInstance(Secuencial.class);
		public static final CuentaReferencia cuentaReferencia = Singleton.getInstance(CuentaReferencia.class);
		public static final Beneficiario beneficiario = Singleton.getInstance(Beneficiario.class);
		public static final FechaActivacion fechaActivacion = Singleton.getInstance(FechaActivacion.class);
		public static final Impuesto impuesto = Singleton.getInstance(Impuesto.class);
		public static final Cotizacion cotizacion = Singleton.getInstance(Cotizacion.class);
		public static final Alterno alterno = Singleton.getInstance(Alterno.class);

		public static class Fecha extends COBISDatePicker {
			public Fecha() {
				this.init("VA_DATEFIELDNOPQTJ_262702","Fecha");
			}
		}			

		public static class Transaccion extends COBISInputValue {
			public Transaccion() {
				this.init("VA_TEXTINPUTBOXGTN_483702","Transaccion");
			}
		}			

		public static class FormaPago extends COBISInputValue {
			public FormaPago() {
				this.init("VA_TEXTINPUTBOXRZS_299702","FormadePago");
			}
		}			

		public static class Moneda extends COBISInputValue {
			public Moneda() {
				this.init("VA_TEXTINPUTBOXEOQ_167702","Moneda");
			}
		}			

		public static class Monto extends COBISInputValue {
			public Monto() {
				this.init("VA_TEXTINPUTBOXULV_172702","Monto");
			}
		}			

		public static class MontoMonedaLocal extends COBISInputValue {
			public MontoMonedaLocal() {
				this.init("VA_TEXTINPUTBOXAVM_862702","MontoMonedaLocal");
			}
		}			

		public static class Estado extends COBISInputValue {
			public Estado() {
				this.init("VA_TEXTINPUTBOXNIH_285702","Estado");
			}
		}			

		public static class Secuencial extends COBISInputValue {
			public Secuencial() {
				this.init("VA_TEXTINPUTBOXJVC_761702","Secuencial");
			}
		}			

		public static class CuentaReferencia extends COBISInputValue {
			public CuentaReferencia() {
				this.init("VA_TEXTINPUTBOXHUR_519702","CuentaReferencia");
			}
		}			

		public static class Beneficiario extends COBISInputValue {
			public Beneficiario() {
				this.init("VA_TEXTINPUTBOXENR_763702","Beneficiario");
			}
		}			

		public static class FechaActivacion extends COBISDatePicker {
			public FechaActivacion() {
				this.init("VA_DATEFIELDUXEXWV_753702","FechaActivacion");
			}
		}			

		public static class Impuesto extends COBISInputValue {
			public Impuesto() {
				this.init("VA_TEXTINPUTBOXJNW_119702","Impuesto");
			}
		}			

		public static class Cotizacion extends COBISInputValue {
			public Cotizacion() {
				this.init("VA_TEXTINPUTBOXGMH_999702","Cotizacion");
			}
		}			

		public static class Alterno extends COBISInputValue {
			public Alterno() {
				this.init("VA_TEXTINPUTBOXRMV_992702","Alterno");
			}
		}			
	}
}
