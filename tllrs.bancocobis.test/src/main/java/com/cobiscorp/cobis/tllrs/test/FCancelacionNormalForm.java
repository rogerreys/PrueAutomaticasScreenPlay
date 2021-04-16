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

import net.serenitybdd.screenplay.targets.Target;

public class FCancelacionNormalForm {
	
	
	public static class Buttons {

		public static final BotonSiguiente botonSiguiente = Singleton.getInstance(BotonSiguiente.class);

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
	
	
}
