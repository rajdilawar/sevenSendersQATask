package org.rajdilawar.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

public class KomootHomePage {
    public KomootHomePage(WebDriver driver) {this.driver = driver; }
    WebDriver driver;


    By welcomeTextEN = By.xpath("//h3[contains(text(),'Say Hello To Your Next Adventure')]");
    By welcomeTextDE = By.xpath("//h3[contains(text(),'Dein nächstes Abenteuer wartet')]");
    By welcomeTextIT = By.xpath("//h3[contains(text(),'Una grande avventura è alle porte!')]");
    By languageDropdown = By.xpath("//span[@class=\"tw-font-bold tw-mr-1\"]");
    By selectDropdownDE = By.xpath("//ul[@class=\"c-dropdown__menu tw-z-6\"]//li[contains(.,'Deutsch')]");
    By selectDropdownIT = By.xpath("//ul[@class=\"c-dropdown__menu tw-z-6\"]//li[contains(.,'Italiano')]");


    public String homePageTextVerificationIT() {
        String homePageTextFR = driver.findElement(welcomeTextIT).getText();
        System.out.println("Text is  : " + homePageTextFR);
        Assert.assertEquals( "Una grande avventura è alle porte!", homePageTextFR);
        return homePageTextFR;
    }

    public String homePageTextVerificationDE () {
        String homePageTextDE = driver.findElement(welcomeTextDE).getText();
        System.out.println("Text is  : " + homePageTextDE);
        Assert.assertEquals( "Dein nächstes Abenteuer wartet", homePageTextDE);
        return homePageTextDE;
    }

    public void selectDropDownValue()  {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(languageDropdown).click();
        driver.findElement(selectDropdownDE).click();
    }

    public void selectDropDownValueIT()  {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(languageDropdown).click();
        driver.findElement(selectDropdownIT).click();
    }

}


