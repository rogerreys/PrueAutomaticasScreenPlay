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

public class FCuentasForm{

	public static final GridListaCuentaBanco gridListaCuentaBanco = Singleton.getInstance(GridListaCuentaBanco.class);
	public static final GridListaCuentas gridListaCuentas = Singleton.getInstance(GridListaCuentas.class);
	private FCuentasForm() {
		throw new IllegalStateException("FCuentasForm is a utility class");
	}
	
	public static class GridListaCuentaBanco extends COBISGrid {
		public GridListaCuentaBanco() {
			this.init("QV_LZ33_KBF97", "QV_LZ33_KBF97");
		} 

		public static final CodigoBanco codigoBanco = Singleton.getInstance(CodigoBanco.class);
		public static final Banco banco = Singleton.getInstance(Banco.class);
		public static final NumeroCuenta numeroCuenta = Singleton.getInstance(NumeroCuenta.class);

		public static class CodigoBanco extends COBISInputValue {
			public CodigoBanco() {
				this.init("VA_TEXTINPUTBOXTPN_304332","CodigoBanco");
			}
		}			

		public static class Banco extends COBISInputValue {
			public Banco() {
				this.init("VA_TEXTINPUTBOXUPX_418332","Banco");
			}
		}			

		public static class NumeroCuenta extends COBISInputValue {
			public NumeroCuenta() {
				this.init("VA_TEXTINPUTBOXKHN_873332","Cuenta");
			}
		}			
	}
	
	public static class GridListaCuentas extends COBISGrid {
		public GridListaCuentas() {
			this.init("QV_9795_86035", "QV_9795_86035");
		} 

		public static final IdCuenta idCuenta = Singleton.getInstance(IdCuenta.class);
		public static final NumeroCuenta numeroCuenta = Singleton.getInstance(NumeroCuenta.class);
		public static final CodigoMoneda codigoMoneda = Singleton.getInstance(CodigoMoneda.class);
		public static final Cliente cliente = Singleton.getInstance(Cliente.class);
		public static final Nombre nombre = Singleton.getInstance(Nombre.class);
		public static final SaldoDisponible saldoDisponible = Singleton.getInstance(SaldoDisponible.class);
		public static final Moneda moneda = Singleton.getInstance(Moneda.class);
		public static final CodigoProductoCobis codigoProductoCobis = Singleton.getInstance(CodigoProductoCobis.class);

		public static class IdCuenta extends COBISInputValue {
			public IdCuenta() {
				this.init("VA_TEXTINPUTBOXTKY_927332","IdCuenta");
			}
		}			

		public static class NumeroCuenta extends COBISInputValue {
			public NumeroCuenta() {
				this.init("VA_TEXTINPUTBOXBHL_292332","Cuenta");
			}
		}			

		public static class CodigoMoneda extends COBISInputValue {
			public CodigoMoneda() {
				this.init("VA_TEXTINPUTBOXRPD_294332","CodigoMoneda");
			}
		}			

		public static class Cliente extends COBISInputValue {
			public Cliente() {
				this.init("VA_TEXTINPUTBOXLWJ_451332","Cliente");
			}
		}			

		public static class Nombre extends COBISInputValue {
			public Nombre() {
				this.init("VA_TEXTINPUTBOXQIM_516332","Nombre");
			}
		}			

		public static class SaldoDisponible extends COBISInputValue {
			public SaldoDisponible() {
				this.init("VA_TEXTINPUTBOXVAK_359332","SaldoDisponible");
			}
		}			

		public static class Moneda extends COBISInputValue {
			public Moneda() {
				this.init("VA_TEXTINPUTBOXBWQ_669332","Moneda");
			}
		}			

		public static class CodigoProductoCobis extends COBISInputValue {
			public CodigoProductoCobis() {
				this.init("VA_TEXTINPUTBOXFCY_826332","CodigoProductoCobis");
			}
		}			
	}
}
