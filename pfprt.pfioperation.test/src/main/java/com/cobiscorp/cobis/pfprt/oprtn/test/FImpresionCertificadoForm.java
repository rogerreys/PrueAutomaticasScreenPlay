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

public class FImpresionCertificadoForm{
	public static final ImpresionCertificado impresionCertificado = Singleton.getInstance(ImpresionCertificado.class);

	private FImpresionCertificadoForm() {
		throw new IllegalStateException("FImpresionCertificadoForm is a utility class");
	}
	public static class Buttons {
		private Buttons() {
			throw new IllegalStateException("Buttons is a utility class");
		}
		public static final CmdCommand1IdCMTPFPRTLKM0R cmdCommand1IdCMTPFPRTLKM0R = Singleton.getInstance(CmdCommand1IdCMTPFPRTLKM0R.class);
		
		public static class CmdCommand1IdCMTPFPRTLKM0R extends COBISButton{
			public CmdCommand1IdCMTPFPRTLKM0R () {
				this.init("CM_TPFPRTLK_M0R", "Imprimir");
			}
		}
	
		public static final CmdCommand2IdCMTPFPRTLK8R cmdCommand2IdCMTPFPRTLK8R = Singleton.getInstance(CmdCommand2IdCMTPFPRTLK8R.class);
		
		public static class CmdCommand2IdCMTPFPRTLK8R extends COBISButton{
			public CmdCommand2IdCMTPFPRTLK8R () {
				this.init("CM_TPFPRTLK_8R_", "Cancelar");
			}
		}
	

	}
	

	public static class ImpresionCertificado {
	
		private ImpresionCertificado() {
			throw new IllegalStateException("FImpresionCertificadoForm is a utility class");
		}
		
		public static final NumeroOperacion numeroOperacion = Singleton.getInstance(NumeroOperacion.class);
		public static final NumeroDuplicados numeroDuplicados = Singleton.getInstance(NumeroDuplicados.class);
		public static final Preimpreso preimpreso = Singleton.getInstance(Preimpreso.class);
		public static final PreimpresoAnterior preimpresoAnterior = Singleton.getInstance(PreimpresoAnterior.class);
		public static final Observacion observacion = Singleton.getInstance(Observacion.class);

		public static class NumeroOperacion extends COBISInputValue {
			public NumeroOperacion() {
				this.init("VA_NUMEROOPERACOOO_520762","Operacion");
			}
		}			

		public static class NumeroDuplicados extends COBISInputValue {
			public NumeroDuplicados() {
				this.init("VA_NUMERODUPLICADA_987762","Duplicados");
			}
		}			

		public static class Preimpreso extends COBISInputValue {
			public Preimpreso() {
				this.init("VA_PREIMPRESOTUZHU_257762","Preimpreso");
			}
		}			

		public static class PreimpresoAnterior extends COBISInputValue {
			public PreimpresoAnterior() {
				this.init("VA_PREIMPRESOANTIR_563762","PreimpresoAnterior");
			}
		}			

		public static class Observacion extends COBISInputValue {
			public Observacion() {
				this.init("VA_OBSERVACIONPROU_702762","Observacion");
			}
		}			
	}
}
