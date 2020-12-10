#language: es
Característica: Usar Carrito de Compras en el E-Commerce
  Yo como Comprador
  Quiero agregar productos al carrito
  Para realizar la compra

  Esquema del escenario: Agregar productos en el carrito
    Dado que <nombre> agrega los siguientes productos al carrito
      | nombreProducto |
      | Tennis Nike    |
      | Camisa Talla L |
    Cuando realiza el checkput de su compra actualizando sus datos
      | nombre   | cedula   | direccion   | telefono   | metodoPago   |
      | <nombre> | <cedula> | <direccion> | <telefono> | <metodoPago> |
    Entonces el deberia ver que su compra fue exitosa
    Ejemplos:
      | nombre | cedula | direccion | telefono | metodoPago |
      | Juan   | 1088   | Medellin  | 322322   | Tarjeta    |
      | Lina   | 1087   | Bogota    | 422422   | Efectivo   |