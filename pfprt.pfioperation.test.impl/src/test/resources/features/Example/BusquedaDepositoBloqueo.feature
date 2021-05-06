#language: es
#Author: jmarchesini@cobiscorp.com

Característica: Busqueda de Deposito
	COMO usuario de la plataforma Cobis , usando filial , oficina y rol del modulo de DPF
	QUIERO activar un Certificado de Depósitos a Plazo
	PARA  evidenciar el cambio de estado de un Certificado de Depósito
	
Antecedentes: El usuario ingresa a cobis
	 Dado que usuario realiza login en el sistema cobis
   Dado que navega desde "Depósitos a Plazo" hacia "Búsqueda de Depósitos"

   #QA-S471520
   @BloqueoDepositoUno
   Esquema del escenario:  Validar el correcto bloqueo del valor total de  un certificado de Depósito
	 Cuando se busca el certificado de depósito por <numero_de_operacion> con <numero>
	 Y se presiona el menú acciones, escoger la opción "Bloqueos"
	 Y se debe ingresar los datos en el formulario Bloqueo, presionar el botón Nuevo llenar los campos <motivo>, <observacion>, <monto>, <porcentaje>
	 Entonces se genera el bloqueo del Certificado de Depósito por el <montobloqueado> <porcentaje>
	  Ejemplos:
	 |numero_de_operacion  |    numero		 |     motivo                |    observacion     |   monto  |  porcentaje   | montobloqueado |
	 |'Numero de operación'| '70100016479' | 'DETERIORO'               | 'Bloqueo Total'    |  '7000'  |  "total"      |  "7,000.00"    |
	 |'Numero de operación'| '70100016484' | 'REQUERIMIENTO JUDICIAL'  | 'Bloqueo Parcial'  |  '7000'  |  "parcial"    |  "5,600.00"    |
	 |'Numero de operación'| '70100016290' | 'MIGRACION'               | 'Bloqueo Superior' |  '7000'  |  "superior"   |     ""         |  
	 
