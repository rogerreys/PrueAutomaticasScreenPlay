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
import com.cobiscorp.cobis.utils.events.IDigitable;

import net.serenitybdd.screenplay.targets.Target;

public class FormBienes {

	public static final Bien gridBien = Singleton.getInstance(Bien.class);

	public static class Bien implements IGrid {

			private String id = "QV_2850_68647";
			private Target target = Target.the("GridQV_2850_68647").located(By.id(id));
			
			
			public static final Origen origen = Singleton.getInstance(Origen.class);
			public static final Avaluo avaluo = Singleton.getInstance(Avaluo.class);
			public static final TipoBien tipoBien = Singleton.getInstance(TipoBien.class);

			public static class Origen implements IComboBox {

				private String id = "VA_COMBOBOXQPFCFQD_546723";
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

			public static class Avaluo implements IInputValue {

				private String id = "VA_TEXTINPUTBOXXYL_460723";
				private Target target = Target.the("Avaluo").located(By.id(id));

				@Override
				public Target getTarget() {
					return target;
				}

				@Override
				public String getId() {
					return id;
				}
			}

			public static class TipoBien implements IComboBox {

				private String id = "VA_COMBOBOXTWMQGCV_494723";
				private Target target = Target.the("TipoBien").located(By.id(id));

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
