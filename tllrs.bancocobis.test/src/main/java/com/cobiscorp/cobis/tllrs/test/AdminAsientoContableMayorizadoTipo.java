package com.cobiscorp.cobis.tllrs.test;

import org.openqa.selenium.By;

import com.cobiscorp.cobis.tllrs.test.AdminAsientoContableMayorizado.Cliente;
import com.cobiscorp.cobis.tllrs.test.AdminAsientoContableMayorizado.Cliente3;
import com.cobiscorp.cobis.tllrs.test.AdminAsientoContableMayorizado.Cliente.AreaOrigen;
import com.cobiscorp.cobis.tllrs.test.AdminAsientoContableMayorizado.Cliente.AreaOrigenGrid;
import com.cobiscorp.cobis.tllrs.test.AdminAsientoContableMayorizado.Cliente.Check;
import com.cobiscorp.cobis.tllrs.test.AdminAsientoContableMayorizado.Cliente.Descripcion;
import com.cobiscorp.cobis.tllrs.test.AdminAsientoContableMayorizado.Cliente.FechaNacimiento;
import com.cobiscorp.cobis.tllrs.test.AdminAsientoContableMayorizado.Cliente.Mayorizado;
import com.cobiscorp.cobis.tllrs.test.AdminAsientoContableMayorizado.Cliente.OficinaOrigen;
import com.cobiscorp.cobis.tllrs.test.AdminAsientoContableMayorizado.Cliente.OficinaOrigenGrid;
import com.cobiscorp.cobis.tllrs.test.AdminAsientoContableMayorizado.Cliente3.FechaIngreso;
import com.cobiscorp.cobis.tllrs.test.AdminAsientoContableMayorizado.Cliente3.Identificacion;
import com.cobiscorp.cobis.tllrs.test.AdminAsientoContableMayorizado.Cliente3.PrimerApellido;
import com.cobiscorp.cobis.tllrs.test.AdminAsientoContableMayorizado.Cliente3.PrimerNombre;
import com.cobiscorp.cobis.utils.base.Singleton;
import com.cobiscorp.cobis.utils.controls.IButton;
import com.cobiscorp.cobis.utils.controls.IComboBox;
import com.cobiscorp.cobis.utils.controls.IControl;
import com.cobiscorp.cobis.utils.controls.IGrid;
import com.cobiscorp.cobis.utils.controls.IInputValue;
import com.cobiscorp.cobis.utils.controls.ILayout;
import com.cobiscorp.cobis.utils.controls.IMultiSelect;
import com.cobiscorp.cobis.utils.events.IClickable;

import net.serenitybdd.screenplay.targets.Target;

public class AdminAsientoContableMayorizadoTipo {
	
	public static final ComprobanteTipo COMPROBANTETIPO = Singleton.getInstance(ComprobanteTipo.class);

	public static class ComprobanteTipo implements IControl {

		private String id = "QV_2194_82959";
		private Target target = Target.the("FiltroCliente").located(By.id(id));

		public static final Descripcion descripcion = Singleton.getInstance(Descripcion.class);
		
		public static class Buttons {
			public static final botonComprobanteTipo _VA_4483GJDPRVFSBRL_544628 = Singleton
					.getInstance(botonComprobanteTipo.class);
			
			public static final botonGuardar _CM_TCNMNGDF_N1G = Singleton
					.getInstance(botonGuardar.class);
			
			public static class botonComprobanteTipo implements IButton {

				private String xpath = "/html/body/div[1]/div[2]/div[2]/div/div[1]/ul/li/div/div/div/div[3]/div/div/div/div/button";
				private Target target = Target.the("botonComprobanteTipo").located(By.xpath(xpath));

				@Override
				public Target getTarget() {
					return target;
				}

				@Override
				public String getId() {
					return xpath;
				}
			}
			
			public static class botonGuardar implements IButton {

				private String id = "CM_TCNMNGDF_N1G";
				private Target target = Target.the("botonComprobanteTipo").located(By.id(id));

				@Override
				public Target getTarget() {
					return target;
				}

				@Override
				public String getId() {
					return id;
				}
			}
			
			
		}
		
		public static class Descripcion implements IInputValue {

			private String id = "/html/body/div[1]/div[2]/div[2]/div/div[2]/div/div/div/div/div[3]/table/tbody/tr/td[8]/input";
			private Target target = Target.the("Identificacion").located(By.xpath(id));

