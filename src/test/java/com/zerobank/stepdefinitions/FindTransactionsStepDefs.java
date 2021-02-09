package com.zerobank.stepdefinitions;

import com.zerobank.pages.accountSummaryPage;
import com.zerobank.pages.FindTransactionsPage;
import com.zerobank.utilities.BrowserUtils;
import com.zerobank.utilities.Driver;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FindTransactionsStepDefs {

    FindTransactionsPage findTransactionsPage = new FindTransactionsPage();

    @Given("the user accesses the Find Transactions tab")
    public void the_user_accesses_the_Find_Transactions_tab() {
        new accountSummaryPage().accountActivity.click();
        BrowserUtils.waitFor(1);
        findTransactionsPage.findTransactionsTab.click();
        BrowserUtils.waitFor(2);
    }

    @When("the user enters date range from {string} to {string}")
    public void the_user_enters_date_range_from_to(String string, String string2) {

        findTransactionsPage.enterDateRange(string, string2);
    }

    @And("clicks search")
    public void clicks_search() {

        findTransactionsPage.submitButton.click();
        BrowserUtils.waitFor(5);
    }

    @Then("results table should only show transactions dates between {string} to {string}")
    public void results_table_should_only_show_transactions_dates_between_to(String string, String string2) {

    }

//    @Then("the results should be sorted by most recent date")
//    public void the_results_should_be_sorted_by_most_recent_date() {
//
//    }


    @And("the results table should only not contain transactions dated {string}")
    public void the_results_table_should_only_not_contain_transactions_dated(String string) {

    }


    //search description scenario


    @When("the user enters description {string}")
    public void the_user_enters_description(String stringDescription) {


        findTransactionsPage.description.clear();
        findTransactionsPage.description.sendKeys(stringDescription);
        BrowserUtils.waitFor(3);

    }

    @Then("results table should only show descriptions containing {string}")
    public void results_table_should_only_show_descriptions_containing(String string) {


        System.out.println(findTransactionsPage.getTableElementsTexts().size());

        for (String tableElement : findTransactionsPage.getTableElementsTexts()) {

            Assert.assertTrue(tableElement.contains(string));

        }


    }

//    @But("results table should not show descriptions containing {string}")
//    public void results_table_should_not_show_descriptions_containing(String string) {
//
//        for (WebElement online :  findTransactionsPage.onlineDecsription ) {
//
//            Assert.assertTrue(online.getText().contains("OFFICE"));
//        }
//
//    }

    //Type Scenario

    @Then("results table should show at least one result under {string}")
    public void results_table_should_show_at_least_one_result_under(String string) {
        if (string.equals("Deposit")) {
            Assert.assertTrue(!BrowserUtils.getListofString(findTransactionsPage.depositDataContent).isEmpty());
        } else {
            Assert.assertTrue(!BrowserUtils.getListofString(findTransactionsPage.withdrawalDataContent).isEmpty());
        }

    }

    @When("user selects type {string}")
    public void user_selects_type_(String string) {

        findTransactionsPage.getTypedropDown(string);
        BrowserUtils.waitFor(2);
        WebDriverWait wait=new WebDriverWait(Driver.get(),20);


    }

    @Then("results table should show no result under {string}")
    public void results_table_should_show_no_result_under(String string) {

//        if (string.equals("Withdrawal")) {
//            for (WebElement element : findTransactionsPage.withdrawalDataContent) {
//                System.out.println(element.getText());
//                Assert.assertTrue(element.getText().isEmpty());
//            }
//
//
//        } else {
//            if (string.equals("Deposit")) {
//                for (WebElement element : findTransactionsPage.depositDataContent) {
//                    Assert.assertTrue(element.getText().isEmpty());
//                }
//
//            }
//        }

    }
}
