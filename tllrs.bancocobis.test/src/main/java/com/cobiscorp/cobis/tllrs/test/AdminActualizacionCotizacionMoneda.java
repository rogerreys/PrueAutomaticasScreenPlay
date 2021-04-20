package com.cobiscorp.cobis.tllrs.test;

import org.openqa.selenium.By;

import com.cobiscorp.cobis.utils.base.Singleton;
import com.cobiscorp.cobis.utils.controls.IButton;
import com.cobiscorp.cobis.utils.controls.IControl;
import com.cobiscorp.cobis.utils.controls.IGrid;
import com.cobiscorp.cobis.utils.controls.IInputValue;

import net.serenitybdd.screenplay.targets.Target;

public class AdminActualizacionCotizacionMoneda {

	public static final FiltroCotizacion FILTROCOTIZACION = Singleton.getInstance(FiltroCotizacion.class);
	public static class FiltroCotizacion implements IControl {

		private String xpath = "/html/body/div[5]/iframe";
		private Target target = Target.the("Vista Comprobante Contable").located(By.xpath(xpath));

		public static final FechaInicial FECHAINICIAL = Singleton.getInstance(FechaInicial.class);
		public static final FechaFinal FECHAFINAL = Singleton.getInstance(FechaFinal.class);
		public static final ValorCompra VALORCOMPRA = Singleton.getInstance(ValorCompra.class);
		public static final ValorVenta VALORVENTA = Singleton.getInstance(ValorVenta.class);
		public static final CotizacionBanco COTIZACIONBANCO = Singleton.getInstance(CotizacionBanco.class);
		public static final FechaNuevo FECHANUEVO = Singleton.getInstance(FechaNuevo.class);

		
		public static class Buttons {
			

			public static final clickTextInputButtonVA_MONEDAVLABVBANM_444218 _444218 = Singleton.getInstance(clickTextInputButtonVA_MONEDAVLABVBANM_444218.class);
			
			public static final CM_TCNMNGZB_9LN _9LN = Singleton.getInstance(CM_TCNMNGZB_9LN.class);
			
			public static final VA_VAIMAGEBUTTONNN_782218 _782218 = Singleton.getInstance(VA_VAIMAGEBUTTONNN_782218.class);
			
			public static final VA_AVANZADOPGGDJTL_160218 _160218 = Singleton.getInstance(VA_AVANZADOPGGDJTL_160218.class);
			
			public static final VA_VAIMAGEBUTTONNN_323218 _323218 = Singleton.getInstance(VA_VAIMAGEBUTTONNN_323218.class);
			
			public static final HVA_BUTTON_EXPAND _HBE = Singleton.getInstance(HVA_BUTTON_EXPAND.class);
			
			public static final BotonNuevaCotizacion _BNC = Singleton.getInstance(BotonNuevaCotizacion.class);
			
			public static final BotonCheckNuevo _BCN = Singleton.getInstance(BotonCheckNuevo.class);
			
			public static final BotoneEliminarNuevo _BEN = Singleton.getInstance(BotoneEliminarNuevo.class);
			
			public static final BotonAceptarEliminar _BAE = Singleton.getInstance(BotonAceptarEliminar.class);
			
			public static final BotoneActualizarNuevo _BAN = Singleton.getInstance(BotoneActualizarNuevo.class);
			
			public static class BotoneActualizarNuevo implements IButton {
										
				private String xpath = "/html/body/div[1]/div[2]/div[2]/div/div/div/div/table/tbody/tr[1]/td[5]/a[1]/span";
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
			
			
			public static class BotoneEliminarNuevo implements IButton {

				private String xpath = "//tbody/tr[1]/td[5]/a[2]/span";
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

				private String xpath = "/html/body/div[7]/div[2]/div[2]/nav/button[1]";
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
			
			public static class BotonCheckNuevo implements IButton {
				
				private String xpath = "//tbody/tr[1]/td[5]/a[1]/span";
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
			

			
			public static class BotonNuevaCotizacion implements IButton {

				private String xpath = "/html/body/div[1]/div[2]/div[2]/div/div/div/div/div[1]/button";
				private Target target = Target.the("BotonNuevaCotizacion").located(By.xpath(xpath));

				@Override
				public Target getTarget() {
					return target;
				}

				@Override
				public String getId() {
					return xpath;
				}
			}
			
			
			public static class HVA_BUTTON_EXPAND implements IButton {

