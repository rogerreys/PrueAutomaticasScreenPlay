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
package com.cobiscorp.cobis.tllrs.test;

import org.openqa.selenium.*;

import com.cobiscorp.cobis.utils.base.Singleton;
import com.cobiscorp.cobis.utils.controls.IComboBox;
import com.cobiscorp.cobis.utils.controls.IControl;
import com.cobiscorp.cobis.utils.controls.IGrid;
import com.cobiscorp.cobis.utils.controls.IInputValue;
import com.cobiscorp.cobis.utils.controls.ILayout;
import com.cobiscorp.cobis.utils.controls.IMultiSelect;
import com.cobiscorp.cobis.utils.controls.ITab;
import net.serenitybdd.screenplay.targets.Target;

public class AdminClientes {
	public static final DatosGenerales tab_datosGenerales_379653 = Singleton.getInstance(DatosGenerales.class);
	public static final ViewContainerBase tab_datosFinancieros_814811 = Singleton.getInstance(ViewContainerBase.class);
	public static final DatosTarjetaCredito tab_datosTarjetaCredito_837262 = Singleton.getInstance(DatosTarjetaCredito.class);

	public static class DatosGenerales implements ITab {

		private String id = "VC_SVYFDIJNWW_379653";
		private Target target = Target.the("DatosGenerales").located(By.id(id));

		@Override
		public Target getTarget() {
			return target;
		}

		@Override
		public String getId() {
			return id;
		}
	}

	public static class ViewContainerBase implements ITab {

		private String id = "VC_SCJTQWRSYG_814811";
		private Target target = Target.the("ViewContainerBase").located(By.id(id));

		@Override
		public Target getTarget() {
			return target;
		}

		@Override
		public String getId() {
			return id;
		}
	}

	public static class DatosTarjetaCredito implements ITab {

		private String id = "VC_PSVUWFBRQX_837262";
		private Target target = Target.the("DatosTarjetaCredito").located(By.id(id));

		@Override
		public Target getTarget() {
			return target;
		}

		@Override
		public String getId() {
			return id;
		}
	}

	public static final TarjetaCredito gridTarjetaCredito = Singleton.getInstance(TarjetaCredito.class);

		private String id = "QV_1310_94787";
		private Target target = Target.the("GridQV_1310_94787").located(By.id(id));


		public static class TarjetaCredito implements IGrid {

			private String id = "QV_1310_94787";
			private Target target = Target.the("GridQV_1310_94787").located(By.id(id));

			public static final CodigoTarjeta codigoTarjeta = Singleton.getInstance(CodigoTarjeta.class);
			public static final Numero numero = Singleton.getInstance(Numero.class);
			public static final Banco banco = Singleton.getInstance(Banco.class);
			public static final FechaVencimiento fechaVencimiento = Singleton.getInstance(FechaVencimiento.class);

			public static class CodigoTarjeta implements IInputValue {

				private String id = "VA_TEXTINPUTBOXJQZ_958508";
				private Target target = Target.the("CodigoTarjeta").located(By.id(id));

				@Override
				public Target getTarget() {
					return target;
				}

				@Override
				public String getId() {
					return id;
				}
			}

			public static class Numero implements IInputValue {

				private String id = "VA_TEXTINPUTBOXTGO_441508";
				private Target target = Target.the("Numero").located(By.id(id));

				@Override
				public Target getTarget() {
					return target;
				}

				@Override
				public String getId() {
					return id;
				}
			}

			public static class Banco implements IInputValue {

				private String id = "VA_TEXTINPUTBOXNFN_568508";
				private Target target = Target.the("Banco").located(By.id(id));

				@Override
				public Target getTarget() {
					return target;
				}

				@Override
				public String getId() {
					return id;
				}
			}

			public static class FechaVencimiento implements IInputValue {

				private String id = "VA_DATEFIELDGQANLV_956508";
				private Target target = Target.the("FechaVencimiento").located(By.id(id));

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

	public static final Cliente cliente = Singleton.getInstance(Cliente.class);
	public static final Trabajo trabajo = Singleton.getInstance(Trabajo.class);

	public static class Cliente implements ILayout {

		private String id = "G_AUTOCRUDDD_999662";
		private Target target = Target.the("Cliente").located(By.id(id));

		public static final FechaNacimiento fechaNacimiento = Singleton.getInstance(FechaNacimiento.class);
		public static final PaisNac paisNac = Singleton.getInstance(PaisNac.class);
		public static final ProvinciaNac provinciaNac = Singleton.getInstance(ProvinciaNac.class);
		public static final CiudadNac ciudadNac = Singleton.getInstance(CiudadNac.class);
		public static final EstadoCivil estadoCivil = Singleton.getInstance(EstadoCivil.class);
		public static final Genero genero = Singleton.getInstance(Genero.class);
		public static final Hobbies hobbies = Singleton.getInstance(Hobbies.class);

