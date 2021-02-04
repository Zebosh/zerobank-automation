package com.zerobank.stepdefinitions;

import com.zerobank.pages.LoginPage;
import com.zerobank.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class loginStepDefs {

    @Given("the user is on the login page")
    public void the_user_is_on_the_login_page() {
        System.out.println("User is in login page");
    }

    @When("the user enters information")
    public void the_user_enters_information() {
        LoginPage loginPage=new LoginPage();
        loginPage.login();

    }

    @Then("user should be able to login")
    public void user_should_be_able_to_login() {
        String actualTitle=Driver.get().getTitle();
        Assert.assertEquals("Zero - Account Summary",actualTitle);

    }

}
