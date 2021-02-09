Feature: PurchaseForeignCurrency

  @wip
  Scenario: Available currencies
    Given the user is logged in
    And the user clicks on "Pay Bills" page
    And the user clicks on "Purchase Foreign Currency" link on the "Pay Bills" page
    Given the user accesses the Purchase foreign currency cash tab
    Then following currencies should be available

      | Australia (dollar)    |
      | Canada (dollar)       |
      | Switzerland (franc)   |
      | China (yuan)          |
      | Denmark (krone)       |
      | Eurozone (euro)       |
      | Great Britain (pound) |
      | Japan (yen)           |
      | Mexico (peso)         |
      | Norway (krone)        |
      | New Zealand (dollar)  |
      | Singapore (dollar)    |