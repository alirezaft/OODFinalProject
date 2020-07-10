package com.alirezaft.OODFinal.UserInfo;

public class Subscriber {
    private int ID;
    private SubscriberInfo info;

    private String msg;

    public Subscriber(SubscriberInfo info, int id){
        this.info = info;
        ID = id;
    }

    public void notify(String message){
        System.out.println("I'm user " + ID + ". I've got a Message: " + message);
    }

    public int getID() {
        return ID;
    }


}
