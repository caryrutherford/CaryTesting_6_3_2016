package com.ca.cary.testing.adminConsole.pages;

import com.ca.cary.testing.common.ActionsDriver;
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by rutca02 on 4/12/2016.
 *
 * 4/27/2016 Start Lines 1817 End 1789; 4/28/2016 Start Lines 1789 End 1775; 4/29/2016 Start Lines 1775  End 1762; 5/2/2016 Start Lines 1762  End 1711; 5/3/2016 Start Lines 1711  End 1727
 * 5/4/2016 Start Lines 1727  End 1703
 */
public class CDMProbeConfiguration extends ActionsDriver {
    public CDMProbeConfiguration(WebDriver driver) {super(driver);}
    private boolean bTest = false;
    public void setGeneralConfiguration(WebDriver driver) {
        String sName = driver.findElement(By.xpath("<span title=\"\" class=\"mightOverflow rhsHeaderTitle\" mytitle=\"\">cdm</span>")).getText() + " - " +
                driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[2]/div")).getText();
       if(bTest == true){
            System.out.println(sName);
        }else {}
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[2]/form/div[9]/ins")).click();
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[2]/form/div[13]/ins")).click();
        driver.findElement(By.name("predictiveValue")).clear();
    }
    public void setNameLevel(WebDriver driver, String[] aPreValues, String sName) {
        String sTemp = sName + " - "+driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[1]/div")).getText();
        if(bTest == true){
            System.out.println(sTemp);
        }else {}
        driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[2]/table/tbody/tr[2]/td[1]/span/span[3]/div")).click();
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[1]/form/div[1]/ins")).click();
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[1]/form/div[3]/ins")).click();
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[1]/form/div[5]/ins")).click();
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[1]/form/span[5]/input")).sendKeys("85");
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[1]/form/span[7]/input")).sendKeys("75");
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[1]/form/span[9]/input")).sendKeys("65");
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[1]/form/span[11]/input")).sendKeys("55");
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[1]/form/span[13]/input")).sendKeys("45");
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[1]/form/div[23]/ins")).click();
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[1]/form/span[21]/input")).sendKeys("1");
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[1]/form/span[23]/input")).sendKeys("1");
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[1]/form/div[26]/div[1]/span[3]/span[1]")).click();
        sleep(1000);
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[1]/form/div[26]/div[2]/ul/li[3]/span")).click();
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[1]/form/div[31]/ins")).click();
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[1]/form/span[32]/input")).sendKeys("30");
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[1]/form/div[34]/div[1]")).click();
        sleep(1000);
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[1]/form/div[34]/div[2]/ul/li[2]/span")).click();
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[1]/form/span[35]/input")).sendKeys(aPreValues[0]);
        sTemp = sName + " - " + driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[2]/div")).getText() +
                " - "+ driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[2]/form/label[2]")).getText();
        if(bTest == true){
            System.out.println(sName + " - System Reboot - System Reboot");
        }else {}
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[2]/form/div[1]/ins")).click();
    }

    /*******************************************************************************************************************
     * Author: rutca01
     * @param driver
     * Used in: Linux, Solaris, and Windows.
     ******************************************************************************************************************/
    public void setDisks(WebDriver driver, String[] aPreValues, String sOS) {
        int loopCount;
        int loopArray = 0;
        String sTemp, sName;
        if(sOS.equalsIgnoreCase("Windows")) {
            loopCount = 8;
        }else if(sOS.equalsIgnoreCase("LINUX")) {
            loopCount = 8;
        }else{
            loopCount =4;
        }
        driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[2]/table/tbody/tr[3]/td[1]/span/span[3]/div")).click();
        sName= driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div/div/span")).getText();
        if(bTest == true){
            System.out.println(sName);
        }else {}
        driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[2]/table/tbody/tr[3]/td[1]/span/span[3]")).click();
        sTemp = sName+" - "+ driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[2]/div")).getText();
        if(bTest == true){
            System.out.println(sTemp);
        }else {}
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[2]/form/div[1]/ins")).click();
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[3]/form/div[4]/ins")).click();
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[3]/form/div[10]/ins")).click();
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[3]/form/div[16]/ins")).click();
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[3]/form/div[18]/ins")).click();
        sTemp = sName+" - "+ driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[4]/div")).getText();
        if(bTest == true){
            System.out.println(sTemp);
        }else {}
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[4]/form/div[4]/ins")).click();
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[4]/form/div[10]/ins")).click();
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[4]/form/div[16]/ins")).click();
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[4]/form/div[18]/ins")).click();

        sTemp = sName+" - "+ driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[5]/div")).getText();
        if(bTest == true){
            System.out.println(sTemp);
        }else {}
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[5]/form/div[7]/ins")).click();
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[5]/form/div[13]/ins")).click();
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[5]/form/div[19]/ins")).click();

        for(int i = 6; i < loopCount+1; i++) {
            sTemp = sName+" - "+driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div["+i+"]/div")).getText() + " - "+
                    driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div["+i+"]/form/label[2]")).getText();
            if(bTest == true){
                System.out.println(sTemp);
            }else {}
            driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div["+i+"]/form/div[1]/ins")).click();
            driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div["+i+"]/form/div[2]/ins")).click();
            driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div["+i+"]/form/div[8]/ins")).click();
            driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div["+i+"]/form/div[15]/ins")).click();
            driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div["+i+"]/form/div[17]/ins")).click();
            driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div["+i+"]/form/span[15]/input")).sendKeys("85");
            driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div["+i+"]/form/span[17]/input")).sendKeys("75");
            driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div["+i+"]/form/span[19]/input")).sendKeys("65");
            driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div["+i+"]/form/span[21]/input")).sendKeys("55");
            driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div["+i+"]/form/span[23]/input")).sendKeys("45");
            driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div["+i+"]/form/div[35]/ins")).click();
            driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div["+i+"]/form/span[31]/input")).sendKeys("1");
            driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div["+i+"]/form/span[33]/input")).sendKeys("1");
            driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div["+i+"]/form/div[38]/div[1]/span[3]/span[1]")).click();
            sleep(1000);
            driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div["+i+"]/form/div[38]/div[2]/ul/li[3]/span")).click();
            driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div["+i+"]/form/div[43]/ins")).click();
            driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div["+i+"]/form/span[42]/input")).sendKeys("30");
            driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div["+i+"]/form/div[46]/div[1]/span[3]/span[1]")).click();
            sleep(1000);
            driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div["+i+"]/form/div[46]/div[2]/ul/li[2]/span")).click();
            driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div["+i+"]/form/span[45]/input")).sendKeys(aPreValues[loopArray]);
            loopArray++;
        }
    }

    /*******************************************************************************************************************
     * Author: rutca01
     * @param driver
     * @param aPreValues
     * Used In; Linuix, Solaris, and Windows
     ******************************************************************************************************************/
   public void setDiskHome(WebDriver driver, String[] aPreValues, String sOS) {
       int loopCount;
       int loopArray = 0;
       String sTemp, sName;
       if (sOS.equalsIgnoreCase("Windows")) {
           loopCount = 2;
       } else if (sOS.equalsIgnoreCase("LINUX")) {
           loopCount = 2;
       } else {
           loopCount = 1;
       }
       driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[2]/table/tbody/tr[4]/td[1]/span/span[3]/div")).click();
       sName = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div/div/span")).getText();
       if(bTest == true){
           System.out.println(sName);
       }else {}
       sTemp = sName + " - " + driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[1]/div")).getText()
               + " - " + driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[1]/form/label[2]")).getText();
       if(bTest == true){
           System.out.println(sTemp);
       }else {}
       driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[1]/form/div[1]/ins")).click();
       driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[1]/form/div[2]/ins")).click();
       driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[1]/form/div[6]/ins")).click();
       driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[1]/form/div[8]/ins")).click();
       driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[1]/form/span[6]/input")).sendKeys("85");
       driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[1]/form/span[8]/input")).sendKeys("75");
       driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[1]/form/span[10]/input")).sendKeys("65");
       driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[1]/form/span[12]/input")).sendKeys("55");
       driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[1]/form/span[14]/input")).sendKeys("45");
       driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[1]/form/div[26]/ins")).click();
       driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[1]/form/span[22]/input")).sendKeys("1");
       driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[1]/form/span[24]/input")).sendKeys("1");
       driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[1]/form/div[29]/div[1]/span[3]/span[1]")).click();
       sleep(1000);
       driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[1]/form/div[29]/div[2]/ul/li[3]/span")).click();
       driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[1]/form/div[34]/ins")).click();
       driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[1]/form/span[33]/input")).sendKeys("30");
       driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[1]/form/div[37]/div[1]/span[3]/span[1]")).click();
       sleep(1000);
       driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[1]/form/div[37]/div[2]/ul/li[2]/span")).click();
       driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[1]/form/span[36]/input")).sendKeys(aPreValues[0]);
       if ((sOS.equalsIgnoreCase("windows")) || sOS.equalsIgnoreCase("LINUX")){
           sTemp = sName + " - " + driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[2]/div")).getText()
                   + " - " + driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[2]/form/label[2]")).getText();
           if(bTest == true){
               System.out.println(sTemp);
           }else {}
           driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[2]/form/div[1]/ins")).click();
           driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[2]/form/div[3]/ins")).click();
           driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[2]/form/div[5]/ins")).click();
           driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[2]/form/span[5]/input")).sendKeys("85");
           driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[2]/form/span[7]/input")).sendKeys("75");
           driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[2]/form/span[9]/input")).sendKeys("65");
           driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[2]/form/span[11]/input")).sendKeys("55");
           driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[2]/form/span[13]/input")).sendKeys("45");
           driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[2]/form/div[23]/ins")).click();
           driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[2]/form/span[21]/input")).sendKeys("1");
           driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[2]/form/span[23]/input")).sendKeys("1");
           driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[2]/form/div[26]/div[1]/span[3]/span[1]")).click();
           sleep(1000);
           driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[2]/form/div[26]/div[2]/ul/li[3]/span")).click();
           driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[2]/form/div[31]/ins")).click();
           driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[2]/form/span[32]/input")).sendKeys("30");
           driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[2]/form/div[34]/div[1]/span[3]/span[1]")).click();
           sleep(1000);
           driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[2]/form/div[34]/div[2]/ul/li[2]/span")).click();
           driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[2]/form/span[35]/input")).sendKeys(aPreValues[1]);
        }
    }
    /*******************************************************************************************************************
     * Author: rutca01
     * @param driver
     * @param aPreValues
     * USed In; Linuix, Solaris, and Windows
     ******************************************************************************************************************/
    public void setDiskHomeDiskUsage(WebDriver driver, String[] aPreValues, String sOS) {
        int loopCount = 3;
        int loopArray = 0;
        String sTemp, sName;
        driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[2]/table/tbody/tr[5]/td[1]/span/span[3]/div")).click();
        sName = driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[2]/table/tbody/tr[4]/td[1]/span")).getText()
                +" - "+driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div/div/span")).getText();
        if(bTest == true){
            System.out.println(sName);
        }else {}
        sTemp = sName +" - "+driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div/div/span")).getText()
                + " - " + driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[1]/div")).getText();
        if(bTest == true){
            System.out.println(sTemp);
        }else {}
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[1]/form/div[4]/ins")).click();
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[1]/form/div[10]/ins")).click();
        for(int i = 2; i < loopCount+1; i++) {
            sTemp = sName + " - " + driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[" + i + "]/div")).getText()
                    + " - " + driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div["+i+"]/form/label[2]")).getText();
            if(bTest == true){
                System.out.println(sTemp);
            }else {}
            driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div["+i+"]/form/div[1]/ins")).click();
            driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div["+i+"]/form/div[3]/ins")).click();
            driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div["+i+"]/form/div[5]/ins")).click();
            driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div["+i+"]/form/span[5]/input")).sendKeys("85");
            driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div["+i+"]/form/span[7]/input")).sendKeys("75");
            driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div["+i+"]/form/span[9]/input")).sendKeys("65");
            driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div["+i+"]/form/span[11]/input")).sendKeys("55");
            driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div["+i+"]/form/span[13]/input")).sendKeys("45");
            driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div["+i+"]/form/div[23]/ins")).click();
            driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div["+i+"]/form/span[21]/input")).sendKeys("1");
            driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div["+i+"]/form/span[23]/input")).sendKeys("1");
            driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div["+i+"]/form/div[26]/div[1]/span[3]/span[1]")).click();
            sleep(1000);
            driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div["+i+"]/form/div[26]/div[2]/ul/li[3]/span")).click();
            driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div["+i+"]/form/div[31]/ins")).click();
            driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div["+i+"]/form/span[32]/input")).sendKeys("30");
            driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div["+i+"]/form/div[34]/div[1]/span[3]/span[1]")).click();
            sleep(1000);
            driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div["+i+"]/form/div[34]/div[2]/ul/li[2]/span")).click();
            driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div["+i+"]/form/span[35]/input")).sendKeys(aPreValues[loopArray]);
            loopArray++;
        }
    }
    /*******************************************************************************************************************
     * Author: rutca01
     * @param driver
     * @param aPreValues
     * USed In; Linuix, Solaris, and Windows
     ******************************************************************************************************************/
    public void setDiskHomeDiskUsageChange(WebDriver driver, String[] aPreValues) {
        String sTemp, sName;
       driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[2]/table/tbody/tr[6]/td[1]/span/span[3]/div")).click();
        sName = driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[2]/table/tbody/tr[4]/td[1]/span")).getText()
                +" - "+driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div/div/span")).getText();
        if(bTest == true){
            System.out.println(sName);
        }else {}
        sTemp = sName +" - "+driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div/div/span")).getText()
                + " - " + driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[1]/div")).getText();
        if(bTest == true){
            System.out.println(sTemp);
        }else {}
       driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[1]/form/div[1]/ins")).click();
       driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[1]/form/div[8]/ins")).click();
       driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[1]/form/div[14]/ins")).click();
       driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[1]/form/div[21]/ins")).click();
       driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[1]/form/div[23]/ins")).click();
       driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[1]/form/span[15]/input")).sendKeys("85");
       driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[1]/form/span[17]/input")).sendKeys("75");
       driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[1]/form/span[19]/input")).sendKeys("65");
       driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[1]/form/span[21]/input")).sendKeys("55");
       driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[1]/form/span[23]/input")).sendKeys("45");
       driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[1]/form/div[41]/ins")).click();
       driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[1]/form/span[31]/input")).sendKeys("1");
       driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[1]/form/span[33]/input")).sendKeys("1");
       driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[1]/form/div[44]/div[1]/span[3]/span[1]")).click();
       sleep(1000);
       driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[1]/form/div[44]/div[2]/ul/li[3]/span")).click();
       driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[1]/form/div[49]/ins")).click();
       driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[1]/form/span[42]/input")).sendKeys("30");
       driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[1]/form/div[52]/div[1]/span[3]/span[1]")).click();
       sleep(1000);
       driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[1]/form/div[52]/div[2]/ul/li[2]/span")).click();
       driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[1]/form/span[45]/input")).sendKeys(aPreValues[0]);
   }

