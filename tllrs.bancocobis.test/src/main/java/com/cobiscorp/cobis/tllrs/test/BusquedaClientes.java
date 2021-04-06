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
import com.cobiscorp.cobis.utils.controls.IButton;
import com.cobiscorp.cobis.utils.controls.IControl;
import com.cobiscorp.cobis.utils.controls.IGrid;
import com.cobiscorp.cobis.utils.controls.IInputValue;

import net.serenitybdd.screenplay.targets.Target;

public class BusquedaClientes {

	public static final FiltroCliente filtroCliente = Singleton.getInstance(FiltroCliente.class);

	public static class FiltroCliente implements IControl {

		private String id = "G_BUSQUEDENT_111565";
		private Target target = Target.the("FiltroCliente").located(By.id(id));

		public static final Identificacion identificacion = Singleton.getInstance(Identificacion.class);
		public static final Apellido apellido = Singleton.getInstance(Apellido.class);

		public static class Buttons {
			public static final VA_VAIMAGEBUTTONNN_843565 _843565 = Singleton
					.getInstance(VA_VAIMAGEBUTTONNN_843565.class);

			
			public static class VA_VAIMAGEBUTTONNN_843565 implements IButton {

				private String id = "VA_VAIMAGEBUTTONNN_843565";
				private Target target = Target.the("VA_VAIMAGEBUTTONNN_843565").located(By.id(id));

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
		
		public static class Identificacion implements IInputValue {

			private String id = "VA_TEXTINPUTBOXJMC_264565";
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

		public static class Apellido implements IInputValue {

			private String id = "VA_TEXTINPUTBOXMAR_234565";
			private Target target = Target.the("Apellido").located(By.id(id));

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

	public static final Cliente gridCliente = Singleton.getInstance(Cliente.class);

	public static class Cliente implements IGrid {

		private String id = "QV_1473_12174";
		private Target target = Target.the("GridQV_1473_12174").located(By.id(id));

		public static final Identificacion identificacion = Singleton.getInstance(Identificacion.class);
		public static final PrimerNombre primerNombre = Singleton.getInstance(PrimerNombre.class);
		public static final PrimerApellido primerApellido = Singleton.getInstance(PrimerApellido.class);
		public static final FechaIngreso fechaIngreso = Singleton.getInstance(FechaIngreso.class);

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

		public static class PrimerNombre implements IInputValue {

			private String id = "VA_TEXTINPUTBOXTJD_690565";
			private Target target = Target.the("PrimerNombre").located(By.id(id));

			@Override
			public Target getTarget() {
				return target;
			}

			@Override
			public String getId() {
				return id;
			}
		}

		public static class PrimerApellido implements IInputValue {

			private String id = "VA_TEXTINPUTBOXUDF_325565";
			private Target target = Target.the("PrimerApellido").located(By.id(id));

			@Override
			public Target getTarget() {
				return target;
			}

			@Override
			public String getId() {
				return id;
			}

		}

		public static class FechaIngreso implements IInputValue {

			private String id = "VA_DATEFIELDFJLPTS_246565";
			private Target target = Target.the("FechaIngreso").located(By.id(id));

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
