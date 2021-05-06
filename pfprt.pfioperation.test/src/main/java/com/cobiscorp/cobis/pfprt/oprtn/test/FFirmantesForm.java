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

public class FFirmantesForm{
	public static final FiltroBusquedaTitular filtroBusquedaTitular = Singleton.getInstance(FiltroBusquedaTitular.class);

	public static final GridListaFirmantes gridListaFirmantes = Singleton.getInstance(GridListaFirmantes.class);
	private FFirmantesForm() {
		throw new IllegalStateException("FFirmantesForm is a utility class");
	}
	public static class Buttons {
		private Buttons() {
			throw new IllegalStateException("Buttons is a utility class");
		}

	}
	

	public static class FiltroBusquedaTitular {
	
		private FiltroBusquedaTitular() {
			throw new IllegalStateException("FFirmantesForm is a utility class");
		}
		
		public static final Condicion condicion = Singleton.getInstance(Condicion.class);
		public static final NumeroOperacion numeroOperacion = Singleton.getInstance(NumeroOperacion.class);

		public static class Condicion extends COBISDropDownList {
			public Condicion() {
				this.init("VA_CONDICIONFKYCNR_845339","Tipodecuenta");
			}
		}			

		public static class NumeroOperacion extends COBISInputValue {
			public NumeroOperacion() {
				this.init("VA_NUMEROOPERACNON_574339","NumeroOperacion");
			}
		}			
	}
	
	public static class GridListaFirmantes extends COBISGrid {
		public GridListaFirmantes() {
			this.init("QV_EH20_KKE86", "QV_EH20_KKE86");
		} 

		public static final Rol rol = Singleton.getInstance(Rol.class);
		public static final IdOperacion idOperacion = Singleton.getInstance(IdOperacion.class);
		public static final Cliente cliente = Singleton.getInstance(Cliente.class);
		public static final Nombre nombre = Singleton.getInstance(Nombre.class);
		public static final DocId docId = Singleton.getInstance(DocId.class);
		public static final Condicion condicion = Singleton.getInstance(Condicion.class);
		public static final Tipo tipo = Singleton.getInstance(Tipo.class);
		public static final Estado estado = Singleton.getInstance(Estado.class);
		public static final FechaCreacion fechaCreacion = Singleton.getInstance(FechaCreacion.class);
		public static final FechaModificacion fechaModificacion = Singleton.getInstance(FechaModificacion.class);
		public static final PorRenovar porRenovar = Singleton.getInstance(PorRenovar.class);
		public static final Secuencial secuencial = Singleton.getInstance(Secuencial.class);
		public static final TipoCliente tipoCliente = Singleton.getInstance(TipoCliente.class);
		public static final TipoDocId tipoDocId = Singleton.getInstance(TipoDocId.class);

		public static class Rol extends COBISDropDownList {
			public Rol() {
				this.init("VA_COMBOBOXGWPEPVJ_341339","Rol");
			}
		}			

		public static class IdOperacion extends COBISInputValue {
			public IdOperacion() {
				this.init("VA_TEXTINPUTBOXBLF_819339","IdOperacion");
			}
		}			

		public static class Cliente extends COBISInputTextButton {
			public Cliente() {
				this.init("VA_TEXTINPUTBOXCKW_272339","Cliente");
			}
		}			

		public static class Nombre extends COBISInputValue {
			public Nombre() {
				this.init("VA_TEXTINPUTBOXTAN_557339","Nombre");
			}
		}			

		public static class DocId extends COBISInputValue {
			public DocId() {
				this.init("VA_TEXTINPUTBOXARY_933339","Identificacion");
			}
		}			

		public static class Condicion extends COBISInputValue {
			public Condicion() {
				this.init("VA_TEXTINPUTBOXWHV_829339","Condicion");
			}
		}			

		public static class Tipo extends COBISInputValue {
			public Tipo() {
				this.init("VA_TEXTINPUTBOXJKB_442339","Tipo");
			}
		}			

		public static class Estado extends COBISInputValue {
			public Estado() {
				this.init("VA_TEXTINPUTBOXXGD_868339","Estado");
			}
		}			

		public static class FechaCreacion extends COBISDatePicker {
			public FechaCreacion() {
				this.init("VA_DATEFIELDEJLEQO_554339","FechaCreacion");
			}
		}			

		public static class FechaModificacion extends COBISDatePicker {
			public FechaModificacion() {
				this.init("VA_DATEFIELDOZYFUD_780339","FechaModificacion");
			}
		}			

		public static class PorRenovar extends COBISInputValue {
			public PorRenovar() {
				this.init("VA_TEXTINPUTBOXCWH_721339","PorRenovar");
			}
		}			

		public static class Secuencial extends COBISInputValue {
			public Secuencial() {
				this.init("VA_TEXTINPUTBOXPEU_296339","Secuencial");
			}
		}			

		public static class TipoCliente extends COBISInputValue {
			public TipoCliente() {
				this.init("VA_TEXTINPUTBOXCFD_477339","TipoCliente");
			}
		}			

		public static class TipoDocId extends COBISInputValue {
			public TipoDocId() {
				this.init("VA_TEXTINPUTBOXYTT_302339","TipoDocId");
			}
		}			
	}
}
