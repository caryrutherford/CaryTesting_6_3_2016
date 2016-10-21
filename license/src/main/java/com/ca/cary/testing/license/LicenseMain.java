package com.ca.cary.testing.license;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by caryTesting on 3/7/2016.
 */
public class LicenseMain {
public void LicenseMain(){}

    public boolean getLicense() {
//    public List<String> getLicense(char[] cAnswers, String sLicense) {
        boolean limited = true;
        boolean passed =  false;
        char[] cAnswers = new char[2];
        String sAnswer;
        List<License> lic1 = new ArrayList<License>();
        List<License> lic2 = new ArrayList<License>();
        List<String> licFinal = new ArrayList<String>();
        String sLic = new String();
        Scanner in = new Scanner(System.in);
        //Files

        File licTemp = new File("licTemp.txt");     // Does not change.
        File licAdd = new File("licAdd.txt");   // new file
        File lic = new File("lic.txt");
        // Call to other classes.
        ReadFile read = new ReadFile();
        ReadFile read2 = new ReadFile();
        FileManipulation merge = new FileManipulation();
        CreateLicense create = new CreateLicense();
        // Check to see if it is a renewal.
        do {
            System.out.println("Is this a renewal?(y)es or (n)o");
            sAnswer = in.nextLine().toLowerCase();
            if(sAnswer.isEmpty()){
                sAnswer = "zebra";
            }else{}
            cAnswers[0] = sAnswer.charAt(0);
        }while((cAnswers[0] != 'y') && (cAnswers[0] != 'n'));
        // Ask if the license will expire.
        do {
            System.out.println("Will the license expire in one year?(y)es or (n)o");
            sAnswer = in.nextLine().toLowerCase();
            if(sAnswer.isEmpty()){
                sAnswer = "zebra";
            }else{}
            cAnswers[1] = sAnswer.charAt(0);
        }while((cAnswers[1] != 'y') && (cAnswers[1] != 'n'));

        if(cAnswers[0] =='y'){
            lic1 = read.readFile(licTemp);
        } else {
            lic1 = read.readFile(licTemp);
            lic2 = read2.readFile(licAdd);
            //merge them together and remove duplicates.
            merge.mergeFiles(lic1, lic2);
            //Sort the licenses and put the in order.
            merge.sortArray(lic1);
        }
        // Check to see if the license will expire.
        if(cAnswers[1] == 'y'){
            limited = true;
        }else{
            limited=false;
        }

        // Check to see if we are only creating one license
      /*  if(cAnswers[2] == 'y'){
            // licFinal.add(create.oneLicense(sLicense));
        } else {*/
        create.newLicense(lic1, licFinal, limited);
        //}

        for(int i = 0; i < licFinal.size(); i++){
            System.out.println(licFinal.get(i));
        }
        System.out.println("Back to Main");
        if(licFinal.size() > 0){
            passed = true;
        }else{
            passed=false;
        }
        //return licFinal;
        return passed;

    }

}

