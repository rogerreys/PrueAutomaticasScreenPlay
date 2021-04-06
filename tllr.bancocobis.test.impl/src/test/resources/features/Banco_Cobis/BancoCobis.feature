#language : es
#Author : jrosales@cobiscorp.com.co

Característica: Probar componentes Banco Cobis
  
  Como usuario de la plataforma COBIS
  Quiero realizar una prueba del modulo banco cobis
  Para evidenciar en el sistema el correcto comportamiento de los componentes

Antecedentes:
  Dado que usuario:"abucheli" realiza Login en COBIS con password:"11111111" rol:"COBIS DESIGNER CWC" filial:"BANCO COBIS" oficina:"MATRIZ" en la url:"http://192.168.67.220:8282/CWC/services/cobis/web/bank/views/home/container.html"

  @Elements
	Escenario: 
  Dado que navega desde "Pruebas Framework>>Aplicaciones" hacia "Banco Cobis"
  Cuando busca al cliente
  Y ingresa valores generales y laborales
  Y ingresa datos financieros
  Y ingresa datos de tarjeta de credito
  Entonces se valida que se muestre lo esperado