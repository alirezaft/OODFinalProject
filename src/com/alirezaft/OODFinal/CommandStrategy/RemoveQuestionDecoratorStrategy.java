package com.alirezaft.OODFinal.CommandStrategy;

import com.alirezaft.OODFinal.MarkStrategy.QuestionMarkStrategy;
import com.alirezaft.OODFinal.CommandLineInterpreter;

public class RemoveQuestionDecoratorStrategy extends CommandExecutionStrategy {
    private CommandLineInterpreter cmd;

    @Override
    public void executeCommand(String[] args) {
        if(cmd.getPrintInfoDecorator() != null && cmd.getPrintInfoDecorator() instanceof QuestionMarkStrategy){
            cmd.addPrintInfoDecorator(null);
        }else{
            System.out.println("Question mark decorator not found.");
        }
    }

    public RemoveQuestionDecoratorStrategy(CommandLineInterpreter c){
        cmd = c;
    }
}
