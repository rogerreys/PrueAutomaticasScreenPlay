package com.cobiscorp.cobis.tllrs.test;

import org.openqa.selenium.By;

import com.cobiscorp.cobis.utils.base.Singleton;
import com.cobiscorp.cobis.utils.controls.IButton;
import com.cobiscorp.cobis.utils.controls.IControl;
import com.cobiscorp.cobis.utils.events.ITextReadable;

import net.serenitybdd.screenplay.targets.Target;

public class FDetalleOperacionApertura {

	public static class Buttons {

		public static final BotonOpcionesApertura botonOpcionesApertura = Singleton
				.getInstance(BotonOpcionesApertura.class);
		public static final BotonActivar botonActivar = Singleton.getInstance(BotonActivar.class);
		public static final BotonAceptar botonAceptar = Singleton.getInstance(BotonAceptar.class);

		public static class BotonOpcionesApertura implements IButton {

			private String id = "HVA_VABUTTON_ACTIONS";

			private Target target = Target.the("BotonOpcionesApertura").located(By.id(id));

			@Override
			public Target getTarget() {
				return target;
			}

			@Override
			public String getId() {
				return id;
			}
		}

		public static class BotonActivar implements IButton {

			private String id = "HVA_ACTIONS_2";

			private Target target = Target.the("BotonActivar").located(By.id(id));

			@Override
			public Target getTarget() {
				return target;
			}

			@Override
			public String getId() {
				return id;
			}

		}

		public static class BotonAceptar implements IButton {

			private String id = "CM_TPFPRTTP_0PX";

			private Target target = Target.the("BotonActivar").located(By.id(id));

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

	public static class CabeceraInformacion {
		public static final EstadoApertura estadoApertura = Singleton.getInstance(EstadoApertura.class);
		
		public static class EstadoApertura implements ITextReadable {

			private String id = "HVA_INFOATTRIBUTE_3";
			private Target target = Target.the("EstadoApertura").located(By.id(id));

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
}
