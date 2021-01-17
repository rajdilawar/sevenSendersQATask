package org.rajdilawar.tests;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.rajdilawar.base.initTest;
import org.rajdilawar.pages.KomootLoginPage;
import org.rajdilawar.properties.Configuration;
import org.testng.Assert;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class KomootLoginTest {

    @Test
    public void test_kamootSignUpPage_page() throws IOException, InterruptedException {

        WebDriver driver = new initTest().getWebdriver();
        Configuration configuration = new Configuration();
        driver.get(configuration.loginPageUrl());
        KomootLoginPage komootLoginPage = new KomootLoginPage(driver);
        komootLoginPage.fillSignUpForm();
        driver.quit();
    }

}
