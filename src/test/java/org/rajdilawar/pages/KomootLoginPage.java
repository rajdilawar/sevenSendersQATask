package org.rajdilawar.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.rajdilawar.properties.Configuration;
import org.testng.Assert;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class KomootLoginPage {
    public KomootLoginPage(WebDriver driver){
        this.driver = driver;
    }
    WebDriver driver;


    By email = By.xpath("//input[@name=\"email\"]");
    By submitButton = By.xpath("//button[@type=\"submit\"]");
    By displayName = By.xpath("//input[@name=\"display_name\"]");
    By password = By.xpath("//input[@name=\"password\"]");
    By getSuccessMessage = By.xpath("//h1");
    By loginPageHeader = By.xpath("//h4");


    public void fillSignUpForm() throws IOException {
        Configuration configuration = new Configuration();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(email).sendKeys(configuration.email());
        driver.findElement(submitButton).click();
        driver.findElement(displayName).sendKeys(configuration.displayName());
        driver.findElement(password).sendKeys(configuration.password());
        driver.findElement(submitButton).click();
        getSuccessMessage();
    }

    public String getSuccessMessage () throws IOException {
        Configuration configuration = new Configuration();
        String pageTitleLoginPage = driver.findElement(getSuccessMessage).getText();
        System.out.println("Original Text is  : " + pageTitleLoginPage);
        Assert.assertEquals(configuration.displayName()+ "," + " your next adventure starts now!", pageTitleLoginPage);
        return pageTitleLoginPage;
    }

    public String loginPageHeader () {
        String pageTitleLoginPage = driver.findElement(loginPageHeader).getText();
        System.out.println("Text is  : " + pageTitleLoginPage);
        Assert.assertEquals( "Sign up or log in to continue", pageTitleLoginPage);
        return pageTitleLoginPage;
    }
}