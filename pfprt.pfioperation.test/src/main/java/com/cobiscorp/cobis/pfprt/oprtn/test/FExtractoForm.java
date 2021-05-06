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

public class FExtractoForm{
	public static final FiltroBusquedaEstadoCuenta filtroBusquedaEstadoCuenta = Singleton.getInstance(FiltroBusquedaEstadoCuenta.class);

	private FExtractoForm() {
		throw new IllegalStateException("FExtractoForm is a utility class");
	}
	public static class Buttons {
		private Buttons() {
			throw new IllegalStateException("Buttons is a utility class");
		}
		public static final CmdCommand1IdCMTPFPRTDF6R5 cmdCommand1IdCMTPFPRTDF6R5 = Singleton.getInstance(CmdCommand1IdCMTPFPRTDF6R5.class);
		
		public static class CmdCommand1IdCMTPFPRTDF6R5 extends COBISButton{
			public CmdCommand1IdCMTPFPRTDF6R5 () {
				this.init("CM_TPFPRTDF_6R5", "Imprimir");
			}
		}
	
		public static final CmdCommand2IdCMTPFPRTDF0TF cmdCommand2IdCMTPFPRTDF0TF = Singleton.getInstance(CmdCommand2IdCMTPFPRTDF0TF.class);
		
		public static class CmdCommand2IdCMTPFPRTDF0TF extends COBISButton{
			public CmdCommand2IdCMTPFPRTDF0TF () {
				this.init("CM_TPFPRTDF_0TF", "Cancelar");
			}
		}
	

	}
	

	public static class FiltroBusquedaEstadoCuenta {
	
		private FiltroBusquedaEstadoCuenta() {
			throw new IllegalStateException("FExtractoForm is a utility class");
		}
		
		public static final FechaInicio fechaInicio = Singleton.getInstance(FechaInicio.class);
		public static final FechaFin fechaFin = Singleton.getInstance(FechaFin.class);

		public static class FechaInicio extends COBISDatePicker {
			public FechaInicio() {
				this.init("VA_FECHAINICIODSCQ_437349","Desde");
			}
		}			

		public static class FechaFin extends COBISDatePicker {
			public FechaFin() {
				this.init("VA_FECHAFINFBJANWB_718349","Hasta");
			}
		}			
	}
}
