package com.ca.cary.testing.adminConsole.locators;
import org.openqa.selenium.By;

/**
 * Created by caryTesting on 3/7/2016.
 */
public class ACLocators {
    //Setters

    private static final By userNamae = By.xpath(".//*[@id='usrname']");     ////*[@id="usrname"]
    private static final By passWord = By.xpath(".//*[@id='pswd']");     ////*[@id="pswd"]
    private static final By buttonSignIn = By.xpath("html/body/div[1]/form/div[1]/input");       ///html/body/div/form/div[1]/input
    // Get the Domain on the left hand side.
    private static final By domainAC1 = By.xpath("//*[@id=\"treeview-1361\"]/table/tbody/tr[2]/td[1]");     ///AC1

    private static final By hub = By.xpath("/html/body/div[2]/div[3]/div[2]/div[2]/div[1]/div/div[1]/table/thead/tr/th[2]");
    private static final By buttonRobots = By.id("btnRobotsTab");
    private static final By buttonArchive = By.xpath("/html/body/div[2]/div[1]/div/div[1]/input[3]");
    private static final By buttonDeploymentActivity = By.xpath("/html/body/div[2]/div[1]/div/div[1]/input[4]");
    private static final By buttonLicenses = By.id("btnLicensesTab");
    private static final By buttonAddLicense = By.cssSelector("button.menu-item-link.add-licenses");
    private static final By addLicenseText = By.id("add-licenses-textarea-value");
    private static final By buttonSaveLicense = By.id("saveBtn");
    private static final By iconClose = By.cssSelector("span.ui-icon.ui-icon-close");
    private static final By licAddSusscess = By.cssSelector("span.ui-icon.ui-icon-close");
    private static final By buttonActions = By.id("hubSectionManagerActionsButton");
    private static final By buttonInfo = By.id("btnHubDetailsTab");
    private static final By avaliableHubs = By.className("hoverSelectTable");
    private static final By deployPackage =  By.cssSelector("button.menu-item-link.deploy-package");
    private static final By hub1 = By.xpath("/html/body/div[2]/div[3]/div[2]/div[2]/div[1]/div/div[2]/table/tbody/tr[1]/td[2]");
    private static final By searchBox = By.xpath("//*[@id=\"tableActionsHeaderFilterInput\"]");

    private static final By cdm = By.xpath("/html/body/div[2]/div[1]/div/div[3]/div[3]/div[2]/div/div[2]/table/tbody/tr[2]/td[1]/input");
    private static final By buttonDeploy = By.xpath("/html/body/div[2]/div[3]/div[2]/div[4]/div/input[2]");
                                                // /html/body/div[1]/div/div/div[1]/button
    private static final By status = By.className("table-container");
    private static final By leftTable = By.xpath("/html/body/div[2]/div[3]/div[2]/div[2]/div[1]/div/div[2]");  //
    private static final By firstRobot = By.xpath("/html/body/div[2]/div[1]/div/div[3]/div[3]/div[1]/div/div[2]/table/tbody/tr[1]/td[5]");
    private static final By buttonProbes = By.xpath("//*[@id=\"btnProbesTab\"]");
    private static final By hubCrumb = By.xpath("//*[@id=\"breadcrumbs\"]/li[2]/span[3]");

    private static final By buttonEnvVar = By.xpath("//*[@id=\"btnEnvironmentVariables\"]");

    private static final By envVer = By.xpath("/html/body/div[2]/div[1]/div/div[3]/div[3]/div/div/div[2]/table/tbody/tr/td[2]");
    private static final By domain = By.xpath("/html/body/div[2]/div[1]/div/div[2]/div[3]/div/div/div[2]/table/tbody/tr[12]/td[2]");

