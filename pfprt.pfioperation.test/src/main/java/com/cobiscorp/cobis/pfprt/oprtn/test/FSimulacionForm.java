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

public class FSimulacionForm{
	public static final ResultadoSimulacion resultadoSimulacion = Singleton.getInstance(ResultadoSimulacion.class);

	private FSimulacionForm() {
		throw new IllegalStateException("FSimulacionForm is a utility class");
	}
	public static class Buttons {
		private Buttons() {
			throw new IllegalStateException("Buttons is a utility class");
		}
		public static final CmdCommand1IdCMTPFPRTTS9T cmdCommand1IdCMTPFPRTTS9T = Singleton.getInstance(CmdCommand1IdCMTPFPRTTS9T.class);
		
		public static class CmdCommand1IdCMTPFPRTTS9T extends COBISButton{
			public CmdCommand1IdCMTPFPRTTS9T () {
				this.init("CM_TPFPRTTS_9T_", "Aceptar");
			}
		}
	
		public static final CmdCommand3IdCMTPFPRTTS74N cmdCommand3IdCMTPFPRTTS74N = Singleton.getInstance(CmdCommand3IdCMTPFPRTTS74N.class);
		
		public static class CmdCommand3IdCMTPFPRTTS74N extends COBISButton{
			public CmdCommand3IdCMTPFPRTTS74N () {
				this.init("CM_TPFPRTTS_74N", "Imprimir");
			}
		}
	
		public static final CmdCommand2IdCMTPFPRTTS92P cmdCommand2IdCMTPFPRTTS92P = Singleton.getInstance(CmdCommand2IdCMTPFPRTTS92P.class);
		
		public static class CmdCommand2IdCMTPFPRTTS92P extends COBISButton{
			public CmdCommand2IdCMTPFPRTTS92P () {
				this.init("CM_TPFPRTTS_92P", "Cancelar");
			}
		}
	

	}
	

	public static class ResultadoSimulacion {
	
		private ResultadoSimulacion() {
			throw new IllegalStateException("FSimulacionForm is a utility class");
		}
		
		public static final TasaEfectiva tasaEfectiva = Singleton.getInstance(TasaEfectiva.class);
		public static final TotalInteresEstimado totalInteresEstimado = Singleton.getInstance(TotalInteresEstimado.class);
		public static final MontoImpuesto montoImpuesto = Singleton.getInstance(MontoImpuesto.class);
		public static final InteresEstimado interesEstimado = Singleton.getInstance(InteresEstimado.class);
		public static final FechaProximoPago fechaProximoPago = Singleton.getInstance(FechaProximoPago.class);
		public static final NumeroPagos numeroPagos = Singleton.getInstance(NumeroPagos.class);

		public static class TasaEfectiva extends COBISInputValue {
			public TasaEfectiva() {
				this.init("VA_TASAEFECTIVAYZH_602333","GATNominal");
			}
		}			

		public static class TotalInteresEstimado extends COBISInputValue {
			public TotalInteresEstimado() {
				this.init("VA_7028LVULSIEQAMM_117333","TotalInteres");
			}
		}			

		public static class MontoImpuesto extends COBISInputValue {
			public MontoImpuesto() {
				this.init("VA_4958KJUNIKANRYO_666333","ISR");
			}
		}			

		public static class InteresEstimado extends COBISInputValue {
			public InteresEstimado() {
				this.init("VA_1LWNAGMXJNKVPOM_236333","MontoProximoPago");
			}
		}			

		public static class FechaProximoPago extends COBISInputValue {
			public FechaProximoPago() {
				this.init("VA_9231OHDLGOAHDDN_845333","FechaProximoPago");
			}
		}			

		public static class NumeroPagos extends COBISInputValue {
			public NumeroPagos() {
				this.init("VA_4380QXQOZHQLBBA_456333","NumerodePagos");
			}
		}			
	}
}
