#language : es
#Author : lpaez@cobiscorp.com.co

Característica: Ingreso,Edición,Eliminación de Cotizaciones de acuerdo a la moneda
  
	COMO usuario de la plataforma COBIS, usando filial, oficina y rol del módulo de contabilidad
	QUIERO realizar el ingreso, edición y elminación de cotozaciones de acuerdo a la moneda 
	PARA evidenciar el correcto funcionamiento

Antecedentes:
  Dado que usuario:"admuser" realiza Login en COBIS con password:"Passw0rd2019*#" rol:"MENU POR PROCESOS" filial:"BANCO COBIS" oficina:"OFICINA MATRIZ" en la url:"https://www.stg.web.product.cobiscloud.com/CWC/services/cobis/web/bank/views/commons/login.html?logout=success"
  
  @featureActualizacionCotizacionMoneda
  Esquema del escenario: Búsqueda de Cotizaciones 
	Dado que navega desde "Contabilidad>>Transacciones" hacia "Cotizaciones"
	Cuando selecciona en el Listado de Moneda  <moneda> 
	Y hace clic en el botón Buscar, se despliega en la grilla cotizaciones 
	Y selecciona check de  Busqueda Avanzada , se despliega busqueda avanzada cotizaciones 
	Y se selecciona Fechas de búsqueda <Fecha Inicial> y <Fecha Final> en cotizaciones
	Entonces se hace clic en el botón Buscar, se despliega en la grilla cotizaciones 
	Ejemplos:
	|Fecha Inicial	|Fecha Final	|moneda|
	|'16102020'   	|'26102020' 	|1		 |
	
	@featureActualizacionCotizacionMoneda2
  Esquema del escenario: Visualización de Gráfico de fluctaciones 
	Dado que navega desde "Contabilidad>>Transacciones" hacia "Cotizaciones"
	Cuando selecciona en el Listado de Moneda  <moneda> 
	Y hace clic en el botón Buscar, se despliega en la grilla cotizaciones 
	Y se hace clic en el botón de Gráfico Fluctaciones, se despliega Grafico con las cotizaciones
	Y se hace clic en el Botón Lupa, se presenta pantalla de Cotizaciones 
	Entonces se hace clic en Cabecera se deliega cabecera 
	Ejemplos:
	|moneda|
	|1		 |
	
	@featureActualizacionCotizacionMoneda3
  Esquema del escenario: Actualización  de cotizaciones 
  Dado que navega desde "Contabilidad>>Transacciones" hacia "Cotizaciones"  
	Cuando selecciona en el Listado de Moneda  <moneda> 
	Y hace clic en el botón Buscar, se despliega en la grilla cotizaciones
	Y hace clic en botón Nuevo, se ingresa <nuFecha> y <nuValor Compra> y <nuValor Venta> y <nuCotización Banco> mensaje de ingreso de Cotización
	Y se selecciona de la grilla, se hace clic en el botón Eliminar y se acepta Eliminación, mensaje de Eliminación
	Y se edita <eValor Compra> y <eValor Venta> y <eCotización Banco>, mensaje de edición de Cotización
	Entonces se hace clic en Cabecera se deliega cabecera 
	Ejemplos:
	|moneda|nuFecha		|nuValor Compra|nuValor Venta|nuCotización Banco|eValor Compra|eValor Venta|eCotización Banco|
	|1		 |'13022020'|'8000'				 |'8000'			 |'8000'						|'1000'			 |'1000'			 |'1000'					 |	
