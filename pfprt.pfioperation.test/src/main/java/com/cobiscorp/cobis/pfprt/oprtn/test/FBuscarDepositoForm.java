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

public class FBuscarDepositoForm{
	public static final FiltroBusquedaDeposito filtroBusquedaDeposito = Singleton.getInstance(FiltroBusquedaDeposito.class);

	public static final GridListaOperaciones gridListaOperaciones = Singleton.getInstance(GridListaOperaciones.class);
	private FBuscarDepositoForm() {
		throw new IllegalStateException("FBuscarDepositoForm is a utility class");
	}
	public static class Layouts {
		private Layouts() {
			throw new IllegalStateException("Layouts is a utility class");
		}
		public static final LytGroup1824IdGFBUSCAREEI853956 lytGroup1824IdGFBUSCAREEI853956 = Singleton.getInstance(LytGroup1824IdGFBUSCAREEI853956.class);
		
		public static class LytGroup1824IdGFBUSCAREEI853956 extends COBISCollapsable {
			public LytGroup1824IdGFBUSCAREEI853956(){
				this.init("G_FBUSCAREEI_853956", "Criterios de Búsqueda");
			}
		}
		
		public static final LytGroup1501IdGFBUSCAROSS809956 lytGroup1501IdGFBUSCAROSS809956 = Singleton.getInstance(LytGroup1501IdGFBUSCAROSS809956.class);
		
		public static class LytGroup1501IdGFBUSCAROSS809956 extends COBISCollapsable {
			public LytGroup1501IdGFBUSCAROSS809956(){
				this.init("G_FBUSCAROSS_809956", "Operaciones");
			}
		}
		
	}
	
	public static class Buttons {
		private Buttons() {
			throw new IllegalStateException("Buttons is a utility class");
		}
		public static final BtnVAVAIMAGEBUTTONNN408956IdVAVAIMAGEBUTTONNN408956 btnVAVAIMAGEBUTTONNN408956IdVAVAIMAGEBUTTONNN408956 = Singleton.getInstance(BtnVAVAIMAGEBUTTONNN408956IdVAVAIMAGEBUTTONNN408956.class);
		
		public static class BtnVAVAIMAGEBUTTONNN408956IdVAVAIMAGEBUTTONNN408956 extends COBISButton{
			public BtnVAVAIMAGEBUTTONNN408956IdVAVAIMAGEBUTTONNN408956 () {
				this.init("VA_VAIMAGEBUTTONNN_408956", "ImageButton408956");
			}
		}
	

	}
	

	public static class FiltroBusquedaDeposito {
	
		private FiltroBusquedaDeposito() {
			throw new IllegalStateException("FBuscarDepositoForm is a utility class");
		}
		
		public static final Criterio criterio = Singleton.getInstance(Criterio.class);
		public static final ValorCriterio valorCriterio = Singleton.getInstance(ValorCriterio.class);

		public static class Criterio extends COBISDropDownList {
			public Criterio() {
				this.init("VA_CRITERIOFREKDUJ_411956","Buscarpor");
			}
		}			

		public static class ValorCriterio extends COBISInputValue {
			public ValorCriterio() {
				this.init("VA_VALORCRITERIOOO_759956","ValorCriterio");
			}
		}			
	}
	
	public static class GridListaOperaciones extends COBISGrid {
		public GridListaOperaciones() {
			this.init("QV_3805_34011", "QV_3805_34011");
		} 

		public static final NumeroOperacion numeroOperacion = Singleton.getInstance(NumeroOperacion.class);
		public static final Descripcion descripcion = Singleton.getInstance(Descripcion.class);
		public static final Estado estado = Singleton.getInstance(Estado.class);

		public static class NumeroOperacion extends COBISInputValue {
			public NumeroOperacion() {
				this.init("VA_TEXTINPUTBOXXPQ_251956","NumeroOperacion");
			}
		}			

		public static class Descripcion extends COBISInputValue {
			public Descripcion() {
				this.init("VA_TEXTINPUTBOXRXL_909956","Descripcion");
			}
		}			

		public static class Estado extends COBISInputValue {
			public Estado() {
				this.init("VA_TEXTINPUTBOXJDA_264956","Estado");
			}
		}			
	}
}
