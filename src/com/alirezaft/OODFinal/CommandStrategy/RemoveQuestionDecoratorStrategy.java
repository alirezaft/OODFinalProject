package com.alirezaft.OODFinal.CommandStrategy;

import com.alirezaft.OODFinal.CommandLineDecorators.QuestionMarkDecorator;
import com.alirezaft.OODFinal.CommandLineInterpreter;

public class RemoveQuestionDecoratorStrategy extends CommandExecutionStrategy {
    private CommandLineInterpreter cmd;

    @Override
    public void executeCommand(String[] args) {
        if(cmd.getPrintInfoDecortor() != null && cmd.getPrintInfoDecortor() instanceof QuestionMarkDecorator){
            cmd.addPrintInfoDecorator(null);
        }else{
            System.out.println("Question mark decorator not found.");
        }
    }

    public RemoveQuestionDecoratorStrategy(CommandLineInterpreter c){
        cmd = c;
    }
}
