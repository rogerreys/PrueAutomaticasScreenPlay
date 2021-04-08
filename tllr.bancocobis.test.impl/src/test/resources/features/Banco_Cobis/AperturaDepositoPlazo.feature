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
  Cuando abre la opcion cliente
  Y realiza la busqueda de un <cliente>
  Y realiza el registro de un nuevo DPF para un cliente 
  Entonces se debe mostrar la creacion de la Apertura al cliente previamente seleccionado
     Ejemplos:
  | cliente      | 
  | '123456789'  |  
