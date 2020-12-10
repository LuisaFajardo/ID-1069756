#language: es
  Característica: Usar Carrito de Compras en el E-Commerce
    Yo como Comprador
    Quiero agregar productos al carrito
    Para realizar la compra

    Antecedentes: Usuario autenticado
      Dado que Juan se encuentra en el e-commerce
      Cuando ha seleccionado la categoria de productos

    Escenario: Agregar tennis en el carrito
      Cuando agrega 1 tennis al carrito
      Entonces el deberia ver el producto en el carrito

    Escenario: Agregar camisas en el carrito
      Cuando agrega 1 camiseta al carrito
      Entonces el deberia ver el producto en el carrito