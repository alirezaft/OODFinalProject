package com.alirezaft.OODFinal.CommandStrategy;

import com.alirezaft.OODFinal.MarkStrategy.QuestionMarkMarkStrategy;
import com.alirezaft.OODFinal.CommandLineInterpreter;

public class RemoveQuestionMarkStrategy extends CommandExecutionStrategy {
    private CommandLineInterpreter cmd;

    @Override
    public void executeCommand(String[] args) {
        if(cmd.getPrintInfoMarkStrategy() != null && cmd.getPrintInfoMarkStrategy() instanceof QuestionMarkMarkStrategy){
            cmd.addPrintInfoDecorator(null);
        }else{
            System.out.println("Question mark decorator not found.");
        }
    }

    public RemoveQuestionMarkStrategy(CommandLineInterpreter c){
        cmd = c;
    }
}