		public static class FechaNacimiento implements IInputValue {

			private String id = "VA_FECHANACIMIETOO_762662";
			private Target target = Target.the("FechaNacimiento").located(By.id(id));

			@Override
			public Target getTarget() {
				return target;
			}

			@Override
			public String getId() {
				return id;
			}
		}

		public static class PaisNac implements IComboBox {

			private String id = "VA_PAISNACPQZOGAQE_330662";
			private Target target = Target.the("PaisNac").located(By.id(id));

			@Override
			public Target getTarget() {
				return target;
			}

			@Override
			public String getId() {
				return id;
			}
		}

		public static class ProvinciaNac implements IComboBox {

			private String id = "VA_PROVINCIANACOXC_128662";
			private Target target = Target.the("ProvinciaNac").located(By.id(id));

			@Override
			public Target getTarget() {
				return target;
			}

			@Override
			public String getId() {
				return id;
			}
		}

		public static class CiudadNac implements IComboBox {

			private String id = "VA_CIUDADNACFVVEVW_322662";
			private Target target = Target.the("CiudadNac").located(By.id(id));

			@Override
			public Target getTarget() {
				return target;
			}

			@Override
			public String getId() {
				return id;
			}
		}

		public static class EstadoCivil implements IComboBox {

			private String id = "VA_ESTADOCIVILJFOO_950662";
			private Target target = Target.the("EstadoCivil").located(By.id(id));

			@Override
			public Target getTarget() {
				return target;
			}

			@Override
			public String getId() {
				return id;
			}
		}

		public static class Genero implements IComboBox {

			private String id = "VA_GENEROQMXFUHHVF_515662";
			private Target target = Target.the("Genero").located(By.id(id));

			@Override
			public Target getTarget() {
				return target;
			}

			@Override
			public String getId() {
				return id;
			}
		}

		public static class Hobbies implements IMultiSelect {

			private String id = "VA_HOBBIESOUVXWVEM_541662";
			private Target target = Target.the("Hobbies").located(By.id(id));

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

	public static class Trabajo implements ILayout {

		private String id = "G_AUTOCRUDDD_664662";
		private Target target = Target.the("Trabajo").located(By.id(id));

		public static final Empresa empresa = Singleton.getInstance(Empresa.class);
		public static final Salario salario = Singleton.getInstance(Salario.class);
		public static final Direccion direccion = Singleton.getInstance(Direccion.class);
		public static final Telefono telefono = Singleton.getInstance(Telefono.class);

		public static class Empresa implements IInputValue {

			private String id = "VA_TEXTINPUTBOXFLK_883662";
			private Target target = Target.the("Empresa").located(By.id(id));

			@Override
			public Target getTarget() {
				return target;
			}

			@Override
			public String getId() {
				return id;
			}
		}

		public static class Salario implements IInputValue {

			private String id = "VA_TEXTINPUTBOXPZL_299662";
			private Target target = Target.the("Salario").located(By.id(id));

			@Override
			public Target getTarget() {
				return target;
			}

			@Override
			public String getId() {
				return id;
			}
		}

		public static class Direccion implements IInputValue {

			private String id = "VA_TEXTINPUTBOXXSB_927662";
			private Target target = Target.the("Direccion").located(By.id(id));

			@Override
			public Target getTarget() {
				return target;
			}

			@Override
			public String getId() {
				return id;
			}
		}

		public static class Telefono implements IInputValue {

			private String id = "VA_TEXTINPUTBOXCKS_574662";
			private Target target = Target.the("Telefono").located(By.id(id));

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

	public static final ContabilidadCliente contabilidadCliente = Singleton.getInstance(ContabilidadCliente.class);

	public static class ContabilidadCliente implements IControl {

		private String id = "G_INGEGRCEET_978475";
		private Target target = Target.the("ContabilidadCliente").located(By.id(id));

		public static final Ingresos ingresos = Singleton.getInstance(Ingresos.class);
		public static final Egresos egresos = Singleton.getInstance(Egresos.class);
		public static final Extras extras = Singleton.getInstance(Extras.class);

		public static class Ingresos implements IInputValue {

			private String id = "VA_TEXTINPUTBOXVDJ_944475";
			private Target target = Target.the("Ingresos").located(By.id(id));

			@Override
			public Target getTarget() {
				return target;
			}

			@Override
			public String getId() {
				return id;
			}
		}

		public static class Egresos implements IInputValue {

			private String id = "VA_TEXTINPUTBOXHUW_795475";
			private Target target = Target.the("Egresoss").located(By.id(id));

			@Override
			public Target getTarget() {
				return target;
			}

			@Override
			public String getId() {
				return id;
			}
		}

		public static class Extras implements IInputValue {

			private String id = "VA_TEXTINPUTBOXEIQ_404475";
			private Target target = Target.the("Extras").located(By.id(id));

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
