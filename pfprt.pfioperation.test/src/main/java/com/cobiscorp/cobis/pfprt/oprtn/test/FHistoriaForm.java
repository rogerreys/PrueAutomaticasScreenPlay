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

public class FHistoriaForm{

	public static final GridHistoria gridHistoria = Singleton.getInstance(GridHistoria.class);
	private FHistoriaForm() {
		throw new IllegalStateException("FHistoriaForm is a utility class");
	}
	
	public static class GridHistoria extends COBISGrid {
		public GridHistoria() {
			this.init("QV_8958_10289", "QV_8958_10289");
		} 

		public static final Secuencial secuencial = Singleton.getInstance(Secuencial.class);
		public static final Fecha fecha = Singleton.getInstance(Fecha.class);
		public static final CodigoTransaccion codigoTransaccion = Singleton.getInstance(CodigoTransaccion.class);
		public static final Transaccion transaccion = Singleton.getInstance(Transaccion.class);
		public static final Monto monto = Singleton.getInstance(Monto.class);
		public static final Observacion observacion = Singleton.getInstance(Observacion.class);
		public static final Usuario usuario = Singleton.getInstance(Usuario.class);
		public static final Tasa tasa = Singleton.getInstance(Tasa.class);
		public static final SecCuota secCuota = Singleton.getInstance(SecCuota.class);
		public static final IdOperacion idOperacion = Singleton.getInstance(IdOperacion.class);
		public static final NumeroOperacion numeroOperacion = Singleton.getInstance(NumeroOperacion.class);

		public static class Secuencial extends COBISInputValue {
			public Secuencial() {
				this.init("VA_TEXTINPUTBOXULA_397659","Secuencial");
			}
		}			

		public static class Fecha extends COBISInputValue {
			public Fecha() {
				this.init("VA_TEXTINPUTBOXGWS_699659","Fecha");
			}
		}			

		public static class CodigoTransaccion extends COBISInputValue {
			public CodigoTransaccion() {
				this.init("VA_TEXTINPUTBOXSPF_466659","Transaccion");
			}
		}			

		public static class Transaccion extends COBISInputValue {
			public Transaccion() {
				this.init("VA_TEXTINPUTBOXLBA_505659","Descripcion");
			}
		}			

		public static class Monto extends COBISInputValue {
			public Monto() {
				this.init("VA_TEXTINPUTBOXVVE_983659","Monto");
			}
		}			

		public static class Observacion extends COBISInputValue {
			public Observacion() {
				this.init("VA_TEXTINPUTBOXROF_739659","Observacion");
			}
		}			

		public static class Usuario extends COBISInputValue {
			public Usuario() {
				this.init("VA_TEXTINPUTBOXTBO_952659","Usuario");
			}
		}			

		public static class Tasa extends COBISInputValue {
			public Tasa() {
				this.init("VA_TEXTINPUTBOXXFR_575659","Tasa");
			}
		}			

		public static class SecCuota extends COBISInputValue {
			public SecCuota() {
				this.init("VA_TEXTINPUTBOXKCM_454659","Cuota");
			}
		}			

		public static class IdOperacion extends COBISInputValue {
			public IdOperacion() {
				this.init("VA_TEXTINPUTBOXZMC_992659","IdOperacion");
			}
		}			

		public static class NumeroOperacion extends COBISInputValue {
			public NumeroOperacion() {
				this.init("VA_TEXTINPUTBOXTFC_725659","NumeroOperacion");
			}
		}			
	}
}
