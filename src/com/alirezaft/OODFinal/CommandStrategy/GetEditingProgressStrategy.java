package com.alirezaft.OODFinal.CommandStrategy;

import com.alirezaft.OODFinal.Database;
import com.alirezaft.OODFinal.Publication.Publication;
import com.alirezaft.OODFinal.PublicationStates.EditingState;

public class GetEditingProgressStrategy extends CommandExecutionStrategy {
    @Override
    public void executeCommand(String[] args) {
        String name = args[0].split("\"")[1];
        Publication p = Database.getInstance().getPublication(name);
        if(p.getState() instanceof EditingState){
            System.out.println(p.getState().getProgress());
        }else{
            System.out.println("wrong state");
        }
    }
}
