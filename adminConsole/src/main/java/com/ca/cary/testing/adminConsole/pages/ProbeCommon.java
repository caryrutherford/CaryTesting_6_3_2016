package com.ca.cary.testing.adminConsole.pages;

import com.ca.cary.testing.adminConsole.locators.ACLocators;
import com.ca.cary.testing.common.ActionsDriver;
//import org.apache.xpath.operations.Bool;
import com.google.common.base.Function;
import com.google.common.primitives.Booleans;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import sun.reflect.generics.reflectiveObjects.LazyReflectiveObjectGenerator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/**
 * Created by caryTesting on 3/14/2016.
 */
public class ProbeCommon extends ActionsDriver {
    public ProbeCommon(WebDriver driver){super(driver);}
    private static ACLocators acloc = new ACLocators();
    public String getNodeName(WebDriver driver){
        driver.findElement(acloc.getSearchBox()).clear();
        sleep(2000);
        driver.findElement(acloc.getButtonEnvVar()).click();
        sleep(2000);
        driver.findElement(acloc.getSearchBox()).sendKeys("COMPUTERNAME");
        sleep(3000);
        return driver.findElement(acloc.getEnvVer()).getText();
    }
    public String getDomain(WebDriver driver){
        driver.findElement(acloc.getButtonEnvVar()).click();
        driver.findElement(acloc.getSearchBox()).clear();
        sleep(2000);
        driver.findElement(acloc.getSearchBox()).sendKeys("NIM_DOMAIN");
        sleep(2000);
        return driver.findElement(acloc.getEnvVer()).getText();
    }

    public String getHub(WebDriver driver){
        driver.findElement(acloc.getButtonEnvVar()).click();
        sleep(2000);
        driver.findElement(acloc.getSearchBox()).clear();
        sleep(2000);
        driver.findElement(acloc.getSearchBox()).sendKeys("NIM_HUB_NAME");
        sleep(2000);
        return driver.findElement(acloc.getEnvVer()).getText();
    }
    public String getOS(WebDriver driver, String sName, String sUIMName, int iRobotLoopCount){
                            ////        /html/body/div[2]/div[1]/div/div[3]/div[3]/div[1]/div/div[2]/table/tbody/tr[2]/td[4]


        driver.findElement(acloc.getButtonEnvVar()).click();
        sleep(2000);
        driver.findElement(acloc.getSearchBox()).clear();
        sleep(2000);
        driver.findElement(acloc.getSearchBox()).clear();
        sleep(2000);
        driver.findElement(acloc.getSearchBox()).sendKeys("OS");
        sleep(2000);
        if(sName.equalsIgnoreCase(sUIMName)){
            return driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/div[3]/div/div/div[2]/table/tbody/tr[3]/td[2]")).getText();

        }else{
            return driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/div[3]/div/div/div[2]/table/tbody/tr[2]/td[2]")).getText();
        }
    }
    public  void getNewTab(WebDriver driver, WebElement link){
        Actions newTab = new Actions(driver);
        newTab.keyDown(Keys.CONTROL).keyDown(Keys.SHIFT).click(link).keyUp(Keys.CONTROL).keyUp(Keys.SHIFT).build().perform();
        sleep(5000);
    }

    // Returns the the original handle(Browser Windows)
    public String getBaseBrowser(WebDriver driver) {
        return  driver.getWindowHandle();
    }
    // Returns all open browsers for opened browser.
    public Set<String> getAllBrowsers(WebDriver driver) {
        return driver.getWindowHandles();
    }

    public void getProbeConfigTab(WebDriver driver, String base, Set<String> set){
        set.remove(base);
        assert set.size() == 1;
        driver.switchTo().window((String) set.toArray()[0]);
    }
    public void getBaseBrowsed(WebDriver driver, String base, Set<String> set) {

        // Close the windows and move back to the base tab
        driver.close();
        driver.switchTo().window(base);
    }
    public void saveProbeConfig(){

        driver.findElement(By.xpath("/html/body/div[1]/div[2]/button[1]")).click();

        waitUntilVisible(By.xpath("/html/body/div[6]/div[3]/div/button[2]"), 20000);
        driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/button[2]")).click();
    }
    public void getDiscardProbeConfig(){

        driver.findElement(By.xpath("/html/body/div[1]/div[2]/button[2]")).click();
        sleep(5000);
    }

