package org.rajdilawar.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.SourceType;
import org.openqa.selenium.support.FindBy;
import org.rajdilawar.base.initTest;

import javax.swing.*;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class KomootShopPage {
    //creating constructor with driver object
    public KomootShopPage(WebDriver driver){
        this.driver = driver;
    }
    WebDriver driver;


    By shopButton = By.xpath("//a[@class=\"tw-inline-flex tw-justify-center tw-items-center c-btn c-btn--primary-inv\"]");
    By getPremiumButton = By.xpath("(//div[@class=\"css-1bgnsec\"][contains(text(),'Get Premium')])[2]");
   By acceptCookiesButton = By.xpath("//div[@class=\"css-1bgnsec\"][contains(text(),'Accept All')]");
    By verifyErrorText = By.xpath("(//div[@class=\"a-box-inner a-alert-container\"]/div[@class=\"a-alert-content\"])[2]");


    public void acceptCookies() {
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.findElement(acceptCookiesButton).click();
    }


    //action on objects click event
    public void clickOnGetPremiumButton() {
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.findElement(getPremiumButton).click();
    }


    public void moveToBottom() {
        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("window.scrollBy(0,250)");
        //driver.findElement(acceptCookiesButton).click();
    }

    public String verifyText() {
       String myText = driver.findElement(verifyErrorText).getText();
        System.out.println(myText);
        return myText;
    }

}