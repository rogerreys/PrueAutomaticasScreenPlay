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

public class FBloqueosModalForm{
	public static final FiltroEliminarBloqueo filtroEliminarBloqueo = Singleton.getInstance(FiltroEliminarBloqueo.class);

	private FBloqueosModalForm() {
		throw new IllegalStateException("FBloqueosModalForm is a utility class");
	}
	public static class Buttons {
		private Buttons() {
			throw new IllegalStateException("Buttons is a utility class");
		}
		public static final CmdCommand1IdCMTPFPRTFQ3O0 cmdCommand1IdCMTPFPRTFQ3O0 = Singleton.getInstance(CmdCommand1IdCMTPFPRTFQ3O0.class);
		
		public static class CmdCommand1IdCMTPFPRTFQ3O0 extends COBISButton{
			public CmdCommand1IdCMTPFPRTFQ3O0 () {
				this.init("CM_TPFPRTFQ_3O0", "Aceptar");
			}
		}
	
		public static final CmdCommand2IdCMTPFPRTFQTSR cmdCommand2IdCMTPFPRTFQTSR = Singleton.getInstance(CmdCommand2IdCMTPFPRTFQTSR.class);
		
		public static class CmdCommand2IdCMTPFPRTFQTSR extends COBISButton{
			public CmdCommand2IdCMTPFPRTFQTSR () {
				this.init("CM_TPFPRTFQ_TSR", "Cancelar");
			}
		}
	

	}
	

	public static class FiltroEliminarBloqueo {
	
		private FiltroEliminarBloqueo() {
			throw new IllegalStateException("FBloqueosModalForm is a utility class");
		}
		
		public static final Observacion observacion = Singleton.getInstance(Observacion.class);

		public static class Observacion extends COBISInputValue {
			public Observacion() {
				this.init("VA_1324YGVINHRVASB_714524","Observacion");
			}
		}			
	}
}
