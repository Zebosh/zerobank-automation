package com.zerobank.stepdefinitions;

import com.zerobank.pages.payBillsPage;
import com.zerobank.utilities.BrowserUtils;
import com.zerobank.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Alert;

import java.util.List;

public class purchaseForeignCurrency {

    payBillsPage payBillsPage=new payBillsPage();

    @Given("the user accesses the Purchase foreign currency cash tab")
    public void the_user_accesses_the_Purchase_foreign_currency_cash_tab() {
        payBillsPage.purchaseForeignCurrency.click();
        BrowserUtils.waitFor(2);
    }

    @Then("following currencies should be available")
    public void following_currencies_should_be_available(List<String> dropDownOptions) {

        BrowserUtils.waitFor(3);
        List<String> actualOptions = BrowserUtils.getElementsText(new payBillsPage().getDropDownOptions());

        Assert.assertEquals(dropDownOptions,actualOptions);

        // this feature has a bug ---> that's why it is failed
    }

    @When("user tries to calculate cost without selecting a currency")
    public void user_tries_to_calculate_cost_without_selecting_a_currency() {
     payBillsPage.amountInputBox.sendKeys("100");
     payBillsPage.calculateCostsButton.click();


    }

    @Then("error message should be displayed")
    public void error_message_should_be_displayed() {

        Alert alert=Driver.get().switchTo().alert();

        String actualErrorMessage = alert.getText();
        String expectedErrorMessage="Please, ensure that you have filled all the required fields with valid values.";

        Assert.assertEquals(expectedErrorMessage,actualErrorMessage);
    }

    @When("user tries to calculate cost without entering a value")
    public void user_tries_to_calculate_cost_without_entering_a_value() {

        payBillsPage.getDropDownOptions().get(1).click();

        payBillsPage.calculateCostsButton.click();
    }

}
