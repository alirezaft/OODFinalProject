package com.alirezaft.OODFinal.CommandStrategy;

public class AddUserStrategy extends CommandExecutionStrategy {

    @Override
    public void executeCommand(String[] args) {
        System.out.println("USER ADDED");
//        Database.getInstance().addUser(new User());
    }
}
