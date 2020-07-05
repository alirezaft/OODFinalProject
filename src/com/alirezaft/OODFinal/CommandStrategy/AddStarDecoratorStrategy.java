package com.alirezaft.OODFinal.CommandStrategy;

import com.alirezaft.OODFinal.MarkStrategy.StarStrategy;
import com.alirezaft.OODFinal.CommandLineInterpreter;

public class AddStarDecoratorStrategy extends CommandExecutionStrategy {
    private CommandLineInterpreter cmd;

    @Override
    public void executeCommand(String[] args) {
        cmd.addPrintInfoDecorator(new StarStrategy());
    }

    public AddStarDecoratorStrategy(CommandLineInterpreter c){
        cmd = c;
    }
}
