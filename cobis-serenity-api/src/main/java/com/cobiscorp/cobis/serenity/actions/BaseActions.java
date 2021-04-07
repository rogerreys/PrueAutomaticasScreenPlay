package com.cobiscorp.cobis.serenity.actions;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.waits.WaitUntil;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.cobiscorp.cobis.utils.controls.IControl;
import com.cobiscorp.cobis.utils.events.IClickable;
import com.cobiscorp.cobis.utils.events.IDigitable;
import com.cobiscorp.cobis.utils.events.IValueReadable;

public class BaseActions extends BaseActionsTasks{

	/**
	 * Espera la carga de componentes de manera dinamica
	 *
	 */
	protected static void waitUntilCharge() {
		theActorInTheSpotlight().attemptsTo(WaitUntil.angularRequestsHaveFinished());
	}
	
	/**
	 * Hace click en un elemento IClickable
	 * @param control Elemento a ser clickeado
	 */
	public static void clickOn(IClickable control) {
		//WebElement entityName = new WebDriverWait(fff, 20).until(ExpectedConditions.elementToBeClickable(By.xpath(control.getId())));
		waitUntilCharge();
		theActorInTheSpotlight().attemptsTo(BaseActionsTasks.ClickOn.element(control.getTarget()));
		waitUntilCharge();
	}
	
	
	
	/**
	 * Hace click derecho en un elemento IClickable
	 * @param control Elemento a ser clickeado
	 */
	public static void rightClickOn(IClickable control) {
		waitUntilCharge();
		WebElementFacade element = BrowseTheWeb.as(theActorInTheSpotlight()).$(By.id(control.getId()));
		theActorInTheSpotlight().attemptsTo(BaseActionsTasks.RightClickOn.element(element, control.getId()));
	}
	
	/**
	 * Hace click en un elemento Target
	 * @param target Elemento a ser clickeado
	 */
	protected static void clickOn(Target target) {
		waitUntilCharge();
		theActorInTheSpotlight().attemptsTo(BaseActionsTasks.ClickOn.element(target));
	}

	/**
	 * Hace click en un elemento WebElement
	 * @param target Elemento a ser clickeado
	 * @param id Identificador del elemento
	 */
	protected static void clickOn(WebElementFacade webElement, IControl icontrol) {
		waitUntilCharge();
		theActorInTheSpotlight().attemptsTo(BaseActionsTasks.ClickOnWebElementTarget.element(webElement, icontrol.getTarget()));
	}
	
	/**
	 * Hace click en un elemento WebElement
	 * @param target Elemento a ser clickeado
	 * @param id Identificador del elemento
	 */
	protected static void clickOn(WebElementFacade webElement, String id) {
		waitUntilCharge();
		theActorInTheSpotlight().attemptsTo(BaseActionsTasks.ClickOnWebElementId.element(webElement, id));
	}
	
	/**
	 * Ingresa un texto en un elemento IDigitable
	 * @param control Elemento en el cual se va a escribir
	 * @param text texto a escribir
	 */
	public static void enterText(IDigitable control, String text) {
		waitUntilCharge();
		theActorInTheSpotlight().attemptsTo(BaseActionsTasks.EnterTheText.text(control.getTarget(), control.getId(), text ));
	}
	/**
	 * Ingresa una fecha
	 * @param control Elemento en el cual se va a escribir
	 * @param text fecha a escribir
	 */
	public static void EnterDate(IDigitable control, String texto) {
		waitUntilCharge();
		theActorInTheSpotlight().attemptsTo(BaseActionsTasks.EnterDate.text(texto, control.getTarget()));
	}
	
	/**
	 * Ingresa un texto en un elemento IDigitable y luego presiona la tecla Tabulador
	 * @param control Elemento en el cual se va a escribir
	 * @param text texto a escribir
	 */
	public static void enterTextAndTab(IDigitable control, String text) {
		waitUntilCharge();
		theActorInTheSpotlight().attemptsTo(BaseActionsTasks.EnterTheText.text(control.getTarget(), control.getId(), text ));
		theActorInTheSpotlight().attemptsTo(BaseActionsTasks.EnterThe.key(control.getTarget(), control.getId(), "tab"));
	}
	
	/**
	 * Ingresa un texto en un elemento IDigitable y luego presiona la tecla Enter
	 * @param control Elemento en el cual se va a escribir
	 * @param text texto a escribir
	 */
	public static void enterTextAndEnter(IDigitable control, String text) {
		waitUntilCharge();
		theActorInTheSpotlight().attemptsTo(BaseActionsTasks.EnterTheText.text(control.getTarget(), control.getId(), text ));
		theActorInTheSpotlight().attemptsTo(BaseActionsTasks.EnterThe.key(control.getTarget(), control.getId(), "enter"));
	}
	
	/**
	 * Presiona una tecla en un elemento IDigitable 
	 * @param control Elemento en el cual se va a presionar una tecla
	 * @param key tecla a presionar
	 */
	public static void enterTheKey(IDigitable control, String key) {
		theActorInTheSpotlight().attemptsTo(BaseActionsTasks.EnterThe.key(control.getTarget(), control.getId(), key));
	}
	
	/**
	 * Obtiene el texto dentro del elemento
	 * @param id del elemento
	 * @return String, texto dentro del elemento
	 */
	public static String getValue(IValueReadable control) {
		String value;
		waitUntilCharge();
		value = BrowseTheWeb.as(theActorInTheSpotlight()).$(By.id(control.getId())).getAttribute("value");
		return value;
	}

	/**
	 * Ejecuta un javascript de interacción con elementos
	 * @control Elemento a interactuar
	 * @javascript codigo javascript a ejecutar
	 * @accion descripcion de la accion a ejecutar para que se imprima en el reporta
	 */
	protected static void evaluateJavascriptWithTarget(IControl control, String javaString, String accion) {
		theActorInTheSpotlight().attemptsTo(BaseActionsTasks.EvaluateTarget.javascript(control.getTarget(), javaString, accion));
	}
	/**
	 * Ejecuta un javascript de interacción con elementos
	 * @controlName Nombre del control a interactuar
	 * @javascript codigo javascript a ejecutar
	 * @accion descripcion de la accion a ejecutar para que se imprima en el reporta
	 */
	protected static void evaluateJavascript(String controlName, String javaString, String accion) {
			theActorInTheSpotlight().attemptsTo(BaseActionsTasks.EvaluateId.javascript(controlName, javaString, accion));
	}
	
}
