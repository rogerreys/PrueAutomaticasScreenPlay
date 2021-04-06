package com.cobiscorp.cobis.serenity.actions;

import net.serenitybdd.screenplay.targets.Target;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import com.cobiscorp.cobis.utils.controls.IControl;

public class ValidationActions {
	/**
	 * Valida que se cumplan las condiciones de una pregunta (Question) 
	 * @target elemento a interactuar
	 * @texto texto a validar
	 */
	public static void isEquals(Target target, String texto ) {
		theActorInTheSpotlight().attemptsTo(BaseActionsTasks.SeeThatText.element(target, texto));
	}
	
	/**
	 * Valida que se cumplan las condiciones de una pregunta (Question) 
	 * @target elemento a interactuar
	 * @texto texto a validar
	 */
	public static void isEquals(IControl control, String texto ) {
		theActorInTheSpotlight().attemptsTo(BaseActionsTasks.SeeThatValue.element(control.getTarget(), texto));
	}
	
}