#language: es
Característica: Usar Carrito de Compras en el E-Commerce
  Yo como Comprador
  Quiero agregar productos al carrito
  Para realizar la compra

  Antecedentes: Usuario autenticado
    Dado que Juan se encuentra en el e-commerce
    Cuando ha seleccionado la categoria de productos

  Escenario: Agregar productos en el carrito
    Cuando agrega los siguientes productos al carrito
      | nombreProducto |
      | Tennis Nike    |
      | Camisa Talla L |
    Entonces el deberia ver el producto en el carrito

  Escenario: Agregar productos en el carrito de compras
    Cuando agrega los siguientes por titulo al carrito
      | tennis | Tennis Adidas    |
      | camisa | Camisa Talla XL |
    Entonces el deberia ver el producto en el carrito