    public void setMemory(WebDriver driver, String[] aPreValues, String sOS, String sMemory) {
        int loopCount = 3;
        int loopArray = 0;
        String sTemp, sName;

        /// Used for going to memory based on location for OS.
        if (sOS.equalsIgnoreCase("windows")) {
            driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[2]/table/tbody/tr[7]/td[1]/span/span[3]/div")).click();
        } else if (sOS.equalsIgnoreCase("linux")) {
            if (sMemory.equalsIgnoreCase("iostat")) {
                driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[2]/table/tbody/tr[24]/td[1]/span/span[3]/div")).click();
            } else {
                driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[2]/table/tbody/tr[20]/td[1]/span/span[3]/div")).click();
            }
        } else if (sOS.equalsIgnoreCase("solaris")) {
            if (sMemory.equalsIgnoreCase("iostat")) {
                driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[2]/table/tbody/tr[29]/td[1]/span/span[3]/div")).click();
            } else {
                driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[2]/table/tbody/tr[24]/td[1]/span/span[3]/div")).click();
            }
        } else {}
        sName = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div/div/span")).getText();
        if(bTest == true){
            System.out.println(sName);
        }else {}
        sTemp = sName + " - " + driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[1]/div")).getText();
        if(bTest == true){
            System.out.println(sTemp);
        }else {}
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[1]/form/div[4]/ins")).click();
    }

    public void setMemoryPaging(WebDriver driver, String[] aPreValues, String sOS, String sMemory) {
        int loopCount = 3;
        int loopArray = 0;
        String sTemp, sName;
        if(sOS.equalsIgnoreCase("windows")){
            driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[2]/table/tbody/tr[8]/td[1]/span/span[3]/div")).click();
        } else if(sOS.equalsIgnoreCase("linux")){
            if (sMemory.equalsIgnoreCase("iostat")) {
                driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[2]/table/tbody/tr[25]/td[1]/span/span[3]/div")).click();
            }else {
                driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[2]/table/tbody/tr[21]/td[1]/span/span[3]/div")).click();
            }
        } else if(sOS.equalsIgnoreCase("solaris")){
            if (sMemory.equalsIgnoreCase("iostat")) {
                driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[2]/table/tbody/tr[30]/td[1]/span/span[3]/div")).click();
            }else {
                driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[2]/table/tbody/tr[30]/td[1]/span/span[3]/div")).click();
            }
        }else{}
        sName = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div/div/span")).getText();
        if(bTest == true){
            System.out.println(sName);
        }else {}
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[1]/form/div[4]/ins")).click();
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[1]/form/div[10]/ins")).click();

        for(int i = 2; i < loopCount+1; i++) {
            sTemp = sName + " - " + driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[" + i + "]/div")).getText()
                    + " - " + driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[" + i + "]/form/label[2]")).getText();
            if(bTest == true){
                System.out.println(sTemp);
            }else {}
            driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div["+i+"]/form/div[1]/ins")).click();
            driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div["+i+"]/form/div[3]/ins")).click();
            driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div["+i+"]/form/div[5]/ins")).click();
            sleep(1000);
            driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div["+i+"]/form/span[5]/input")).sendKeys("85");
            driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div["+i+"]/form/span[7]/input")).sendKeys("75");
            driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div["+i+"]/form/span[9]/input")).sendKeys("65");
            driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div["+i+"]/form/span[11]/input")).sendKeys("55");
            driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div["+i+"]/form/span[13]/input")).sendKeys("45");
            driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div["+i+"]/form/div[23]/ins")).click();
            driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div["+i+"]/form/span[21]/input")).sendKeys("1");
            driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div["+i+"]/form/span[23]/input")).sendKeys("1");
            driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div["+i+"]/form/div[26]/div[1]/span[3]/span[1]")).click();
            sleep(1000);
            driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div["+i+"]/form/div[26]/div[2]/ul/li[3]/span")).click();
            driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div["+i+"]/form/div[31]/ins")).click();
            driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div["+i+"]/form/span[32]/input")).sendKeys("30");
            driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div["+i+"]/form/div[34]/div[1]/span[3]/span[1]")).click();
            sleep(1000);
            driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div["+i+"]/form/div[34]/div[2]/ul/li[2]/span")).click();
            driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div["+i+"]/form/span[35]/input")).sendKeys(aPreValues[loopArray]);
            loopArray++;
        }
    }
    public void setPhysicalMemory(WebDriver driver, String[] aPreValues, String sOS, String sMemory) {
        int loopCount = 0 ;
        int loopArray = 0;
        String sTemp, sName;
        if (sOS.equalsIgnoreCase("windows")) {
            driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[2]/table/tbody/tr[9]/td[1]/span/span[3]/div")).click();
            loopCount = 4;
        } else if (sOS.equalsIgnoreCase("linux")) {
            loopCount = 4;
            if (sMemory.equalsIgnoreCase("iostat")) {
                driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[2]/table/tbody/tr[26]/td[1]/span/span[3]/div")).click();
            }else {
                driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[2]/table/tbody/tr[22]/td[1]/span/span[3]/div")).click();
            }
        } else if (sOS.equalsIgnoreCase("solaris")) {
            loopCount = 2;
            if (sMemory.equalsIgnoreCase("iostat")) {
                driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[2]/table/tbody/tr[31]/td[1]/span/span[3]/div")).click();
            }else {
                driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[2]/table/tbody/tr[31]/td[1]/span/span[3]/div")).click();
            }
        } else {
        }
        sName =driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div/div/span")).getText();
        if(bTest == true){
            System.out.println(sName);
        }else {}
        sTemp = sName + " - " + driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[1]/div")).getText()
                + " - " + driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[1]/form/label[2]")).getText();
        if(bTest == true){
            System.out.println(sTemp);
        }else {}
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[1]/form/div[1]/ins")).click();
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[1]/form/div[2]/ins")).click();
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[1]/form/div[8]/ins")).click();
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[1]/form/div[15]/ins")).click();
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[1]/form/div[17]/ins")).click();
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[1]/form/span[13]/input")).sendKeys("85");
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[1]/form/span[15]/input")).sendKeys("75");
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[1]/form/span[17]/input")).sendKeys("65");
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[1]/form/span[19]/input")).sendKeys("55");
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[1]/form/span[21]/input")).sendKeys("45");
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[1]/form/div[35]/ins")).click();
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[1]/form/span[29]/input")).sendKeys("1");
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[1]/form/span[31]/input")).sendKeys("1");
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[1]/form/div[38]/div[1]/span[3]/span[1]")).click();
        sleep(1000);
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[1]/form/div[38]/div[2]/ul/li[3]/span")).click();
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[1]/form/div[43]/ins")).click();
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[1]/form/span[40]/input")).sendKeys("30");
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[1]/form/div[46]/div[1]/span[3]/span[1]")).click();
        sleep(1000);
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[1]/form/div[46]/div[2]/ul/li[2]/span")).click();
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[1]/form/span[43]/input")).sendKeys(aPreValues[loopArray]);
        loopArray++;
        sTemp = sName + " - " + driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[1]/div")).getText()
            + " - " + driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[2]/form/label[2]")).getText();
        if(bTest == true){
            System.out.println(sTemp);
        }else {}
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[2]/form/div[1]/ins")).click();
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[2]/form/div[3]/ins")).click();
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[2]/form/div[5]/ins")).click();
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[2]/form/span[5]/input")).sendKeys("85");
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[2]/form/span[7]/input")).sendKeys("75");
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[2]/form/span[9]/input")).sendKeys("65");
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[2]/form/span[11]/input")).sendKeys("55");
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[2]/form/span[13]/input")).sendKeys("45");
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[2]/form/div[23]/ins")).click();
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[2]/form/span[21]/input")).sendKeys("1");
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[2]/form/span[23]/input")).sendKeys("1");
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[2]/form/div[26]/div[1]/span[3]/span[1]")).click();
        sleep(1000);
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[2]/form/div[26]/div[2]/ul/li[3]/span")).click();
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[2]/form/div[31]/ins")).click();
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[2]/form/span[32]/input")).sendKeys("30");
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[2]/form/div[34]/div[1]/span[3]")).click();
        sleep(1000);
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[2]/form/div[34]/div[2]/ul/li[2]/span")).click();
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[2]/form/span[35]/input")).sendKeys(aPreValues[loopArray]);
        loopArray++;
        for(int i = 3; i < loopCount+1; i++) {
            sTemp = sName + " - " + driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[" + i + "]/div")).getText()
                    + " - " + driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[" + i + "]/form/label[2]")).getText();
            if(bTest == true){
                System.out.println(sTemp);
            }else {}
            driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[" + i + "]/form/div[1]/ins")).click();
            driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[" + i + "]/form/div[2]/ins")).click();
            driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[" + i + "]/form/div[8]/ins")).click();
            driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[" + i + "]/form/div[15]/ins")).click();
            driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[" + i + "]/form/div[17]/ins")).click();
            driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[" + i + "]/form/span[15]/input")).sendKeys("85");
            driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[" + i + "]/form/span[17]/input")).sendKeys("75");
            driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[" + i + "]/form/span[19]/input")).sendKeys("65");
            driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[" + i + "]/form/span[21]/input")).sendKeys("55");
            driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[" + i + "]/form/span[23]/input")).sendKeys("45");
            driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[" + i + "]/form/div[35]/ins")).click();
            driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[" + i + "]/form/span[31]/input")).sendKeys("1");
            driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[" + i + "]/form/span[33]/input")).sendKeys("1");
            driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[" + i + "]/form/div[38]/div[1]/span[3]/span[1]")).click();
            sleep(1000);
            driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[" + i + "]/form/div[38]/div[2]/ul/li[3]/span")).click();
            driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[" + i + "]/form/div[43]/ins")).click();
            driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[" + i + "]/form/span[42]/input")).sendKeys("30");
            driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[" + i + "]/form/div[46]/div[1]/span[3]/span[1]")).click();
            sleep(1000);
            driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[" + i + "]/form/div[46]/div[2]/ul/li[2]/span")).click();
            driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[" + i + "]/form/span[45]/input")).sendKeys(aPreValues[loopArray]);
            loopArray++;
        }
    }
    public void setSwapMemory(WebDriver driver, String[] aPreValues, String sOS, String sMemory){
        String sTemp, sName;
        if(sOS.equalsIgnoreCase("windows")){
            driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[2]/table/tbody/tr[10]/td[1]/span/span[3]/div")).click();
        } else if(sOS.equalsIgnoreCase("linux")){
            if (sMemory.equalsIgnoreCase("iostat")) {
                driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[2]/table/tbody/tr[27]/td[1]/span/span[3]/div")).click();
            }else {
                driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[2]/table/tbody/tr[23]/td[1]/span/span[3]/div")).click();
            }
        } else if(sOS.equalsIgnoreCase("solaris")){
            driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[2]/table/tbody/tr[32]/td[1]/span/span[3]/div")).click();
        }else{}
        sName = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div/div/span")).getText();
        if(bTest == true){
            System.out.println(sName);
        }else {}
        sTemp = sName + " - " + driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[1]/div")).getText()
                + " - " + driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[1]/div")).getText();
        if(bTest == true){
            System.out.println(sTemp);
        }else {}
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[1]/form/div[1]/ins")).click();
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[1]/form/div[2]/ins")).click();
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[1]/form/div[8]/ins")).click();
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[1]/form/div[15]/ins")).click();
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[1]/form/div[17]/ins")).click();
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[1]/form/span[13]/input")).sendKeys("85");
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[1]/form/span[15]/input")).sendKeys("75");
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[1]/form/span[17]/input")).sendKeys("65");
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[1]/form/span[19]/input")).sendKeys("55");
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[1]/form/span[21]/input")).sendKeys("45");
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[1]/form/div[35]/ins")).click();
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[1]/form/span[29]/input")).sendKeys("1");
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[1]/form/span[31]/input")).sendKeys("1");
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[1]/form/div[38]/div[1]/span[3]/span[1]")).click();
        sleep(1000);
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[1]/form/div[38]/div[2]/ul/li[3]/span")).click();
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[1]/form/div[43]/ins")).click();
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[1]/form/span[40]/input")).sendKeys("30");
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[1]/form/div[46]/div[1]/span[3]/span[1]")).click();
        sleep(1000);
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[1]/form/div[46]/div[2]/ul/li[2]/span")).click();
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[1]/form/span[43]/input")).sendKeys(aPreValues[0]);
        sTemp = sName + " - " + driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[2]/div")).getText()
                + " - " + driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[2]/form/label[2]")).getText();
        if(bTest == true){
            System.out.println(sTemp);
        }else {}
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[2]/form/div[1]/ins")).click();
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[2]/form/div[3]/ins")).click();
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[2]/form/div[5]/ins")).click();
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[2]/form/span[5]/input")).sendKeys("85");
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[2]/form/span[7]/input")).sendKeys("75");
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[2]/form/span[9]/input")).sendKeys("65");
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[2]/form/span[11]/input")).sendKeys("55");
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[2]/form/span[13]/input")).sendKeys("45");
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[2]/form/div[23]/ins")).click();
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[2]/form/span[21]/input")).sendKeys("1");
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[2]/form/span[23]/input")).sendKeys("1");
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[2]/form/div[26]/div[1]/span[3]/span[1]")).click();
        sleep(1000);
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[2]/form/div[26]/div[2]/ul/li[3]/span")).click();
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[2]/form/div[31]/ins")).click();
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[2]/form/span[32]/input")).sendKeys("30");
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[2]/form/div[34]/div[1]/span[3]/span[1]")).click();
        sleep(1000);
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[2]/form/div[34]/div[2]/ul/li[2]/span")).click();
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[2]/form/span[35]/input")).sendKeys(aPreValues[1]);
    }

