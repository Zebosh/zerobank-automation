package com.zerobank.stepdefinitions;

import com.zerobank.pages.accountSummaryPage;
import com.zerobank.utilities.BrowserUtils;
import com.zerobank.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.List;

public class AccountSummaryStepDefs {

    accountSummaryPage accountSummaryPage=new accountSummaryPage();

    @When("the page should have the title {string}")
    public void the_page_should_have_the_title(String string) {
        String actualPageTitle = Driver.get().getTitle();
        String expectedPageTitle= "Zero - Account Summary";
        Assert.assertEquals(expectedPageTitle,actualPageTitle);
    }


    @Then("the user should see following account types")
    public void the_user_should_see_following_account_types(List<String> accountTypes) {

        List<String> actualAccountTypes = BrowserUtils.getElementsText(accountSummaryPage.accountTypes);

        System.out.println("accountTypes = " + accountTypes);
        System.out.println("actualAccountTypes = " + actualAccountTypes);
        Assert.assertEquals(accountTypes,actualAccountTypes);

    }

}
