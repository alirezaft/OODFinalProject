package com.alirezaft.OODFinal;


import com.alirezaft.OODFinal.UserInfo.Subscriber;

import java.util.ArrayList;

//Observer design pattern
public class Publisher {
    private ArrayList<Subscriber> Subscribers = new ArrayList<>();

    public void publish(String message){
        for (Subscriber s : Subscribers) {
            s.notify(message);
        }
    }

    public void addSubscriber(Subscriber s){
        if(Subscribers.contains(s)){
            return;
        }
        Subscribers.add(s);
    }

    public int getNumberOfSbscribers(){
        return Subscribers.size();
    }
}
