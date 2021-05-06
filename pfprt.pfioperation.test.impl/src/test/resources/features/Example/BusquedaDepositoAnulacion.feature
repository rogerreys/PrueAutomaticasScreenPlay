#language: es
#Author: jmarchesini@cobiscorp.com

Característica: Busqueda de Deposito
	COMO usuario de la plataforma Cobis , usando filial , oficina y rol del modulo de DPF
	QUIERO activar un Certificado de Depósitos a Plazo
	PARA  evidenciar el cambio de estado de un Certificado de Depósito
	
Antecedentes: El usuario ingresa a cobis
	 Dado que usuario realiza login en el sistema cobis
   Dado que navega desde "Depósitos a Plazo" hacia "Búsqueda de Depósitos"

   
   #QA-S467398
	 @AnulacionCertificado
	 Esquema del escenario: Verificar la anulación de un Certificado de Depósito al Vencimiento
	 Cuando se busca el certificado de depósito por <numero_de_operacion> con <numero>
	 Y se presiona el menú acciones, escoger la opción Anulación
   Y se ingresa una Observación en la pantalla Anular <observacion>
   Entonces el Certificado de Depósito es anulado, cambiando el estado en la pantalla Datos de Certificado a <estado>
   Ejemplos:
   |    numero_de_operacion   |  numero       |     observacion       |	estado  |
   |   'Numero de operación'  | '70100016065' | "ANULAR VENCIMIENTO"  |	"ANU"   |			
   |   'Numero de operación'  | '70100016070' | "ANULAR PERIODICO"    | "ANU"   |