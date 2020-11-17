Feature: Search Apps Capabilities


  Scenario: Check capabilities of an installed app
    Given that Juan wants to consult an app capabilities
    When He searchs for APKPure app
    Then He should see all the features of APKPure

  Scenario: Check capabilities of system app
    Given that Juan wants to consult an app capabilities
    When He searchs for WebView app
    Then He should see the features of WebView
