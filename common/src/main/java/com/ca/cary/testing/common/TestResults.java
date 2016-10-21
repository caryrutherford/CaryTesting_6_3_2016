package com.ca.cary.testing.common;

import java.util.ArrayList;

/**
 * Created by caryTesting on 3/7/2016.
 */
public class TestResults extends ArrayList<TestResults> {
    // Need to return Group Name, Number (Top N), Time Frame, Metric Type, and output Format.
    private static Boolean bTest = true;
    String  sOS, sDB, sPortlet, sVersion, sBuildLabel, sBuildDate, sBuildNumber;
    String sReportName,sTestCaseRally, sComputerSystemName, sTimeFrame, sSystemType, sProbe, sOutput, sFileName,sImageName, sPassFail;
    String sNumberofResults, sGroupName;

    public TestResults(ArrayList<String> aReturnedResults) {
        if(bTest == true){
            System.out.println("\nTop of TestResults");
            System.out.println("aReturnedResults.size() = " + aReturnedResults.size());
            System.out.println("aReturnedResults.get(7): " + aReturnedResults.get(7));
            for(int i = 0; i < aReturnedResults.size(); i++) {
                System.out.println(i + " ) "+ aReturnedResults.get(i));
            }
        }else{}


        // If the size of the aReturnedResults is 8 than the test failed.
        if(aReturnedResults.get(7).toString().equalsIgnoreCase("Failed")){
            sPortlet = aReturnedResults.get(0).toString();
            sVersion = aReturnedResults.get(1).toString();
            sBuildLabel = aReturnedResults.get(2).toString();
            sBuildDate = aReturnedResults.get(3).toString();
            sBuildNumber = aReturnedResults.get(4).toString();
            sOS = aReturnedResults.get(5).toString();
            sDB = aReturnedResults.get(6).toString();
            sPassFail = aReturnedResults.get(7);
        } else if(aReturnedResults.get(8).equalsIgnoreCase("At A Glance Report")){
            if(bTest == true) {
                System.out.println("Version and system information");
                System.out.println("At A Glance Report");
                System.out.println("aReturnedResults.size() " + aReturnedResults.size());
                for (int i = 0; i < aReturnedResults.size(); i++) {
                    System.out.println(i + ") " + aReturnedResults.get(i));
                }
            }else{}
            sPortlet = aReturnedResults.get(0).toString();
            sVersion = aReturnedResults.get(1).toString();
            sBuildLabel = aReturnedResults.get(2).toString();
            sBuildDate = aReturnedResults.get(3).toString();
            sBuildNumber = aReturnedResults.get(4).toString();
            sOS = aReturnedResults.get(5).toString();
            sDB = aReturnedResults.get(6).toString();
            if(bTest == true){
                System.out.println("\\nThe report name is :"+aReturnedResults.get(8));
            }else{}
            sReportName = aReturnedResults.get(8);
            sTestCaseRally = aReturnedResults.get(9);
            sComputerSystemName = aReturnedResults.get(10);
            sTimeFrame = aReturnedResults.get(11);
            sSystemType = aReturnedResults.get(12);
            sProbe = aReturnedResults.get(13);
            sOutput = aReturnedResults.get(14);
            if(bTest == true){
                System.out.println("\\nsPassFail :"+aReturnedResults.get(15));
            }else{}
            sPassFail = aReturnedResults.get(15);
            sFileName = aReturnedResults.get(16);
            sImageName = aReturnedResults.get(17);
        } else if(aReturnedResults.get(8).equalsIgnoreCase("Situations To Watch")){
            if(bTest == true) {
                System.out.println("Version and system information");
                System.out.println("Situations To Watch");
                System.out.println("aReturnedResults.size() " + aReturnedResults.size());
                for (int i = 0; i < aReturnedResults.size(); i++) {
                    System.out.println(i + ") " + aReturnedResults.get(i));
                }
            }else{}
            sPortlet = aReturnedResults.get(0).toString();
            sVersion = aReturnedResults.get(1).toString();
            sBuildLabel = aReturnedResults.get(2).toString();
            sBuildDate = aReturnedResults.get(3).toString();
            sBuildNumber = aReturnedResults.get(4).toString();
            sOS = aReturnedResults.get(5).toString();
            sDB = aReturnedResults.get(6).toString();
            if(bTest == true){
                System.out.println("\nThe report name is :"+aReturnedResults.get(8));
            }else{}
            sReportName = aReturnedResults.get(8);
            sTestCaseRally = aReturnedResults.get(9);
            sGroupName = aReturnedResults.get(10);
            sNumberofResults = aReturnedResults.get(12);
            sOutput = aReturnedResults.get(13);
            if(bTest == true){
                System.out.println("\\nsPassFail :"+aReturnedResults.get(14));
            }else{}
            sPassFail = aReturnedResults.get(14);
            sFileName = aReturnedResults.get(15);
            sImageName = aReturnedResults.get(16);
        }else if(aReturnedResults.get(8).equalsIgnoreCase("Top N Report")){
            if(bTest == true) {
                System.out.println("Version and system information");
                System.out.println("Top N Report");
                System.out.println("aReturnedResults.size() " + aReturnedResults.size());
                for (int i = 0; i < aReturnedResults.size(); i++) {
                    System.out.println(i + ") " + aReturnedResults.get(i));
                }
            }else{}
            sPortlet = aReturnedResults.get(0).toString();
            sVersion = aReturnedResults.get(1).toString();
            sBuildLabel = aReturnedResults.get(2).toString();
            sBuildDate = aReturnedResults.get(3).toString();
            sBuildNumber = aReturnedResults.get(4).toString();
            sOS = aReturnedResults.get(5).toString();
            sDB = aReturnedResults.get(6).toString();
            if(bTest == true){
                System.out.println("\nThe report name is :"+aReturnedResults.get(8));
            }else{}
            sReportName = aReturnedResults.get(8);
            sTestCaseRally = aReturnedResults.get(9);
            sGroupName = aReturnedResults.get(10);
            sNumberofResults = aReturnedResults.get(12);
            sOutput = aReturnedResults.get(13);
            if(bTest == true){
                System.out.println("\\nsPassFail :"+aReturnedResults.get(14));
            }else{}
            sPassFail = aReturnedResults.get(14);
            sFileName = aReturnedResults.get(15);
            sImageName = aReturnedResults.get(16);
        }
     /*   if(aReturnedResults.size() == 3){
            sReportName = aReturnedResults.get(0).toString();
            sName = aReturnedResults.get(1).toString();
            sPassFail = aReturnedResults.get(2).toString();
            System.out.println("sPassFail: "+sPassFail);
        }else if(aReturnedResults.size() == 7 ){
            System.out.println("Version and system information");
            sPortlet = aReturnedResults.get(0).toString();
            sVersion = aReturnedResults.get(1).toString();
            sBuildLabel = aReturnedResults.get(2).toString();
            sBuildDate = aReturnedResults.get(3).toString();
            sBuildNumber = aReturnedResults.get(4).toString();
            sOS = aReturnedResults.get(5).toString();
            sDB = aReturnedResults.get(6).toString();
        }else if(aReturnedResults.get(0).equalsIgnoreCase("At a Glance")){
            System.out.println("At a glance");
            sReportName = aReturnedResults.get(0);
            sTestCaseRally = aReturnedResults.get(1);
            sName = aReturnedResults.get(2);
            sTimeFrame = aReturnedResults.get(3);
            sSystemType = aReturnedResults.get(4);
            sProbe = aReturnedResults.get(5);
            sOutput = aReturnedResults.get(6);
            sFileName = aReturnedResults.get(7);
        }
        else{
            System.out.println("Test Results else");
            sReportName = aReturnedResults.get(0).toString();
            sTestCaseRally = aReturnedResults.get(1).toString();
            sName = aReturnedResults.get(2).toString();
            sTimeFrame = aReturnedResults.get(4).toString();
            sOutput = aReturnedResults.get(6).toString();
            sPassFail = aReturnedResults.get(8).toString();
       }
       */
    }

