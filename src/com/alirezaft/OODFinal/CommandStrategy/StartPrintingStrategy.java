package com.alirezaft.OODFinal.CommandStrategy;

import com.alirezaft.OODFinal.Database;
import com.alirezaft.OODFinal.Publication;
import com.alirezaft.OODFinal.PublicationStates.PrintingState;

public class StartPrintingStrategy extends CommandExecutionStrategy {
    @Override
    public void executeCommand(String[] args) {
        String name = args[0].split("\"")[1];
        Publication p = Database.getInstance().getPublication(name);
        p.getState().changeState("print");
    }
}
