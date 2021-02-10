package com.zerobank.stepdefinitions;

import com.zerobank.pages.LoginPage;
import com.zerobank.utilities.BrowserUtils;
import com.zerobank.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class loginStepDefs {

    LoginPage loginPage=new LoginPage();

    @Given("the user is on the login page")
    public void the_user_is_on_the_login_page() {

        System.out.println("User is in login page");
    }

    @When("the user enters information")
    public void the_user_enters_information() {

        loginPage.login();

    }

    @Then("user should be able to login")
    public void user_should_be_able_to_login() {
        String actualTitle=Driver.get().getTitle();
        Assert.assertEquals("Zero - Account Summary",actualTitle);

    }

    @When("the user enters invalid {string} and valid {string}")
    public void the_user_enters_invalid_and_valid(String string, String string2) {
     if(string.equals("username")){
         loginPage.loginWithInvInfo("abcd", string2);
         BrowserUtils.waitForPageToLoad(3);
     }else if(string.equals("password")){
         loginPage.loginWithInvInfo(string,"qwerty");
     }
    }

    @Then("error message {string} should be displayed")
    public void error_message_should_be_displayed(String string) {

       Assert.assertEquals(string,loginPage.errorMessage.getText());
       Assert.assertTrue(loginPage.errorMessage.isDisplayed());

    }
    @When("the user leaves {string} inputbox blank")
    public void the_user_leaves_inputbox_blank(String string) {

        if(string.equals("username")){
            loginPage.loginWithInvInfo("","password");
        }else{
            loginPage.loginWithInvInfo("username","");
        }

    }




}
