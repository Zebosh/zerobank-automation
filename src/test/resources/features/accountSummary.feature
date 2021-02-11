Feature: Account Summary page

  Scenario: the user should see menu options
    Given the user is logged in
    When the page should have the title "Zero - Account Summary"
    Then the user should see following account types
      | Cash Accounts       |
      | Investment Accounts |
      | Credit Accounts     |
      | Loan Accounts       |


