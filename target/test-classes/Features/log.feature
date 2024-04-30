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

    #
      #Scenario Outline: Title of your scenario outline
    #Given I want to write a step with <name>
    #When I check for the <value> in step
    #Then I verify the <status> in step
#
    #Examples: 
      #| name  | value | status  |
      #| name1 |     5 | success |
      #| name2 |     7 | Fail    |