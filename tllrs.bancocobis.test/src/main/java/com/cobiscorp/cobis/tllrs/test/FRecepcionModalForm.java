package com.cobiscorp.cobis.tllrs.test;

import org.openqa.selenium.By;

import com.cobiscorp.cobis.tllrs.test.FVistaOperacionForm.Buttons.BotonSimular;
import com.cobiscorp.cobis.utils.base.Singleton;
import com.cobiscorp.cobis.utils.controls.IButton;
import com.cobiscorp.cobis.utils.controls.IComboBox;
import com.cobiscorp.cobis.utils.controls.IDropDownList;
import com.cobiscorp.cobis.utils.controls.IGrid;
import com.cobiscorp.cobis.utils.controls.IInputValue;
import com.cobiscorp.cobis.utils.controls.ILayout;
import com.cobiscorp.cobis.utils.events.IClickable;

import net.serenitybdd.screenplay.targets.Target;

public class FRecepcionModalForm {

	public static class Seleccion{
		public static final FormaRecepcion formaRecepcion = Singleton.getInstance(FormaRecepcion.class);
		public static final Cliente cliente = Singleton.getInstance(Cliente.class);
		
		public static class FormaRecepcion implements IComboBox {

			private String id = "VA_CODIGOAPAGOKIMV_550386";
			
			private Target target = Target.the("FormaRecepcion").located(By.xpath(id));
	
			@Override
			public Target getTarget() {
				return target;
			}
	
			@Override
			public String getId() {
				return id;
			}
		}
	
		public static class Cliente implements IComboBox {

			private String id = "VA_CLIENTESCJFYNZM_349386";
			
			private Target target = Target.the("Cliente").located(By.id(id));
	
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
		public static final Input_MontoRecepcion input_MontoRecepcion = Singleton.getInstance(Input_MontoRecepcion.class);	
		public static final InputFormaRecepcion inputFormaRecepcion = Singleton.getInstance(InputFormaRecepcion.class);
		public static final InputPrimerCliente inputprimerCliente = Singleton.getInstance(InputPrimerCliente.class);
		
		public static class InputFormaRecepcion implements IInputValue {

			private String xpath = "//*[@id='VA_CODIGOAPAGOKIMV_550386_DIV']/div/span[1]/span/input";
			
			private Target target = Target.the("FormaRecepcion").located(By.xpath(xpath));
	
			@Override
			public Target getTarget() {
				return target;
			}
	
			@Override
			public String getId() {
				return xpath;
			}
		}
		
		
		public static class Input_MontoRecepcion implements IInputValue {

			private String id = "VA_MONTOIZNJERYLGS_823386";
			private Target target = Target.the("Ingreso Monto").located(By.id(id));

			@Override
			public Target getTarget() {
				return target;
			}

			@Override
			public String getId() {
				return id;
			}
		}

		public static class InputPrimerCliente implements IInputValue {

			private String id = "VA_CLIENTESCJFYNZM_349386";
			private Target target = Target.the("InputPrimerCliente").located(By.id(id));

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
	
	public static class Buttons {
		public static final BotonNuevo botonNuevo = Singleton.getInstance(BotonNuevo.class);
		public static final BotonAceptarRecepcion botonAceptarRecepcion = Singleton.getInstance(BotonAceptarRecepcion.class);
		public static final BotonGuardarRecepcion botonGuardarRecepcion = Singleton.getInstance(BotonGuardarRecepcion.class);
		public static final BotonSeleccionRecepcion botonSeleccionRecepcion = Singleton.getInstance(BotonSeleccionRecepcion.class);
		public static final BotonCuentaCliente botonCuentaCliente = Singleton.getInstance(BotonCuentaCliente.class);
		public static final BotonFormaRecepcion botonFormaRecepcion = Singleton.getInstance(BotonFormaRecepcion.class);
		public static final BotonSiguienteRecepcion botonSiguienteRecepcion = Singleton.getInstance(BotonSiguienteRecepcion.class);
		
		public static class BotonSeleccionRecepcion implements IButton{
			
			private String id = "//*[@id='QV_6933_39827']/table/tbody";
			
			private Target target = Target.the("BotonNuevo").located(By.xpath(id));
	
			@Override
			public Target getTarget() {
				return target;
			}
	
			@Override
			public String getId() {
				return id;
			}
	
		}
		
		public static class BotonNuevo implements IButton{
			
			private String id = "QV_6933_39827_CUSTOM_CREATE";
			
			private Target target = Target.the("BotonNuevo").located(By.id(id));
	
			@Override
			public Target getTarget() {
				return target;
			}
	
			@Override
			public String getId() {
				return id;
			}
	
		}
		
		public static class BotonAceptarRecepcion implements IButton{
			
			private String id = "CM_TPFPRTUL_O1P";
			
			private Target target = Target.the("BotonNuevo").located(By.id(id));
	
			@Override
			public Target getTarget() {
				return target;
			}
	
			@Override
			public String getId() {
				return id;
			}
	
		}

		public static class BotonGuardarRecepcion implements IButton{
			
			private String id = "CM_TPFPRTXU_7OV";
			
			private Target target = Target.the("BotonGuardarRecepcion").located(By.id(id));
	
			@Override
			public Target getTarget() {
				return target;
			}
	
			@Override
			public String getId() {
				return id;
			}
	
		}
		
		public static class BotonSiguienteRecepcion implements IButton{
			
			private String id = "CM_TPFPRTXU_HPX";
			
			private Target target = Target.the("BotonSiguienteRecepcion").located(By.id(id));
	
			@Override
			public Target getTarget() {
				return target;
			}
	
			@Override
			public String getId() {
				return id;
			}
	
		}

		public static class BotonCuentaCliente implements IButton{
			
			private String xpath = "//body/div[6]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[6]/div[1]/div[1]/div[1]/div[1]/button[1]";
			
			private Target target = Target.the("BotonCuentaCliente").located(By.xpath(xpath));
	
			@Override
			public Target getTarget() {
				return target;
			}
	
			@Override
			public String getId() {
				return xpath;
			}
	
		}

		public static class BotonFormaRecepcion implements IButton{
			
			private String xpath = "//*[@id='VA_CODIGOAPAGOKIMV_550386_DIV']/div/span/span/span/span";
			
			private Target target = Target.the("BotonCuentaCliente").located(By.xpath(xpath));
	
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
	
	
	public static final Grid grid = Singleton.getInstance(Grid.class);
	
	public static class Grid implements IGrid {
		private String id = "QV_9795_86035";
		private Target target = Target.the("QV_9795_86035").located(By.id(id));
		
		public static final GridPrimerCliente gridPrimerCliente = Singleton.getInstance(GridPrimerCliente.class);
		
		public static class GridPrimerCliente implements IClickable{
			
			private String xpath = "//*[@id='QV_9795_86035']/table/tbody/tr/td[1]/span[1]";
			private Target target = Target.the("GridPrimerCliente").located(By.xpath(xpath));
	
			@Override
			public Target getTarget() {
				return target;
			}
	
			@Override
			public String getId() {
				return xpath;
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
	}
}
