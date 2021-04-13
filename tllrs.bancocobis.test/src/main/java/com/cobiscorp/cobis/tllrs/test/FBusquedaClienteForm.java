package com.cobiscorp.cobis.tllrs.test;

import org.openqa.selenium.By;

import com.cobiscorp.cobis.tllrs.test.AdminAperturaPlazoFijo.Buttons.BotonNuevo;
import com.cobiscorp.cobis.utils.base.Singleton;
import com.cobiscorp.cobis.utils.controls.IButton;
import com.cobiscorp.cobis.utils.controls.IDropDownList;
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
		
		public static class GridPrimerCliente implements IButton{
	
			private String rutaXPath = "//*[@id='QV_6093_38584']/div[3]/table/tbody/tr";
			private Target target = Target.the("gridPrimerCliente").located(By.xpath(rutaXPath));
	
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

	public static class Seleccion{
		public static final TipoCliente tipoCliente = Singleton.getInstance(TipoCliente.class);
		public static class TipoCliente implements IDropDownList {

			private String id = "VA_1MSIGVMWPJRFCVV_705587";
			
			private Target target = Target.the("TipoCliente").located(By.id(id));
	
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
}
