package com.cobiscorp.cobis.tllrs.impl.steps;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.CoreMatchers.equalTo;

import com.cobiscorp.cobis.serenity.actions.FormActions;
import com.cobiscorp.cobis.utils.base.Container;
import com.cobiscorp.cobis.utils.questions.CobisText;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;

public class HacerLoginStepDefinitions {


	@Cuando("él cierra sesión")
	public void él_cierra_sesión() {
		FormActions.clickOn(Container.botonLogout);
		FormActions.clickOn(Container.finalizarSesion);
	}

	@Entonces("se debe mostrar la pagina Login de COBIS")
	public void se_debe_mostrar_la_pagina_Login_de_COBIS() {
		theActorInTheSpotlight().should(seeThat("Titulo Login Cobis", CobisText.value(Container.TITULO_LOGIN),
				equalTo("Bienvenido, Ingrese a su cuenta")));
	}
}
