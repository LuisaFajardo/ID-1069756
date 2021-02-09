#language: es

Característica: Realizar Compras en Swaglabs App
  Yo como usuario
  Deseo añadir un producto al carrito
  Para realizar la compra de este.

  Escenario: Comprar productos en Swaglabs Exitoso
    Dado que Juan se encuentra en Swaglabs App
    Cuando El coloca en el carrito la Chamarra Sauce Labs
    Y El ingresa al carrito
    Entonces El deberia de ver su producto en el carrito

  Escenario: Comprar productos en Swaglabs Fallido
    Dado que Juan se encuentra en Swaglabs App
    Cuando El coloca en el carrito la Chamarra Sauce Labs
    Y El ingresa al carrito
    Entonces El deberia de ver un producto en el carrito