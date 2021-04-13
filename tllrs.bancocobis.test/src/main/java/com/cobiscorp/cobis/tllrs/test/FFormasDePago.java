package com.cobiscorp.cobis.tllrs.test;

import org.openqa.selenium.By;

import com.cobiscorp.cobis.tllrs.test.FRecepcionModalForm.IngresarDatos.InputFormaRecepcion;
import com.cobiscorp.cobis.tllrs.test.FRecepcionModalForm.IngresarDatos.InputPrimerCliente;
import com.cobiscorp.cobis.tllrs.test.FRecepcionModalForm.IngresarDatos.Input_MontoRecepcion;
import com.cobiscorp.cobis.tllrs.test.FRecepcionModalForm.Seleccion.Cliente;
import com.cobiscorp.cobis.tllrs.test.FRecepcionModalForm.Seleccion.FormaRecepcion;
import com.cobiscorp.cobis.utils.base.Singleton;
import com.cobiscorp.cobis.utils.controls.IButton;
import com.cobiscorp.cobis.utils.controls.IComboBox;
import com.cobiscorp.cobis.utils.controls.IInputValue;

import net.serenitybdd.screenplay.targets.Target;

public class FFormasDePago {

	public static class IngresarDatos {
		public static final Input_MontoRecepcion input_MontoRecepcion = Singleton
				.getInstance(Input_MontoRecepcion.class);

		public static class Input_MontoRecepcion implements IInputValue {

			private String id = "VA_MONTOTKRTOOHBQR_207373";
			private Target target = Target.the("Ingreso Monto").located(By.id(id));

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

	public static class Seleccion {

		public static final FormaPago formaRecepcion = Singleton.getInstance(FormaPago.class);
		public static final Beneficiario beneficiario = Singleton.getInstance(Beneficiario.class);

		public static class FormaPago implements IComboBox {

			private String id = "VA_6153GLOUJHFTGTN_748373";

			private Target target = Target.the("FormaPago").located(By.xpath(id));

			@Override
			public Target getTarget() {
				return target;
			}

			@Override
			public String getId() {
				return id;
			}
		}

		public static class Beneficiario implements IComboBox {

			private String id = "VA_CLIENTETAHDVAHD_570373";

			private Target target = Target.the("Beneficiario").located(By.xpath(id));

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

	public static class Buttons {

		public static final BotonNuevo botonNuevo = Singleton.getInstance(BotonNuevo.class);
		public static final BotonAceptarPago botonAceptarPago = Singleton.getInstance(BotonAceptarPago.class);
		public static final BotonGuardar botonGuardar = Singleton.getInstance(BotonGuardar.class);

		public static class BotonNuevo implements IButton {

			private String id = "QV_3793_41782_CUSTOM_CREATE";

			private Target target = Target.the("BotonNuevo").located(By.id(id));

			@Override
			public Target getTarget() {
				return target;
			}

			@Override
			public String getId() {
				return id;
			}

		}

		public static class BotonAceptarPago implements IButton {

			private String id = "CM_TPFPRTMB_1_1";

			private Target target = Target.the("BotonAceptarPago").located(By.id(id));

			@Override
			public Target getTarget() {
				return target;
			}

			@Override
			public String getId() {
				return id;
			}

		}

		public static class BotonGuardar implements IButton {

			private String id = "CM_TPFPRTYP_273";

			private Target target = Target.the("BotonGuardar").located(By.id(id));

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
