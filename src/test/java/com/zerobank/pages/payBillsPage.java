package com.zerobank.pages;

import com.zerobank.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.Map;

public class payBillsPage extends BasePage {

    public payBillsPage(){
        PageFactory.initElements(Driver.get(),this);
    }

    @FindBy(linkText = "Add New Payee")
    public WebElement addNewPayee;

    @FindBy(id = "np_new_payee_name")
    public WebElement payeeName;

    @FindBy(id = "np_new_payee_address")
    public WebElement payeeAddress;

    @FindBy(id = "np_new_payee_account")
    public WebElement payeeAccount;

    @FindBy(id = "np_new_payee_details")
    public WebElement payeeDetails;


    @FindBy(id = "add_new_payee")
    public WebElement addButton;


    @FindBy(id = "alert_content")
    public WebElement alertMessage;

    public  void insertPayeeInfo(Map<String,String> payeeInfoList){
      payeeName.sendKeys(payeeInfoList.get("Payee Name"));
      payeeAddress.sendKeys(payeeInfoList.get("Payee Address"));
      payeeAccount.sendKeys(payeeInfoList.get("Account"));
      payeeDetails.sendKeys(payeeInfoList.get("Payee details"));

    }

    public void verifySuccessMessage(String expectedMessage){
        Assert.assertTrue(alertMessage.isDisplayed());
        Assert.assertEquals(expectedMessage,alertMessage.getText());
    }

}
