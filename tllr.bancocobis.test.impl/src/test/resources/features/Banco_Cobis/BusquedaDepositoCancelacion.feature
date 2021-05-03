#language: es
#Author: jmarchesini@cobiscorp.com

Característica: Busqueda de Deposito
	COMO usuario de la plataforma Cobis , usando filial , oficina y rol del modulo de DPF
	QUIERO activar un Certificado de Depósitos a Plazo
	PARA  evidenciar el cambio de estado de un Certificado de Depósito
	
Antecedentes: El usuario ingresa a cobis
	 Dado que usuario:"admuser" realiza Login en COBIS con password:"Passw0rd2019*#" rol:"MENU POR PROCESOS" filial:"BANCO COBIS" oficina:"OFICINA MATRIZ" en la url:"http://www.demo1.cloud-cobiscorp.com/CWC/services/cobis/web/bank/views/commons/login.html"
   Dado que navega desde "Depósitos a Plazo" hacia "Búsqueda de Depósitos"


 	 #QA-S465034
   @CancelacionDeposito
   Esquema del escenario: Verificar la cancelación de un Certificado de Depósito con NC a cuenta
	 Cuando se busca el certificado de depósito por <numero_de_operacion> con <numero>
	 Y se presiona el menú acciones, escogiendo la opción Cancelación Normal
	 Y se presiona el botón siguiente
	 Y se diligencia el formulario de Cancelación con el <nombre_de_solicitante> y con <observacion>
	 Y se diligencia el formulario de forma de pago de <nombre_de_solicitante> con <forma_pago> el <monto>
	 Entonces el Certificado de Depósito se cancela cambiando el estado del mismo
	  Ejemplos:
	 |numero_de_operacion  | numero 			|   nombre_de_solicitante   |      observacion       |   forma_pago  |  monto    |
	 |'Numero de operación'| '70100014210'|  'FERNANDA DIAZ DE LEON'  | 'Obervación de prueba' |  "CONTABLE"   | "7048.32" |

   #QA-S465312
   @CancelaCuenta2FormasPagoContEfec
   Esquema del escenario: Verificar la Cancelación de un Certificado de Depósito con 2 Formas de Pago
	 Cuando se busca el certificado de depósito por el <numero_de_operacion> con <numero_de_cuenta>
	 Y se presiona el menú acciones, escogiendo la opción Cancelación Normal
	 Y se presiona el botón siguiente
	 Y se diligencia el formulario de Cancelación con el <nombre_solicitante> y con <observacion>
	 Y se diligencia el formulario de forma de pago con <formaRecepcionFP>,<nombre_beneficiario> y <formaRecepcionFP2>
	 Entonces el Certificado de Depósito se cancela cambiando el estado del mismo
	 Ejemplos:
	 |numero_de_operacion  | numero_de_cuenta 			| nombre_solicitante           | observacion          | formaRecepcionFP | nombre_beneficiario         | formaRecepcionFP2| 
	 |'Numero de operación'| '70100015847'          | 'DIANA LAURA SANCHEZ CHAVEZ' | 'PRUEBA CANCELACION' |  'EFECTIVO'      | 'DIANA LAURA SANCHEZ CHAVEZ'|'CONTABLE'        | 
	
	 @CancelaCuenta2FormasPagoNCCont
   Esquema del escenario: Verificar la Cancelación de un Certificado de Depósito con 2 Formas de Pago
	 Cuando se busca el certificado de depósito por el <numero_de_operacion> con <numero_de_cuenta>
	 Y se presiona el menú acciones, escogiendo la opción Cancelación Normal
	 Y se presiona el botón siguiente
	 Y se diligencia el formulario de Cancelación con el <nombre_solicitante> y con <observacion>
	 Y se diligencia el formulario de forma de pago con cuenta <formaRecepcionFP>,<nombre_beneficiario>,<formaRecepcionFP2>,<cuenta>
	 Entonces el Certificado de Depósito se cancela cambiando el estado del mismo
	 Ejemplos:
	 |numero_de_operacion  | numero_de_cuenta 			| nombre_solicitante        | observacion          | formaRecepcionFP          |cuenta| nombre_beneficiario         | formaRecepcionFP2| 
	 |'Numero de operación'| '70100015852'          | 'NAYARA  PONS CARRASCO'    | 'PRUEBA CANCELACION' |  'CUENTA DE AHORROS'      |'1'   | 'NAYARA  PONS CARRASCO'    |'CONTABLE'        | 
	 

	 #QA-S465407
	 @CancelacionDepositoMultimoneda
	 Esquema del escenario: Validar la cancelación de un Certificado de Depósito multimoneda
	 Cuando se busca el certificado de depósito por el <numero_de_operacion> con <numero_de_cuenta>
	 Y se presiona el menú acciones, escogiendo la opción Cancelación Normal
	 Y se presiona el botón siguiente
	 Y se diligencia el formulario de Cancelación con el <nombre_solicitante> y con <observacion>
	 Y se diligencia el formulario de forma de pago con <forma_recepcion> y <monto> y <nombre_solicitante>
	 Entonces el Certificado de Depósito se cancela cambiando el estado del mismo
		Ejemplos: 
		|numero_de_operacion  | numero_de_cuenta | nombre_solicitante        | observacion          | forma_recepcion    | monto    |
	  |'Numero de operación'|'70200012726'     | 'MARIANA  HERNANDEZ LOPEZ' | 'PRUEBA CANCELACION' | 'CUENTA DE AHORROS'| '6017.50'|
	  
	