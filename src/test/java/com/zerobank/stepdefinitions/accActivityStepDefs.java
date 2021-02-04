package com.zerobank.stepdefinitions;

import com.zerobank.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.lang.module.Configuration;

public class accActivityStepDefs {

    @Given("the user is logged in")
    public void the_user_is_logged_in() {
        System.out.println("User is on login page");
      //  String url = ConfigurationReader.get("url");



    }
    @When("the user clicks on Savings link on the Account Summary page")
    public void the_user_clicks_on_Savings_link_on_the_Account_Summary_page() {
        System.out.println("User clicks on Savings link");
    }

    @Then("the Account Activity page should be displayed")
    public void the_Account_Activity_page_should_be_displayed() {
        System.out.println("Account activity displayed");
    }

    @And("Account drop down should have Savings selected")
    public void account_drop_down_should_have_Savings_selected() {
        System.out.println("Savings selected");
    }
}
