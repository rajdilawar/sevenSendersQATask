package org.rajdilawar.tests;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.rajdilawar.base.initTest;
import org.rajdilawar.pages.KomootLoginPage;
import org.rajdilawar.pages.KomootPlanPage;
import org.rajdilawar.pages.KomootShopPage;
import org.rajdilawar.properties.Configuration;

import java.io.IOException;

public class KoomootPlanTest {

    @Test
    public void komootGoPremiumTest() throws IOException {

        WebDriver driver = new initTest().getWebdriver();
        Configuration configuration = new Configuration();
        driver.get(configuration.planPageUrl());
        KomootShopPage komootShopPage = new KomootShopPage(driver);
        komootShopPage.acceptCookies();
        KomootPlanPage komootPlanPage = new KomootPlanPage(driver);
        komootPlanPage.routePlanOptions();
        driver.quit();

    }

}
