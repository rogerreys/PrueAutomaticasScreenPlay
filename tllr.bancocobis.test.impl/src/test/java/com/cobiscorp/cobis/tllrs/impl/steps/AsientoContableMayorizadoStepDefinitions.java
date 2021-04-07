package com.cobiscorp.cobis.tllrs.impl.steps;

import com.cobiscorp.cobis.serenity.actions.FormActions;
import com.cobiscorp.cobis.tllrs.test.AdminAsientoContableMayorizado;


import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;

public class AsientoContableMayorizadoStepDefinitions {
	
	@Cuando("el ingresa y selecciona los valores")
	public void el_ingresa_y_selecciona_los_valores() {
		FormActions.setDateById(AdminAsientoContableMayorizado.Cliente.fechaNacimiento, "17", "09", "2015");
	}

	@Cuando("realiza el ingreso en la grilla, registro de Cuenta Debito por un valor x")
	public void realiza_el_ingreso_en_la_grilla_registro_de_Cuenta_Debito_por_un_valor_x() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Cuando("realiza el ingreso en la grilla, registro de Cuenta Credito por un valor x")
	public void realiza_el_ingreso_en_la_grilla_registro_de_Cuenta_Credito_por_un_valor_x() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Cuando("se hace click en el boton guardar")
	public void se_hace_click_en_el_boton_guardar() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Entonces("se emite mensaje de {string}")
	public void se_emite_mensaje_de(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
}
