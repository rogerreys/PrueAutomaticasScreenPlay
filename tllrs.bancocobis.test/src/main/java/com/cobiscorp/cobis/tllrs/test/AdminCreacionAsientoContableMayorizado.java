package com.cobiscorp.cobis.tllrs.test;

import org.openqa.selenium.By;
import com.cobiscorp.cobis.utils.base.Singleton;
import com.cobiscorp.cobis.utils.controls.IButton;
import com.cobiscorp.cobis.utils.controls.IComboBox;
import com.cobiscorp.cobis.utils.controls.IControl;
import com.cobiscorp.cobis.utils.controls.IGrid;
import com.cobiscorp.cobis.utils.controls.IInputValue;
import com.cobiscorp.cobis.utils.events.IClickable;

import net.serenitybdd.screenplay.targets.Target;

public class AdminCreacionAsientoContableMayorizado {

	public static final FiltroComprobanteContable FILTROCOMPROBANTECONTABLE = Singleton
			.getInstance(FiltroComprobanteContable.class);

	public static class FiltroComprobanteContable implements IControl {

		private String xpath = "/html/body/div[5]/iframe";
		private Target target = Target.the("Vista Comprobante Contable").located(By.xpath(xpath));

		public static final Fecha FECHA = Singleton.getInstance(Fecha.class);
		public static final Descripcion DESCRIPCION = Singleton.getInstance(Descripcion.class);
		public static final Cuenta CUENTA = Singleton.getInstance(Cuenta.class);
		public static final Origen ORIGEN = Singleton.getInstance(Origen.class);
		public static final Concepto CONCEPTO = Singleton.getInstance(Concepto.class);
		public static final ValorMN VALORMN = Singleton.getInstance(ValorMN.class);
		public static final Mayorizado MAYORIZADO = Singleton.getInstance(Mayorizado.class);

		public static class Buttons {

			public static final CM_TCNMNGDF_N1G _N1G = Singleton.getInstance(CM_TCNMNGDF_N1G.class);
			
			public static final CM_TCNMNGDF_M1F _M1F = Singleton.getInstance(CM_TCNMNGDF_M1F.class);
			
			public static final clickTextInputButtonVA_4483GJDPRVFSBRL_544628 _544628 = Singleton
					.getInstance(clickTextInputButtonVA_4483GJDPRVFSBRL_544628.class);

			public static final clickTextInputButtonVA_4529KSKSKFDTQNZ_541628 _541628 = Singleton
					.getInstance(clickTextInputButtonVA_4529KSKSKFDTQNZ_541628.class);

			public static final clickTextInputButtonVA_2502TECDGCHQJNR_958628 _958628 = Singleton
					.getInstance(clickTextInputButtonVA_2502TECDGCHQJNR_958628.class);

			public static final BotonNuevo _82959 = Singleton.getInstance(BotonNuevo.class);

			public static final BotonPrimerTresLineas _BPTS = Singleton.getInstance(BotonPrimerTresLineas.class);

			public static final BotonSegundoTresLineas _BSTS = Singleton.getInstance(BotonSegundoTresLineas.class);
			
			public static final BotonCheckNuevo _BCN = Singleton.getInstance(BotonCheckNuevo.class);
			
			public static class clickTextInputButtonVA_4483GJDPRVFSBRL_544628 implements IButton {

				private String xpath = "/html/body/div[1]/div[2]/div[2]/div/div[1]/ul/li/div/div/div/div[3]/div/div/div/div/button";
				private Target target = Target.the("clickTextInputButtonVA_4483GJDPRVFSBRL_544628").located(By.xpath(xpath));
				
				@Override
				public Target getTarget() {
					return target;
				}

				@Override
				public String getId() {
					return xpath;
				}
			}
			
			
			public static class CM_TCNMNGDF_M1F implements IButton {

				private String id = "CM_TCNMNGDF_M1F";
				private Target target = Target.the("CM_TCNMNGDF_M1F").located(By.id(id));

				@Override
				public Target getTarget() {
					return target;
				}

				@Override
				public String getId() {
					return id;
				}
			}
		
			public static class BotonCheckNuevo implements IButton {

				private String xpath = "//tbody/tr/td[14]/a[1]";
				private Target target = Target.the("BotonCheckNuevo").located(By.xpath(xpath));

				@Override
				public Target getTarget() {
					return target;
				}

				@Override
				public String getId() {
					return xpath;
				}
			}
			
			
			public static class CM_TCNMNGDF_N1G implements IButton {

				private String id = "CM_TCNMNGDF_N1G";
				private Target target = Target.the("CM_TCNMNGDF_N1G").located(By.id(id));

				@Override
				public Target getTarget() {
					return target;
				}

				@Override
				public String getId() {
					return id;
				}
			}