    public void setTotalMemory(WebDriver driver, String[] aPreValues, String sOS, String sMemory){
        String sTemp, sName;
        if(sOS.equalsIgnoreCase("windows")){
            driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[2]/table/tbody/tr[11]/td[1]/span/span[3]/div")).click();
        } else if(sOS.equalsIgnoreCase("linux")){
            if (sMemory.equalsIgnoreCase("iostat")) {
                driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[2]/table/tbody/tr[28]/td[1]/span/span[3]/div")).click();
            }else {
                driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[2]/table/tbody/tr[24]/td[1]/span/span[3]/div")).click();
            }
        } else if(sOS.equalsIgnoreCase("solaris")){
            if (sMemory.equalsIgnoreCase("iostat")) {
                driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[2]/table/tbody/tr[33]/td[1]/span/span[3]/div")).click();
            }else {
                driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[2]/table/tbody/tr[33]/td[1]/span/span[3]/div")).click();
            }
        }else{}
        sName = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div/div/span")).getText();
        if(bTest == true){
            System.out.println(sName);
        }else {}
        sTemp = sName + " - " + driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[1]/div")).getText()
                + " - " + driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[1]/form/label[2]")).getText();
        if(bTest == true){
            System.out.println(sTemp);
        }else {}
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[1]/form/div[1]/ins")).click();
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[1]/form/div[2]/ins")).click();
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[1]/form/div[8]/ins")).click();
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[1]/form/div[15]/ins")).click();
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[1]/form/div[17]/ins")).click();
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[1]/form/span[15]/input")).sendKeys("85");
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[1]/form/span[17]/input")).sendKeys("75");
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[1]/form/span[19]/input")).sendKeys("65");
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[1]/form/span[21]/input")).sendKeys("55");
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[1]/form/span[23]/input")).sendKeys("45");
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[1]/form/div[35]/ins")).click();
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[1]/form/span[31]/input")).sendKeys("1");
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[1]/form/span[33]/input")).sendKeys("1");
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[1]/form/div[38]/div[1]/span[3]/span[1]")).click();
        sleep(1000);
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[1]/form/div[38]/div[2]/ul/li[3]/span")).click();
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[1]/form/div[43]/ins")).click();
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[1]/form/span[42]/input")).sendKeys("30");
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[1]/form/div[46]/div[1]/span[3]/span[1]")).click();
        sleep(1000);
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[1]/form/div[46]/div[2]/ul/li[2]/span")).click();
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[1]/form/span[45]/input")).sendKeys(aPreValues[0]);
        sTemp = sName + " - " + driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[2]/div")).getText()
                + " - " + driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[2]/form/label[2]")).getText();
        if(bTest == true){
            System.out.println(sTemp);
        }else {}
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[2]/form/div[1]/ins")).click();
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[2]/form/div[3]/ins")).click();
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[2]/form/div[5]/ins")).click();
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[2]/form/span[5]/input")).sendKeys("85");
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[2]/form/span[7]/input")).sendKeys("75");
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[2]/form/span[9]/input")).sendKeys("65");
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[2]/form/span[11]/input")).sendKeys("55");
        driver.findElement(By.xpath("//html/body/div[2]/div[2]/div[2]/div[2]/form/span[13]/input")).sendKeys("45");
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[2]/form/div[23]/ins")).click();
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[2]/form/span[21]/input")).sendKeys("1");
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[2]/form/span[23]/input")).sendKeys("1");
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[2]/form/div[26]/div[1]/span[3]/span[1]")).click();
        sleep(1000);
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[2]/form/div[26]/div[2]/ul/li[3]/span")).click();
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[2]/form/div[31]/ins")).click();
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[2]/form/span[32]/input")).sendKeys("30");
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[2]/form/div[34]/div[1]/span[3]/span[1]")).click();
        sleep(1000);
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[2]/form/div[34]/div[2]/ul/li[2]/span")).click();
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[2]/form/span[35]/input")).sendKeys(aPreValues[1]);
    }

    public void setNetwork(WebDriver driver, String[] aPreValues, String sOS, String sMemory){
        String sTemp, sName;
        int loopCount = 4;
        int loopArray = 0;
        if(sOS.equalsIgnoreCase("windows")){
            driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[2]/table/tbody/tr[12]/td[1]/span/span[3]/div")).click();
        } else if(sOS.equalsIgnoreCase("linux")){
            if (sMemory.equalsIgnoreCase("iostat")) {
                driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[2]/table/tbody/tr[29]/td[1]/span/span[3]/div")).click();
            }else {
                driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[2]/table/tbody/tr[25]/td[1]/span/span[3]/div")).click();
            }
        } else {}
        sName = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div/div/span")).getText();
        if(bTest == true){
            System.out.println(sName);
        }else {}
        for(int i = 2; i < loopCount+1; i++) {
            sTemp = sName + " - " + driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div["+i+"]/div")).getText()
                    + " - " + driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div["+i+"]/form/label[2]")).getText();
            driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div["+i+"]/form/div[1]/ins")).click();
            driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div["+i+"]/form/div[2]/ins")).click();
            driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div["+i+"]/form/div[8]/ins")).click();
            driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div["+i+"]/form/div[15]/ins")).click();
            driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div["+i+"]/form/div[17]/ins")).click();
            driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div["+i+"]/form/span[15]/input")).sendKeys("85");
            driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div["+i+"]/form/span[17]/input")).sendKeys("75");
            driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div["+i+"]/form/span[19]/input")).sendKeys("65");
            driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div["+i+"]/form/span[21]/input")).sendKeys("55");
            driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div["+i+"]/form/span[23]/input")).sendKeys("45");
            driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div["+i+"]/form/div[35]/ins")).click();
            driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div["+i+"]/form/span[31]/input")).sendKeys("1");
            driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div["+i+"]/form/span[33]/input")).sendKeys("1");
            driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div["+i+"]/form/div[38]/div[1]/span[3]/span[1]")).click();
            sleep(1000);
            driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div["+i+"]/form/div[38]/div[2]/ul/li[3]/span")).click();
            driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div["+i+"]/form/div[43]/ins")).click();
            driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div["+i+"]/form/span[42]/input")).sendKeys("30");
            driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div["+i+"]/form/div[46]/div[1]/span[3]/span[1]")).click();
            sleep(1000);
            driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div["+i+"]/form/div[46]/div[2]/ul/li[2]/span")).click();
            driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div["+i+"]/form/span[45]/input")).sendKeys(aPreValues[loopArray]);
            loopArray++;
        }
    }

    public void setProcessor(WebDriver driver, String[] aPreValues, String sOS, String sMemory){
        String sTemp, sName;
        int loopCount = 4;
        int loopArray = 0;
        if(sOS.equalsIgnoreCase("windows")){
            driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[2]/table/tbody/tr[13]/td[1]/span/span[3]/div")).click();
        } else if(sOS.equalsIgnoreCase("linux")){
            if (sMemory.equalsIgnoreCase("iostat")) {
                driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[2]/table/tbody/tr[30]/td[1]/span/span[3]/div")).click();
            }else {
                driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[2]/table/tbody/tr[26]/td[1]/span/span[3]/div")).click();
            }
        } else if(sOS.equalsIgnoreCase("solaris")){
            if (sMemory.equalsIgnoreCase("iostat")) {
                driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[2]/table/tbody/tr[34]/td[1]/span/span[3]/div")).click();
            }else {
                driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[2]/table/tbody/tr[34]/td[1]/span/span[3]/div")).click();
            }
        }else{}
        sName = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div/div/span")).getText();
        if(bTest == true){
            System.out.println(sName);
        }else {}
        sTemp = sName + " - " + driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[1]/div")).getText();
        if(bTest == true){
            System.out.println(sTemp);
        }else {}
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[1]/form/div[4]/ins")).click();
        sTemp = sName + " - " + driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[1]/div")).getText();
        if(bTest == true){
            System.out.println(sTemp);
        }else {}
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[2]/form/div[1]/ins")).click();
        if (driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[2]/form/div[1]/ins")).isSelected() != false) {
            driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[2]/form/div[1]/ins")).click();
        } else {
        }
        sTemp = sName + " - " + driver.findElement(By.xpath("//html/body/div[2]/div[2]/div[2]/div[2]/div")).getText()
                + " - " + driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[2]/form/label[2]")).getText();
        if(bTest == true){
            System.out.println(sTemp);
        }else {}
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[2]/form/div[2]/ins")).click();
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[2]/form/div[6]/ins")).click();
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[2]/form/div[8]/ins")).click();
        driver.findElement(By.xpath("//*[@id=\"monitorProcQueueLen\"]/form/span[8]/input")).sendKeys("85");
        driver.findElement(By.xpath("//*[@id=\"monitorProcQueueLen\"]/form/span[10]/input")).sendKeys("75");
        driver.findElement(By.xpath("//*[@id=\"monitorProcQueueLen\"]/form/span[12]/input")).sendKeys("65");
        driver.findElement(By.xpath("//*[@id=\"monitorProcQueueLen\"]/form/span[14]/input")).sendKeys("55");
        driver.findElement(By.xpath("//*[@id=\"monitorProcQueueLen\"]/form/span[16]/input")).sendKeys("45");
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[2]/form/div[26]/ins")).click();
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[2]/form/span[24]/input")).sendKeys("1");
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[2]/form/span[26]/input")).sendKeys("1");
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[2]/form/div[29]/div[1]/span[3]/span[1]")).click();
        sleep(1000);
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[2]/form/div[29]/div[2]/ul/li[3]/span")).click();
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[2]/form/div[34]/ins")).click();
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[2]/form/span[35]/input")).sendKeys("30");
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[2]/form/div[37]/div[1]/span[3]/span[1]")).click();
        sleep(1000);
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[2]/form/div[37]/div[2]/ul/li[2]/span")).click();
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[2]/form/span[38]/input")).sendKeys("50");
    }

