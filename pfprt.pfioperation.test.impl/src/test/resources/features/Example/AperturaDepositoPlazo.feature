#language : es
#Author : jmarchesini@cobiscorp.com.co

Característica: Crear Apertura Deposito a Plazo
  
  Como usuario de la plataforma COBIS
  Quiero realizar una apertura de deposito a Plazo a un cliente
  Para evidenciar en el sistema la correspondiente creación de la apertura del cliente asociado

 

Antecedentes: El usuario ingresa a cobis
    Dado que usuario realiza login en el sistema cobis
    Dado que navega desde "Depósitos a Plazo" hacia "Apertura"
 
	#QA-S450331
  @AperturaDeposito
  Esquema del escenario: El usuario crea una Apertura Deposito a Plazo
  Cuando realiza la busqueda de <cliente_persona_natural> por <entidad>, <tipo>, <buscar_por> y siguiente
  Y diligencia el formulario de Operación <producto>,<forma_pago>,<frecuencia>,<capitaliza>,<categoria>,<moneda>,<montoOperacion>,<plazo>
	Y diligencia el formulario de recepción de fondos <formaRecepcion> a "",<cuenta> con <monto> y guardar
  Entonces el Certificado de Depósito es creado desplegando la pantalla Detalle de la Operación en estado ING
     Ejemplos:
  | cliente_persona_natural |entidad	|tipo							|buscar_por				|  producto 				| forma_pago	 |frecuencia|capitaliza|categoria 	 |moneda 					 |montoOperacion|plazo|formaRecepcion|cuenta|	monto|
  | '123456789'  						|"Cliente"|"Persona Natural"|"Identificacion"	|  'CERTIFICADO VIP'| 'VENCIMIENTO'|""				|	'NO'			|'NOMINATIVO'|'PESO COLOMBIANO'|"12000"				|	"35"|"CONTABLE"		 |	""|"12000"|
  
  #QA-S459574
  @AperturaDepositoDos
  Esquema del escenario: Apertura de un certificado de depósito Persona Natural_Periódico_pago mensual_Capitalizacion NO_con 2 titulares
  Cuando realiza la busqueda de <cliente_persona_natural1> por <entidad>, <tipo>, <buscar_por>
	Y nuevamente realiza la busqueda de <cliente_persona_natural2> por <entidad>, <tipo>, <buscar_por> tipo <tipo_cuenta> y siguente
  Y diligencia el formulario de Operación <producto>,<forma_pago>,<frecuencia>,<capitaliza>,<categoria>,<moneda>,<montoOperacion>,<plazo>
  Y diligencia el formulario de recepción de fondos <formaRecepcion> a "","" con <monto> y siguiente
  Y diligencia formulario de forma de pago <formaRecepcionPago> a <nombre_titular>,<cuenta> con <montoPago>
  Entonces el Certificado de Depósito es creado desplegando la pantalla Detalle de la Operación en estado ING
    Ejemplos:
  | cliente_persona_natural1 | cliente_persona_natural2 |entidad	|tipo							|buscar_por			 |tipo_cuenta|producto         | forma_pago |frecuencia|capitaliza|categoria   |moneda           |montoOperacion|plazo|formaRecepcion|monto  | nombre_titular|formaRecepcionPago|cuenta|montoPago|
  | 'GOXA840615HCCNXN06'     | 'SIXN601212MASLXD07'     |"Cliente"|"Persona Natural"|"Identificacion"|"CONJUNTA" |'CERTIFICADO VIP'| 'PERIODICA'|'MENSUAL' | 'NO'     |'NOMINATIVO'|'PESO COLOMBIANO'| "12000"			|"35" |"CONTABLE"    |"12000"|'NIDIA SILVA ' |'CONTABLE'				|"1"	 |"70.60"|

	#QA-S459582
  @AperturaDepositoDosNaturales
	Esquema del escenario: Apertura de un certificado de depósito Persona Natural_Vencimiento_Capitaliza SI_2 formas de recepción
	Cuando realiza la busqueda de <cliente_persona_natural> por <entidad>, <tipo>, <buscar_por>
	Y nuevamente realiza la busqueda de <cliente_persona_natural1> por <entidad>, <tipo>, <buscar_por> tipo <tipo_cuenta> y siguente
	Y diligencia el formulario de Operación <producto>,<forma_pago>,<frecuencia>,<capitaliza>,<categoria>,<moneda>,<montoOperacion>,<plazo>
	Y diligencia el formulario de recepción de fondos <formaRecepcion> a <cliente_persona_natural>,<cuenta> con <monto>
	Y diligencia el formulario de recepción de fondos <formaRecepcion> a <cliente_persona_natural1>,<cuenta> con <monto> y guardar
	Entonces el Certificado de Depósito es creado desplegando la pantalla Detalle de la Operación en estado ING
	Ejemplos:
  | cliente_persona_natural|cliente_persona_natural1|entidad	|tipo						 |buscar_por|tipo_cuenta |producto 			   |forma_pago	 |frecuencia|capitaliza |categoria 	 |moneda 					 |montoOperacion|plazo|formaRecepcion	   | cuenta|monto |
  |'JESSICA DURAN DIAZ'		 |'EVELIN PONCE MARTINEZ' |"Cliente"|"Persona Natural"|"Nombre"	|"INDISTINTA"|'CERTIFICADO VIP'|'VENCIMIENTO'|""				|'SI'		 	  |'NOMINATIVO'|'PESO COLOMBIANO'|"12000"				|"35" |'CUENTA DE AHORROS'| "1"  |'6000' |
 
 
  #QA-S459585
  @AperturaDepositoMonedaDolar
	Esquema del escenario: Apertura de un certificado de depósito Persona Natural_Vencimiento_Capitalización SI_moneda dólar
	Cuando realiza la busqueda de <cliente_persona_natural> por <entidad>, <tipo>, <buscar_por> y siguiente
	Y diligencia el formulario de Operación <producto>,<forma_pago>,<frecuencia>,<capitaliza>,<categoria>,<moneda>,<montoOperacion>,<plazo>
	Y diligencia el formulario de recepción de fondos <formaRecepcion> a "",<cuenta> con <monto> y guardar
	Entonces el Certificado de Depósito es creado desplegando la pantalla Detalle de la Operación en estado ING
	     Ejemplos:
  | cliente_persona_natural|entidad	 |tipo						 |buscar_por| producto 				| forma_pago	 |frecuencia|capitaliza|categoria 	|moneda |montoOperacion|plazo|formaRecepcion|cuenta|monto  |
  | '123456789'            |"Cliente"|"Persona Natural"|"Identificación"| 'CERTIFICADO VIP'| 'VENCIMIENTO'|  ""			| 'SI'		 |'NOMINATIVO'|'DOLAR'|"12000"			 |"35" |"CONTABLE"		|""			|"12000"|
  

	#QA-S461780
  @AperturaDepositoPersonaJuridica
  Esquema del escenario: Apertura de un certificado de depósito Persona Jurídica al Vencimiento 2 titulares(Indistinta)_Capitalizable NO_pesos
  Cuando realiza la busqueda de <cliente_persona_juridica> por <entidad>, <tipo1>, <buscar_por>
	Y nuevamente realiza la busqueda de <cliente_persona_natural> por <entidad>, <tipo2>, <buscar_por> tipo <tipo_cuenta> y siguente
	Y diligencia el formulario de Operación <producto>,<forma_pago>,<frecuencia>,<capitaliza>,<categoria>,<moneda>,<montoOperacion>,<plazo>
	Y diligencia el formulario de recepción de fondos <formaRecepcion> a "",<cuenta> con <monto> y guardar
	Entonces el Certificado de Depósito es creado desplegando la pantalla Detalle de la Operación en estado ING
	Ejemplos:
  | cliente_persona_juridica | cliente_persona_natural |entidad	 |tipo1						 |tipo2						 |buscar_por|tipo_cuenta| producto 				 | forma_pago	  |frecuencia|capitaliza|categoria 	 |moneda 					 |montoOperacion|plazo|formaRecepcion|cuenta|monto  |
  | 'BANCO' 	     					 | 'EVELIN'                |"Cliente"|"Persona Jurídica"|"Persona Natural"|"Nombre"	|"INDISTINTA"|'CERTIFICADO VIP'| 'VENCIMIENTO'|""				 |'NO'			|'NOMINATIVO'|'PESO COLOMBIANO'|"12000"				|"35" |"CONTABLE"		 |""		|"12000"|
  
  #QA-S461850
  @AperturaDepositoPersonaJuridicaPeriodico
  Esquema del escenario: Apertura de un certificado de depósito Persona Jurídica_ Periódico_1 titular(indistinta)_Pago mensual_Capitalizable SI_dólares (multimoneda)
	Cuando realiza la busqueda de <cliente_persona_juridica> por <entidad>, <tipo1>, <buscar_por>
	Y nuevamente realiza la busqueda de <codigo_persona> por <entidad>, <tipo2>, <buscar_por1> tipo <tipo_cuenta> y siguente
 	Y diligencia el formulario de Operación <producto>,<forma_pago>,<frecuencia>,<capitaliza>,<categoria>,<moneda>,<montoOperacion>,<plazo>
 	Y diligencia el formulario de recepción de fondos <formaRecepcion> a <cliente_persona_juridica>,<cuenta> con <monto> y guardar
	Entonces el Certificado de Depósito es creado desplegando la pantalla Detalle de la Operación en estado ING
	Ejemplos:
  | cliente_persona_juridica |codigo_persona|cliente_persona_natural  |entidad	 |tipo1						 	|tipo2				    |buscar_por|buscar_por1|tipo_cuenta |producto 				|forma_pago	|frecuencia|capitaliza| categoria 	|moneda |montoOperacion|plazo|formaRecepcion	  |cuenta	|monto |
  | 'BANCO COBIS' 	     		 |"25"				  |'JESSICA CHAVEZ QUINTANA'|"Cliente"|"Persona Jurídica"|"Persona Natural"|"Nombre"	 |"Código"	 |"INDISTINTA"|'CERTIFICADO VIP'|'PERIODICA'|'MENSUAL' |'SI'			| 'NOMINATIVO'|'DOLAR'|"12000"			 |"35"|'CUENTA DE AHORROS'|"1"|'12000' |

      
  #QA-S459614
  @AperturaDepositoTriCapPesos
	Esquema del escenario: Apertura de un certificado de depósito Persona Natural_Periódico_pago trimestral_Capitalización NO_moneda pesos
	Cuando realiza la busqueda de <cliente_persona_natural> por <entidad>, <tipo>, <buscar_por> y siguiente
	Y diligencia el formulario de Operación <producto>,<forma_pago>,<frecuencia>,<capitaliza>,<categoria>,<moneda>,<montoOperacion>,<plazo>
	Y diligencia el formulario de recepción de fondos <formaRecepcion> a "",<cuenta> con <monto> y siguiente
	Y diligencia formulario de forma de pago <formaRecepcionFP> a <nombre_beneficiario>,<cuenta> con <montoPago>
	Entonces el Certificado de Depósito es creado desplegando la pantalla Detalle de la Operación en estado ING
	Ejemplos:
  |cliente_persona_natural|producto 		     |entidad	 |tipo							|buscar_por			 |forma_pago |frecuencia  |capitaliza|categoria 	|moneda           |montoOperacion|plazo|formaRecepcion|formaRecepcionFP|cuenta|monto		|nombre_beneficiario|montoPago|
  | '1713115'  	     		  |'CERTIFICADO PYME'|"Cliente"|"Persona Natural"|"Identificación"|'PERIODICA'|'TRIMESTRAL'|'NO'			 |'NOMINATIVO'|'PESO COLOMBIANO'|"255000"			 |"40" |'CONTABLE'		|'CONTABLE'      |""		|"255000"|'Laura Chacon '     |'2283.67'|


  #QA-S459615
  @AperturaDepositoVencCB
	Esquema del escenario: Apertura de un certificado de depósito Persona Natural_Vencimiento_Capitalización SI_moneda pesos_ND a una Cta. Sin fondos
	Cuando realiza la busqueda de <cliente_persona_natural> por <entidad>, <tipo>, <buscar_por> y siguiente
	Y diligencia el formulario de Operación <producto>,<forma_pago>,<frecuencia>,<capitaliza>,<categoria>,<moneda>,<montoOperacion>,<plazo>
	Y diligencia el formulario de recepción de fondos <formaRecepcion> a <nombre_cliente>,<cuenta> con <monto> y siguiente
	Entonces se despliega el mensaje cuenta bloqueada contra retiro o debito
	Ejemplos:
  |cliente_persona_natural|entidad	 |tipo							|buscar_por			 |producto 		     |forma_pago   |frecuencia|capitaliza|categoria 	|moneda           |montoOperacion|plazo|formaRecepcion	   |nombre_cliente|cuenta|monto	  |
  |'1713115' 	     		    |"Cliente" |"Persona Natural"|"Identificación"|'CERTIFICADO PYME'|'VENCIMIENTO'|	""			|'SI'			 |'NOMINATIVO'|'PESO COLOMBIANO'| "255000"		 |"40" |'CUENTA DE AHORROS'|'Laura Chacon'|'2'   |"255000"|
 
  
  @AperturaDepositoVencND
	Esquema del escenario: Apertura de un certificado de depósito Persona Natural_Vencimiento_Capitalización SI_moneda pesos_ND a una Cta. Sin fondos
	Cuando realiza la busqueda de <cliente_persona_natural> por <entidad>, <tipo>, <buscar_por> y siguiente
	Y diligencia el formulario de Operación <producto>,<forma_pago>,<frecuencia>,<capitaliza>,<categoria>,<moneda>,<montoOperacion>,<plazo>
	Y diligencia el formulario de recepción de fondos <formaRecepcionFC> a <nombre_cliente>,<cuenta> con <monto> y guardar
	Entonces se despliega el mensaje No hay disponible en la cuenta
	Ejemplos:
  | cliente_persona_natural|entidad	 |tipo							|buscar_por			 |producto 				  | forma_pago	 |frecuencia|capitaliza|categoria  |moneda           |montoOperacion|plazo|formaRecepcionFC	  |  nombre_cliente|cuenta|monto|
  | '1713115'  	     		   |"Cliente"|"Persona Natural"|"Identificación"|'CERTIFICADO PYME'| 'VENCIMIENTO'|""				|'SI'			|'NOMINATIVO'|'PESO COLOMBIANO'| "255000"			|"40" |'CUENTA DE AHORROS'| 'Laura Chacon '|'1'   |"255000"|
 
 
 	 #QA-S459613
  @AperturaDepositoDosTitulares
  Esquema del escenario: Apertura de un certificado de depósito Persona Natural_Vencimiento_con 2 titulares_Capitaliza SI
  Cuando realiza la busqueda de <cliente_persona_natural1> por <entidad>, <tipo>, <buscar_por>
	Y nuevamente realiza la busqueda de <cliente_persona_natural2> por <entidad>, <tipo>, <buscar_por> tipo <tipo_cuenta> y siguente
	Y diligencia el formulario de Operación <producto>,<forma_pago>,<frecuencia>,<capitaliza>,<categoria>,<moneda>,<montoOperacion>,<plazo>
	Y diligencia el formulario de recepción de fondos <formaRecepcionFC> a "",<cuenta> con <monto> y guardar
	Entonces el Certificado de Depósito es creado desplegando la pantalla Detalle de la Operación en estado ING
	Ejemplos:
  | cliente_persona_natural1|cliente_persona_natural2|entidad	 |tipo							|buscar_por			 |tipo_cuenta |producto 				 |forma_pago	 |frecuencia|capitaliza|categoria 	| moneda          |montoOperacion|plazo|formaRecepcionFC|cuenta|monto|
  | '123456789' 	     	  	|'74489'                 |"Cliente"|"Persona Natural"|"Identificación"|'INDISTINTA'|'CERTIFICADO VIP'|'VENCIMIENTO'|""				|'SI'	  	 |'NOMINATIVO'|'PESO COLOMBIANO'|"12000"			 |"35" |"CONTABLE"			|""		 |"12000"|
  
  
  #QA-S462044 
  @AperturaDepositoPersonaJuridicaTrimestral
  Esquema del escenario: Apertura de un certificado de depósito Persona Jurídica_1 titular(indistinta)_Periódico_Pago trimestral_Capitalizable NO_Pesos
  Cuando realiza la busqueda de <cliente_persona_juridica> por <entidad>, "Persona Jurídica", "Nombre"
	Y nuevamente realiza la busqueda de <cliente_persona_natural> por <entidad>, "Persona Natural", "Identificación" tipo <tipo_cuenta> y siguente
  Y diligencia el formulario de Operación <producto>,<forma_pago>,<frecuencia>,<capitaliza>,<categoria>,<moneda>,<montoOperacion>,<plazo>
  Y diligencia el formulario de recepción de fondos <formaRecepcion> a "",<cuentaRecFond> con <montoRecFond> y siguiente
  Y diligencia formulario de forma de pago <formaRecepcionPago> a <cliente_persona_juridica>,<cuenta> con <montoPago>
	Entonces el Certificado de Depósito es creado desplegando la pantalla Detalle de la Operación en estado ING
  Ejemplos:
  | cliente_persona_juridica|cliente_persona_natural|entidad	|tipo_cuenta |producto 				|forma_pago	|frecuencia  |capitaliza|categoria 	 |moneda           |montoOperacion|plazo|formaRecepcion|cuentaRecFond|montoRecFond|formaRecepcionPago|cuenta|montoPago|
  | 'BANCO TE CREEMOS' 	   	|'123456789'            |"Cliente"|'INDISTINTA'|'CERTIFICADO VIP'|'PERIODICA'|'TRIMESTRAL'|'NO'			|'NOMINATIVO'|'PESO COLOMBIANO'|"12000"			  |"35" |"CONTABLE" 	 |"1"					 |"12000"			|"CONTABLE"				 |""		|"82.72"	 |
  
 
	#QA-S461814
 	@AperturaDepositoUnJuridicoDosNaturales
 	Esquema del escenario: Apertura de un certificado de depósito Persona Jurídica_ al Vencimiento_3 titulares(Conjunta)_Capitalizable SI_pesos
 	Cuando realiza la busqueda de <cliente_persona_juridica> por <entidad>, "Persona Jurídica", "Nombre"
	Y nuevamente realiza la busqueda de <cliente_persona_natural2> por <entidad>, "Persona Natural", "Identificación" tipo <tipo_cuenta>
	Y nuevamente realiza la busqueda de <cliente_persona_natural1> por <entidad>, "Persona Natural", "Identificación" tipo <tipo_cuenta> y siguente
	Y diligencia el formulario de Operación <producto>,<forma_pago>,<frecuencia>,<capitaliza>,<categoria>,<moneda>,<montoOperacion>,<plazo>
	Y diligencia el formulario de recepción de fondos <formaRecepcion> a "",<cuenta> con <monto> y guardar
	Entonces el Certificado de Depósito es creado desplegando la pantalla Detalle de la Operación en estado ING
	Ejemplos:
  | cliente_persona_juridica|cliente_persona_natural1|cliente_persona_natural2|entidad	|tipo_cuenta |producto 				|forma_pago	  |frecuencia  |capitaliza|categoria 		|     moneda      |montoOperacion|plazo|formaRecepcion|cuenta|monto  |
  | 'BANCO COBIS' 	     		|'123456789'             |'74489'         				|"Cliente"|'INDISTINTA'|'CERTIFICADO VIP'|'VENCIMIENTO'|"" 				 |'SI'			 |'NOMINATIVO'|'PESO COLOMBIANO'|"12000"			 |"35" |"CONTABLE"		|""		 |"12000"|

  #QA-S461814 Alternativo
 	@AperturaDepositoUnJuridicoDosNaturalesAlternativo
 	Esquema del escenario: Apertura de un certificado de depósito Persona Jurídica_ al Vencimiento_3 titulares(Conjunta)_Capitalizable SI_pesos_Alternativo
	Cuando realiza la busqueda de <cliente_persona_juridica> por <entidad>, <tipo1>, <buscar_por1>
	Y nuevamente realiza la busqueda de <cliente_persona_natural1> por <entidad>, <tipo2>, <buscar_por2> tipo <tipo_cuenta>
	Y nuevamente realiza la busqueda de <cliente_persona_natural2> por <entidad>, <tipo2>, <buscar_por2> tipo <tipo_cuenta> y siguente
	Y diligencia el formulario de Operación <producto>,<forma_pago>,<frecuencia>,<capitaliza>,<categoria>,<moneda>,<montoOperacion>,<plazo>
	Y diligencia el formulario de recepción de fondos <formaRecepcion> a "",<cuenta> con <monto> y guardar
	Entonces el Certificado de Depósito es creado desplegando la pantalla Detalle de la Operación en estado ING
	Ejemplos:
  | cliente_persona_juridica|cliente_persona_natural1|cliente_persona_natural2|entidad 	|tipo1             |tipo2						 |buscar_por1|buscar_por2     |cliente_persona_natural2|tipo2            |tipo_cuenta |producto 				|forma_pago	  |frecuencia |capitaliza|categoria 	|     moneda      |montoOperacion|plazo|formaRecepcion|cuenta|monto  | 
  | 'BANCO COBIS' 	     		|'123456789'             |'74489'         				|"Cliente"|"Persona Jurídica"|"Persona Natural"|"Nombre"   |"Identificación"|         '74489'        |"Persona Natural"|"INDISTINTA"|'CERTIFICADO VIP'|'VENCIMIENTO'|""				  |'SI'			 |'NOMINATIVO'|'PESO COLOMBIANO'|"12000"			 |"35" |"CONTABLE"		|""		 |"12000"|
  
 

  #QA-S462099
  @AperturaDepositoDosFormasPago
  Esquema del escenario: Apertura de un certificado de depósito para Persona Jurídica_con 1 titular(indistinta)_Periódico_con 2 formas de pago de interés
  Cuando realiza la busqueda de <cliente_persona_juridica> por <entidad>, <tipo1>, <buscar_por>
  Y nuevamente realiza la busqueda de <cliente_persona_natural> por <entidad>, <tipo2>, <buscar_por> tipo <tipo_cuenta> y siguente
	Y diligencia el formulario de Operación <producto>,<forma_pago>,<frecuencia>,<capitaliza>,<categoria>,<moneda>,<montoOperacion>,<plazo>
	Y diligencia el formulario de recepción de fondos <formaRecepcion> a "",<cuenta> con <montoRecFon> y siguiente
	Y diligencia formulario ingresando las dos formas de pago <formaRecepcion> y <formaRecepcion2> a <cliente_persona_juridica> y <cliente_persona_natural> con <monto>
	Entonces el Certificado de Depósito es creado desplegando la pantalla Detalle de la Operación en estado ING
	Ejemplos:
  |cliente_persona_juridica|cliente_persona_natural|entidad	 |tipo1						 	|tipo2						|buscar_por|tipo_cuenta |producto 				|forma_pago	|frecuencia|capitaliza|categoria 	 |moneda 					 |montoOperacion|plazo|formaRecepcion|cuenta|montoRecFon|formaRecepcion|formaRecepcion2|monto  |
  |'BANCO COBIS' 	   			 |'EVELIN PONCE MARTINEZ'|"Cliente"|"Persona Jurídica"|"Persona Natural"|"Nombre"	 |"INDISTINTA"|'CERTIFICADO VIP'|'PERIODICA'|'MENSUAL' |'NO'			|'NOMINATIVO'|'PESO COLOMBIANO'|"12000"			  |"35" |"CONTABLE"		 |""		|"12000"		|'CONTABLE'		 |'EFECTIVO' 		 |'10.75'|  