    // Get the information ot of the left hand table. This is used for both hubs and robots.
    public int leftTableCount(){
        int iCount = 0;
        List<WebElement> rows;
        //get a list of all the hubs on the left hand side.
        WebElement leftTable = driver.findElement(acloc.getLeftTable());
        rows = leftTable.findElements(By.tagName("tr"));
        Iterator<WebElement> IR = rows.iterator();
        while (IR.hasNext()){
            WebElement row = IR.next();
            List<WebElement> columns = row.findElements(By.tagName("td"));
            Iterator<WebElement> j = columns.iterator();
            while (j.hasNext()){
                WebElement column = j.next();
                if(!column.getText().equalsIgnoreCase("")) {
                    iCount++;
                }else{}
            }
        }
        return iCount;
    }

    // Get the information ot of the left hand table. This is used for both hubs and robots.
    public int middleTableCount(){
        int iCount = 0;
        List<WebElement> rows;
        //get a list of all the hubs on the left hand side.
        WebElement leftTable = driver.findElement(acloc.getMiddleTable());
        rows = leftTable.findElements(By.tagName("tr"));
        Iterator<WebElement> IR = rows.iterator();
        while (IR.hasNext()){
            WebElement row = IR.next();
            List<WebElement> columns = row.findElements(By.tagName("td"));
            Iterator<WebElement> j = columns.iterator();
            while (j.hasNext()){
                WebElement column = j.next();
                if(!column.getText().equalsIgnoreCase("")) {
                    iCount++;
                }else{}
            }
        }
        return iCount;
    }

