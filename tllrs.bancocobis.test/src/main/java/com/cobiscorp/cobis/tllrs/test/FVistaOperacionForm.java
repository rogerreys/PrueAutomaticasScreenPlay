package com.cobiscorp.cobis.tllrs.test;

import org.openqa.selenium.By;

import com.cobiscorp.cobis.tllrs.test.FBusquedaClienteForm.Buttons.BotonBuscarCliente;
import com.cobiscorp.cobis.tllrs.test.FBusquedaClienteForm.FiltroBusquedaCliente.INPUT_IDENTIFICACION;
import com.cobiscorp.cobis.tllrs.test.FormBienes.Bien.Origen;
import com.cobiscorp.cobis.utils.base.Singleton;
import com.cobiscorp.cobis.utils.controls.IButton;
import com.cobiscorp.cobis.utils.controls.IComboBox;
import com.cobiscorp.cobis.utils.controls.IDropDownList;
import com.cobiscorp.cobis.utils.controls.IGrid;
import com.cobiscorp.cobis.utils.controls.IInputValue;

import net.serenitybdd.screenplay.targets.Target;

public class FVistaOperacionForm {
	
	public static class Seleccion {
		
		public static final CERTIFICADOVIP certificadoVIP = Singleton.getInstance(CERTIFICADOVIP.class);
		public static final FormaPago formaPago = Singleton.getInstance(FormaPago.class);
		public static final FercuenciaPago fercuenciaPago = Singleton.getInstance(FercuenciaPago.class);
		public static final Categoria categoria = Singleton.getInstance(Categoria.class);
		
		public static class CERTIFICADOVIP implements IDropDownList {

			private String id = "VA_6382FCVFPQQZAQS_544483";
			
			private Target target = Target.the("CERTIFICADO VIP").located(By.id(id));
	
			@Override
			public Target getTarget() {
				return target;
			}
	
			@Override
			public String getId() {
				return id;
			}
		}
	
		public static class FormaPago implements IDropDownList {

			private String id = "VA_CODIGOAPAGOKDMY_947483";
			
			private Target target = Target.the("Forma de pago").located(By.id(id));
	
			@Override
			public Target getTarget() {
				return target;
			}
	
			@Override
			public String getId() {
				return id;
			}
		}
	
		public static class FercuenciaPago implements IDropDownList {

			private String id = "VA_1990ZLIMNFDCHPC_590483";
			
			private Target target = Target.the("Frecuencia de pago").located(By.id(id));
	
			@Override
			public Target getTarget() {
				return target;
			}
	
			@Override
			public String getId() {
				return id;
			}
		}

		public static class Categoria implements IDropDownList {

			private String id = "VA_9037ZLZRWQMOXVW_704483";
			
			private Target target = Target.the("Categoria").located(By.id(id));
	
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
		public static final Input_Monto input_Monto = Singleton.getInstance(Input_Monto.class);
		public static final Input_Plazo input_Plazo = Singleton.getInstance(Input_Plazo.class);
		
		public static class Input_Monto implements IInputValue {

			private String id = "VA_4625AEXERXZYJSY_772483";
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
	
		public static class Input_Plazo implements IInputValue {

			private String id = "VA_2745QLCWKQUCCTK_953483";
			private Target target = Target.the("Ingreso Plazo").located(By.id(id));

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
		public static final BotonSimular botonSimular = Singleton.getInstance(BotonSimular.class);
		public static final BotonAceptarModal botonAceptarModal = Singleton.getInstance(BotonAceptarModal.class);
		public static final BotonSiguiente botonSiguiente = Singleton.getInstance(BotonSiguiente.class);
		
		public static class BotonSimular implements IButton{
	
			private String id = "VA_VABUTTONGXXYYCM_171483";
			private Target target = Target.the("BotonSimular").located(By.id(id));
	
			@Override
			public Target getTarget() {
				return target;
			}
	
			@Override
			public String getId() {
				return id;
			}
	
		}
	
		public static class BotonAceptarModal implements IButton{
			
			private String id = "CM_TPFPRTTS_9T_";
			private Target target = Target.the("BotonAceptarModal").located(By.id(id));
	
			@Override
			public Target getTarget() {
				return target;
			}
	
			@Override
			public String getId() {
				return id;
			}
	
		}

		public static class BotonSiguiente implements IButton{
			
			private String id = "CM_TPFPRTCK_KRJ";
			private Target target = Target.the("BotonAceptarModal").located(By.id(id));
	
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