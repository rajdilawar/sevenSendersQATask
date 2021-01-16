package org.rajdilawar.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import java.util.concurrent.TimeUnit;

public class KomootPlanPage {
    public KomootPlanPage(WebDriver driver){
        this.driver = driver;
    }
    WebDriver driver;


    By routePlanButton = By.xpath("//button[@class=\"tw-inline-flex tw-justify-center tw-items-center c-btn c-btn--primary tw-w-full\"]");
    By modalOptionMap = By.xpath("//ul[@class=\"o-list-ui o-list-ui--small o-list-ui--flush-vertical tw-mb-6\"]/li[2]");
    By modalCloseButton = By.xpath("//button[@data-dismiss=\"modal\"]");


    //dealing with modal and selecting options
    public void routePlanOptions() {
        driver.findElement(routePlanButton).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(modalOptionMap).click();
        driver.findElement(modalCloseButton).click();
    }


}