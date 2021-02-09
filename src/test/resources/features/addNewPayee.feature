Feature: Add new payee under pay bills

  Scenario: Add a new payee
    Given the user is logged in
    And the user clicks on "Pay Bills" page
    And the user clicks on "Add New Payee" link on the "Pay Bills" page
    And creates new payee using following information
      | Payee Name    | The Law Offices of Hyde, Price & Scharks |
      | Payee Address | 100 Samest,Anytown,USA,10001          |
      | Account       | Checking                                 |
      | Payee details | XYZaccount                              |

    Then message "The new payee The Law Offices of Hyde, Price & Scharks was successfully created." should be displayed