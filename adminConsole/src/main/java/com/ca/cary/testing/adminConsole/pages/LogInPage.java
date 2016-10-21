package com.ca.cary.testing.adminConsole.pages;

import com.ca.cary.testing.adminConsole.locators.ACLocators;
import com.ca.cary.testing.common.ActionsDriver;
import org.openqa.selenium.WebDriver;

/**
 * Created by caryTesting on 3/7/2016.
 */
public class LogInPage  extends ActionsDriver {
    public LogInPage(WebDriver driver){super(driver);}

    public ACHomePage ACLogin(){
        type(ACLocators.getUserNamae(), "administrator", "Type - username");
        type(ACLocators.getPassWord(), "t3sti9", "Type - password");
        click(ACLocators.getButtonSignIn(), "Click = Sign in");
        // sleep(10000);        // sleep uses milliseconds
        //waitUntilVisible(CDMLocatories.getProbeConfigLable(), 100);
        waitUntilVisible(ACLocators.getButtonLicenses(), 100);
        // This sections returns the Probe Configuration name in the upper left hand corner.
        // WebElement wTitle =driver.findElement(By.xpath(LogInLocators.getDomain());
        // String sTitle = wTitle.getText();
        //a
        // System.out.println("sTital: "+ sTitle);
        // end Section
        return new ACHomePage(driver);

    }
}
