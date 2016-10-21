package com.ca.cary.testing.adminConsole.pages;

import com.ca.cary.testing.adminConsole.locators.ACLocators;
import com.ca.cary.testing.common.ActionsDriver;
import com.sun.java.swing.plaf.windows.WindowsBorders;
import com.sun.org.glassfish.external.probe.provider.annotations.Probe;
import com.sun.xml.internal.ws.message.RootElementSniffer;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import java.util.*;


/**
 * Created by caryTesting on 3/7/2016.
 */
public class CDMProbe extends ActionsDriver {
    public CDMProbe(WebDriver driver){super(driver);}
    private ACLocators acloc = new ACLocators();
    private CDMProbeConfiguration cdmConfig = new CDMProbeConfiguration(driver);
    private ProbeCommon common = new ProbeCommon(driver);
    public ArrayList<String> deployCDM(WebDriver driver){
        Boolean bDone = false;
        Boolean bFail = false;
        // Go to the archive.
        ProbeCommon common = new ProbeCommon(driver);
        sleep(1000);
        driver.findElement(acloc.getButtonArchive()).click();
        sleep(5000);
        // do a search for cdm
        waitUntilVisible(acloc.getSearchBox(), 1000);
        driver.findElement(acloc.getSearchBox()).sendKeys("cdm");
        sleep(1000);
        // Get the size of the table.
        List<WebElement> rows;
        WebElement rightTable = driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[3]/div[3]/div[2]/div/div[2]"));
        rows = rightTable.findElements(By.tagName("tr"));
        System.out.println("rows.size(): "+ rows.size());
        driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[3]/div[3]/div[2]/div/div[2]/table/tbody/tr["+(rows.size()-2)+"]/td[1]/input")).click();
        driver.findElement(acloc.getButtonActions()).click();
        sleep(1000);
        driver.findElement(acloc.getDeployPackage()).click();
        sleep(5000);
        // Get a list of all hubs.
        String sHub = driver.findElement(acloc.getAvaliableHubs()).getText();
        String[] sHubs =sHub.split("\n");

        int RowCount = sHubs.length;
      //  System.out.println("RowCount: "+ RowCount);
        for(int i = 1; i < RowCount+1;i++){
            driver.findElement(By.xpath("/html/body/div[2]/div[3]/div[2]/div[2]/div/div[3]/div/div[2]/table/tbody/tr["+i+"]/td[1]/div/div[1]/input")).click();
            sleep(1000);
        }
        sleep(1000);
        ArrayList<String> alFailed = common.getCheckStatus(driver);
        return alFailed;
    }

