package com.ca.cary.testing.adminConsole.pages;

import com.ca.cary.testing.adminConsole.locators.ACLocators;
import com.ca.cary.testing.common.ActionsDriver;
//import org.eclipse.jetty.util.preventers.AppContextLeakPreventer;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.Iterator;
import java.util.List;

/**
 * Created by caryTesting on 3/28/2016.
 */
public class SNMPCollectorProbe extends ActionsDriver {
    public SNMPCollectorProbe(WebDriver driver){super(driver);}

    // Download the snmpcollector and poolagent probes from the archive.
    public void getProbes(String sUIMHubName){
        String[] aInfo = new String[2];
        String[] aProbes = new String[2];
        String[] aSDeployInfo = new String[2];
        ACLocators acls = new ACLocators();
        ProbeCommon common = new ProbeCommon(driver);

        // Download the current version of snmp collector
        aProbes[0] ="pollagent";
        aProbes[1] = "snmpcollector";
        common.getDownloadProbeFromAcrhive(driver, aProbes[0]);
        // Download the curretn version of pollagent.
        common.getDownloadProbeFromAcrhive(driver, aProbes[1]);
        //Find a robot on a secondary hub.
      aInfo= common.getSecondaryHubRobot(driver, sUIMHubName);
      /*  for(int i = 0; i < aInfo.length;i++){
            System.out.println(aInfo[i]);
        }*/
        sleep(5000);
        //select the robot on the secondary robot.
        aSDeployInfo = common.getHubRobtForDeployment(aInfo, sUIMHubName);
        //Deploy the snmp collector and poolagent probes to the secondary hubs robot.
        //select the poolagent and snmp collector probes.
        System.out.println("Back in SNMP");
        common.getDeployProbe(driver, aProbes, aSDeployInfo);
        // Select the hub and robot that has the snmpcollector probe is installed on.
        common.getSelectedRobot(aSDeployInfo);
    }

    /// Get a robot on a secondary hub. The SNMP Collector probe cannot be installed on the UIM server robot.
}
