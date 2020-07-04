package com.alirezaft.OODFinal.CommandStrategy;

import com.alirezaft.OODFinal.CommandLineDecorators.QuestionMarkDecorator;
import com.alirezaft.OODFinal.CommandLineInterpreter;

public class AddQuestionDecoratorStrategy extends CommandExecutionStrategy {
    private CommandLineInterpreter cmd;
    @Override
    public void executeCommand(String[] args) {
        cmd.addPrintInfoDecorator(new QuestionMarkDecorator());
    }

    public AddQuestionDecoratorStrategy(CommandLineInterpreter c){
        cmd = c;
    }
}
