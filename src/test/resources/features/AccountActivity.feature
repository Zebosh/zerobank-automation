Feature: Account Activity page

  Background:
    Given the user is logged in
    When the user clicks on "Account Activity" tab on the Account Summary page

  Scenario: Page title
    Then the Account Activity page should be displayed


  Scenario: Dropdown elements
    Then Account drop down should have "Savings" selected
    And Account drop down should have following options
      | Savings     |
      | Checking    |
      | Loan        |
      | Credit Card |
      | Brokerage   |
# this feature has bug. Dropdown has actually 6 elements

  @wip
  Scenario: Transaction column names
    Then the table should have following columns
      | Date        |
      | Description |
      | Deposit     |
      | Withdrawal  |


