#Esta aplicacion es parte de los paquetes bancarios propiedad de COBISCORP.
#Su uso no autorizado queda expresamente prohibido asi como cualquier
#alteracion o agregado hecho por alguno de sus usuarios sin el debido
#consentimiento por escrito de COBISCORP.
#Este programa esta protegido por la ley de derechos de autor y por las
#convenciones internacionales de propiedad intelectual. Su uso no
#autorizado dara derecho a COBISCORP para obtener ordenes de secuestro
#o retencion y para perseguir penalmente a los autores de cualquier infraccion.

#language : es
#Author user@cobiscorp.com

Característica: Probar Banco Cobis
  
  Como usuario admuser de la plataforma COBIS
  Quiero realizar una prueba de Banco Cobis
  Para evidenciar en el sistema el correcto comportamiento de los componentos

  @feature
  Escenario: Ejemplo de pruebas con serenity
   #Dado que usuario realiza login en el sistema cobis
   #Cuando que navega desde "Pruebas Framework>>Aplicaciones" hacia "Banco Cobis"
   #Cuando busca al cliente
   #Entonces se valida que se muestre lo esperado