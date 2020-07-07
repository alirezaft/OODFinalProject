package com.alirezaft.OODFinal;

public class SubscriberInfo {
    private String Name;
    private Gender gender;
    private int BirthYear;
    private int BirthMonth;

    public SubscriberInfo(String name, Gender gender, int byear, int bmonth){
        Name = name;
        this.gender = gender;
        BirthMonth = bmonth;
        BirthYear = byear;
    }
}
