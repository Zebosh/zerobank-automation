package com.zerobank.stepdefinitions;


import com.zerobank.pages.BasePage;
import com.zerobank.pages.accountSummaryPage;
import com.zerobank.pages.payBillsPage;
import com.zerobank.utilities.BrowserUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

import java.util.HashMap;
import java.util.Map;

public class payBillsStepDefs {


    @Given("the user clicks on {string} page")
    public void the_user_clicks_on_page(String string) {
       new  accountSummaryPage().navigateToModule(string);
    }

    @Given("the user clicks on {string} link on the {string} page")
    public void the_user_clicks_on_link_on_the_page(String string, String string2) {
       new payBillsPage().addNewPayee.click();
       BrowserUtils.waitFor(2);
    }

    @Given("creates new payee using following information")
    public void creates_new_payee_using_following_information(Map<String,String>payeeInfoList) {

        new payBillsPage().insertPayeeInfo(payeeInfoList);
       new payBillsPage().addButton.click();

    }

    @Then("message {string} should be displayed")
    public void message_The_new_payee_was_successfully_created_should_be_displayed(String message) {
        new payBillsPage().verifySuccessMessage(message);


    }
}
