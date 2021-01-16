package org.rajdilawar.tests;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.rajdilawar.base.initTest;
import org.rajdilawar.pages.KomootLoginPage;
import org.rajdilawar.pages.KomootShopPage;
import org.rajdilawar.properties.Configuration;

import java.io.IOException;
import java.util.concurrent.TimeUnit;


public class KomootShopTest {

    @Test
    public void komootGoPremiumTest() throws IOException, InterruptedException {

        WebDriver driver = new initTest().getWebdriver();
        Configuration configuration = new Configuration();
        driver.get(configuration.shopPageUrl());
        KomootShopPage komootShopPage = new KomootShopPage(driver);
        komootShopPage.moveToBottom();
        komootShopPage.clickOnGetPremiumButton();
        Thread.sleep(2000);
        KomootLoginPage komootLoginPage = new KomootLoginPage(driver);
        komootLoginPage.loginPageHeader();
        driver.quit();

    }

}
