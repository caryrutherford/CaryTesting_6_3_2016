package com.ca.cary.testing.adminConsole.run;

import com.ca.cary.testing.adminConsole.pages.ACHomePage;
import com.ca.cary.testing.adminConsole.pages.LogInPage;
import org.openqa.selenium.WebDriver;

/**
 * Created by caryTesting on 3/7/2016.
 */
public class ACTest {
    public void logIntoAC(WebDriver driver){
        LogInPage login = new LogInPage(driver);
        ACHomePage admin =login.ACLogin();

    }
}
