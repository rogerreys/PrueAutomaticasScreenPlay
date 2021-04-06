package com.cobiscorp.cobis.tllrs.impl.steps;

import com.cobiscorp.cobis.serenity.actions.FormActions;
import com.cobiscorp.cobis.serenity.actions.GridActions;
import com.cobiscorp.cobis.serenity.actions.ValidationActions;
import com.cobiscorp.cobis.tllrs.test.AdminClientes;
import com.cobiscorp.cobis.tllrs.test.BusquedaClientes;
import com.cobiscorp.cobis.tllrs.test.CabeceraCliente;
import com.cobiscorp.cobis.tllrs.test.FormBienes;
import com.cobiscorp.cobis.tllrs.test.TarjetaCredito;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;

public class BancoCobisStepDefinitions {

	@Cuando("busca al cliente")
	public void busca_al_cliente() {
		FormActions.enterText(BusquedaClientes.FiltroCliente.identificacion, "171393111");
		FormActions.clickOn(BusquedaClientes.FiltroCliente.Buttons._843565); 
		GridActions.selectRecord(BusquedaClientes.gridCliente, 1);
	}

	@Cuando("ingresa valores generales y laborales")
	public void ingresa_valores_generales_y_laborales() {
		FormActions.setDateById(AdminClientes.Cliente.fechaNacimiento, "17", "09", "2015");
		FormActions.selectById(AdminClientes.Cliente.paisNac, "170");
		FormActions.selectById(AdminClientes.Cliente.ciudadNac, "12781");
		FormActions.selectById(AdminClientes.Cliente.estadoCivil, "14124");
		FormActions.selectById(AdminClientes.Cliente.genero, "2");
		FormActions.selectById(AdminClientes.Cliente.provinciaNac, "F");
		FormActions.selectById(AdminClientes.Cliente.hobbies, "V,D"); 
		FormActions.enterText(AdminClientes.Trabajo.empresa, "Empresa 1");
		FormActions.enterText(AdminClientes.Trabajo.salario, "1800.74");
		FormActions.enterText(AdminClientes.Trabajo.direccion, "direcc 1");
		FormActions.enterText(AdminClientes.Trabajo.telefono, "1234449786");
		
		FormActions.clickLayout(AdminClientes.trabajo);
		FormActions.clickLayout(AdminClientes.trabajo);
	}

	@Cuando("ingresa datos financieros")
	public void ingresa_datos_financieros() {
		FormActions.clickLayout(AdminClientes.tab_datosFinancieros_814811); 
		
		FormActions.enterText(AdminClientes.ContabilidadCliente.ingresos, "1200");
		FormActions.enterText(AdminClientes.ContabilidadCliente.egresos, "500"); 
		FormActions.enterText(AdminClientes.ContabilidadCliente.extras, "200");

		GridActions.clickDeleteRecord(FormBienes.gridBien, 1);

		GridActions.clickNewRecord(FormBienes.gridBien);
		FormActions.selectByText(FormBienes.gridBien.origen, "HIPOTECADA(O)");
		FormActions.enterText(FormBienes.gridBien.avaluo, "5600");
		FormActions.selectById(FormBienes.gridBien.tipoBien, "T");
		GridActions.clickAcceptRecord(FormBienes.gridBien, 1);

		GridActions.clickNewRecord(FormBienes.gridBien);
		FormActions.selectByText(FormBienes.gridBien.origen, "ALQUILADA(O)");
		FormActions.enterText(FormBienes.gridBien.avaluo, "5600");
		FormActions.selectById(FormBienes.gridBien.tipoBien, "C");
		GridActions.clickCancelRecord(FormBienes.gridBien, 1);

		GridActions.clickNewRecord(FormBienes.gridBien);
		FormActions.selectById(FormBienes.gridBien.origen, "A");
		FormActions.enterText(FormBienes.gridBien.avaluo, "20000");
		FormActions.selectByText(FormBienes.gridBien.tipoBien, "DEPARTAMENTO");
		GridActions.clickAcceptRecord(FormBienes.gridBien, 1);
		
		GridActions.Pager.goToPage(FormBienes.gridBien, 3); 
		GridActions.Pager.morePages(FormBienes.gridBien);
		GridActions.Pager.lessPages(FormBienes.gridBien);
		GridActions.Pager.goNextPage(FormBienes.gridBien);
		GridActions.Pager.goPreviousPage(FormBienes.gridBien);
		GridActions.Pager.goFirstPage(FormBienes.gridBien);
	}

	@Cuando("ingresa datos de tarjeta de credito")
	public void ingresa_datos_de_tarjeta_de_credito() {
		FormActions.clickLayout(AdminClientes.tab_datosTarjetaCredito_837262);
		
		GridActions.clickDetailRecord(AdminClientes.gridTarjetaCredito, 1);
		GridActions.clickCloseDetailRecord(AdminClientes.gridTarjetaCredito, 1);
		GridActions.clickNewRecord(AdminClientes.gridTarjetaCredito);
		FormActions.enterText(TarjetaCredito.numero, "5566778899");
		FormActions.selectByText(TarjetaCredito.banco, "Produbanco");
		FormActions.setDateById(TarjetaCredito.fechaVencimiento, "08", "10", "2023");
		FormActions.clickOn(TarjetaCredito.Buttons.guardar_5rt);

		GridActions.Pager.goLastPage(AdminClientes.gridTarjetaCredito);
		GridActions.Pager.goFirstPage(AdminClientes.gridTarjetaCredito);
		GridActions.clickEditRecord(AdminClientes.gridTarjetaCredito, 1);
		FormActions.enterText(TarjetaCredito.numero, "5566888899");
		FormActions.clickOn(TarjetaCredito.Buttons.guardar_5rt);
	}
	
	@Entonces("se valida que se muestre lo esperado")
	public void se_valida_que_se_muestre_lo_esperado() {
		ValidationActions.isEquals(
				GridActions.getTargetByRowAndColumn(AdminClientes.gridTarjetaCredito, 1, 2),
				"1234567890");
		ValidationActions.isEquals(CabeceraCliente.Funcionario.nombreCompletoCli, "171393111 - PONCE CARLOS");
		ValidationActions.isEquals(CabeceraCliente.Funcionario.nombreFuncionario, "Alexandra Osorio");
		ValidationActions.isEquals(CabeceraCliente.Funcionario.fechaDesde, "viernes, 18 de septiembre de 2015");
	}

}
