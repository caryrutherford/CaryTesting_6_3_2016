package com.ca.cary.testing.adminConsole.run;

import com.ca.cary.testing.adminConsole.pages.ACHomePage;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.Console;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by caryTesting on 3/7/2016.
 */
public class AdminConsoleMain {
    static final Logger logger = Logger.getLogger(AdminConsoleMain.class);
    public void AdminConsoleMain(){}

    public boolean getAdminConsole() {
        PropertyConfigurator.configure("aclog4j.properties");
        boolean passFail = false;
        String sURL, sUserName, sPassword, sUIMName, sUIMHubName, sIPAddress = null;


        Scanner in = new Scanner(System.in);
        Console con = System.console();

        WebDriver driver;

       // System.out.println("Please enter the IP Address where Admin Console is located: ");
      //  sIPAddress = in.nextLine();
      //  System.out.println("IP Address: "+ sIPAddress);
        //sURL = "http://"+sIPAddress+":8080/adminconsole/";    // Old AC
       // sURL = "http://"+sIPAddress+"/adminconsole/";
        sURL = "http://10.238.72.91/adminconsole/";
       // sURL = "http://10.238.72.185/adminconsole/";
        sURL = "http://10.238.73.47/adminconsole/";
       // sURL = "http://10.238.72.229/adminconsole/";
        System.out.println("sURL: " + sURL);

        /* Change once it is working correctly. Add back in
        System.out.println("Enter the user name: ");
        sUserName = in.nextLine();

        System.out.println("Please enter the password for the user: ");
        //char[] cPassString = con.readPassword();
       // sPassword = new String(cPassString);
        sPassword = in.nextLine();
        System.out.println("sPassword: " + sPassword);
        System.out.println("Enter the name of your UIM Machine: ");
        sUIMName = in.nextLine();
        System.out.println("Enter the name of your UIM server hub: ");
        sUIMHubName = in.nextLine();
        */
        sUserName = "administrator";
        sPassword = "t3sti9";
       // sUIMName = "W2K8R2UIM";
        sUIMName = "W2K12R2UIMUP";
        sUIMHubName = "serverhub"; // This is needed to setup SNMPC.
        driver = new FirefoxDriver();
        driver.get(sURL);

        ACTest login = new ACTest();
        login.logIntoAC(driver);
        // Get the Domain on the left hand side.
        ACHomePage test = new ACHomePage(driver);
        // test.getDomain();
        //Added the License Works commented out for build perposses.
        //test.addLicense();
        // Deploy the CDM probe to all robots. DONE 5/12/2016
        //test.deployCDM(sUIMName);
        test.deploySNMP(sUIMHubName);
        // Log out of Admin Console.
        test.ACLogOut();

        driver.close();
        return passFail;
    }
}

