package com.alirezaft.OODFinal.CommandStrategy;

import com.alirezaft.OODFinal.Database;
import com.alirezaft.OODFinal.Publication;

public class NewPublicationStrategy extends CommandExecutionStrategy {
    @Override
    public void executeCommand(String[] args) {
        String name = args[0].split("\"")[1];
        Publication pub = new Publication(name);
        Database.getInstance().addPublication(pub);
    }
}
