package com.cobiscorp.cobis.tllrs.test;

import org.openqa.selenium.By;

import com.cobiscorp.cobis.tllrs.test.FDetalleOperacionApertura.Buttons.BotonOpcionesApertura;
import com.cobiscorp.cobis.utils.base.Singleton;
import com.cobiscorp.cobis.utils.controls.IButton;

import net.serenitybdd.screenplay.targets.Target;

public class FDetalleBusquedaDeposito {
	
	public static class Buttons {
		
		public static final BotonOpcionesApertura botonOpcionesApertura = Singleton.getInstance(BotonOpcionesApertura.class);
		public static final BotonComprobanteApertura botonComprobanteApertura = Singleton.getInstance(BotonComprobanteApertura.class);
		public static final BotonEmitirCertificado botonEmitirCertificado = Singleton.getInstance(BotonEmitirCertificado.class);
		public static final BotonCancelacionNormal botonCancelacionNormal = Singleton.getInstance(BotonCancelacionNormal.class);
		public static final BotonCancelacionAnticipada botonCancelacionAnticipada = Singleton.getInstance(BotonCancelacionAnticipada.class);
		public static final BotonRenovar botonRenovar = Singleton.getInstance(BotonRenovar.class);
		public static final BotonEndosar botonEndosar = Singleton.getInstance(BotonEndosar.class);
		public static final BotonBloqueos botonBloqueos = Singleton.getInstance(BotonBloqueos.class);
		public static final BotonPignoraciones botonPignoraciones = Singleton.getInstance(BotonPignoraciones.class);
		public static final BotonCronogramaPagos botonCronogramaPagos = Singleton.getInstance(BotonCronogramaPagos.class);
		public static final BotonEstadoCuenta botonEstadoCuenta = Singleton.getInstance(BotonEstadoCuenta.class);
		public static final BotonPagoInteres botonPagoInteres = Singleton.getInstance(BotonPagoInteres.class);
		public static final BotonIncrementoReduccion botonIncrementoReduccion = Singleton.getInstance(BotonIncrementoReduccion.class);
		public static final BotonBeneficiarios botonBeneficiarios = Singleton.getInstance(BotonBeneficiarios.class);
		public static final BotonFirmantes botonFirmantes = Singleton.getInstance(BotonFirmantes.class);
		public static final BotonMantenimiento botonMantenimiento = Singleton.getInstance(BotonMantenimiento.class);
		public static final BotonReversar botonReversar = Singleton.getInstance(BotonReversar.class);
		
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
		
		public static class BotonComprobanteApertura implements IButton {

			private String id = "HVA_ACTIONS_0";

			private Target target = Target.the("BotonComprobanteApertura").located(By.id(id));

			@Override
			public Target getTarget() {
				return target;
			}

			@Override
			public String getId() {
				return id;
			}
		}
		
		public static class BotonEmitirCertificado implements IButton {

			private String id = "HVA_ACTIONS_1";

			private Target target = Target.the("BotonEmitirCertificado").located(By.id(id));

			@Override
			public Target getTarget() {
				return target;
			}

			@Override
			public String getId() {
				return id;
			}
		}
		
		
		public static class BotonCancelacionNormal implements IButton {

			private String id = "HVA_ACTIONS_2";

			private Target target = Target.the("BotonEmitirCertificado").located(By.id(id));

			@Override
			public Target getTarget() {
				return target;
			}

			@Override
			public String getId() {
				return id;
			}
		}
		
		public static class BotonCancelacionAnticipada implements IButton {

			private String id = "HVA_ACTIONS_3";

			private Target target = Target.the("BotonCancelacionAnticipada").located(By.id(id));

			@Override
			public Target getTarget() {
				return target;
			}

			@Override
			public String getId() {
				return id;
			}
		}
		
		public static class BotonRenovar implements IButton {

			private String id = "HVA_ACTIONS_4";

			private Target target = Target.the("BotonRenovar").located(By.id(id));

			@Override
			public Target getTarget() {
				return target;
			}

			@Override
			public String getId() {
				return id;
			}
		}
		
		public static class BotonEndosar implements IButton {

			private String id = "HVA_ACTIONS_5";

			private Target target = Target.the("BotonEndosar").located(By.id(id));

			@Override
			public Target getTarget() {
				return target;
			}

			@Override
			public String getId() {
				return id;
			}
		}
		
		
		public static class BotonBloqueos implements IButton {

			private String id = "HVA_ACTIONS_6";

			private Target target = Target.the("BotonBloqueos").located(By.id(id));

			@Override
			public Target getTarget() {
				return target;
			}

			@Override
			public String getId() {
				return id;
			}
		}
		
		public static class BotonPignoraciones implements IButton {

			private String id = "HVA_ACTIONS_7";

			private Target target = Target.the("BotonPignoraciones").located(By.id(id));

			@Override
			public Target getTarget() {
				return target;
			}

			@Override
			public String getId() {
				return id;
			}
		}
		
		
		public static class BotonCronogramaPagos implements IButton {

			private String id = "HVA_ACTIONS_8";

			private Target target = Target.the("BotonCronogramaPagos").located(By.id(id));

			@Override
			public Target getTarget() {
				return target;
			}

			@Override
			public String getId() {
				return id;
			}
		}
		
		public static class BotonEstadoCuenta implements IButton {

			private String id = "HVA_ACTIONS_9";

			private Target target = Target.the("BotonEstadoCuenta").located(By.id(id));

			@Override
			public Target getTarget() {
				return target;
			}

			@Override
			public String getId() {
				return id;
			}
		}
		
		public static class BotonPagoInteres implements IButton {

			private String id = "HVA_ACTIONS_10";

			private Target target = Target.the("BotonPagoInteres").located(By.id(id));

			@Override
			public Target getTarget() {
				return target;
			}

			@Override
			public String getId() {
				return id;
			}
		}
		
		public static class BotonIncrementoReduccion implements IButton {

			private String id = "HVA_ACTIONS_11";

			private Target target = Target.the("BotonIncrementoReduccion").located(By.id(id));

			@Override
			public Target getTarget() {
				return target;
			}

			@Override
			public String getId() {
				return id;
			}
		}
		
		public static class BotonBeneficiarios implements IButton {

			private String id = "HVA_ACTIONS_12";

			private Target target = Target.the("BotonBeneficiarios").located(By.id(id));

			@Override
			public Target getTarget() {
				return target;
			}

			@Override
			public String getId() {
				return id;
			}
		}
		
		public static class BotonFirmantes implements IButton {

			private String id = "HVA_ACTIONS_13";

			private Target target = Target.the("BotonFirmantes").located(By.id(id));

			@Override
			public Target getTarget() {
				return target;
			}

			@Override
			public String getId() {
				return id;
			}
		}
		
		public static class BotonMantenimiento implements IButton {

			private String id = "HVA_ACTIONS_14";

			private Target target = Target.the("BotonMantenimiento").located(By.id(id));

			@Override
			public Target getTarget() {
				return target;
			}

			@Override
			public String getId() {
				return id;
			}
		}
		
		public static class BotonReversar implements IButton {

			private String id = "HVA_ACTIONS_15";

			private Target target = Target.the("BotonReversar").located(By.id(id));

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
