package com.cobiscorp.cobis.utils.base;

import org.openqa.selenium.By;

import com.cobiscorp.cobis.utils.controls.impl.COBISControl;
import com.cobiscorp.cobis.utils.events.IClickable;
import com.cobiscorp.cobis.utils.events.IDigitable;
import net.serenitybdd.screenplay.targets.IFrame;
import net.serenitybdd.screenplay.targets.Target;

public class Container {
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
	
	public static class Usuario extends COBISControl implements IDigitable {
		
		public Usuario() {
			this.init("login", "Input campo usuario");
		}
	}

	public static class Clave extends COBISControl implements IDigitable {
		public Clave() {
			this.init("password", "Input campo Password");
		}
	}

	public static class BotonLogin extends COBISControl implements IClickable {
		public BotonLogin() {
			this.init(null, "Botón Inicio de Sesión", "//button[@class='btn btn-primary btn-lg btn-block ng-scope']");
		}
	}

	public static class BotonIngresar extends COBISControl implements IClickable {
		public BotonIngresar() {
			this.init("btnAuthorization", "Botón Ingresar COBIS");
		}
	}
	
	public static class BotonLogout extends COBISControl implements IClickable {
		public BotonLogout() {
			this.init("nav-logout", "Boton Logout");		
		}
	}

	public static class FinalizarSesion extends COBISControl implements IClickable {
		public FinalizarSesion() {
			this.init(null, "Enlace para finalizar sesión", "//a[@ng-click='onSelectionLogout()']");
		}
	}
	
	public static class InputFilial extends COBISControl implements IDigitable {
		public InputFilial() {
			this.init(null, "Selector buscador Filial", "//input[@name='filial_input']");
		}
	}
	
	public static class InputOficina extends COBISControl implements IDigitable {
		public InputOficina() {
			this.init(null, "Selector buscador Oficina","//input[@name='office_input']");
		}
	}

	public static class InputRol extends COBISControl implements IDigitable {
		public InputRol() {
			this.init(null, "Selector buscador Rol", "//input[@name='rol_input']");
		}
	}
	
	public static class Menu extends COBISControl implements IClickable {
		public Menu() {
			this.init(null, "Opción de Menu Cobis", "//a[@title='Menú']");
		}
	}
	
}
