#language : es
#Author : apena@cobiscorp.com.co

Característica: Probar Banco Cobis
  
  Como usuario de la plataforma COBIS
  Quiero realizar una prueba de banco cobis
  Para evidenciar en el sistema el correcto comportamiento de los componentos

@feature
Esquema del escenario: 
  Dado que usuario:<nombre> realiza Login en COBIS con password:<clave> rol:<rol> filial:<filial> oficina:<oficina> en la url:<url>
  Cuando que navega desde "Pruebas Framework>>Aplicaciones" hacia "Banco Cobis"
  
   Ejemplos:
 	| nombre	 | clave    | rol | filial | oficina | url |
  | "abucheli" | "11111111" | "COBIS DESIGNER CWC"| "BANCO COBIS" | "MATRIZ" | "http://192.168.67.220:8282/CWC/services/cobis/web/bank/views/home/container.html" |
  
  @feature
	Escenario: 
  Dado que usuario:"abucheli" realiza Login en COBIS con password:"11111111" rol:"COBIS DESIGNER CWC" filial:"BANCO COBIS" oficina:"MATRIZ" en la url:"http://192.168.67.220:8282/CWC/services/cobis/web/bank/views/home/container.html"
  Cuando que navega desde "Pruebas Framework>>Aplicaciones" hacia "Banco Cobis"
  
