package com.cobiscorp.cobis.tllrs.test;

import org.openqa.selenium.*;

import com.cobiscorp.cobis.tllrs.test.BusquedaClientes.FiltroCliente.Apellido;
import com.cobiscorp.cobis.tllrs.test.BusquedaClientes.FiltroCliente.Identificacion;
import com.cobiscorp.cobis.utils.base.Singleton;
import com.cobiscorp.cobis.utils.controls.IButton;
import com.cobiscorp.cobis.utils.controls.IControl;
import com.cobiscorp.cobis.utils.controls.IInputValue;

import net.serenitybdd.screenplay.targets.Target;

public class AdminAperturaPlazoFijo {
	
	public static final BusquedaClientes busquedaCliuentes = Singleton.getInstance(BusquedaClientes.class);
	
	public static class BusquedaClientes implements IControl{
		
		private String id = "VC_FBUSQUEDCC_714206";
		private Target target = Target.the("BusquedaClientes").located(By.id(id));
		
		public static final Identificacion identificacion = Singleton.getInstance(Identificacion.class);
		public static final Apellido apellido = Singleton.getInstance(Apellido.class);
		
		public static class Buttons{
			public static final VA_VAIMAGEBUTTONNN_801587 _801587 = Singleton
					.getInstance(VA_VAIMAGEBUTTONNN_801587.class);
			
			public static class VA_VAIMAGEBUTTONNN_801587 implements IButton{
				
				private String id = "VA_VAIMAGEBUTTONNN_801587";
				private Target target = Target.the("VA_VAIMAGEBUTTONNN_801587").located(By.id(id));
				
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

		@Override
		public Target getTarget() {
			return target;
		}

		@Override
		public String getId() {
			return id;
		}
		
		public static class ClienteIdentificacion implements IInputValue{
			
			private String id = "VA_DOCIDIXRMVJUDPW_205587_DIV";
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
	}
	
	public static class Buttons{
		
		public static final BotonNuevo nuevoCliente = Singleton.getInstance(BotonNuevo.class);
		
		public static class BotonNuevo implements IButton{
			
			private String rutaXPath = "/html/body/div[1]/div[2]/div[2]/div/div[2]/div/div/div[1]/button";
			private Target target = Target.the("BotonNuevo").located(By.xpath(rutaXPath));

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
