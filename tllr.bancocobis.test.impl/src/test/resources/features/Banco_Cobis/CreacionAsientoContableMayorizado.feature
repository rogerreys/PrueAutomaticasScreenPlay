#language : es
#Author : lpaez@cobiscorp.com.co

Característica: Realizar la creación de asiento contable Mayorizado
  
	COMO usuario de la plataforma COBIS, usando filial, oficina y rol del módulo de contabilidad
	QUIERO crear un asiento contable mayorizado  
	PARA  evidenciar la creación correcta del asiento contable

Antecedentes:
  Dado que usuario:"admuser" realiza Login en COBIS con password:"Passw0rd2019*#" rol:"MENU POR PROCESOS" filial:"BANCO COBIS" oficina:"OFICINA MATRIZ" en la url:"http://www.demo1.cloud-cobiscorp.com/CWC/services/cobis/web/bank/views/commons/login.html"
  
  @featureCreacionAsientoContableMayorizado
  Esquema del escenario: Validaciones de campos y acciones obligatorias al crear un comprobante contable
  Dado que navega desde "Contabilidad>>Transacciones" hacia "Comprobantes Contables"
	Cuando se hace clic en el botón Guardar, se señala campos obligatorios
	Y se ingresa y selecciona los campos <fecha> y <descripcion> y <oficinaOrigen> y <areaOrigen> sección “Comprobante contables”
	Y se hace clic en el botón Guardar,se emite mensaje “No Ha ingresado Registros En la Grilla de Detalles”
	Y hace clic en el botón Nuevo
	Y realiza el ingreso en <cuenta> y <movimiento> y <oficina> y <area> y <concepto> y <valorMN>
	Y se hace clic en el botón Guardar, se emite mensaje “El comprobante no se encuentra cuadrado, Verifique por favor”
	Y se hace clic en el botón Limpiar, se muestra pantalla Comprobantes Contables
	Entonces se hace clic en el botón Guardar,se señala los campos obligatorios
	Ejemplos: 
	|fecha		 |descripcion|oficinaOrigen|areaOrigen|cuenta		|movimiento|oficina|area|concepto|valorMN|
	|'26122019'|'PRUEBA'	 |2						 |1					|'1311150'|'DEBITO'	 |2			 |1		|'PRUEBA'|'1230' |
	
	@featureCreacionAsientoContableMayorizado2
	Esquema del escenario: Crear un asiento contable mayorizado
	Dado que navega desde "Contabilidad>>Transacciones" hacia "Comprobantes Contables"
	Cuando se ingresa y selecciona los campos <fecha> y <descripcion> y <oficinaOrigen> y <areaOrigen> sección “Comprobante contables”
	Y selecciona Checkbox “Mayorizado”
	Y hace clic en el botón Nuevo
	Y realiza el ingreso en grilla de Cuenta Débito con valores en <cuenta> y <movimientoD> y <oficina> y <area> y <concepto> y <valorMN>
	Y hace clic en el botón Nuevo
	Y realiza el ingreso en grilla de Cuenta Crédito con valores en <cuenta> y <movimientoC> y <oficina> y <area> y <concepto> y <valorMN>
	Y se hace clic en el botón Guardar,se emite mensaje de “Operación realizada con éxito”
	Entonces en la sección Comprobante contables” se muestran los campos como no editables se carga la Cabecera de Comprobante Contable
	Ejemplos: 
	|fecha		 |descripcion|oficinaOrigen|areaOrigen|cuenta		|movimientoD|movimientoC|oficina|area|concepto|valorMN|
	|'26122019'|'PRUEBA'	 |2						 |1					|'1311150'|'DEBITO'	  |"CREDITO"	|2			|1	 |'PRUEBA'|'1230' |
	
	@featureCreacionAsientoContableMayorizado3
	Esquema del escenario: Crear un asiento contable Mayorizado-tipo
	Dado que navega desde "Contabilidad>>Transacciones" hacia "Comprobantes Contables"
	Cuando se selecciona “Comprobante Tipo”
	Y se carga los datos <comprobante> en sección “Comprobante contables” y “Detalle de Comprobante”
	Y selecciona Checkbox “Mayorizado”
  Y se hace clic en el botón Guardar,se emite mensaje de “Operación realizada con éxito”
	Entonces en la sección Comprobante contables” se muestran los campos como no editables se carga la Cabecera de Comprobante Contable
	Ejemplos: 
	|comprobante|
	|1					|
  