    public void setIndividualCPU(WebDriver driver, String[] aPreValues, String sOS, String sMemory){
        String sTemp, sName;
        int loopCount = 6;
        int loopArray = 0;
        if(bTest == true){
            System.out.println("Individual CPU: "+ sMemory);
        }else {}
        if(sOS.equalsIgnoreCase("windows")){
            driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[2]/table/tbody/tr[14]/td[1]/span/span[3]/div")).click();
        } else if(sOS.equalsIgnoreCase("linux")){
            if (sMemory.equalsIgnoreCase("iostat")) {
                driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[2]/table/tbody/tr[31]/td[1]/span/span[3]/div")).click();
            }else {
                driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[2]/table/tbody/tr[27]/td[1]/span/span[3]/div")).click();
            }
        } else if(sOS.equalsIgnoreCase("solaris")){
            if(sMemory.equalsIgnoreCase("Individual CPU")){
                driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[2]/table/tbody/tr[35]/td[1]/span/span[3]/div")).click();
            }else {

                driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[2]/table/tbody/tr[30]/td[1]/span/span[3]/div")).click();
            }
        }else{}
        sName = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div/div/span")).getText();
        if(bTest == true){
            System.out.println(sName);
        }else{}
        sTemp = sName + " - " + driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[1]/div")).getText()
                + " - " + driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[1]/form/label[2]")).getText();
        if(bTest == true){
            System.out.println(sTemp);
        }else{}
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[1]/form/div[1]/ins")).click();
        for(int i = 2; i < loopCount+1; i++) {
            sTemp = sName + " - " + driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[" + i + "]/div")).getText()
                    + " - " + driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[" + i + "]/form/label[2]")).getText();
            if(bTest == true){
                System.out.println(sTemp);
            }else{}
            driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div["+i+"]/form/div[1]/ins")).click();
            driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div["+i+"]/form/div[3]/ins")).click();
            driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div["+i+"]/form/div[5]/ins")).click();
            driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div["+i+"]/form/span[5]/input")).sendKeys("85");
            driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div["+i+"]/form/span[7]/input")).sendKeys("75");
            driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div["+i+"]/form/span[9]/input")).sendKeys("65");
            driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div["+i+"]/form/span[11]/input")).sendKeys("55");
            driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div["+i+"]/form/span[13]/input")).sendKeys("45");
            driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div["+i+"]/form/div[23]/ins")).click();
            driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div["+i+"]/form/span[21]/input")).sendKeys("1");
            driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div["+i+"]/form/span[23]/input")).sendKeys("1");
            driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div["+i+"]/form/div[26]/div[1]/span[3]/span[1]")).click();
            sleep(1000);
            driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div["+i+"]/form/div[26]/div[2]/ul/li[3]/span")).click();
            driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div["+i+"]/form/div[31]/ins")).click();
            driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div["+i+"]/form/span[32]/input")).sendKeys("30");
            driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div["+i+"]/form/div[34]/div[1]/span[3]/span[1]")).click();
            sleep(1000);
            driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div["+i+"]/form/div[34]/div[2]/ul/li[2]/span")).click();
            driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div["+i+"]/form/span[35]/input")).sendKeys(aPreValues[loopArray]);
            loopArray++;
        }
        sTemp = sName + " - " + driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[7]/div")).getText()
                + " - " + driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[7]/form/label[2]")).getText();
        if(bTest == true){
            System.out.println(sTemp);
        }else{}
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[7]/form/div[1]/ins")).click();
    }


    /*******************************************************************************************************************
     *
     * @param driver
     * @param aPreValues
     * @param sOS
     */
    public void setTotalCPU(WebDriver driver, String[] aPreValues, String sOS, String sMemory){
        int loopCount = 3;
        int loopArray = 0;
        String sTemp, sName;
        if(sOS.equalsIgnoreCase("windows")){
            driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[2]/table/tbody/tr[15]/td[1]/span/span[3]/div")).click();
        } else if(sOS.equalsIgnoreCase("linux")){
            if (sMemory.equalsIgnoreCase("iostat")) {
                driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[2]/table/tbody/tr[32]/td[1]/span/span[3]/div")).click();
            }else {
                driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[2]/table/tbody/tr[28]/td[1]/span/span[3]/div")).click();
            }
        } else if(sOS.equalsIgnoreCase("solaris")){
            if(sMemory.equalsIgnoreCase("Individual CPU")){
                driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[2]/table/tbody/tr[36]/td[1]/span/span[3]/div")).click();
            }else {
                driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[2]/table/tbody/tr[35]/td[1]/span/span[3]")).click();
            }
        }else{}
        sName = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div/div/span")).getText();
        if(bTest == true){
            System.out.println(sName);
        }else{}
        loopCount = 2;
        for(int i = 1; i < loopCount+1; i++) {
            sTemp = sName + " - " + driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[" + i + "]/div")).getText()
                    + " - " + driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[" + i + "]/form/label[2]")).getText();
            if(bTest == true){
                System.out.println(sTemp);
            }else{}
            driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[" + i + "]/form/div[1]/ins")).click();
            driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[" + i + "]/form/div[3]/ins")).click();
            driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[" + i + "]/form/div[5]/ins")).click();
            driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[" + i + "]/form/span[5]/input")).sendKeys("85");
            driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[" + i + "]/form/span[7]/input")).sendKeys("75");
            driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[" + i + "]/form/span[9]/input")).sendKeys("65");
            driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[" + i + "]/form/span[11]/input")).sendKeys("55");
            driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[" + i + "]/form/span[13]/input")).sendKeys("45");
            driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[" + i + "]/form/div[23]/ins")).click();
            driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[" + i + "]/form/span[21]/input")).sendKeys("1");
            driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[" + i + "]/form/span[23]/input")).sendKeys("1");
            driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[" + i + "]/form/div[26]/div[1]/span[3]/span[1]")).click();
            sleep(1000);
            driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[" + i + "]/form/div[26]/div[2]/ul/li[3]/span")).click();
            driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[" + i + "]/form/div[31]/ins")).click();
            driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[" + i + "]/form/span[32]/input")).sendKeys("30");
            driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[" + i + "]/form/div[34]/div[1]/span[3]/span[1]")).click();
            sleep(1000);
            driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[" + i + "]/form/div[34]/div[2]/ul/li[2]/span")).click();
            driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[" + i + "]/form/span[35]/input")).sendKeys(aPreValues[loopArray]);
            loopArray++;
        }
        sTemp = sName + " - " + driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[3]/div")).getText()
                + " - " + driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[3]/form/label[2]")).getText();
        if(bTest == true){
            System.out.println(sTemp);
        }else{}
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[3]/form/div[1]/ins")).click();
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[3]/form/div[2]/ins")).click();
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[3]/form/div[8]/ins")).click();
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[3]/form/div[15]/ins")).click();
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[3]/form/div[17]/ins")).click();
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[3]/form/span[13]/input")).sendKeys("85");
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[3]/form/span[15]/input")).sendKeys("75");
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[3]/form/span[17]/input")).sendKeys("65");
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[3]/form/span[19]/input")).sendKeys("55");
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[3]/form/span[21]/input")).sendKeys("45");
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[3]/form/div[35]/ins")).click();
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[3]/form/span[29]/input")).sendKeys("1");
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[3]/form/span[31]/input")).sendKeys("1");
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[3]/form/div[38]/div[1]/span[3]/span[1]")).click();
        sleep(1000);
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[3]/form/div[38]/div[2]/ul/li[3]/span")).click();
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[3]/form/div[43]/ins")).click();
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[3]/form/span[40]/input")).sendKeys("30");
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[3]/form/div[46]/div[1]/span[3]/span[1]")).click();
        sleep(1000);
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[3]/form/div[46]/div[2]/ul/li[2]/span")).click();
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[3]/form/span[43]/input")).sendKeys(aPreValues[loopArray]);
        loopArray++;
        loopCount = 5;
        for(int i = 4; i < loopCount+1; i++) {
            sTemp = sName + " - " + driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[" + i + "]/div")).getText()
                    + " - " + driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[" + i + "]/form/label[2]")).getText();
            if(bTest == true){
                System.out.println(sTemp);
            }else{}
            driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[" + i + "]/form/div[1]/ins")).click();
            driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[" + i + "]/form/div[3]/ins")).click();
            driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[" + i + "]/form/div[5]/ins")).click();
            driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[" + i + "]/form/span[5]/input")).sendKeys("85");
            driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[" + i + "]/form/span[7]/input")).sendKeys("75");
            driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[" + i + "]/form/span[9]/input")).sendKeys("65");
            driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[" + i + "]/form/span[11]/input")).sendKeys("55");
            driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[" + i + "]/form/span[13]/input")).sendKeys("45");
            driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[" + i + "]/form/div[23]/ins")).click();
            driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[" + i + "]/form/span[21]/input")).sendKeys("1");
            driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[" + i + "]/form/span[23]/input")).sendKeys("1");
            driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[" + i + "]/form/div[26]/div[1]/span[3]/span[1]")).click();
            sleep(1000);
            driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[" + i + "]/form/div[26]/div[2]/ul/li[3]/span")).click();
            driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[" + i + "]/form/div[31]/ins")).click();
            driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[" + i + "]/form/span[32]/input")).sendKeys("30");
            driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[" + i + "]/form/div[34]/div[1]/span[3]/span[1]")).click();
            sleep(1000);
            driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[" + i + "]/form/div[34]/div[2]/ul/li[2]/span")).click();
            driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[" + i + "]/form/span[35]/input")).sendKeys(aPreValues[loopArray]);
            loopArray++;
        }
    }


    /*******************************************************************
     * LINUX
     */
    public void setDiskHomeInode(WebDriver driver, String[] aPreValues, String sMemory  ) {
        int loopCount = 3;
        int loopArray = 0;
        String sTemp, sName;
        driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[2]/table/tbody/tr[7]/td[1]/span/span[3]/div")).click();
        sName = driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[2]/table/tbody/tr[4]/td[1]/span")).getText()
                +" - "+driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div/div/span")).getText();
        if(bTest == true){
            System.out.println(sName);
        }else{}
        sTemp = sName + " - " + driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[1]/div")).getText();
        if(bTest == true){
            System.out.println(sTemp);
        }else{}
        sleep(3000);
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[1]/form/div[3]/ins")).click();
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[1]/form/div[6]/ins")).click();
        sTemp = sName + " - " + driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[2]/div")).getText()
                + " - " + driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[2]/form/label[2]")).getText();
        if(bTest == true){
            System.out.println(sTemp);
        }else {}
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[2]/form/div[1]/ins")).click();
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[2]/form/div[3]/ins")).click();
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[2]/form/div[5]/ins")).click();
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[2]/form/span[5]/input")).sendKeys("85");
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[2]/form/span[7]/input")).sendKeys("75");
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[2]/form/span[9]/input")).sendKeys("65");
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[2]/form/span[11]/input")).sendKeys("55");
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[2]/form/span[13]/input")).sendKeys("45");
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[2]/form/div[23]/ins")).click();
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[2]/form/span[21]/input")).sendKeys("1");
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[2]/form/span[23]/input")).sendKeys("1");
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[2]/form/div[26]/div[1]/span[3]/span[1]")).click();
        sleep(1000);
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[2]/form/div[26]/div[2]/ul/li[3]/span")).click();
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[2]/form/div[31]/ins")).click();
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[2]/form/span[32]/input")).sendKeys("30");
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[2]/form/div[34]/div[1]/span[3]/span[1]")).click();
        sleep(1000);
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[2]/form/div[34]/div[2]/ul/li[2]/span")).click();
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[2]/form/span[35]/input")).sendKeys("20");
        sTemp = sName + " - " + driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[3]/div")).getText()
                + " - " + driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[3]/form/label[2]")).getText();
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[3]/form/div[1]/ins")).click();
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[3]/form/div[3]/ins")).click();
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[3]/form/div[5]/ins")).click();
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[3]/form/span[5]/input")).sendKeys("85");
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[3]/form/span[7]/input")).sendKeys("75");
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[3]/form/span[9]/input")).sendKeys("65");
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[3]/form/span[11]/input")).sendKeys("55");
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[3]/form/span[13]/input")).sendKeys("45");
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[3]/form/div[23]/ins")).click();
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[3]/form/span[21]/input")).sendKeys("1");
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[3]/form/span[23]/input")).sendKeys("1");
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[3]/form/div[26]/div[1]/span[3]/span[1]")).click();
        sleep(1000);
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[3]/form/div[26]/div[2]/ul/li[3]/span")).click();
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[3]/form/div[31]/ins")).click();
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[3]/form/span[32]/input")).sendKeys("30");
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[3]/form/div[34]/div[1]/span[3]/span[1]")).click();
        sleep(1000);
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[3]/form/div[34]/div[2]/ul/li[2]/span")).click();
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[3]/form/span[35]/input")).sendKeys("20");
    }

