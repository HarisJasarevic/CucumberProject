Feature: Login into account

  Scenario: Login into account with correct credentials
    Given User navigates to herokuapp website
    And User enters valid username
    And User enters valid password
    When User clicks on the login button
    Then User should be taken to welcome login page