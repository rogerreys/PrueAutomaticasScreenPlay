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

public class FOrdenPagoForm{
	public static final FiltroBusquedaOrdPago filtroBusquedaOrdPago = Singleton.getInstance(FiltroBusquedaOrdPago.class);

	public static final GridListaOrdenPago gridListaOrdenPago = Singleton.getInstance(GridListaOrdenPago.class);
	private FOrdenPagoForm() {
		throw new IllegalStateException("FOrdenPagoForm is a utility class");
	}
	public static class Buttons {
		private Buttons() {
			throw new IllegalStateException("Buttons is a utility class");
		}
		public static final CmdCommand1IdCMTPFPRTKZ83P cmdCommand1IdCMTPFPRTKZ83P = Singleton.getInstance(CmdCommand1IdCMTPFPRTKZ83P.class);
		
		public static class CmdCommand1IdCMTPFPRTKZ83P extends COBISButton{
			public CmdCommand1IdCMTPFPRTKZ83P () {
				this.init("CM_TPFPRTKZ_83P", "Buscar");
			}
		}
	

	}
	

	public static class FiltroBusquedaOrdPago {
	
		private FiltroBusquedaOrdPago() {
			throw new IllegalStateException("FOrdenPagoForm is a utility class");
		}
		
		public static final Tipo tipo = Singleton.getInstance(Tipo.class);
		public static final NumeroOperacion numeroOperacion = Singleton.getInstance(NumeroOperacion.class);
		public static final FechaIni fechaIni = Singleton.getInstance(FechaIni.class);
		public static final FechaFin fechaFin = Singleton.getInstance(FechaFin.class);

		public static class Tipo extends COBISDropDownList {
			public Tipo() {
				this.init("VA_8734ZEMLIKWUKPS_262827","FormadePago");
			}
		}			

		public static class NumeroOperacion extends COBISInputValue {
			public NumeroOperacion() {
				this.init("VA_NUMEROOPERACNIN_924827","NodeDPF");
			}
		}			

		public static class FechaIni extends COBISDatePicker {
			public FechaIni() {
				this.init("VA_5855INABGXVUECU_816827","FechaInicio");
			}
		}			

		public static class FechaFin extends COBISDatePicker {
			public FechaFin() {
				this.init("VA_1335UFMSDFWFHIM_680827","FechaFin");
			}
		}			
	}
	
	public static class GridListaOrdenPago extends COBISGrid {
		public GridListaOrdenPago() {
			this.init("QV_2337_21156", "QV_2337_21156");
		} 

		public static final NumBanco numBanco = Singleton.getInstance(NumBanco.class);
		public static final Transaccion transaccion = Singleton.getInstance(Transaccion.class);
		public static final Beneficiario beneficiario = Singleton.getInstance(Beneficiario.class);
		public static final Monto monto = Singleton.getInstance(Monto.class);
		public static final FechaSolicitud fechaSolicitud = Singleton.getInstance(FechaSolicitud.class);
		public static final Operacion operacion = Singleton.getInstance(Operacion.class);
		public static final Moneda moneda = Singleton.getInstance(Moneda.class);
		public static final SecuencialOrdenPago secuencialOrdenPago = Singleton.getInstance(SecuencialOrdenPago.class);
		public static final SubSecuencialOrdenPago subSecuencialOrdenPago = Singleton.getInstance(SubSecuencialOrdenPago.class);
		public static final Oficina oficina = Singleton.getInstance(Oficina.class);
		public static final CodTrn codTrn = Singleton.getInstance(CodTrn.class);
		public static final Caja caja = Singleton.getInstance(Caja.class);
		public static final Cuenta cuenta = Singleton.getInstance(Cuenta.class);
		public static final Banco banco = Singleton.getInstance(Banco.class);
		public static final FechaMov fechaMov = Singleton.getInstance(FechaMov.class);

		public static class NumBanco extends COBISInputValue {
			public NumBanco() {
				this.init("VA_TEXTINPUTBOXUSK_852827","NodeDPF");
			}
		}			

		public static class Transaccion extends COBISInputValue {
			public Transaccion() {
				this.init("VA_TEXTINPUTBOXFOW_178827","Transaccion");
			}
		}			

		public static class Beneficiario extends COBISInputValue {
			public Beneficiario() {
				this.init("VA_TEXTINPUTBOXVKT_810827","Beneficiario");
			}
		}			

		public static class Monto extends COBISInputValue {
			public Monto() {
				this.init("VA_TEXTINPUTBOXMJO_729827","Monto");
			}
		}			

		public static class FechaSolicitud extends COBISDatePicker {
			public FechaSolicitud() {
				this.init("VA_DATEFIELDHBYSOD_416827","Fecha");
			}
		}			

		public static class Operacion extends COBISInputValue {
			public Operacion() {
				this.init("VA_TEXTINPUTBOXEOD_538827","Operacion");
			}
		}			

		public static class Moneda extends COBISInputValue {
			public Moneda() {
				this.init("VA_TEXTINPUTBOXMRP_160827","Moneda");
			}
		}			

		public static class SecuencialOrdenPago extends COBISInputValue {
			public SecuencialOrdenPago() {
				this.init("VA_TEXTINPUTBOXARA_316827","Secuencial");
			}
		}			

		public static class SubSecuencialOrdenPago extends COBISInputValue {
			public SubSecuencialOrdenPago() {
				this.init("VA_TEXTINPUTBOXGYA_956827","Alterno");
			}
		}			

		public static class Oficina extends COBISInputValue {
			public Oficina() {
				this.init("VA_TEXTINPUTBOXCAE_153827","Oficina");
			}
		}			

		public static class CodTrn extends COBISInputValue {
			public CodTrn() {
				this.init("VA_TEXTINPUTBOXTHB_330827","CodTrn");
			}
		}			

		public static class Caja extends COBISInputValue {
			public Caja() {
				this.init("VA_TEXTINPUTBOXZSG_263827","Caja");
			}
		}			

		public static class Cuenta extends COBISInputValue {
			public Cuenta() {
				this.init("VA_TEXTINPUTBOXKFO_857827","Cuenta");
			}
		}			

		public static class Banco extends COBISInputValue {
			public Banco() {
				this.init("VA_TEXTINPUTBOXCFR_786827","Banco");
			}
		}			

		public static class FechaMov extends COBISDatePicker {
			public FechaMov() {
				this.init("VA_DATEFIELDKMPBVS_966827","FechaMov");
			}
		}			
	}
}
