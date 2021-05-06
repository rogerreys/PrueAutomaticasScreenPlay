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

public class FCancelacionForm{
	public static final DetalleCancelacion detalleCancelacion = Singleton.getInstance(DetalleCancelacion.class);
	public static final DetalleOperacion detalleOperacion = Singleton.getInstance(DetalleOperacion.class);

	private FCancelacionForm() {
		throw new IllegalStateException("FCancelacionForm is a utility class");
	}
	public static class Buttons {
		private Buttons() {
			throw new IllegalStateException("Buttons is a utility class");
		}

	}
	

	public static class DetalleCancelacion {
	
		private DetalleCancelacion() {
			throw new IllegalStateException("FCancelacionForm is a utility class");
		}
		
		public static final MontoPenalizacion montoPenalizacion = Singleton.getInstance(MontoPenalizacion.class);
		public static final InteresNeto interesNeto = Singleton.getInstance(InteresNeto.class);
		public static final InteresVencido interesVencido = Singleton.getInstance(InteresVencido.class);
		public static final DiasVencido diasVencido = Singleton.getInstance(DiasVencido.class);
		public static final TasaDiasVencido tasaDiasVencido = Singleton.getInstance(TasaDiasVencido.class);
		public static final Impuesto impuesto = Singleton.getInstance(Impuesto.class);
		public static final MontoCapPenalizacion montoCapPenalizacion = Singleton.getInstance(MontoCapPenalizacion.class);
		public static final MontoCancelacion montoCancelacion = Singleton.getInstance(MontoCancelacion.class);
		public static final ClienteSolicitante clienteSolicitante = Singleton.getInstance(ClienteSolicitante.class);
		public static final Observacion observacion = Singleton.getInstance(Observacion.class);

		public static class MontoPenalizacion extends COBISInputValue {
			public MontoPenalizacion() {
				this.init("VA_3909NULBTASTASY_636333","PenalizacionInteres");
			}
		}			

		public static class InteresNeto extends COBISInputValue {
			public InteresNeto() {
				this.init("VA_INTERESNETOVHPO_547333","InteresNeto");
			}
		}			

		public static class InteresVencido extends COBISInputValue {
			public InteresVencido() {
				this.init("VA_8715EJRWRQMXBCL_904333","InteresporDiasVencidos");
			}
		}			

		public static class DiasVencido extends COBISInputValue {
			public DiasVencido() {
				this.init("VA_8781ERPMDDRPJGC_862333","DiasVencidos");
			}
		}			

		public static class TasaDiasVencido extends COBISInputValue {
			public TasaDiasVencido() {
				this.init("VA_2611INRHTUYBMXK_462333","TasaDiasVencidos");
			}
		}			

		public static class Impuesto extends COBISInputValue {
			public Impuesto() {
				this.init("VA_IMPUESTOHOPSQSN_895333","Impuesto");
			}
		}			

		public static class MontoCapPenalizacion extends COBISInputValue {
			public MontoCapPenalizacion() {
				this.init("VA_MONTOCAPPENAAOI_234333","PenalizacionCapital");
			}
		}			

		public static class MontoCancelacion extends COBISInputValue {
			public MontoCancelacion() {
				this.init("VA_5677HSDDZMLPWPS_162333","Total");
			}
		}			

		public static class ClienteSolicitante extends COBISDropDownList {
			public ClienteSolicitante() {
				this.init("VA_5047UDXAMKYXHDA_309333","Solicitante");
			}
		}			

		public static class Observacion extends COBISInputValue {
			public Observacion() {
				this.init("VA_2428PLTIEWYVQVZ_831333","Observacion");
			}
		}			
	}

	public static class DetalleOperacion {
	
		private DetalleOperacion() {
			throw new IllegalStateException("FCancelacionForm is a utility class");
		}
		
		public static final Monto monto = Singleton.getInstance(Monto.class);
		public static final TotalInteresGanado totalInteresGanado = Singleton.getInstance(TotalInteresGanado.class);
		public static final InteresGanado interesGanado = Singleton.getInstance(InteresGanado.class);
		public static final TotalInteresPagado totalInteresPagado = Singleton.getInstance(TotalInteresPagado.class);

		public static class Monto extends COBISInputValue {
			public Monto() {
				this.init("VA_5857YFBENBOVRZC_237333","Capital");
			}
		}			

		public static class TotalInteresGanado extends COBISInputValue {
			public TotalInteresGanado() {
				this.init("VA_5069KPDIMMMLIUB_432333","TotalInteresGanado");
			}
		}			

		public static class InteresGanado extends COBISInputValue {
			public InteresGanado() {
				this.init("VA_2281UXBVAZKLDWA_126333","SaldoInteres");
			}
		}			

		public static class TotalInteresPagado extends COBISInputValue {
			public TotalInteresPagado() {
				this.init("VA_1473DZAMMGFRUUF_520333","TotalInteresPagado");
			}
		}			
	}
}
