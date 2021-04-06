package com.cobiscorp.cobis.serenity.actions;

import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Switch;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import com.cobiscorp.cobis.utils.base.Container;

public class ContainerActions extends BaseActions{

	/**
	 * Navega hacia la pagina de cobis
	 * @param user usuario el cual interactua
	 */
	public static void browseToCobis(String user, String url) {
		theActorCalled(user).has(BaseActionsTasks.Browse.to(url));
	}
	
	/**
	 * Coloca datos de inicio de sesión
	 * @param usuario nombre del usuario
	 * @param password contraseña del usuario
	 */
	public static void loginWith(String usuario, String password) {
		waitUntilCharge();
		ContainerActions.enterText(Container.usuario, usuario);
		ContainerActions.enterText(Container.clave, password);
		ContainerActions.clickOn(Container.botonLogin);
	}
	
	/**
	 * Seleccionan los datos de rol
	 * @param filial
	 * @param oficina
	 * @param rol
	 */
	public static void roleSelection(String filial, String oficina, String rol) {
		waitUntilCharge();
		ContainerActions.enterTextAndTab(Container.inputFilial, filial);
		ContainerActions.enterTextAndTab(Container.inputOficina, oficina);
		ContainerActions.enterTextAndTab(Container.inputRol, rol);
		ContainerActions.clickOn(Container.botonIngresar);
	}
	
	/**
	 * Selecciona las opciones del menu a interactuar
	 * @menu Camino del menú, separados por >> para cada paso
	 */
	public static void selectMenuOption(String menu) {
		waitUntilCharge();
		ContainerActions.clickOn(Container.menu);
		String[] items = menu.split(">>");
		for (String item : items) {
			waitUntilCharge();
			theActorInTheSpotlight().attemptsTo(BaseActionsTasks.ClickOn.element(Container.setOpcionMenu(item)));
		}
		activeIframe();
	}

	/**
	 * Cambia al IFrame principal
	 *
	 */
	public static void changeToPrimaryIframe() {
		theActorInTheSpotlight().attemptsTo(Switch.toFrame(0));
	}

	/**
	 * Cambia a un IFrame por valor entero
	 * @frame valor del ubicación entera del IFrame
	 */
	public static void changeToIframe(int frame) {
		theActorInTheSpotlight().attemptsTo(Switch.toFrame(frame));
	}

	/**
	 * Cambia a un IFrame por nombre
	 * @frameName nombre del IFrame
	 */
	public static void changeToIframe(String frameName) {
		WebElement frame = BrowseTheWeb.as(theActorInTheSpotlight()).find(By.id(frameName));
		theActorInTheSpotlight().attemptsTo(Switch.toFrame(frame));
	}
	
	
	/**
	 * Selecciona el frame de la ventana activa
	 */
	public static void activeIframe() {
		WebElement iframe = BrowseTheWeb.as(theActorInTheSpotlight()).find(By.xpath("//iframe[@class='cb-external ng-scope']"));
		theActorInTheSpotlight().attemptsTo(Switch.toFrame(iframe));
	}
	
	public static void switchToActiveElement() {
		BrowseTheWeb.as(theActorInTheSpotlight()).getDriver().switchTo().activeElement();
		theActorInTheSpotlight().attemptsTo(Switch.toFrame(BrowseTheWeb.as(theActorInTheSpotlight()).getDriver().switchTo().activeElement()));
	}	
	
	/**
	 * Cambia al iframe padre.
	 */
	public static void changeToParentFrame() {
		theActorInTheSpotlight().attemptsTo(Switch.toParentFrame());
	}
	
}
