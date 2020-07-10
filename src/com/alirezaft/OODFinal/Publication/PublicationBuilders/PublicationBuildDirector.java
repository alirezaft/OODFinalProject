package com.alirezaft.OODFinal.Publication.PublicationBuilders;

import com.alirezaft.OODFinal.Publication.Publication;

public class PublicationBuildDirector {
    public Publication buildPublication(String name){
        PublicationBuilder builder = null;
        switch (name.toLowerCase()) {
            case "economical":
                builder = new EconomicalPublicationBuilder();
                break;
            case "political":
                builder = new PoliticalPublicationBuilder();
                break;
            case "sports":
                builder = new SportsPublicationBuilder();
                break;
        }
        if(builder != null) {
            return builder.build();
        }else{
            System.out.println("WRONG NAME");
            return null;
        }
    }
}
