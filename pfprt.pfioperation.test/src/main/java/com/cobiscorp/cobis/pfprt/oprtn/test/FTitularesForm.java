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

public class FTitularesForm{
	public static final FiltroBusquedaTitular filtroBusquedaTitular = Singleton.getInstance(FiltroBusquedaTitular.class);

	public static final GridListaTitulares gridListaTitulares = Singleton.getInstance(GridListaTitulares.class);
	private FTitularesForm() {
		throw new IllegalStateException("FTitularesForm is a utility class");
	}
	public static class Buttons {
		private Buttons() {
			throw new IllegalStateException("Buttons is a utility class");
		}

	}
	

	public static class FiltroBusquedaTitular {
	
		private FiltroBusquedaTitular() {
			throw new IllegalStateException("FTitularesForm is a utility class");
		}
		
		public static final Condicion condicion = Singleton.getInstance(Condicion.class);
		public static final NumeroOperacion numeroOperacion = Singleton.getInstance(NumeroOperacion.class);

		public static class Condicion extends COBISDropDownList {
			public Condicion() {
				this.init("VA_9493EMREWQEQIQW_409581","Tipodecuenta");
			}
		}			

		public static class NumeroOperacion extends COBISInputValue {
			public NumeroOperacion() {
				this.init("VA_1183CXMTNKPVPFM_999581","NumeroOperacion");
			}
		}			
	}
	
	public static class GridListaTitulares extends COBISGrid {
		public GridListaTitulares() {
			this.init("QV_3754_56204", "QV_3754_56204");
		} 

		public static final Rol rol = Singleton.getInstance(Rol.class);
		public static final IdOperacion idOperacion = Singleton.getInstance(IdOperacion.class);
		public static final Cliente cliente = Singleton.getInstance(Cliente.class);
		public static final Nombre nombre = Singleton.getInstance(Nombre.class);
		public static final DocId docId = Singleton.getInstance(DocId.class);
		public static final Condicion condicion = Singleton.getInstance(Condicion.class);
		public static final TipoDocId tipoDocId = Singleton.getInstance(TipoDocId.class);

		public static class Rol extends COBISDropDownList {
			public Rol() {
				this.init("VA_TEXTINPUTBOXLAD_326581","Rol");
			}
		}			

		public static class IdOperacion extends COBISInputValue {
			public IdOperacion() {
				this.init("VA_TEXTINPUTBOXMZR_183581","IdOperacion");
			}
		}			

		public static class Cliente extends COBISInputTextButton {
			public Cliente() {
				this.init("VA_TEXTINPUTBOXBUK_601581","Cliente");
			}
		}			

		public static class Nombre extends COBISInputValue {
			public Nombre() {
				this.init("VA_TEXTINPUTBOXNNJ_399581","Nombre");
			}
		}			

		public static class DocId extends COBISInputValue {
			public DocId() {
				this.init("VA_TEXTINPUTBOXZZG_520581","Identificacion");
			}
		}			

		public static class Condicion extends COBISInputValue {
			public Condicion() {
				this.init("VA_TEXTINPUTBOXCJX_978581","Condicion");
			}
		}			

		public static class TipoDocId extends COBISInputValue {
			public TipoDocId() {
				this.init("VA_TEXTINPUTBOXLCZ_142581","Tipo");
			}
		}			
	}
}
