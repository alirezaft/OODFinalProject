package com.alirezaft.OODFinal.CommandStrategy;

import com.alirezaft.OODFinal.Database;
import com.alirezaft.OODFinal.Gender;
import com.alirezaft.OODFinal.PersonalInformation;
import com.alirezaft.OODFinal.User;

public class CreateCharacterStrategy extends CommandExecutionStrategy {
    @Override
    public void executeCommand(String[] args) {
        String name = args[0];
        Gender gender = null;
        if(args[1].equals("male")){
            gender = Gender.MALE;
        }else if(args[1].equals("female")){
            gender = Gender.FEMALE;
        }
        String BirthD = args[2];
        PersonalInformation p = new PersonalInformation(name, gender, BirthD);
        Database.getInstance().addUser(new User(p, Database.getInstance().getNumberOfUsers() - 1));
    }
}
