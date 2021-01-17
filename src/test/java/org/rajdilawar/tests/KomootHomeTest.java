package org.rajdilawar.tests;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.rajdilawar.base.initTest;
import org.rajdilawar.pages.KomootHomePage;
import org.rajdilawar.properties.Configuration;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class KomootHomeTest {

    @Test(priority = 1)
    public void KomootHomePageTestChangeLanguageToDE() throws IOException {

        WebDriver driver = new initTest().getWebdriver();
        Configuration configuration = new Configuration();
        driver.get(configuration.baseurl());
        KomootHomePage komootHomePage = new KomootHomePage(driver);
        komootHomePage.selectDropDownValue();
        komootHomePage.homePageTextVerificationDE();
        driver.quit();

    }

    @Test
    public void KomootHomePageTestChangeLanguageToIT() throws IOException {

        WebDriver driver = new initTest().getWebdriver();
        Configuration configuration = new Configuration();
        driver.get(configuration.baseurl());
        KomootHomePage komootHomePage = new KomootHomePage(driver);
        komootHomePage.selectDropDownValueIT();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        komootHomePage.homePageTextVerificationIT();
        driver.quit();

    }
}
