Feature: user should be able to login

  Background: Given the user is on the login page

  Scenario: Login as a user
    When the user enters information
    Then user should be able to login

  Scenario: Login with incorrect credentials
    When the user enters invalid "username" and valid "password"
    Then error message "Login and/or password are wrong." should be displayed


  Scenario: Login with incorrect credentials
    When the user enters invalid "password" and valid "username"
    Then error message "Login and/or password are wrong." should be displayed


  Scenario: Login with blank credentials
    When the user leaves "username" inputbox blank
    Then error message "Login and/or password are wrong." should be displayed


  Scenario: Login with blank credentials
    When the user leaves "password" inputbox blank
    Then error message "Login and/or password are wrong." should be displayed