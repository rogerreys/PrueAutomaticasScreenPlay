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

public class FEndosoForm{

	public static final GridListaTitularesActual gridListaTitularesActual = Singleton.getInstance(GridListaTitularesActual.class);
	private FEndosoForm() {
		throw new IllegalStateException("FEndosoForm is a utility class");
	}
	
	public static class GridListaTitularesActual extends COBISGrid {
		public GridListaTitularesActual() {
			this.init("QV_8556_64633", "QV_8556_64633");
		} 

		public static final IdOperacion idOperacion = Singleton.getInstance(IdOperacion.class);
		public static final Rol rol = Singleton.getInstance(Rol.class);
		public static final Cliente cliente = Singleton.getInstance(Cliente.class);
		public static final Nombre nombre = Singleton.getInstance(Nombre.class);
		public static final DocId docId = Singleton.getInstance(DocId.class);
		public static final TipoDocId tipoDocId = Singleton.getInstance(TipoDocId.class);

		public static class IdOperacion extends COBISInputValue {
			public IdOperacion() {
				this.init("VA_TEXTINPUTBOXCGF_539279","IdOperacion");
			}
		}			

		public static class Rol extends COBISComboBox {
			public Rol() {
				this.init("VA_TEXTINPUTBOXLIX_879279","Rol");
			}
		}			

		public static class Cliente extends COBISInputValue {
			public Cliente() {
				this.init("VA_TEXTINPUTBOXQUL_325279","Cliente");
			}
		}			

		public static class Nombre extends COBISInputValue {
			public Nombre() {
				this.init("VA_TEXTINPUTBOXHRO_819279","Nombre");
			}
		}			

		public static class DocId extends COBISInputValue {
			public DocId() {
				this.init("VA_TEXTINPUTBOXMYH_319279","Identificacion");
			}
		}			

		public static class TipoDocId extends COBISInputValue {
			public TipoDocId() {
				this.init("VA_TEXTINPUTBOXZUU_151279","TipoDocId");
			}
		}			
	}
}
