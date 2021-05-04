#language: es
#Author: jmarchesini@cobiscorp.com

Característica: Busqueda de Deposito
	COMO usuario de la plataforma Cobis , usando filial , oficina y rol del modulo de DPF
	QUIERO activar un Certificado de Depósitos a Plazo
	PARA  evidenciar el cambio de estado de un Certificado de Depósito
	
Antecedentes: El usuario ingresa a cobis
	 Dado que usuario:"admuser" realiza Login en COBIS con password:"Passw0rd2019*#" rol:"MENU POR PROCESOS" filial:"BANCO COBIS" oficina:"OFICINA MATRIZ" en la url:"http://www.demo1.cloud-cobiscorp.com/CWC/services/cobis/web/bank/views/commons/login.html"
   Dado que navega desde "Depósitos a Plazo" hacia "Búsqueda de Depósitos"

   #QA-S471520
   @BloqueoDepositoUno
   Esquema del escenario:  Validar el correcto bloqueo del valor total de  un certificado de Depósito
	 Cuando se busca el certificado de depósito por <numero_de_operacion> con <numero>
	 Y se presiona el menú acciones, escoger la opción Bloqueos
	 Y se debe ingresar los datos en el formulario Bloqueo, presionar el botón Nuevo llenar los campos <motivo>, <observacion>, <monto>, <porcentaje>
	 Entonces se genera el bloqueo del Certificado de Depósito por el monto <porcentaje>
	  Ejemplos:
	 |numero_de_operacion  |    numero		 |   motivo    |   observacion   |   monto  |  porcentaje   |
	 |'Numero de operación'| '70100016243' | 'DETERIORO' | 'Text Bloqueo'  |  '7000'  |  "superior"   |  
	 
