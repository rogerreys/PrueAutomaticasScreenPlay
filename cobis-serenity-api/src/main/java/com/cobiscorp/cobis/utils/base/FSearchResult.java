package com.cobiscorp.cobis.utils.base;

import org.openqa.selenium.By;
import com.cobiscorp.cobis.utils.events.IClickable;
import com.cobiscorp.cobis.utils.events.IDigitable;
import net.serenitybdd.screenplay.targets.IFrame;
import net.serenitybdd.screenplay.targets.Target;

public class FSearchResult {
	public static IFrame IFRAME_MENU  = IFrame.withPath(By.xpath("//iframe[@class='cb-external ng-scope']"));
	public static Target BOTON_LOGOUT = Target.the("Boton Logout").located(By.id("nav-logout"));
	public static Target FINALIZAR_SESION = Target.the("Enlace para finalizar sesión").located(By.xpath("//a[@ng-click='onSelectionLogout()']"));
	public static Target CAMBIAR_DE_USUARIO = Target.the("Enlcae Cambiar de Usuario").located(By.xpath("//a[contains(text(),'Cambiar de usuario')]"));
	public static Target TITULO_LOGIN = Target.the("Titulo de Login COBIS").located(By.id("message"));
	public static Target TASA = Target.the("GAT Nominal").located(By.id("VA_TASAEFECTIVAYZH_602333"));
	public static Target OPCION_MENU;
	public static final Usuario usuario =Singleton.getInstance(Usuario.class);
	public static final Clave clave = Singleton.getInstance(Clave.class);
	public static final BotonLogin botonLogin = Singleton.getInstance(BotonLogin.class);
	public static final BotonIngresar botonIngresar = Singleton.getInstance(BotonIngresar.class);
	public static final BotonLogout botonLogout = Singleton.getInstance(BotonLogout.class);
	public static final FinalizarSesion finalizarSesion = Singleton.getInstance(FinalizarSesion.class);
	public static final InputFilial inputFilial =  Singleton.getInstance(InputFilial.class);
	public static final InputOficina inputOficina =  Singleton.getInstance(InputOficina.class);
	public static final InputRol inputRol =  Singleton.getInstance(InputRol.class);
	public static final Menu menu = Singleton.getInstance(Menu.class);

	
	public static Target setOpcionMenu(String opcion) {
		OPCION_MENU = Target.the("Menu" + opcion).located(By.xpath("//div[contains(text(),'" + opcion + "')]"));
		return OPCION_MENU;
	}
	
	public static class Usuario implements IDigitable {
		private static String id = "login";
		private static Target target = Target.the("Input campo usuario").located(By.id("login"));

		@Override
		public Target getTarget() {
			return target;
		}
		@Override
		public String getId() {
			return id;
		}
	}

	public static class Clave implements IDigitable {
		private static String id = "password";
		private static Target target = Target.the("Input campo Password").located(By.id(id));

		@Override
		public Target getTarget() {
			return target;
		}
		@Override
		public String getId() {
			return id;
		}
	}

	public static class BotonLogin implements IClickable {
		private static Target target = Target.the("Botón Inicio de Sesión")
				.located(By.xpath("//button[@class='btn btn-primary btn-lg btn-block ng-scope']"));

		@Override
		public Target getTarget() {
			return target;
		}
		@Override
		public String getId() {
			return null;
		}
	}

	public static class BotonIngresar implements IClickable {
		private static Target target = Target.the("Botón Ingresar COBIS").located(By.id("btnAuthorization"));

		@Override
		public Target getTarget() {
			return target;
		}
		@Override
		public String getId() {
			return null;
		}

	}
	
	public static class BotonLogout implements IClickable {
		private static Target target = Target.the("Boton Logout").located(By.id("nav-logout"));

		@Override
		public Target getTarget() {
			return target;
		}
		@Override
		public String getId() {
			return null;
		}
	}

	public static class FinalizarSesion implements IClickable {
		private static Target target = Target.the("Enlace para finalizar sesión").located(By.xpath("//a[@ng-click='onSelectionLogout()']"));

		@Override
		public Target getTarget() {
			return target;
		}
		@Override
		public String getId() {
			return null;
		}
	}
	
	public static class InputFilial implements IDigitable {
		private static Target target =  Target.the("Selector buscador Filial").located(By.xpath("//input[@name='filial_input']"));

		@Override
		public Target getTarget() {
			return target;
		}
		@Override
		public String getId() {
			return null;
		}

	}
	
	public static class InputOficina implements IDigitable {
		private static Target target = Target.the("Selector buscador Oficina").located(By.xpath("//input[@name='office_input']"));

		@Override
		public Target getTarget() {
			return target;
		}
		@Override
		public String getId() {
			return null;
		}
	}

	public static class InputRol implements IDigitable {
		private static Target target = Target.the("Selector buscador Rol").located(By.xpath("//input[@name='rol_input']"));

		@Override
		public Target getTarget() {
			return target;
		}
		@Override
		public String getId() {
			return null;
		}
	}
	
	public static class Menu implements IClickable {
		private static Target target = Target.the("Opción de Menu Cobis").located(By.xpath("//a[@title='Menú']"));

		@Override
		public Target getTarget() {
			return target;
		}
		@Override
		public String getId() {
			return null;
		}
	}
	
}
