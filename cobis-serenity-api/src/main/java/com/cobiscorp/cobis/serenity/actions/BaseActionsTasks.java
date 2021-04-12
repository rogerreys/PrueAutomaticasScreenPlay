package com.cobiscorp.cobis.serenity.actions;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.CoreMatchers.equalTo;

import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;

import com.cobiscorp.cobis.utils.questions.CobisText;

import io.cucumber.java.Before;
import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.Step;

class BaseActionsTasks {

	public static class Browse implements Interaction {

		private final String url;

		@Override
		@Step("{0} navega hacia la pagina: #url")
		public <T extends Actor> void performAs(T actor) {
			actor.attemptsTo(Open.url(url));

		}

		public static Performable to(String url) {
			return Instrumented.instanceOf(Browse.class).withProperties(url);
		}

		public Browse(String url) {
			this.url = url;
		}

	}

	public static class ClickOn implements Task {

		private Target element;

		@Override
		@Step("{0} hace clic en: #element")
		public <T extends Actor> void performAs(T actor) {
			actor.attemptsTo(Click.on(element));
		}

		public ClickOn(Target element) {
			this.element = element;
		}

		public static Performable element(Target element) {
			return Instrumented.instanceOf(ClickOn.class).withProperties(element);
		}

	}

	public static class ClickOnWebElementId implements Task {

		private WebElementFacade element;
		private String id;

		@Override
		@Step("{0} hace clic en: #id")
		public <T extends Actor> void performAs(T actor) {
			actor.attemptsTo(Click.on(element));
		}

		public ClickOnWebElementId(WebElementFacade element, String id) {
			this.element = element;
			this.id = id;
		}

		public static Performable element(WebElementFacade element, String id) {
			return Instrumented.instanceOf(ClickOnWebElementId.class).withProperties(element, id);
		}

	}
	
	public static class ClickOnWebElementTarget implements Task {

		private WebElementFacade element;
		private Target target;

		@Override
		@Step("{0} hace clic en: #target")
		public <T extends Actor> void performAs(T actor) {
			actor.attemptsTo(Click.on(element));
		}

		public ClickOnWebElementTarget(WebElementFacade element, Target target) {
			this.element = element;
			this.target = target;
		}

		public static Performable element(WebElementFacade element, Target target) {
			return Instrumented.instanceOf(ClickOnWebElementTarget.class).withProperties(element, target);
		}

	}


	public static class RightClickOn implements Task {

		private WebElementFacade element;
		private String id;
		
		@Override
		@Step("{0} hace clic con el boton derecho en: #id")
		public <T extends Actor> void performAs(T actor) {
		BrowseTheWeb.as(actor).withAction().contextClick(element);
		}

		public RightClickOn(WebElementFacade element, String id) {
			this.element = element;
			this.id = id;
		}

		public static Performable element(WebElementFacade element, String id) {
			return Instrumented.instanceOf(RightClickOn.class).withProperties(element,id);
		}

	}

	public static class EnterTheText implements Task {

		private String text;
		private Target target;
		private String id;

		@Override
		@Step("{0} digita #text en:  #target")
		public <T extends Actor> void performAs(T actor) {
			try {
				WebElementFacade element = BrowseTheWeb.as(actor).$(By.xpath("//input[@id='" + id + "']"));
				if (element.getAttribute("kendo-numeric-text-box") != null) {
					BrowseTheWeb.as(actor).evaluateJavascript(
							"var element = $('#" + id + "').data('kendoNumericTextBox'); element.value('" + text
									+ "'); element.trigger('change');");
				} else if (element.getAttribute("kendo-masked-text-box") != null) {
					BrowseTheWeb.as(actor).evaluateJavascript(
							"var element = $('#" + id + "').data('kendoMaskedTextBox'); element.value('" + text
									+ "'); element.trigger('change');");
				} else {
					BrowseTheWeb.as(actor).clickOn(element);
					actor.attemptsTo(Enter.keyValues(text).into(element));
				}

			} catch (NoSuchElementException exception) {
				actor.attemptsTo(Enter.theValue(text).into(target));
			}
		}

		public EnterTheText(Target target, String id, String text) {
			this.target = target;
			this.id = id;
			this.text = text;
		}

		public static Performable text(Target target, String id, String text) {
			return Instrumented.instanceOf(EnterTheText.class).withProperties(target, id, text);
		}

	}

	public static class EnterThe implements Task {

		private String key;
		private Target target;
		private String id;

		@Override
		@Step("{0} presiona tecla: #key en #id")
		public <T extends Actor> void performAs(T actor) {
			if (key.equals("tab")) {
				actor.attemptsTo(Hit.the(Keys.TAB).into(target));
			} else if (key.equals("enter")) {
				actor.attemptsTo(Hit.the(Keys.ENTER).into(target));
			}
		}

		public EnterThe(Target target, String id, String key) {
			this.target = target;
			this.id = id;
			this.key = key;
		}

		public static Performable key(Target target, String id, String key) {
			return Instrumented.instanceOf(EnterThe.class).withProperties(target, id, key);
		}

	}

	public static class EvaluateId implements Task {

		private String script;
		private String id;
		private String accion;

		@Override
		@Step("{0}  #accion en: #id")
		public <T extends Actor> void performAs(T actor) {
			BrowseTheWeb.as(actor).evaluateJavascript(script);
		}

		public EvaluateId(String id, String script, String accion) {
			this.script = script;
			this.id = id;
			this.accion = accion;
		}
		
		public static Performable javascript(String id, String script, String accion) {
			return Instrumented.instanceOf(EvaluateId.class).withProperties(id, script, accion);
		}

	}
	
	public static class EvaluateTarget implements Task {

		private String script;
		private String accion;
		private Target target;

		@Override
		@Step("{0}  #accion en: #target")
		public <T extends Actor> void performAs(T actor) {
			BrowseTheWeb.as(actor).evaluateJavascript(script);
		}
		
		public EvaluateTarget(Target target, String script, String accion) {
			this.script = script;
			this.target = target;
			this.accion = accion;
		}
		
		public static Performable javascript(Target target, String script, String accion) {
			return Instrumented.instanceOf(EvaluateTarget.class).withProperties(target, script, accion);
		}

	}
	
	public static class SeeThatText implements Task {

		private Target target;
		private String texto;

		@Override
		@Step("{0} observa que el valor: #texto - es igual al del elemento: #target")
		public <T extends Actor> void performAs(T actor) {
			theActorInTheSpotlight().should(seeThat(CobisText.text(target),
					equalTo(texto)));
		}

		public SeeThatText(Target target, String texto) {
			this.target = target;
			this.texto = texto;
		}

		public static Performable element(Target target, String texto) {
			return Instrumented.instanceOf(SeeThatText.class).withProperties(target, texto);
		}
	}
	
	public static class SeeThatValue implements Task {

		private Target target;
		private String texto;

		@Override
		@Step("{0} observa que el valor: #texto - es igual al del elemento: #target")
		public <T extends Actor> void performAs(T actor) {
			theActorInTheSpotlight().should(seeThat(CobisText.text(target),
					equalTo(texto)));
		}

		public SeeThatValue(Target target, String texto) {
			this.target = target;
			this.texto = texto;
		}

		public static Performable element(Target target, String texto) {
			return Instrumented.instanceOf(SeeThatValue.class).withProperties(target, texto);
		}
	}

	public static class SetStage {

		@Before
		public void setTheStage() {

			OnStage.setTheStage(new OnlineCast());
		}

	}

}
