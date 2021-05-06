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

public class FVistaPagoInteresForm{
	public static final DetalleOperacion detalleOperacion = Singleton.getInstance(DetalleOperacion.class);
	public static final DetallePagoInteres detallePagoInteres = Singleton.getInstance(DetallePagoInteres.class);

	public static final GridListaCuotas gridListaCuotas = Singleton.getInstance(GridListaCuotas.class);
	private FVistaPagoInteresForm() {
		throw new IllegalStateException("FVistaPagoInteresForm is a utility class");
	}
	public static class Buttons {
		private Buttons() {
			throw new IllegalStateException("Buttons is a utility class");
		}
		public static final CmdCommand1IdCMTPFPRTZGMRF cmdCommand1IdCMTPFPRTZGMRF = Singleton.getInstance(CmdCommand1IdCMTPFPRTZGMRF.class);
		
		public static class CmdCommand1IdCMTPFPRTZGMRF extends COBISButton{
			public CmdCommand1IdCMTPFPRTZGMRF () {
				this.init("CM_TPFPRTZG_MRF", "Anterior");
			}
		}
	
		public static final CmdCommand2IdCMTPFPRTZGPRT cmdCommand2IdCMTPFPRTZGPRT = Singleton.getInstance(CmdCommand2IdCMTPFPRTZGPRT.class);
		
		public static class CmdCommand2IdCMTPFPRTZGPRT extends COBISButton{
			public CmdCommand2IdCMTPFPRTZGPRT () {
				this.init("CM_TPFPRTZG_PRT", "Siguiente");
			}
		}
	

	}
	

	public static class DetalleOperacion {
	
		private DetalleOperacion() {
			throw new IllegalStateException("FVistaPagoInteresForm is a utility class");
		}
		
		public static final TotalInteresGanado totalInteresGanado = Singleton.getInstance(TotalInteresGanado.class);
		public static final TotalInteresPagado totalInteresPagado = Singleton.getInstance(TotalInteresPagado.class);
		public static final InteresGanado interesGanado = Singleton.getInstance(InteresGanado.class);

		public static class TotalInteresGanado extends COBISInputValue {
			public TotalInteresGanado() {
				this.init("VA_8313GUALEPCUKYK_428333","TotalInteresGanado");
			}
		}			

		public static class TotalInteresPagado extends COBISInputValue {
			public TotalInteresPagado() {
				this.init("VA_9022WYWZACZIYWW_536333","TotalInteresPagado");
			}
		}			

		public static class InteresGanado extends COBISInputValue {
			public InteresGanado() {
				this.init("VA_3308WMYDELFUAIE_173333","InteresGanado");
			}
		}			
	}

	public static class DetallePagoInteres {
	
		private DetallePagoInteres() {
			throw new IllegalStateException("FVistaPagoInteresForm is a utility class");
		}
		
		public static final MontoPago montoPago = Singleton.getInstance(MontoPago.class);
		public static final Impuesto impuesto = Singleton.getInstance(Impuesto.class);
		public static final ValorItf valorItf = Singleton.getInstance(ValorItf.class);
		public static final MontoTotal montoTotal = Singleton.getInstance(MontoTotal.class);
		public static final Cuota cuota = Singleton.getInstance(Cuota.class);
		public static final Observacion observacion = Singleton.getInstance(Observacion.class);

		public static class MontoPago extends COBISInputValue {
			public MontoPago() {
				this.init("VA_6482WFIICNDAGSA_359333","ValoraPagar");
			}
		}			

		public static class Impuesto extends COBISInputValue {
			public Impuesto() {
				this.init("VA_1488KOFTNNFPMUP_574333","Impuesto");
			}
		}			

		public static class ValorItf extends COBISInputValue {
			public ValorItf() {
				this.init("VA_6152ZTMDBBDCECP_570333","ITF");
			}
		}			

		public static class MontoTotal extends COBISInputValue {
			public MontoTotal() {
				this.init("VA_5022BCCZZMZJPTE_174333","Total");
			}
		}			

		public static class Cuota extends COBISInputValue {
			public Cuota() {
				this.init("VA_9891CNAUFFVXQHQ_986333","Cuota");
			}
		}			

		public static class Observacion extends COBISInputValue {
			public Observacion() {
				this.init("VA_6131INVGJQGDTIG_103333","Observacion");
			}
		}			
	}
	
	public static class GridListaCuotas extends COBISGrid {
		public GridListaCuotas() {
			this.init("QV_8979_26020", "QV_8979_26020");
		} 

	public static class Buttons {
		private Buttons() {
			throw new IllegalStateException("Buttons Grid is a utility class");
		}



		public static final BtnGridCommandIdCEQV201QV897926020368 btnGridCommandIdCEQV201QV897926020368 = Singleton.getInstance(BtnGridCommandIdCEQV201QV897926020368.class);

