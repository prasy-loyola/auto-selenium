package com.seleniumauto;

import com.seleniumauto.pages.LoginPage;
import com.seleniumauto.utils.DriverUtils;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class CreateBooking {

    @Test
    public void createBookingTest(){
        WebDriver driver = DriverUtils.getBrowser("chrome");
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("demo@demo.com", "demo");


    }
}
