package com.alirezaft.OODFinal.CommandStrategy;

import com.alirezaft.OODFinal.Database;
import com.alirezaft.OODFinal.Publication.EconomicalPublication;
import com.alirezaft.OODFinal.Publication.Publication;
import com.alirezaft.OODFinal.Publication.PublicationBuilders.PublicationBuildDirector;

public class NewPublicationStrategy extends CommandExecutionStrategy {
    @Override
    public void executeCommand(String[] args) {
        String name = args[0].split("\"")[1];
        PublicationBuildDirector pb = new PublicationBuildDirector();
        Publication p = pb.buildPublication(name);
        if(p != null){
            Database.getInstance().addPublication(p);
        }
        //TODO!!!!!
    }
}
