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

public class FAutorizacionCancelacionForm{
	public static final DetalleOperacion detalleOperacion = Singleton.getInstance(DetalleOperacion.class);
	public static final DetalleAutorizacion detalleAutorizacion = Singleton.getInstance(DetalleAutorizacion.class);

	private FAutorizacionCancelacionForm() {
		throw new IllegalStateException("FAutorizacionCancelacionForm is a utility class");
	}
	public static class Buttons {
		private Buttons() {
			throw new IllegalStateException("Buttons is a utility class");
		}
		public static final CmdCommand1IdCMTPFPRTFZPZ cmdCommand1IdCMTPFPRTFZPZ = Singleton.getInstance(CmdCommand1IdCMTPFPRTFZPZ.class);
		
		public static class CmdCommand1IdCMTPFPRTFZPZ extends COBISButton{
			public CmdCommand1IdCMTPFPRTFZPZ () {
				this.init("CM_TPFPRTFZ_PZ_", "Guardar");
			}
		}
	

	}
	

	public static class DetalleOperacion {
	
		private DetalleOperacion() {
			throw new IllegalStateException("FAutorizacionCancelacionForm is a utility class");
		}
		
		public static final Moneda moneda = Singleton.getInstance(Moneda.class);
		public static final FormaPago formaPago = Singleton.getInstance(FormaPago.class);

		public static class Moneda extends COBISInputValue {
			public Moneda() {
				this.init("VA_MONEDAEUTGEHDHM_554165","Moneda");
			}
		}			

		public static class FormaPago extends COBISInputValue {
			public FormaPago() {
				this.init("VA_APAGOXMOJTEEUVD_801165","FrecuenciadePago");
			}
		}			
	}

	public static class DetalleAutorizacion {
	
		private DetalleAutorizacion() {
			throw new IllegalStateException("FAutorizacionCancelacionForm is a utility class");
		}
		
		public static final Tipo tipo = Singleton.getInstance(Tipo.class);
		public static final Operador operador = Singleton.getInstance(Operador.class);
		public static final InteresGanado interesGanado = Singleton.getInstance(InteresGanado.class);
		public static final DiasVencidos diasVencidos = Singleton.getInstance(DiasVencidos.class);
		public static final NuevoValor nuevoValor = Singleton.getInstance(NuevoValor.class);
		public static final NuevoValorDias nuevoValorDias = Singleton.getInstance(NuevoValorDias.class);
		public static final Intereses intereses = Singleton.getInstance(Intereses.class);
		public static final NuevoInteres nuevoInteres = Singleton.getInstance(NuevoInteres.class);
		public static final Tasa tasa = Singleton.getInstance(Tasa.class);
		public static final Monto monto = Singleton.getInstance(Monto.class);
		public static final NuevoValorCapital nuevoValorCapital = Singleton.getInstance(NuevoValorCapital.class);
		public static final NuevoCapital nuevoCapital = Singleton.getInstance(NuevoCapital.class);
		public static final TasaBase tasaBase = Singleton.getInstance(TasaBase.class);
		public static final NuevoValorTasa nuevoValorTasa = Singleton.getInstance(NuevoValorTasa.class);
		public static final NuevoTasa nuevoTasa = Singleton.getInstance(NuevoTasa.class);

		public static class Tipo extends COBISComboBox {
			public Tipo() {
				this.init("VA_TIPOYGUNKCGWLML_493165","Tipo");
			}
		}			

		public static class Operador extends COBISDropDownList {
			public Operador() {
				this.init("VA_OPERADOREJXIUCT_968165","Operador");
			}
		}			

		public static class InteresGanado extends COBISInputValue {
			public InteresGanado() {
				this.init("VA_INTERESGANADOOO_589165","InteresGanado");
			}
		}			

		public static class DiasVencidos extends COBISInputValue {
			public DiasVencidos() {
				this.init("VA_DIASVENCIDOSWFO_621165","DiasVencidos");
			}
		}			

		public static class NuevoValor extends COBISInputValue {
			public NuevoValor() {
				this.init("VA_NUEVOVALORFODCY_721165","PenalizacionInteres");
			}
		}			

		public static class NuevoValorDias extends COBISInputValue {
			public NuevoValorDias() {
				this.init("VA_NUEVOVALORDISAA_463165","TasaDiasVencidos");
			}
		}			

		public static class Intereses extends COBISInputValue {
			public Intereses() {
				this.init("VA_INTERESESLKTJQG_409165","InteresDiasVencidos");
			}
		}			

		public static class NuevoInteres extends COBISInputValue {
			public NuevoInteres() {
				this.init("VA_NUEVOINTERESQCR_601165","NuevoInteres");
			}
		}			

		public static class Tasa extends COBISInputValue {
			public Tasa() {
				this.init("VA_TASAEOXGLNTZVBE_483165","Tasa");
			}
		}			

		public static class Monto extends COBISInputValue {
			public Monto() {
				this.init("VA_MONTOQXSBNUSRQP_242165","Capital");
			}
		}			

		public static class NuevoValorCapital extends COBISInputValue {
			public NuevoValorCapital() {
				this.init("VA_NUEVOVALORCAPIL_890165","PenalizacionCapital");
			}
		}			

		public static class NuevoCapital extends COBISInputValue {
			public NuevoCapital() {
				this.init("VA_NUEVOCAPITALQCT_869165","NuevoCapital");
			}
		}			

		public static class TasaBase extends COBISInputValue {
			public TasaBase() {
				this.init("VA_TASABASEQLDDIIY_496165","TasaBase");
			}
		}			

		public static class NuevoValorTasa extends COBISInputValue {
			public NuevoValorTasa() {
				this.init("VA_NUEVOVALORTASAS_791165","Spread");
			}
		}			

		public static class NuevoTasa extends COBISInputValue {
			public NuevoTasa() {
				this.init("VA_NUEVOTASAXBDXPQ_811165","NuevaTasa");
			}
		}			
	}
}
