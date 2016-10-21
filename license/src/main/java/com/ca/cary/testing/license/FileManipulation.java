package com.ca.cary.testing.license;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by caryTesting on 3/7/2016.
 */
public class FileManipulation {
    boolean bMatch = false;
    int i=0;
    // This functions merges two files into one.
    public void mergeFiles(List<License> lic1, List<License> lic2) {
        // We need to skip the first lines do to the fact that they are hub/controller licenses and will not change.
        while((lic1.get(i).getProbe() == null) || (lic1.get(i).getProbe().equalsIgnoreCase("nimbus-v1.0"))){
            i++;
        }
        //If the name of the probe license match than remove the probe for lic2 (The file being merged).
        for(;i<lic1.size();i++){
            for(int j=0; j<lic2.size();j++){
                if(lic1.get(i).getProbe().equalsIgnoreCase(lic2.get(j).getProbe())){
                    lic2.remove(j);
                }
            }
        }
        // Once all the duplicates in lic2 ArrayList are removed combine add all the licenses to the end of the ArrayList lic1.
        for(i=0;i<lic2.size();i++){
            lic1.add(lic2.get(i));
        }

    }

    // This method takes the ArrayList lic1 and sorts it putting all the probe except the controller one is alphabetical order. A-Z
    public void sortArray(List<License> lic1) {
        int len = lic1.size();
        int count = 0;
        List<License> temp = new ArrayList<License>();
        // We need to skip the first line.
        while((lic1.get(count).getProbe() == null) || (lic1.get(count).getProbe().equalsIgnoreCase("nimbus-v1.0"))){
            count++;
        }
        // These 2 for loops sort the ArrayList
        for(int i=count; i<len; i++){
            for(int j=count; j<len;j++){
                if(lic1.get(i).getProbe().compareToIgnoreCase(lic1.get(j).getProbe())<0){
                    temp.add(lic1.get(i));
                    lic1.set(i,lic1.get(j));
                    lic1.set(j,temp.get(0));
                    temp.clear();

                }
            }
        }

    }
}


