#language: es
#Author: your.email@your.domain.com


Característica: Busqueda de Deposito
	COMO usuario de la plataforma Cobis , usando filial , oficina y rol del modulo de DPF
	QUIERO activar un Certificado de Depósitos a Plazo
	PARA  evidenciar el cambio de estado de un Certificado de Depósito
	
Antecedentes: El usuario ingresa a cobis
	 Dado que usuario:"admuser" realiza Login en COBIS con password:"Passw0rd2019*#" rol:"MENU POR PROCESOS" filial:"BANCO COBIS" oficina:"OFICINA MATRIZ" en la url:"http://www.demo1.cloud-cobiscorp.com/CWC/services/cobis/web/bank/views/commons/login.html"
   Dado que navega desde "Depósitos a Plazo" hacia "Búsqueda de Depósitos"
   
   #QA-S464719
   @BusquedaDeposito
   Esquema del escenario: Verificar la activación de un Certificado de Depósito
	 Cuando se busca el certificado de depósito por <numero_de_operacion> con <numero>
	 Y presionar sobre el DPF en el grid de resultados
	 Y se abre el menú de acciones escoger la opción Activar
	 Y presiona el botón Aceptar
	 Entonces el Certificado de Depósito se muestra un mensaje de excepcion <MensajeExcepcion> y se mantiene en estado <Estado>
	 Ejemplos:
	 |numero_de_operacion  | numero 			| Estado | MensajeExcepcion|
	 |'Numero de operación'| '70100002716'|'ING'	 | 'Excepción de negocio: 16 - 141153 - [BL_activa_deposito] Recuerde depositar los fondos en caja'|
	
	 #QA-S465034
	 @CancelacionDeposito
	 Esquema del escenario: Verificar la cancelación de un Certificado de Depósito con NC a cuenta
	 Cuando se busca el certificado de depósito por <numero_de_operacion> con <numero>
	 Y presionar sobre el DPF en el grid de resultados
	 Y se presiona el menú acciones, escogiendo la opción Cancelación Normal
	 Y se presiona el botón siguiente
	 Y se diligencia el formulario de Cancelación
	 Y se diligencia el formulario de forma de pago
	 Entonces el Certificado de Depósito se cancela cambiando el estado del mismo
	  Ejemplos:
	 |numero_de_operacion  | numero 			|
	 |'Numero de operación'| '70100012207'|
	
	 #QA-S465312
   @CancelaCuenta2FormasPago 
   Esquema del escenario: Verificar la Cancelación de un Certificado de Depósito con 2 Formas de Pago
	 Cuando se busca el certificado de depósito por el <numero_de_operacion> con <numero_de_cuenta>
	 Y se presiona el menú acciones, escogiendo la opción Cancelación Normal
	 Y se presiona el botón siguiente
	 #Entonces el Certificado de Depósito se muestra un mensaje de excepcion <MensajeExcepcion> y se mantiene en estado <Estado>
	 Ejemplos:
	 |numero_de_operacion  | numero_de_cuenta 			|
	 |'Numero de operación'| '70100012212'          |
	
	 