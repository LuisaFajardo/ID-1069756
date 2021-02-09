Feature: Use Shopping Cart

  Scenario: Buying products at SwagLabs
    Given that Juan is login on SwagLabs app
    When He put in the cart the Chamarra Sauce Labs
    And He do the checkout of his purchase
    Then He should see that his purchase is successful

  Scenario: Buying differents products at SwagLabs
    Given that Juan is login on SwagLabs app
    When He puts in the cart the following products
      | products                   |
      | Chamarra Sauce Labs        |
      | Camisa Sauce Labs Bolt     |
      | Luz de bicicleta Sauce Labs |
    And He do the checkout of his purchase
    Then He should see the message CHECKOUT: COMPLETADO!

