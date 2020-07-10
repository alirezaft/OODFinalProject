package com.alirezaft.OODFinal.CommandStrategy;

import com.alirezaft.OODFinal.CommandLineInterpreter;
import com.alirezaft.OODFinal.Database;
import com.alirezaft.OODFinal.MarkStrategy.PrintInfoMarkStrategy;
import com.alirezaft.OODFinal.Publication.Publication;

public class PrintInfoStrategy extends CommandExecutionStrategy{
    private CommandLineInterpreter cmd;

    @Override
    public void executeCommand(String[] args) {
        Publication curr;
        PrintInfoMarkStrategy pim = cmd.getPrintInfoMarkStrategy();
        if(pim != null){
            pim.printMark();
        }

        for(int i = 0; i < Database.getInstance().getNumberOfPublications(); i++){
            curr = Database.getInstance().getPublication(i);
//            System.out.println();
            System.out.println("Name: " + curr.getName());
            System.out.println("Date stablished: " + curr.getDateStablished());
            System.out.println("Hashcode: " + curr.getHashCode());
            System.out.println("Head: " + curr.getHashCode());
        }
    }

    public PrintInfoStrategy(CommandLineInterpreter c){
        cmd = c;
    }
}
