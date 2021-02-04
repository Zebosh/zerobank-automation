package com.zerobank.pages;


import com.zerobank.utilities.BrowserUtils;
import com.zerobank.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class LoginPage {

public LoginPage(){

    PageFactory.initElements(Driver.get(),this);
}

   @FindBy(id = "signin_button")
    public WebElement signIn;

    @FindBy(id = "user_login")
    public WebElement userName;

   @FindBy(id = "user_password")
    public WebElement password;

   @FindBy(name = "submit")
    public WebElement submit;

   @FindBy(className = "alert alert-error")
   public WebElement errorMessage;

   @FindBy(id = "details-button")
   public WebElement warningMessage;

   @FindBy(id = "proceed-link")
   public WebElement warningPageLink;

    /**
     * Valid credentials
     *
     */

    public void login(){
   // signIn.click();
    userName.sendKeys("username");
    password.sendKeys("password");
    submit.click();
    BrowserUtils.waitFor(1);
    warningMessage.click();
    warningPageLink.click();



}
public String getErrorMesage(){
    return  errorMessage.getText();
}
/**
 * Login with Invalid credentials
 * @param userNameStr
 *  @param passwordStr
 */

public void loginInvalid(String userNameStr, String passwordStr){
    signIn.click();
    userName.sendKeys(userNameStr);
    password.sendKeys(passwordStr);
    submit.click();
    getErrorMesage();
}
}

