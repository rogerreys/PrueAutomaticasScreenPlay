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

public class ComprobanteTipo {
	private static String oficinaOrigenStr;
	private String areaOrigenStr;
	
	public ComprobanteTipo(String oficinaOrigenStr){
		this.oficinaOrigenStr = oficinaOrigenStr;
	}
	public String getOficinaOrigen() {
		return oficinaOrigenStr;
	}

	public void setOficinaOrigen(String oficinaOrigen) {
		this.oficinaOrigenStr = oficinaOrigen;
	}

	public String getAreaOrigen() {
		return areaOrigenStr;
	}

	public void setAreaOrigen(String areaOrigen) {
		this.areaOrigenStr = areaOrigen;
	}

	
	
	public static final FormComprobanteTipo FORMCOMPROBANTETIPO = Singleton.getInstance(FormComprobanteTipo.class);
	
	public static class FormComprobanteTipo implements IControl {

		private String id = "VC_FASIENTOTS_522291";
		private Target target = Target.the("ComprobanteTipo").located(By.id(id));

		public static final Descripcion descripcion = Singleton.getInstance(Descripcion.class);
		public static final OficinaOrigen oficinaOrigen = Singleton.getInstance(OficinaOrigen.class);
		public static final OficinaOrigenGrid oficinaOrigenGrid = Singleton.getInstance(OficinaOrigenGrid.class);
		public static final AreaOrigen areaOrigen = Singleton.getInstance(AreaOrigen.class);
		public static final AreaOrigenGrid areaOrigenGrid = Singleton.getInstance(AreaOrigenGrid.class);
		public static final Target MESSAGE_EXITOSO = Target.the("Mensaje se ha guardado con éxito").located(By.xpath("//div[contains(text(),'Operación realizada con éxito')]"));
		public static final Target MESSAGE_ERROR_INGRESO_GRILLA = Target.the("Mensaje error de falta de datos en la grilla").located(By.xpath("//div[contains(text(),'No Ha Ingresado Regisros En La Grilla de Detalles')]"));
		public static final Target MESSAGE_ERROR_CUADRAR = Target.the("Mensaje error cuadrar").located(By.xpath("//div[contains(text(),'El comprobante no se encuentra cuadrado, Verifique por favor')]"));
		public static final botonNuevoAsientoContable botonNuevoAsientoContable = Singleton.getInstance(botonNuevoAsientoContable.class);
		public static final InputCuenta inputCuenta= Singleton.getInstance(InputCuenta.class);
		public static final botonAbrirGrillaOficina botonAbrirGrillaOficina= Singleton.getInstance(botonAbrirGrillaOficina.class);
		public static final botonAbrirGrillaArea botonAbrirGrillaArea= Singleton.getInstance(botonAbrirGrillaArea.class);
		public static final Modificable modificable= Singleton.getInstance(Modificable.class);
		public static final Concepto concepto= Singleton.getInstance(Concepto.class);
		public static final Valor valor= Singleton.getInstance(Valor.class);
		public static final botonCheck botonCheck= Singleton.getInstance(botonCheck.class);
		public static final TipoMovimiento tipoMovimiento = Singleton.getInstance(TipoMovimiento.class);
		
		public static class Buttons {
			public static final botonNumeroComprobanteTipo BUTTON_No_COMPROBANTE_TIPO = Singleton
					.getInstance(botonNumeroComprobanteTipo.class);
			public static final botonGuardar BUTTON_GUARDAR = Singleton
					.getInstance(botonGuardar.class);
			
			public static final botonLimpiar BUTTON_LIMPIAR = Singleton
					.getInstance(botonLimpiar.class);
			
			public static final botonCancelar BUTTON_CANCELAR = Singleton
					.getInstance(botonCancelar.class);
			
			public static class botonNumeroComprobanteTipo implements IButton {

				private String xpath = "//*[@id='VA_CODIGOUYYWONRGO_727896_DIV']/div/div/div/button";
				private Target target = Target.the("botonNumeroComprobanteTipo").located(By.xpath(xpath));

				@Override
				public Target getTarget() {
					return target;
				}

				@Override
				public String getId() {
					return xpath;
				}
			}
			
			public static class botonGuardar implements IButton {

				private String id = "CM_TCNMNGWT_NGN";
				private Target target = Target.the("botonGuardar Comprobante Tipo").located(By.id(id));

				@Override
				public Target getTarget() {
					return target;
				}

				@Override
				public String getId() {
					return id;
				}
			}
			public static class botonCancelar implements IButton {

				private String id = "CM_TCNMNGWT_0GT";
				private Target target = Target.the("BotonCncelar Comprobante Tipo").located(By.id(id));

				@Override
				public Target getTarget() {
					return target;
				}

				@Override
				public String getId() {
					return id;
				}
			}

			public static class botonLimpiar implements IButton {

				private String id = "CM_TCNMNGDF_M1F";
				private Target target = Target.the("boton limpiar").located(By.id(id));

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
		
		public static class Descripcion implements IInputValue {

			private String id = "VA_8851DRKSIWTWWRA_713896";
			private Target target = Target.the("Descripción").located(By.id(id));

			@Override
			public Target getTarget() {
				return target;
			}

