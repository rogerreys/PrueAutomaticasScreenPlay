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

public class FDetalleAutorizacionForm{
	public static final SolicitudAutorizacion solicitudAutorizacion = Singleton.getInstance(SolicitudAutorizacion.class);

	private FDetalleAutorizacionForm() {
		throw new IllegalStateException("FDetalleAutorizacionForm is a utility class");
	}
	public static class Buttons {
		private Buttons() {
			throw new IllegalStateException("Buttons is a utility class");
		}

	}
	

	public static class SolicitudAutorizacion {
	
		private SolicitudAutorizacion() {
			throw new IllegalStateException("FDetalleAutorizacionForm is a utility class");
		}
		
		public static final NumBanco numBanco = Singleton.getInstance(NumBanco.class);
		public static final TipoTransaccion tipoTransaccion = Singleton.getInstance(TipoTransaccion.class);
		public static final Solicitante solicitante = Singleton.getInstance(Solicitante.class);
		public static final Observacion observacion = Singleton.getInstance(Observacion.class);

		public static class NumBanco extends COBISInputValue {
			public NumBanco() {
				this.init("VA_NUMBANCOODFVRPW_521608","Operacion");
			}
		}			

		public static class TipoTransaccion extends COBISDropDownList {
			public TipoTransaccion() {
				this.init("VA_TIPOTRANSACCINI_345608","Tipo");
			}
		}			

		public static class Solicitante extends COBISInputValue {
			public Solicitante() {
				this.init("VA_SOLICITANTEDJTX_558608","Usuario");
			}
		}			

		public static class Observacion extends COBISInputValue {
			public Observacion() {
				this.init("VA_OBSERVACIONDUKT_306608","Observaciones");
			}
		}			
	}
}
