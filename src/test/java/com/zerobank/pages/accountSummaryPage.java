package com.zerobank.pages;

import com.zerobank.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class accountSummaryPage extends BasePage {

    public accountSummaryPage(){
        PageFactory.initElements(Driver.get(),this);
    }

    @FindBy(className = "board-header")
    public List<WebElement>accountTypes;

    @FindBy(xpath = "(//table)[3]/thead/tr/th")
    public List<WebElement>creditAccColumns;

    @FindBy(xpath = "(//tbody/tr/td/a)[1]")
    public WebElement savings;

    @FindBy(xpath = "(//tbody/tr/td/a)[3]")
    public WebElement brokerage;

    @FindBy(xpath = "(//tbody/tr/td/a)[4]")
    public WebElement checkingLink;

    @FindBy(xpath = "(//tbody/tr/td/a)[5]")
    public WebElement creditCard;

    @FindBy(xpath = "(//tbody/tr/td/a)[6]")
    public WebElement loan;

    @FindBy(xpath = "//tbody/tr/td/a")
    public List<WebElement>links;

    public void clickLink(String linkName){

        switch(linkName){
            case "Savings":savings.click();break;
            case "Brokerage":brokerage.click();break;
            case "Checking":checkingLink.click();break;
            case "Credit Card":creditCard.click();break;
            case "Loan":loan.click();break;


        }

    }
}
