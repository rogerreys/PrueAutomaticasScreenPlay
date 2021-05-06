#language : es
#Author : luis.escudero@clearminds-it.com

Característica: Comprobante Tipo
  
	COMO usuario de la plataforma COBIS, usando filial, oficina y rol del módulo de contabilidad
  QUIERO crear un asiento contable tipo
  PARA  evidenciar la creación correcta del asiento contable tipo

Antecedentes:
  Dado que usuario realiza login en el sistema cobis

@ValidacionesComprobanteTipo
Esquema del escenario: Realizar las validaciones de campos y acciones obligatorias al crear un comprobante tipo
Dado que navega desde "Contabilidad>>Transacciones" hacia "Comprobantes Tipo"
Cuando se hace clic en el botón Guardar Comprobante Tipo
Y se señala campos obligatorios de comprobante contable tipo
Y se ingresa y selecciona los campos obligatorios del comprobante  sección “Comprobante contables” 
Y se hace clic en el botón Guardar Comprobante Tipo
Y se emite mensaje “No Ha ingresado Registros En la Grilla de Detalles”
Y hace clic en el botón Nuevo, se habilita la edición en la grilla
Y hace clic en el botón Aceptar, se señala campos obligatorios en la Grilla de Detalle
Y hace clic en el botón Nuevo, realiza el ingreso en grilla de Cuenta Débito por un valor <X>
Y se hace clic en el botón Guardar Comprobante Tipo
Y se emite mensaje “El comprobante no se encuentra cuadrado, Verifique por favor”
Y se hace clic en el botón Cancelar
Y se muestra pantalla Comprobantes Tipo
Y se hace clic en el botón Guardar Comprobante Tipo
Entonces se señala campos obligatorios de comprobante contable tipo

 Ejemplos:
 	| X	 | 
  | "1580" |
@CrearAsientoContableNoModificable
Esquema del escenario: Crear un asiento contable tipo-no modificable
Dado que navega desde "Contabilidad>>Transacciones" hacia "Comprobantes Tipo"
Cuando se ingresa y selecciona los campos obligatorios del comprobante  sección “Comprobante contables”
Y selecciona Checkbox “Modificable”
Y hace clic en el botón Nuevo, realiza el ingreso en grilla de Cuenta Débito por un valor <X>
Y hace clic en el botón Nuevo, realiza el ingreso en grilla de Cuenta Crédito por un valor <X>
Y se hace clic en el botón Guardar
Y se emite mensaje de “Operación realizada con éxito”
Y en la sección “Comprobante contables “se muestran los campos como no editables
Entonces se carga la Cabecera de Comprobante Contable Tipo

 Ejemplos:
 	| X	 | 
  | "1580" |
