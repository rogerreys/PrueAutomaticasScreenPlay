package com.cobiscorp.cobis.tllrs.test;

import org.openqa.selenium.By;

import com.cobiscorp.cobis.tllrs.test.AdminAperturaPlazoFijo.Buttons.BotonSiguiente;
import com.cobiscorp.cobis.tllrs.test.FDetalleOperacionApertura.Buttons.BotonAceptar;
import com.cobiscorp.cobis.tllrs.test.FDetalleOperacionApertura.Buttons.BotonActivar;
import com.cobiscorp.cobis.tllrs.test.FDetalleOperacionApertura.Buttons.BotonAnular;
import com.cobiscorp.cobis.tllrs.test.FDetalleOperacionApertura.Buttons.BotonModificacion;
import com.cobiscorp.cobis.tllrs.test.FDetalleOperacionApertura.Buttons.BotonOpcionesApertura;
import com.cobiscorp.cobis.tllrs.test.FDetalleOperacionApertura.Buttons.ComprobanteApertura;
import com.cobiscorp.cobis.utils.base.Singleton;
import com.cobiscorp.cobis.utils.controls.IButton;
import com.cobiscorp.cobis.utils.controls.IDropDownList;
import com.cobiscorp.cobis.utils.controls.IInputValue;

import net.serenitybdd.screenplay.targets.Target;

public class FCancelacionNormalForm {
	
	
	public static class Seleccion {

		public static final Solicitante solicitante = Singleton.getInstance(Solicitante.class);

		public static class Solicitante implements IDropDownList {

			private String id = "VA_5047UDXAMKYXHDA_309333";

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

	}
	
	public static class IngresarDatos {
		
		public static final InputObservacion inputObservacion = Singleton.getInstance(InputObservacion.class);

		public static class InputObservacion implements IInputValue {

			private String id = "VA_2428PLTIEWYVQVZ_831333";
			private Target target = Target.the("InputObservacion").located(By.id(id));

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

		public static final BotonSiguienteCli botonSiguientecli = Singleton.getInstance(BotonSiguienteCli.class);
		public static final BotonSiguienteOp botonSiguienteop = Singleton.getInstance(BotonSiguienteOp.class);

	}
	
	public static class BotonSiguienteCli implements IButton{
		
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
	
	
	public static class BotonSiguienteOp implements IButton{

		private String id = "CM_TPFPRTXO__7N";
		private Target target = Target.the("BotonSiguiente").located(By.id(id));

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
