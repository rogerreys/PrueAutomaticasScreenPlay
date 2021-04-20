package com.cobiscorp.cobis.tllrs.test;

import org.openqa.selenium.By;

import com.cobiscorp.cobis.tllrs.test.AdminCreacionAsientoContableMayorizado.FiltroComprobanteContable.Cuenta;
import com.cobiscorp.cobis.tllrs.test.AdminCreacionAsientoContableMayorizado.FiltroComprobanteContable.ValorMN;
import com.cobiscorp.cobis.utils.base.Singleton;
import com.cobiscorp.cobis.utils.controls.IButton;
import com.cobiscorp.cobis.utils.controls.IComboBox;
import com.cobiscorp.cobis.utils.controls.IControl;
import com.cobiscorp.cobis.utils.controls.IInputValue;
import com.cobiscorp.cobis.utils.events.IClickable;

import net.serenitybdd.screenplay.targets.Target;

public class AdminActualizacionComprobanteContable {
	
	public static final FiltroComprobanteContable FILTROCOMPROBANTECONTABLE = Singleton
			.getInstance(FiltroComprobanteContable.class);

	public static class FiltroComprobanteContable implements IControl {

		private String xpath = "/html/body/div[5]/iframe";
		private Target target = Target.the("Vista Comprobante Contable").located(By.xpath(xpath));


		public static final Cuenta CUENTA = Singleton.getInstance(Cuenta.class);
		public static final ValorMN VALORMN = Singleton.getInstance(ValorMN.class);

		public static class Buttons {

			public static final BotoneEliminarNuevo _BEN = Singleton.getInstance(BotoneEliminarNuevo.class);
			public static final BotonAceptarEliminar _BAE = Singleton.getInstance(BotonAceptarEliminar.class);
			public static final BotoneActualizarNuevoDebito _BAND = Singleton.getInstance(BotoneActualizarNuevoDebito.class);
			public static final BotoneActualizarCheckNuevoD _BACND = Singleton.getInstance(BotoneActualizarCheckNuevoD.class);
			public static final BotoneActualizarNuevoCredito _BANC = Singleton.getInstance(BotoneActualizarNuevoCredito.class);
			public static final BotoneActualizarCheckNuevoC _BACNC = Singleton.getInstance(BotoneActualizarCheckNuevoC.class);
			
			public static class BotoneActualizarCheckNuevoC implements IButton {
				
				private String xpath = "//tbody/tr[2]/td[14]/a[1]/span";
				private Target target = Target.the("BotoneActualizarCheckNuevoC").located(By.xpath(xpath));

				@Override
				public Target getTarget() {
					return target;
				}

				@Override
				public String getId() {
					return xpath;
				}
			}
			
			public static class BotoneActualizarCheckNuevoD implements IButton {
	
				private String xpath = "//tbody/tr[1]/td[14]/a[1]/span";
				private Target target = Target.the("BotoneActualizarCheckNuevoD").located(By.xpath(xpath));

				@Override
				public Target getTarget() {
					return target;
				}

				@Override
				public String getId() {
					return xpath;
				}
			}
			
			
			public static class BotoneActualizarNuevoDebito implements IButton {
				private String xpath = "//tbody/tr[1]/td[14]/a[1]/span";
				private Target target = Target.the("BotoneActualizarNuevoDebito").located(By.xpath(xpath));

				@Override
				public Target getTarget() {
					return target;
				}

				@Override
				public String getId() {
					return xpath;
				}
			}
			
			public static class BotoneActualizarNuevoCredito implements IButton {

				private String xpath = "//tbody/tr[2]/td[14]/a[1]/span";
				private Target target = Target.the("BotoneActualizarNuevoCredito").located(By.xpath(xpath));

				@Override
				public Target getTarget() {
					return target;
				}

				@Override
				public String getId() {
					return xpath;
				}
			}
			
			
			public static class BotoneEliminarNuevo implements IButton {

				private String xpath = "//tbody/tr[1]/td[14]/a[2]/span";
				private Target target = Target.the("BotoneEliminarNuevo").located(By.xpath(xpath));

				@Override
				public Target getTarget() {
					return target;
				}

				@Override
				public String getId() {
					return xpath;
				}
			}
			
			public static class BotonAceptarEliminar implements IButton {

				private String xpath = "/html/body/div[10]/div[2]/div[2]/nav/button[1]";
				private Target target = Target.the("BotonAceptarEliminar").located(By.xpath(xpath));

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
		
		public static class Cuenta implements IInputValue {

			private String xpath = "/html/body/div[1]/div[2]/div[2]/div/div[2]/div/div/div/div/div[3]/table/tbody/tr[2]/td[2]/div/input";
			private Target target = Target.the("CUENTA").located(By.xpath(xpath));

			@Override
			public Target getTarget() {
				return target;
			}

			@Override
			public String getId() {
				return xpath;
			}
		}
		
		
		
		public static class ValorMN implements IInputValue {

			private String xpath = "/html/body/div[1]/div[2]/div[2]/div/div[2]/div/div/div/div/div[3]/table/tbody/tr[2]/td[9]/span/span/input[1]";
			private Target target = Target.the("ValorMN").located(By.xpath(xpath));

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
			return xpath;
		}

	}

	
	

}
