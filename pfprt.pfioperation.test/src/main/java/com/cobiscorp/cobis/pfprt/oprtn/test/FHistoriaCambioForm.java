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

public class FHistoriaCambioForm{

	public static final GridListaHistoriaCambio gridListaHistoriaCambio = Singleton.getInstance(GridListaHistoriaCambio.class);
	private FHistoriaCambioForm() {
		throw new IllegalStateException("FHistoriaCambioForm is a utility class");
	}
	
	public static class GridListaHistoriaCambio extends COBISGrid {
		public GridListaHistoriaCambio() {
			this.init("QV_RM91_NPV29", "QV_RM91_NPV29");
		} 

		public static final FechaTransaccion fechaTransaccion = Singleton.getInstance(FechaTransaccion.class);
		public static final FechaValorTransaccion fechaValorTransaccion = Singleton.getInstance(FechaValorTransaccion.class);
		public static final Secuencial secuencial = Singleton.getInstance(Secuencial.class);
		public static final Operacion operacion = Singleton.getInstance(Operacion.class);
		public static final NumBanco numBanco = Singleton.getInstance(NumBanco.class);
		public static final Funcionario funcionario = Singleton.getInstance(Funcionario.class);
		public static final TipoDpf tipoDpf = Singleton.getInstance(TipoDpf.class);
		public static final TipoDpfAnt tipoDpfAnt = Singleton.getInstance(TipoDpfAnt.class);
		public static final TipoCapitalizacion tipoCapitalizacion = Singleton.getInstance(TipoCapitalizacion.class);
		public static final TipoCapitalizacionAnt tipoCapitalizacionAnt = Singleton.getInstance(TipoCapitalizacionAnt.class);
		public static final Oficina oficina = Singleton.getInstance(Oficina.class);
		public static final OficinaAnt oficinaAnt = Singleton.getInstance(OficinaAnt.class);
		public static final Categoria categoria = Singleton.getInstance(Categoria.class);
		public static final CategoriaAnt categoriaAnt = Singleton.getInstance(CategoriaAnt.class);
		public static final BaseCalculo baseCalculo = Singleton.getInstance(BaseCalculo.class);
		public static final BaseCalculoAnt baseCalculoAnt = Singleton.getInstance(BaseCalculoAnt.class);
		public static final CodigoFormaPago codigoFormaPago = Singleton.getInstance(CodigoFormaPago.class);
		public static final CodigoFormaPagoAnt codigoFormaPagoAnt = Singleton.getInstance(CodigoFormaPagoAnt.class);
		public static final CodigoFrecPago codigoFrecPago = Singleton.getInstance(CodigoFrecPago.class);
		public static final CodigoFrecPagoAnt codigoFrecPagoAnt = Singleton.getInstance(CodigoFrecPagoAnt.class);
		public static final Plazo plazo = Singleton.getInstance(Plazo.class);
		public static final PlazoAnt plazoAnt = Singleton.getInstance(PlazoAnt.class);
		public static final PlazoOperativo plazoOperativo = Singleton.getInstance(PlazoOperativo.class);
		public static final PlazoOperativoAnt plazoOperativoAnt = Singleton.getInstance(PlazoOperativoAnt.class);
		public static final CodigoDiasCalendario codigoDiasCalendario = Singleton.getInstance(CodigoDiasCalendario.class);
		public static final CodigoDiasCalendarioAnt codigoDiasCalendarioAnt = Singleton.getInstance(CodigoDiasCalendarioAnt.class);
		public static final Tasa tasa = Singleton.getInstance(Tasa.class);
		public static final TasaAnt tasaAnt = Singleton.getInstance(TasaAnt.class);
		public static final FechaValor fechaValor = Singleton.getInstance(FechaValor.class);
		public static final FechaValorAnt fechaValorAnt = Singleton.getInstance(FechaValorAnt.class);
		public static final FechaVencimiento fechaVencimiento = Singleton.getInstance(FechaVencimiento.class);
		public static final FechaVencimientoAnt fechaVencimientoAnt = Singleton.getInstance(FechaVencimientoAnt.class);
		public static final DiaPago diaPago = Singleton.getInstance(DiaPago.class);
		public static final DiaPagoAnt diaPagoAnt = Singleton.getInstance(DiaPagoAnt.class);
		public static final CodigoOficialPrincipal codigoOficialPrincipal = Singleton.getInstance(CodigoOficialPrincipal.class);
		public static final CodigoOficialPrincipalAnt codigoOficialPrincipalAnt = Singleton.getInstance(CodigoOficialPrincipalAnt.class);
		public static final CodigoOficialSecundario codigoOficialSecundario = Singleton.getInstance(CodigoOficialSecundario.class);
		public static final CodigoOficialSecundarioAnt codigoOficialSecundarioAnt = Singleton.getInstance(CodigoOficialSecundarioAnt.class);
		public static final CodigoTitulares codigoTitulares = Singleton.getInstance(CodigoTitulares.class);
		public static final CodigoTitularesAnt codigoTitularesAnt = Singleton.getInstance(CodigoTitularesAnt.class);
		public static final CodigoFirmantes codigoFirmantes = Singleton.getInstance(CodigoFirmantes.class);
		public static final CodigoFirmantesAnt codigoFirmantesAnt = Singleton.getInstance(CodigoFirmantesAnt.class);
		public static final CodigoFPagoFideicomiso codigoFPagoFideicomiso = Singleton.getInstance(CodigoFPagoFideicomiso.class);
		public static final CodigoFPagoFideicomisoAnt codigoFPagoFideicomisoAnt = Singleton.getInstance(CodigoFPagoFideicomisoAnt.class);
		public static final CodigoEstado codigoEstado = Singleton.getInstance(CodigoEstado.class);

