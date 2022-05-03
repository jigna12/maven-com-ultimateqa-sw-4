package com.ultimateqa.courses.pages;

import com.ultimateqa.courses.utility.Utility;
import org.openqa.selenium.By;

public class LoginPage extends Utility {
    By welcomeText = By.xpath("//h1[@class='page__heading']");//Verify the text ‘Welcome Back!
    By emailField = By.id("user[email]");//Enter invalid username
    By passwordField = By.name("user[password]");//Enter invalid password
    By loginButton = By.xpath("//input[@class='button button-primary g-recaptcha']");//Click on Login button
    By errorMessage = By.xpath("//li[@class='form-error__list-item']");//Verify the error message ‘Invalid email/password.


    public String getWelcomeText(){
        return getTextFromElement(welcomeText);
    }

    public void enterEmailId (String email){
        sendTextToElement(emailField, email);
    }
    public void enterPassword (String password){
        sendTextToElement(passwordField, password);
    }
    public void clickOnLoginButton(){
        clickOnElement(loginButton);
    }
    public String getErrorMessage(){
        return getTextFromElement(errorMessage);
    }

}
