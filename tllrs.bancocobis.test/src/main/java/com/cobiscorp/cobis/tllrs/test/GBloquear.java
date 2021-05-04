package com.cobiscorp.cobis.tllrs.test;

import org.openqa.selenium.By;

import com.cobiscorp.cobis.tllrs.test.FBusquedaClienteForm.FiltroBusquedaCliente.INPUT_BARRA_BUSCAR;
import com.cobiscorp.cobis.tllrs.test.FDetalleOperacionApertura.CabeceraInformacion.EstadoApertura;
import com.cobiscorp.cobis.utils.base.Singleton;
import com.cobiscorp.cobis.utils.controls.IButton;
import com.cobiscorp.cobis.utils.controls.IInputValue;
import com.cobiscorp.cobis.utils.events.ITextReadable;

import net.serenitybdd.screenplay.targets.Target;

public class GBloquear {
	
	public static class Buttons{
		
		public static final BotonNuevo botonNuevo = Singleton.getInstance(BotonNuevo.class);
		public static final BotonCatalogo botonCatalogo = Singleton.getInstance(BotonCatalogo.class);
		public static final BotonOpcionDeterioro botonOpcionDeterioro = Singleton.getInstance(BotonOpcionDeterioro.class);
		public static final BotonOpcionRequerimientoJudicial botonOpcionRequerimientoJudicial = Singleton.getInstance(BotonOpcionRequerimientoJudicial.class);
		public static final BotonOpcionMigracion botonOpcionMigracion = Singleton.getInstance(BotonOpcionMigracion.class);
		public static final BotonOpcionPerdida botonOpcionPerdida = Singleton.getInstance(BotonOpcionPerdida.class);
		public static final BotonOpcionRobo botonOpcionRobo = Singleton.getInstance(BotonOpcionRobo.class);
		
		public static final BotonAceptarMotivo botonAceptarMotivo = Singleton.getInstance(BotonAceptarMotivo.class);
		
		public static final BotonCerrarBloqueo botonCerrarBloqueo = Singleton.getInstance(BotonCerrarBloqueo.class);
		
		public static class BotonNuevo implements IButton {

			private String xPath = "//*[@id='QV_3871_47610']/div[1]/button";

			private Target target = Target.the("BotonNuevo").located(By.xpath(xPath));

			@Override
			public Target getTarget() {
				return target;
			}

			@Override
			public String getId() {
				return xPath;
			}
		}
		
		public static class BotonCatalogo implements IButton {

			private String xPath = "//*[@id='QV_3871_47610']/table/tbody/tr/td[1]/div/div/button";

			private Target target = Target.the("BotonCatalogo").located(By.xpath(xPath));

			@Override
			public Target getTarget() {
				return target;
			}

			@Override
			public String getId() {
				return xPath;
			}
		}
		
		public static class BotonOpcionDeterioro implements IButton {

			private String xPath = "//*[@id='QV_7893_50300']/table/tbody/tr[1]";

			private Target target = Target.the("BotonOpcionDeterioro").located(By.xpath(xPath));

			@Override
			public Target getTarget() {
				return target;
			}

			@Override
			public String getId() {
				return xPath;
			}
		}
		
		public static class BotonOpcionRequerimientoJudicial implements IButton {

			private String xPath = "//*[@id='QV_7893_50300']/table/tbody/tr[2]";

			private Target target = Target.the("BotonOpcionRequerimientoJudicial").located(By.xpath(xPath));

			@Override
			public Target getTarget() {
				return target;
			}

			@Override
			public String getId() {
				return xPath;
			}
		}
		
		public static class BotonOpcionMigracion implements IButton {

			private String xPath = "//*[@id='QV_7893_50300']/table/tbody/tr[3]";

			private Target target = Target.the("BotonOpcionMigracion").located(By.xpath(xPath));

			@Override
			public Target getTarget() {
				return target;
			}

			@Override
			public String getId() {
				return xPath;
			}
		}
		
		public static class BotonOpcionPerdida implements IButton {

			private String xPath = "//*[@id='QV_7893_50300']/table/tbody/tr[4]";

			private Target target = Target.the("BotonOpcionPerdida").located(By.xpath(xPath));

			@Override
			public Target getTarget() {
				return target;
			}

			@Override
			public String getId() {
				return xPath;
			}
		}
		
		public static class BotonOpcionRobo implements IButton {

			private String xPath = "//*[@id='QV_7893_50300']/table/tbody/tr[5]";

			private Target target = Target.the("BotonOpcionRobo").located(By.xpath(xPath));

			@Override
			public Target getTarget() {
				return target;
			}

			@Override
			public String getId() {
				return xPath;
			}
		}
		
		public static class BotonAceptarMotivo implements IButton {

			private String xPath = "//*[@id='QV_3871_47610']/table/tbody/tr/td[4]/a[1]";

			private Target target = Target.the("BotonAceptarMotivo").located(By.xpath(xPath));

			@Override
			public Target getTarget() {
				return target;
			}

			@Override
			public String getId() {
				return xPath;
			}
		}
		
		public static class BotonCerrarBloqueo implements IButton {

			private String xPath = "/html/body/div[4]/div/div/div[1]/button";

			private Target target = Target.the("BotonCerrarBloqueo").located(By.xpath(xPath));

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
	
	public static class InputText{
		
		public static final InputObservacion inputObservacion = Singleton.getInstance(InputObservacion.class);
		public static final InputMonto inputMonto = Singleton.getInstance(InputMonto.class);
		
		public static class InputObservacion implements IInputValue {

			private String id = "VA_TEXTINPUTBOXTXT_318195";
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
		
		public static class InputMonto implements IInputValue {

			private String id = "VA_TEXTINPUTBOXLIU_406195";
			private Target target = Target.the("InputMonto").located(By.id(id));

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
	
	public static class TextoDetalleOperacion{
		
		public static final PorcentajeBloqueo porcentajeBloqueo = Singleton.getInstance(PorcentajeBloqueo.class);
		
		public static class PorcentajeBloqueo implements ITextReadable {

			private String xPath = "//*[@id='G_FDETALLORE_185841']/div/div/form/div/div[1]/svg/g/g[5]/g/g[2]/text";
			private Target target = Target.the("PorcentajeBloqueo").located(By.xpath(xPath));

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
