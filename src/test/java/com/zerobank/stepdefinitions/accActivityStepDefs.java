package com.zerobank.stepdefinitions;

import com.zerobank.pages.LoginPage;
import com.zerobank.pages.accountSummaryPage;
import com.zerobank.pages.accountActivityPage;
import com.zerobank.utilities.BrowserUtils;
import com.zerobank.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.lang.module.Configuration;
import java.util.List;

public class accActivityStepDefs {
    accountActivityPage accountActivityPage=new accountActivityPage();

    @Given("the user is logged in")
    public void the_user_is_logged_in() {
       // System.out.println("User is on login page");

        LoginPage loginPage=new LoginPage();
        loginPage.login();

    }

    @When("the user clicks on {string} link on the Account Summary page")
    public void the_user_clicks_on_link_on_the_Account_Summary_page(String link) {

        accountSummaryPage accountSummaryPage=new accountSummaryPage();

        accountSummaryPage.clickLink(link);

    }

    @Then("the Account Activity page should be displayed")
    public void the_Account_Activity_page_should_be_displayed() {
       BrowserUtils.waitFor(1);
        String actualSubTitle=Driver.get().getTitle();
        Assert.assertEquals("Zero - Account Activity",actualSubTitle);

    }

    @And("Account drop down should have {string} selected")
    public void account_drop_down_should_have_selected(String string) {

       accountActivityPage accountActivityPage=new accountActivityPage();
       String actualSelected=accountActivityPage.getFirst();
        System.out.println(actualSelected);
       Assert.assertEquals(string,actualSelected);


    }
    @Then("Account drop down should have following options")
    public void account_drop_down_should_have_following_options(List<String>dropDownOptions) {

        List<String> actualdropDownElements = BrowserUtils.getElementsText(accountActivityPage.dropDownElements);

        Assert.assertEquals(dropDownOptions,actualdropDownElements);


    }

    @Then("the table should have following columns")
    public void the_table_should_have_following_columns(List<String> columnNames) {

        List<String> actualColumnNames = BrowserUtils.getElementsText(accountActivityPage.columnNames);
        System.out.println("actualColumnNames = " + actualColumnNames);
        Assert.assertEquals(columnNames,actualColumnNames);

    }

}
