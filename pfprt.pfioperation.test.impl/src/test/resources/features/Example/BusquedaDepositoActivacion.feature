#language: es
#Author: jmarchesini@cobiscorp.com

Característica: Busqueda de Deposito
	COMO usuario de la plataforma Cobis , usando filial , oficina y rol del modulo de DPF
	QUIERO activar un Certificado de Depósitos a Plazo
	PARA  evidenciar el cambio de estado de un Certificado de Depósito
	
Antecedentes: El usuario ingresa a cobis
	 Dado que usuario realiza login en el sistema cobis
   Dado que navega desde "Depósitos a Plazo" hacia "Búsqueda de Depósitos"

   #QA-S464719
   @BusquedaDepositoDivision
   Esquema del escenario: Verificar la activación de un Certificado de Depósito
	 Cuando se busca el certificado de depósito por <numero_de_operacion> con <numero>
	 Y se presiona el menú acciones, escoger la opción "Activar"
	 Y presiona el botón Aceptar
	 Entonces el Certificado de Depósito se muestra un mensaje de excepcion <MensajeExcepcion> y se mantiene en estado <Estado>
	 Ejemplos:
	 |numero_de_operacion  | numero 			| Estado | MensajeExcepcion|
	 |'Numero de operación'| '70100002716'|'ING'	 | 'Excepción de negocio: 16 - 141153 - [BL_activa_deposito] Recuerde depositar los fondos en caja'|
	