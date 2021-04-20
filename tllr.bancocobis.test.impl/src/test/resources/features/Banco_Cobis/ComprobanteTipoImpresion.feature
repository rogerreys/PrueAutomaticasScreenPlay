#language : es
#Author : luis.escudero@clearminds-it.com

Característica: Comprobante Tipo Impresion
  
COMO usuario de la plataforma COBIS, usando filial, oficina y rol del módulo de contabilidad
QUIERO realizar una  impresión de comprobante tipo  
PARA  evidenciar la correcta impresión de acuerdo al comprobante buscado

Antecedentes:
  Dado que usuario:"admuser" realiza Login en COBIS con password:"Passw0rd2019*#" rol:"MENU POR PROCESOS" filial:"BANCO COBIS" oficina:"OFICINA MATRIZ" en la url:"http://www.demo1.cloud-cobiscorp.com/CWC/services/cobis/web/bank/views/commons/login.html"

@ImpresionComprobanteTipo
Esquema del escenario: Realizar las validaciones de campos y acciones obligatorias al crear un comprobante tipo
Dado que navega desde "Contabilidad>>Transacciones" hacia "Comprobantes Tipo"
Y  hace clic en No. Comprobante y seleccionar de pantalla   <Comprobante>,  se carga comprobante tipo 
Entonces se hace clic en el botón "Impirimir",se despliega pantalla "Reporte AsientoTipo"

Ejemplos:
|Comprobante|
|"5"|
