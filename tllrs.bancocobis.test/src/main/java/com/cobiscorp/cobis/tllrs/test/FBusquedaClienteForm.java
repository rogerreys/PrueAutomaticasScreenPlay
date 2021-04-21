package com.cobiscorp.cobis.tllrs.test;

import org.openqa.selenium.By;

import com.cobiscorp.cobis.tllrs.test.AdminAperturaPlazoFijo.Buttons.BotonNuevo;
import com.cobiscorp.cobis.utils.base.Singleton;
import com.cobiscorp.cobis.utils.controls.IButton;
import com.cobiscorp.cobis.utils.controls.IComboBox;
import com.cobiscorp.cobis.utils.controls.IDropDownList;
import com.cobiscorp.cobis.utils.controls.IGrid;
import com.cobiscorp.cobis.utils.controls.IInputValue;

import net.serenitybdd.screenplay.targets.Target;

public class FBusquedaClienteForm {

	public static class FiltroBusquedaCliente {
		public static final INPUT_IDENTIFICACION input_IDENTIFICACION = Singleton.getInstance(INPUT_IDENTIFICACION.class);
		public static final INPUT_NOMBRE input_NOMBRE = Singleton.getInstance(INPUT_NOMBRE.class);
		public static final INPUT_APELLIDO input_APELLIDO = Singleton.getInstance(INPUT_APELLIDO.class);
		
		public static final INPUT_BARRA_BUSCAR input_BARRA_BUSCAR = Singleton.getInstance(INPUT_BARRA_BUSCAR.class);
		
		
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

		public static class INPUT_BARRA_BUSCAR implements IInputValue{
			
			private String id = "autoCompleteControl";
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
		
		public static final BotonEntidad botonEntidad = Singleton.getInstance(BotonEntidad.class);
		public static final BotonEntidadCliente botonEntidadCliente = Singleton.getInstance(BotonEntidadCliente.class);
		public static final BotonEntidadProspecto botonEntidadProspecto = Singleton.getInstance(BotonEntidadProspecto.class);
		public static final BotonTipo botonTipo = Singleton.getInstance(BotonTipo.class);
		public static final BotonTipoNatural botonTipoNatural = Singleton.getInstance(BotonTipoNatural.class);
		public static final BotonTipoJuridico botonTipoJuridico = Singleton.getInstance(BotonTipoJuridico.class);
		public static final BotonBuscarPor botonBuscarPor = Singleton.getInstance(BotonBuscarPor.class);
		public static final BotonBuscarPorNombre botonBuscarPorNombre = Singleton.getInstance(BotonBuscarPorNombre.class);
		public static final BotonBuscar botonBuscar = Singleton.getInstance(BotonBuscar.class);
		public static final BotonSiguiente botonSiguiente = Singleton.getInstance(BotonSiguiente.class);
		
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
		public static class BotonEntidad implements IButton{
			
			private String rutaXPath = "/html/body/div[6]/div/div/div[2]/div/div/form/div/fieldset/div/div/div[2]/div/div[2]/div/div[2]/div[1]/div[2]/div/button";

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
		public static class BotonEntidadCliente implements IButton{
			
			private String rutaXPath = "/html/body/div[6]/div/div/div[2]/div/div/form/div/fieldset/div/div/div[2]/div/div[2]/div/div[2]/div[1]/div[2]/div/ul/li[1]";
			
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
		public static class BotonEntidadProspecto implements IButton{
			
			private String rutaXPath = "/html/body/div[6]/div/div/div[2]/div/div/form/div/fieldset/div/div/div[2]/div/div[2]/div/div[2]/div[1]/div[2]/div/ul/li[2]";
			
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
		public static class BotonTipo implements IButton{
			
			private String rutaXPath = "//*[@id='filters']/div[3]/div/div/button";

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
		public static class BotonTipoNatural implements IButton{
			
			private String rutaXPath = "//*[@id='filters']/div[3]/div/div/ul/li[1]";

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
		public static class BotonTipoJuridico implements IButton{
			
			private String rutaXPath = "//*[@id='filters']/div[3]/div/div/ul/li[2]";

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
		public static class BotonBuscarPor implements IButton{
			
			private String rutaXPath = "//*[@id='filters']/div[4]/div/div/button";

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
		public static class BotonBuscarPorNombre implements IButton{
			
			private String rutaXPath = "//*[@id='filters']/div[4]/div/div/ul/li[2]";

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
		public static class BotonBuscar implements IButton{
			
			private String rutaXPath = "//*[@id='organizer']/div/div/div[2]/div/div[1]/div/div[3]/div/div/button";

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
		public static class BotonSiguiente implements IButton{
			
			private String rutaXPath = "//*[@id='organizer']/div/div/div[3]/div/div[4]/button[3]";
			
			private Target target = Target.the("BotonSiguiente").located(By.xpath(rutaXPath));
	
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
		public static final GridPrimerClienteJuridico gridPrimerClienteJuridico = Singleton.getInstance(GridPrimerClienteJuridico.class);
		
		public static final GridClienteNatural gridClienteNatural = Singleton.getInstance(GridClienteNatural.class);
		public static final GridClienteJuridico gridClienteJuridico = Singleton.getInstance(GridClienteJuridico.class);

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
		public static class GridPrimerClienteJuridico implements IButton{
			
			private String rutaXPath = "//*[@id='QV_6632_39941']/div[3]/table/tbody/tr[1]";
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

		public static class GridClienteNatural implements IButton{
			
			private String rutaXPath = "//*[@id='gridNaturalId']/div[3]/table/tbody/tr[1]";
				
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
		public static class GridClienteJuridico implements IButton{
			
			private String rutaXPath = "//*[@id='gridCompanyId']/div[3]/table/tbody/tr[1]";
				
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