    private static final By selectProbe = By.xpath("/html/body/div[2]/div[1]/div/div[2]/div[3]/div/div/div[2]/table/tbody/tr/td[2]/input");
    private static final By selectProbeMenu = By.xpath("(//input[@type='button'])[9]");
    private static final By selectProbeCongifuration = By.cssSelector("button.menu-item-link.configure-probe");
    private static final By buttonDownload = By.xpath("/html/body/div[1]/div/div/div[2]/button");
    private static final By rightTable = By.xpath("/html/body/div[2]/div[3]/div/div[3]/div/div[3]/div[1]/div/div[2]/table/tbody/tr[2]/td[2]");
    private static final By selectConfig = By.xpath("/html/body/div[1]/div/div[3]/div[1]/button/span[2]");
    private static final By middleTable = By.xpath("/html/body/div[2]/div[1]/div/div[3]/div[3]/div[1]/div/div[2]");
                                                ///         /html/body/div[2]/div[2]/div/div[3]/div[1]/div
    //private static final By usernameMenuIcon = By.xpath("/html/body/div[2]/div[2]/div/div[3]/div[1]");
    private static final By usernameMenuIcon = By.id("usernameLogoutButton");
                                    ///         /html/body/div[1]/div/div/div/button
    private static final By logOut = By.xpath("/html/body/div[1]/div/div/div/button");

    private static final By cdmProbeInfo = By.xpath("/html/body/div[2]/div[2]/div[2]/div[1]/div");
    private static final By download = By.xpath("/html/body/div[2]/div[1]/div/div[3]/div[3]/div[1]/div/div[2]/table/tbody/tr[1]/td[4]/div");

    // Getters
    public static By getUserNamae(){return userNamae;}
    public static By getPassWord(){return passWord;}
    public static By getButtonSignIn(){return buttonSignIn;}
    // Get the Domain on the left hand side.
    public static By getDomainAC1(){return domainAC1;}

    public static By getHub(){return hub;}
    public static By getButtonInfo(){return buttonInfo;}
    public static By getButtonRobots(){return buttonRobots;}
    public static By getButtonArchive(){return buttonArchive;}
    public static By getButtonDeploymentActivity(){return buttonDeploymentActivity;}
    public static By getButtonLicenses(){return buttonLicenses;}
    public static By getButtonAddLicense(){return buttonAddLicense;}
    public static By getAddLicenseText(){return addLicenseText;}
    public static By getButtonSaveLicense(){return buttonSaveLicense;}
    public static By getIconClose(){return iconClose;}
    public static By getLicAddSusscess(){return licAddSusscess;}
    public static By getButtonActions(){return buttonActions;}
    public static By getDeployPackage(){return deployPackage;}
    public static By getAvaliableHubs(){return avaliableHubs;}
    public static By getHub1(){return hub1;}
    public static By getSearchBox(){return searchBox;}
    public static By getCDM(){return cdm;}
    public static By getButtonDeploy(){return buttonDeploy;}
    public static By getStatus(){return status;}
    public static By getLeftTable(){return leftTable;}
    public static By getHubCrumb(){return hubCrumb;}
    public static By getMiddleTable(){return middleTable;}
    public static By getFirstRobot(){return firstRobot ;}
    public static By getButtonProbes(){return buttonProbes;}
    public static By getSelectProbe(){return selectProbe;}
    public static By getSelectConfig(){return selectConfig;}
    public static By getSelectProbeMenu(){return selectProbeMenu;}
    public static By getSelectProbeCongifuration(){return selectProbeCongifuration;}
    public static By getButtonEnvVar(){return buttonEnvVar;}
    public static By getEnvVer(){return envVer;}
    public static By getDomain(){return domain;}
    public static By getUsernameMenuIcon(){return usernameMenuIcon;}
    public static By getLogOut(){return logOut;}
    public static By getButtonDownload(){return buttonDownload;}
    public static By getRightTable(){return rightTable;}
    public static By getCdmProbeInfo(){return cdmProbeInfo;}
    public static By getDownload(){return download;}
}