    public void configure(String sUIMName, ArrayList<String> alFailed) {
        //Slow things down.
        boolean bFailed = false;
        int itotalConfigured = 0;
        sleep(2000);
        System.out.println("In CDM Configuration");
        int iRobotCount, iHubLoopCount, iRobotLoopCount = 1;
        iHubLoopCount = 1;
        String sName, sOS, sDomain, sHub;
      //  ProbeCommon common = new ProbeCommon(driver);
        int iHubCountL = common.leftTableCount();
        while(iHubLoopCount < iHubCountL+1){
            sleep(1000);
            if(iHubLoopCount == 1){
                driver.findElement(By.xpath("/html/body/div[2]/div[3]/div/div[2]/div[1]/div/div[2]/table/tbody/tr[1]")).click();
            }else{
                driver.findElement(By.xpath("/html/body/div[2]/div[3]/div/div[2]/div[1]/div/div[2]/table/tbody/tr[" + iHubLoopCount + "]/td[2]")).click();
            }
            sleep(1000);
            driver.findElement(acloc.getButtonRobots()).click();
            sDomain = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/ul/li[1]/span[2]")).getText();
            sHub= driver.findElement(acloc.getHubCrumb()).getText();
            sleep(1000);
            driver.findElement(acloc.getFirstRobot()).click();
            sleep(1000);
            iRobotCount = common.leftTableCount();
            sleep(1000);
            driver.findElement(acloc.getHubCrumb()).click();
            iRobotLoopCount=1;
            while (iRobotLoopCount < iRobotCount+1){
                sleep(1000);
                String temp =driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[3]/div[3]/div[1]/div/div[2]/table/tbody/tr["+iRobotLoopCount+"]/td[4]")).getAttribute("class");
                sOS = temp.substring(7);
                sName = driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[3]/div[3]/div[1]/div/div[2]/table/tbody/tr["+iRobotLoopCount+"]/td[5]")).getText();
               // System.out.println("sName: "+ sName);
                driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[3]/div[3]/div[1]/div/div[2]/table/tbody/tr["+iRobotLoopCount+"]/td[4]")).click();
                sleep(1000);
                driver.findElement(acloc.getButtonProbes()).click();
                sleep(1000);
               // System.out.println("sOS: "+sOS);
                System.out.println("1 bFailed; " + bFailed);
                for(int i = 0; i < alFailed.size(); i++){
                    if(alFailed.get(i).equalsIgnoreCase(sName)){
                        System.out.println(sName);
                        bFailed = true;
                    }else{}
                }
                if(bFailed == true) {
                    System.out.println("2 bFailed; " + bFailed);
                }else{
                   if(sOS.equalsIgnoreCase("windows")) {
                       System.out.println(sName);
                           driver.findElement((acloc.getSearchBox())).clear();
                           driver.findElement(acloc.getSearchBox()).sendKeys("cdm");
                           // Open the CDM probe configuration.
                           sleep(1000);
                           driver.findElement(By.xpath("(//input[@type='button'])[5]")).click();
                           sleep(1000);
                           // clicks on the configuration button.
                           sleep(1000);
                           WebElement link = driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div[1]/button"));
                           sleep(1000);
                           common.getNewTab(driver, link);
                           String base = common.getBaseBrowser(driver);
                           Set<String> set = common.getAllBrowsers(driver);
                           common.getProbeConfigTab(driver, base, set);
                           setWindowsCDMConfiguration(driver, sName, sOS);
                           common.saveProbeConfig();
                           driver.switchTo().window(base);
                    }else if(sOS.equalsIgnoreCase("LINUX")){
                        driver.findElement((acloc.getSearchBox())).clear();
                        driver.findElement(acloc.getSearchBox()).sendKeys("cdm");
                        // Open the CDM probe configuration.
                        sleep(1000);
                        driver.findElement(By.xpath("(//input[@type='button'])[5]")).click();
                        sleep(1000);
                        // clicks on the configuration button.
                        sleep(1000);
                        WebElement link = driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div[1]/button"));
                        common.getNewTab(driver, link);
                        String base = common.getBaseBrowser(driver);
                        Set<String> set = common.getAllBrowsers(driver);
                        common.getProbeConfigTab(driver, base, set);
                        setLinuxCDMConfiguration(driver, sName, sOS);
                        common.saveProbeConfig();
                        driver.switchTo().window(base);
                    }else if(sOS.equalsIgnoreCase("solaris")){
                        driver.findElement((acloc.getSearchBox())).clear();
                        driver.findElement(acloc.getSearchBox()).sendKeys("cdm");
                        // Open the CDM probe configuration.
                        sleep(1000);
                        driver.findElement(By.xpath("(//input[@type='button'])[5]")).click();
                        sleep(1000);
                        // clicks on the configuration button.
                        sleep(1000);
                        WebElement link = driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div[1]/button"));
                        common.getNewTab(driver, link);
                        String base = common.getBaseBrowser(driver);
                        Set<String> set = common.getAllBrowsers(driver);
                        common.getProbeConfigTab(driver, base, set);
                        setSolarisCDMConfiguration(driver, sName, sOS);
                        common.saveProbeConfig();
                        driver.switchTo().window(base);
                    }
                }

            bFailed = false;
            sleep(1000);
                driver.findElement(acloc.getHubCrumb()).click();

                itotalConfigured++;
                iRobotLoopCount++;
            }
            driver.findElement(acloc.getHubCrumb()).click();
            iHubLoopCount++;
        }
        System.out.println("Toatl number of CDM probes configured: "+ itotalConfigured);
    }
    public  void setWindowsCDMConfiguration(WebDriver driver,  String sName, String sOS) {
        //sleep(10000);
        waitUntilVisible(ACLocators.getCdmProbeInfo(), 10000);
        String[]   aPreValues = new String[6];
        long start = System.currentTimeMillis();


        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[2]/form/div[7]/ins")).click();
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[2]/form/div[9]/ins")).click();
        sleep(1000);
        common.getDiscardProbeConfig();
        waitUntilVisible(ACLocators.getCdmProbeInfo(), 5000);
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[2]/form/div[7]/ins")).click();
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[2]/form/div[9]/ins")).click();
        String sMemory= driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[2]/table/tbody/tr[7]/td[1]/span/span[3]/div")).getText();
        aPreValues[0] = "999999999";
        cdmConfig.setNameLevel(driver, aPreValues, sName);
        aPreValues[0] = "9999";
        aPreValues[1] = "9999";
        aPreValues[2] = "9999";
        cdmConfig.setDisks(driver, aPreValues, sOS);
        aPreValues[0] = "5";
        aPreValues[1] = "50";
        aPreValues[2] = "";
        aPreValues[3] = "";
        aPreValues[4] = "";
        aPreValues[5] = "";
        cdmConfig.setDiskHome(driver, aPreValues, sOS);
        aPreValues[0] = "80";
        aPreValues[1] = "75999";
        aPreValues[2] = "";
        aPreValues[3] = "";
        aPreValues[4] = "";
        aPreValues[5] = "";
       cdmConfig.setDiskHomeDiskUsage(driver, aPreValues, sOS);
        aPreValues[0] = "999";
        aPreValues[1] = "";
        aPreValues[2] = "";
        aPreValues[3] = "";
        aPreValues[4] = "";
        aPreValues[5] = "";
        cdmConfig.setDiskHomeDiskUsageChange(driver, aPreValues);
        cdmConfig.setMemory(driver, aPreValues, sOS,sMemory);
        aPreValues[0] = "5000";
        aPreValues[1] = "1000";
        aPreValues[2] = "";
        aPreValues[3] = "";
        aPreValues[4] = "";
        cdmConfig.setMemoryPaging(driver, aPreValues, sOS,sMemory);
        aPreValues[0] = "99";
        aPreValues[1] = "7000";
        aPreValues[2] = "50";
        aPreValues[3] = "50";
        aPreValues[4] = "";
        cdmConfig.setPhysicalMemory(driver, aPreValues, sOS, sMemory);
        aPreValues[0] = "75";
        aPreValues[1] = "8000";
        aPreValues[2] = "";
        aPreValues[3] = "";
        aPreValues[4] = "";
        cdmConfig.setSwapMemory(driver, aPreValues, sOS, sMemory);
       aPreValues[0] = "95";
        aPreValues[1] = "8000";
        aPreValues[2] = "";
        aPreValues[3] = "";
        aPreValues[4] = "";
        cdmConfig.setTotalMemory(driver, aPreValues, sOS, sMemory);
       aPreValues[0] = "300";
        aPreValues[1] = "150";
        aPreValues[2] = "150";
        aPreValues[3] = "";
        aPreValues[4] = "";
        cdmConfig.setNetwork(driver, aPreValues, sOS, sMemory);
        aPreValues[0] = "50";
        aPreValues[1] = "";
        aPreValues[2] = "";
        aPreValues[3] = "";
        aPreValues[4] = "";
        cdmConfig.setProcessor(driver, aPreValues, sOS, sMemory);
        aPreValues[0] = "99";
        aPreValues[1] = "75";
        aPreValues[2] = "85";
        aPreValues[3] = "75";
        aPreValues[4] = "50";
        cdmConfig.setIndividualCPU(driver, aPreValues, sOS, sMemory);
        aPreValues[0] = "99";
        aPreValues[1] = "50";
        aPreValues[2] = "50";
        aPreValues[3] = "50";
        aPreValues[4] = "50";
        cdmConfig.setTotalCPU(driver, aPreValues, sOS, sMemory);

        long end = System.currentTimeMillis();
        long totalSeconds = (end - start)/1000;
        long minutes = totalSeconds/60;
        long seconds = totalSeconds%60;
        System.out.println("Took: "+minutes+":"+seconds);
//        driver.findElement(By.name("predictiveValue")).clear();

    }

