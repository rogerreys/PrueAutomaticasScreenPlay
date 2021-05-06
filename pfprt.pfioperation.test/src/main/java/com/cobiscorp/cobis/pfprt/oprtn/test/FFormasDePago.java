package com.cobiscorp.cobis.pfprt.oprtn.test;

import org.openqa.selenium.By;

import com.cobiscorp.cobis.utils.base.Singleton;
import com.cobiscorp.cobis.utils.controls.IButton;
import com.cobiscorp.cobis.utils.controls.IGrid;
import com.cobiscorp.cobis.utils.controls.IComboBox;
import com.cobiscorp.cobis.utils.controls.IInputValue;
import com.cobiscorp.cobis.utils.events.IClickable;

import net.serenitybdd.screenplay.targets.Target;

public class FFormasDePago {

	public static class IngresarDatos {
		public static final Input_MontoRecepcion input_MontoRecepcion = Singleton
				.getInstance(Input_MontoRecepcion.class);

		public static class Input_MontoRecepcion implements IInputValue {

			private String id = "VA_MONTOTKRTOOHBQR_207373";
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

	public static class Seleccion {

		public static final FormaPago formaRecepcion = Singleton.getInstance(FormaPago.class);
		public static final Beneficiario beneficiario = Singleton.getInstance(Beneficiario.class);

		public static class FormaPago implements IComboBox {

			private String id = "VA_6153GLOUJHFTGTN_748373";

			private Target target = Target.the("FormaPago").located(By.id(id));

			@Override
			public Target getTarget() {
				return target;
			}

			@Override
			public String getId() {
				return id;
			}
		}

		public static class Beneficiario implements IComboBox {

			private String id = "VA_CLIENTETAHDVAHD_570373";

			private Target target = Target.the("Beneficiario").located(By.id(id));

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
		public static final BotonCuentaCliente botonCuentaCliente = Singleton.getInstance(BotonCuentaCliente.class);
		public static final BotonAceptarPago botonAceptarPago = Singleton.getInstance(BotonAceptarPago.class);
		public static final BotonGuardar botonGuardar = Singleton.getInstance(BotonGuardar.class);

		public static class BotonNuevo implements IButton {

			private String id = "QV_3793_41782_CUSTOM_CREATE";

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
		
		public static class BotonCuentaCliente implements IButton{
			
            private String xpath = "//*[@id='VA_CUENTAREFEREAAN_689373_DIV']/div/div/div/button";
            
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

		public static class BotonAceptarPago implements IButton {

			private String id = "CM_TPFPRTMB_1_1";

			private Target target = Target.the("BotonAceptarPago").located(By.id(id));

			@Override
			public Target getTarget() {
				return target;
			}

			@Override
			public String getId() {
				return id;
			}

		}

		public static class BotonGuardar implements IButton {

			private String id = "CM_TPFPRTYP_273";

			private Target target = Target.the("BotonGuardar").located(By.id(id));

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
