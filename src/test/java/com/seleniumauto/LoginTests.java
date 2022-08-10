package com.seleniumauto;

import com.seleniumauto.pages.LoginPage;
import com.seleniumauto.utils.DriverUtils;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTests {


    @Test
    public void testLogin(){
        WebDriver driver = DriverUtils.getBrowser("chrome");
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("demo@demo.com", "demo");
        String errorMessage  = loginPage.getErrorMessage();
        Assert.assertEquals(errorMessage, "Please complete the captcha and try again.");
    }
}