    public void setBootTop(WebDriver driver, String[] aPreValues) {
        int loopCount = 3;
        int loopArray = 0;
        String sTemp, sName;
        driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[2]/table/tbody/tr[8]/td[1]/span/span[3]/div")).click();
        sName = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div/div/span")).getText();
        if(bTest == true){
            System.out.println(sName);
        }else {}
        sTemp = sName + " - " + driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[1]/div")).getText()
                + " - " + driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[1]/form/label[2]")).getText();
        if(bTest == true){
            System.out.println(sTemp);
        }else {}
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[1]/form/div[1]/ins")).click();
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[1]/form/div[2]/ins")).click();
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[1]/form/div[6]/ins")).click();
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[1]/form/div[8]/ins")).click();
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[1]/form/span[6]/input")).sendKeys("85");
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[1]/form/span[8]/input")).sendKeys("75");
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[1]/form/span[10]/input")).sendKeys("65");
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[1]/form/span[12]/input")).sendKeys("55");
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[1]/form/span[14]/input")).sendKeys("45");
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[1]/form/div[26]/ins")).click();
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[1]/form/span[22]/input")).sendKeys("1");
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[1]/form/span[24]/input")).sendKeys("1");
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[1]/form/div[29]/div[1]/span[3]/span[1]")).click();
        sleep(1000);
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[1]/form/div[29]/div[2]/ul/li[3]/span")).click();
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[1]/form/div[34]/ins")).click();
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[1]/form/span[33]/input")).sendKeys("30");
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[1]/form/div[37]/div[1]/span[3]/span[1]")).click();
        sleep(1000);
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[1]/form/div[37]/div[2]/ul/li[2]/span")).click();
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[1]/form/span[36]/input")).sendKeys(aPreValues[0]);
    }
    public void setBootBottom(WebDriver driver, String[] aPreValues) {
        String sTemp, sName;
        sName = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div/div/span")).getText();
        sTemp = sName + " - " + driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[1]/div")).getText()
                + " - " + driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[1]/form/label[2]")).getText();
        if(bTest == true){
            System.out.println(sTemp);
        }else {}
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[2]/form/div[1]/ins")).click();
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[2]/form/div[3]/ins")).click();
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[2]/form/div[5]/ins")).click();
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[2]/form/span[5]/input")).sendKeys("85");
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[2]/form/span[7]/input")).sendKeys("75");
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[2]/form/span[9]/input")).sendKeys("65");
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[2]/form/span[11]/input")).sendKeys("55");
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[2]/form/span[13]/input")).sendKeys("45");
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[2]/form/div[23]/ins")).click();
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[2]/form/span[21]/input")).sendKeys("1");
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[2]/form/span[23]/input")).sendKeys("1");
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[2]/form/div[26]/div[1]/span[3]/span[1]")).click();
        sleep(1000);
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[2]/form/div[26]/div[2]/ul/li[3]/span")).click();
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[2]/form/div[31]/ins")).click();
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[2]/form/span[32]/input")).sendKeys("30");
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[2]/form/div[34]/div[1]/span[3]/span[1]")).click();
        sleep(1000);
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[2]/form/div[34]/div[2]/ul/li[2]/span")).click();
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[2]/form/span[35]/input")).sendKeys(aPreValues[1]);
    }
    public void setBootDiskUsage(WebDriver driver, String[] aPreValues) {
        int loopCount = 3;
        int loopArray = 0;
        String sTemp, sName;
        driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[2]/table/tbody/tr[9]/td[1]/span/span[3]/div")).click();
        sName = driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[2]/table/tbody/tr[8]/td[1]/span/span[3]/div")).getText()
                +" - "+driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[3]/form/label[13]")).getText();
        if(bTest == true){
            System.out.println(sName);
        }else {}
        sTemp = sName + " - " + driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[1]/div")).getText();
        if(bTest == true){
            System.out.println(sTemp);
        }else{}
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[1]/form/div[4]/ins")).click();
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[1]/form/div[10]/ins")).click();
        for(int i = 2; i < loopCount+1; i++) {
            sTemp = sName + " - " + driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div["+i+"]/div")).getText()
                    + " - " + driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div["+i+"]/form/label[2]")).getText();
            if(bTest == true){
                System.out.println(sTemp);
            }else {}
            driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div["+i+"]/form/div[1]/ins")).click();
            driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div["+i+"]/form/div[3]/ins")).click();
            driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div["+i+"]/form/div[5]/ins")).click();
            driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div["+i+"]/form/span[5]/input")).sendKeys("85");
            driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div["+i+"]/form/span[7]/input")).sendKeys("75");
            driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div["+i+"]/form/span[9]/input")).sendKeys("65");
            driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div["+i+"]/form/span[11]/input")).sendKeys("55");
            driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div["+i+"]/form/span[13]/input")).sendKeys("45");
            driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div["+i+"]/form/div[23]/ins")).click();
            driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div["+i+"]/form/span[21]/input")).sendKeys("1");
            driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div["+i+"]/form/span[23]/input")).sendKeys("1");
            driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div["+i+"]/form/div[26]/div[1]/span[3]/span[1]")).click();
            sleep(1000);
            driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div["+i+"]/form/div[26]/div[2]/ul/li[3]/span")).click();
            driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div["+i+"]/form/div[31]/ins")).click();
            driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div["+i+"]/form/span[32]/input")).sendKeys("30");
            driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div["+i+"]/form/div[34]/div[1]/span[3]/span[1]")).click();
            sleep(1000);
            driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div["+i+"]/form/div[34]/div[2]/ul/li[2]/span")).click();
            driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div["+i+"]/form/span[35]/input")).sendKeys(aPreValues[loopArray]);
        }
    }
    public void setBootDiskUsageChange(WebDriver driver, String[] aPreValues) {
        String sTemp, sName;
        driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[2]/table/tbody/tr[10]/td[1]/span/span[3]/div")).click();
        sName = driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[2]/table/tbody/tr[8]/td[1]/span/span[3]/div")).getText()
                +" - "+driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div/div/span")).getText();
        if(bTest == true){
            System.out.println(sName);
        }else {}
        sTemp = sName + " - " + driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[1]/div")).getText()
                + " - " + driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[1]/form/label[2]")).getText();
        if(bTest == true){
            System.out.println(sTemp);
        }else {}
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[1]/form/div[1]/ins")).click();
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[1]/form/div[8]/ins")).click();
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[1]/form/div[14]/ins")).click();
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[1]/form/div[21]/ins")).click();
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[1]/form/div[23]/ins")).click();
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[1]/form/span[15]/input")).sendKeys("85");
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[1]/form/span[17]/input")).sendKeys("75");
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[1]/form/span[19]/input")).sendKeys("65");
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[1]/form/span[21]/input")).sendKeys("55");
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[1]/form/span[23]/input")).sendKeys("45");
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[1]/form/div[41]/ins")).click();
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[1]/form/span[31]/input")).sendKeys("1");
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[1]/form/span[33]/input")).sendKeys("1");
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[1]/form/div[44]/div[1]/span[3]/span[1]")).click();
        sleep(1000);
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[1]/form/div[44]/div[2]/ul/li[3]/span")).click();
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[1]/form/div[49]/ins")).click();
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[1]/form/span[42]/input")).sendKeys("30");
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[1]/form/div[52]/div[1]/span[3]/span[1]")).click();
        sleep(1000);
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[1]/form/div[52]/div[2]/ul/li[2]/span")).click();
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[1]/form/span[45]/input")).sendKeys(aPreValues[4]);
    }

    public void setBootInode(WebDriver driver, String[] aPreValues){
        int loopCount = 3;
        int loopArray = 0;
        String sTemp, sName;
        driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[2]/table/tbody/tr[11]/td[1]/span/span[3]/div")).click();
        sName = driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[2]/table/tbody/tr[8]/td[1]/span/span[3]/div")).getText()
                +" - "+driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div/div/span")).getText();
        if(bTest == true){
            System.out.println(sName);
        }else {}
        sTemp = sName + " - " + driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[1]/div")).getText();
        if(bTest == true){
            System.out.println(sTemp);
        }else {}
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[1]/form/div[3]/ins")).click();
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[1]/form/div[6]/ins")).click();
        for(int i = 2; i < loopCount+1; i++) {
            sTemp = sName + " - " + driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div["+i+"]/div")).getText()
                    + " - " + driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div["+i+"]/form/label[2]")).getText();
            if(bTest == true){
                System.out.println(sTemp);
            }else {}
            driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div["+i+"]/form/div[1]/ins")).click();
            driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div["+i+"]/form/div[3]/ins")).click();
            driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div["+i+"]/form/div[5]/ins")).click();
            driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div["+i+"]/form/span[5]/input")).sendKeys("85");
            driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div["+i+"]/form/span[7]/input")).sendKeys("75");
            driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div["+i+"]/form/span[9]/input")).sendKeys("65");
            driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div["+i+"]/form/span[11]/input")).sendKeys("55");
            driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div["+i+"]/form/span[13]/input")).sendKeys("45");
            driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div["+i+"]/form/div[23]/ins")).click();
            driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div["+i+"]/form/span[21]/input")).sendKeys("1");
            driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div["+i+"]/form/span[23]/input")).sendKeys("1");
            driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div["+i+"]/form/div[26]/div[1]/span[3]/span[1]")).click();
            sleep(1000);
            driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div["+i+"]/form/div[26]/div[2]/ul/li[3]/span")).click();
            driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div["+i+"]/form/div[31]/ins")).click();
            driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div["+i+"]/form/span[32]/input")).sendKeys("30");
            driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div["+i+"]/form/div[34]/div[1]/span[3]/span[1]")).click();
            sleep(1000);
            driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div["+i+"]/form/div[34]/div[2]/ul/li[2]/span")).click();
            driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div["+i+"]/form/span[35]/input")).sendKeys(aPreValues[loopArray]);
            loopArray++;
        }
    }

