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

public class FDetalleTitularesEndosoForm{

	public static final GridListaDetalleTitularesEndoso gridListaDetalleTitularesEndoso = Singleton.getInstance(GridListaDetalleTitularesEndoso.class);
	private FDetalleTitularesEndosoForm() {
		throw new IllegalStateException("FDetalleTitularesEndosoForm is a utility class");
	}
	public static class Buttons {
		private Buttons() {
			throw new IllegalStateException("Buttons is a utility class");
		}
		public static final CmdCommand1IdCMTPFPRTHD6N7 cmdCommand1IdCMTPFPRTHD6N7 = Singleton.getInstance(CmdCommand1IdCMTPFPRTHD6N7.class);
		
		public static class CmdCommand1IdCMTPFPRTHD6N7 extends COBISButton{
			public CmdCommand1IdCMTPFPRTHD6N7 () {
				this.init("CM_TPFPRTHD_6N7", "Aceptar");
			}
		}
	

	}
	
	
	public static class GridListaDetalleTitularesEndoso extends COBISGrid {
		public GridListaDetalleTitularesEndoso() {
			this.init("QV_YK34_DQS92", "QV_YK34_DQS92");
		} 

		public static final Cliente cliente = Singleton.getInstance(Cliente.class);
		public static final Rol rol = Singleton.getInstance(Rol.class);
		public static final Nombre nombre = Singleton.getInstance(Nombre.class);

		public static class Cliente extends COBISInputValue {
			public Cliente() {
				this.init("VA_TEXTINPUTBOXBKM_289592","Cliente");
			}
		}			

		public static class Rol extends COBISInputValue {
			public Rol() {
				this.init("VA_TEXTINPUTBOXETX_271592","Rol");
			}
		}			

		public static class Nombre extends COBISInputValue {
			public Nombre() {
				this.init("VA_TEXTINPUTBOXYIJ_739592","Nombre");
			}
		}			
	}
}
