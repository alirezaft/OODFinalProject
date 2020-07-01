package com.alirezaft.OODFinal;

public class PrintInfoStrategy extends CommandExecutionStrategy{

    @Override
    public void executeCommand(String[] args) {
        Publication curr;
        for(int i = 0; i < Database.getInstance().getNumberOfPublications(); i++){
            curr = Database.getInstance().getPublication(i);
            System.out.println();
            System.out.println("Name: " + curr.getName());
            System.out.println("Date stablished: " + curr.getDateStablished());
            System.out.println("Hshcode: " + curr.getHashCode());
            System.out.println("Head: " + curr.getHashCode());
        }
    }
}
