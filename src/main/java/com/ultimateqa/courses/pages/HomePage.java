package com.ultimateqa.courses.pages;

import com.ultimateqa.courses.utility.Utility;
import org.openqa.selenium.By;

public class HomePage extends Utility {
    By signInLink = By.xpath("//li[@class='header__nav-item header__nav-sign-in']");// click on the ‘Sign In’ link

    public void clickOnSignInLink(){
        clickOnElement(signInLink);
    }


}
