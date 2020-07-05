package com.alirezaft.OODFinal.CommandStrategy;

import com.alirezaft.OODFinal.Database;
import com.alirezaft.OODFinal.PublicationStates.PrintingState;
import com.alirezaft.OODFinal.PublicationStates.PublicationState;

public class GetPrintingPorgressStrategy extends CommandExecutionStrategy {
    @Override
    public void executeCommand(String[] args) {
        String name = args[0].split("\"")[1];
        PublicationState s = Database.getInstance().getPublication(name).getState();
        if(s instanceof PrintingState){
            System.out.println(s.getProgress());
        }else{
            System.out.println("wrong state");
        }
    }
}
