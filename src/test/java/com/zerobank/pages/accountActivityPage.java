package com.zerobank.pages;

import com.zerobank.utilities.BrowserUtils;
import com.zerobank.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class accountActivityPage extends BasePage {

    public accountActivityPage() {
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(xpath = "//select[@name='accountId']")
    public WebElement dropDownElement;


    public String getFirst() {
//        WebDriverWait wait=new WebDriverWait(Driver.get(),10);
//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//select[@name='accountId']")));
        Select select = new Select(dropDownElement);
        dropDownElement.click();
        BrowserUtils.waitFor(3);
       return select.getFirstSelectedOption().getText();
        
    }
}
