package com.alirezaft.OODFinal;

public class SubscriberInfo {
    private String FirstName;
    private String LastName;
    private Gender gender;
    private int BirthYear;
    private int BirthMonth;

    public SubscriberInfo(String fname, String lname, Gender gender, int byear, int bmonth){
        FirstName = fname;
        LastName = lname;
        this.gender = gender;
        BirthMonth = bmonth;
        BirthYear = byear;
    }
}
