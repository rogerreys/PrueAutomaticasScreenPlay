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

public class FCatalogoForm{
	public static final FiltroBusquedaCatalogo filtroBusquedaCatalogo = Singleton.getInstance(FiltroBusquedaCatalogo.class);

	public static final GridListaCatalogos gridListaCatalogos = Singleton.getInstance(GridListaCatalogos.class);
	private FCatalogoForm() {
		throw new IllegalStateException("FCatalogoForm is a utility class");
	}
	public static class Buttons {
		private Buttons() {
			throw new IllegalStateException("Buttons is a utility class");
		}

	}
	

	public static class FiltroBusquedaCatalogo {
	
		private FiltroBusquedaCatalogo() {
			throw new IllegalStateException("FCatalogoForm is a utility class");
		}
		
	}
	
	public static class GridListaCatalogos extends COBISGrid {
		public GridListaCatalogos() {
			this.init("QV_7893_50300", "QV_7893_50300");
		} 

		public static final CodigoTabla codigoTabla = Singleton.getInstance(CodigoTabla.class);
		public static final Tabla tabla = Singleton.getInstance(Tabla.class);
		public static final Codigo codigo = Singleton.getInstance(Codigo.class);
		public static final Valor valor = Singleton.getInstance(Valor.class);
		public static final Estado estado = Singleton.getInstance(Estado.class);

		public static class CodigoTabla extends COBISInputValue {
			public CodigoTabla() {
				this.init("VA_TEXTINPUTBOXEUM_496697","CodigoTabla");
			}
		}			

		public static class Tabla extends COBISInputValue {
			public Tabla() {
				this.init("VA_TEXTINPUTBOXGJA_442697","Tabla");
			}
		}			

		public static class Codigo extends COBISInputValue {
			public Codigo() {
				this.init("VA_TEXTINPUTBOXKQA_234697","Codigo");
			}
		}			

		public static class Valor extends COBISInputValue {
			public Valor() {
				this.init("VA_TEXTINPUTBOXKJZ_841697","Valor");
			}
		}			

		public static class Estado extends COBISInputValue {
			public Estado() {
				this.init("VA_TEXTINPUTBOXRIZ_380697","Estado");
			}
		}			
	}
}
