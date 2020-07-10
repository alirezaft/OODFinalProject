package com.alirezaft.OODFinal.Publication;

public class PoliticalPublication extends Publication {
    private static PoliticalPublication instance = null;

    private PoliticalPublication(){}

    public static PoliticalPublication getInstance(){
        if(instance == null){
            instance = new PoliticalPublication();
        }
        return instance;
    }

}
