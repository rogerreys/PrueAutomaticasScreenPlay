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

public class FRevPagoInteresForm{
	public static final DetallePagoInteres detallePagoInteres = Singleton.getInstance(DetallePagoInteres.class);

	public static final GridListaCuotas gridListaCuotas = Singleton.getInstance(GridListaCuotas.class);
	private FRevPagoInteresForm() {
		throw new IllegalStateException("FRevPagoInteresForm is a utility class");
	}
	public static class Buttons {
		private Buttons() {
			throw new IllegalStateException("Buttons is a utility class");
		}
		public static final CmdCommand1IdCMTPFPRTMF71L cmdCommand1IdCMTPFPRTMF71L = Singleton.getInstance(CmdCommand1IdCMTPFPRTMF71L.class);
		
		public static class CmdCommand1IdCMTPFPRTMF71L extends COBISButton{
			public CmdCommand1IdCMTPFPRTMF71L () {
				this.init("CM_TPFPRTMF_71L", "Aceptar");
			}
		}
	

	}
	

	public static class DetallePagoInteres {
	
		private DetallePagoInteres() {
			throw new IllegalStateException("FRevPagoInteresForm is a utility class");
		}
		
		public static final Cuota cuota = Singleton.getInstance(Cuota.class);
		public static final Observacion observacion = Singleton.getInstance(Observacion.class);

		public static class Cuota extends COBISInputValue {
			public Cuota() {
				this.init("VA_3536QQLYNZQHEDG_766540","Cuota");
			}
		}			

		public static class Observacion extends COBISInputValue {
			public Observacion() {
				this.init("VA_6875WVJOSGQGECU_448540","Observacion");
			}
		}			
	}
	
	public static class GridListaCuotas extends COBISGrid {
		public GridListaCuotas() {
			this.init("QV_PT79_QME13", "QV_PT79_QME13");
		} 

	public static class Buttons {
		private Buttons() {
			throw new IllegalStateException("Buttons Grid is a utility class");
		}



		public static final BtnGridCommandIdCEQV201QVPT79QME13619 btnGridCommandIdCEQV201QVPT79QME13619 = Singleton.getInstance(BtnGridCommandIdCEQV201QVPT79QME13619.class);

		public static class BtnGridCommandIdCEQV201QVPT79QME13619 extends COBISButton {
			public BtnGridCommandIdCEQV201QVPT79QME13619() {
				this.init("CEQV_201QV_PT79_QME13_619","Reversar");
			}
		}
	}
		public static final Pagar pagar = Singleton.getInstance(Pagar.class);
		public static final No no = Singleton.getInstance(No.class);
		public static final Fecha fecha = Singleton.getInstance(Fecha.class);
		public static final Valor valor = Singleton.getInstance(Valor.class);
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
		public static final Estado estado = Singleton.getInstance(Estado.class);
		public static final Plazo plazo = Singleton.getInstance(Plazo.class);
		public static final FechaIng fechaIng = Singleton.getInstance(FechaIng.class);
		public static final FechaVal fechaVal = Singleton.getInstance(FechaVal.class);
		public static final DiasCuota diasCuota = Singleton.getInstance(DiasCuota.class);
		public static final FechaUltPag fechaUltPag = Singleton.getInstance(FechaUltPag.class);
		public static final IntGanado intGanado = Singleton.getInstance(IntGanado.class);
		public static final ValorNeto valorNeto = Singleton.getInstance(ValorNeto.class);
		public static final Impuesto impuesto = Singleton.getInstance(Impuesto.class);

		public static class Pagar extends COBISCheckBox {
			public Pagar() {
				this.init("VA_CHECKBOXPVLVDUN_405540","Pagar");
			}
		}			

		public static class No extends COBISInputValue {
			public No() {
				this.init("VA_TEXTINPUTBOXWWA_864540","Cuota");
			}
		}			

		public static class Fecha extends COBISDatePicker {
			public Fecha() {
				this.init("VA_DATEFIELDJYABKY_417540","FechadePago");
			}
		}			

		public static class Valor extends COBISInputValue {
			public Valor() {
				this.init("VA_TEXTINPUTBOXVRK_755540","Valor");
			}
		}			

		public static class Ente extends COBISInputValue {
			public Ente() {
				this.init("VA_TEXTINPUTBOXOTC_575540","Ente");
			}
		}			

		public static class Nombre extends COBISInputValue {
			public Nombre() {
				this.init("VA_TEXTINPUTBOXXVI_736540","Nombre");
			}
		}			

		public static class Direccion extends COBISInputValue {
			public Direccion() {
				this.init("VA_TEXTINPUTBOXDXP_688540","Direccion");
			}
		}			

		public static class Oficina extends COBISInputValue {
			public Oficina() {
				this.init("VA_TEXTINPUTBOXIKJ_691540","Oficina");
			}
		}			

		public static class Cuenta extends COBISInputValue {
			public Cuenta() {
				this.init("VA_TEXTINPUTBOXOWP_959540","Cuenta");
			}
		}			

		public static class Tipo extends COBISInputValue {
			public Tipo() {
				this.init("VA_TEXTINPUTBOXHBH_760540","Tipo");
			}
		}			

		public static class Capital extends COBISInputValue {
			public Capital() {
				this.init("VA_TEXTINPUTBOXYXH_412540","Capital");
			}
		}			

		public static class FormaPago extends COBISInputValue {
			public FormaPago() {
				this.init("VA_TEXTINPUTBOXUAJ_248540","FormaPago");
			}
		}			

		public static class Moneda extends COBISInputValue {
			public Moneda() {
				this.init("VA_TEXTINPUTBOXCSP_955540","Moneda");
			}
		}			

		public static class Tasa extends COBISInputValue {
			public Tasa() {
				this.init("VA_TEXTINPUTBOXTOH_979540","Tasa");
			}
		}			

		public static class FechaVen extends COBISDatePicker {
			public FechaVen() {
				this.init("VA_DATEFIELDJQZVLM_672540","FechaVen");
			}
		}			

		public static class Estado extends COBISInputValue {
			public Estado() {
				this.init("VA_TEXTINPUTBOXLDL_488540","Estado");
			}
		}			

		public static class Plazo extends COBISInputValue {
			public Plazo() {
				this.init("VA_TEXTINPUTBOXAIF_859540","Plazo");
			}
		}			

		public static class FechaIng extends COBISDatePicker {
			public FechaIng() {
				this.init("VA_DATEFIELDFBLQEE_705540","FechaIng");
			}
		}			

		public static class FechaVal extends COBISDatePicker {
			public FechaVal() {
				this.init("VA_DATEFIELDKEURWU_177540","FechaVal");
			}
		}			

		public static class DiasCuota extends COBISInputValue {
			public DiasCuota() {
				this.init("VA_TEXTINPUTBOXBRZ_332540","DiasCuota");
			}
		}			

		public static class FechaUltPag extends COBISDatePicker {
			public FechaUltPag() {
				this.init("VA_DATEFIELDRSMWAO_567540","FechaUltPag");
			}
		}			

		public static class IntGanado extends COBISInputValue {
			public IntGanado() {
				this.init("VA_TEXTINPUTBOXHUV_222540","IntGanado");
			}
		}			

		public static class ValorNeto extends COBISInputValue {
			public ValorNeto() {
				this.init("VA_TEXTINPUTBOXRJE_904540","ValorNeto");
			}
		}			

		public static class Impuesto extends COBISInputValue {
			public Impuesto() {
				this.init("VA_TEXTINPUTBOXAOV_445540","Impuesto");
			}
		}			
	}
}
