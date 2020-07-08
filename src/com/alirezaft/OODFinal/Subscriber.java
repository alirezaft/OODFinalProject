package com.alirezaft.OODFinal;

public class Subscriber {
    private int ID;
    private SubscriberInfo info;

    private String msg;

    public Subscriber(SubscriberInfo info, int id){
        this.info = info;
        ID = id;
    }

    public void notify(String message){
        System.out.println("I'm user " + ID + ". got my paper via.");
        msg = message;
        System.out.println("Also, got Message: " + msg);
    }

    public int getID() {
        return ID;
    }


}
