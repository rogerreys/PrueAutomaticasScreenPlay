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

public class FOperacionForm{
	public static final ResultadoSimulacion resultadoSimulacion = Singleton.getInstance(ResultadoSimulacion.class);
	public static final DetalleIncreRed detalleIncreRed = Singleton.getInstance(DetalleIncreRed.class);
	public static final DetalleOperacion detalleOperacion = Singleton.getInstance(DetalleOperacion.class);

	private FOperacionForm() {
		throw new IllegalStateException("FOperacionForm is a utility class");
	}
	public static class Buttons {
		private Buttons() {
			throw new IllegalStateException("Buttons is a utility class");
		}
		public static final CmdCommand1IdCMTPFPRTRUN6T cmdCommand1IdCMTPFPRTRUN6T = Singleton.getInstance(CmdCommand1IdCMTPFPRTRUN6T.class);
		
		public static class CmdCommand1IdCMTPFPRTRUN6T extends COBISButton{
			public CmdCommand1IdCMTPFPRTRUN6T () {
				this.init("CM_TPFPRTRU_N6T", "Simular");
			}
		}
	
		public static final BtnVAVABUTTONGXXYYCM171483IdVAVABUTTONGXXYYCM171483 btnVAVABUTTONGXXYYCM171483IdVAVABUTTONGXXYYCM171483 = Singleton.getInstance(BtnVAVABUTTONGXXYYCM171483IdVAVABUTTONGXXYYCM171483.class);
		
		public static class BtnVAVABUTTONGXXYYCM171483IdVAVABUTTONGXXYYCM171483 extends COBISButton{
			public BtnVAVABUTTONGXXYYCM171483IdVAVABUTTONGXXYYCM171483 () {
				this.init("VA_VABUTTONGXXYYCM_171483", "Simular");
			}
		}
	

	}
	

	public static class ResultadoSimulacion {
	
		private ResultadoSimulacion() {
			throw new IllegalStateException("FOperacionForm is a utility class");
		}
		
	}

	public static class DetalleIncreRed {
	
		private DetalleIncreRed() {
			throw new IllegalStateException("FOperacionForm is a utility class");
		}
		
		public static final MontoIncremento montoIncremento = Singleton.getInstance(MontoIncremento.class);

		public static class MontoIncremento extends COBISInputValue {
			public MontoIncremento() {
				this.init("VA_7137FZKIFZALTHW_476483","MontoIncrementoReduccion");
			}
		}			
	}

	public static class DetalleOperacion {
	
		private DetalleOperacion() {
			throw new IllegalStateException("FOperacionForm is a utility class");
		}
		
		public static final CodigoProducto codigoProducto = Singleton.getInstance(CodigoProducto.class);
		public static final CodigoFormaPago codigoFormaPago = Singleton.getInstance(CodigoFormaPago.class);
		public static final CodigoPeriodoPago codigoPeriodoPago = Singleton.getInstance(CodigoPeriodoPago.class);
		public static final CapitalizaInteres capitalizaInteres = Singleton.getInstance(CapitalizaInteres.class);
		public static final CodigoCategoria codigoCategoria = Singleton.getInstance(CodigoCategoria.class);
		public static final Monto monto = Singleton.getInstance(Monto.class);
		public static final CodigoMoneda codigoMoneda = Singleton.getInstance(CodigoMoneda.class);
		public static final Tasa tasa = Singleton.getInstance(Tasa.class);
		public static final Plazo plazo = Singleton.getInstance(Plazo.class);
		public static final FechaActivacion fechaActivacion = Singleton.getInstance(FechaActivacion.class);
		public static final FechaVencimiento fechaVencimiento = Singleton.getInstance(FechaVencimiento.class);
		public static final Instruccion instruccion = Singleton.getInstance(Instruccion.class);
		public static final Localizado localizado = Singleton.getInstance(Localizado.class);
		public static final FechaLocaliza fechaLocaliza = Singleton.getInstance(FechaLocaliza.class);
		public static final FechaNoLocaliza fechaNoLocaliza = Singleton.getInstance(FechaNoLocaliza.class);
		public static final Inactivo inactivo = Singleton.getInstance(Inactivo.class);

		public static class CodigoProducto extends COBISDropDownList {
			public CodigoProducto() {
				this.init("VA_6382FCVFPQQZAQS_544483","Producto");
			}
		}			

		public static class CodigoFormaPago extends COBISDropDownList {
			public CodigoFormaPago() {
				this.init("VA_CODIGOAPAGOKDMY_947483","FormadePago");
			}
		}			

		public static class CodigoPeriodoPago extends COBISDropDownList {
			public CodigoPeriodoPago() {
				this.init("VA_1990ZLIMNFDCHPC_590483","FrecuenciadePago");
			}
		}			

		public static class CapitalizaInteres extends COBISDropDownList {
			public CapitalizaInteres() {
				this.init("VA_CAPITALIZAINSET_783483","CapitalizaInteres");
			}
		}			

		public static class CodigoCategoria extends COBISDropDownList {
			public CodigoCategoria() {
				this.init("VA_9037ZLZRWQMOXVW_704483","Categoria");
			}
		}			

		public static class Monto extends COBISInputValue {
			public Monto() {
				this.init("VA_4625AEXERXZYJSY_772483","Monto");
			}
		}			

		public static class CodigoMoneda extends COBISDropDownList {
			public CodigoMoneda() {
				this.init("VA_8097QTIHKGCBQZH_796483","Moneda");
			}
		}			

		public static class Tasa extends COBISInputTextButton {
			public Tasa() {
				this.init("VA_4868ZBVNBHCDKRQ_312483","TasadeInteres");
			}
		}			

		public static class Plazo extends COBISInputValue {
			public Plazo() {
				this.init("VA_2745QLCWKQUCCTK_953483","Plazo");
			}
		}			

		public static class FechaActivacion extends COBISDatePicker {
			public FechaActivacion() {
				this.init("VA_3551CTGFAKJAABB_535483","FechadeActivacion");
			}
		}			

		public static class FechaVencimiento extends COBISDatePicker {
			public FechaVencimiento() {
				this.init("VA_1302RXTSVRAYPLW_535483","FechadeVencimiento");
			}
		}			

		public static class Instruccion extends COBISInputValue {
			public Instruccion() {
				this.init("VA_INSTRUCCIONCHSP_321483","InstruccionEspecial");
			}
		}			

		public static class Localizado extends COBISDropDownList {
			public Localizado() {
				this.init("VA_LOCALIZADOEBFDU_902483","Localizado");
			}
		}			

		public static class FechaLocaliza extends COBISDatePicker {
			public FechaLocaliza() {
				this.init("VA_FECHALOCALIZAAA_399483","FechaLocalizacion");
			}
		}			

		public static class FechaNoLocaliza extends COBISDatePicker {
			public FechaNoLocaliza() {
				this.init("VA_FECHANOLOCALZAZ_423483","FechaNoLocalizado");
			}
		}			

		public static class Inactivo extends COBISDropDownList {
			public Inactivo() {
				this.init("VA_INACTIVOUMQLYGC_585483","Inactivo");
			}
		}			
	}
}