    public void setDevTop(WebDriver driver, String[] aPreValues) {
        String sTemp, sName;
        driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[2]/table/tbody/tr[12]/td[1]/span/span[3]/div")).click();
        sName = driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[2]/table/tbody/tr[12]/td[1]/span/span[3]/div")).getText();
        if(bTest == true){
            System.out.println(sName);
        }else {}
        sTemp = sName + " - " + driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[1]/div")).getText()
                + " - " + driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[1]/form/label[2]")).getText();
        if(bTest == true){
            System.out.println(sTemp);
        }else {}
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[1]/form/div[1]/ins")).click();
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[1]/form/div[2]/ins")).click();
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[1]/form/div[6]/ins")).click();
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[1]/form/div[8]/ins")).click();
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[1]/form/span[6]/input")).sendKeys("85");
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[1]/form/span[8]/input")).sendKeys("75");
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[1]/form/span[10]/input")).sendKeys("65");
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[1]/form/span[12]/input")).sendKeys("55");
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[1]/form/span[14]/input")).sendKeys("45");
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[1]/form/div[26]/ins")).click();
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[1]/form/span[22]/input")).sendKeys("1");
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[1]/form/span[24]/input")).sendKeys("1");
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[1]/form/div[29]/div[1]/span[3]/span[1]")).click();
        sleep(1000);
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[1]/form/div[29]/div[2]/ul/li[3]/span")).click();
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[1]/form/div[34]/ins")).click();
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[1]/form/span[33]/input")).sendKeys("30");
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[1]/form/div[37]/div[1]/span[3]/span[1]")).click();
        sleep(1000);
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[1]/form/div[37]/div[2]/ul/li[2]/span")).click();
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[1]/form/span[36]/input")).sendKeys(aPreValues[0]);
    }
    public void setDevBottom(WebDriver driver, String[] aPreValues){
        String sTemp, sName;
        driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[2]/table/tbody/tr[12]/td[1]/span/span[3]/div")).click();
        sName = driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[2]/table/tbody/tr[12]/td[1]/span/span[3]/div")).getText();
        sTemp = sName + " - " + driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[1]/div")).getText()
                + " - " + driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[1]/form/label[2]")).getText();
        if(bTest == true){
            System.out.println(sTemp);
        }else {}
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[2]/form/div[1]/ins")).click();
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[2]/form/div[3]/ins")).click();
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[2]/form/div[5]/ins")).click();
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[2]/form/span[5]/input")).sendKeys("85");
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[2]/form/span[7]/input")).sendKeys("75");
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[2]/form/span[9]/input")).sendKeys("65");
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[2]/form/span[11]/input")).sendKeys("55");
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[2]/form/span[13]/input")).sendKeys("45");
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[2]/form/div[23]/ins")).click();
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[2]/form/span[21]/input")).sendKeys("1");
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[2]/form/span[23]/input")).sendKeys("1");
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[2]/form/div[26]/div[1]/span[3]/span[1]")).click();
        sleep(1000);
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[2]/form/div[26]/div[2]/ul/li[3]/span")).click();
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[2]/form/div[31]/ins")).click();
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[2]/form/span[32]/input")).sendKeys("30");
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[2]/form/div[34]/div[1]/span[3]/span[1]")).click();
        sleep(1000);
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[2]/form/div[34]/div[2]/ul/li[2]/span")).click();
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[2]/form/span[35]/input")).sendKeys(aPreValues[1]);
    }
    public void setDevDiskUsage(WebDriver driver, String[] aPreValues){
        int loopCount = 3;
        int loopArray = 2;
        String sTemp, sName;
        driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[2]/table/tbody/tr[13]/td[1]/span/span[3]/div")).click();
        sName = driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[2]/table/tbody/tr[12]/td[1]/span/span[3]/div")).getText()
                +" - "+driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div/div/span")).getText();
        if(bTest == true){
            System.out.println(sName);
        }else {}
        sTemp = sName + " - " + driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[1]/div")).getText();
        if(bTest == true){
            System.out.println(sTemp);
        }else {}
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[1]/form/div[4]/ins")).click();
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[1]/form/div[10]/ins")).click();
        for(int i = 2; i < loopCount+1; i++) {
            sTemp = sName + " - " + driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[" + i + "]/div")).getText()
                    + " - " + driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[" + i + "]/form/label[2]")).getText();
            if(bTest == true){
                System.out.println(sTemp);
            }else {}
            driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div["+i+"]/form/div[1]/ins")).click();
            driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div["+i+"]/form/div[3]/ins")).click();
            driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div["+i+"]/form/div[5]/ins")).click();
            driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div["+i+"]/form/span[5]/input")).sendKeys("85");
            driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div["+i+"]/form/span[7]/input")).sendKeys("75");
            driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div["+i+"]/form/span[9]/input")).sendKeys("65");
            driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div["+i+"]/form/span[11]/input")).sendKeys("55");
            driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div["+i+"]/form/span[13]/input")).sendKeys("45");
            driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div["+i+"]/form/div[23]/ins")).click();
            driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div["+i+"]/form/span[21]/input")).sendKeys("1");
            driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div["+i+"]/form/span[23]/input")).sendKeys("1");
            driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div["+i+"]/form/div[26]/div[1]/span[3]/span[1]")).click();
            sleep(1000);
            driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div["+i+"]/form/div[26]/div[2]/ul/li[3]/span")).click();
            driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div["+i+"]/form/div[31]/ins")).click();
            driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div["+i+"]/form/span[32]/input")).sendKeys("30");
            driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div["+i+"]/form/div[34]/div[1]/span[3]/span[1]")).click();
            sleep(1000);
            driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div["+i+"]/form/div[34]/div[2]/ul/li[2]/span")).click();
            driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div["+i+"]/form/span[35]/input")).sendKeys(aPreValues[loopArray]);
            loopArray++;
        }
    }
    public void setDevDiskUsageChange(WebDriver driver, String[] aPreValues){
        String sTemp, sName;
        driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[2]/table/tbody/tr[14]/td[1]/span/span[3]/div")).click();
        sName = driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[2]/table/tbody/tr[12]/td[1]/span/span[3]/div")).getText()
                +" - "+driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div/div/span")).getText();
        if(bTest == true){
            System.out.println(sName);
        }else {}
        sTemp = sName + " - " + driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[1]/div")).getText()
                + " - " + driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[1]/form/label[2]")).getText();
        if(bTest == true){
            System.out.println(sTemp);
        }else {}
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[1]/form/div[1]/ins")).click();
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[1]/form/div[8]/ins")).click();
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[1]/form/div[14]/ins")).click();
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[1]/form/div[21]/ins")).click();
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[1]/form/div[23]/ins")).click();
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[1]/form/span[15]/input")).sendKeys("85");
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[1]/form/span[17]/input")).sendKeys("75");
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[1]/form/span[19]/input")).sendKeys("65");
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[1]/form/span[21]/input")).sendKeys("55");
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[1]/form/span[23]/input")).sendKeys("45");
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[1]/form/div[41]/ins")).click();
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[1]/form/span[31]/input")).sendKeys("1");
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[1]/form/span[33]/input")).sendKeys("1");
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[1]/form/div[44]/div[1]/span[3]/span[1]")).click();
        sleep(1000);
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[1]/form/div[44]/div[2]/ul/li[3]/span")).click();
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[1]/form/div[49]/ins")).click();
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[1]/form/span[42]/input")).sendKeys("30");
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[1]/form/div[52]/div[1]/span[3]/span[1]")).click();
        sleep(1000);
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[1]/form/div[52]/div[2]/ul/li[2]/span")).click();
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[1]/form/span[45]/input")).sendKeys(aPreValues[4]);
    }

    public void setDevInode(WebDriver driver, String[] aPreValues){
        int loopCount = 3;
        int loopArray = 0;
        String sTemp, sName;
        driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[2]/table/tbody/tr[15]/td[1]/span/span[3]/div")).click();
        sName = driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[2]/table/tbody/tr[12]/td[1]/span/span[3]/div")).getText()
                +" - "+driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div/div/span")).getText();
        if(bTest == true){
            System.out.println(sName);
        }else {}
        sTemp = sName + " - " + driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[1]/div")).getText();
        if(bTest == true){
            System.out.println(sTemp);
        }else{}
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[1]/form/div[3]/ins")).click();
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[1]/form/div[6]/ins")).click();
        for(int i = 2; i < loopCount+1; i++) {
            sTemp = sName + " - " + driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[" + i + "]/div")).getText()
                    + " - " + driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[" + i + "]/form/label[2]")).getText();
            if(bTest == true){
                System.out.println(sTemp);
            }else{}
            driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div["+i+"]/form/div[1]/ins")).click();
            driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div["+i+"]/form/div[3]/ins")).click();
            driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div["+i+"]/form/div[5]/ins")).click();
            driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div["+i+"]/form/span[5]/input")).sendKeys("85");
            driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div["+i+"]/form/span[7]/input")).sendKeys("75");
            driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div["+i+"]/form/span[9]/input")).sendKeys("65");
            driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div["+i+"]/form/span[11]/input")).sendKeys("55");
            driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div["+i+"]/form/span[13]/input")).sendKeys("45");
            driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div["+i+"]/form/div[23]/ins")).click();
            driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div["+i+"]/form/span[21]/input")).sendKeys("1");
            driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div["+i+"]/form/span[23]/input")).sendKeys("1");
            driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div["+i+"]/form/div[26]/div[1]/span[3]/span[1]")).click();
            sleep(1000);
            driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div["+i+"]/form/div[26]/div[2]/ul/li[3]/span")).click();
            driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div["+i+"]/form/div[31]/ins")).click();
            driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div["+i+"]/form/span[32]/input")).sendKeys("30");
            driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div["+i+"]/form/div[34]/div[1]/span[3]/span[1]")).click();
            sleep(1000);
            driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div["+i+"]/form/div[34]/div[2]/ul/li[2]/span")).click();
            driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div["+i+"]/form/span[35]/input")).sendKeys(aPreValues[loopArray]);
            loopArray++;
        }
    }

