#language: es
  Característica: Usar Carrito de Compras en el E-Commerce
    Yo como comprador
    Quiero agregar productos al carrito
    Para realizar una compra

    Escenario: Comprar productos en el E-commerce
      Dado que Juan agrega los tennis Nike al carrito
      Cuando realiza el pago de su compra actualizando su informacion
        | nombre     | Juan                 |
        | correo     | juan@gmail.com       |
        | telefono   | 323323323            |
        | direccion  | Medellin             |
        | comentario | entrega en domicilio |
      Entonces el deberia ver que su compra fue exitosa