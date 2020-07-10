package com.alirezaft.OODFinal.CommandStrategy;

import com.alirezaft.OODFinal.MarkStrategy.StarMarkStrategy;
import com.alirezaft.OODFinal.CommandLineInterpreter;

public class AddStarMarkStrategy extends CommandExecutionStrategy {
    private CommandLineInterpreter cmd;

    @Override
    public void executeCommand(String[] args) {
        cmd.addPrintInfoDecorator(new StarMarkStrategy());
    }

    public AddStarMarkStrategy(CommandLineInterpreter c){
        cmd = c;
    }
}
