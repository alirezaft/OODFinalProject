package com.alirezaft.OODFinal.CommandStrategy;

import com.alirezaft.OODFinal.Database;
import com.alirezaft.OODFinal.UserInfo.Gender;
import com.alirezaft.OODFinal.UserInfo.PersonalInformation;
import com.alirezaft.OODFinal.UserInfo.User;

public class CreateCharacterStrategy extends CommandExecutionStrategy {
    @Override
    public void executeCommand(String[] args) {
        String name = args[0].split("\"")[1];
        Gender gender = null;
        if(args[1].split("\"")[1].equals("male")){
            gender = Gender.MALE;
        }else if(args[1].split("\"")[1].equals("female")){
            gender = Gender.FEMALE;
        }
        String BirthD = args[2].split("\"")[1];

        PersonalInformation p = new PersonalInformation(name, gender, BirthD);
        User u = new User(p, Database.getInstance().getNumberOfUsers() - 1);
        Database.getInstance().addUser(u);
        System.out.println("Charcter \"" + u.getID() + "\"\n" + p.toString());
    }
}