			public static class clickTextInputButtonVA_4529KSKSKFDTQNZ_541628 implements IButton {
				private String xpath = "/html/body/div[1]/div[2]/div[2]/div/div[1]/ul/li/div/div/div/div[7]/div/div/div/div/button";
				private Target target = Target.the("clickTextInputButtonVA_4529KSKSKFDTQNZ_541628")
						.located(By.xpath(xpath));

				@Override
				public Target getTarget() {
					return target;
				}

				@Override
				public String getId() {
					return xpath;
				}
			}

			public static class BotonNuevo implements IButton {

				private String xpath = "/html/body/div[1]/div[2]/div[2]/div/div[2]/div/div/div/div/div[1]/button";
				private Target target = Target.the("BotonNuevo").located(By.xpath(xpath));

				@Override
				public Target getTarget() {
					return target;
				}

				@Override
				public String getId() {
					return xpath;
				}
			}

			public static class clickTextInputButtonVA_2502TECDGCHQJNR_958628 implements IButton {

				private String xpath = "/html/body/div[1]/div[2]/div[2]/div/div[1]/ul/li/div/div/div/div[8]/div/div/div/div/button";
				private Target target = Target.the("clickTextInputButtonVA_2502TECDGCHQJNR_958628")
						.located(By.xpath(xpath));

				@Override
				public Target getTarget() {
					return target;
				}

				@Override
				public String getId() {
					return xpath;
				}
			}

			public static class BotonPrimerTresLineas implements IButton {

				private String xpath = "/html/body/div[1]/div[2]/div[2]/div/div[2]/div/div/div/div/div[3]/table/tbody/tr/td[5]/div/div/button";
				private Target target = Target.the("BotonPrimerTresLineas").located(By.xpath(xpath));

				@Override
				public Target getTarget() {
					return target;
				}

				@Override
				public String getId() {
					return xpath;
				}
			}

			public static class BotonSegundoTresLineas implements IButton {

				private String xpath = "/html/body/div[1]/div[2]/div[2]/div/div[2]/div/div/div/div/div[3]/table/tbody/tr/td[7]/div/div/button";
				private Target target = Target.the("BotonSegundoTresLineas").located(By.xpath(xpath));

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
		
		public static class Mayorizado implements IClickable {

			private String xpath = "//input[@ng-class='vc.viewState.VA_6243FNMPMOCLYMJ_803628.style']";
			private Target target = Target.the("Mayorizado").located(By.xpath(xpath));

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

			private String id = "VA_TEXTINPUTBOXPWT_281628";
			private Target target = Target.the("Valor").located(By.id(id));

			@Override
			public Target getTarget() {
				return target;
			}

			@Override
			public String getId() {
				return id;
			}
		}

		public static class Concepto implements IInputValue {

			private String xpath = "/html/body/div[1]/div[2]/div[2]/div/div[2]/div/div/div/div/div[3]/table/tbody/tr/td[8]/input";
			private Target target = Target.the("Concepto").located(By.xpath(xpath));

			@Override
			public Target getTarget() {
				return target;
			}

			@Override
			public String getId() {
				return xpath;
			}
		}

		public static class Origen implements IComboBox {

			private String id = "VA_COMBOBOXPRWSJVI_901628";
			private Target target = Target.the("Origen").located(By.id(id));

			@Override
			public Target getTarget() {
				return target;
			}

			@Override
			public String getId() {
				return id;
			}
		}

		public static class Cuenta implements IInputValue {

			private String xpath = "/html/body/div[1]/div[2]/div[2]/div/div[2]/div/div/div/div/div[3]/table/tbody/tr[1]/td[2]/div/input";
			private Target target = Target.the("Cuenta").located(By.xpath(xpath));

			@Override
			public Target getTarget() {
				return target;
			}

			@Override
			public String getId() {
				return xpath;
			}
		}

		public static class Fecha implements IInputValue {

			private String id = "VA_1972NOYIHZCXWGH_841628";
			private Target target = Target.the("Fecha").located(By.id(id));

			@Override
			public Target getTarget() {
				return target;
			}

			@Override
			public String getId() {
				return id;
			}
		}

		public static class Descripcion implements IInputValue {

			private String id = "VA_2045TVIPEQGWKDD_668628";
			private Target target = Target.the("Descripcion").located(By.id(id));

			@Override
			public Target getTarget() {
				return target;
			}

			@Override
			public String getId() {
				return id;
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

	public static final FiltrOrigen FILTRORIGEN = Singleton.getInstance(FiltrOrigen.class);

	public static class FiltrOrigen implements IGrid {

		private String id = "QV_4420_87124";
		private Target target = Target.the("GridQV_4420_87124").located(By.id(id));

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
