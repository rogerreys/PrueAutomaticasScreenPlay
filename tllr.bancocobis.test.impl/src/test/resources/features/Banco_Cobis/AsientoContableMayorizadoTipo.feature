#language : es
#Author : leonardo.paez@clearminds-it.com

Característica: Crear un asiento contable Mayorizado-tipo
  
	COMO usuario de la plataforma COBIS, usando filial, oficina y rol del módulo de contabilidad
	QUIERO crear un asiento contable mayorizado  
	PARA  evidenciar la creación correcta del asiento contable 

Antecedentes:
  Dado que usuario:"admuser" realiza Login en COBIS con password:"Passw0rd2019*#" rol:"MENU POR PROCESOS" filial:"BANCO COBIS" oficina:"OFICINA MATRIZ" en la url:"http://www.demo1.cloud-cobiscorp.com/CWC/services/cobis/web/bank/views/commons/login.html"

  @featureAsientoContableTipo
	Escenario: Realizar la creación de asiento contable  Mayorizado Tipo
  Dado que navega desde "Contabilidad>>Transacciones" hacia "Comprobantes Contables"
  Cuando se selecciona “Comprobante Tipo”
  Y se Carga los datos en sección “Comprobante contables” y “Detalle de Comprobante”
  Y selecciona Checkbox “Mayorizado”
  Y se hace clic en el botón Guardar
  Y se emite mensaje de "Operacion realizada con exito"
  Y en la sección “Comprobante contables” se muestran los campos como no editables
  Entonces se carga la Cabecera de Comprobante Contable Tipo
  

