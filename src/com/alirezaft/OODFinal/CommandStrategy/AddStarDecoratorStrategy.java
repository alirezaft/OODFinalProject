package com.alirezaft.OODFinal.CommandStrategy;

import com.alirezaft.OODFinal.CommandLineDecorators.StarDecorator;
import com.alirezaft.OODFinal.CommandLineInterpreter;

public class AddStarDecoratorStrategy extends CommandExecutionStrategy {
    private CommandLineInterpreter cmd;

    @Override
    public void executeCommand(String[] args) {
        cmd.addPrintInfoDecorator(new StarDecorator());
    }

    public AddStarDecoratorStrategy(CommandLineInterpreter c){
        cmd = c;
    }
}