		public static class BtnGridCommandIdCEQV201QV897926020368 extends COBISButton {
			public BtnGridCommandIdCEQV201QV897926020368() {
				this.init("CEQV_201QV_8979_26020_368","Pagar");
			}
		}
	}
		public static final Pagar pagar = Singleton.getInstance(Pagar.class);
		public static final No no = Singleton.getInstance(No.class);
		public static final Fecha fecha = Singleton.getInstance(Fecha.class);
		public static final Valor valor = Singleton.getInstance(Valor.class);
		public static final Impuesto impuesto = Singleton.getInstance(Impuesto.class);
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

		public static class Pagar extends COBISCheckBox {
			public Pagar() {
				this.init("VA_CHECKBOXDHXJENK_935333","Pagar");
			}
		}			

		public static class No extends COBISInputValue {
			public No() {
				this.init("VA_TEXTINPUTBOXUQC_561333","Cuota");
			}
		}			

		public static class Fecha extends COBISDatePicker {
			public Fecha() {
				this.init("VA_DATEFIELDYHXROJ_555333","FechadePago");
			}
		}			

		public static class Valor extends COBISInputValue {
			public Valor() {
				this.init("VA_TEXTINPUTBOXFJX_368333","Valor");
			}
		}			

		public static class Impuesto extends COBISInputValue {
			public Impuesto() {
				this.init("VA_TEXTINPUTBOXEQC_335333","Impuesto");
			}
		}			

		public static class Ente extends COBISInputValue {
			public Ente() {
				this.init("VA_TEXTINPUTBOXNEN_601333","Ente");
			}
		}			

		public static class Nombre extends COBISInputValue {
			public Nombre() {
				this.init("VA_TEXTINPUTBOXFGH_562333","Nombre");
			}
		}			

		public static class Direccion extends COBISInputValue {
			public Direccion() {
				this.init("VA_TEXTINPUTBOXDRN_704333","Direccion");
			}
		}			

		public static class Oficina extends COBISInputValue {
			public Oficina() {
				this.init("VA_TEXTINPUTBOXQSV_987333","Oficina");
			}
		}			

		public static class Cuenta extends COBISInputValue {
			public Cuenta() {
				this.init("VA_TEXTINPUTBOXTBU_653333","Cuenta");
			}
		}			

		public static class Tipo extends COBISInputValue {
			public Tipo() {
				this.init("VA_TEXTINPUTBOXHJU_829333","Tipo");
			}
		}			

		public static class Capital extends COBISInputValue {
			public Capital() {
				this.init("VA_TEXTINPUTBOXOWG_556333","Capital");
			}
		}			

		public static class FormaPago extends COBISInputValue {
			public FormaPago() {
				this.init("VA_TEXTINPUTBOXJOG_416333","FormaPago");
			}
		}			

		public static class Moneda extends COBISInputValue {
			public Moneda() {
				this.init("VA_TEXTINPUTBOXLWQ_895333","Moneda");
			}
		}			

		public static class Tasa extends COBISInputValue {
			public Tasa() {
				this.init("VA_TEXTINPUTBOXSCH_340333","Tasa");
			}
		}			

		public static class FechaVen extends COBISDatePicker {
			public FechaVen() {
				this.init("VA_DATEFIELDZDPYOM_272333","FechaVen");
			}
		}			

		public static class Estado extends COBISInputValue {
			public Estado() {
				this.init("VA_TEXTINPUTBOXGYB_314333","Estado");
			}
		}			

		public static class Plazo extends COBISInputValue {
			public Plazo() {
				this.init("VA_TEXTINPUTBOXPJH_971333","Plazo");
			}
		}			

		public static class FechaIng extends COBISDatePicker {
			public FechaIng() {
				this.init("VA_DATEFIELDSOSLLO_747333","FechaIng");
			}
		}			

		public static class FechaVal extends COBISDatePicker {
			public FechaVal() {
				this.init("VA_DATEFIELDXUZQIX_578333","FechaVal");
			}
		}			

		public static class DiasCuota extends COBISInputValue {
			public DiasCuota() {
				this.init("VA_TEXTINPUTBOXGGO_930333","DiasCuota");
			}
		}			

		public static class FechaUltPag extends COBISDatePicker {
			public FechaUltPag() {
				this.init("VA_DATEFIELDRANCUX_203333","FechaUltPag");
			}
		}			

		public static class IntGanado extends COBISInputValue {
			public IntGanado() {
				this.init("VA_TEXTINPUTBOXHHM_761333","IntGanado");
			}
		}			

		public static class ValorNeto extends COBISInputValue {
			public ValorNeto() {
				this.init("VA_TEXTINPUTBOXHRU_157333","ValorNeto");
			}
		}			
	}
}
