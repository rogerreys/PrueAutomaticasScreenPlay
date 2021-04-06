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

import org.openqa.selenium.By;
import com.cobiscorp.cobis.utils.base.Singleton;
import com.cobiscorp.cobis.utils.controls.IButton;
import com.cobiscorp.cobis.utils.controls.IControl;
import com.cobiscorp.cobis.utils.events.IClickable;
import com.cobiscorp.cobis.utils.events.ITextReadable;

import net.serenitybdd.screenplay.targets.Target;

public class CabeceraCliente {
	
	public static final Funcionario funcionario = Singleton.getInstance(Funcionario.class);
	public static class Funcionario implements IControl {

		private String id = "G_CABECERINE_577978";
		private Target target = Target.the("Funcionario").located(By.id(id));
		
		public static final NombreCompletoCli nombreCompletoCli = Singleton.getInstance(NombreCompletoCli.class);
		public static final FechaDesde fechaDesde = Singleton.getInstance(FechaDesde.class);
		public static final NombreFuncionario nombreFuncionario = Singleton.getInstance(NombreFuncionario.class);
		public static final VA_VAIMAGEBUTTONNN_733978 va_vaimagebuttonnn_733978 = Singleton.getInstance(VA_VAIMAGEBUTTONNN_733978.class);

		
		public static class NombreCompletoCli implements ITextReadable {

			private String id = "VA_TEXTINPUTBOXHVP_703978";
			private Target target = Target.the("NombreCompletoCli").located(By.id(id));

			@Override
			public Target getTarget() {
				return target;
			}

			@Override
			public String getId() {
				return id;
			}
		}

		public static class FechaDesde implements ITextReadable {

			private String id = "VA_DATEFIELDKZTUOJ_574978";
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

		public static class NombreFuncionario implements IClickable {

			private String id = "VA_TEXTINPUTBOXTOX_638978";
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

		public static class VA_VAIMAGEBUTTONNN_733978 implements IButton {

			private String id = "VA_VAIMAGEBUTTONNN_733978";
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

