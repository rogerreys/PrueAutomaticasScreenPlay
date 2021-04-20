#language : es
#Author : lpaez@cobiscorp.com.co

Característica: Realizar la actualización de comprobante contable
  
	COMO usuario de la plataforma COBIS, usando filial, oficina y rol del módulo de contabilidad
	QUIERO realizar la actualización de comprobante contable
	PARA  evidenciar la correcta actualización de un comprobante contable

Antecedentes:
  Dado que usuario:"admuser" realiza Login en COBIS con password:"Passw0rd2019*#" rol:"MENU POR PROCESOS" filial:"BANCO COBIS" oficina:"OFICINA MATRIZ" en la url:"http://www.demo1.cloud-cobiscorp.com/CWC/services/cobis/web/bank/views/commons/login.html"
  
  @featureActualizacionComprobanteContable
  Esquema del escenario: Realizar la actualización  de un comprobante contable
  Dado que navega desde "Contabilidad>>Transacciones" hacia "Comprobantes Contables"
	Cuando se hace clic en el botón Buscar se carga pantalla sección “Buscar Comprobante” 
	Y se ingresa campos <oficinaOrigen> y <areaOrigen>  en búsqueda de comprobante
	Y se hace clic en el botón Buscar Comprobantes, se muestra en la grilla todos los comprobantes contables
	Y se selecciona de la grilla <filaComprobante>, se carga vista “Comprobante Contable”
	Y se edita campos <descripcion> y <oOrigen> y <aOrigen>  en “Sección-Comprobante Contable” 
	Y se hace clic en el botón “Guardar”, se emite mensaje “Operación realizada con éxito”
	Y se selecciona de la grilla filaMDebito, se hace clic en el botón Eliminar y se acepta Eliminación 
	Y hace clic en Nuevo, realiza el ingreso en la grilla con <nuCuenta> y <nuMDebito> y <nuOOrigen> y <nuAOrigen> y <nuConcepto> y <nuValorMN>
	Y se selecciona de la grilla detalle filaMDebito, se hace clic en el botón Editar
	Y se edita campos <eCuenta> y <eOOrigen> y <eAOrigen> y <eValorMN>, se hace clic en Aceptar 
	Y se selecciona de la grilla detalle filaMCrédito, se hace clic en el botón Editar
	Y se edita los campos <eCuenta> y <eOOrigen> y <eAOrigen> y <eValorMN>, se hace clic en Aceptar 
	Y se hace clic en el botón “Guardar”, se emite mensaje “Operación realizada con éxito”
	Entonces se carga la Cabecera de Comprobante Contable 
	Ejemplos:
	|oficinaOrigen|areaOrigen|filaComprobante|descripcion			 |oOrigen|aOrigen|nuCuenta		|nuMDebito|nuOOrigen|nuAOrigen|nuConcepto|nuValorMN|eCuenta  |eOOrigen|eAOrigen|eValorMN|
	|3					|3				 |1							 |'DESCRIPCIONP'	 |2			 |3		   |'3105050' 	|'DEBITO' |2				|1			  |'PRUEBA'  |'100'    |'1311150'|2			  |3			 |'500'   |
