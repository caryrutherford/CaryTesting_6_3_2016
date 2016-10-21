package com.ca.cary.testing.common;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by caryTesting on 3/7/2016.
 */
public class DataBase {
    private static Boolean bTest = true;
    String sSQL, sUserName, sPassword, sURL;
    java.sql.Statement statement = null;
    Connection connection = null;
    JSONObject obj = new JSONObject();
    List<ArrayList<TestResults>> allResults = new ArrayList<ArrayList<TestResults>>();
    public void addResults(ArrayList<TestResults> aTestResults){
        TestResults results = new TestResults();
        ArrayList<TestResults> aJson = new ArrayList<TestResults>();

        /**************************************************************************************************************
         * Need to fix. This is used to store the information in the Database.

         String sSQL, sUserName, sPassword, sURL;
         java.sql.Statement statement = null;
         Connection connection = null;
         sSQL=null;
         sUserName = "sa";
         sPassword = "t3sti9";
         sURL = "jdbc:sqlserver://10.238.3.1:1433;DataBaseName=ehealth_automation";
         try {
         connection = DriverManager.getConnection(sURL, sUserName, sPassword);
         System.out.println("Connected");
         } catch (SQLException e) {
         e.printStackTrace();
         }
         if(bTest == true) {
         System.out.println("Database: " + aTestResults.size());
         System.out.println("Report Name: " + aTestResults.get(0).getReportName());
         }
         if(aTestResults.get(0).getReportName().equalsIgnoreCase("At a Glance Report")) {
         if(bTest == true) {
         System.out.println(aTestResults.get(0).getPortlet());
         System.out.println(aTestResults.get(0).getVerson());
         System.out.printf(aTestResults.get(0).getBuildLabel());
         System.out.printf(aTestResults.get(0).getBuildDate());
         System.out.printf(aTestResults.get(0).getBuildNumber());
         System.out.println(aTestResults.get(0).getOS());
         System.out.println(aTestResults.get(0).getDB());
         System.out.println(aTestResults.get(0).getReportName());
         System.out.println(aTestResults.get(0).getTestCaseRally());
         System.out.println(aTestResults.get(0).getComputerSystemName());
         System.out.println(aTestResults.get(0).getTimeFrame());
         System.out.println(aTestResults.get(0).getProbe());
         System.out.println(aTestResults.get(0).getOuput());
         System.out.println(aTestResults.get(0).getFileName());
         System.out.println(aTestResults.get(0).getImageName());
         System.out.println(aTestResults.get(0).getPassFail());
         }else{}

         if(aTestResults.get(0).getOuput().equalsIgnoreCase("Excel")){
         System.out.println("It is saved in an Excel file");
         sSQL="INSERT INTO AtAGlanceReport(ReportName, PortletName, VersionInfo, BuildLabel, BuildDate, BuildNumber, OperatingSystem, DataBaseInfo, RallyTestCases," +
         " ComputerSystemName, timeFrame, ProbeName, OutputType, ExcelName, ImageName, PassFail) VALUES('"+aTestResults.get(0).getReportName()+"','"+aTestResults.get(0).getPortlet()+"','"+aTestResults.get(0).getVerson()+
         "','"+aTestResults.get(0).getBuildLabel()+"','"+aTestResults.get(0).getBuildDate()+"','"+aTestResults.get(0).getBuildNumber()+"','"+aTestResults.get(0).getOS()+"','"+aTestResults.get(0).getDB()+
         "','"+aTestResults.get(0).getTestCaseRally()+"','"+aTestResults.get(0).getComputerSystemName()+"','"+aTestResults.get(0).getTimeFrame()+"','"+aTestResults.get(0).getProbe()+"','"+
         aTestResults.get(0).getOuput()+"','"+aTestResults.get(0).getFileName()+"','"+aTestResults.get(0).getImageName()+"','"+aTestResults.get(0).getPassFail()+"')";
         if(bTest == true) {
         System.out.println("Full SQL: "+sSQL);
         }
         }else{
         System.out.println("IS a PDF");
         sSQL="INSERT INTO AtAGlanceReport(reportName, PortletName, VersionInfo, BuildLabel, BuildDate, BuildNumber, OperatingSystem, DataBaseInfo, RallyTestCases," +
         " ComputerSystemName, timeFrame, ProbeName, OutputType, ImageName, PassFail) VALUES('"+aTestResults.get(0).getReportName()+"','"+aTestResults.get(0).getPortlet()+"','"+aTestResults.get(0).getVerson()+
         "','"+aTestResults.get(0).getBuildLabel()+"','"+aTestResults.get(0).getBuildDate()+"','"+aTestResults.get(0).getBuildNumber()+"','"+aTestResults.get(0).getOS()+"','"+aTestResults.get(0).getDB()+
         "','"+aTestResults.get(0).getTestCaseRally()+"','"+aTestResults.get(0).getComputerSystemName()+"','"+aTestResults.get(0).getTimeFrame()+"','"+aTestResults.get(0).getProbe()+"','"+
         aTestResults.get(0).getOuput()+"','"+aTestResults.get(0).getImageName()+"','"+aTestResults.get(0).getPassFail()+"')";
         if(bTest == true) {
         System.out.println(" SQL: "+sSQL);
         }
         }
         // Insert the information into the database.
         }else  if(aTestResults.get(0).getReportName().equalsIgnoreCase("Situations To Watch")){
         if(bTest == true) {
         System.out.println("Not an At a Glance Report ");
         }
         if(bTest == true) {
         System.out.println(aTestResults.get(0).getPortlet());
         System.out.println(aTestResults.get(0).getVerson());
         System.out.printf(aTestResults.get(0).getBuildLabel());
         System.out.printf(aTestResults.get(0).getBuildDate());
         System.out.printf(aTestResults.get(0).getBuildNumber());
         System.out.println(aTestResults.get(0).getOS());
         System.out.println(aTestResults.get(0).getDB());
         System.out.println(aTestResults.get(0).getReportName());
         System.out.println(aTestResults.get(0).getTestCaseRally());
         System.out.println(aTestResults.get(0).getGroupName());
         System.out.println(aTestResults.get(0).getNumberofResults());
         System.out.println(aTestResults.get(0).getOuput());
         System.out.println(aTestResults.get(0).getFileName());
         System.out.println(aTestResults.get(0).getImageName());
         System.out.println(aTestResults.get(0).getPassFail());
         }else{}

         if(aTestResults.get(0).getOuput().equalsIgnoreCase("Excel")){
         System.out.println("It is saved in an Excel file");
         sSQL="INSERT INTO SituationsToWatch(ReportName, PortletName, VersionInfo, BuildLabel, BuildDate, BuildNumber, OperatingSystem, DataBaseInfo, RallyTestCases, GroupName" +
         " NumberOfResults, OutputFormat, ExcelName, ImageName, PassFail) VALUES('"+aTestResults.get(0).getReportName()+"','"+aTestResults.get(0).getPortlet()+"','"+aTestResults.get(0).getVerson()+
         "','"+aTestResults.get(0).getBuildLabel()+"','"+aTestResults.get(0).getBuildDate()+"','"+aTestResults.get(0).getBuildNumber()+"','"+aTestResults.get(0).getOS()+"','"+aTestResults.get(0).getDB()+
         "','"+aTestResults.get(0).getTestCaseRally()+"','"+aTestResults.get(0).getGroupName()+"','"+aTestResults.get(0).getNumberofResults()+"','"+ aTestResults.get(0).getOuput()+"','"+aTestResults.get(0).getFileName()+"','"
         +aTestResults.get(0).getImageName()+"','"+aTestResults.get(0).getPassFail()+"')";
         if(bTest == true) {
         System.out.println("Full SQL: "+sSQL);
         }
         }else{
         System.out.println("IS a PDF");
         sSQL="INSERT INTO SituationsToWatch(ReportName, PortletName, VersionInfo, BuildLabel, BuildDate, BuildNumber, OperatingSystem, DataBaseInfo, RallyTestCases, GroupName," +
         " NumberOfResults, OutputFormat, ImageName, PassFail) VALUES('"+aTestResults.get(0).getReportName()+"','"+aTestResults.get(0).getPortlet()+"','"+aTestResults.get(0).getVerson()+
         "','"+aTestResults.get(0).getBuildLabel()+"','"+aTestResults.get(0).getBuildDate()+"','"+aTestResults.get(0).getBuildNumber()+"','"+aTestResults.get(0).getOS()+"','"+aTestResults.get(0).getDB()+
         "','"+aTestResults.get(0).getTestCaseRally()+"','"+aTestResults.get(0).getGroupName()+"','"+aTestResults.get(0).getNumberofResults()+"','"+
         aTestResults.get(0).getOuput()+"','"+aTestResults.get(0).getImageName()+"','"+aTestResults.get(0).getPassFail()+"')";
         if(bTest == true) {
         System.out.println(" SQL: "+sSQL);
         }
         }
         }else if(aTestResults.get(0).getReportName().equalsIgnoreCase("Top N Report")){
         if(bTest == true) {
         System.out.println("Top N Report ");
         }
         if(bTest == true) {
         System.out.println(aTestResults.get(0).getPortlet());
         System.out.println(aTestResults.get(0).getVerson());
         System.out.printf(aTestResults.get(0).getBuildLabel());
         System.out.printf(aTestResults.get(0).getBuildDate());
         System.out.printf(aTestResults.get(0).getBuildNumber());
         System.out.println(aTestResults.get(0).getOS());
         System.out.println(aTestResults.get(0).getDB());
         System.out.println(aTestResults.get(0).getReportName());
         System.out.println(aTestResults.get(0).getTestCaseRally());
         System.out.println(aTestResults.get(0).getGroupName());
         System.out.println(aTestResults.get(0).getNumberofResults());
         System.out.println(aTestResults.get(0).getOuput());
         System.out.println(aTestResults.get(0).getFileName());
         System.out.println(aTestResults.get(0).getImageName());
         System.out.println(aTestResults.get(0).getPassFail());
         }else{}

         /* if(aTestResults.get(0).getOuput().equalsIgnoreCase("Excel")){
         System.out.println("It is saved in an Excel file");
         sSQL="INSERT INTO SituationsToWatch(ReportName, PortletName, VersionInfo, BuildLabel, BuildDate, BuildNumber, OperatingSystem, DataBaseInfo, RallyTestCases, GroupName" +
         " NumberOfResults, OutputFormat, ExcelName, ImageName, PassFail) VALUES('"+aTestResults.get(0).getReportName()+"','"+aTestResults.get(0).getPortlet()+"','"+aTestResults.get(0).getVerson()+
         "','"+aTestResults.get(0).getBuildLabel()+"','"+aTestResults.get(0).getBuildDate()+"','"+aTestResults.get(0).getBuildNumber()+"','"+aTestResults.get(0).getOS()+"','"+aTestResults.get(0).getDB()+
         "','"+aTestResults.get(0).getTestCaseRally()+"','"+aTestResults.get(0).getGroupName()+"','"+aTestResults.get(0).getNumberofResults()+"','"+ aTestResults.get(0).getOuput()+"','"+aTestResults.get(0).getFileName()+"','"
         +aTestResults.get(0).getImageName()+"','"+aTestResults.get(0).getPassFail()+"')";
         if(bTest == true) {
         System.out.println("Full SQL: "+sSQL);
         }
         }else{
         System.out.println("IS a PDF");
         sSQL="INSERT INTO SituationsToWatch(ReportName, PortletName, VersionInfo, BuildLabel, BuildDate, BuildNumber, OperatingSystem, DataBaseInfo, RallyTestCases, GroupName," +
         " NumberOfResults, OutputFormat, ImageName, PassFail) VALUES('"+aTestResults.get(0).getReportName()+"','"+aTestResults.get(0).getPortlet()+"','"+aTestResults.get(0).getVerson()+
         "','"+aTestResults.get(0).getBuildLabel()+"','"+aTestResults.get(0).getBuildDate()+"','"+aTestResults.get(0).getBuildNumber()+"','"+aTestResults.get(0).getOS()+"','"+aTestResults.get(0).getDB()+
         "','"+aTestResults.get(0).getTestCaseRally()+"','"+aTestResults.get(0).getGroupName()+"','"+aTestResults.get(0).getNumberofResults()+"','"+
         aTestResults.get(0).getOuput()+"','"+aTestResults.get(0).getImageName()+"','"+aTestResults.get(0).getPassFail()+"')";
         if(bTest == true) {
         System.out.println(" SQL: "+sSQL);
         }
         }*/
       /* }else {}    // END of setup to enter report info into DB.
        // Insert the information into the database.
        try {
            statement = connection.createStatement();
            statement.executeUpdate(sSQL);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        try {
            connection.close();
            if(bTest == true) {
                System.out.println("Connection Closed");
            }
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println(e);
        }
        ***************************************************************************************************************/

        /***************************************************************************************************************
         * Used to create a JSON file to display the results.
         */

        if(aTestResults.get(0).getReportName().equalsIgnoreCase("Situations To Watch")) {
            if (bTest == true) {
                System.out.println("Database At a Glance Report ");
                System.out.println(aTestResults.get(0).getReportName());
                System.out.println(aTestResults.get(0).getPortlet());
                System.out.println(aTestResults.get(0).getVerson());
                System.out.printf(aTestResults.get(0).getBuildLabel());
                System.out.printf(aTestResults.get(0).getBuildDate());
                System.out.printf(aTestResults.get(0).getBuildNumber());
                System.out.println(aTestResults.get(0).getOS());
                System.out.println(aTestResults.get(0).getDB());
                System.out.println(aTestResults.get(0).getReportName());
                System.out.println(aTestResults.get(0).getTestCaseRally());
                System.out.println(aTestResults.get(0).getGroupName());
                System.out.println(aTestResults.get(0).getNumberofResults());
                System.out.println(aTestResults.get(0).getOuput());
                System.out.println(aTestResults.get(0).getFileName());
                System.out.println(aTestResults.get(0).getImageName());
                System.out.println(aTestResults.get(0).getPassFail());
            }

            // situationsToWatch(aTestResults);  // Broken
        } else{}

    }
    // Broken
    private void situationsToWatch(ArrayList<TestResults> aTestResults) {
        System.out.println("In  situationsToWatch(ArrayList<TestResults> aTestResults)");

        allResults.add(aTestResults);
        System.out.println(allResults.get(0).get(0).getImageName());
        obj.put("reportName",aTestResults.get(0).getReportName());
        obj.put("portlet",aTestResults.get(0).getPortlet());
        obj.put("version",aTestResults.get(0).getVerson());
        obj.put("buildLabel",aTestResults.get(0).getBuildLabel());
        obj.put("buildDate", aTestResults.get(0).getBuildDate());
        obj.put("buildNumber", aTestResults.get(0).getBuildNumber());
        obj.put("os", aTestResults.get(0).getOS());
        obj.put("db", aTestResults.get(0).getDB());
        obj.put("testCases", aTestResults.get(0).getTestCaseRally());
        obj.put("groupName", aTestResults.get(0).getGroupName());
        obj.put("numberOfResults", aTestResults.get(0).getNumberofResults());
        obj.put("output", aTestResults.get(0).getOuput());
        obj.put("fileName", aTestResults.get(0).getFileName());
        obj.put("imageName",aTestResults.get(0).getImageName());
        obj.put("passFail;", aTestResults.get(0).getPassFail());

        // Get the information out of the file and assign it to the obj to be placed back into the json file.
        JSONParser parser = new JSONParser();
        BufferedReader br = null;

        Object previous = null;

        try {
            Object obj1 = parser.parse(new FileReader("C:/tomcat-8.0.23/webapps/Analysis/_json/testResultsGroup.json"));
            JSONObject jsonObject = (JSONObject) obj1;
            System.out.println("EHERE");
            // String name = (String) jsonObject.get("reportName");
            // String author = (String) jsonObject.get("Author");
            JSONArray situationsToWatch = (JSONArray) jsonObject.get("situationsToWatch");
            Iterator<String> iterator = situationsToWatch.iterator();
            while(iterator.hasNext()){
                System.out.println(iterator.next());
            }

            // System.out.println("Name: " + name);
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("1) "+e);

        } catch (ParseException e) {
            e.printStackTrace();
            System.out.println(e);
        }


      /*  try {
            System.out.println("TRY\n\n");
            previous = parser.parse(new FileReader("C:\\tomcat-8.0.23\\webapps\\Analysis\\_json\\situationsToWatch.json"));
            System.out.println("PRINT!");
            JSONObject jsonObject = (JSONObject) previous;
            ArrayList<String> results = new ArrayList<String>();
            results.add((String) jsonObject.get("reportName"));
            String test = (String) jsonObject.get("reportName");
            System.out.println("test "+ test);
          // aTestResults.add();
            //situationsToWatch = (String)jsonObject.get("situationsToWatch ");
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }
        //   System.out.println("situationsToWatch:\n"+situationsToWatch );

*/

        System.out.println(" end of situationsToWatch(ArrayList<TestResults> aTestResults)");
    }

