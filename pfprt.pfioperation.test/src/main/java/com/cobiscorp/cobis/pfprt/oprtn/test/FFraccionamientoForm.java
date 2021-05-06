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

public class FFraccionamientoForm{
	public static final DetalleOperacion detalleOperacion = Singleton.getInstance(DetalleOperacion.class);

	public static final GridListaFraccion gridListaFraccion = Singleton.getInstance(GridListaFraccion.class);
	private FFraccionamientoForm() {
		throw new IllegalStateException("FFraccionamientoForm is a utility class");
	}
	public static class Buttons {
		private Buttons() {
			throw new IllegalStateException("Buttons is a utility class");
		}
		public static final CmdCommand1IdCMTPFPRTDYR08 cmdCommand1IdCMTPFPRTDYR08 = Singleton.getInstance(CmdCommand1IdCMTPFPRTDYR08.class);
		
		public static class CmdCommand1IdCMTPFPRTDYR08 extends COBISButton{
			public CmdCommand1IdCMTPFPRTDYR08 () {
				this.init("CM_TPFPRTDY_R08", "Guardar");
			}
		}
	
		public static final CmdCommand3IdCMTPFPRTDYPTT cmdCommand3IdCMTPFPRTDYPTT = Singleton.getInstance(CmdCommand3IdCMTPFPRTDYPTT.class);
		
		public static class CmdCommand3IdCMTPFPRTDYPTT extends COBISButton{
			public CmdCommand3IdCMTPFPRTDYPTT () {
				this.init("CM_TPFPRTDY_PTT", "Imprimir");
			}
		}
	
		public static final CmdCommand2IdCMTPFPRTDYKNP cmdCommand2IdCMTPFPRTDYKNP = Singleton.getInstance(CmdCommand2IdCMTPFPRTDYKNP.class);
		
		public static class CmdCommand2IdCMTPFPRTDYKNP extends COBISButton{
			public CmdCommand2IdCMTPFPRTDYKNP () {
				this.init("CM_TPFPRTDY_KNP", "Salir");
			}
		}
	

	}
	

	public static class DetalleOperacion {
	
		private DetalleOperacion() {
			throw new IllegalStateException("FFraccionamientoForm is a utility class");
		}
		
		public static final NumeroOperacion numeroOperacion = Singleton.getInstance(NumeroOperacion.class);
		public static final Monto monto = Singleton.getInstance(Monto.class);
		public static final Tasa tasa = Singleton.getInstance(Tasa.class);
		public static final Plazo plazo = Singleton.getInstance(Plazo.class);
		public static final FechaActivacion fechaActivacion = Singleton.getInstance(FechaActivacion.class);
		public static final FechaVencimiento fechaVencimiento = Singleton.getInstance(FechaVencimiento.class);

		public static class NumeroOperacion extends COBISInputValue {
			public NumeroOperacion() {
				this.init("VA_NUMEROOPERACIOI_311186","NumeroOperacion");
			}
		}			

		public static class Monto extends COBISInputValue {
			public Monto() {
				this.init("VA_MONTOVQFPNNRMHF_140186","Monto");
			}
		}			

		public static class Tasa extends COBISInputValue {
			public Tasa() {
				this.init("VA_TASABRUGTCCTNFF_745186","Tasa");
			}
		}			

		public static class Plazo extends COBISInputValue {
			public Plazo() {
				this.init("VA_PLAZOLUQXVGFQCL_222186","Plazo");
			}
		}			

		public static class FechaActivacion extends COBISDatePicker {
			public FechaActivacion() {
				this.init("VA_FECHAACTIVACNII_199186","FechaActivacion");
			}
		}			

		public static class FechaVencimiento extends COBISDatePicker {
			public FechaVencimiento() {
				this.init("VA_FECHAVENCIMINEO_970186","FechaVencimiento");
			}
		}			
	}
	
	public static class GridListaFraccion extends COBISGrid {
		public GridListaFraccion() {
			this.init("QV_MN86_RTZ33", "QV_MN86_RTZ33");
		} 

		public static final Secuencial secuencial = Singleton.getInstance(Secuencial.class);
		public static final Monto monto = Singleton.getInstance(Monto.class);
		public static final Plazo plazo = Singleton.getInstance(Plazo.class);
		public static final Tasa tasa = Singleton.getInstance(Tasa.class);
		public static final InteresxPagar interesxPagar = Singleton.getInstance(InteresxPagar.class);
		public static final NumeroOperacion numeroOperacion = Singleton.getInstance(NumeroOperacion.class);
		public static final DestinoCta destinoCta = Singleton.getInstance(DestinoCta.class);
		public static final OtroDestinoCta otroDestinoCta = Singleton.getInstance(OtroDestinoCta.class);
		public static final TitularPrin titularPrin = Singleton.getInstance(TitularPrin.class);
		public static final FechaVen fechaVen = Singleton.getInstance(FechaVen.class);

		public static class Secuencial extends COBISInputValue {
			public Secuencial() {
				this.init("VA_TEXTINPUTBOXNYP_469186","Fraccion");
			}
		}			

		public static class Monto extends COBISInputValue {
			public Monto() {
				this.init("VA_TEXTINPUTBOXUZO_914186","Monto");
			}
		}			

		public static class Plazo extends COBISInputValue {
			public Plazo() {
				this.init("VA_TEXTINPUTBOXQUU_910186","Plazo");
			}
		}			

		public static class Tasa extends COBISInputValue {
			public Tasa() {
				this.init("VA_TEXTINPUTBOXCGX_794186","Tasa");
			}
		}			

		public static class InteresxPagar extends COBISInputValue {
			public InteresxPagar() {
				this.init("VA_TEXTINPUTBOXZIJ_164186","InteresporPagar");
			}
		}			

		public static class NumeroOperacion extends COBISInputValue {
			public NumeroOperacion() {
				this.init("VA_TEXTINPUTBOXQKU_951186","NumDeposito");
			}
		}			

		public static class DestinoCta extends COBISInputValue {
			public DestinoCta() {
				this.init("VA_TEXTINPUTBOXJIB_888186","DestinoCuenta");
			}
		}			

		public static class OtroDestinoCta extends COBISInputValue {
			public OtroDestinoCta() {
				this.init("VA_TEXTINPUTBOXXKV_604186","OtroDestinoCuenta");
			}
		}			

		public static class TitularPrin extends COBISInputValue {
			public TitularPrin() {
				this.init("VA_TEXTINPUTBOXNYP_203186","TitularPrin");
			}
		}			

		public static class FechaVen extends COBISDatePicker {
			public FechaVen() {
				this.init("VA_DATEFIELDFYPASY_364186","FechaVen");
			}
		}			
	}
}
