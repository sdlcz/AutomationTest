Feature: Check saucedemo functionality

  Scenario: Verify saucedemo is working
    Given browser is open
    And user is on swag labs login page
    When user enters username and password
    And clicks on login button
    Then user is navigated to home page

  #Scenario Outline: Verify saucedemo is working
    #Given browser is open
    #And user is on swag labs login page
    #When user enters <username> and <password>
    #And clicks on login button
    #Then user is navigated to home page
    #
    #Examples:
    #| username | password |
    #| standard_user | secret_sauce
    #| locked_out_user | secret_sauce |
