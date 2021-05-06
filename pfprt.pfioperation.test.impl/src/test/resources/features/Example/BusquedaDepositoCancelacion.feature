#language: es
#Author: jmarchesini@cobiscorp.com

Característica: Busqueda de Deposito
	COMO usuario de la plataforma Cobis , usando filial , oficina y rol del modulo de DPF
	QUIERO activar un Certificado de Depósitos a Plazo
	PARA  evidenciar el cambio de estado de un Certificado de Depósito
	
Antecedentes: El usuario ingresa a cobis
	 Dado que usuario realiza login en el sistema cobis
   Dado que navega desde "Depósitos a Plazo" hacia "Búsqueda de Depósitos"


 	 #QA-S465034
   @CancelacionDeposito
   Esquema del escenario: Verificar la cancelación de un Certificado de Depósito con NC a cuenta
	 Cuando se busca el certificado de depósito por <numero_de_operacion> con <numero>
	 Y se presiona el menú acciones, escogiendo la opción Cancelación Normal
	 Y se presiona el botón siguiente
	 Y se diligencia el formulario de Cancelación con el <nombre_de_solicitante> y con <observacion>
	 Y se diligencia el formulario de forma de pago de <nombre_de_solicitante> con <forma_pago> el <monto>
	 Entonces el Certificado de Depósito se cancela cambiando el estado del mismo a <estado>
	  Ejemplos:
	 |numero_de_operacion  | numero 			|   nombre_de_solicitante   |      observacion       |   forma_pago  |  monto    |  estado  |
	 |'Numero de operación'| '70100016086'|  'FERNANDA DIAZ DE LEON'  | 'Obervación de prueba' |  "CONTABLE"   | "7048.32" |  "CAN"   |

   #QA-S465312
   @CancelaCuenta2FormasPagoContEfec
   Esquema del escenario: Verificar la Cancelación de un Certificado de Depósito con 2 Formas de Pago
	 Cuando se busca el certificado de depósito por el <numero_de_operacion> con <numero_de_cuenta>
	 Y se presiona el menú acciones, escogiendo la opción Cancelación Normal
	 Y se presiona el botón siguiente
	 Y se diligencia el formulario de Cancelación con el <nombre_solicitante> y con <observacion>
	 Y se diligencia el formulario de forma de pago con <formaRecepcionFP>, <cantidad1>, <nombre_beneficiario> y <formaRecepcionFP2>, <cantidad2>
	 Entonces el Certificado de Depósito se cancela cambiando el estado del mismo a <estado>
	 Ejemplos:
	 |numero_de_operacion  | numero_de_cuenta 			| nombre_solicitante           | observacion          | formaRecepcionFP | cantidad1  | nombre_beneficiario         | formaRecepcionFP2|  cantidad2  | estado |
	 |'Numero de operación'| '70100016091'          | 'DIANA LAURA SANCHEZ CHAVEZ' | 'PRUEBA CANCELACION' |  'EFECTIVO'      | "3524.16"  | 'DIANA LAURA SANCHEZ CHAVEZ'|'CONTABLE'        | "3524.16"   | "CAN"  |
	
	 @CancelaCuenta2FormasPagoNCCont
   Esquema del escenario: Verificar la Cancelación de un Certificado de Depósito con 2 Formas de Pago
	 Cuando se busca el certificado de depósito por el <numero_de_operacion> con <numero_de_cuenta>
	 Y se presiona el menú acciones, escogiendo la opción Cancelación Normal
	 Y se presiona el botón siguiente
	 Y se diligencia el formulario de Cancelación con el <nombre_solicitante> y con <observacion>
	 Y se diligencia el formulario de forma de pago con cuenta <formaRecepcionFP>, <cantidad1>, <nombre_beneficiario>, <formaRecepcionFP2>, <cantidad2>, <cuenta>
	 Entonces el Certificado de Depósito se cancela cambiando el estado del mismo a <estado>
	 Ejemplos:
	 |numero_de_operacion  | numero_de_cuenta 			| nombre_solicitante         | observacion          | formaRecepcionFP          |  cantidad1 |  cantidad2 |cuenta| nombre_beneficiario        | formaRecepcionFP2|  estado  |
	 |'Numero de operación'| '70100016112'          | 'NAYARA  PONS CARRASCO'    | 'PRUEBA CANCELACION' |  'CUENTA DE AHORROS'      |  "3524.16" |  "3524.16" |'1'   | 'NAYARA  PONS CARRASCO'    |'CONTABLE'        |  "CAN"   |
	 

	 #QA-S465407
	 @CancelacionDepositoMultimoneda
	 Esquema del escenario: Validar la cancelación de un Certificado de Depósito multimoneda
	 Cuando se busca el certificado de depósito por el <numero_de_operacion> con <numero_de_cuenta>
	 Y se presiona el menú acciones, escogiendo la opción Cancelación Normal
	 Y se presiona el botón siguiente
	 Y se diligencia el formulario de Cancelación con el <nombre_solicitante> y con <observacion>
	 Y se diligencia el formulario de forma de pago con <forma_recepcion> y <monto> y <nombre_solicitante>
	 Entonces el Certificado de Depósito se cancela cambiando el estado del mismo a <estado>
		Ejemplos: 
		|numero_de_operacion  | numero_de_cuenta | nombre_solicitante        | observacion          | forma_recepcion     | monto     |  estado  |
	  |'Numero de operación'|'70100016133'     | 'MARIANA  HERNANDEZ LOPEZ' | 'PRUEBA CANCELACION' | 'CUENTA DE AHORROS'| '7048.32' |  "CAN"   |
	  
	 @CancelacionCuentaBloqueada
   Esquema del escenario: Verificar la cancelación de un Certificado de Deposito con NC a una cuenta aho/cte bloqueada contra depósito
	 Cuando se busca el certificado de depósito por <numero_de_operacion> con <numero>
	 Y se presiona el menú acciones, escoger la opción <opcion>
	 Y presiona el botón siguientes
	 Y diligencia el formulario de Cancelación <capital>,<saldo>,<impuesto>,<total>,<interesGanado>,<interesPagado>,<solicitante>,<observacion>
	 Y llena el formulario de forma de pago <formaRecepcion> a <beneficiario>,<columna>,<cuenta> con <montoPago>
	 Entonces el sistema despliega un mensaje informativo indicando que la cuenta se encuentra <estado>
	 Ejemplos:
	 |numero_de_operacion  | numero 			| opcion						 |capital|saldo |impuesto|total  |interesGanado|interesPagado|solicitante	 |observacion|formaRecepcion		 |beneficiario |columna|cuenta								|montoPago |estado|
	 |"Numero de operación"|"70100016369"|"Cancelación Normal"|""     |""    |''  		 |''     |''  				 |''					 |'LUIS CHAVEZ'|''				 |'CUENTA DE AHORROS'|'LUIS CHAVEZ'|'1'    |'4090010300000000030'|'15103.54'|'CAN'	|
	
	
	 @CancelacionCuentaInmovilizada
	 Esquema del escenario: Verificar la cancelación de un Certificado de Deposito con NC a una cuenta aho/cte inmovilizada
	 Cuando se busca el certificado de depósito por <numero_de_operacion> con <numero>
	 Y se presiona el menú acciones, escoger la opción <opcion>
	 Y presiona el botón siguientes
	 Y diligencia el formulario de Cancelación <capital>,<saldo>,<impuesto>,<total>,<interesGanado>,<interesPagado>,<solicitante>,<observacion>
	 Y llena el formulario de forma de pago <formaRecepcion> a <beneficiario>,<columna>,<cuenta> con <montoPago>
	 Entonces el sistema despliega un mensaje informativo indicando que la cuenta se encuentra <estado>
	 Ejemplos:
	 |numero_de_operacion  | numero 			| opcion						 |capital|saldo |impuesto|total  |interesGanado|interesPagado|solicitante				 |observacion|formaRecepcion		 |beneficiario			 |columna|cuenta			|montoPago |estado|
	 |"Numero de operación"|"70100016306"|"Cancelación Normal"|""		 |""		|''			 |'' 		 |''				 	 |''					 |'ANTONIO  GONZALEZ'|''				 |'CUENTA DE AHORROS'|'ANTONIO  GONZALEZ'|'1'		 |'1234567892'|'12345678'|'CAN'	|
	
	
	 @CancelacionCuentaCerrada
	 Esquema del escenario: Verificar la cancelación de un Certificado de Deposito con NC a una cuenta aho/cte cerrada
	 Cuando se busca el certificado de depósito por <numero_de_operacion> con <numero>
	 Y se presiona el menú acciones, escoger la opción <opcion>
	 Y presiona el botón siguientes
	 Y diligencia el formulario de Cancelación <capital>,<saldo>,<impuesto>,<total>,<interesGanado>,<interesPagado>,<solicitante>,<observacion>
	 Y llena el formulario de forma de pago <formaRecepcion> a <beneficiario>,<columna>,<cuenta> con <montoPago>
	 Entonces en la pantalla emergente de los números de cuenta no se visualiza la cuenta cerrada
	 Ejemplos:
	 |numero_de_operacion  | numero 			| opcion						 |capital|saldo |impuesto|total  |interesGanado|interesPagado|solicitante					 |observacion|formaRecepcion		 |beneficiario					|columna|cuenta							 |montoPago |estado|
	 |"Numero de operación"|"70100016374"|"Cancelación Normal"|""		 |""		|''			 |''		 |''					 |''					 |'RAMON  GARCIA LOPEZ'|''				 |'CUENTA DE AHORROS'|'RAMON  GARCIA LOPEZ'|'1' 	 |'0000100100000000401'|'12345678'|'CAN'	|
	
	  
	