			@Override
			public String getId() {
				return id;
			}
		}
		
		public static class OficinaOrigen implements IButton {

			private String xpath = "//*[@id='VA_4016NCDRTWKCXGE_381896_DIV']/div/div/div/button";
			private Target target = Target.the("Oficina Origen").located(By.xpath(xpath));


			@Override
			public Target getTarget() {
				return target;
			}

			@Override
			public String getId() {
				return xpath;
			}
		}
		public static class OficinaOrigenGrid implements IClickable {
			//SUCURSAL 1001
			//private String xpath = "//span[contains(text(),'"+oficinaOrigenStr+"')]";
			private String xpath = "//span[contains(text(),'SUCURSAL 1001')]";
			private Target target = Target.the("Oficina Origen Grid").located(By.xpath(xpath));

			@Override
			public Target getTarget() {
				return target;
			}

			@Override
			public String getId() {
				return xpath;
			}
		}
		public static class AreaOrigen implements IButton {

			private String xpath = "//*[@id='VA_4622NGRWCHNPGHU_154896_DIV']/div/div/div/button";
			private Target target = Target.the("Area Origen").located(By.xpath(xpath));


			@Override
			public Target getTarget() {
				return target;
			}

			@Override
			public String getId() {
				return xpath;
			}
		}
		public static class AreaOrigenGrid implements IClickable {

			private String xpath = "//span[contains(text(),'OPERACIONES')]";
			private Target target = Target.the("Area Origen Grid").located(By.xpath(xpath));

			@Override
			public Target getTarget() {
				return target;
			}

			@Override
			public String getId() {
				return xpath;
			}
		}
		public static class Modificable implements IClickable {

			private String id = "VA_1929WAKVGHGNEGF_549896";
			private Target target = Target.the("Modificable").located(By.id(id));

			@Override
			public Target getTarget() {
				return target;
			}

			@Override
			public String getId() {
				return id;
			}
		}
		public static class botonNuevoAsientoContable implements IButton {

			private String id = "//*[@id='QV_1535_84617']/div[1]/button";
			private Target target = Target.the("botonNuevoAsientoContable").located(By.xpath(id));

			@Override
			public Target getTarget() {
				return target;
			}

			@Override
			public String getId() {
				return id;
			}
		}

		public static class InputCuenta implements IInputValue {

			private String id = "/html/body/div[1]/div[2]/div[2]/div/div/div[3]/table/tbody/tr/td[2]/div/input";
			private Target target = Target.the("InputCuenta").located(By.xpath(id));

			@Override
			public Target getTarget() {
				return target;
			}

			@Override
			public String getId() {
				return id;
			}
		}
		public static class TipoMovimiento implements IComboBox {

			private String id = "VA_TEXTINPUTBOXFYE_759896";
			private Target target = Target.the("TipoMovimiento").located(By.id(id));

			@Override
			public Target getTarget() {
				return target;
			}

			@Override
			public String getId() {
				return id;
			}
		}
		public static class botonAbrirGrillaOficina implements IButton {

			private String id = "//*[@id='QV_1535_84617']/div[3]/table/tbody/tr/td[5]/div/div/button";
			private Target target = Target.the("botonAbrirGrillaOficina").located(By.xpath(id));

			@Override
			public Target getTarget() {
				return target;
			}

			@Override
			public String getId() {
				return id;
			}
		}
		
		public static class botonAbrirGrillaArea implements IButton {

			private String id = "//*[@id='QV_1535_84617']/div[3]/table/tbody/tr[1]/td[7]/div/div/button";
			private Target target = Target.the("botonAbrirGrillaOficina").located(By.xpath(id));

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

			private String id = "/html/body/div[1]/div[2]/div[2]/div/div/div[3]/table/tbody/tr/td[8]/input";
			private Target target = Target.the("Concepto").located(By.xpath(id));

			@Override
			public Target getTarget() {
				return target;
			}

			@Override
			public String getId() {
				return id;
			}
		}
		public static class Valor implements IInputValue {

			private String id = "VA_TEXTINPUTBOXGWQ_317896";
			private Target target = Target.the("Valor M.N.").located(By.id(id));

			@Override
			public Target getTarget() {
				return target;
			}

			@Override
			public String getId() {
				return id;
			}
		}
		public static class botonCheck implements IButton {

			private String id = "/html/body/div[1]/div[2]/div[2]/div/div/div[3]/table/tbody/tr/td[14]/a[1]";
			private Target target = Target.the("BotonAgregarGrid").located(By.xpath(id));

			@Override
			public Target getTarget() {
				return target;
			}

			@Override
			public String getId() {
				return id;
			}
		}

		
		//Comprobante tipo returns
		@Override
		public Target getTarget() {
			return target;
		}

		@Override
		public String getId() {
			return id;
		}

	}

	
	public static final ValoresComprobanteTipo VALORESCOMPROBANTETIPO = Singleton.getInstance(ValoresComprobanteTipo.class);

	public static class ValoresComprobanteTipo implements IGrid {

		private String id = "QV_4420_87124";
		private Target target = Target.the("GridQV_4420_87124").located(By.xpath(id));

		public static final Identificacion identificacion = Singleton.getInstance(Identificacion.class);

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
