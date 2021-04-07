package com.cobiscorp.cobis.tllrs.test;

import org.openqa.selenium.By;

import com.cobiscorp.cobis.tllrs.test.AdminClientes.Cliente;
import com.cobiscorp.cobis.tllrs.test.AdminClientes.Cliente.CiudadNac;
import com.cobiscorp.cobis.tllrs.test.AdminClientes.Cliente.EstadoCivil;
import com.cobiscorp.cobis.tllrs.test.AdminClientes.Cliente.FechaNacimiento;
import com.cobiscorp.cobis.tllrs.test.AdminClientes.Cliente.Genero;
import com.cobiscorp.cobis.tllrs.test.AdminClientes.Cliente.Hobbies;
import com.cobiscorp.cobis.tllrs.test.AdminClientes.Cliente.PaisNac;
import com.cobiscorp.cobis.tllrs.test.AdminClientes.Cliente.ProvinciaNac;
import com.cobiscorp.cobis.utils.base.Singleton;
import com.cobiscorp.cobis.utils.controls.IComboBox;
import com.cobiscorp.cobis.utils.controls.IInputValue;
import com.cobiscorp.cobis.utils.controls.ILayout;
import com.cobiscorp.cobis.utils.controls.IMultiSelect;

import net.serenitybdd.screenplay.targets.Target;

public class AdminAsientoContableMayorizado {
	
	public static final Cliente cliente = Singleton.getInstance(Cliente.class);
	
	public static class Cliente implements ILayout {

		private String id = "G_AUTOCRUDDD_999662";
		private Target target = Target.the("Cliente").located(By.id(id));

		public static final FechaNacimiento fechaNacimiento = Singleton.getInstance(FechaNacimiento.class);
		public static final PaisNac paisNac = Singleton.getInstance(PaisNac.class);
		public static final ProvinciaNac provinciaNac = Singleton.getInstance(ProvinciaNac.class);
		public static final CiudadNac ciudadNac = Singleton.getInstance(CiudadNac.class);
		public static final EstadoCivil estadoCivil = Singleton.getInstance(EstadoCivil.class);
		public static final Genero genero = Singleton.getInstance(Genero.class);
		public static final Hobbies hobbies = Singleton.getInstance(Hobbies.class);

		public static class FechaNacimiento implements IInputValue {

			private String id = "VA_1972NOYIHZCXWGH_841628";
			private Target target = Target.the("FechaNacimiento").located(By.id(id));

			@Override
			public Target getTarget() {
				return target;
			}

			@Override
			public String getId() {
				return id;
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