    public  void setLinuxCDMConfiguration(WebDriver driver, String sName, String sOS) {
        waitUntilVisible(ACLocators.getCdmProbeInfo(), 10000);
        //sleep(10000);
        String[]   aPreValues = new String[12];
        String sLocNmae = "/";
        long start = System.currentTimeMillis();

        System.out.println("cdm - General Configuration");
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[2]/form/div[9]/ins")).click();
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[2]/form/div[13]/ins")).click();
        sleep(1000);
        common.getDiscardProbeConfig();
        waitUntilVisible(ACLocators.getCdmProbeInfo(), 5000);
        //sleep(5000);
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[2]/form/div[9]/ins")).click();
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[2]/form/div[13]/ins")).click();
        String sMemory= driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[2]/table/tbody/tr[20]/td[1]/span/span[3]/div")).getText();
        aPreValues[0] = "999999999";
        cdmConfig.setNameLevel(driver, aPreValues, sName);
        aPreValues[0] = "9999";
        aPreValues[1] = "9999";
        aPreValues[2] = "9999";
        cdmConfig.setDisks(driver, aPreValues, sOS);
        aPreValues[0] = "5";
        aPreValues[1] = "50";
        aPreValues[2] = "";
        aPreValues[3] = "";
        aPreValues[4] = "";
        aPreValues[5] = "";
        cdmConfig.setDiskHome(driver, aPreValues, sOS);
        aPreValues[0] = "80";
        aPreValues[1] = "75999";
        aPreValues[2] = "";
        aPreValues[3] = "";
        aPreValues[4] = "";
        aPreValues[5] = "";
        cdmConfig.setDiskHomeDiskUsage(driver, aPreValues, sOS);
        aPreValues[0] = "999";
        aPreValues[1] = "";
        aPreValues[2] = "";
        aPreValues[3] = "";
        aPreValues[4] = "";
        aPreValues[5] = "";
        cdmConfig.setDiskHomeDiskUsageChange(driver, aPreValues);
        aPreValues[0] = "20";
        aPreValues[1] = "500000";
        aPreValues[2] = "";
        aPreValues[3] = "";
        aPreValues[4] = "";
        aPreValues[5] = "";
        cdmConfig.setDiskHomeInode(driver, aPreValues, sLocNmae);
        aPreValues[0] = "5";
        aPreValues[1] = "10";
        aPreValues[2] = "80";
        aPreValues[3] = "555";
        aPreValues[4] = "10";
        cdmConfig.setBootTop(driver, aPreValues);
        cdmConfig.setBootBottom(driver, aPreValues);
        cdmConfig.setBootDiskUsage(driver, aPreValues);
        cdmConfig.setBootDiskUsageChange(driver, aPreValues);
        aPreValues[0] = "5";
        aPreValues[1] = "60";
        aPreValues[2] = "";
        aPreValues[3] = "";
        aPreValues[4] = "";
        cdmConfig.setBootInode(driver, aPreValues);
        aPreValues[0] = "5";
        aPreValues[1] = "20";
        aPreValues[2] = "50";
        aPreValues[3] = "50";
        aPreValues[4] = "10";
        cdmConfig.setDevTop(driver, aPreValues);
        cdmConfig.setDevBottom(driver, aPreValues);
        cdmConfig.setDevDiskUsage(driver, aPreValues);
        cdmConfig.setDevDiskUsageChange(driver, aPreValues);
        aPreValues[0] = "10";
        aPreValues[1] = "15000";
        aPreValues[2] = "";
        aPreValues[3] = "";
        aPreValues[4] = "";
        cdmConfig.setDevInode(driver, aPreValues);
        aPreValues[0] = "5";
        aPreValues[1] = "20";
        aPreValues[2] = "50";
        aPreValues[3] = "50";
        aPreValues[4] = "10";
        cdmConfig.setDevShmTop(driver, aPreValues);
        cdmConfig.setDevShmBottom(driver, aPreValues);
        cdmConfig.setDevShmDiskUsage(driver, aPreValues);
        cdmConfig.setDevShmDiskUsageChange(driver, aPreValues);
        aPreValues[0] = "20";
        aPreValues[1] = "10";
        aPreValues[2] = "";
        aPreValues[3] = "";
        aPreValues[4] = "";
        cdmConfig.setDevShmInode(driver, aPreValues);

        if(!sMemory.equalsIgnoreCase("Memory")){
            // Do the iostat items first and than do rest.
            aPreValues[0] = "5";
            aPreValues[1] = "20";
            aPreValues[2] = "50";
            aPreValues[3] = "50";
            aPreValues[4] = "10";
            aPreValues[5] = "10";
            aPreValues[6] = "10";
            aPreValues[7] = "80";
            aPreValues[8] = "50";
            aPreValues[9] = "70";
            aPreValues[10] = "55";
            cdmConfig.setIostat1(driver, aPreValues, sOS,sMemory);
            cdmConfig.setIostat2(driver, aPreValues, sOS,sMemory);
            cdmConfig.setIostat3(driver, aPreValues, sOS,sMemory);

        }else{}

        cdmConfig.setMemory(driver, aPreValues, sOS,sMemory);
        aPreValues[0] = "5000";
        aPreValues[1] = "1000";
        aPreValues[2] = "";
        aPreValues[3] = "";
        aPreValues[4] = "";
        cdmConfig.setMemoryPaging(driver, aPreValues, sOS,sMemory);
        aPreValues[0] = "9";
        aPreValues[1] = "7000";
        aPreValues[2] = "50";
        aPreValues[3] = "50";
        aPreValues[4] = "";
        cdmConfig.setPhysicalMemory(driver, aPreValues, sOS, sMemory);
        aPreValues[0] = "75";
        aPreValues[1] = "8000";
        aPreValues[2] = "";
        aPreValues[3] = "";
        aPreValues[4] = "";
        cdmConfig.setSwapMemory(driver, aPreValues, sOS, sMemory);
        aPreValues[0] = "95";
        aPreValues[1] = "8000";
        aPreValues[2] = "";
        aPreValues[3] = "";
        aPreValues[4] = "";
        cdmConfig.setTotalMemory(driver, aPreValues, sOS, sMemory);
        aPreValues[0] = "150";
        aPreValues[1] = "150";
        aPreValues[2] = "150";
        aPreValues[3] = "";
        aPreValues[4] = "";
        cdmConfig.setNetwork(driver, aPreValues, sOS, sMemory);
        aPreValues[0] = "50";
        aPreValues[1] = "150";
        aPreValues[2] = "150";
        aPreValues[3] = "";
        aPreValues[4] = "";
        cdmConfig.setProcessor(driver, aPreValues, sOS, sMemory);
        aPreValues[0] = "99";
        aPreValues[1] = "75";
        aPreValues[2] = "85";
        aPreValues[3] = "75";
        aPreValues[4] = "50";
        cdmConfig.setIndividualCPU(driver, aPreValues, sOS, sMemory);
        aPreValues[0] = "99";
        aPreValues[1] = "50";
        aPreValues[2] = "50";
        aPreValues[3] = "50";
        aPreValues[4] = "50";
        cdmConfig.setTotalCPU(driver, aPreValues, sOS, sMemory);


        long end = System.currentTimeMillis();
        long totalSeconds = (end - start)/1000;
        long minutes = totalSeconds/60;
        long seconds = totalSeconds%60;
        System.out.println("Took: "+minutes+":"+seconds);

       // driver.findElement(By.name("predictiveValue")).clear();

    }