    public void setDevShmTop(WebDriver driver, String[] aPreValues) {
        String sTemp, sName;
        driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[2]/table/tbody/tr[16]/td[1]/span/span[3]/div")).click();
        sName = driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[2]/table/tbody/tr[16]/td[1]/span/span[3]/div")).getText();
        if(bTest == true){
            System.out.println(sName);
        }else{}
        sTemp = sName + " - " + driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[1]/div")).getText()
                + " - " + driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[1]/form/label[2]")).getText();
        if(bTest == true){
            System.out.println(sTemp);
        }else {}
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[1]/form/div[1]/ins")).click();
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[1]/form/div[2]/ins")).click();
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[1]/form/div[6]/ins")).click();
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[1]/form/div[8]/ins")).click();
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[1]/form/span[6]/input")).sendKeys("85");
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[1]/form/span[8]/input")).sendKeys("75");
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[1]/form/span[10]/input")).sendKeys("65");
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[1]/form/span[12]/input")).sendKeys("55");
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[1]/form/span[14]/input")).sendKeys("45");
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[1]/form/div[26]/ins")).click();
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[1]/form/span[22]/input")).sendKeys("1");
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[1]/form/span[24]/input")).sendKeys("1");
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[1]/form/div[29]/div[1]/span[3]/span[1]")).click();
        sleep(1000);
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[1]/form/div[29]/div[2]/ul/li[3]/span")).click();
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[1]/form/div[34]/ins")).click();
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[1]/form/span[33]/input")).sendKeys("30");
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[1]/form/div[37]/div[1]/span[3]/span[1]")).click();
        sleep(1000);
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[1]/form/div[37]/div[2]/ul/li[2]/span")).click();
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[1]/form/span[36]/input")).sendKeys(aPreValues[0]);
    }
    public void setDevShmBottom(WebDriver driver, String[] aPreValues) {
        String sTemp, sName;
        sName = driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[2]/table/tbody/tr[16]/td[1]/span/span[3]/div")).getText();
        sTemp = sName + " - " + driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[2]/div")).getText()
                + " - " + driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[2]/form/label[2]")).getText();
        if(bTest == true){
            System.out.println(sTemp);
        }else {}
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[2]/form/div[1]/ins")).click();
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[2]/form/div[3]/ins")).click();
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[2]/form/div[5]/ins")).click();
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[2]/form/span[5]/input")).sendKeys("85");
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[2]/form/span[7]/input")).sendKeys("75");
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[2]/form/span[9]/input")).sendKeys("65");
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[2]/form/span[11]/input")).sendKeys("55");
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[2]/form/span[13]/input")).sendKeys("45");
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[2]/form/div[23]/ins")).click();
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[2]/form/span[21]/input")).sendKeys("1");
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[2]/form/span[23]/input")).sendKeys("1");
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[2]/form/div[26]/div[1]/span[3]/span[1]")).click();
        sleep(1000);
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[2]/form/div[26]/div[2]/ul/li[3]/span")).click();
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[2]/form/div[31]/ins")).click();
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[2]/form/span[32]/input")).sendKeys("30");
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[2]/form/div[34]/div[1]/span[3]/span[1]")).click();
        sleep(1000);
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[2]/form/div[34]/div[2]/ul/li[2]/span")).click();
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[2]/form/span[35]/input")).sendKeys(aPreValues[1]);
    }
    public void setDevShmDiskUsage(WebDriver driver, String[] aPreValues) {
        int loopCount = 3;
        int loopArray = 2;
        String sTemp, sName;
        driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[2]/table/tbody/tr[17]/td[1]/span/span[3]/div")).click();
        sName = driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[2]/table/tbody/tr[16]/td[1]/span/span[3]/div")).getText()
                + " - " + driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div/div/span")).getText();
        sTemp = sName + " - " + driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[1]/div")).getText();
        if(bTest == true){
            System.out.println(sTemp);
        }else{}
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[1]/form/div[4]/ins")).click();
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[1]/form/div[10]/ins")).click();
        for(int i = 2; i < loopCount+1; i++) {
            sTemp = sName + " - " + driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[" + i + "]/div")).getText()
                    + " - " + driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[" + i + "]/form/label[2]")).getText();
            if(bTest == true){
                System.out.println(sTemp);
            }else {}
            driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div["+i+"]/form/div[1]/ins")).click();
            driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div["+i+"]/form/div[3]/ins")).click();
            driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div["+i+"]/form/div[5]/ins")).click();
            driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div["+i+"]/form/span[5]/input")).sendKeys("85");
            driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div["+i+"]/form/span[7]/input")).sendKeys("75");
            driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div["+i+"]/form/span[9]/input")).sendKeys("65");
            driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div["+i+"]/form/span[11]/input")).sendKeys("55");
            driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div["+i+"]/form/span[13]/input")).sendKeys("45");
            driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div["+i+"]/form/div[23]/ins")).click();
            driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div["+i+"]/form/span[21]/input")).sendKeys("1");
            driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div["+i+"]/form/span[23]/input")).sendKeys("1");
            driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div["+i+"]/form/div[26]/div[1]/span[3]/span[1]")).click();
            sleep(1000);
            driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div["+i+"]/form/div[26]/div[2]/ul/li[3]/span")).click();
            driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div["+i+"]/form/div[31]/ins")).click();
            driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div["+i+"]/form/span[32]/input")).sendKeys("30");
            driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div["+i+"]/form/div[34]/div[1]/span[3]/span[1]")).click();
            sleep(1000);
            driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div["+i+"]/form/div[34]/div[2]/ul/li[2]/span")).click();
            driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div["+i+"]/form/span[35]/input")).sendKeys(aPreValues[loopArray]);
            loopArray++;
        }
    }
    public void setDevShmDiskUsageChange(WebDriver driver, String[] aPreValues){
        String sTemp, sName;
        driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[2]/table/tbody/tr[18]/td[1]/span/span[3]/div")).click();
        sName = driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[2]/table/tbody/tr[16]/td[1]/span/span[3]/div")).getText()
                + " - " + driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div/div/span")).getText();

        sTemp = sName + " - " + driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[1]/div")).getText()
                + " - " + driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[1]/form/label[2]")).getText();
        if(bTest == true){
            System.out.println(sTemp);
        }else {}
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[1]/form/div[1]/ins")).click();
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[1]/form/div[8]/ins")).click();
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[1]/form/div[14]/ins")).click();
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[1]/form/div[21]/ins")).click();
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[1]/form/div[23]/ins")).click();
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[1]/form/span[15]/input")).sendKeys("85");
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[1]/form/span[17]/input")).sendKeys("75");
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[1]/form/span[19]/input")).sendKeys("65");
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[1]/form/span[21]/input")).sendKeys("55");
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[1]/form/span[23]/input")).sendKeys("45");
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[1]/form/div[41]/ins")).click();
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[1]/form/span[31]/input")).sendKeys("1");
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[1]/form/span[33]/input")).sendKeys("1");
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[1]/form/div[44]/div[1]/span[3]/span[1]")).click();
        sleep(1000);
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[1]/form/div[44]/div[2]/ul/li[3]/span")).click();
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[1]/form/div[49]/ins")).click();
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[1]/form/span[42]/input")).sendKeys("30");
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[1]/form/div[52]/div[1]/span[3]/span[1]")).click();
        sleep(1000);
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[1]/form/div[52]/div[2]/ul/li[2]/span")).click();
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[1]/form/span[45]/input")).sendKeys(aPreValues[4]);
    }
    public void setDevShmInode(WebDriver driver, String[] aPreValues) {
        int loopCount = 3;
        int loopArray = 0;
        String sTemp, sName;
        driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[2]/table/tbody/tr[19]/td[1]/span/span[3]/div")).click();
        sName = driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[2]/table/tbody/tr[16]/td[1]/span/span[3]/div")).getText()
                + " - " + driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div/div/span")).getText();
        sTemp = sName + " - " + driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[1]/div")).getText();
        if(bTest == true){
            System.out.println(sTemp);
        }else {}
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[1]/form/div[3]/ins")).click();
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[1]/form/div[6]/ins")).click();
        for(int i = 2; i < loopCount+1; i++) {
            sTemp = sName + " - " + driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[" + i + "]/div")).getText()
                    + " - " + driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[" + i + "]/form/label[2]")).getText();
            if(bTest == true){
                System.out.println(sTemp);
            }else {}
            driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div["+i+"]/form/div[1]/ins")).click();
            driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div["+i+"]/form/div[3]/ins")).click();
            driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div["+i+"]/form/div[5]/ins")).click();
            driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div["+i+"]/form/span[5]/input")).sendKeys("85");
            driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div["+i+"]/form/span[7]/input")).sendKeys("75");
            driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div["+i+"]/form/span[9]/input")).sendKeys("65");
            driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div["+i+"]/form/span[11]/input")).sendKeys("55");
            driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div["+i+"]/form/span[13]/input")).sendKeys("45");
            driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div["+i+"]/form/div[23]/ins")).click();
            driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div["+i+"]/form/span[21]/input")).sendKeys("1");
            driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div["+i+"]/form/span[23]/input")).sendKeys("1");
            driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div["+i+"]/form/div[26]/div[1]/span[3]/span[1]")).click();
            sleep(1000);
            driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div["+i+"]/form/div[26]/div[2]/ul/li[3]/span")).click();
            driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div["+i+"]/form/div[31]/ins")).click();
            driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div["+i+"]/form/span[32]/input")).sendKeys("30");
            driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div["+i+"]/form/div[34]/div[1]/span[3]/span[1]")).click();
            sleep(1000);
            driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div["+i+"]/form/div[34]/div[2]/ul/li[2]/span")).click();
            driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div["+i+"]/form/span[35]/input")).sendKeys(aPreValues[loopArray]);
            loopArray++;
        }
    }

    public void setIostat1(WebDriver driver, String[] aPreValues, String sOS, String sMemory) {
        int loopCount;
        int loopArray = 0;
        String sTemp;
        if(sOS.equalsIgnoreCase("LINUX")) {
            driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[2]/table/tbody/tr[21]/td[1]/span/span[3]/div")).click();
            loopCount = 12;
        }else{
            driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[2]/table/tbody/tr[25]/td[1]/span/span[3]")).click();
            loopCount =10;
        }
        String sName = sMemory + " - "+driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div/div/span")).getText() + " - ";
        sTemp = sName;
        sName = sTemp + driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[1]/div")).getText();
        if(bTest == true){
            System.out.println(sName);
        }else {}
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[1]/form/div/ins")).click();
        for(int i = 2; i < loopCount+1; i++){
            sName = sTemp + driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div["+i+"]/div")).getText() + " - " +
                    driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div["+i+"]/form/label[2]")).getText();
            if(bTest == true){
                System.out.println(sName);
            }else {}
            driver.findElement(By.xpath("//html/body/div[2]/div[2]/div[2]/div["+i+"]/form/div[1]/ins")).click();
            driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div["+i+"]/form/div[2]/ins")).click();
            driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div["+i+"]/form/div[8]/ins")).click();
            driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div["+i+"]/form/div[15]/ins")).click();
            driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div["+i+"]/form/div[17]/ins")).click();
            driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div["+i+"]/form/span[13]/input")).sendKeys("85");
            driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div["+i+"]/form/span[15]/input")).sendKeys("75");
            driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div["+i+"]/form/span[17]/input")).sendKeys("65");
            driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div["+i+"]/form/span[19]/input")).sendKeys("55");
            driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div["+i+"]/form/span[21]/input")).sendKeys("45");
            driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div["+i+"]/form/div[35]/ins")).click();
            driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div["+i+"]/form/span[29]/input")).sendKeys("1");
            driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div["+i+"]/form/span[31]/input")).sendKeys("1");
            driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div["+i+"]/form/div[38]/div[1]/span[3]/span[1]")).click();
            sleep(1000);
            driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div["+i+"]/form/div[38]/div[2]/ul/li[3]/span")).click();
            driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div["+i+"]/form/div[43]/ins")).click();
            driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div["+i+"]/form/span[40]/input")).sendKeys("30");
            driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div["+i+"]/form/div[46]/div[1]/span[3]/span[1]")).click();
            sleep(1000);
            driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div["+i+"]/form/div[46]/div[2]/ul/li[2]/span")).click();
            driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div["+i+"]/form/span[43]/input")).sendKeys(aPreValues[loopArray]);
            loopArray++;
        }

    }

    public void setIostat2(WebDriver driver, String[] aPreValues, String sOS, String sMemory) {
        int loopCount;
        int loopArray = 0;
        String sTemp;
        if(sOS.equalsIgnoreCase("LINUX")) {
            driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[2]/table/tbody/tr[22]/td[1]/span/span[3]/div")).click();
            loopCount = 12;
        }else{
            driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[2]/table/tbody/tr[26]/td[1]/span/span[3]/div")).click();
            loopCount =10;
        }
        String sName = sMemory + " - "+driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div/div/span")).getText() + " - ";
        sTemp = sName;
        sName = sTemp + driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[1]/div")).getText();
        if(bTest == true){
            System.out.println(sName);
        }
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[1]/form/div/ins")).click();
        for(int i = 2; i < loopCount+1; i++){
            sName = sTemp + driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div["+i+"]/div")).getText() + " - " +
                    driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div["+i+"]/form/label[2]")).getText();
            if(bTest == true){
                System.out.println(sName);
            }else {}
            driver.findElement(By.xpath("//html/body/div[2]/div[2]/div[2]/div["+i+"]/form/div[1]/ins")).click();
            driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div["+i+"]/form/div[2]/ins")).click();
            driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div["+i+"]/form/div[8]/ins")).click();
            driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div["+i+"]/form/div[15]/ins")).click();
            driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div["+i+"]/form/div[17]/ins")).click();
            driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div["+i+"]/form/span[13]/input")).sendKeys("85");
            driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div["+i+"]/form/span[15]/input")).sendKeys("75");
            driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div["+i+"]/form/span[17]/input")).sendKeys("65");
            driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div["+i+"]/form/span[19]/input")).sendKeys("55");
            driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div["+i+"]/form/span[21]/input")).sendKeys("45");
            driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div["+i+"]/form/div[35]/ins")).click();
            driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div["+i+"]/form/span[29]/input")).sendKeys("1");
            driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div["+i+"]/form/span[31]/input")).sendKeys("1");
            driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div["+i+"]/form/div[38]/div[1]/span[3]/span[1]")).click();
            sleep(1000);
            driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div["+i+"]/form/div[38]/div[2]/ul/li[3]/span")).click();
            driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div["+i+"]/form/div[43]/ins")).click();
            driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div["+i+"]/form/span[40]/input")).sendKeys("30");
            driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div["+i+"]/form/div[46]/div[1]/span[3]/span[1]")).click();
            sleep(1000);
            driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div["+i+"]/form/div[46]/div[2]/ul/li[2]/span")).click();
            driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div["+i+"]/form/span[43]/input")).sendKeys(aPreValues[loopArray]);
            loopArray++;
        }
    }

    public void setIostat3(WebDriver driver, String[] aPreValues, String sOS, String sMemory) {
        int loopCount;
        int loopArray = 0;
        String sTemp;
        if(sOS.equalsIgnoreCase("LINUX")) {
            driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[2]/table/tbody/tr[23]/td[1]/span/span[3]/div")).click();
            loopCount = 12;
        }else{
            driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[2]/table/tbody/tr[27]/td[1]/span/span[3]/div")).click();
            loopCount =10;
        }
        String sName = sMemory + " - "+driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div/div/span")).getText() + " - ";
        sTemp = sName;
        sName = sTemp + driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[1]/div")).getText();
        if(bTest == true){
            System.out.println(sName);
        }else {}
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[1]/form/div/ins")).click();
        for(int i = 2; i < loopCount+1; i++){
            sName = sTemp + driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div["+i+"]/div")).getText() + " - " +
                    driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div["+i+"]/form/label[2]")).getText();
            if(bTest == true){
                System.out.println(sName);
            }else {}
            driver.findElement(By.xpath("//html/body/div[2]/div[2]/div[2]/div["+i+"]/form/div[1]/ins")).click();
            driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div["+i+"]/form/div[2]/ins")).click();
            driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div["+i+"]/form/div[8]/ins")).click();
            driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div["+i+"]/form/div[15]/ins")).click();
            driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div["+i+"]/form/div[17]/ins")).click();
            driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div["+i+"]/form/span[13]/input")).sendKeys("85");
            driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div["+i+"]/form/span[15]/input")).sendKeys("75");
            driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div["+i+"]/form/span[17]/input")).sendKeys("65");
            driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div["+i+"]/form/span[19]/input")).sendKeys("55");
            driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div["+i+"]/form/span[21]/input")).sendKeys("45");
            driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div["+i+"]/form/div[35]/ins")).click();
            driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div["+i+"]/form/span[29]/input")).sendKeys("1");
            driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div["+i+"]/form/span[31]/input")).sendKeys("1");
            driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div["+i+"]/form/div[38]/div[1]/span[3]/span[1]")).click();
            sleep(1000);
            driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div["+i+"]/form/div[38]/div[2]/ul/li[3]/span")).click();
            driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div["+i+"]/form/div[43]/ins")).click();
            driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div["+i+"]/form/span[40]/input")).sendKeys("30");
            driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div["+i+"]/form/div[46]/div[1]/span[3]/span[1]")).click();
            sleep(1000);
            driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div["+i+"]/form/div[46]/div[2]/ul/li[2]/span")).click();
            driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div["+i+"]/form/span[43]/input")).sendKeys(aPreValues[loopArray]);
            loopArray++;
        }
    }

