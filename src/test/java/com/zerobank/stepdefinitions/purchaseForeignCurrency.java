package com.zerobank.stepdefinitions;

import com.zerobank.pages.payBillsPage;
import com.zerobank.utilities.BrowserUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

import java.util.List;

public class purchaseForeignCurrency {

    @Given("the user accesses the Purchase foreign currency cash tab")
    public void the_user_accesses_the_Purchase_foreign_currency_cash_tab() {
       new payBillsPage().purchaseForeignCurrency.click();
        BrowserUtils.waitFor(2);
    }

    @Then("following currencies should be available")
    public void following_currencies_should_be_available(List<String> dropDownOptions) {

        BrowserUtils.waitFor(3);
        List<String> actualOptions = BrowserUtils.getElementsText(new payBillsPage().getDropDownOptions());

        Assert.assertEquals(dropDownOptions,actualOptions);

        // this feature has a bug ---> that's why it is failed
    }

}
