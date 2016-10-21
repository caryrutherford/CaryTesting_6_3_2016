package com.ca.cary.testing.main;

import com.ca.cary.testing.adminConsole.run.AdminConsoleMain;
import com.ca.cary.testing.license.LicenseMain;

import java.util.Scanner;

/**
 * Created by caryTesting on 3/7/2016.
 */
public class Main {

    public static void main(String[] args) {
       Main main = new Main();
        main.start();
    }

    public void start(){
        boolean btest = true;
        char cAnswer = 'z'; // See if the user wants to contiune.
        char cSelection = 'z';  // See what the user wants to do.
        String sAnswer;
        Scanner in = new Scanner(System.in);
        AdminConsoleMain AC = new AdminConsoleMain();
        LicenseMain lic = new LicenseMain();


        // Ask what to do.
        do {
            do {
                System.out.println("Please pick an option from the list.\n(A)dmin Console.\n(U)MP.\n(Q)uit to exit.");
                sAnswer = in.nextLine().toLowerCase();
                if (sAnswer.isEmpty()) {
                    sAnswer = "zebra";
                } else {
                }
                cSelection = sAnswer.charAt(0);
            } while ((cSelection != 'a') && (cSelection != 'u') && (cSelection != 'q')&& (cSelection != 'l'));
            if (cSelection == 'a') {
                // Go into admin console and configure items.
                AC.getAdminConsole();
            } else if (cSelection == 'l') {
                // This option will not work on any LINUX based systems. Has to run on Windows.
                // Ceate a new set of licenses
                System.out.println("Createing license.");
                lic.getLicense();
            } else if (cSelection == 'u') {
                // Go to UMP and run an automated report on a protlet.
            } else{}

            do {
                System.out.println("Do you wish to contiune? (y)es or (n)o");
                sAnswer = in.nextLine().toLowerCase();
                if (sAnswer.isEmpty()) {
                    sAnswer = "zebra";
                } else {
                }
                cAnswer = sAnswer.charAt(0);
            } while ((cAnswer != 'y') && (cAnswer != 'n'));
        }while ((cAnswer != 'n'));
    }
}
