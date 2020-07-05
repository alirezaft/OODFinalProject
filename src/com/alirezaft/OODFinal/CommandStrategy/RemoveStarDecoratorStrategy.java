package com.alirezaft.OODFinal.CommandStrategy;

import com.alirezaft.OODFinal.MarkStrategy.StarStrategy;
import com.alirezaft.OODFinal.CommandLineInterpreter;

public class RemoveStarDecoratorStrategy extends CommandExecutionStrategy {
    CommandLineInterpreter cmd;

    @Override
    public void executeCommand(String[] args) {
        if(cmd.getPrintInfoDecorator() != null && cmd.getPrintInfoDecorator() instanceof StarStrategy){
            cmd.addPrintInfoDecorator(null);
        }else{
            System.out.println("Star decorator not found.");
        }
    }

    public RemoveStarDecoratorStrategy(CommandLineInterpreter c){
        cmd = c;
    }
}
