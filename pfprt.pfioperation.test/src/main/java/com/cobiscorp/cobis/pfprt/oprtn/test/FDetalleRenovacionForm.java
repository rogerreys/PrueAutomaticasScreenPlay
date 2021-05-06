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

public class FDetalleRenovacionForm{

	private FDetalleRenovacionForm() {
		throw new IllegalStateException("FDetalleRenovacionForm is a utility class");
	}
	public static class Layouts {
		private Layouts() {
			throw new IllegalStateException("Layouts is a utility class");
		}
		public static final LytGroup1975IdGFDETALLOOE978687 lytGroup1975IdGFDETALLOOE978687 = Singleton.getInstance(LytGroup1975IdGFDETALLOOE978687.class);
		
		public static class LytGroup1975IdGFDETALLOOE978687 extends COBISTab {
			public LytGroup1975IdGFDETALLOOE978687(){
				this.init("G_FDETALLOOE_978687", "Clientes");
			}
		}
		
		public static final LytGroup2351IdGFDETALLRRE769687 lytGroup2351IdGFDETALLRRE769687 = Singleton.getInstance(LytGroup2351IdGFDETALLRRE769687.class);
		
		public static class LytGroup2351IdGFDETALLRRE769687 extends COBISTab {
			public LytGroup2351IdGFDETALLRRE769687(){
				this.init("G_FDETALLRRE_769687", "Operación");
			}
		}
		
		public static final LytGroup2147IdGFDETALLVNE157687 lytGroup2147IdGFDETALLVNE157687 = Singleton.getInstance(LytGroup2147IdGFDETALLVNE157687.class);
		
		public static class LytGroup2147IdGFDETALLVNE157687 extends COBISTab {
			public LytGroup2147IdGFDETALLVNE157687(){
				this.init("G_FDETALLVNE_157687", "Recepción de Fondos");
			}
		}
		
		public static final LytGroup2746IdGFDETALLNAE363687 lytGroup2746IdGFDETALLNAE363687 = Singleton.getInstance(LytGroup2746IdGFDETALLNAE363687.class);
		
		public static class LytGroup2746IdGFDETALLNAE363687 extends COBISTab {
			public LytGroup2746IdGFDETALLNAE363687(){
				this.init("G_FDETALLNAE_363687", "Forma de Pago");
			}
		}
		
	}
	
	public static class Buttons {
		private Buttons() {
			throw new IllegalStateException("Buttons is a utility class");
		}

	}
	
}