    public  TestResults() {}

    public void setSOS(String os){sOS=os;}
    public void setDB(String db){sDB=db;}
    public void setPortlet(String Portlet){sPortlet=Portlet;}
    public void setVersion(String ver){sVersion=ver;}
    public void setBuildLabel(String bLabel){sBuildLabel=bLabel;}
    public void setBuildDate(String bDate){sBuildDate=bDate;}
    public void setBuildNumber(String bNumber){sBuildNumber=bNumber;}
    public void setReportName(String ReportName){ sReportName = ReportName;}
    public void setComputerSystemName(String name) {sComputerSystemName = name;}
    public void setTestCaseRally(String testCaseNum){sTestCaseRally = testCaseNum;}
    public void setTimeFrame(String timeFrame){sTimeFrame=timeFrame;}
    public void setOutput(String outPut){sOutput=outPut;}
    public void setPassFail(String sPassed){sPassFail = sPassed;}
    public void setNumberofWatch(String sNumofResults) {sNumberofResults = sNumofResults;}
    public void setGroupName(String sGName){sGroupName = sGName;}


    public String getOS(){return sOS;}
    public String getDB(){return sDB;}
    public String getPortlet(){return sPortlet;}
    public String getVerson(){return sVersion;}
    public String getBuildLabel(){return sBuildLabel;}
    public String getBuildDate(){return sBuildDate;}
    public String getBuildNumber(){return sBuildNumber;}
    public String getReportName(){return sReportName;}
    public String getComputerSystemName(){return sComputerSystemName;}
    public String getTestCaseRally(){return sTestCaseRally;}
    public String getTimeFrame(){return sTimeFrame;}
    public String getProbe(){return sProbe;}
    public String getOuput(){return sOutput;}
    public String getPassFail(){return sPassFail;}
    public String getFileName(){return sFileName;}
    public String getImageName(){return sImageName;}
    public String getNumberofResults(){return sNumberofResults;}
    public String getGroupName(){return sGroupName;}
}