    public  void setSolarisCDMConfiguration(WebDriver driver, String sName, String sOS) {

        //sleep(10000);
        waitUntilVisible(ACLocators.getCdmProbeInfo(), 10000);
        String[]   aPreValues = new String[12];
        String sLocNmae = "/";
        long start = System.currentTimeMillis();


       System.out.println("cdm - General Configuration");
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[2]/form/div[9]/ins")).click();
        sleep(1000);
        common.getDiscardProbeConfig();
        waitUntilVisible(ACLocators.getCdmProbeInfo(), 5000);
        //sleep(5000);
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[2]/form/div[9]/ins")).click();
        String sMemory= driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[2]/table/tbody/tr[24]/td[1]/span/span[3]/div")).getText();

        aPreValues[0] = "999999999";
        cdmConfig.setNameLevel(driver, aPreValues, sName);
        aPreValues[0] = "9999";
        aPreValues[1] = "9999";
        aPreValues[2] = "9999";
        cdmConfig.setDisks(driver, aPreValues, sOS);
        aPreValues[0] = "5";
        aPreValues[1] = "";
        aPreValues[2] = "";
        aPreValues[3] = "";
        aPreValues[4] = "";
        aPreValues[5] = "";
        cdmConfig.setDiskHome(driver, aPreValues, sLocNmae);
        aPreValues[0] = "80";
        aPreValues[1] = "75999";
        aPreValues[2] = "";
        aPreValues[3] = "";
        aPreValues[4] = "";
        aPreValues[5] = "";
        cdmConfig.setDiskHomeDiskUsage(driver, aPreValues, sLocNmae);
        aPreValues[0] = "999";
        aPreValues[1] = "";
        aPreValues[2] = "";
        aPreValues[3] = "";
        aPreValues[4] = "";
        aPreValues[5] = "";
        cdmConfig.setDiskHomeDiskUsageChange(driver, aPreValues);
        aPreValues[0] = "20";
        aPreValues[1] = "500000";
        aPreValues[2] = "";
        aPreValues[3] = "";
        aPreValues[4] = "";
        aPreValues[5] = "";
        cdmConfig.setDiskHomeInode(driver, aPreValues, sLocNmae);
        aPreValues[0] = "5";
        aPreValues[1] = "10";
        aPreValues[2] = "80";
        aPreValues[3] = "555";
        aPreValues[4] = "10";
        cdmConfig.setBootTop(driver, aPreValues);
        cdmConfig.setBootDiskUsage(driver, aPreValues);
        cdmConfig.setBootDiskUsageChange(driver, aPreValues);
        aPreValues[0] = "5";
        aPreValues[1] = "60";
        aPreValues[2] = "";
        aPreValues[3] = "";
        aPreValues[4] = "";
        cdmConfig.setBootInode(driver, aPreValues);
        aPreValues[0] = "5";
        aPreValues[1] = "20";
        aPreValues[2] = "50";
        aPreValues[3] = "50";
        aPreValues[4] = "10";
        cdmConfig.setDevTop(driver, aPreValues);
        cdmConfig.setDevDiskUsage(driver, aPreValues);
        cdmConfig.setDevDiskUsageChange(driver, aPreValues);
        aPreValues[0] = "10";
        aPreValues[1] = "15000";
        aPreValues[2] = "";
        aPreValues[3] = "";
        aPreValues[4] = "";
        cdmConfig.setDevInode(driver, aPreValues);
        aPreValues[0] = "5";
        aPreValues[1] = "20";
        aPreValues[2] = "50";
        aPreValues[3] = "50";
        aPreValues[4] = "10";
        sLocNmae = "/tmp";
        cdmConfig.setDevShmTop(driver, aPreValues);
        cdmConfig.setDevShmDiskUsage(driver, aPreValues);
        cdmConfig.setDevShmDiskUsageChange(driver, aPreValues);
        aPreValues[0] = "20";
        aPreValues[1] = "10";
        aPreValues[2] = "";
        aPreValues[3] = "";
        aPreValues[4] = "";
        cdmConfig.setDevShmInode(driver, aPreValues);
        aPreValues[0] = "50";
        aPreValues[1] = "";
        aPreValues[2] = "";
        aPreValues[3] = "";
        aPreValues[4] = "";
        cdmConfig.serVarRun(driver, aPreValues);
        aPreValues[0] = "75";
        aPreValues[1] = "999999";
        aPreValues[2] = "";
        aPreValues[3] = "";
        aPreValues[4] = "";
        cdmConfig.serVarRunDiskUsage(driver, aPreValues);
        aPreValues[0] = "7500";
        aPreValues[1] = "";
        aPreValues[2] = "";
        aPreValues[3] = "";
        aPreValues[4] = "";
        cdmConfig.serVarRunDiskUsageChange(driver, aPreValues);
        aPreValues[0] = "20";
        aPreValues[1] = "10";
        aPreValues[2] = "";
        aPreValues[3] = "";
        aPreValues[4] = "";
        cdmConfig.serVarRunInodeUsage(driver, aPreValues);
        if(!sMemory.equalsIgnoreCase("Memory")){
            // Do the iostat items first and than do rest.
            aPreValues[0] = "5";
            aPreValues[1] = "20";
            aPreValues[2] = "50";
            aPreValues[3] = "50";
            aPreValues[4] = "10";
            aPreValues[5] = "10";
            aPreValues[6] = "10";
            aPreValues[7] = "80";
            aPreValues[8] = "50";
            aPreValues[9] = "70";
            aPreValues[10] = "55";
            cdmConfig.setIostat1(driver, aPreValues, sOS,sMemory);
            cdmConfig.setIostat2(driver, aPreValues, sOS,sMemory);
            cdmConfig.setIostat3(driver, aPreValues, sOS,sMemory);
            cdmConfig.setIostat4(driver, aPreValues, sOS,sMemory);
        }else{}
        cdmConfig.setMemory(driver, aPreValues, sOS, sMemory);
        aPreValues[0] = "5000";
        aPreValues[1] = "1000";
        aPreValues[2] = "";
        aPreValues[3] = "";
        aPreValues[4] = "";
        cdmConfig.setMemoryPaging(driver, aPreValues, sOS,sMemory);
        aPreValues[0] = "9";
        aPreValues[1] = "7000";
        aPreValues[2] = "50";
        aPreValues[3] = "50";
        aPreValues[4] = "";
        cdmConfig.setPhysicalMemory(driver, aPreValues, sOS, sMemory);
        aPreValues[0] = "75";
        aPreValues[1] = "8000";
        aPreValues[2] = "";
        aPreValues[3] = "";
        aPreValues[4] = "";
        cdmConfig.setSwapMemory(driver, aPreValues, sOS, sMemory);
        aPreValues[0] = "95";
        aPreValues[1] = "8000";
        aPreValues[2] = "";
        aPreValues[3] = "";
        aPreValues[4] = "";
        cdmConfig.setTotalMemory(driver, aPreValues, sOS, sMemory);
        aPreValues[0] = "50";
        aPreValues[1] = "150";
        aPreValues[2] = "150";
        aPreValues[3] = "";
        aPreValues[4] = "";
        cdmConfig.setProcessor(driver, aPreValues, sOS, sMemory);
        System.out.println(":CARY: "+driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[2]/table/tbody/tr[35]/td[1]/span/span[3]/div")).getText());
        if(driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[2]/table/tbody/tr[35]/td[1]/span/span[3]/div")).getText().equalsIgnoreCase("Individual CPU")){
            sMemory = driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[2]/table/tbody/tr[35]/td[1]/span/span[3]/div")).getText();
            aPreValues[0] = "99";
            aPreValues[1] = "75";
            aPreValues[2] = "85";
            aPreValues[3] = "75";
            aPreValues[4] = "50";
            cdmConfig.setIndividualCPU(driver, aPreValues, sOS, sMemory);
        }else{}
        aPreValues[0] = "99";
        aPreValues[1] = "50";
        aPreValues[2] = "50";
        aPreValues[3] = "50";
        aPreValues[4] = "50";
        cdmConfig.setTotalCPU(driver, aPreValues, sOS, sMemory);

        long end = System.currentTimeMillis();
        long totalSeconds = (end - start)/1000;
        long minutes = totalSeconds/60;
        long seconds = totalSeconds%60;
        System.out.println("Took: "+minutes+":"+seconds);
       // driver.findElement(By.name("predictiveValue")).clear();

    }


}

