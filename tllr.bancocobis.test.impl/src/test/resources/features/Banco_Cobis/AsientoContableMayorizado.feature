#language : es
#Author : leonardo.paez@clearminds-it.com

Característica: Realizar la creación de asiento contable  Mayorizado
  
	COMO usuario de la plataforma COBIS, usando filial, oficina y rol del módulo de contabilidad 
	QUIERO crear un asiento contable mayorizado   
	PARA  evidenciar la creación correcta del asiento contable 

Antecedentes:
  Dado que usuario:"admuser" realiza Login en COBIS con password:"Passw0rd2019*#" rol:"MENU POR PROCESOS" filial:"BANCO COBIS" oficina:"OFICINA MATRIZ" en la url:"http://www.demo1.cloud-cobiscorp.com/CWC/services/cobis/web/bank/views/commons/login.html"

  @featureAsientoContable
	Escenario: 
  Dado que navega desde "Contabilidad>>Transacciones" hacia "Comprobantes Contables"
  Cuando el ingresa y selecciona los valores
  Y realiza el ingreso en la grilla, registro de Cuenta Debito por un valor x
  Y realiza el ingreso en la grilla, registro de Cuenta Credito por un valor x
  Y se hace click en el boton guardar
  Entonces se emite mensaje de "Operacion realizada con exito"
