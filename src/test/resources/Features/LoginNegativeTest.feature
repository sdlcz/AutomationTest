Feature: Check saucedemo functionality with missing data

  Scenario: Verify saucedemo with an error message
    Given user is on swag login page
    When user skips username and login page
    And clicks on login
    Then error message is displayed
    And user enters username without a password
    Then the same error message is displayed
    And user enters a password without username
    Then same error message is displayed