    /*******************************************************************************************************************
     * Get the ID of either the group of the node for the report.
     */
    public String getID(String[] aUMPID){
        String sID = null;
        String sURL= null;
        ResultSet rs;
        if(aUMPID[0].equalsIgnoreCase("MSSQL")){
            //   sURL = "jdbc:sqlserver://10.238.3.1:1433;DataBaseName=ehealth_automation";
            sURL = "jdbc:sqlserver://"+aUMPID[1]+":"+aUMPID[2]+";DataBaseName="+aUMPID[3];
            System.out.println("sURL; "+sURL);
            sUserName = aUMPID[4];
            sPassword = aUMPID[5];
            try {
                connection = DriverManager.getConnection(sURL, sUserName, sPassword);
                System.out.println("Connected");
            } catch (SQLException e) {
                e.printStackTrace();
            }
            if(aUMPID[6].equalsIgnoreCase("group")){
                sSQL = "SELECT grp_id FROM CM_GROUP WHERE name LIKE'"+aUMPID[7]+"';";
            }else{
                sSQL = "SELECT cs_id FROM CM_COMPUTER_SYSTEM  WHERE name LIKE'"+aUMPID[7]+"';";
            }
            System.out.println("sSQL: "+ sSQL);
            try {
                statement = connection.createStatement();
                rs = statement.executeQuery(sSQL);
                rs.next();
                //System.out.println(rs.next());
                sID = rs.getString(1);
            } catch (SQLException e) {
                e.printStackTrace();
            }

            try {
                connection.close();
                if(bTest == true) {
                    System.out.println("Connection Closed");
                }
            } catch (SQLException e) {
                e.printStackTrace();
                System.out.println(e);
            }
        }
        System.out.println("sID: "+ sID);
        return sID;
    }

}


