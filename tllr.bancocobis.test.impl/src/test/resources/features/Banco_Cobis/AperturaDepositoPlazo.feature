#language : es
#Author : jmarchesini@cobiscorp.com.co

Característica: Crear Apertura Deposito a Plazo
  
  Como usuario de la plataforma COBIS
  Quiero realizar una apertura de deposito a Plazo a un cliente
  Para evidenciar en el sistema la correspondiente creación de la apertura del cliente asociado

 

Antecedentes: El usuario ingresa a cobis
    Dado que usuario:"admuser" realiza Login en COBIS con password:"Passw0rd2019*#" rol:"MENU POR PROCESOS" filial:"BANCO COBIS" oficina:"OFICINA MATRIZ" en la url:"http://www.demo1.cloud-cobiscorp.com/CWC/services/cobis/web/bank/views/commons/login.html"
    Dado que navega desde "Depósitos a Plazo" hacia "Apertura"
 

  @AperturaDeposito
  Esquema del escenario: El usuario crea una Apertura Deposito a Plazo
  Cuando realiza la busqueda de un <cliente_persona_natural>
  Y diligencia el formulario de Operación
	Y diligencia el formulario de recepción de fondos
  Entonces el Certificado de Depósito es creado desplegando la pantalla Detalle de la Operación en estado ING
     Ejemplos:
  | cliente_persona_natural | 
  | '123456789'  |  
  
  
  @AperturaDepositoDos
  Esquema del escenario: Apertura de un certificado de depósito Persona Natural_Periódico_pago mensual_Capitalizacion NO_con 2 titulares
  Y realiza la busqueda de <cliente_persona_natural1>
  Y nuevamente realiza la busqueda de un <cliente_persona_natural2> tipo conjunta
  Y diligencia el formulario de Operación
  Y diligencia el formulario de recepción de fondos
  Y diligencia el formulario formas de pago
	Entonces el Certificado de Depósito es creado desplegando la pantalla Detalle de la Operación en estado ING
	Ejemplos:
  | cliente_persona_natural1 | cliente_persona_natural2 |
  | '123456789' 	     | '74489'                  |

 
  @AperturaDepositoTres
	Esquema del escenario: Apertura de un certificado de depósito Persona Natural_Vencimiento_Capitaliza SI_2 formas de recepción
	Y realiza la busqueda por nombre de <cliente_persona_natural>
	Y nuevamente realiza la busqueda por nombre de un <cliente_persona_natural1> tipo indistinta
	Y diligencia el formulario de Operación con capitaliza
	Y diligencia el formulario de recepción de fondos agregar las 2 formas de pago
	Entonces el Certificado de Depósito es creado desplegando la pantalla Detalle de la Operación en estado ING
	Ejemplos:
  | cliente_persona_natural | cliente_persona_natural1 |
  | 'ITALIA' 	     					| 'EVELIN'               	 |
 
 
  @AperturaDepositoMonedaDolar
	Esquema del escenario: Apertura de un certificado de depósito Persona Natural_Vencimiento_Capitalización SI_moneda dólar
	Y realiza la busqueda de un solo <cliente_persona_natural>
	Y diligencia el formulario de Operación con moneda dolar
	Y diligencia el formulario formas de pago
	Entonces el Certificado de Depósito es creado desplegando la pantalla Detalle de la Operación en estado ING
	     Ejemplos:
  | cliente_persona_natural      | 
  | '123456789'                  | 
  
  