package com.alirezaft.OODFinal;

import com.alirezaft.OODFinal.PublicationStates.PublicationState;
import com.alirezaft.OODFinal.PublicationStates.WritingState;

import java.util.Date;

//State Design Pattern
public class Publication {
    private String Name;
    private Date DateStablished;
    private int HashCode;
    private String Head;
    private PublicationState pubstate;

    public Publication(String name){
        Name = name;
        DateStablished = new Date((int)(Math.random() * 20000));
        pubstate = new WritingState();
        HashCode = (int)(Math.random() * 10000);

    }

    public String getName() {
        return Name;
    }

    public Date getDateStablished() {
        return DateStablished;
    }

    public int getHashCode() {
        return HashCode;
    }

    public String getHead() {
        return Head;
    }

    public void changePubState(PublicationState state){
        pubstate = state;
        pubstate.increaseProgress();
    }
}
