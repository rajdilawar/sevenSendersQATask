package org.rajdilawar.base;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.ProfilesIni;
import org.rajdilawar.properties.Configuration;

import java.io.IOException;

public class initTest {

    WebDriver driver;

    public initTest() throws IOException {
        System.out.println("Initialize ");
        initializationMethod();
    }

    public void initializationMethod() throws IOException {

        Configuration configuration = new Configuration();
        String browserName = configuration.browserName();
        if (browserName.equals("chrome")) {
            driver = new ChromeDriver();
            System.out.println("Initializing chrome driver");

        } else if (browserName.equals("firefox")) {
            driver = new FirefoxDriver();
            System.out.println("Initializing Firefox driver");
        }
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
    }

    public WebDriver getWebdriver() {
        return driver;
    }
}
