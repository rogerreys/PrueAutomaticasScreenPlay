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

public class FBeneficiariosForm{

	public static final GridListaBeneficiarios gridListaBeneficiarios = Singleton.getInstance(GridListaBeneficiarios.class);
	private FBeneficiariosForm() {
		throw new IllegalStateException("FBeneficiariosForm is a utility class");
	}
	public static class Buttons {
		private Buttons() {
			throw new IllegalStateException("Buttons is a utility class");
		}
		public static final CmdCommand1IdCMTPFPRTSS970 cmdCommand1IdCMTPFPRTSS970 = Singleton.getInstance(CmdCommand1IdCMTPFPRTSS970.class);
		
		public static class CmdCommand1IdCMTPFPRTSS970 extends COBISButton{
			public CmdCommand1IdCMTPFPRTSS970 () {
				this.init("CM_TPFPRTSS_970", "Guardar");
			}
		}
	
		public static final CmdCommand2IdCMTPFPRTSSTSP cmdCommand2IdCMTPFPRTSSTSP = Singleton.getInstance(CmdCommand2IdCMTPFPRTSSTSP.class);
		
		public static class CmdCommand2IdCMTPFPRTSSTSP extends COBISButton{
			public CmdCommand2IdCMTPFPRTSSTSP () {
				this.init("CM_TPFPRTSS_TSP", "Salir");
			}
		}
	

	}
	
	
	public static class GridListaBeneficiarios extends COBISGrid {
		public GridListaBeneficiarios() {
			this.init("QV_CR90_TFI64", "QV_CR90_TFI64");
		} 

		public static final IdOperacion idOperacion = Singleton.getInstance(IdOperacion.class);
		public static final Cliente cliente = Singleton.getInstance(Cliente.class);
		public static final Nombre nombre = Singleton.getInstance(Nombre.class);
		public static final NumeroOperacion numeroOperacion = Singleton.getInstance(NumeroOperacion.class);
		public static final Secuencial secuencial = Singleton.getInstance(Secuencial.class);
		public static final DocId docId = Singleton.getInstance(DocId.class);
		public static final Parentesco parentesco = Singleton.getInstance(Parentesco.class);
		public static final Porcentaje porcentaje = Singleton.getInstance(Porcentaje.class);
		public static final TipoDocId tipoDocId = Singleton.getInstance(TipoDocId.class);
		public static final FechaModificacion fechaModificacion = Singleton.getInstance(FechaModificacion.class);

		public static class IdOperacion extends COBISInputValue {
			public IdOperacion() {
				this.init("VA_TEXTINPUTBOXJJE_455861","IdOperacion");
			}
		}			

		public static class Cliente extends COBISInputTextButton {
			public Cliente() {
				this.init("VA_TEXTINPUTBOXWQY_857861","Cliente");
			}
		}			

		public static class Nombre extends COBISInputValue {
			public Nombre() {
				this.init("VA_TEXTINPUTBOXUJW_183861","Nombre");
			}
		}			

		public static class NumeroOperacion extends COBISInputValue {
			public NumeroOperacion() {
				this.init("VA_TEXTINPUTBOXZUN_539861","NumeroOperacion");
			}
		}			

		public static class Secuencial extends COBISInputValue {
			public Secuencial() {
				this.init("VA_TEXTINPUTBOXPVH_347861","Secuencial");
			}
		}			

		public static class DocId extends COBISInputValue {
			public DocId() {
				this.init("VA_TEXTINPUTBOXTLB_373861","Identificacion");
			}
		}			

		public static class Parentesco extends COBISDropDownList {
			public Parentesco() {
				this.init("VA_TEXTINPUTBOXICF_956861","Parentesco");
			}
		}			

		public static class Porcentaje extends COBISInputValue {
			public Porcentaje() {
				this.init("VA_TEXTINPUTBOXSAR_447861","Porcentaje");
			}
		}			

		public static class TipoDocId extends COBISInputValue {
			public TipoDocId() {
				this.init("VA_TEXTINPUTBOXXXI_593861","TipoDocId");
			}
		}			

		public static class FechaModificacion extends COBISDatePicker {
			public FechaModificacion() {
				this.init("VA_DATEFIELDGHLDGD_464861","FechaModificacion");
			}
		}			
	}
}
