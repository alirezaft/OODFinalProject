package com.alirezaft.OODFinal;

public class AddUserStrategy extends CommandExecutionStrategy {

    @Override
    public void executeCommand(String[] args) {
        System.out.println("USER ADDED");
        Database.getInstance().addUser(new User());
    }
}