				private String id = "HVA_BUTTON_EXPAND";
				private Target target = Target.the("HVA_BUTTON_EXPAND").located(By.id(id));

				@Override
				public Target getTarget() {
					return target;
				}

				@Override
				public String getId() {
					return id;
				}
			}
			
			public static class VA_VAIMAGEBUTTONNN_323218 implements IButton {

				private String id = "VA_VAIMAGEBUTTONNN_323218";
				private Target target = Target.the("VA_VAIMAGEBUTTONNN_323218").located(By.id(id));

				@Override
				public Target getTarget() {
					return target;
				}

				@Override
				public String getId() {
					return id;
				}
			}
			

			public static class VA_VAIMAGEBUTTONNN_782218 implements IButton {

				private String id = "VA_VAIMAGEBUTTONNN_782218";
				private Target target = Target.the("VA_VAIMAGEBUTTONNN_782218").located(By.id(id));

				@Override
				public Target getTarget() {
					return target;
				}

				@Override
				public String getId() {
					return id;
				}
			}
			
			
			public static class VA_AVANZADOPGGDJTL_160218 implements IButton {

				private String id = "VA_AVANZADOPGGDJTL_160218";
				private Target target = Target.the("VA_AVANZADOPGGDJTL_160218").located(By.id(id));

				@Override
				public Target getTarget() {
					return target;
				}

				@Override
				public String getId() {
					return id;
				}
			}
			public static class CM_TCNMNGZB_9LN implements IButton {

				private String id = "CM_TCNMNGZB_9LN";
				private Target target = Target.the("CM_TCNMNGZB_9LN").located(By.id(id));

				@Override
				public Target getTarget() {
					return target;
				}

				@Override
				public String getId() {
					return id;
				}
			}

			public static class clickTextInputButtonVA_MONEDAVLABVBANM_444218 implements IButton {

				private String xpath = "/html/body/div[1]/div[2]/div[1]/div/div[1]/div/div/div/div[6]/div/div/div/div/button";
				private Target target = Target.the("clickTextInputButtonVA_MONEDAVLABVBANM_444218").located(By.xpath(xpath));

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

		public static class CotizacionBanco implements IInputValue {

			private String id = "VA_TEXTINPUTBOXKWU_820368";
			private Target target = Target.the("VA_TEXTINPUTBOXKWU_820368").located(By.id(id));

			@Override
			public Target getTarget() {
				return target;
			}

			@Override
			public String getId() {
				return id;
			}
		}
		
		public static class ValorVenta implements IInputValue {

			private String id = "VA_TEXTINPUTBOXCOH_689368";
			private Target target = Target.the("VA_TEXTINPUTBOXCOH_689368").located(By.id(id));

			@Override
			public Target getTarget() {
				return target;
			}

			@Override
			public String getId() {
				return id;
			}
		}
		
		public static class ValorCompra implements IInputValue {

			private String id = "VA_TEXTINPUTBOXQVI_500368";
			private Target target = Target.the("ValorCompra").located(By.id(id));

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

			private String id = "VA_FECHAFINALKVYAS_935218";
			private Target target = Target.the("FechaFinal").located(By.id(id));

			@Override
			public Target getTarget() {
				return target;
			}

			@Override
			public String getId() {
				return id;
			}
		}
		
		public static class FechaNuevo implements IInputValue {

			private String id = "VA_TEXTINPUTBOXDOV_678368";
			private Target target = Target.the("FechaNuevo").located(By.id(id));

			@Override
			public Target getTarget() {
				return target;
			}

			@Override
			public String getId() {
				return id;
			}
		}
		
		public static class FechaInicial implements IInputValue {

			private String id = "VA_FECHAINICIALVSI_425218";
			private Target target = Target.the("FechaInicial").located(By.id(id));

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
	
	public static final FiltroMoneda FILTROMONEDA = Singleton.getInstance(FiltroMoneda.class);

	public static class FiltroMoneda implements IGrid {

		private String id = "QV_2168_40285";
		private Target target = Target.the("GridQV_2168_40285").located(By.id(id));

		@Override
		public Target getTarget() {
			return target;
		}

		@Override
		public String getId() {
			return id;
		}
	}
	
	public static final FiltroDetalleCotizacion FILTRODCOTIZACION = Singleton.getInstance(FiltroDetalleCotizacion.class);

	public static class FiltroDetalleCotizacion implements IGrid {

		private String id = "QV_1547_71027";
		private Target target = Target.the("GridQV_2168_40285").located(By.id(id));

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