		public static class FechaTransaccion extends COBISDatePicker {
			public FechaTransaccion() {
				this.init("VA_DATEFIELDBTRGGB_376726","FechaTransaccion");
			}
		}			

		public static class FechaValorTransaccion extends COBISDatePicker {
			public FechaValorTransaccion() {
				this.init("VA_DATEFIELDPPWIJZ_227726","FechaValorTransaccion");
			}
		}			

		public static class Secuencial extends COBISInputValue {
			public Secuencial() {
				this.init("VA_TEXTINPUTBOXQIY_968726","Secuencial");
			}
		}			

		public static class Operacion extends COBISInputValue {
			public Operacion() {
				this.init("VA_TEXTINPUTBOXPQI_341726","Operacion");
			}
		}			

		public static class NumBanco extends COBISInputValue {
			public NumBanco() {
				this.init("VA_TEXTINPUTBOXQKQ_528726","NodeDPF");
			}
		}			

		public static class Funcionario extends COBISInputValue {
			public Funcionario() {
				this.init("VA_TEXTINPUTBOXRLT_953726","Funcionario");
			}
		}			

		public static class TipoDpf extends COBISInputValue {
			public TipoDpf() {
				this.init("VA_TEXTINPUTBOXXIP_358726","Producto");
			}
		}			

		public static class TipoDpfAnt extends COBISInputValue {
			public TipoDpfAnt() {
				this.init("VA_TEXTINPUTBOXEMG_623726","ProductoAnterior");
			}
		}			

		public static class TipoCapitalizacion extends COBISInputValue {
			public TipoCapitalizacion() {
				this.init("VA_TEXTINPUTBOXWJN_320726","Capitalizacion");
			}
		}			

		public static class TipoCapitalizacionAnt extends COBISInputValue {
			public TipoCapitalizacionAnt() {
				this.init("VA_TEXTINPUTBOXJAC_142726","CapitalizacionAnterior");
			}
		}			

		public static class Oficina extends COBISInputValue {
			public Oficina() {
				this.init("VA_TEXTINPUTBOXOJB_204726","Oficina");
			}
		}			

		public static class OficinaAnt extends COBISInputValue {
			public OficinaAnt() {
				this.init("VA_TEXTINPUTBOXUNG_966726","OficinaAnterior");
			}
		}			

		public static class Categoria extends COBISInputValue {
			public Categoria() {
				this.init("VA_TEXTINPUTBOXWNL_965726","Categoria");
			}
		}			

		public static class CategoriaAnt extends COBISInputValue {
			public CategoriaAnt() {
				this.init("VA_TEXTINPUTBOXPQM_654726","CategoriaAnterior");
			}
		}			

		public static class BaseCalculo extends COBISInputValue {
			public BaseCalculo() {
				this.init("VA_TEXTINPUTBOXKWL_205726","BaseCalculo");
			}
		}			

		public static class BaseCalculoAnt extends COBISInputValue {
			public BaseCalculoAnt() {
				this.init("VA_TEXTINPUTBOXYMN_603726","BaseCalculoAnterior");
			}
		}			

		public static class CodigoFormaPago extends COBISInputValue {
			public CodigoFormaPago() {
				this.init("VA_TEXTINPUTBOXURK_827726","FormadePago");
			}
		}			

		public static class CodigoFormaPagoAnt extends COBISInputValue {
			public CodigoFormaPagoAnt() {
				this.init("VA_TEXTINPUTBOXJZJ_456726","FormadePagoAnterior");
			}
		}			

		public static class CodigoFrecPago extends COBISInputValue {
			public CodigoFrecPago() {
				this.init("VA_TEXTINPUTBOXQKV_568726","FrecuenciadePago");
			}
		}			

		public static class CodigoFrecPagoAnt extends COBISInputValue {
			public CodigoFrecPagoAnt() {
				this.init("VA_TEXTINPUTBOXVKF_444726","FrecuenciadePagoAnterior");
			}
		}			

		public static class Plazo extends COBISInputValue {
			public Plazo() {
				this.init("VA_TEXTINPUTBOXAWC_111726","Plazo");
			}
		}			

