package com.alirezaft.OODFinal.CommandStrategy;

import com.alirezaft.OODFinal.MarkStrategy.StarMarkStrategy;
import com.alirezaft.OODFinal.CommandLineInterpreter;

public class RemoveStarMarkStrategy extends CommandExecutionStrategy {
    CommandLineInterpreter cmd;

    @Override
    public void executeCommand(String[] args) {
        if(cmd.getPrintInfoMarkStrategy() != null && cmd.getPrintInfoMarkStrategy() instanceof StarMarkStrategy){
            cmd.addPrintInfoDecorator(null);
        }else{
            System.out.println("Star decorator not found.");
        }
    }

    public RemoveStarMarkStrategy(CommandLineInterpreter c){
        cmd = c;
    }
}
