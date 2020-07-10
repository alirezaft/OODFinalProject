package com.alirezaft.OODFinal.Publication;

import com.alirezaft.OODFinal.PublicationStates.EditingState;

import java.util.Date;

public class EconomicalPublication extends Publication {
    private static EconomicalPublication instance;

    private EconomicalPublication(){}

    public static EconomicalPublication getInstance(){
        if(instance == null){
            instance = new EconomicalPublication();
        }
        return instance;
    }



}
