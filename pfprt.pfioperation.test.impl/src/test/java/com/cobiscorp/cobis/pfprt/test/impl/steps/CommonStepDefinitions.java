/*
 * Esta aplicacion es parte de los paquetes bancarios propiedad de COBISCORP.
 * Su uso no autorizado queda expresamente prohibido asi como cualquier
 * alteracion o agregado hecho por alguno de sus usuarios sin el debido
 * consentimiento por escrito de COBISCORP.
 * Este programa esta protegido por la ley de derechos de autor y por las
 * convenciones internacionales de propiedad intelectual. Su uso no
 * autorizado dara derecho a COBISCORP para obtener ordenes de secuestro
 * o retencion y para perseguir penalmente a los autores de cualquier infraccion.
 */
package com.cobiscorp.cobis.pfprt.test.impl.steps;
import java.io.IOException;
import com.cobiscorp.cobis.serenity.actions.*;
import com.cobiscorp.cobis.utils.base.*;

import io.cucumber.java.ast.Cuando;
import io.cucumber.java.es.Dado;

public class CommonStepDefinitions {

	@Dado("que usuario:{string} realiza Login en COBIS con pass:{string} rol:{string} filial:{string} oficina:{string} en la url:{string}")
    public void que_usuario_realiza_Login_en_COBIS_con_pass_rol_filial_oficina_en_la_url(String user, String password, String rol, String filial, String oficina, String url) {
        ContainerActions.browseToCobis(user, url);
        ContainerActions.loginWith(user, password);
        ContainerActions.roleSelection(filial,oficina,rol);
    }
	
	@Cuando("que navega desde {string} hacia {string}")
	public void que_navega_desde_origen_hacia_destino(String origen, String destino) {
		String ruta = origen + ">>" + destino;
		ContainerActions.selectMenuOption(ruta);
	}
	
	@Dado("que usuario realiza login en el sistema cobis")
	public void que_usuario_realiza_login_en_el_sistema_cobis() {
	    try {
			LoginUtils login = new LoginUtils();
			ContainerActions.browseToCobis(login.getUser(), login.getUrl());
	        ContainerActions.loginWith(login.getUser(), login.getPassword());
	        ContainerActions.roleSelection(login.getFilial(),login.getOficina(),login.getRol());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	@Cuando("él cierra sesión")
	public void él_cierra_sesión() {
		FormActions.clickOn(Container.botonLogout);
		FormActions.clickOn(Container.finalizarSesion);
	}

}