		public static class PlazoAnt extends COBISInputValue {
			public PlazoAnt() {
				this.init("VA_TEXTINPUTBOXKXN_247726","PlazoAnterior");
			}
		}			

		public static class PlazoOperativo extends COBISInputValue {
			public PlazoOperativo() {
				this.init("VA_TEXTINPUTBOXNNP_971726","PlazoOperativo");
			}
		}			

		public static class PlazoOperativoAnt extends COBISInputValue {
			public PlazoOperativoAnt() {
				this.init("VA_TEXTINPUTBOXAIW_470726","PlazoOperativoAnterior");
			}
		}			

		public static class CodigoDiasCalendario extends COBISInputValue {
			public CodigoDiasCalendario() {
				this.init("VA_TEXTINPUTBOXMKY_212726","DiasCalendario");
			}
		}			

		public static class CodigoDiasCalendarioAnt extends COBISInputValue {
			public CodigoDiasCalendarioAnt() {
				this.init("VA_TEXTINPUTBOXDGN_893726","DiasCalendarioAnterior");
			}
		}			

		public static class Tasa extends COBISInputValue {
			public Tasa() {
				this.init("VA_TEXTINPUTBOXLJS_233726","Tasa");
			}
		}			

		public static class TasaAnt extends COBISInputValue {
			public TasaAnt() {
				this.init("VA_TEXTINPUTBOXSPH_236726","TasaAnterior");
			}
		}			

		public static class FechaValor extends COBISDatePicker {
			public FechaValor() {
				this.init("VA_DATEFIELDRMCODF_189726","FechaValor");
			}
		}			

		public static class FechaValorAnt extends COBISDatePicker {
			public FechaValorAnt() {
				this.init("VA_DATEFIELDZPGORQ_490726","FechaValorAnterior");
			}
		}			

		public static class FechaVencimiento extends COBISDatePicker {
			public FechaVencimiento() {
				this.init("VA_DATEFIELDIYMLVY_891726","FechaVencimiento");
			}
		}			

		public static class FechaVencimientoAnt extends COBISDatePicker {
			public FechaVencimientoAnt() {
				this.init("VA_DATEFIELDNDXZSW_489726","FechaVencimientoAnterior");
			}
		}			

		public static class DiaPago extends COBISInputValue {
			public DiaPago() {
				this.init("VA_TEXTINPUTBOXXKC_882726","DiaPago");
			}
		}			

		public static class DiaPagoAnt extends COBISInputValue {
			public DiaPagoAnt() {
				this.init("VA_TEXTINPUTBOXMQY_949726","DiaPagoAnterior");
			}
		}			

		public static class CodigoOficialPrincipal extends COBISInputValue {
			public CodigoOficialPrincipal() {
				this.init("VA_TEXTINPUTBOXOUO_874726","Oficial");
			}
		}			

		public static class CodigoOficialPrincipalAnt extends COBISInputValue {
			public CodigoOficialPrincipalAnt() {
				this.init("VA_TEXTINPUTBOXBLU_313726","OficialAnterior");
			}
		}			

		public static class CodigoOficialSecundario extends COBISInputValue {
			public CodigoOficialSecundario() {
				this.init("VA_TEXTINPUTBOXPYK_542726","OficialSecundario");
			}
		}			

		public static class CodigoOficialSecundarioAnt extends COBISInputValue {
			public CodigoOficialSecundarioAnt() {
				this.init("VA_TEXTINPUTBOXUTS_765726","OficialSecundarioAnterior");
			}
		}			

		public static class CodigoTitulares extends COBISInputValue {
			public CodigoTitulares() {
				this.init("VA_TEXTINPUTBOXOYH_987726","TitularesActuales");
			}
		}			

		public static class CodigoTitularesAnt extends COBISInputValue {
			public CodigoTitularesAnt() {
				this.init("VA_TEXTINPUTBOXGJC_117726","TitularesAnteriores");
			}
		}			

		public static class CodigoFirmantes extends COBISInputValue {
			public CodigoFirmantes() {
				this.init("VA_TEXTINPUTBOXWZA_666726","Firmantes");
			}
		}			

		public static class CodigoFirmantesAnt extends COBISInputValue {
			public CodigoFirmantesAnt() {
				this.init("VA_TEXTINPUTBOXUGH_417726","FirmantesAnterior");
			}
		}			

		public static class CodigoFPagoFideicomiso extends COBISInputValue {
			public CodigoFPagoFideicomiso() {
				this.init("VA_TEXTINPUTBOXYAX_194726","FormasdePago");
			}
		}			

		public static class CodigoFPagoFideicomisoAnt extends COBISInputValue {
			public CodigoFPagoFideicomisoAnt() {
				this.init("VA_TEXTINPUTBOXBJF_264726","FormasdePagoAnterior");
			}
		}			

		public static class CodigoEstado extends COBISInputValue {
			public CodigoEstado() {
				this.init("VA_TEXTINPUTBOXGPB_324726","Estado");
			}
		}			
	}
}
