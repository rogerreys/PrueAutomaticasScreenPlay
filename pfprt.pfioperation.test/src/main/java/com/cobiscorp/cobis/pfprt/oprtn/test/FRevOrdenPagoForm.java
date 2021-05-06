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

public class FRevOrdenPagoForm{
	public static final Operacion operacion = Singleton.getInstance(Operacion.class);

	public static final GridListaOrdenPago gridListaOrdenPago = Singleton.getInstance(GridListaOrdenPago.class);
	private FRevOrdenPagoForm() {
		throw new IllegalStateException("FRevOrdenPagoForm is a utility class");
	}
	public static class Buttons {
		private Buttons() {
			throw new IllegalStateException("Buttons is a utility class");
		}
		public static final CmdCommand1IdCMTPFPRTLD8PU cmdCommand1IdCMTPFPRTLD8PU = Singleton.getInstance(CmdCommand1IdCMTPFPRTLD8PU.class);
		
		public static class CmdCommand1IdCMTPFPRTLD8PU extends COBISButton{
			public CmdCommand1IdCMTPFPRTLD8PU () {
				this.init("CM_TPFPRTLD_8PU", "Aceptar");
			}
		}
	

	}
	

	public static class Operacion {
	
		private Operacion() {
			throw new IllegalStateException("FRevOrdenPagoForm is a utility class");
		}
		
		public static final Observacion observacion = Singleton.getInstance(Observacion.class);

		public static class Observacion extends COBISInputValue {
			public Observacion() {
				this.init("VA_OBSERVACIONQMZQ_157173","Observacion");
			}
		}			
	}
	
	public static class GridListaOrdenPago extends COBISGrid {
		public GridListaOrdenPago() {
			this.init("QV_IK37_HMA51", "QV_IK37_HMA51");
		} 

		public static final Pagar pagar = Singleton.getInstance(Pagar.class);
		public static final NumBanco numBanco = Singleton.getInstance(NumBanco.class);
		public static final Tipo tipo = Singleton.getInstance(Tipo.class);
		public static final Monto monto = Singleton.getInstance(Monto.class);
		public static final Cuenta cuenta = Singleton.getInstance(Cuenta.class);
		public static final Moneda moneda = Singleton.getInstance(Moneda.class);
		public static final Operacion operacion = Singleton.getInstance(Operacion.class);
		public static final Transaccion transaccion = Singleton.getInstance(Transaccion.class);
		public static final SecuencialOrdenPago secuencialOrdenPago = Singleton.getInstance(SecuencialOrdenPago.class);
		public static final Alterno alterno = Singleton.getInstance(Alterno.class);
		public static final CodTrn codTrn = Singleton.getInstance(CodTrn.class);
		public static final TipoCliente tipoCliente = Singleton.getInstance(TipoCliente.class);
		public static final Beneficiario beneficiario = Singleton.getInstance(Beneficiario.class);
		public static final SecuencialEmisionCheque secuencialEmisionCheque = Singleton.getInstance(SecuencialEmisionCheque.class);
		public static final Estado estado = Singleton.getInstance(Estado.class);
		public static final Cheque cheque = Singleton.getInstance(Cheque.class);
		public static final FechaSolicitud fechaSolicitud = Singleton.getInstance(FechaSolicitud.class);
		public static final SubSecuencialOrdenPago subSecuencialOrdenPago = Singleton.getInstance(SubSecuencialOrdenPago.class);
		public static final Oficina oficina = Singleton.getInstance(Oficina.class);
		public static final Caja caja = Singleton.getInstance(Caja.class);
		public static final Banco banco = Singleton.getInstance(Banco.class);
		public static final FechaMov fechaMov = Singleton.getInstance(FechaMov.class);

		public static class Pagar extends COBISCheckBox {
			public Pagar() {
				this.init("VA_CHECKBOXVPUBWVE_748173","Seleccionar");
			}
		}			

		public static class NumBanco extends COBISInputValue {
			public NumBanco() {
				this.init("VA_TEXTINPUTBOXBYT_897173","NumDeposito");
			}
		}			

		public static class Tipo extends COBISInputValue {
			public Tipo() {
				this.init("VA_TEXTINPUTBOXFMG_817173","Tipo");
			}
		}			

		public static class Monto extends COBISInputValue {
			public Monto() {
				this.init("VA_TEXTINPUTBOXTZE_588173","Monto");
			}
		}			

		public static class Cuenta extends COBISInputValue {
			public Cuenta() {
				this.init("VA_TEXTINPUTBOXQMW_579173","Cuenta");
			}
		}			

		public static class Moneda extends COBISDropDownList {
			public Moneda() {
				this.init("VA_TEXTINPUTBOXCBA_336173","Moneda");
			}
		}			

		public static class Operacion extends COBISInputValue {
			public Operacion() {
				this.init("VA_TEXTINPUTBOXYVJ_434173","Operacion");
			}
		}			

		public static class Transaccion extends COBISInputValue {
			public Transaccion() {
				this.init("VA_TEXTINPUTBOXCWH_442173","Transaccion");
			}
		}			

		public static class SecuencialOrdenPago extends COBISInputValue {
			public SecuencialOrdenPago() {
				this.init("VA_TEXTINPUTBOXLZR_157173","Secuencial");
			}
		}			

		public static class Alterno extends COBISInputValue {
			public Alterno() {
				this.init("VA_TEXTINPUTBOXSZG_284173","Alterno");
			}
		}			

		public static class CodTrn extends COBISInputValue {
			public CodTrn() {
				this.init("VA_TEXTINPUTBOXNYV_307173","CodTrn");
			}
		}			

		public static class TipoCliente extends COBISInputValue {
			public TipoCliente() {
				this.init("VA_TEXTINPUTBOXLMP_511173","TipoCliente");
			}
		}			

		public static class Beneficiario extends COBISInputValue {
			public Beneficiario() {
				this.init("VA_TEXTINPUTBOXFRK_799173","Beneficiario");
			}
		}			

		public static class SecuencialEmisionCheque extends COBISInputValue {
			public SecuencialEmisionCheque() {
				this.init("VA_TEXTINPUTBOXZEU_564173","SecuencialCheque");
			}
		}			

		public static class Estado extends COBISInputValue {
			public Estado() {
				this.init("VA_TEXTINPUTBOXDOW_283173","Estado");
			}
		}			

		public static class Cheque extends COBISInputValue {
			public Cheque() {
				this.init("VA_TEXTINPUTBOXKRF_596173","Cheque");
			}
		}			

		public static class FechaSolicitud extends COBISDatePicker {
			public FechaSolicitud() {
				this.init("VA_DATEFIELDJQAEWU_778173","Fecha");
			}
		}			

		public static class SubSecuencialOrdenPago extends COBISInputValue {
			public SubSecuencialOrdenPago() {
				this.init("VA_TEXTINPUTBOXVUK_227173","Alterno");
			}
		}			

		public static class Oficina extends COBISInputValue {
			public Oficina() {
				this.init("VA_TEXTINPUTBOXDQY_283173","Oficina");
			}
		}			

		public static class Caja extends COBISInputValue {
			public Caja() {
				this.init("VA_TEXTINPUTBOXVER_124173","Caja");
			}
		}			

		public static class Banco extends COBISInputValue {
			public Banco() {
				this.init("VA_TEXTINPUTBOXNVW_155173","Banco");
			}
		}			

		public static class FechaMov extends COBISDatePicker {
			public FechaMov() {
				this.init("VA_DATEFIELDTQTKZK_565173","FechaMov");
			}
		}			
	}
}
