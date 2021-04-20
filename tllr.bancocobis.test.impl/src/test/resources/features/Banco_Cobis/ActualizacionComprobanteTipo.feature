#language : es
#Author : luis.escudero@clearminds-it.com

Característica: Comprobante Tipo Actualización
  
COMO usuario de la plataforma COBIS, usando filial, oficina y rol del módulo de contabilidad
QUIERO realizar la actualización de comprobante contable tipo 
PARA  evidenciar la correcta actualización de un comprobante contable tipo 

Antecedentes:
  Dado que usuario:"admuser" realiza Login en COBIS con password:"Passw0rd2019*#" rol:"MENU POR PROCESOS" filial:"BANCO COBIS" oficina:"OFICINA MATRIZ" en la url:"http://www.demo1.cloud-cobiscorp.com/CWC/services/cobis/web/bank/views/commons/login.html"

@ActualizacionComprobanteTipo
Esquema del escenario: Realizar la actualización  de un comprobante contable
Dado que navega desde "Contabilidad>>Transacciones" hacia "Comprobantes Tipo"
Cuando hace clic en No. Comprobante y seleccionar de pantalla   <Comprobante>,  se carga comprobante tipo
Y se edita campos <Descripción>  <OOrigen>  <AOrigen> en  Sección “Comprobante Contable”    Tipo
Y se hace clic en el botón “Guardar”, se emite mensaje “Operación realizada con éxito”  comprobante tipo
Y se selecciona de la grilla detalle tipo <M Débito>, se hace clic en el botón Eliminar y se acepta Eliminación 
Y hace clic en el botón Nuevo, realiza el ingreso grilla  detalle tipo  <Cuenta> <MDébito> <O Origen> <Concepto> <A Origen> <V MN>
Y se selecciona de la grilla detalle  tipo <M Débito>, se hace clic en el botón Editar
Y se edita campos detalle tipo   <Cuenta> <O Origen> , <A Origen> <Valor MN>, se hace clic en el botón Aceptar 
Y se selecciona de la grilla detalle  tipo <M Crédito>, se hace clic en el botón Editar
Y se edita campos detalle tipo   <Cuenta> <O Origen> , <A Origen> <Valor MN>, se hace clic en el botón Aceptar
Y se hace clic en el botón “Guardar”, se emite mensaje “Operación realizada con éxito”  comprobante tipo
Entonces se carga la Cabecera de Comprobante Contable Tipo 
Ejemplos:
|Comprobante| Descripción | OOrigen | AOrigen | M Débito |  Cuenta | MDébito | Concepto | V MN | A Origen | O Origen | Valor MN | M Crédito |
|"5"| "COMPROBANTE TIPO PRUEBA-EDITADO" | "2" | "1" | "DEBITO" | "1311150" | "DEBITO" | "PRUEBA EDICIÓN" | "1450" | "2" | "1002" | "1350" | "CREDITO" |
