package com.ca.cary.testing.adminConsole.pages;

import com.ca.cary.testing.adminConsole.locators.ACLocators;
import com.ca.cary.testing.common.ActionsDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Created by caryTesting on 3/7/2016.
 */
public class ACHomePage  extends ActionsDriver {
    private ACLocators acloc = new ACLocators();
    private StringBuffer verificationError = new StringBuffer();
    public ACHomePage(WebDriver driver){super(driver);}
    public void logIntoAC(){
        Actions action = new Actions(driver);
    }
    public void getDomain(){

        String domain = driver.findElement(acloc.getDomain()).getText();
        System.out.println("domain: "+ domain);
        waitUntilVisible(acloc.getButtonLicenses(), 100);
        sleep(5000);
        waitUntilVisible(acloc.getButtonActions(), 100);
        driver.findElement(By.xpath("//th[2]/div")).click();
        sleep(5000);
        System.out.println("1");
        driver.findElement(By.xpath("//th[2]/div")).click();
        System.out.println("2");
        sleep(10000);
        //  driver.findElement(acloc.getHub3()).click();
        System.out.println("3");
        sleep(10000);
    }
    // Sleep is added to slow things down so AC can get things displayed and working before the test move on.
    public void addLicense(){
        int iCount = 0;
        String sLicense, sCurrentLic;
        sLicense = null;
        try {
            BufferedReader in = new BufferedReader(new FileReader("lic.txt"));
            while((sCurrentLic = in.readLine()) != null){
                if(iCount == 0){
                    sLicense = sCurrentLic;
                    iCount++;
                }else {
                    sLicense = sLicense +"\n"+ sCurrentLic;
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("IN addLicense");
        sleep(1000);
        driver.findElement(acloc.getHub1()).click();
        sleep(1000);
        driver.findElement(acloc.getButtonLicenses()).click();
        sleep(1000);
        driver.findElement((acloc.getButtonActions())).click();
        driver.findElement(acloc.getButtonAddLicense()).click();
        driver.findElement(acloc.getAddLicenseText()).clear();
        driver.findElement(acloc.getAddLicenseText()).sendKeys(sLicense);
        driver.findElement(acloc.getButtonSaveLicense()).click();
        waitUntilVisible(acloc.getIconClose(), 100);
        driver.findElement(acloc.getLicAddSusscess()).click();
    }

    // This test runs after addLicense
    //  Deploies the CDM probe to all robots in the Domain.
    public void deployCDM(String sUIMName){
        long start = System.currentTimeMillis();
        CDMProbe cdm = new CDMProbe(driver);
        ArrayList<String> alFailed = cdm.deployCDM(driver);
        //Configure all the deployed probes.
      //  cdm.configure(sUIMName, alFailed);
        long end = System.currentTimeMillis();
        long totalSeconds = (end - start)/1000;
        long minutes = totalSeconds/60;
        long seconds = totalSeconds%60;
        System.out.println("Took: "+minutes+":"+seconds);
    }


    public void ACLogOut(){
        sleep(1000);
        driver.findElement(acloc.getUsernameMenuIcon()).click();
        sleep(1000);
        driver.findElement(acloc.getLogOut()).click();
    }
// Used to deploy and configure the SNMP Collector Probe.
    public void deploySNMP(String sUIMName) {
            // download the snmp collector and pollagent probes.
        SNMPCollectorProbe snmp = new SNMPCollectorProbe(driver);
        snmp.getProbes(sUIMName);
    }
}

