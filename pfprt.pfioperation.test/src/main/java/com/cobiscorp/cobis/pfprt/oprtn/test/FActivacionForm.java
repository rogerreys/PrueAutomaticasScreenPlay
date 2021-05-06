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

public class FActivacionForm{

	private FActivacionForm() {
		throw new IllegalStateException("FActivacionForm is a utility class");
	}
	public static class Buttons {
		private Buttons() {
			throw new IllegalStateException("Buttons is a utility class");
		}
		public static final CmdCommand1IdCMTPFPRTTP0PX cmdCommand1IdCMTPFPRTTP0PX = Singleton.getInstance(CmdCommand1IdCMTPFPRTTP0PX.class);
		
		public static class CmdCommand1IdCMTPFPRTTP0PX extends COBISButton{
			public CmdCommand1IdCMTPFPRTTP0PX () {
				this.init("CM_TPFPRTTP_0PX", "Aceptar");
			}
		}
	
		public static final CmdCommand2IdCMTPFPRTTP5PP cmdCommand2IdCMTPFPRTTP5PP = Singleton.getInstance(CmdCommand2IdCMTPFPRTTP5PP.class);
		
		public static class CmdCommand2IdCMTPFPRTTP5PP extends COBISButton{
			public CmdCommand2IdCMTPFPRTTP5PP () {
				this.init("CM_TPFPRTTP_5PP", "Cancelar");
			}
		}
	

	}
	
}
