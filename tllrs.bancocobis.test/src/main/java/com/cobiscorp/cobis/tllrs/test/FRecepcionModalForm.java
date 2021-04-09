package com.cobiscorp.cobis.tllrs.test;

import org.openqa.selenium.By;

import com.cobiscorp.cobis.tllrs.test.FVistaOperacionForm.Buttons.BotonSimular;
import com.cobiscorp.cobis.utils.base.Singleton;
import com.cobiscorp.cobis.utils.controls.IButton;
import com.cobiscorp.cobis.utils.controls.IComboBox;
import com.cobiscorp.cobis.utils.controls.IInputValue;

import net.serenitybdd.screenplay.targets.Target;

public class FRecepcionModalForm {

	public static class Seleccion{
		public static final FormaRecepcion formaRecepcion = Singleton.getInstance(FormaRecepcion.class);
		
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
	}
	
	public static class IngresarDatos{
		public static final Input_MontoRecepcion input_MontoRecepcion = Singleton.getInstance(Input_MontoRecepcion.class);	
		public static final InputFormaRecepcion inputFormaRecepcion = Singleton.getInstance(InputFormaRecepcion.class);
		
		public static class InputFormaRecepcion implements IInputValue {

			private String id = "VA_CODIGOAPAGOKIMV_550386";
			
			private Target target = Target.the("FormaRecepcion").located(By.id(id));
	
			@Override
			public Target getTarget() {
				return target;
			}
	
			@Override
			public String getId() {
				return id;
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
	}
	
	public static class Buttons {
		public static final BotonNuevo botonNuevo = Singleton.getInstance(BotonNuevo.class);
		public static final BotonAceptarRecepcion botonAceptarRecepcion = Singleton.getInstance(BotonAceptarRecepcion.class);
		public static final BotonGuardarRecepcion botonGuardarRecepcion = Singleton.getInstance(BotonGuardarRecepcion.class);
		public static final BotonSeleccionRecepcion botonSeleccionRecepcion = Singleton.getInstance(BotonSeleccionRecepcion.class);
		
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
	}
}
