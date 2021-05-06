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

public class FCuotasForm{

	public static final GridListaCuotas gridListaCuotas = Singleton.getInstance(GridListaCuotas.class);
	private FCuotasForm() {
		throw new IllegalStateException("FCuotasForm is a utility class");
	}
	
	public static class GridListaCuotas extends COBISGrid {
		public GridListaCuotas() {
			this.init("QV_8979_75965", "QV_8979_75965");
		} 

	public static class Buttons {
		private Buttons() {
			throw new IllegalStateException("Buttons Grid is a utility class");
		}



		public static final BtnGridCommandIdCEQV201QV897975965338 btnGridCommandIdCEQV201QV897975965338 = Singleton.getInstance(BtnGridCommandIdCEQV201QV897975965338.class);

		public static class BtnGridCommandIdCEQV201QV897975965338 extends COBISButton {
			public BtnGridCommandIdCEQV201QV897975965338() {
				this.init("CEQV_201QV_8979_75965_338","Imprimir");
			}
		}
	}
		public static final No no = Singleton.getInstance(No.class);
		public static final Fecha fecha = Singleton.getInstance(Fecha.class);
		public static final Estado estado = Singleton.getInstance(Estado.class);
		public static final Valor valor = Singleton.getInstance(Valor.class);
		public static final DiasCouta diasCouta = Singleton.getInstance(DiasCouta.class);
		public static final Ente ente = Singleton.getInstance(Ente.class);
		public static final Nombre nombre = Singleton.getInstance(Nombre.class);
		public static final Direccion direccion = Singleton.getInstance(Direccion.class);
		public static final Oficina oficina = Singleton.getInstance(Oficina.class);
		public static final Cuenta cuenta = Singleton.getInstance(Cuenta.class);
		public static final Tipo tipo = Singleton.getInstance(Tipo.class);
		public static final Capital capital = Singleton.getInstance(Capital.class);
		public static final FormaPago formaPago = Singleton.getInstance(FormaPago.class);
		public static final Moneda moneda = Singleton.getInstance(Moneda.class);
		public static final Tasa tasa = Singleton.getInstance(Tasa.class);
		public static final FechaVen fechaVen = Singleton.getInstance(FechaVen.class);
		public static final Plazo plazo = Singleton.getInstance(Plazo.class);
		public static final FechaIng fechaIng = Singleton.getInstance(FechaIng.class);
		public static final FechaVal fechaVal = Singleton.getInstance(FechaVal.class);
		public static final FechaUltPag fechaUltPag = Singleton.getInstance(FechaUltPag.class);
		public static final IntGanado intGanado = Singleton.getInstance(IntGanado.class);
		public static final ValorNeto valorNeto = Singleton.getInstance(ValorNeto.class);
		public static final Impuesto impuesto = Singleton.getInstance(Impuesto.class);
		public static final Pagar pagar = Singleton.getInstance(Pagar.class);

		public static class No extends COBISInputValue {
			public No() {
				this.init("VA_TEXTINPUTBOXVLT_500226","No");
			}
		}			

		public static class Fecha extends COBISDatePicker {
			public Fecha() {
				this.init("VA_DATEFIELDGOGIWP_474226","Fecha");
			}
		}			

		public static class Estado extends COBISInputValue {
			public Estado() {
				this.init("VA_TEXTINPUTBOXEVT_420226","Estado");
			}
		}			

		public static class Valor extends COBISInputValue {
			public Valor() {
				this.init("VA_TEXTINPUTBOXQFS_281226","Valor");
			}
		}			

		public static class DiasCouta extends COBISInputValue {
			public DiasCouta() {
				this.init("VA_TEXTINPUTBOXCUH_946226","DiasCuota");
			}
		}			

		public static class Ente extends COBISInputValue {
			public Ente() {
				this.init("VA_TEXTINPUTBOXDMV_361226","Cliente");
			}
		}			

		public static class Nombre extends COBISInputValue {
			public Nombre() {
				this.init("VA_TEXTINPUTBOXLIP_554226","Nombre");
			}
		}			

		public static class Direccion extends COBISInputValue {
			public Direccion() {
				this.init("VA_TEXTINPUTBOXWNG_279226","Direccion");
			}
		}			

		public static class Oficina extends COBISInputValue {
			public Oficina() {
				this.init("VA_TEXTINPUTBOXXYR_981226","Oficina");
			}
		}			

		public static class Cuenta extends COBISInputValue {
			public Cuenta() {
				this.init("VA_TEXTINPUTBOXTJG_602226","Cuenta");
			}
		}			

		public static class Tipo extends COBISInputValue {
			public Tipo() {
				this.init("VA_TEXTINPUTBOXTCH_951226","Tipo");
			}
		}			

		public static class Capital extends COBISInputValue {
			public Capital() {
				this.init("VA_TEXTINPUTBOXXSH_715226","Capital");
			}
		}			

		public static class FormaPago extends COBISInputValue {
			public FormaPago() {
				this.init("VA_TEXTINPUTBOXSZR_221226","FormadePago");
			}
		}			

		public static class Moneda extends COBISDropDownList {
			public Moneda() {
				this.init("VA_TEXTINPUTBOXQME_871226","Moneda");
			}
		}			

		public static class Tasa extends COBISInputValue {
			public Tasa() {
				this.init("VA_TEXTINPUTBOXGJC_419226","Tasa");
			}
		}			

		public static class FechaVen extends COBISDatePicker {
			public FechaVen() {
				this.init("VA_DATEFIELDXUNOMK_277226","FechadeVencimiento");
			}
		}			

		public static class Plazo extends COBISInputValue {
			public Plazo() {
				this.init("VA_TEXTINPUTBOXBNZ_313226","Plazo");
			}
		}			

		public static class FechaIng extends COBISDatePicker {
			public FechaIng() {
				this.init("VA_DATEFIELDNOZDKR_944226","FechadeIngreso");
			}
		}			

		public static class FechaVal extends COBISDatePicker {
			public FechaVal() {
				this.init("VA_DATEFIELDPDXEHQ_927226","FechaValor");
			}
		}			

		public static class FechaUltPag extends COBISDatePicker {
			public FechaUltPag() {
				this.init("VA_DATEFIELDYFAPBN_594226","FechaUltimoPago");
			}
		}			

		public static class IntGanado extends COBISInputValue {
			public IntGanado() {
				this.init("VA_TEXTINPUTBOXLHC_306226","InteresGanado");
			}
		}			

		public static class ValorNeto extends COBISInputValue {
			public ValorNeto() {
				this.init("VA_TEXTINPUTBOXZQR_666226","ValorNeto");
			}
		}			

		public static class Impuesto extends COBISInputValue {
			public Impuesto() {
				this.init("VA_TEXTINPUTBOXGKQ_934226","Impuesto");
			}
		}			

		public static class Pagar extends COBISCheckBox {
			public Pagar() {
				this.init("VA_CHECKBOXCTGRSYU_514226","Pagar");
			}
		}			
	}
}
