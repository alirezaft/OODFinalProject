package com.alirezaft.OODFinal.CommandStrategy;

import com.alirezaft.OODFinal.MarkStrategy.QuestionMarkMarkStrategy;
import com.alirezaft.OODFinal.CommandLineInterpreter;

public class AddQuestionMarkStrategy extends CommandExecutionStrategy {
    private CommandLineInterpreter cmd;
    @Override
    public void executeCommand(String[] args) {
        cmd.addPrintInfoDecorator(new QuestionMarkMarkStrategy());
    }

    public AddQuestionMarkStrategy(CommandLineInterpreter c){
        cmd = c;
    }
}
