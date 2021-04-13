#language : es
#Author : leonardo.paez@clearminds-it.com

Característica: Validar la navegación en  la búsqueda  de un comprobante contable
  
	COMO usuario de la plataforma COBIS, usando filial, oficina y rol del módulo de contabilidad
	QUIERO realizar una impresión y búsqueda de comprobante contable
	PARA  evidenciar la correcta  impresión y búsqueda  de acuerdo con el criterio de búsqueda definido  

Antecedentes:
  Dado que usuario:"admuser" realiza Login en COBIS con password:"Passw0rd2019*#" rol:"MENU POR PROCESOS" filial:"BANCO COBIS" oficina:"OFICINA MATRIZ" en la url:"http://www.demo1.cloud-cobiscorp.com/CWC/services/cobis/web/bank/views/commons/login.html"

  @featureVerificacionBusquedaComprobanteContable
	Escenario: Validar la navegación en  la búsqueda  de un comprobante contable
  Dado que navega desde "Contabilidad>>Transacciones" hacia "Comprobantes Contables"
  Cuando se hace clic en el botón Buscar se carga pantalla sección “Buscar Comprobante”
	Y se hace clic en el botón Buscar Comprobantes
	Y se señala campos obligatorios de búsqueda de comprobante
	Y se selecciona los campos obligatorios en sección “Buscar Comprobante”
	Y se selecciona fecha inicial y fecha final
	Y se hace clic en el botón Buscar Comprobantes, se muestra en la grilla comprobantes contables
	Y se hace clic en el botón Volver, se carga pantalla “Comprobante Contable”
	Y se selecciona Comprobante desde y comprobante hasta
	Y se hace clic en el botón Limpiar
	Entonces se carga pantalla “Comprobante Contable”, inicial

	