package com.alirezaft.OODFinal.UserInfo;

public class SubscriberInfo {
    private String Name;
    private Gender gender;
    private int BirthYear;
    private int BirthMonth;
    private int ID;

    public SubscriberInfo(String name, Gender gender, int byear, int bmonth){
        Name = name;
        this.gender = gender;
        BirthMonth = bmonth;
        BirthYear = byear;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append("Name: " + Name + "\n");
        sb.append("Gender: " + gender + "\n");
        sb.append("Year of birth: " + BirthYear + "\n");
        sb.append("Month of birth: " + BirthMonth);

        return sb.toString();
    }
}
