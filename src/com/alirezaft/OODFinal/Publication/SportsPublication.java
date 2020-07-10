package com.alirezaft.OODFinal.Publication;

public class SportsPublication extends Publication {
    private static SportsPublication instance = null;

    private SportsPublication(){}

    public static SportsPublication getInstance(){
        if(instance == null){
            instance = new SportsPublication();
        }
        return instance;
    }
}
