package com.cobiscorp.cobis.pfprt.oprtn.test;

import org.openqa.selenium.By;

import com.cobiscorp.cobis.utils.base.Singleton;
import com.cobiscorp.cobis.utils.controls.IButton;
import com.cobiscorp.cobis.utils.controls.IDropDownList;
import com.cobiscorp.cobis.utils.controls.IInputValue;

import net.serenitybdd.screenplay.targets.Target;

public class FBusquedaDepositoForm {
	
	public static class Buttons{
		public static final BotonBuscar botonBuscar = Singleton.getInstance(BotonBuscar.class);
		public static class BotonBuscar implements IButton{
			
			private String id = "VA_VAIMAGEBUTTONNN_614498";
			private Target target = Target.the("BotonBuscarPor").located(By.id(id));
	
			@Override
			public Target getTarget() {
				return target;
			}
	
			@Override
			public String getId() {
				return id;
			}
	
		}
	}

	public static class Seleccion{
		public static final BuscarPor buscarPor = Singleton.getInstance(BuscarPor.class);
		public static class BuscarPor implements IDropDownList {

			private String id = "VA_OPTIONSRSSAYGFF_943498";
			
			private Target target = Target.the("BuscarPor").located(By.id(id));
	
			@Override
			public Target getTarget() {
				return target;
			}
	
			@Override
			public String getId() {
				return id;
			}
		}
	}

	public static class IngresarDatos{
		public static final Input_BuscarTodos input_BuscarTodos = Singleton.getInstance(Input_BuscarTodos.class);
		
		public static class Input_BuscarTodos implements IInputValue {

			private String id = "VA_OPERATIONNUMRER_544498";
			private Target target = Target.the("Input_BuscarTodos").located(By.id(id));

			@Override
			public Target getTarget() {
				return target;
			}

			@Override
			public String getId() {
				return id;
			}
		}
	}

	public static class GridListaP{
		public static final GridPrimerCliente gridPrimerCliente = Singleton.getInstance(GridPrimerCliente.class);
		
		public static class GridPrimerCliente implements IButton {

			private String xpath = "//*[@id='QV_5045_37178']/table/tbody/tr[1]/td[2]";
			private Target target = Target.the("Input_BuscarTodos").located(By.xpath(xpath));

			@Override
			public Target getTarget() {
				return target;
			}

			@Override
			public String getId() {
				return xpath;
			}
		}
	}
}
