package com.ca.cary.testing.license;

/**
 * Created by caryTesting on 3/7/2016.
 */
public class License {
    String probe, nimsoft, number, users;
    public License(){
        probe=null;
        nimsoft=null;
        number=null;
        users=null;
    }
    // Setters
    public void setProbe(String sProbe) {
        this.probe=sProbe;
    }
    public void setNimsoft(String sNimsoft) {
        this.nimsoft=sNimsoft;
    }
    public void setNumber(String sNumber) {
        this.number=sNumber;
    }
    public void setUsers(String sUser) {
        this.users = sUser;
    }
    //Getters
    public String getProbe(){
        return this.probe;
    }

    public String getNumber() {
        return this.number;
    }

    public String getUsers() {
        return this.users;
    }
}

