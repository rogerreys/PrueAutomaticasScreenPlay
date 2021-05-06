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
package com.cobiscorp.cobis.pfprt.oprtn.test;
import com.cobiscorp.cobis.utils.base.Singleton;
import com.cobiscorp.cobis.utils.controls.impl.*;

public class FDocumentosForm{
	public static final FiltroBusquedaDocumentos filtroBusquedaDocumentos = Singleton.getInstance(FiltroBusquedaDocumentos.class);

	public static final GridListaDocumentos gridListaDocumentos = Singleton.getInstance(GridListaDocumentos.class);
	private FDocumentosForm() {
		throw new IllegalStateException("FDocumentosForm is a utility class");
	}
	public static class Buttons {
		private Buttons() {
			throw new IllegalStateException("Buttons is a utility class");
		}
		public static final CmdCommand1IdCMTPFPRTVOOO3 cmdCommand1IdCMTPFPRTVOOO3 = Singleton.getInstance(CmdCommand1IdCMTPFPRTVOOO3.class);
		
		public static class CmdCommand1IdCMTPFPRTVOOO3 extends COBISButton{
			public CmdCommand1IdCMTPFPRTVOOO3 () {
				this.init("CM_TPFPRTVO_OO3", "Guardar");
			}
		}
	
		public static final CmdCommand2IdCMTPFPRTVONE0 cmdCommand2IdCMTPFPRTVONE0 = Singleton.getInstance(CmdCommand2IdCMTPFPRTVONE0.class);
		
		public static class CmdCommand2IdCMTPFPRTVONE0 extends COBISButton{
			public CmdCommand2IdCMTPFPRTVONE0 () {
				this.init("CM_TPFPRTVO_NE0", "Cancelar");
			}
		}
	

	}
	

	public static class FiltroBusquedaDocumentos {
	
		private FiltroBusquedaDocumentos() {
			throw new IllegalStateException("FDocumentosForm is a utility class");
		}
		
		public static final CodTransaccion codTransaccion = Singleton.getInstance(CodTransaccion.class);

		public static class CodTransaccion extends COBISDropDownList {
			public CodTransaccion() {
				this.init("VA_CODTRANSACCINNO_899978","Transaccion");
			}
		}			
	}
	
	public static class GridListaDocumentos extends COBISGrid {
		public GridListaDocumentos() {
			this.init("QV_7050_31115", "QV_7050_31115");
		} 

		public static final Recibido recibido = Singleton.getInstance(Recibido.class);
		public static final Descripcion descripcion = Singleton.getInstance(Descripcion.class);

		public static class Recibido extends COBISInputValue {
			public Recibido() {
				this.init("VA_TEXTINPUTBOXVIX_490978","Recibido");
			}
		}			

		public static class Descripcion extends COBISInputValue {
			public Descripcion() {
				this.init("VA_TEXTINPUTBOXIMD_869978","Documento");
			}
		}			
	}
}
