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

public class FObservacionPignoracionForm{
	public static final PignoracionEliminar pignoracionEliminar = Singleton.getInstance(PignoracionEliminar.class);

	private FObservacionPignoracionForm() {
		throw new IllegalStateException("FObservacionPignoracionForm is a utility class");
	}
	public static class Buttons {
		private Buttons() {
			throw new IllegalStateException("Buttons is a utility class");
		}
		public static final CmdCommand1IdCMTPFPRTBN34T cmdCommand1IdCMTPFPRTBN34T = Singleton.getInstance(CmdCommand1IdCMTPFPRTBN34T.class);
		
		public static class CmdCommand1IdCMTPFPRTBN34T extends COBISButton{
			public CmdCommand1IdCMTPFPRTBN34T () {
				this.init("CM_TPFPRTBN_34T", "Aceptar");
			}
		}
	
		public static final CmdCommand2IdCMTPFPRTBNN4H cmdCommand2IdCMTPFPRTBNN4H = Singleton.getInstance(CmdCommand2IdCMTPFPRTBNN4H.class);
		
		public static class CmdCommand2IdCMTPFPRTBNN4H extends COBISButton{
			public CmdCommand2IdCMTPFPRTBNN4H () {
				this.init("CM_TPFPRTBN_N4H", "Cancelar");
			}
		}
	

	}
	

	public static class PignoracionEliminar {
	
		private PignoracionEliminar() {
			throw new IllegalStateException("FObservacionPignoracionForm is a utility class");
		}
		
		public static final Observacion observacion = Singleton.getInstance(Observacion.class);

		public static class Observacion extends COBISInputValue {
			public Observacion() {
				this.init("VA_1PSVXHQCXBBMOEI_724732","Observacion");
			}
		}			
	}
}
