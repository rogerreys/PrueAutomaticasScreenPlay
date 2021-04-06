package com.cobiscorp.cobis.tllrs.impl.steps;

import com.cobiscorp.cobis.serenity.actions.*;

import io.cucumber.java.ast.Cuando;

//import com.cobiscorp.cobis.utils.constants.Parametros;

import io.cucumber.java.es.Dado;

public class CommonStepDefinitions {

	@Dado("que usuario:{string} realiza Login en COBIS con password:{string} rol:{string} filial:{string} oficina:{string} en la url:{string}")
    public void que_usuario_realiza_Login_en_COBIS_con_password_rol_filial_oficina_en_la_url(String user, String password, String rol, String filial, String oficina, String url) {
        ContainerActions.browseToCobis(user, url);
        ContainerActions.loginWith(user, password);
        ContainerActions.roleSelection(filial,oficina,rol);
    }
	
	@Cuando("que navega desde {string} hacia {string}")
	public void que_navega_desde_origen_hacia_destino(String origen, String destino) {
		String ruta = origen + ">>" + destino;
		ContainerActions.selectMenuOption(ruta);
	}
	
}
