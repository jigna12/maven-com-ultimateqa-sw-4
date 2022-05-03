package com.ultimateqa.courses.testsuite;

import com.ultimateqa.courses.pages.HomePage;
import com.ultimateqa.courses.pages.LoginPage;
import com.ultimateqa.courses.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginPageTest extends TestBase {
    HomePage homepage = new HomePage();
    LoginPage loginPage = new LoginPage();

    @Test
    public void verifyUserShouldNavigateToLoginPage(){
        homepage.clickOnSignInLink();

    }
    @Test
    public void verifyTheErrorMessage(){
        homepage.clickOnSignInLink();
        String expectedMessage = "Welcome Back!";
        String actualMessage = loginPage.getWelcomeText();
        Assert.assertEquals(expectedMessage, actualMessage, "Error message displayed");
        loginPage.enterEmailId("krish13@gmail.com");
        loginPage.enterPassword("Abc123");
        loginPage.clickOnLoginButton();
        String expectedErrorMessage = "Invalid email or password.";
        String actualErrorMessage = loginPage.getErrorMessage();
        Assert.assertEquals(expectedErrorMessage, actualErrorMessage, "Error message displayed");
    }
}

