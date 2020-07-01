package com.alirezaft.OODFinal;

public class NewPublicationStrategy extends CommandExecutionStrategy {
    @Override
    public void executeCommand(String[] args) {
        String name = args[0].split("\"")[1];
        Publication pub = new Publication(name);
        Database.getInstance().addPublication(pub);
    }
}
