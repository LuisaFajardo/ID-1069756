#language: es
  Característica: Usar Carrito de Compras en el E-Commerce

    Escenario: Comprar productos en el E-commerce
      Dado que Juan agrega los tennis Nike al carrito
      Cuando realiza el chackout de su compra
      Entonces el deberia ver que su compra fue exitosa

#  Scenario: Buying products at E-Commerce
#    Given that Juan is login on SwagLabs app
#    When He put in the cart the Chamarra Sauce Labs
#    And He do the checkout of his purchase
#    Then He should see that his purchase is successful

#  Scenario: Buying differents products at SwagLabs
#    Given that Juan is login on SwagLabs app
#    When He puts in the cart the following products
#      | products                   |
#      | Chamarra Sauce Labs        |
#      | Camisa Sauce Labs Bolt     |
#      | Luz de bicicleta Sauce Labs |
#    And He do the checkout of his purchase
#    Then He should see the message CHECKOUT: COMPLETADO!