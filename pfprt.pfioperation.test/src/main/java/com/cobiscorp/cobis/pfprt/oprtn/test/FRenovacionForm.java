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

public class FRenovacionForm{
	public static final ResultadoSimulacion resultadoSimulacion = Singleton.getInstance(ResultadoSimulacion.class);
	public static final DetalleOperacion detalleOperacion = Singleton.getInstance(DetalleOperacion.class);
	public static final DetalleRenovacion detalleRenovacion = Singleton.getInstance(DetalleRenovacion.class);

	private FRenovacionForm() {
		throw new IllegalStateException("FRenovacionForm is a utility class");
	}
	public static class Buttons {
		private Buttons() {
			throw new IllegalStateException("Buttons is a utility class");
		}
		public static final BtnVAVABUTTONVIRANCM120247IdVAVABUTTONVIRANCM120247 btnVAVABUTTONVIRANCM120247IdVAVABUTTONVIRANCM120247 = Singleton.getInstance(BtnVAVABUTTONVIRANCM120247IdVAVABUTTONVIRANCM120247.class);
		
		public static class BtnVAVABUTTONVIRANCM120247IdVAVABUTTONVIRANCM120247 extends COBISButton{
			public BtnVAVABUTTONVIRANCM120247IdVAVABUTTONVIRANCM120247 () {
				this.init("VA_VABUTTONVIRANCM_120247", "Simular");
			}
		}
	

	}
	

	public static class ResultadoSimulacion {
	
		private ResultadoSimulacion() {
			throw new IllegalStateException("FRenovacionForm is a utility class");
		}
		
	}

	public static class DetalleOperacion {
	
		private DetalleOperacion() {
			throw new IllegalStateException("FRenovacionForm is a utility class");
		}
		
		public static final CodigoProducto codigoProducto = Singleton.getInstance(CodigoProducto.class);
		public static final CodigoFormaPago codigoFormaPago = Singleton.getInstance(CodigoFormaPago.class);
		public static final CodigoPeriodoPago codigoPeriodoPago = Singleton.getInstance(CodigoPeriodoPago.class);
		public static final CapitalizaInteres capitalizaInteres = Singleton.getInstance(CapitalizaInteres.class);
		public static final CodigoCategoria codigoCategoria = Singleton.getInstance(CodigoCategoria.class);
		public static final Plazo plazo = Singleton.getInstance(Plazo.class);
		public static final FechaActivacion fechaActivacion = Singleton.getInstance(FechaActivacion.class);
		public static final FechaVencimiento fechaVencimiento = Singleton.getInstance(FechaVencimiento.class);
		public static final Monto monto = Singleton.getInstance(Monto.class);
		public static final CodigoMoneda codigoMoneda = Singleton.getInstance(CodigoMoneda.class);
		public static final Tasa tasa = Singleton.getInstance(Tasa.class);
		public static final InteresGanado interesGanado = Singleton.getInstance(InteresGanado.class);
		public static final CapitalizaIntRenovar capitalizaIntRenovar = Singleton.getInstance(CapitalizaIntRenovar.class);

		public static class CodigoProducto extends COBISDropDownList {
			public CodigoProducto() {
				this.init("VA_3043FWMWNGMHHQX_408247","Producto");
			}
		}			

		public static class CodigoFormaPago extends COBISDropDownList {
			public CodigoFormaPago() {
				this.init("VA_CODIGOAPAGORLDV_455247","FormadePago");
			}
		}			

		public static class CodigoPeriodoPago extends COBISDropDownList {
			public CodigoPeriodoPago() {
				this.init("VA_3577RWVSHABWEMW_823247","FrecuenciadePago");
			}
		}			

		public static class CapitalizaInteres extends COBISDropDownList {
			public CapitalizaInteres() {
				this.init("VA_CAPITALIZAINERE_952247","CapitalizaInteres");
			}
		}			

		public static class CodigoCategoria extends COBISDropDownList {
			public CodigoCategoria() {
				this.init("VA_6415DGHJPICRIGD_818247","Categoria");
			}
		}			

		public static class Plazo extends COBISInputValue {
			public Plazo() {
				this.init("VA_2506AGTJKMSQBXI_537247","Plazo");
			}
		}			

		public static class FechaActivacion extends COBISDatePicker {
			public FechaActivacion() {
				this.init("VA_3398VJLXGVNUJWS_222247","FechadeActivacion");
			}
		}			

		public static class FechaVencimiento extends COBISDatePicker {
			public FechaVencimiento() {
				this.init("VA_7061ARWQOXFSBEF_898247","FechadeVencimiento");
			}
		}			

		public static class Monto extends COBISInputValue {
			public Monto() {
				this.init("VA_6302ATWIOCKPXPV_377247","MontoaRenovar");
			}
		}			

		public static class CodigoMoneda extends COBISDropDownList {
			public CodigoMoneda() {
				this.init("VA_4985BENXIRWAZVB_909247","Moneda");
			}
		}			

		public static class Tasa extends COBISInputTextButton {
			public Tasa() {
				this.init("VA_6119BWQCKGMUUZG_582247","TasadeInteres");
			}
		}			

		public static class InteresGanado extends COBISInputValue {
			public InteresGanado() {
				this.init("VA_7753OULSQAASHST_889247","InteresporPagar");
			}
		}			

		public static class CapitalizaIntRenovar extends COBISCheckBox {
			public CapitalizaIntRenovar() {
				this.init("VA_6108RBHBDPACQLK_328247","CapitalizaInteres");
			}
		}			
	}

	public static class DetalleRenovacion {
	
		private DetalleRenovacion() {
			throw new IllegalStateException("FRenovacionForm is a utility class");
		}
		
		public static final InteresVencido interesVencido = Singleton.getInstance(InteresVencido.class);
		public static final DiasVencidos diasVencidos = Singleton.getInstance(DiasVencidos.class);
		public static final TasaDiasVencidos tasaDiasVencidos = Singleton.getInstance(TasaDiasVencidos.class);
		public static final MontoIncremento montoIncremento = Singleton.getInstance(MontoIncremento.class);

		public static class InteresVencido extends COBISInputValue {
			public InteresVencido() {
				this.init("VA_8167ASCCOKPZFHV_105247","InteresporDiasVencidos");
			}
		}			

		public static class DiasVencidos extends COBISInputValue {
			public DiasVencidos() {
				this.init("VA_3594ZGQYGQFLBWA_349247","DiasVencidos");
			}
		}			

		public static class TasaDiasVencidos extends COBISInputValue {
			public TasaDiasVencidos() {
				this.init("VA_2600YZNLVKAYPPV_787247","TasaDiasVencidos");
			}
		}			

		public static class MontoIncremento extends COBISInputValue {
			public MontoIncremento() {
				this.init("VA_1024PFHDAPRGZAU_151247","MontoIncrementoReduccion");
			}
		}			
	}
}
