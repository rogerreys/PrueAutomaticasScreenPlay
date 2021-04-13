package com.cobiscorp.cobis.tllrs.test;

import org.openqa.selenium.By;

import com.cobiscorp.cobis.utils.base.Singleton;
import com.cobiscorp.cobis.utils.controls.IButton;
import com.cobiscorp.cobis.utils.controls.IControl;
import com.cobiscorp.cobis.utils.controls.IGrid;
import com.cobiscorp.cobis.utils.controls.IInputValue;

import net.serenitybdd.screenplay.targets.Target;

public class AdminBusquedaImpresionComprobante {
	
	public static final FiltroComprobanteContable FILTROCOMPROBANTECONTABLE = Singleton.getInstance(FiltroComprobanteContable.class);

	public static class FiltroComprobanteContable implements IControl {

		private String xpath = "/html/body/div[5]/iframe";
		private Target target = Target.the("Vista Comprobante Contable").located(By.xpath(xpath));
		
		public static final FechaInicial FECHAINICIAL = Singleton.getInstance(FechaInicial.class);
		public static final FechaFinal FECHAFINAL = Singleton.getInstance(FechaFinal.class);
		public static final ComprobanteDesde COMPROBANTEDESDE = Singleton.getInstance(ComprobanteDesde.class);
		public static final ComprobanteHasta COMPROBANTEHASTA = Singleton.getInstance(ComprobanteHasta.class);

		public static class Buttons {
			public static final CM_TCNMNGDF_BK3 _BK3 = Singleton
					.getInstance(CM_TCNMNGDF_BK3.class);
			
			public static final CM_TCNMNGDF_NT0 _NT0 = Singleton
					.getInstance(CM_TCNMNGDF_NT0.class);
			
			public static final CM_TCNMNGDF_M1M _M1M = Singleton
					.getInstance(CM_TCNMNGDF_M1M.class);
			
			public static final CM_TCNMNGDF_M1F _M1F = Singleton
					.getInstance(CM_TCNMNGDF_M1F.class);
			
			public static final clickTextInputButtonVA_5609AIODAUITOAG_915628 _915628 = Singleton
					.getInstance(clickTextInputButtonVA_5609AIODAUITOAG_915628.class);
			
			public static final clickTextInputButtonVA_3815YKZSBZSWOWO_621628 _621628 = Singleton
					.getInstance(clickTextInputButtonVA_3815YKZSBZSWOWO_621628.class);
			
			public static class CM_TCNMNGDF_BK3 implements IButton {

				private String id = "CM_TCNMNGDF_BK3";
				private Target target = Target.the("CM_TCNMNGDF_BK3").located(By.id(id));

				@Override
				public Target getTarget() {
					return target;
				}

				@Override
				public String getId() {
					return id;
				}
			}
			
			public static class CM_TCNMNGDF_NT0 implements IButton {

				private String id = "CM_TCNMNGDF_NT0";
				private Target target = Target.the("CM_TCNMNGDF_NT0").located(By.id(id));

				@Override
				public Target getTarget() {
					return target;
				}

				@Override
				public String getId() {
					return id;
				}
			}
			
			public static class CM_TCNMNGDF_M1M implements IButton {

				private String id = "CM_TCNMNGDF_M1M";
				private Target target = Target.the("CM_TCNMNGDF_M1M").located(By.id(id));

				@Override
				public Target getTarget() {
					return target;
				}

				@Override
				public String getId() {
					return id;
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
			
			
			public static class clickTextInputButtonVA_5609AIODAUITOAG_915628 implements IButton {

				private String xpath = "/html/body/div[1]/div[2]/div[1]/div/fieldset/div/div/div/div[2]/div/div/div/div/button";
				private Target target = Target.the("clickTextInputButtonVA_5609AIODAUITOAG_915628").located(By.xpath(xpath));

				@Override
				public Target getTarget() {
					return target;
				}

				@Override
				public String getId() {
					return xpath;
				}
			}
			
			public static class clickTextInputButtonVA_3815YKZSBZSWOWO_621628 implements IButton {

				private String xpath = "/html/body/div[1]/div[2]/div[1]/div/fieldset/div/div/div/div[3]/div/div/div/div/button";
				private Target target = Target.the("clickTextInputButtonVA_3815YKZSBZSWOWO_621628").located(By.xpath(xpath));

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
		
		public static class FechaInicial implements IInputValue {

			private String id = "VA_5301AXJVYEXHWKV_285628";
			private Target target = Target.the("VA_5301AXJVYEXHWKV_285628").located(By.id(id));

			@Override
			public Target getTarget() {
				return target;
			}

			@Override
			public String getId() {
				return id;
			}
		}
		
		public static class FechaFinal implements IInputValue {

			private String id = "VA_7642TCEEKNAPSXF_496628";
			private Target target = Target.the("VA_7642TCEEKNAPSXF_496628").located(By.id(id));

			@Override
			public Target getTarget() {
				return target;
			}

			@Override
			public String getId() {
				return id;
			}
		}
		
		public static class ComprobanteDesde implements IInputValue {

			private String id = "VA_7611IGSPMEAERED_168628";
			private Target target = Target.the("VA_7611IGSPMEAERED_168628").located(By.id(id));

			@Override
			public Target getTarget() {
				return target;
			}

			@Override
			public String getId() {
				return id;
			}
		}
		
		public static class ComprobanteHasta implements IInputValue {

			private String id = "VA_2139NEAZWQVHXUY_886628";
			private Target target = Target.the("VA_2139NEAZWQVHXUY_886628").located(By.id(id));

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
	
	public static final FiltrBuscarComprobante FILTROBUSCARCOMPROBANTE= Singleton.getInstance(FiltrBuscarComprobante.class);

	public static class FiltrBuscarComprobante implements IGrid {

		private String id = "QV_4420_87124";
		private Target target = Target.the("GridQV_4420_87124").located(By.id(id));

		/*public static final Identificacion identificacion = Singleton.getInstance(Identificacion.class);
		
		public static class Identificacion implements IInputValue {

			private String id = "VA_TEXTINPUTBOXEEJ_319565";
			private Target target = Target.the("Identificacion").located(By.id(id));

			@Override
			public Target getTarget() {
				return target;
			}

			@Override
			public String getId() {
				return id;
			}
		}*/

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