    public void setIostat4(WebDriver driver, String[] aPreValues, String sOS, String sMemory) {
        int loopCount;
        int loopArray = 0;
        String sTemp;
        if(sOS.equalsIgnoreCase("LINUX")) {
            driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[2]/table/tbody/tr[23]/td[1]/span/span[3]/div")).click();
            loopCount = 12;
        }else{
            driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[2]/table/tbody/tr[28]/td[1]/span/span[3]/div")).click();
            loopCount =10;
        }
        String sName = sMemory + " - "+driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div/div/span")).getText() + " - ";
        sTemp = sName;
        sName = sTemp + driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[1]/div")).getText();
        if(bTest == true){
            System.out.println(sName);
        }else {}
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[1]/form/div/ins")).click();
        for(int i = 2; i < loopCount+1; i++){
            sName = sTemp + driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div["+i+"]/div")).getText() + " - " +
                    driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div["+i+"]/form/label[2]")).getText();
            if(bTest == true){
                System.out.println(sName);
            }else{}
            driver.findElement(By.xpath("//html/body/div[2]/div[2]/div[2]/div["+i+"]/form/div[1]/ins")).click();
            driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div["+i+"]/form/div[2]/ins")).click();
            driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div["+i+"]/form/div[8]/ins")).click();
            driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div["+i+"]/form/div[15]/ins")).click();
            driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div["+i+"]/form/div[17]/ins")).click();
            driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div["+i+"]/form/span[13]/input")).sendKeys("85");
            driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div["+i+"]/form/span[15]/input")).sendKeys("75");
            driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div["+i+"]/form/span[17]/input")).sendKeys("65");
            driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div["+i+"]/form/span[19]/input")).sendKeys("55");
            driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div["+i+"]/form/span[21]/input")).sendKeys("45");
            driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div["+i+"]/form/div[35]/ins")).click();
            driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div["+i+"]/form/span[29]/input")).sendKeys("1");
            driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div["+i+"]/form/span[31]/input")).sendKeys("1");
            driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div["+i+"]/form/div[38]/div[1]/span[3]/span[1]")).click();
            sleep(1000);
            driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div["+i+"]/form/div[38]/div[2]/ul/li[3]/span")).click();
            driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div["+i+"]/form/div[43]/ins")).click();
            driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div["+i+"]/form/span[40]/input")).sendKeys("30");
            driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div["+i+"]/form/div[46]/div[1]/span[3]/span[1]")).click();
            sleep(1000);
            driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div["+i+"]/form/div[46]/div[2]/ul/li[2]/span")).click();
            driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div["+i+"]/form/span[43]/input")).sendKeys(aPreValues[loopArray]);
            loopArray++;
        }
    }
// Used for Solaris only.
    public void serVarRun(WebDriver driver, String[] aPreValues) {
        String sTemp, sName;
        driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[2]/table/tbody/tr[20]/td[1]/span/span[3]/div")).click();
        sName = driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[2]/table/tbody/tr[20]/td[1]/span/span[3]/div")).getText();
        if(bTest == true){
            System.out.println(sName);
        }else {}
        sTemp = sName + " - " + driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[1]/div")).getText()
                + " - " + driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[1]/form/label[2]")).getText();
        if(bTest == true){
            System.out.println(sTemp);
        }else {}
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[1]/form/div[1]/ins")).click();
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[1]/form/div[2]/ins")).click();
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[1]/form/div[6]/ins")).click();
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[1]/form/div[8]/ins")).click();
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[1]/form/span[6]/input")).sendKeys("85");
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[1]/form/span[8]/input")).sendKeys("75");
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[1]/form/span[10]/input")).sendKeys("65");
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[1]/form/span[12]/input")).sendKeys("55");
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[1]/form/span[14]/input")).sendKeys("45");
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[1]/form/div[26]/ins")).click();
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[1]/form/span[22]/input")).sendKeys("1");
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[1]/form/span[24]/input")).sendKeys("1");
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[1]/form/div[29]/div[1]/span[3]/span[1]")).click();
        sleep(1000);
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[1]/form/div[29]/div[2]/ul/li[3]/span")).click();
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[1]/form/div[34]/ins")).click();
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[1]/form/span[33]/input")).sendKeys("30");
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[1]/form/div[37]/div[1]/span[3]/span[1]")).click();
        sleep(1000);
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[1]/form/div[37]/div[2]/ul/li[2]/span")).click();
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[1]/form/span[36]/input")).sendKeys(aPreValues[0]);
    }

    /****************************************************************************************************************
     *
     * @param driver
     * @param aPreValues
     * buttons 4 and 10 for Alarm Thresholds
     * for loop starting at 2 and 1, 3 5, 5, 7, 9
     *****************************************************************************************************************/
    public void serVarRunDiskUsage(WebDriver driver, String[] aPreValues) {
        int loopCount = 3;
        int loopArray = 0;
        String sTemp, sName;
        driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[2]/table/tbody/tr[21]/td[1]/span/span[3]/div")).click();
        sName = driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[2]/table/tbody/tr[20]/td[1]/span/span[3]/div")).getText()
                + " - " + driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div/div/span")).getText();

        sTemp = sName + " - " + driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[1]/div")).getText();
        if(bTest == true){
            System.out.println(sTemp);
        }else {}
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[1]/form/div[4]/ins")).click();
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[1]/form/div[10]/ins")).click();
        for(int i = 2; i < loopCount+1; i++) {
            sTemp = sName + " - " + driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[" + i + "]/div")).getText()
                    + " - " + driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[" + i + "]/form/label[2]")).getText();
            if(bTest == true){
                System.out.println(sTemp);
            }else {}
            driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div["+i+"]/form/div[1]/ins")).click();
            driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div["+i+"]/form/div[3]/ins")).click();
            driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div["+i+"]/form/div[5]/ins")).click();
            driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div["+i+"]/form/span[5]/input")).sendKeys("85");
            driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div["+i+"]/form/span[7]/input")).sendKeys("75");
            driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div["+i+"]/form/span[9]/input")).sendKeys("65");
            driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div["+i+"]/form/span[11]/input")).sendKeys("55");
            driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div["+i+"]/form/span[13]/input")).sendKeys("45");
            driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div["+i+"]/form/div[23]/ins")).click();
            driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div["+i+"]/form/span[21]/input")).sendKeys("1");
            driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div["+i+"]/form/span[23]/input")).sendKeys("1");
            driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div["+i+"]/form/div[26]/div[1]/span[3]/span[1]")).click();
            sleep(1000);
            driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div["+i+"]/form/div[26]/div[2]/ul/li[3]/span")).click();
            driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div["+i+"]/form/div[31]/ins")).click();
            driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div["+i+"]/form/span[32]/input")).sendKeys("30");
            driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div["+i+"]/form/div[34]/div[1]/span[3]/span[1]")).click();
            sleep(1000);
            driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div["+i+"]/form/div[34]/div[2]/ul/li[2]/span")).click();
            driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div["+i+"]/form/span[35]/input")).sendKeys(aPreValues[loopArray]);
            loopArray++;
        }
    }

    public void serVarRunDiskUsageChange(WebDriver driver, String[] aPreValues) {
        String sTemp, sName;
        driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[2]/table/tbody/tr[22]/td[1]/span/span[3]/div")).click();
        sName = driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[2]/table/tbody/tr[20]/td[1]/span/span[3]/div")).getText()
                +" - "+driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div/div/span")).getText();
        if(bTest == true){
            System.out.println(sName);
        }else {}

        sTemp = sName + " - " + driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[1]/div")).getText()
                + " - " + driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[1]/form/label[2]")).getText();
        if(bTest == true){
            System.out.println(sTemp);
        }else {}
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[1]/form/div[1]/ins")).click();
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[1]/form/div[8]/ins")).click();
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[1]/form/div[14]/ins")).click();
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[1]/form/div[21]/ins")).click();
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[1]/form/div[23]/ins")).click();
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[1]/form/span[15]/input")).sendKeys("85");
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[1]/form/span[17]/input")).sendKeys("75");
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[1]/form/span[19]/input")).sendKeys("65");
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[1]/form/span[21]/input")).sendKeys("55");
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[1]/form/span[23]/input")).sendKeys("45");
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[1]/form/div[41]/ins")).click();
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[1]/form/span[31]/input")).sendKeys("1");
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[1]/form/span[33]/input")).sendKeys("1");
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[1]/form/div[44]/div[1]/span[3]/span[1]")).click();
        sleep(1000);
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[1]/form/div[44]/div[2]/ul/li[3]/span")).click();
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[1]/form/div[49]/ins")).click();
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[1]/form/span[42]/input")).sendKeys("30");
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[1]/form/div[52]/div[1]/span[3]/span[1]")).click();
        sleep(1000);
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[1]/form/div[52]/div[2]/ul/li[2]/span")).click();
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[1]/form/span[45]/input")).sendKeys(aPreValues[0]);
    }

    public void serVarRunInodeUsage(WebDriver driver, String[] aPreValues) {
        int loopCount = 3;
        int loopArray = 0;
        String sTemp, sName;
        driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[2]/table/tbody/tr[23]/td[1]/span/span[3]/div")).click();
        sName = driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[2]/table/tbody/tr[20]/td[1]/span/span[3]/div")).getText()
                + " - " + driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div/div/span")).getText();
        sTemp = sName + " - " + driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[1]/div")).getText();
        if(bTest == true){
            System.out.println(sTemp);
        }else {}
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[1]/form/div[3]/ins")).click();
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[1]/form/div[6]/ins")).click();
        for(int i = 2; i < loopCount+1; i++) {
            sTemp = sName + " - " + driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[" + i + "]/div")).getText()
                    + " - " + driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[" + i + "]/form/label[2]")).getText();
            if(bTest == true){
                System.out.println(sTemp);
            }else {}
            driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div["+i+"]/form/div[1]/ins")).click();
            driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div["+i+"]/form/div[3]/ins")).click();
            driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div["+i+"]/form/div[5]/ins")).click();
            driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div["+i+"]/form/span[5]/input")).sendKeys("85");
            driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div["+i+"]/form/span[7]/input")).sendKeys("75");
            driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div["+i+"]/form/span[9]/input")).sendKeys("65");
            driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div["+i+"]/form/span[11]/input")).sendKeys("55");
            driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div["+i+"]/form/span[13]/input")).sendKeys("45");
            driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div["+i+"]/form/div[23]/ins")).click();
            driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div["+i+"]/form/span[21]/input")).sendKeys("1");
            driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div["+i+"]/form/span[23]/input")).sendKeys("1");
            driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div["+i+"]/form/div[26]/div[1]/span[3]/span[1]")).click();
            sleep(1000);
            driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div["+i+"]/form/div[26]/div[2]/ul/li[3]/span")).click();
            driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div["+i+"]/form/div[31]/ins")).click();
            driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div["+i+"]/form/span[32]/input")).sendKeys("30");
            driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div["+i+"]/form/div[34]/div[1]/span[3]/span[1]")).click();
            sleep(1000);
            driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div["+i+"]/form/div[34]/div[2]/ul/li[2]/span")).click();
            driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div["+i+"]/form/span[35]/input")).sendKeys(aPreValues[loopArray]);
            loopArray++;
        }
    }
}
