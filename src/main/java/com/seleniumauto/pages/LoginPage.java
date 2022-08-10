package com.seleniumauto.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.bidi.log.Log;

public class LoginPage {

    static final String emailInput =  "//input[@id='inputEmail']";
    static final String passwordInput =  "//input[@id='inputPassword']";
    static final String loginButton =  "//button[@id='login']";
    static final String errorMessageLabel =  "//form[@class='login-form']//div[@class='alert alert-danger']";

    WebDriver driver;
    public LoginPage(WebDriver driver){
        this.driver = driver;
    }

    public void login(String username, String password){

        driver.get("https://phptravels.org/login");
        driver.findElement(By.xpath(emailInput)).sendKeys(username);
        driver.findElement(By.xpath(passwordInput)).sendKeys(password);
        driver.findElement(By.xpath(loginButton)).click();
    }

    public String getErrorMessage(){
        return driver.findElement(By.xpath(errorMessageLabel)).getText();
    }

}
