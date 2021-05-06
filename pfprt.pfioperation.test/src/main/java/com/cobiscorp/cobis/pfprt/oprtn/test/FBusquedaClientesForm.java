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

public class FBusquedaClientesForm{
	public static final FiltroBusquedaCliente filtroBusquedaCliente = Singleton.getInstance(FiltroBusquedaCliente.class);

	public static final GridListaPJuridica gridListaPJuridica = Singleton.getInstance(GridListaPJuridica.class);
	public static final GridListaPNatural gridListaPNatural = Singleton.getInstance(GridListaPNatural.class);
	private FBusquedaClientesForm() {
		throw new IllegalStateException("FBusquedaClientesForm is a utility class");
	}
	public static class Buttons {
		private Buttons() {
			throw new IllegalStateException("Buttons is a utility class");
		}
		public static final BtnIdVAVAIMAGEBUTTONNN801587 btnIdVAVAIMAGEBUTTONNN801587 = Singleton.getInstance(BtnIdVAVAIMAGEBUTTONNN801587.class);
		
		public static class BtnIdVAVAIMAGEBUTTONNN801587 extends COBISButton{
			public BtnIdVAVAIMAGEBUTTONNN801587 () {
				this.init("VA_VAIMAGEBUTTONNN_801587", "Buscar");
			}
		}
	

	}
	

	public static class FiltroBusquedaCliente {
	
		private FiltroBusquedaCliente() {
			throw new IllegalStateException("FBusquedaClientesForm is a utility class");
		}
		
		public static final TipoCliente tipoCliente = Singleton.getInstance(TipoCliente.class);
		public static final PrimerNombre primerNombre = Singleton.getInstance(PrimerNombre.class);
		public static final PrimerApellido primerApellido = Singleton.getInstance(PrimerApellido.class);
		public static final DocId docId = Singleton.getInstance(DocId.class);

		public static class TipoCliente extends COBISDropDownList {
			public TipoCliente() {
				this.init("VA_1MSIGVMWPJRFCVV_705587","TipodeCliente");
			}
		}			

		public static class PrimerNombre extends COBISInputValue {
			public PrimerNombre() {
				this.init("VA_2WMXWFKWGXCJZWS_961587","Nombre");
			}
		}			

		public static class PrimerApellido extends COBISInputValue {
			public PrimerApellido() {
				this.init("VA_PRIMERAPELLIDDO_176587","Apellido");
			}
		}			

		public static class DocId extends COBISInputValue {
			public DocId() {
				this.init("VA_DOCIDIXRMVJUDPW_205587","Identificacion");
			}
		}			
	}
	
	public static class GridListaPJuridica extends COBISGrid {
		public GridListaPJuridica() {
			this.init("QV_6632_39941", "QV_6632_39941");
		} 

		public static final Cliente cliente = Singleton.getInstance(Cliente.class);
		public static final DocId docId = Singleton.getInstance(DocId.class);
		public static final NombreComercial nombreComercial = Singleton.getInstance(NombreComercial.class);
		public static final RazonSocial razonSocial = Singleton.getInstance(RazonSocial.class);
		public static final CodigoOficial codigoOficial = Singleton.getInstance(CodigoOficial.class);
		public static final TipoCliente tipoCliente = Singleton.getInstance(TipoCliente.class);
		public static final NombreOficial nombreOficial = Singleton.getInstance(NombreOficial.class);
		public static final ModoConsulta modoConsulta = Singleton.getInstance(ModoConsulta.class);

		public static class Cliente extends COBISInputValue {
			public Cliente() {
				this.init("VA_TEXTINPUTBOXVVV_738587","Cliente");
			}
		}			

		public static class DocId extends COBISInputValue {
			public DocId() {
				this.init("VA_TEXTINPUTBOXNVP_688587","Identificacion");
			}
		}			

		public static class NombreComercial extends COBISInputValue {
			public NombreComercial() {
				this.init("VA_TEXTINPUTBOXJMK_955587","Nombre");
			}
		}			

		public static class RazonSocial extends COBISInputValue {
			public RazonSocial() {
				this.init("VA_TEXTINPUTBOXFGE_392587","RazonSocial");
			}
		}			

		public static class CodigoOficial extends COBISInputValue {
			public CodigoOficial() {
				this.init("VA_TEXTINPUTBOXFGU_762587","OFICIAL");
			}
		}			

		public static class TipoCliente extends COBISInputValue {
			public TipoCliente() {
				this.init("VA_TEXTINPUTBOXCXN_608587","TipoCliente");
			}
		}			

		public static class NombreOficial extends COBISInputValue {
			public NombreOficial() {
				this.init("VA_TEXTINPUTBOXQSV_778587","NombreOficial");
			}
		}			

		public static class ModoConsulta extends COBISInputValue {
			public ModoConsulta() {
				this.init("VA_TEXTINPUTBOXPIV_940587","ModoConsulta");
			}
		}			
	}
	
	public static class GridListaPNatural extends COBISGrid {
		public GridListaPNatural() {
			this.init("QV_6093_38584", "QV_6093_38584");
		} 

		public static final Cliente cliente = Singleton.getInstance(Cliente.class);
		public static final DocId docId = Singleton.getInstance(DocId.class);
		public static final PrimerApellido primerApellido = Singleton.getInstance(PrimerApellido.class);
		public static final SegundoApellido segundoApellido = Singleton.getInstance(SegundoApellido.class);
		public static final Nombre nombre = Singleton.getInstance(Nombre.class);
		public static final TipoCliente tipoCliente = Singleton.getInstance(TipoCliente.class);
		public static final ModoConsulta modoConsulta = Singleton.getInstance(ModoConsulta.class);

		public static class Cliente extends COBISInputValue {
			public Cliente() {
				this.init("VA_TEXTINPUTBOXADQ_909587","Cliente");
			}
		}			

		public static class DocId extends COBISInputValue {
			public DocId() {
				this.init("VA_TEXTINPUTBOXWPG_883587","Identificacion");
			}
		}			

		public static class PrimerApellido extends COBISInputValue {
			public PrimerApellido() {
				this.init("VA_TEXTINPUTBOXJAP_659587","PrimerApellido");
			}
		}			

		public static class SegundoApellido extends COBISInputValue {
			public SegundoApellido() {
				this.init("VA_TEXTINPUTBOXTIE_397587","SegundoApellido");
			}
		}			

		public static class Nombre extends COBISInputValue {
			public Nombre() {
				this.init("VA_TEXTINPUTBOXNFQ_152587","Nombre");
			}
		}			

		public static class TipoCliente extends COBISInputValue {
			public TipoCliente() {
				this.init("VA_TEXTINPUTBOXMWW_245587","TipoCliente");
			}
		}			

		public static class ModoConsulta extends COBISInputValue {
			public ModoConsulta() {
				this.init("VA_TEXTINPUTBOXGCE_153587","ModoConsulta");
			}
		}			
	}
}