    public ArrayList<String> getCheckStatus(WebDriver driver){
        Boolean bDone = false;
        Boolean bFail = false;
        driver.findElement(acloc.getButtonDeploy()).click();
        sleep(40000);
        WebElement table = this.driver.findElement(acloc.getStatus());
        List<WebElement> rows = table.findElements(By.tagName("tr"));
        ArrayList<String> alFailed = new ArrayList<>();
        int totalRows = rows.size();
        int iDone = 0;
        System.out.println("totalRows: "+ totalRows);
        int count = 0;
        for(int ca =1; ca < totalRows;ca++){
           // System.out.println(ca+") "+driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[3]/div[3]/div[1]/div/div[2]/table/tbody/tr["+ca+"]/td[6]")).getText()+
              //      ": "+driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[3]/div[3]/div[1]/div/div[2]/table/tbody/tr["+ca+"]/td[4]/div")).getText());
            if(driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[3]/div[3]/div[1]/div/div[2]/table/tbody/tr["+ca+"]/td[4]/div")).getText().equalsIgnoreCase("Succeeded")){
                iDone ++;
            }if(driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[3]/div[3]/div[1]/div/div[2]/table/tbody/tr["+ca+"]/td[4]/div")).getText().equalsIgnoreCase("Failed")){
              //  System.out.println(driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[3]/div[3]/div[1]/div/div[2]/table/tbody/tr["+ca+"]/td[6]")).getText());
                alFailed.add(driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[3]/div[3]/div[1]/div/div[2]/table/tbody/tr["+ca+"]/td[6]")).getText());
            }
        }
        return alFailed;
    }


    public void getDownloadProbeFromAcrhive(WebDriver driver, String sProbe){
        sleep(1000);
        waitUntilVisible(acloc.getButtonArchive(), 5000);
        driver.findElement(acloc.getButtonArchive()).click();
        sleep(1000);
        waitUntilVisible(acloc.getSearchBox(), 10000);
        driver.findElement(acloc.getSearchBox()).clear();
        sleep(1000);
        driver.findElement(acloc.getSearchBox()).sendKeys(sProbe);
        sleep(1000);
        // get the list of probs to update them all. cdm has more than one probe in the archive.
        String sWebV = driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[3]/div[3]/div[2]/div/div[2]/table/tbody/tr[1]/td[5]")).getText();
        String sLocalV =  driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[3]/div[3]/div[2]/div/div[2]/table/tbody/tr[1]/td[4]")).getText();

        if(!sWebV.equalsIgnoreCase(sLocalV)) {
            waitUntilVisible(By.xpath("/html/body/div[2]/div[1]/div/div[3]/div[3]/div[2]/div/div[2]/table/tbody/tr[1]/td[1]/input"), 1000);
            driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[3]/div[3]/div[2]/div/div[2]/table/tbody/tr[1]/td[1]/input")).click();
            driver.findElement(acloc.getButtonActions()).click();
            driver.findElement(acloc.getButtonDownload()).click();
            sleep(1000);
            Boolean isPresent = driver.findElements(By.xpath("/html/body/div[3]/div[2]/div/form/div/div[1]/span[2]/input")).size() > 0;
            if (isPresent == true) {
                driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/form/div/div[1]/span[2]/input")).sendKeys("eng-sup-sf@nimsoft.com");
                driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/form/div/div[2]/span[2]/input")).sendKeys("utfl!");
                driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/button[2]")).click();

            } else {
            }
            waitUntilVisible(By.xpath("/html/body/div[3]/div[3]/div/button[2]"), 1000);
            driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/button[2]")).click();
            Boolean bDone = false;
            do {
                sleep(10000);
                sLocalV = driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[3]/div[3]/div[2]/div/div[2]/table/tbody/tr[1]/td[4]")).getText();
                if (sWebV.equalsIgnoreCase(sLocalV)) {
                    bDone = true;
                } else {
                }
            } while (bDone == false);
        }else{}
    }
        // Finds and returns the location of a robot on a secondary hub.
    public String[] getSecondaryHubRobot(WebDriver driver, String sUIMHubName) {
        Boolean bFound = false;
        int iHubCount = 1;
        String[] sInfo = new String[2];
        //Get a list of all hubs on the left hand side.
        String[] sHubs = getHubList();
        sleep(1000);
        List<WebElement> rows;
        driver.findElement(acloc.getButtonRobots()).click();
        for(int i = 0; i<sHubs.length;i++){
            driver.findElement(By.xpath("/html/body/div[2]/div[3]/div[2]/div[2]/div[1]/div/div[2]/table/tbody/tr[" + iHubCount + "]/td[2]")).click();
           sleep(2000);
            if(!sUIMHubName.equalsIgnoreCase(sHubs[i])){
                sleep(1000);
                //waitUntilVisible(acloc.getRightTable(), 2000);
                WebElement rightTable = driver.findElement(acloc.getMiddleTable());
                rows = rightTable.findElements(By.tagName("tr"));
                // Select the hub and see if it has a robot to install SNMP on.\\
                if(rows.size()>2){
                    int iRobot = 1;
                    for(int j=1; j < rows.size();j++){
                        if(!sHubs[i].equalsIgnoreCase(driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[3]/div[3]/div[1]/div/div[2]/table/tbody/tr["+j+"]/td[5]")).getText())){
                            sInfo[0] = sHubs[i];
                            sInfo[1] = driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[3]/div[3]/div[1]/div/div[2]/table/tbody/tr["+j+"]/td[5]")).getText();
                            j = rows.size()+1;
                            i = sHubs.length+1;
                        }else{}
                    }
                    // Get the robot and not the hub.
                    //  c
                    //  /html/body/div[2]/div[1]/div/div[3]/div[3]/div[1]/div/div[2]/table/tbody/tr[2]/td[5]
                }else{}

            }else{}
           iHubCount++;
        }
        // Return to the serverhub.
        iHubCount = 1;
        for(int i = 0; i < sHubs.length;i++){
            if(sHubs[i].equalsIgnoreCase(sUIMHubName)){
                driver.findElement(By.xpath("/html/body/div[2]/div[3]/div[2]/div[2]/div[1]/div/div[2]/table/tbody/tr[" + iHubCount + "]/td[1]")).click();
                                        //   /html/body/div[2]/div[3]/div/div[2]/div[1]/div/div[2]/table/tbody/tr[4]/td[1]
                i=sHubs.length+1;
            }else{}
            iHubCount++;
        }
        return sInfo;
    }

    public String[] getHubList(){
        String[] sHubs;
        int iCount = 0;
        List<WebElement> rows;
        //get a list of all the hubs on the left hand side.
        WebElement leftTable = driver.findElement(acloc.getLeftTable());
        rows = leftTable.findElements(By.tagName("tr"));
        sHubs = new String[rows.size()-1];
        Iterator<WebElement> IR = rows.iterator();
        while (IR.hasNext()){
            WebElement row = IR.next();
            List<WebElement> columns = row.findElements(By.tagName("td"));
            Iterator<WebElement> j = columns.iterator();
            while (j.hasNext()){
                WebElement column = j.next();
                if(!column.getText().equalsIgnoreCase("")) {
                    sHubs[iCount] =  column.getText();
                    iCount++;
                }else{}
            }
        }
        return sHubs;
    }
    // Gets the hub and robot to deploy a probe to.
    public String[] getHubRobtForDeployment(String[] sInfo, String sUIMHubName) {
        // Get the correct hub
        String sHubName;
        int iRobots;
        String sRobot;
        String[] aSDelpoyInfo = new String[2];
        System.out.println("getHubRobtForDeployment");
        List<WebElement> LMainRows;
        //get a list of all the hubs on the left hand side.

        WebElement HubTable = driver.findElement(By.xpath("/html/body/div[2]/div[3]/div[2]/div[2]/div[1]/div/div[2]"));
        LMainRows = HubTable.findElements(By.tagName("tr"));
       // System.out.println("LMainRows: "+ LMainRows.size());
        for(int i = 1; i< LMainRows.size();i++) {

          //  System.out.println(driver.findElement(By.xpath("/html/body/div[2]/div[3]/div[2]/div[2]/div[1]/div/div[2]/table/tbody/tr["+i+"]/td[2]")).getText());
            sHubName = driver.findElement(By.xpath("/html/body/div[2]/div[3]/div[2]/div[2]/div[1]/div/div[2]/table/tbody/tr["+i+"]/td[2]")).getText();
            // If the hub is the serverhub than skip it.
            if(sHubName.equalsIgnoreCase(sUIMHubName)){

            }else{
                // Select the hub and see if it has more than 1 robot under it.
              //  System.out.println("Not the serverhub");
                driver.findElement(By.xpath("/html/body/div[2]/div[3]/div[2]/div[2]/div[1]/div/div[2]/table/tbody/tr["+i+"]/td[2]")).click();
                //driver.findElement(acloc.getButtonRobots()).click();
                List<WebElement> LRRows;
                //get a list of all the robots on the left hand side.
                sleep(1000);
                WebElement RobotTable = driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[3]/div[3]/div[1]/div/div[2]"));
                LRRows = RobotTable.findElements(By.tagName("tr"));
               // System.out.println("LRRows: "+ LRRows.size());
                iRobots = LRRows.size();
                // If the hub has 2 or more robots on it go through the list and get then name of a robot that is not the hub probe on it.
                if(iRobots > 1){
                    // a loop to select the robots and see if the hub probe is installed.
                    for(int j =1 ; j< iRobots;j++){
                        //System.out.println("j: "+ j );
                       // System.out.println(driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[3]/div[3]/div[1]/div/div[2]/table/tbody/tr["+j+"]/td[5]")).getText());
                        driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[3]/div[3]/div[1]/div/div[2]/table/tbody/tr["+j+"]/td[5]")).click();
                        sRobot = driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[3]/div[3]/div[1]/div/div[2]/table/tbody/tr["+j+"]/td[5]")).getText();
                        //System.out.println("sRobot: "+ sRobot);
                        sleep(2000);
                        driver.findElement(acloc.getButtonProbes()).click();
                        // see if the hub probe is installed on the robot
                        sleep(1000);
                        driver.findElement((acloc.getSearchBox())).clear();
                        driver.findElement(acloc.getSearchBox()).sendKeys("hub");
                        sleep(1000);
                        WebElement ProbesTable = driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[3]/div[3]/div[1]/div/div[2]"));
                        List<WebElement> LPRows;
                        LPRows = ProbesTable.findElements(By.tagName("tr"));
                        System.out.println("LPRows: "+ LPRows.size());
                        if(LPRows.size() == 1){
                            System.out.println("Found it");
                            aSDelpoyInfo[0] = sHubName;
                            aSDelpoyInfo[1] = sRobot;
                            i = LMainRows.size()+1;
                            j= iRobots+1;
                        }
                        sleep(1000);
                        driver.findElement(acloc.getHubCrumb()).click();
                        sleep(2000);
                    }
                }
            }
        }
        driver.findElement(acloc.getHubCrumb()).click();

        //get a list of all the hubs on the left hand side.

         HubTable = driver.findElement(acloc.getLeftTable());
        LMainRows = HubTable.findElements(By.tagName("tr"));
        // System.out.println("LMainRows: "+ LMainRows.size());
        for(int i = 1; i < LMainRows.size();i++){
            sHubName = driver.findElement(By.xpath("/html/body/div[2]/div[3]/div[2]/div[2]/div[1]/div/div[2]/table/tbody/tr["+i+"]/td[2]")).getText();
            // If the hub is the serverhub than skip it.
            if(sHubName.equalsIgnoreCase(sUIMHubName)){
                driver.findElement(By.xpath("/html/body/div[2]/div[3]/div[2]/div[2]/div[1]/div/div[2]/table/tbody/tr["+i+"]/td[2]")).click();
            }else{}

        }
        driver.findElement(acloc.getHubCrumb()).click();
        return aSDelpoyInfo;
    }
    //Used to deploy probe(s)
    public void getDeployProbe(WebDriver driver, String[] aProbes, String[] aSDeployInfo) {
        // First we need to select the probes.
        System.out.println("getDeployProbe");
        List<WebElement> LHubsRows;
        List<WebElement> LRobotsRows;
        //get a list of all the hubs on the left hand side.

        sleep(1000);
        driver.findElement(acloc.getButtonArchive()).click();
        sleep(10000);
        // do a search for cdm
        waitUntilVisible(acloc.getSearchBox(), 1000);
        for(int i = 0; i < aProbes.length;i++) {
            driver.findElement(acloc.getSearchBox()).clear();
            driver.findElement(acloc.getSearchBox()).sendKeys(aProbes[i]);
            sleep(1000);
            driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[3]/div[3]/div[2]/div/div[2]/table/tbody/tr/td[1]/input")).click();
            sleep(1000);
        }

        sleep(1000);
        driver.findElement(acloc.getButtonActions()).click();
        sleep(1000);
        driver.findElement(acloc.getDeployPackage()).click();
        sleep(5000);
        // We need to find the correct hub form the list. Get the list of hubs from the middle table.
        WebElement HubTable = driver.findElement(By.xpath("/html/body/div[2]/div[3]/div[2]/div[2]/div/div[3]/div/div[2]"));
        LHubsRows = HubTable.findElements(By.tagName("tr"));
        System.out.println("LHubsRows: "+LHubsRows.size());
        System.out.println("HUB: "+ aSDeployInfo[0]);
        for(int i = 1; i < LHubsRows.size(); i++){
            if(driver.findElement(By.xpath("/html/body/div[2]/div[3]/div[2]/div[2]/div/div[3]/div/div[2]/table/tbody/tr["+i+"]/td[3]")).getText().equalsIgnoreCase(aSDeployInfo[0])){
                driver.findElement(By.xpath("/html/body/div[2]/div[3]/div[2]/div[2]/div/div[3]/div/div[2]/table/tbody/tr["+i+"]/td[1]/div/div[1]/input")).click();
                i=LHubsRows.size()+1;
            }else{}
        }
        sleep(2000);
        WebElement RobotTable = driver.findElement(By.xpath("/html/body/div[2]/div[3]/div[2]/div[3]/div/div[3]/div/div[2]"));
        LRobotsRows = HubTable.findElements(By.tagName("tr"));
        System.out.println("LRobotsRows: "+LRobotsRows.size());
        System.out.println("Robot: "+ aSDeployInfo[1]);
        sleep(1000);
        Boolean present = true;
        // Get the correct robot.
        for(int i = 1; (i < LRobotsRows.size()) && present == true; i++){
            // This try/catch statement is used to see if the next element exist. If it does not that present is set to false and the for loop is exited.
            try{
                driver.findElement(By.xpath("/html/body/div[2]/div[3]/div[2]/div[3]/div/div[3]/div/div[2]/table/tbody/tr["+i+"]/td[3]"));
                System.out.println(driver.findElement(By.xpath("/html/body/div[2]/div[3]/div[2]/div[3]/div/div[3]/div/div[2]/table/tbody/tr["+i+"]/td[3]")).getText());
                if(driver.findElement(By.xpath("/html/body/div[2]/div[3]/div[2]/div[3]/div/div[3]/div/div[2]/table/tbody/tr["+i+"]/td[3]")).getText().equalsIgnoreCase(aSDeployInfo[1])){

                }else{
                    System.out.println(i +") "+driver.findElement(By.xpath("/html/body/div[2]/div[3]/div[2]/div[3]/div/div[3]/div/div[2]/table/tbody/tr["+i+"]/td[3]")).getText());
                    driver.findElement(By.xpath("/html/body/div[2]/div[3]/div[2]/div[3]/div/div[3]/div/div[2]/table/tbody/tr["+i+"]/td[4]/input")).click();
                    sleep(1000);
                    RobotTable = driver.findElement(By.xpath("/html/body/div[2]/div[3]/div[2]/div[3]/div/div[3]/div/div[2]"));
                    LRobotsRows = HubTable.findElements(By.tagName("tr"));
                    System.out.println("LRobotsRows: "+LRobotsRows.size());
                }
                present = true;
            }catch (NoSuchElementException e){
                present = false;
            }
        }
        sleep(1000);
        // Deploy the probes.
        ArrayList<String> alFailed = getCheckStatus(driver);
    }

    public void get2HubAndRobot(WebDriver driver, String[] aInfo) {
        //Find the hub and select it.
        String[] sHubs = getHubList();
        for(int i = 0; i <sHubs.length;i++){
            System.out.println(sHubs[i]);
        }
        /*sleep(1000);
        List<WebElement> rows;
        driver.findElement(acloc.getButtonRobots()).click();*/

    }

    public void getSelectedRobot(String[] aSDeployInfo) {
        // Select the correct hub.
        // Click on the robot button at the top.
        System.out.println("Click on the robots button");
        driver.findElement(acloc.getButtonRobots()).click();
        System.out.println("getSelectedaRobot");
        List<WebElement> LHubsRows;
        List<WebElement> LRobotsRows;
        WebElement HubTable = driver.findElement(acloc.getLeftTable());
        LHubsRows = HubTable.findElements(By.tagName("tr"));
        System.out.println("LHubsRows: "+LHubsRows.size());
        System.out.println("HUB: "+ aSDeployInfo[0]);
        // Get the hub from the list of hubs on the left hand side and select it.
        for(int i = 1; i < LHubsRows.size(); i++){
            System.out.println(driver.findElement(By.xpath("/html/body/div[2]/div[3]/div[2]/div[2]/div[1]/div/div[2]/table/tbody/tr["+i+"]/td[2]")).getText());
            if(driver.findElement(By.xpath("/html/body/div[2]/div[3]/div[2]/div[2]/div[1]/div/div[2]/table/tbody/tr["+i+"]/td[2]")).getText().equalsIgnoreCase(aSDeployInfo[0])){
                driver.findElement(By.xpath("/html/body/div[2]/div[3]/div[2]/div[2]/div[1]/div/div[2]/table/tbody/tr["+i+"]/td[2]")).click();
                i=LHubsRows.size()+1;
            }
        }
        sleep(1000);
        // Select the correct Robot that the probe is installed on.
        WebElement RobotTable = driver.findElement(acloc.getMiddleTable());
        LRobotsRows = RobotTable.findElements(By.tagName("tr"));
        System.out.println("LRobotsRows: "+ LRobotsRows.size());
        System.out.println("Robot: "+ aSDeployInfo[1]);
        for(int i = 1; i < LRobotsRows.size(); i++){
            //                                              /html/body/div[2]/div[1]/div/div[3]/div[3]/div[1]/div/div[2]/table/tbody/tr[1]/td[5]
            System.out.println(driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[3]/div[3]/div[1]/div/div[2]/table/tbody/tr["+i+"]/td[5]")).getText());
        }


    }
}
