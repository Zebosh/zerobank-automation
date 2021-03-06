
Feature: Navigating to specific accounts in Accounts Activity
  @savings
  Scenario: Savings account redirect
    Given the user is logged in
    When the user clicks on "Savings" link on the Account Summary page
    Then the Account Activity page should be displayed
    And Account drop down should have "Savings" selected

@brokerage
  Scenario: Savings account redirect
    Given the user is logged in
    When the user clicks on "Brokerage" link on the Account Summary page
    Then the Account Activity page should be displayed
    And Account drop down should have "Brokerage" selected

@checking
  Scenario: Savings account redirect
    Given the user is logged in
    When the user clicks on "Checking" link on the Account Summary page
    Then the Account Activity page should be displayed
    And Account drop down should have "Checking" selected

@credit_card
  Scenario: Savings account redirect
    Given the user is logged in
    When the user clicks on "Credit Card" link on the Account Summary page
    Then the Account Activity page should be displayed
    And Account drop down should have "Credit Card" selected

@loan
  Scenario: Savings account redirect
    Given the user is logged in
    When the user clicks on "Loan" link on the Account Summary page
    Then the Account Activity page should be displayed
    And Account drop down should have "Loan" selected


