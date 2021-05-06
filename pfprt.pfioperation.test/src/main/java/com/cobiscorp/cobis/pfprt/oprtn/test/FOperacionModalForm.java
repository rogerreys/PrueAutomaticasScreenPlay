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

public class FOperacionModalForm{
	public static final Operacion operacion = Singleton.getInstance(Operacion.class);

	private FOperacionModalForm() {
		throw new IllegalStateException("FOperacionModalForm is a utility class");
	}
	public static class Buttons {
		private Buttons() {
			throw new IllegalStateException("Buttons is a utility class");
		}
		public static final CmdCommand1IdCMTPFPRTWWRTW cmdCommand1IdCMTPFPRTWWRTW = Singleton.getInstance(CmdCommand1IdCMTPFPRTWWRTW.class);
		
		public static class CmdCommand1IdCMTPFPRTWWRTW extends COBISButton{
			public CmdCommand1IdCMTPFPRTWWRTW () {
				this.init("CM_TPFPRTWW_RTW", "Aceptar");
			}
		}
	
		public static final CmdCommand2IdCMTPFPRTWWP9S cmdCommand2IdCMTPFPRTWWP9S = Singleton.getInstance(CmdCommand2IdCMTPFPRTWWP9S.class);
		
		public static class CmdCommand2IdCMTPFPRTWWP9S extends COBISButton{
			public CmdCommand2IdCMTPFPRTWWP9S () {
				this.init("CM_TPFPRTWW_P9S", "Cancelar");
			}
		}
	

	}
	

	public static class Operacion {
	
		private Operacion() {
			throw new IllegalStateException("FOperacionModalForm is a utility class");
		}
		
		public static final TipoOperacion tipoOperacion = Singleton.getInstance(TipoOperacion.class);
		public static final Observacion observacion = Singleton.getInstance(Observacion.class);

		public static class TipoOperacion extends COBISDropDownList {
			public TipoOperacion() {
				this.init("VA_TIPOOPERACIONNN_375640","Operacion");
			}
		}			

		public static class Observacion extends COBISInputValue {
			public Observacion() {
				this.init("VA_OBSERVACIONTIRI_509640","Observaciones");
			}
		}			
	}
}
