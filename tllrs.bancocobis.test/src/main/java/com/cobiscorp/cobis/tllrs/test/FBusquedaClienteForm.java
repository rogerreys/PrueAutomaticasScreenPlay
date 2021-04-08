package com.cobiscorp.cobis.tllrs.test;

import org.openqa.selenium.By;

import com.cobiscorp.cobis.tllrs.test.AdminAperturaPlazoFijo.Buttons.BotonNuevo;
import com.cobiscorp.cobis.utils.base.Singleton;
import com.cobiscorp.cobis.utils.controls.IButton;
import com.cobiscorp.cobis.utils.controls.IInputValue;

import net.serenitybdd.screenplay.targets.Target;

public class FBusquedaClienteForm {

	public static class FiltroBusquedaCliente {
		public static final INPUT_IDENTIFICACION input_IDENTIFICACION = Singleton.getInstance(INPUT_IDENTIFICACION.class);
		public static final INPUT_NOMBRE input_NOMBRE = Singleton.getInstance(INPUT_NOMBRE.class);
		public static final INPUT_APELLIDO input_APELLIDO = Singleton.getInstance(INPUT_APELLIDO.class);
		
		public static class INPUT_IDENTIFICACION implements IInputValue {

			private String id = "VA_DOCIDIXRMVJUDPW_205587";
			private Target target = Target.the("Identificacion").located(By.id(id));

			@Override
			public Target getTarget() {
				return target;
			}

			@Override
			public String getId() {
				return id;
			}
		}
		
		public static class INPUT_NOMBRE implements IInputValue{
			
			private String id = "VA_2WMXWFKWGXCJZWS_961587";
			private Target target = Target.the("Nombre").located(By.id(id));

			@Override
			public Target getTarget() {
				return target;
			}

			@Override
			public String getId() {
				return id;
			}			
		}
		
		public static class INPUT_APELLIDO implements IInputValue{
			
			private String id = "VA_PRIMERAPELLIDDO_176587";
			private Target target = Target.the("Apellido").located(By.id(id));

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

	public static class Buttons{
		
		public static final BotonBuscarCliente botonBuscarCliente = Singleton.getInstance(BotonBuscarCliente.class);
		public static class BotonBuscarCliente implements IButton{
	
			private String rutaXPath = "//*[@id='VA_VAIMAGEBUTTONNN_801587']";
			private Target target = Target.the("BotonBuscarCliente").located(By.xpath(rutaXPath));
	
			@Override
			public Target getTarget() {
				return target;
			}
	
			@Override
			public String getId() {
				return rutaXPath;
			}
	
		}
	}

	public static class GridListaP{
		public static final GridPrimerCliente gridPrimerCliente = Singleton.getInstance(GridPrimerCliente.class);
		public static final GridSegundoCliente gridSegundoCliente = Singleton.getInstance(GridSegundoCliente.class);
		
		public static class GridPrimerCliente implements IButton{
	
			private String rutaXPath = "//span[contains(text(),'1366')]";
			private Target target = Target.the("Primer Cliente").located(By.xpath(rutaXPath));
	
			@Override
			public Target getTarget() {
				return target;
			}
	
			@Override
			public String getId() {
				return rutaXPath;
			}
	
		}
		
		public static class GridSegundoCliente implements IButton{
			
			private String rutaXPath = "//span[contains(text(),'71')]";
			private Target target = Target.the("Primer Cliente").located(By.xpath(rutaXPath));
	
			@Override
			public Target getTarget() {
				return target;
			}
	
			@Override
			public String getId() {
				return rutaXPath;
			}
	
		}
		
	}
}
