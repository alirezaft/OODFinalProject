package com.alirezaft.OODFinal;

public class User {
    private int ID;
    private PersonalInformation Info;

    public User(PersonalInformation info, int id){
        Info = info;
        ID = id;
    }

    public int getID() {
        return ID;
    }

    public PersonalInformation getInfo() {
        return Info;
    }
}
