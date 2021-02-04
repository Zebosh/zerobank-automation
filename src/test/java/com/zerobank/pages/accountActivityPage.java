package com.zerobank.pages;

import com.zerobank.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class accountActivityPage extends BasePage {

   public  accountActivityPage(){
       PageFactory.initElements(Driver.get(),this);
   }
   @FindBy(id = "accountId")
    public WebElement dropDownElement;






   public String getDropDownOption(){

       Select select=new Select(dropDownElement);

       return select.getFirstSelectedOption().getText();
       }

   }

