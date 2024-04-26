Feature: Check web registration page functionality

  Scenario: Verify registration page with incomplete data
    Given edge browser is open
    And user is on the registration page
    When user enters the email, first name, last name and education field
    And clicks on submit button
    Then an error message is displayed
