package com.seleniumauto.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.bidi.log.Log;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginPage {

    static final String emailInput =  "//input[@id='inputEmail']";
    static final String passwordInput =  "//input[@id='inputPassword']";
    static final String loginButton =  "//button[@id='login']";
    static final String errorMessageLabel =  "//form[@class='login-form']//div[@class='alert alert-danger']";

    WebDriver driver;
    WebDriverWait wait;
    public LoginPage(WebDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(60));
        this.wait.pollingEvery(Duration.ofMillis(200));
    }

    public void login(String username, String password){

        driver.get("https://phptravels.org/login");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(emailInput)));
        driver.findElement(By.xpath(emailInput)).sendKeys(username);
        driver.findElement(By.xpath(passwordInput)).sendKeys(password);
        driver.findElement(By.xpath(loginButton)).click();
    }

    public String getErrorMessage(){
        return driver.findElement(By.xpath(errorMessageLabel)).getText();
    }

}
