package com.zerobank.pages;

import com.zerobank.utilities.BrowserUtils;
import com.zerobank.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;

public class FindTransactionsPage extends BasePage {

    public FindTransactionsPage() {
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(xpath = "//a[.='Find Transactions']")
    public WebElement findTransactionsTab;

    @FindBy(id = "aa_description")
    public WebElement description;

    @FindBy(id = "aa_fromDate")
    public WebElement dateFrom;

    @FindBy(id = "aa_toDate")
    public WebElement toDate;

    @FindBy(css = "#aa_type")
    public WebElement transcationType;

    @FindBy(css = "button[type=submit]")
    public WebElement submitButton;

    @FindBy(linkText = "1")
    public WebElement day1;

    @FindBy(linkText = "6")
    public WebElement day6;

    @FindBy(xpath = "(//tbody)[2]/tr")
    public List<WebElement> tableRows;

    @FindBy(xpath = "(//tbody)[2]/tr/td[2]")
    public List<WebElement> tableRowElements;

    @FindBy(xpath = "(//tbody)[2]/tr/td[3]")
    public List<WebElement> depositDataContent;

    @FindBy(xpath = "(//tbody)[2]/tr/td[4]")
    public List<WebElement> withdrawalDataContent;


    public void enterDateRange(String fromDate, String DateTo) {

        dateFrom.clear();
        dateFrom.sendKeys(fromDate);
        day1.click();
        toDate.clear();
        toDate.sendKeys(DateTo);
        day6.click();

    }

    public List<String> getTableElementsTexts() {
        return BrowserUtils.getElementsText(tableRowElements);
    }

    public void getTypedropDown(String type){
        Select select=new Select(transcationType);
        switch(type){
            case "Deposit":
                select.selectByValue("DEPOSIT");

            case "Withdrawal":
                select.selectByValue("WITHDRAWAL");
        }


    }
}
