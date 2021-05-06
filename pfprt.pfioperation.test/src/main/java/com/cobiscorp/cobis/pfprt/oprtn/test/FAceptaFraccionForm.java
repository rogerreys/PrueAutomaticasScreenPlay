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

public class FAceptaFraccionForm{

	private FAceptaFraccionForm() {
		throw new IllegalStateException("FAceptaFraccionForm is a utility class");
	}
	public static class Buttons {
		private Buttons() {
			throw new IllegalStateException("Buttons is a utility class");
		}
		public static final CmdCommand1IdCMTPFPRTWE02P cmdCommand1IdCMTPFPRTWE02P = Singleton.getInstance(CmdCommand1IdCMTPFPRTWE02P.class);
		
		public static class CmdCommand1IdCMTPFPRTWE02P extends COBISButton{
			public CmdCommand1IdCMTPFPRTWE02P () {
				this.init("CM_TPFPRTWE_02P", "Aceptar");
			}
		}
	
		public static final CmdCommand2IdCMTPFPRTWEPN1 cmdCommand2IdCMTPFPRTWEPN1 = Singleton.getInstance(CmdCommand2IdCMTPFPRTWEPN1.class);
		
		public static class CmdCommand2IdCMTPFPRTWEPN1 extends COBISButton{
			public CmdCommand2IdCMTPFPRTWEPN1 () {
				this.init("CM_TPFPRTWE_PN1", "Cancelar");
			}
		}
	

	}
	
}
