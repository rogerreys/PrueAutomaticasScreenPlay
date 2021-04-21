package com.cobiscorp.cobis.tllrs.test;

import org.openqa.selenium.*;

import com.cobiscorp.cobis.tllrs.test.BusquedaClientes.FiltroCliente.Apellido;
import com.cobiscorp.cobis.tllrs.test.BusquedaClientes.FiltroCliente.Identificacion;
import com.cobiscorp.cobis.utils.base.Singleton;
import com.cobiscorp.cobis.utils.controls.IButton;
import com.cobiscorp.cobis.utils.controls.IComboBox;
import com.cobiscorp.cobis.utils.controls.IControl;
import com.cobiscorp.cobis.utils.controls.IDropDownList;
import com.cobiscorp.cobis.utils.controls.IInputValue;

import net.serenitybdd.screenplay.targets.Target;

public class AdminAperturaPlazoFijo {
	
	public static final BusquedaClientes busquedaCliuentes = Singleton.getInstance(BusquedaClientes.class);
	
	public static final TipoCuenta tipoCuenta = Singleton.getInstance(TipoCuenta.class);
	
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
		public static final BotonBuscarCliente botonBuscarCliente = Singleton.getInstance(BotonBuscarCliente.class);
		public static final BotonSiguiente botonSiguiente = Singleton.getInstance(BotonSiguiente.class);
		public static final BotonAceptarEliminacion botonAceptarEliminacion = Singleton.getInstance(BotonAceptarEliminacion.class);
		
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
		
		public static class BotonBuscarCliente implements IButton{
			
			private String rutaXPath = "//*[@id='QV_3754_56204']/table/tbody/tr[1]/td[2]/div/div/button";
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
			
			private String rutaXPath = "//*[@id='CM_TPFPRTMQ_FFB']";
			private Target target = Target.the("Botón Siguiente").located(By.xpath(rutaXPath));

			@Override
			public Target getTarget() {
				return target;
			}

			@Override
			public String getId() {
				return rutaXPath;
			}
		}	
		
		public static class BotonAceptarEliminacion implements IButton{
			
			private String rutaXPath = "/html/body/div[5]/div[2]/div[2]/nav/button[1]";
			private Target target = Target.the("Botón Siguiente").located(By.xpath(rutaXPath));

			@Override
			public Target getTarget() {
				return target;
			}

			@Override
			public String getId() {
				return rutaXPath;
			}
		}
	
		 public static class botonNuevoAsientoContable implements IButton {
			 
			 private String id = "/html/body/div[1]/div[2]/div[2]/div/div[2]/div/div/table/tbody/tr/td[2]/div/div/button";
             private Target target = Target.the("botonNuevoAsientoContable").located(By.xpath(id));

			

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

	public static class ButtonsRow{
		public static final ButtonsAcceptRow buttonsAcceptRow = Singleton.getInstance(ButtonsAcceptRow.class);
		public static final ButtonsDeleteRow buttonsDeleteRow = Singleton.getInstance(ButtonsDeleteRow.class);
		
		public static class ButtonsAcceptRow implements IButton {
			private String xpath = "//tbody/tr[1]/td[5]/a[1]";
			
	        private Target target = Target.the("Botón Check Intgresar Cliente").located(By.xpath(xpath));
		
	         @Override
	         public Target getTarget() {
	             return target;
	         }
	
	
	
	         @Override
	         public String getId() {
	             return xpath;
	         }
		}
		
		public static class ButtonsDeleteRow implements IButton {
			private String xpath = "//tbody/tr[1]/td[7]/a[1]";
			//private String xpath = "//*[@id='QV_6933_39827']/table/tbody/tr/td[7]/a";
	        private Target target = Target.the("Botón eliminar fila").located(By.xpath(xpath));
		
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
	
	public static class TipoCuenta implements IDropDownList{
		
		private String id = "VA_9493EMREWQEQIQW_409581";
		private Target target = Target.the("Tipo Cuenta").located(By.id(id));

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
