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

public class FBloqueosForm{
	public static final FiltroBusquedaBloqueo filtroBusquedaBloqueo = Singleton.getInstance(FiltroBusquedaBloqueo.class);

	public static final GridListaBloqueos gridListaBloqueos = Singleton.getInstance(GridListaBloqueos.class);
	private FBloqueosForm() {
		throw new IllegalStateException("FBloqueosForm is a utility class");
	}
	public static class Buttons {
		private Buttons() {
			throw new IllegalStateException("Buttons is a utility class");
		}

	}
	

	public static class FiltroBusquedaBloqueo {
	
		private FiltroBusquedaBloqueo() {
			throw new IllegalStateException("FBloqueosForm is a utility class");
		}
		
		public static final NumeroOperacion numeroOperacion = Singleton.getInstance(NumeroOperacion.class);

		public static class NumeroOperacion extends COBISInputValue {
			public NumeroOperacion() {
				this.init("VA_NUMEROOPERACNIO_399195","NumerodeDeposito");
			}
		}			
	}
	
	public static class GridListaBloqueos extends COBISGrid {
		public GridListaBloqueos() {
			this.init("QV_3871_47610", "QV_3871_47610");
		} 

		public static final IdOperacion idOperacion = Singleton.getInstance(IdOperacion.class);
		public static final NumeroOperacion numeroOperacion = Singleton.getInstance(NumeroOperacion.class);
		public static final Secuencial secuencial = Singleton.getInstance(Secuencial.class);
		public static final Fecha fecha = Singleton.getInstance(Fecha.class);
		public static final CodigoMotivo codigoMotivo = Singleton.getInstance(CodigoMotivo.class);
		public static final Motivo motivo = Singleton.getInstance(Motivo.class);
		public static final Observacion observacion = Singleton.getInstance(Observacion.class);
		public static final Monto monto = Singleton.getInstance(Monto.class);

		public static class IdOperacion extends COBISInputValue {
			public IdOperacion() {
				this.init("VA_TEXTINPUTBOXBFG_919195","IdOperacion");
			}
		}			

		public static class NumeroOperacion extends COBISInputValue {
			public NumeroOperacion() {
				this.init("VA_TEXTINPUTBOXWGY_498195","NumeroOperacion");
			}
		}			

		public static class Secuencial extends COBISInputValue {
			public Secuencial() {
				this.init("VA_TEXTINPUTBOXODV_525195","Secuencial");
			}
		}			

		public static class Fecha extends COBISDatePicker {
			public Fecha() {
				this.init("VA_DATEFIELDRQINUS_178195","Fecha");
			}
		}			

		public static class CodigoMotivo extends COBISInputValue {
			public CodigoMotivo() {
				this.init("VA_TEXTINPUTBOXSFX_496195","CodigoMotivo");
			}
		}			

		public static class Motivo extends COBISInputTextButton {
			public Motivo() {
				this.init("VA_TEXTINPUTBOXJSW_255195","Motivo");
			}
		}			

		public static class Observacion extends COBISInputValue {
			public Observacion() {
				this.init("VA_TEXTINPUTBOXTXT_318195","Observacion");
			}
		}			

		public static class Monto extends COBISInputValue {
			public Monto() {
				this.init("VA_TEXTINPUTBOXLIU_406195","Monto");
			}
		}			
	}
}
