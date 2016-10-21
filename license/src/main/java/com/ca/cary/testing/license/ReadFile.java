package com.ca.cary.testing.license;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by caryTesting on 3/7/2016.
 */
public class ReadFile {
    //boolean
    //Integers
    int loopCounter = 0;
    //Strings
    String text = null;
    String[] parsed = null;
    String delims = "[ ]+";
    String delimsForward = "[/]+";
    //List
    // ArrayList
    List<License> license1 = new ArrayList<License>();
    // Buffer Readers.
    BufferedReader reader = null;
    //methods
    // Get the information out of the file(s) and assigns them to the arraylist licenses1 and than returns the arralist back to main..
    public List<License> readFile(File file){
        license1.clear();
        loopCounter = 0;
        try {
            reader = new BufferedReader(new FileReader(file));
            while((text = reader.readLine()) != null){
                //  System.out.println("text: " + text);
                if(!text.startsWith("--")&& (!text.equalsIgnoreCase(""))){
                    License lic = new License();
                    if(text.contains("/")){
                         System.out.println("split with a /y");

                        parsed = text.split(delimsForward);
                    }else{
                        parsed = text.split(delims);
                    }
                    System.out.println("text: "+ text);
                    System.out.println("parsed size: "+parsed.length);
                    lic.setProbe(parsed[0]);
                    lic.setNimsoft(parsed[1]);
                    lic.setNumber(parsed[2]);
                    lic.setUsers(parsed[3]);
                    license1.add(lic);

                }else{
                    //   System.out.println("It is a bad line.");
                }

            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }catch (IOException e) {
            e.printStackTrace();
        }
        try {
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return license1;
    }
}


