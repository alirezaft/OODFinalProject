package com.alirezaft.OODFinal.CommandStrategy;

import com.alirezaft.OODFinal.CommandLineDecorators.StarDecorator;
import com.alirezaft.OODFinal.CommandLineInterpreter;

public class RemoveStarDecoratorStrategy extends CommandExecutionStrategy {
    CommandLineInterpreter cmd;

    @Override
    public void executeCommand(String[] args) {
        if(cmd.getPrintInfoDecortor() != null && cmd.getPrintInfoDecortor() instanceof StarDecorator){
            cmd.addPrintInfoDecorator(null);
        }else{
            System.out.println("Star decorator not found.");
        }
    }

    public RemoveStarDecoratorStrategy(CommandLineInterpreter c){
        cmd = c;
    }
}
