package com.zerobank.pages;

import com.zerobank.utilities.Driver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public abstract class BasePage {


    @FindBy(css = "ul.nav.nav-tabs>li")
    public List<WebElement> menuOptions;

    @FindBy(id = "account_summary_tab")
    public WebElement accSummaryPageSubtitle;

    @FindBy(linkText = "Account Activity")
    public WebElement accActivity;

    @FindBy(linkText = "Transfer Funds")
    public WebElement transferFunds;

    @FindBy(linkText = "Pay Bills")
    public WebElement payBills;

    @FindBy(linkText = "My Money Map")
    public WebElement myMoneyMap;

    @FindBy(linkText = "Online Statements")
    public WebElement onlineStats;

    @FindBy(xpath = "///a[@class='dropdown-toggle'][2]")
    public WebElement user;

    @FindBy(xpath = "//a[@class='dropdown-toggle'][1]")
    public  WebElement settings;

    @FindBy(linkText = "Help")
    public WebElement helpButton;

    @FindBy(linkText = "Logout")
    public WebElement logout;

    @FindBy(id = "searchTerm")
    public WebElement searchBox;

    @FindBy(linkText = "Zero Bank")
    public WebElement zeroBankIcon;
    public BasePage(){
        PageFactory.initElements(Driver.get(),this);
    }

//dropown for Logout

    /**
     * Click Zero Bank icon and go to homepage
     */
   public void clickZeroBankIcon(){
       zeroBankIcon.click();
   }


    /**
     * Search box
     */

    public void searchBoxEnter(String searchableItem){
        searchBox.sendKeys(searchableItem+ Keys.ENTER);

    }

    /**
     * Click Help button and open Help page
     */

    public void getHelpPage(){

        settings.click();
        helpButton.click();
    }
    /**
     * Logout
     */

    public void logOut(){

      user.click();
      logout.click();
    }

    /**
     * navigate to tab...
     */

    public void navigateToModule(String tab){

        for (WebElement menuOption : menuOptions) {
           if(menuOption.getText().equals(tab))
                menuOption.click();
                return;
        }

    }
}
