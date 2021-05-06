/*
 * Esta aplicacion es parte de los paquetes bancarios propiedad de COBISCORP.
 * Su uso no autorizado queda expresamente prohibido asi como cualquier
 * alteracion o agregado hecho por alguno de sus usuarios sin el debido
 * consentimiento por escrito de COBISCORP.
 * Este programa esta protegido por la ley de derechos de autor y por las
 * convenciones internacionales de propiedad intelectual. Su uso no
 * autorizado dara derecho a COBISCORP para obtener ordenes de secuestro
 * o retencion y para perseguir penalmente a los autores de cualquier infraccion.
 */
package com.cobiscorp.cobis.pfprt.oprtn.test;

import org.openqa.selenium.By;

import com.cobiscorp.cobis.utils.base.Singleton;
import com.cobiscorp.cobis.utils.controls.IButton;
import com.cobiscorp.cobis.utils.controls.impl.*;
import com.cobiscorp.cobis.utils.events.ITextReadable;

import net.serenitybdd.screenplay.targets.Target;

public class FDetalleOperacionForm{

	private FDetalleOperacionForm() {
		throw new IllegalStateException("FDetalleOperacionForm is a utility class");
	}
	public static class Layouts {
		private Layouts() {
			throw new IllegalStateException("Layouts is a utility class");
		}
		public static final LytGroup1287IdGFDETALLORE185841 lytGroup1287IdGFDETALLORE185841 = Singleton.getInstance(LytGroup1287IdGFDETALLORE185841.class);
		
		public static class LytGroup1287IdGFDETALLORE185841 extends COBISTab {
			public LytGroup1287IdGFDETALLORE185841(){
				this.init("G_FDETALLORE_185841", "Resumen");
			}
		}
		
		public static final LytGroup2854IdGFDETALLECP908841 lytGroup2854IdGFDETALLECP908841 = Singleton.getInstance(LytGroup2854IdGFDETALLECP908841.class);
		
		public static class LytGroup2854IdGFDETALLECP908841 extends COBISTab {
			public LytGroup2854IdGFDETALLECP908841(){
				this.init("G_FDETALLECP_908841", "Titulares");
			}
		}
		
		public static final LytGroup2995IdGFDETALLEPC184841 lytGroup2995IdGFDETALLEPC184841 = Singleton.getInstance(LytGroup2995IdGFDETALLEPC184841.class);
		
		public static class LytGroup2995IdGFDETALLEPC184841 extends COBISTab {
			public LytGroup2995IdGFDETALLEPC184841(){
				this.init("G_FDETALLEPC_184841", "Operación");
			}
		}
		
		public static final LytGroup2278IdGFDETALLPNR812841 lytGroup2278IdGFDETALLPNR812841 = Singleton.getInstance(LytGroup2278IdGFDETALLPNR812841.class);
		
		public static class LytGroup2278IdGFDETALLPNR812841 extends COBISTab {
			public LytGroup2278IdGFDETALLPNR812841(){
				this.init("G_FDETALLPNR_812841", "Recepción de Fondos");
			}
		}
		
		public static final LytGroup2985IdGFDETALLORO446841 lytGroup2985IdGFDETALLORO446841 = Singleton.getInstance(LytGroup2985IdGFDETALLORO446841.class);
		
		public static class LytGroup2985IdGFDETALLORO446841 extends COBISTab {
			public LytGroup2985IdGFDETALLORO446841(){
				this.init("G_FDETALLORO_446841", "Formas de Pago");
			}
		}
		
		public static final LytGroup2855IdGFDETALLROI480841 lytGroup2855IdGFDETALLROI480841 = Singleton.getInstance(LytGroup2855IdGFDETALLROI480841.class);
		
		public static class LytGroup2855IdGFDETALLROI480841 extends COBISTab {
			public LytGroup2855IdGFDETALLROI480841(){
				this.init("G_FDETALLROI_480841", "Movimientos Monetarios");
			}
		}
		
		public static final LytGroup2903IdGFDETALLPOE246841 lytGroup2903IdGFDETALLPOE246841 = Singleton.getInstance(LytGroup2903IdGFDETALLPOE246841.class);
		
		public static class LytGroup2903IdGFDETALLPOE246841 extends COBISTab {
			public LytGroup2903IdGFDETALLPOE246841(){
				this.init("G_FDETALLPOE_246841", "Historia");
			}
		}
		
	}
	
	public static class Buttons {
		private Buttons() {
			throw new IllegalStateException("Buttons is a utility class");
		}

	}
	
	public static class CabeceraInformacion{
		public static final EstadoCertificado estadoCertificado = Singleton.getInstance(EstadoCertificado.class);
		
		public static class EstadoCertificado implements ITextReadable {

			private String id = "HVA_INFOATTRIBUTE_3";
			private Target target = Target.the("EstadoCertificado").located(By.id(id));

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
	
	public static class ResumenInformacion{
		
		public static final MontoBloqueado montoBloqueado = Singleton.getInstance(MontoBloqueado.class);
		
		public static class MontoBloqueado implements ITextReadable {

			private String xPath = "//*[@id='G_FDETALLORE_185841']/div/div/form/div/div[2]/div[4]/div[2]";
			private Target target = Target.the("MontoBloqueado").located(By.xpath(xPath));

			@Override
			public Target getTarget() {
				return target;
			}

			@Override
			public String getId() {
				return xPath;
			}
		}
		
	}
	
}