package com.alirezaft.OODFinal.CommandStrategy;

import com.alirezaft.OODFinal.Database;
import com.alirezaft.OODFinal.User;

public class AddUserStrategy extends CommandExecutionStrategy {

    @Override
    public void executeCommand(String[] args) {
        System.out.println("USER ADDED");
//        Database.getInstance().addUser(new User());
    }
}
