#language : es
#Author : lpaez@cobiscorp.com.co

Característica: Validar la navegación en  la búsqueda  de un comprobante contable
  
	COMO usuario de la plataforma COBIS, usando filial, oficina y rol del módulo de contabilidad
	QUIERO realizar una impresión y búsqueda de comprobante contable
	PARA  evidenciar la correcta  impresión y búsqueda  de acuerdo con el criterio de búsqueda definido  

Antecedentes:
  Dado que usuario:"admuser" realiza Login en COBIS con password:"Passw0rd2019*#" rol:"MENU POR PROCESOS" filial:"BANCO COBIS" oficina:"OFICINA MATRIZ" en la url:"http://www.demo1.cloud-cobiscorp.com/CWC/services/cobis/web/bank/views/commons/login.html"

  @featureVerificacionBusquedaComprobanteContable1
	Esquema del escenario: Validar la navegación en  la búsqueda  de un comprobante contable
  Dado que navega desde "Contabilidad>>Transacciones" hacia "Comprobantes Contables"
  Cuando se hace clic en el botón Buscar se carga pantalla sección “Buscar Comprobante”
	Y se hace clic en el botón Buscar Comprobantes,se señala campos obligatorios de búsqueda de comprobante
	Y se ingresa campos <oficinaOrigen> y <areaOrigen>  de búsqueda de comprobante
	Y se selecciona <fechaInicial> y <fechaFinal>
	Y se hace clic en el botón Buscar Comprobantes, se muestra en la grilla comprobantes contables
	Y se hace clic en el botón Volver, se carga pantalla “Comprobante Contable”
	Y se hace clic en el botón Buscar se carga pantalla sección “Buscar Comprobante”
	Y se ingresa campos <oficinaOrigen> y <areaOrigen>  de búsqueda de comprobante
	Y se selecciona <comprobanteDesde> y <comprobanteHasta> para buscar por intervalo
	Y se hace clic en el botón Buscar Comprobantes, se muestra en la grilla comprobantes contables
	Y se hace clic en el botón Volver, se carga pantalla “Comprobante Contable”
	Y se selecciona los campos obligatorios en sección “Buscar Comprobante”
	Entonces se hace clic en el botón Limpiar, carga pantalla “Comprobante Contable” inicial
	Ejemplos: 
	|oficinaOrigen|areaOrigen|fechaInicial|fechaFinal|comprobanteDesde|comprobanteHasta|	
	|3						|1			 	 |'10122019'  |'31122019'|'1'							|'8'						 |	
		
	@featureVerificacionBusquedaComprobanteContable2
	Esquema del escenario: Realizar Búsqueda de un  comprobante contable
  Dado que navega desde "Contabilidad>>Transacciones" hacia "Comprobantes Contables"
  Cuando se hace clic en el botón Buscar se carga pantalla sección “Buscar Comprobante”
	Y se ingresa campos <oficinaOrigen> y <areaOrigen>  de búsqueda de comprobante
	Entonces se hace clic en el botón Buscar Comprobantes, se muestra en la grilla comprobantes contables
	Ejemplos: 
	|oficinaOrigen|areaOrigen|
	|3						|1			   |
	
	@featureVerificacionBusquedaComprobanteContable3
	Esquema del escenario: Realizar la búsqueda e impresión  de un comprobante contable
  Dado que navega desde "Contabilidad>>Transacciones" hacia "Comprobantes Contables"
  Cuando se hace clic en el botón Buscar se carga pantalla sección “Buscar Comprobante” 
  Y se ingresa campos <oficinaOrigen> y <areaOrigen>  de búsqueda de comprobante
  Y se hace clic en el botón Buscar Comprobantes, se muestra en la grilla comprobantes contables
  Y se selecciona de la grilla <comprobante>, se carga pantalla “Comprobante Contable”
	Entonces se hace clic en el botón Imprimir,se despliega “Reporte Planillas Contables”
	Ejemplos: 
	|oficinaOrigen|areaOrigen|comprobante|
	|3						|1			   |4					 |
	
	
	
	
	
	