#language : es
#Author user@cobiscorp.com

Característica: Cancelacion de Certificado de Deposito
  
  COMO usuario de la plataforma Cobis , usando filial , oficina y rol del modulo de DPF
	QUIERO cancelar un Certificado de Depósitos a Plazo
	PARA  evidenciar la cancelación correcta de un Certificado de Depósito
	
	Antecedentes: El usuario ingresa a cobis
	Dado que usuario realiza login en el sistema cobis
  Dado que navega desde "Depósitos a Plazo" hacia "Búsqueda de Depósitos"


  @CancelacionCuentaBloqueada
  Esquema del escenario: Verificar la cancelación de un Certificado de Deposito con NC a una cuenta aho/cte bloqueada contra depósito
	Cuando se busca el certificado de depósito por <numero_de_operacion> con <numero>
	Y se presiona el menú acciones, escoge la opción <opcion>
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
	Y se presiona el menú acciones, escoge la opción <opcion>
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
	Y se presiona el menú acciones, escoge la opción <opcion>
	Y presiona el botón siguientes
	Y diligencia el formulario de Cancelación <capital>,<saldo>,<impuesto>,<total>,<interesGanado>,<interesPagado>,<solicitante>,<observacion>
	Y llena el formulario de forma de pago <formaRecepcion> a <beneficiario>,<columna>,<cuenta> con <montoPago>
	Entonces en la pantalla emergente de los números de cuenta no se visualiza la cuenta cerrada
	Ejemplos:
	|numero_de_operacion  | numero 			| opcion						 |capital|saldo |impuesto|total  |interesGanado|interesPagado|solicitante					 |observacion|formaRecepcion		 |beneficiario					|columna|cuenta							 |montoPago |estado|
	|"Numero de operación"|"70100016374"|"Cancelación Normal"|""		 |""		|''			 |''		 |''					 |''					 |'RAMON  GARCIA LOPEZ'|''				 |'CUENTA DE AHORROS'|'RAMON  GARCIA LOPEZ'|'1' 	 |'0000100100000000401'|'12345678'|'CAN'	|
	