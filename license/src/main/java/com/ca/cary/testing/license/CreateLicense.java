package com.ca.cary.testing.license;

import org.apache.commons.io.FileUtils;

import java.io.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/**
 * Created by caryTesting on 3/7/2016.
 */
public class CreateLicense {
    public void newLicense(List<License> lic1, List<String> licFinal, boolean limited) {
        String license = null;
        int year = Calendar.getInstance().get(Calendar.YEAR);
        DateFormat dateFormat = new SimpleDateFormat("dd/MMM/yyyy");
        String delims = "[/]+";
        Date date = new Date();
        String sDate = dateFormat.format(date);
        String[] aDate = sDate.split(delims);
        year = Integer.parseInt(aDate[2]);
        year++;
        String sYear = Integer.toString(year);
        ArrayList<String> TemplateLic = new ArrayList<String>();
        File source;
        File dest = new File("C:/tomcat-8.0.23/webapps/Analysis/_files");
        // If the licenses are never to expire that set the sDate to Unlimited. else set sDate to 1 year from the day it is ran.
        if(limited != true){
            sDate = "unlimited";
        }else{
            sDate = aDate[0]+" "+aDate[1]+" "+sYear;
        }
        int count= 0;
        File nimlicLog = new File("nimlic.log");
        PrintWriter writer = null;
        PrintWriter tempwrite = null;
        // If nimLic.log exist that delete it.
        if(nimlicLog.exists()){
            nimlicLog.delete();
        }
        else{}
        nimlicLog = new File("lic.txt");
        // the file lic.txt exist than delete it.
        if(nimlicLog.exists() && limited == true){
            nimlicLog.delete();
        }
        else{}
        nimlicLog = new File("Unlic.txt");
        // If the file unlic.txt exist than delete it.
        if(nimlicLog.exists() && limited == false){
            nimlicLog.delete();
        }else{}
        // If the licenses are to never expire that create the file Unlic.txt else create teh file lic.txt
        if(limited != true){
            nimlicLog = new File("Unlic.txt");
        }else{
            nimlicLog = new File("lix.txt");
        }
        try {
            // If the licenses are not to expire that create the writer to write the Unlic.txt else create ;the writer for lic.txt
            if(limited != true){
                writer = new PrintWriter("Unlic.txt");
            }else{
                writer = new PrintWriter("lic.txt");
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        // While the probe name is empty than increment count by one. This is done because some files have other information at the top.
        while(lic1.get(count).getProbe() == null){
            count++;
        }
        // These lines are added to the top of the lic.txt/Unlic.txt file and are not stored in the licTemp.txt file.
        licFinal.add("-- This is your new Nimsoft Monitoring Solution license. You may install the");
        licFinal.add("-- license by dropping, or cutting and pasting, the selected text onto the");
        licFinal.add("-- 'License information' frame of the Setup tab in the hub configuration window.");
        licFinal.add("------ NMS Hub License");
        licFinal.add("-----------------------------------------------------------------------------------------------");
        try {
            // While there are still licenses to be created in the lic1 array create them.
            while(count < lic1.size()){
                // If the licenses are to expire in 1 year that set the sDat to 1 year from the date it is ran. Else set sDate to unlimited.
                if(limited == true){
                    license = lic1.get(count).getProbe() + " Nimsoft "+ lic1.get(count).getNumber()+ " " +lic1.get(count).getUsers()+" "+sDate;
                }else{
                    license = lic1.get(count).getProbe() + " Nimsoft "+ lic1.get(count).getNumber()+ " " +lic1.get(count).getUsers()+" "+sDate;
                }
                System.out.println(license);
                // Add the licenses without the Date to the ArrayList TemplateLic.
                TemplateLic.add(lic1.get(count).getProbe() + " Nimsoft "+ lic1.get(count).getNumber()+ " " +lic1.get(count).getUsers());
                // The below commands open a new process to run nimlic.exe to create the licenses.
                //   System.out.println(license);
                Runtime rt = Runtime.getRuntime();
                Process pr = rt.exec("nimlic.exe -f, "+license);
                // Read the licenses off of the command line.
                BufferedReader input = new BufferedReader(new InputStreamReader(pr.getInputStream()));
                // Add the license to the ArrayList licFinal.
                licFinal.add(input.readLine());
                count++;
                // If count equals 3 that just added a dotted line between the hub license and the rest of the probes.
                if(count == 3){
                    licFinal.add("-----------------------------------------------------------------------------------------------");
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        // Write the informaiton in the ArrayList licFinal to the correct file.
        for(int i =0; i<licFinal.size();i++){
            writer.println(licFinal.get(i));
        }
        writer.close();
        // Write the template for the licenses to the licTemp.txt file.
        try {
            tempwrite  = new PrintWriter("licTemp.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        for(int i = 0; i< TemplateLic.size();i++){
            tempwrite.println(TemplateLic.get(i));
        }
        tempwrite.close();
        nimlicLog = new File(",");
        if(nimlicLog.exists()){
            nimlicLog.delete();
        }else{}
        // Copy the finished file to the web.
        if(limited == true){
            source = new File("lic.txt");
        }else{
            source = new File("Unlic.txt");
        }
        try {
            FileUtils.copyFileToDirectory(source, dest);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public String oneLicense(String sLicense) {

        String sLic = null;
        String sTemp = null;
        String sDate =  null;
        String[] parsed = null;
        String delimsForward = "[/]+";
        String delims = "[ ]+";
        License lic = new License();
        if(sLicense.contains("/")){
            //  System.out.println("split with a /y");

            parsed = sLicense.split(delimsForward);
        }else{
            parsed = sLicense.split(delims);
        }
        lic.setProbe(parsed[0]);
        lic.setNimsoft(parsed[1]);
        lic.setNumber(parsed[2]);
        lic.setUsers(parsed[3]);
        sTemp = lic.getProbe() + " Nimsoft " + lic.getNumber()+" "+lic.getUsers() + " "+ sDate;



        //lic1.get(count).getProbe() + " Nimsoft "+ lic1.get(count).getNumber()+ " " +lic1.get(count).getUsers()+" "+sDate;
        return sLic;

    }
}


