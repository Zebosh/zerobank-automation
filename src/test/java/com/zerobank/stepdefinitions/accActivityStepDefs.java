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

public class accActivityStepDefs {

    @Given("the user is logged in")
    public void the_user_is_logged_in() {
       // System.out.println("User is on login page");

        LoginPage loginPage=new LoginPage();
        loginPage.login();

    }
    @When("the user clicks on Savings link on the Account Summary page")
    public void the_user_clicks_on_Savings_link_on_the_Account_Summary_page() {
       // System.out.println("User clicks on Savings link");

        accountSummaryPage accountSummaryPage=new accountSummaryPage();
        accountSummaryPage.savings.click();

    }

    @Then("the Account Activity page should be displayed")
    public void the_Account_Activity_page_should_be_displayed() {

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

    @When("the user clicks on Brokerage link on the Account Summary page")
    public void the_user_clicks_on_Brokerage_link_on_the_Account_Summary_page() {
        accountSummaryPage accountSummaryPage=new accountSummaryPage();
        accountSummaryPage.brokerage.click();

    }
    @When("the user clicks on Checking link on the Account Summary page")
    public void the_user_clicks_on_Checking_link_on_the_Account_Summary_page() {
        accountSummaryPage accountSummaryPage=new accountSummaryPage();
        accountSummaryPage.checkingLink.click();

    }


    @When("the user clicks on Credit Card link on the Account Summary page")
    public void the_user_clicks_on_Credit_Card_link_on_the_Account_Summary_page() {
        accountSummaryPage accountSummaryPage=new accountSummaryPage();
        accountSummaryPage.creditCard.click();
    }

    @When("the user clicks on Loan link on the Account Summary page")
    public void the_user_clicks_on_Loan_link_on_the_Account_Summary_page() {
        accountSummaryPage accountSummaryPage=new accountSummaryPage();
        accountSummaryPage.loan.click();

    }


}
