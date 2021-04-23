#language : es
#Author : jmarchesini@cobiscorp.com.co

Característica: Crear Apertura Deposito a Plazo
  
  Como usuario de la plataforma COBIS
  Quiero realizar una apertura de deposito a Plazo a un cliente
  Para evidenciar en el sistema la correspondiente creación de la apertura del cliente asociado

 

Antecedentes: El usuario ingresa a cobis
    Dado que usuario:"admuser" realiza Login en COBIS con password:"Passw0rd2019*#" rol:"MENU POR PROCESOS" filial:"BANCO COBIS" oficina:"OFICINA MATRIZ" en la url:"http://www.demo1.cloud-cobiscorp.com/CWC/services/cobis/web/bank/views/commons/login.html"
    Dado que navega desde "Depósitos a Plazo" hacia "Apertura"
 
	#QA-S450331
  @AperturaDeposito
  Esquema del escenario: El usuario crea una Apertura Deposito a Plazo
  Cuando realiza la busqueda de <cliente_persona_natural> por <entidad>, <tipo>, <buscar_por> y siguiente
  Y diligencia el formulario de Operación <producto>,<forma_pago>,<capitaliza>,<categoria>,<moneda>
	Y diligencia el formulario de recepción de fondos
  Entonces el Certificado de Depósito es creado desplegando la pantalla Detalle de la Operación en estado ING
     Ejemplos:
  | cliente_persona_natural |entidad	|tipo							|buscar_por				|  producto 				| forma_pago	 |capitaliza|categoria 	 |moneda 					 |
  | '123456789'  						|"Cliente"|"Persona Natural"|"Identificacion"	|  'CERTIFICADO VIP'| 'VENCIMIENTO'|'NO'			|'NOMINATIVO'|'PESO COLOMBIANO'|
  
  #QA-S459574
  @AperturaDepositoDos
  Esquema del escenario: Apertura de un certificado de depósito Persona Natural_Periódico_pago mensual_Capitalizacion NO_con 2 titulares
  Y realiza la busqueda de <cliente_persona_natural1>
  Y nuevamente realiza la busqueda de un <cliente_persona_natural2> tipo conjunta
  Y diligencia el formulario de Operación periodico <producto>,<forma_pago>,<frecuencia>,<capitaliza>,<categoria>,<moneda>
  Y diligencia el formulario de recepción de fondos periodico
  Y diligencia el formulario formas de pago al <nombre_titular>
  Entonces el Certificado de Depósito es creado desplegando la pantalla Detalle de la Operación en estado ING
    Ejemplos:
  | cliente_persona_natural1 | cliente_persona_natural2 |producto         | forma_pago   |  frecuencia  |capitaliza    |categoria    |moneda           | nombre_titular |
  | 'GOXA840615HCCNXN06'     | 'SIXN601212MASLXD07'     |'CERTIFICADO VIP'| 'PERIODICA'  |  'MENSUAL'   | 'NO'         |'NOMINATIVO' |'PESO COLOMBIANO'| 'NIDIA SILVA ' |

	#QA-S459582
  @AperturaDepositoDosNaturales
	Esquema del escenario: Apertura de un certificado de depósito Persona Natural_Vencimiento_Capitaliza SI_2 formas de recepción
	Cuando realiza la busqueda de <cliente_persona_natural> por <entidad>, <tipo>, <buscar_por>
	Y nuevamente realiza la busqueda de <cliente_persona_natural1> por <entidad>, <tipo>, <buscar_por> tipo <tipo_cuenta>
	Y diligencia el formulario de Operación <producto>,<forma_pago>,<capitaliza>,<categoria>,<moneda>
	Y diligencia el formulario de recepción de fondos <formaRecepcion> a <cliente_persona_natural> con <monto>
	Y diligencia el formulario de recepción de fondos <formaRecepcion> a <cliente_persona_natural1> con <monto> y guardar
	Entonces el Certificado de Depósito es creado desplegando la pantalla Detalle de la Operación en estado ING
	Ejemplos:
  | cliente_persona_natural 		 |cliente_persona_natural1 |entidad	 |tipo						 |buscar_por|tipo_cuenta|producto 			   |forma_pago		|capitaliza |categoria 	 |moneda 					 |formaRecepcion	   | monto |
  |'JESSICA DURAN DIAZ'|'EVELIN PONCE MARTINEZ'  |"Cliente"|"Persona Natural"|"Nombre"	|"INDISTINTA"|'CERTIFICADO VIP'|'VENCIMIENTO' |'SI'		 	  |'NOMINATIVO'|'PESO COLOMBIANO'|'CUENTA DE AHORROS'| '6000' |
 
 
  #QA-S459585
  @AperturaDepositoMonedaDolar
	Esquema del escenario: Apertura de un certificado de depósito Persona Natural_Vencimiento_Capitalización SI_moneda dólar
	Y realiza la busqueda de un solo <cliente_persona_natural>
	Y diligencia el formulario de Operación <producto>,<forma_pago>,<capitaliza>,<categoria>,<moneda>
	Y diligencia el formulario de recepción de fondos
	Entonces el Certificado de Depósito es creado desplegando la pantalla Detalle de la Operación en estado ING
	     Ejemplos:
  | cliente_persona_natural    | producto 				| forma_pago	 |capitaliza|  categoria 	   |  moneda  |
  | '123456789'                | 'CERTIFICADO VIP'| 'VENCIMIENTO'|   'SI'		|  'NOMINATIVO'  | 'DOLAR'  |
  

	#QA-S461780
  @AperturaDepositoPersonaJuridica
  Esquema del escenario: Apertura de un certificado de depósito Persona Jurídica al Vencimiento 2 titulares(Indistinta)_Capitalizable NO_pesos
  Cuando realiza la busqueda de <cliente_persona_juridica> por <entidad>, <tipo1>, <buscar_por>
	Y nuevamente realiza la busqueda de <cliente_persona_natural> por <entidad>, <tipo2>, <buscar_por> tipo <tipo_cuenta>
	Y diligencia el formulario de Operación <producto>,<forma_pago>,<capitaliza>,<categoria>,<moneda>
	Y diligencia el formulario de recepción de fondos
	Entonces el Certificado de Depósito es creado desplegando la pantalla Detalle de la Operación en estado ING
	Ejemplos:
  | cliente_persona_juridica | cliente_persona_natural |entidad	 |tipo1						 |tipo2						 |buscar_por|tipo_cuenta| producto 				| forma_pago	 |capitaliza|categoria 	 |moneda 					 |
  | 'BANCO' 	     					 | 'EVELIN'                |"Cliente"|"Persona Jurídica"|"Persona Natural"|"Nombre"	|"INDISTINTA"|'CERTIFICADO VIP'| 'VENCIMIENTO'|'NO'			|'NOMINATIVO'|'PESO COLOMBIANO'|
  
  #QA-S461850-------------
  @AperturaDepositoPersonaJuridicaPeriodico
  Esquema del escenario: Apertura de un certificado de depósito Persona Jurídica_ Periódico_1 titular(indistinta)_Pago mensual_Capitalizable SI_dólares (multimoneda)
	Cuando realiza la busqueda de <cliente_persona_juridica> por <entidad>, <tipo1>, <buscar_por>
	Y nuevamente realiza la busqueda de <codigo_persona> por <entidad>, <tipo2>, <buscar_por1> tipo <tipo_cuenta>
 	Y diligencia el formulario de Operación periodico <producto>,<forma_pago>,<frecuencia>,<capitaliza>,<categoria>,<moneda>
 	Y diligencia el formulario de recepción de fondos <formaRecepcion> a <cliente_persona_juridica> con <monto> y guardar
	Entonces el Certificado de Depósito es creado desplegando la pantalla Detalle de la Operación en estado ING
	Ejemplos:
  | cliente_persona_juridica |codigo_persona|cliente_persona_natural  |entidad	 |tipo1						 	|tipo2				    |buscar_por|buscar_por1|tipo_cuenta |producto 				|forma_pago	|frecuencia|capitaliza| categoria 	|moneda |formaRecepcion	  	|monto |
  | 'BANCO COBIS' 	     		 |"25"				  |'JESSICA CHAVEZ QUINTANA'|"Cliente"|"Persona Jurídica"|"Persona Natural"|"Nombre"	 |"Código"	 |"INDISTINTA"|'CERTIFICADO VIP'|'PERIODICA'|'MENSUAL' |'SI'			| 'NOMINATIVO'|'DOLAR'|'CUENTA DE AHORROS'|'12000' |

      
  #QA-S459614
  @AperturaDepositoTriCapPesos
	Esquema del escenario: Apertura de un certificado de depósito Persona Natural_Periódico_pago trimestral_Capitalización NO_moneda pesos
	Y realiza la busqueda de un solo <cliente_persona_natural>
	Y diligencia el formulario de Operación con moneda pesos <producto>,<forma_pago>,<frecuencia>,<capitaliza>,<categoria>,<moneda>
	Y diligencia el formulario de recepción de fondos pesos con <formaRecepcionFC>
	Y diligencia el formulario formas de pago pesos con <formaRecepcionFP>,<nombre_beneficiario>
	Entonces el Certificado de Depósito es creado desplegando la pantalla Detalle de la Operación en estado ING
	Ejemplos:
  | cliente_persona_natural  | producto 		        | forma_pago	  |frecuencia     | capitaliza  | categoria 	    |moneda           | formaRecepcionFC	| formaRecepcionFP |  nombre_beneficiario         |
  | '1713115'  	     		     | 'CERTIFICADO PYME'   | 'PERIODICA'	  |'TRIMESTRAL'		|	'NO'			  | 'NOMINATIVO'    |'PESO COLOMBIANO'| 'CONTABLE'			  |  'CONTABLE'      | 'Laura Chacon '                 |


  #QA-S459615
  @AperturaDepositoVencCB
	Esquema del escenario: Apertura de un certificado de depósito Persona Natural_Vencimiento_Capitalización SI_moneda pesos_ND a una Cta. Sin fondos
	Y realiza la busqueda de un solo <cliente_persona_natural>
	Y diligencia el formulario de Operación vencimiento con moneda pesos <producto>,<forma_pago>,<capitaliza>,<categoria>,<moneda>
	Y diligencia el formulario de recepción de fondos cta con <formaRecepcionFC>,<nombre_cliente>,<cuenta>
	Entonces se despliega el mensaje cuenta bloqueada contra retiro o debito
	Ejemplos:
  | cliente_persona_natural  | producto 		        | forma_pago	        | capitaliza  | categoria 	    |moneda           | formaRecepcionFC	        |  nombre_cliente            |cuenta|
  | '1713115'  	     		     | 'CERTIFICADO PYME'   | 'VENCIMIENTO'	  		|	'SI'			  | 'NOMINATIVO'    |'PESO COLOMBIANO'| 'CUENTA DE AHORROS'			  | 'Laura Chacon '            |'2'   |
 
  
  @AperturaDepositoVencND
	Esquema del escenario: Apertura de un certificado de depósito Persona Natural_Vencimiento_Capitalización SI_moneda pesos_ND a una Cta. Sin fondos
	Y realiza la busqueda de un solo <cliente_persona_natural>
	Y diligencia el formulario de Operación vencimiento con moneda pesos <producto>,<forma_pago>,<capitaliza>,<categoria>,<moneda>
	Y diligencia el formulario de recepción de fondos cta con <formaRecepcionFC>,<nombre_cliente>,<cuenta>
	Entonces se despliega el mensaje No hay disponible en la cuenta
	Ejemplos:
  | cliente_persona_natural  | producto 		        | forma_pago	        | capitaliza  | categoria 	    |moneda           | formaRecepcionFC	        |  nombre_cliente            |cuenta|
  | '1713115'  	     		     | 'CERTIFICADO PYME'   | 'VENCIMIENTO'	  		|	'SI'			  | 'NOMINATIVO'    |'PESO COLOMBIANO'| 'CUENTA DE AHORROS'			  | 'Laura Chacon '            |'1'   |
 
 
 	 #QA-S459613
  @AperturaDepositoDosTitulares
  Esquema del escenario: Apertura de un certificado de depósito Persona Natural_Vencimiento_con 2 titulares_Capitaliza SI
  Y realiza la busqueda de <cliente_persona_natural1>
	Y nuevamente realiza la busqueda de un <cliente_persona_natural2> tipo indistinta
	Y diligencia el formulario de Operación <producto>,<forma_pago>,<capitaliza>,<categoria>,<moneda>
	Y diligencia el formulario de recepción de fondos 
	Entonces el Certificado de Depósito es creado desplegando la pantalla Detalle de la Operación en estado ING
	Ejemplos:
  | cliente_persona_natural1 | cliente_persona_natural2 | producto 					| forma_pago	 | capitaliza | categoria 	| moneda          |
  | '123456789' 	     	  	 | '74489'                  | 'CERTIFICADO VIP' | 'VENCIMIENTO'|	'SI'	  	| 'NOMINATIVO'|'PESO COLOMBIANO'|
  
  
  #QA-S462044 
  @AperturaDepositoPersonaJuridicaTrimestral
  Esquema del escenario: Apertura de un certificado de depósito Persona Jurídica_1 titular(indistinta)_Periódico_Pago trimestral_Capitalizable NO_Pesos
  Y realiza la busqueda de <cliente_persona_juridica> cliente juridico
  Y nuevamente realiza la busqueda de un <cliente_persona_natural> tipo indistinta
  Y diligencia el formulario de Operación periodico <producto>,<forma_pago>,<frecuencia>,<capitaliza>,<categoria>,<moneda>
  Y diligencia el formulario de recepción de fondos a persona juridica
  Y diligencia el formulario de forma de pago juridico
	Entonces el Certificado de Depósito es creado desplegando la pantalla Detalle de la Operación en estado ING
  Ejemplos:
  | cliente_persona_juridica | cliente_persona_natural  | producto 					  | forma_pago	|frecuencia 		| capitaliza | categoria 	 |moneda           | 
  | 'BANCO TE CREEMOS' 	   	 | '123456789'              | 'CERTIFICADO VIP' 	| 'PERIODICA'	|'TRIMESTRAL'		|	'NO'			 | 'NOMINATIVO'|'PESO COLOMBIANO'|
  
 
	#QA-S461814
 	@AperturaDepositoUnJuridicoDosNaturales
 	Esquema del escenario: Apertura de un certificado de depósito Persona Jurídica_ al Vencimiento_3 titulares(Conjunta)_Capitalizable SI_pesos
	Cuando realiza la busqueda de <cliente_persona_juridica> cliente juridico
	Y nuevamente realiza la busqueda de un <cliente_persona_natural1> tipo indistinta
	Y nuevamente realiza la busqueda de otro <cliente_persona_natural2> tipo indistinta
	Y diligencia el formulario de Operación <producto>,<forma_pago>,<capitaliza>,<categoria>,<moneda>
	Y diligencia el formulario de recepción de fondos
	Entonces el Certificado de Depósito es creado desplegando la pantalla Detalle de la Operación en estado ING
	Ejemplos:
  | cliente_persona_juridica | cliente_persona_natural1 |  cliente_persona_natural2  |  producto 					| forma_pago	  | capitaliza | categoria 	 |     moneda      | 
  | 'BANCO COBIS' 	     		 | '123456789'              |            '74489'         | 'CERTIFICADO VIP' 	| 'VENCIMIENTO'	|	'SI'			 | 'NOMINATIVO'|'PESO COLOMBIANO'|

  #QA-S461814 Alternativo
 	@AperturaDepositoUnJuridicoDosNaturalesAlternativo
 	Esquema del escenario: Apertura de un certificado de depósito Persona Jurídica_ al Vencimiento_3 titulares(Conjunta)_Capitalizable SI_pesos_Alternativo
	Cuando realiza la busqueda de <cliente_persona_juridica> por <entidad>, <tipo1>, <buscar_por1>
	Y nuevamente realiza la busqueda de un <cliente_persona_natural1> por <entidad>, <tipo2>, <buscar_por2> tipo <tipo_cuenta>
	Y nuevamente realiza la busqueda de <cliente_persona_natural2> por <entidad>, <tipo2>, <buscar_por2> tipo <tipo_cuenta>
	Y diligencia el formulario de Operación <producto>,<forma_pago>,<capitaliza>,<categoria>,<moneda>
	Y diligencia el formulario de recepción de fondos
	Entonces el Certificado de Depósito es creado desplegando la pantalla Detalle de la Operación en estado ING
	Ejemplos:
  | cliente_persona_juridica | cliente_persona_natural1 |  cliente_persona_natural2  |  entidad 	 |        tipo1           |     tipo2				| buscar_por1   |    buscar_por2     |cliente_persona_natural2  |     tipo2            |    tipo_cuenta   |  producto 				| forma_pago	  | capitaliza | categoria 	 |     moneda    | 
  | 'BANCO COBIS' 	     		 | '123456789'              |            '74489'         | "Cliente"   |  "Persona Jurídica"    |"Persona Natural"|  "Nombre"     |   "Identificación" |         '74489'          |   "Persona Natural"  |    "INDISTINTA"  |'CERTIFICADO VIP' 	| 'VENCIMIENTO'	|	'SI'			 | 'NOMINATIVO'|'PESO COLOMBIANO'|
  
 

  #QA-S462099
  @AperturaDepositoDosFormasPago
  Esquema del escenario: Apertura de un certificado de depósito para Persona Jurídica_con 1 titular(indistinta)_Periódico_con 2 formas de pago de interés
  Cuando realiza la busqueda de <cliente_persona_juridica> por <entidad>, <tipo1>, <buscar_por>
  Y nuevamente realiza la busqueda de <cliente_persona_natural> por <entidad>, <tipo2>, <buscar_por> tipo <tipo_cuenta>
	Y diligencia el formulario de Operación periodico <producto>,<forma_pago>,<frecuencia>,<capitaliza>,<categoria>,<moneda>
	Y diligencia el formulario de recepción de fondos a persona juridica
	Y diligencia formulario ingresando las dos formas de pago <formaRecepcion> y <formaRecepcion2> a <cliente_persona_juridica> y <cliente_persona_natural> con <monto>
	Entonces el Certificado de Depósito es creado desplegando la pantalla Detalle de la Operación en estado ING
	Ejemplos:
  |cliente_persona_juridica|cliente_persona_natural 		 |entidad	 |tipo1						 	|tipo2						|buscar_por|tipo_cuenta |producto 				 |forma_pago	|frecuencia |capitaliza|categoria 	 |moneda |formaRecepcion	   |formaRecepcion2|monto  |
  |'BANCO COBIS' 	   			 |'EVELIN PONCE MARTINEZ' |"Cliente"|"Persona Jurídica"|"Persona Natural"|"Nombre"	 |"INDISTINTA"|'CERTIFICADO VIP' |'PERIODICA'	|'MENSUAL'	|'NO'			 |'NOMINATIVO' |'PESO COLOMBIANO'|'CONTABLE'		|'EFECTIVO' 		 |'10.75'|
