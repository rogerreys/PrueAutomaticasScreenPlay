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
import com.cobiscorp.cobis.tllrs.test.BusquedaClientes.Cliente.FechaIngreso;
import com.cobiscorp.cobis.tllrs.test.BusquedaClientes.Cliente.Identificacion;
import com.cobiscorp.cobis.tllrs.test.BusquedaClientes.Cliente.PrimerApellido;
import com.cobiscorp.cobis.tllrs.test.BusquedaClientes.Cliente.PrimerNombre;
import com.cobiscorp.cobis.utils.base.Singleton;
import com.cobiscorp.cobis.utils.controls.IButton;
import com.cobiscorp.cobis.utils.controls.IComboBox;
import com.cobiscorp.cobis.utils.controls.IControl;
import com.cobiscorp.cobis.utils.controls.IGrid;
import com.cobiscorp.cobis.utils.controls.IInputValue;
import com.cobiscorp.cobis.utils.controls.ILayout;
import com.cobiscorp.cobis.utils.controls.IMultiSelect;
import com.cobiscorp.cobis.utils.events.IClickable;
import com.cobiscorp.cobis.utils.events.IDigitable;

import net.serenitybdd.screenplay.targets.Target;

public class AdminAsientoContableMayorizado {
	
	public static final Cliente cliente = Singleton.getInstance(Cliente.class);
	
	public static class Cliente implements ILayout {

		private String id = "G_AUTOCRUDDD_999662";
		private Target target = Target.the("Cliente").located(By.id(id));
		
		public static final Descripcion descripcion= Singleton.getInstance(Descripcion.class);
		public static final OficinaOrigen oficinaOrigen = Singleton.getInstance(OficinaOrigen.class);
		public static final OficinaOrigenGrid oficinaOrigenGrid = Singleton.getInstance(OficinaOrigenGrid.class);
		public static final AreaOrigen areaOrigen = Singleton.getInstance(AreaOrigen.class);
		public static final AreaOrigenGrid areaOrigenGrid = Singleton.getInstance(AreaOrigenGrid.class);
		public static final Mayorizado mayorizado = Singleton.getInstance(Mayorizado.class);
		public static final FechaNacimiento fechaNacimiento = Singleton.getInstance(FechaNacimiento.class);
		/*public static final PaisNac paisNac = Singleton.getInstance(PaisNac.class);
		public static final ProvinciaNac provinciaNac = Singleton.getInstance(ProvinciaNac.class);
		public static final CiudadNac ciudadNac = Singleton.getInstance(CiudadNac.class);
		public static final EstadoCivil estadoCivil = Singleton.getInstance(EstadoCivil.class);
		public static final Genero genero = Singleton.getInstance(Genero.class);
		public static final Hobbies hobbies = Singleton.getInstance(Hobbies.class);*/
		
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

		public static class Descripcion implements IInputValue {

			private String id = "VA_2045TVIPEQGWKDD_668628";
			private Target target = Target.the("Descripcion").located(By.id(id));

			@Override
			public Target getTarget() {
				return target;
			}

			@Override
			public String getId() {
				return id;
			}
		}
		public static class OficinaOrigen implements IButton {

			private String xpath = "//*[@id='VA_4529KSKSKFDTQNZ_541628_DIV']/div/div/div/button";
			private Target target = Target.the("Oficina Origen").located(By.xpath(xpath));


			@Override
			public Target getTarget() {
				return target;
			}

			@Override
			public String getId() {
				return xpath;
			}
		}
		public static class OficinaOrigenGrid implements IClickable {

			private String xpath = "//span[contains(text(),'SUCURSAL 1001')]";
			private Target target = Target.the("Oficina Origen Grid").located(By.xpath(xpath));

			@Override
			public Target getTarget() {
				return target;
			}

			@Override
			public String getId() {
				return xpath;
			}
		}
		public static class AreaOrigen implements IButton {

			private String xpath = "//button[@ng-class='vc.viewState.VA_2502TECDGCHQJNR_958628.style']";
			private Target target = Target.the("Area Origen").located(By.xpath(xpath));


			@Override
			public Target getTarget() {
				return target;
			}

			@Override
			public String getId() {
				return xpath;
			}
		}
		public static class AreaOrigenGrid implements IClickable {

			private String xpath = "//span[contains(text(),'OPERACIONES')]";
			private Target target = Target.the("Area Origen Grid").located(By.xpath(xpath));

			@Override
			public Target getTarget() {
				return target;
			}

			@Override
			public String getId() {
				return xpath;
			}
		}
		public static class Mayorizado implements IClickable {

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
