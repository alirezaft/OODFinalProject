package com.alirezaft.OODFinal.CommandStrategy;

import com.alirezaft.OODFinal.Database;
import com.alirezaft.OODFinal.Publication;

public class PublishStrategy extends CommandExecutionStrategy {
    @Override
    public void executeCommand(String[] args) {
        Publication p = Database.getInstance().getPublication(args[0].split("\"")[1]);
        p.publish(args[1].split("\"")[1]);
    }
}
