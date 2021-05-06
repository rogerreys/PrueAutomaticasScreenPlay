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

public class FSpreadForm{
	public static final DetalleOperacion detalleOperacion = Singleton.getInstance(DetalleOperacion.class);

	private FSpreadForm() {
		throw new IllegalStateException("FSpreadForm is a utility class");
	}
	public static class Buttons {
		private Buttons() {
			throw new IllegalStateException("Buttons is a utility class");
		}
		public static final CmdCommand1IdCMTPFPRTCZO8Y cmdCommand1IdCMTPFPRTCZO8Y = Singleton.getInstance(CmdCommand1IdCMTPFPRTCZO8Y.class);
		
		public static class CmdCommand1IdCMTPFPRTCZO8Y extends COBISButton{
			public CmdCommand1IdCMTPFPRTCZO8Y () {
				this.init("CM_TPFPRTCZ_O8Y", "Aceptar");
			}
		}
	
		public static final CmdCommand3IdCMTPFPRTCZPRP cmdCommand3IdCMTPFPRTCZPRP = Singleton.getInstance(CmdCommand3IdCMTPFPRTCZPRP.class);
		
		public static class CmdCommand3IdCMTPFPRTCZPRP extends COBISButton{
			public CmdCommand3IdCMTPFPRTCZPRP () {
				this.init("CM_TPFPRTCZ_PRP", "Solicitar Autorización");
			}
		}
	
		public static final CmdCommand2IdCMTPFPRTCZTN cmdCommand2IdCMTPFPRTCZTN = Singleton.getInstance(CmdCommand2IdCMTPFPRTCZTN.class);
		
		public static class CmdCommand2IdCMTPFPRTCZTN extends COBISButton{
			public CmdCommand2IdCMTPFPRTCZTN () {
				this.init("CM_TPFPRTCZ__TN", "Cancelar");
			}
		}
	

	}
	

	public static class DetalleOperacion {
	
		private DetalleOperacion() {
			throw new IllegalStateException("FSpreadForm is a utility class");
		}
		
		public static final MnemonicoTasa mnemonicoTasa = Singleton.getInstance(MnemonicoTasa.class);
		public static final TasaBase tasaBase = Singleton.getInstance(TasaBase.class);
		public static final Operador operador = Singleton.getInstance(Operador.class);
		public static final Spread spread = Singleton.getInstance(Spread.class);
		public static final Tasa tasa = Singleton.getInstance(Tasa.class);

		public static class MnemonicoTasa extends COBISDropDownList {
			public MnemonicoTasa() {
				this.init("VA_3313QLOQTCDPLZK_800449","TasaReferencial");
			}
		}			

		public static class TasaBase extends COBISInputValue {
			public TasaBase() {
				this.init("VA_7403HYIZREIAPYV_819449","TasaBase");
			}
		}			

		public static class Operador extends COBISDropDownList {
			public Operador() {
				this.init("VA_7808XDWSHZMHPKG_324449","Operador");
			}
		}			

		public static class Spread extends COBISInputValue {
			public Spread() {
				this.init("VA_1775ZXMEUGIPAWB_647449","Spread");
			}
		}			

		public static class Tasa extends COBISInputValue {
			public Tasa() {
				this.init("VA_6516DDMICYZGQEO_493449","Tasa");
			}
		}			
	}
}
