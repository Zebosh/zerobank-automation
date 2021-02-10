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
    public WebElement passWord;

   @FindBy(name = "submit")
    public WebElement submit;

   @FindBy(css = ".alert.alert-error")
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
    passWord.sendKeys("password");
    submit.click();
    BrowserUtils.waitFor(1);
    warningMessage.click();
    warningPageLink.click();

}

     public void loginWithInvInfo(String username, String password){
        userName.sendKeys(username);
        passWord.sendKeys(password);
         submit.click();
         BrowserUtils.waitFor(1);

    }

public String getErrorMesage(){
    return  errorMessage.getText();
}
/**
 * Login with Invalid credentials
 * @param userNameStr
 *  @param passwordStr
 */


}

