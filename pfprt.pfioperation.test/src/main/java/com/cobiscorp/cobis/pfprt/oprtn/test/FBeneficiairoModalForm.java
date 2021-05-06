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

public class FBeneficiairoModalForm{
	public static final ListaBeneficiarios listaBeneficiarios = Singleton.getInstance(ListaBeneficiarios.class);

	private FBeneficiairoModalForm() {
		throw new IllegalStateException("FBeneficiairoModalForm is a utility class");
	}
	public static class Buttons {
		private Buttons() {
			throw new IllegalStateException("Buttons is a utility class");
		}
		public static final CmdCommand1IdCMTPFPRTVDT7B cmdCommand1IdCMTPFPRTVDT7B = Singleton.getInstance(CmdCommand1IdCMTPFPRTVDT7B.class);
		
		public static class CmdCommand1IdCMTPFPRTVDT7B extends COBISButton{
			public CmdCommand1IdCMTPFPRTVDT7B () {
				this.init("CM_TPFPRTVD_T7B", "Guardar");
			}
		}
	

	}
	

	public static class ListaBeneficiarios {
	
		private ListaBeneficiarios() {
			throw new IllegalStateException("FBeneficiairoModalForm is a utility class");
		}
		
		public static final Nombres nombres = Singleton.getInstance(Nombres.class);
		public static final ApellidoPaterno apellidoPaterno = Singleton.getInstance(ApellidoPaterno.class);
		public static final ApellidoMaterno apellidoMaterno = Singleton.getInstance(ApellidoMaterno.class);
		public static final TipoDocId tipoDocId = Singleton.getInstance(TipoDocId.class);
		public static final DocId docId = Singleton.getInstance(DocId.class);
		public static final Parentesco parentesco = Singleton.getInstance(Parentesco.class);
		public static final FechaNacimiento fechaNacimiento = Singleton.getInstance(FechaNacimiento.class);
		public static final Direccion direccion = Singleton.getInstance(Direccion.class);
		public static final Telefono telefono = Singleton.getInstance(Telefono.class);
		public static final Porcentaje porcentaje = Singleton.getInstance(Porcentaje.class);

		public static class Nombres extends COBISInputValue {
			public Nombres() {
				this.init("VA_NOMBRESYJHOIMGA_423295","Nombres");
			}
		}			

		public static class ApellidoPaterno extends COBISInputValue {
			public ApellidoPaterno() {
				this.init("VA_APELLIDOPATENRN_693295","ApellidoPaterno");
			}
		}			

		public static class ApellidoMaterno extends COBISInputValue {
			public ApellidoMaterno() {
				this.init("VA_APELLIDOMATENRR_374295","ApellidoMaterno");
			}
		}			

		public static class TipoDocId extends COBISDropDownList {
			public TipoDocId() {
				this.init("VA_TIPODOCIDBBDLTR_305295","TipodeIdentificacion");
			}
		}			

		public static class DocId extends COBISInputValue {
			public DocId() {
				this.init("VA_DOCIDWSSPRTBWGI_847295","Identificacion");
			}
		}			

		public static class Parentesco extends COBISDropDownList {
			public Parentesco() {
				this.init("VA_PARENTESCOGBGSB_829295","Parentesco");
			}
		}			

		public static class FechaNacimiento extends COBISDatePicker {
			public FechaNacimiento() {
				this.init("VA_FECHANACIMIETTN_325295","FechaNacimiento");
			}
		}			

		public static class Direccion extends COBISInputValue {
			public Direccion() {
				this.init("VA_DIRECCIONDZDLVO_383295","Direccion");
			}
		}			

		public static class Telefono extends COBISInputValue {
			public Telefono() {
				this.init("VA_TELEFONOHXPZQWD_440295","Telefono");
			}
		}			

		public static class Porcentaje extends COBISInputValue {
			public Porcentaje() {
				this.init("VA_PORCENTAJEYRDTY_218295","Porcentaje");
			}
		}			
	}
}