			@Override
			public Target getTarget() {
				return target;
			}

			@Override
			public String getId() {
				return id;
			}
		}
		
		@Override
		public Target getTarget() {
			return target;
		}

		@Override
		public String getId() {
			return id;
		}

	}

	
	public static final ValoresComprobanteTipo VALORESCOMPROBANTETIPO = Singleton.getInstance(ValoresComprobanteTipo.class);

	public static class ValoresComprobanteTipo implements IGrid {

		private String id = "QV_4420_87124";
		private Target target = Target.the("GridQV_4420_87124").located(By.xpath(id));

		public static final Identificacion identificacion = Singleton.getInstance(Identificacion.class);

		public static class Identificacion implements IInputValue {

			private String id = "VA_TEXTINPUTBOXEEJ_319565";
			private Target target = Target.the("Identificacion").located(By.id(id));

			@Override
			public Target getTarget() {
				return target;
			}

			@Override
			public String getId() {
				return id;
			}
		}

		@Override
		public Target getTarget() {
			return target;
		}

		@Override
		public String getId() {
			return id;
		}
	}

	public static final Mayorizado MAYORIZADO = Singleton.getInstance(Mayorizado.class);
	
	public static class Mayorizado implements ILayout {

		private String id = "G_AUTOCRUDDD_999662";
		private Target target = Target.the("Cliente").located(By.id(id));
		
		public static final MayorizadoCheck MAYORIZADOCHECK = Singleton.getInstance(MayorizadoCheck.class);
		
		public static class MayorizadoCheck implements IClickable {

			private String xpath = "//input[@ng-class='vc.viewState.VA_6243FNMPMOCLYMJ_803628.style']";
			private Target target = Target.the("Mayorizado").located(By.xpath(xpath));

			@Override
			public Target getTarget() {
				return target;
			}

			@Override
			public String getId() {
				return xpath;
			}
		}
		
		public static class Check implements IClickable {

			private String xpath = "/html/body/div[1]/div[2]/div[2]/div/div[2]/div/div/div/div/div[3]/table/tbody/tr/td[14]/a[1]/span";
			private Target target = Target.the("Mayorizado").located(By.xpath(xpath));

			@Override
			public Target getTarget() {
				return target;
			}

			@Override
			public String getId() {
				return xpath;
			}
		}
		public static class PaisNac implements IComboBox {

			private String id = "VA_PAISNACPQZOGAQE_330662";
			private Target target = Target.the("PaisNac").located(By.id(id));

			@Override
			public Target getTarget() {
				return target;
			}

			@Override
			public String getId() {
				return id;
			}
		}

		public static class ProvinciaNac implements IComboBox {

			private String id = "VA_PROVINCIANACOXC_128662";
			private Target target = Target.the("ProvinciaNac").located(By.id(id));

			@Override
			public Target getTarget() {
				return target;
			}

			@Override
			public String getId() {
				return id;
			}
		}

		public static class CiudadNac implements IComboBox {

			private String id = "VA_CIUDADNACFVVEVW_322662";
			private Target target = Target.the("CiudadNac").located(By.id(id));

			@Override
			public Target getTarget() {
				return target;
			}

			@Override
			public String getId() {
				return id;
			}
		}

		public static class EstadoCivil implements IComboBox {

			private String id = "VA_ESTADOCIVILJFOO_950662";
			private Target target = Target.the("EstadoCivil").located(By.id(id));

			@Override
			public Target getTarget() {
				return target;
			}

			@Override
			public String getId() {
				return id;
			}
		}

		public static class Genero implements IComboBox {

			private String id = "VA_GENEROQMXFUHHVF_515662";
			private Target target = Target.the("Genero").located(By.id(id));

			@Override
			public Target getTarget() {
				return target;
			}

			@Override
			public String getId() {
				return id;
			}
		}

		public static class Hobbies implements IMultiSelect {

			private String id = "VA_HOBBIESOUVXWVEM_541662";
			private Target target = Target.the("Hobbies").located(By.id(id));

			@Override
			public Target getTarget() {
				return target;
			}

			@Override
			public String getId() {
				return id;
			}
		}

		@Override
		public Target getTarget() {
			return target;
		}

		@Override
		public String getId() {
			return id;
		}

	}
}
