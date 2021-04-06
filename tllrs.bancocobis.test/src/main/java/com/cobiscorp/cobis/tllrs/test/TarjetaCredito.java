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
import com.cobiscorp.cobis.utils.controls.IDropDownList;
import com.cobiscorp.cobis.utils.controls.IInputValue;
import com.cobiscorp.cobis.utils.events.IDigitable;

import net.serenitybdd.screenplay.targets.Target;

public class TarjetaCredito{

		public static final Numero numero = Singleton.getInstance(Numero.class);
		public static final Banco banco = Singleton.getInstance(Banco.class);
		public static final FechaVencimiento fechaVencimiento = Singleton.getInstance(FechaVencimiento.class);
		
		public static class Buttons {
			public static final Guardar guardar_5rt = Singleton.getInstance(Guardar.class);
			public static final Cancelar cancelar_hrt = Singleton.getInstance(Cancelar.class);
			
			public static class Guardar implements IButton {

				private String id = "CM_TTLLRSSY_5R3";
				private Target target = Target.the("Guardar").located(By.id(id));

				@Override
				public Target getTarget() {
					return target;
				}

				@Override
				public String getId() {
					return id;
				}
			}

			public static class Cancelar implements IButton {

				private String id = "CM_TTLLRSSY_HRT";
				private Target target = Target.the("Cancelar").located(By.id(id));

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

		public static class Numero implements IInputValue {

			private String id = "VA_NUMEROGWPXCIPOC_567982";
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

		public static class Banco implements IDropDownList {

			private String id = "VA_BANCODXGNABYXSD_797982";
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

			private String id = "VA_FECHAVENCIMIONN_686982";
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

}
