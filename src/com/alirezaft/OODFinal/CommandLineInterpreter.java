package com.alirezaft.OODFinal;

import java.util.Scanner;

//Singleton and Strategy Design Pattern
public class CommandLineInterpreter {
    private static CommandLineInterpreter instance;
    private Scanner CommandReader;
    CommandExecutionStrategy strategy;



    private CommandLineInterpreter(){}

    public void setScanner(Scanner scn){
        CommandReader = scn;
    }

    public static CommandLineInterpreter getInstance(){
        if(instance == null){
            instance = new CommandLineInterpreter();
        }
        return instance;
    }

    public void readCommand(){
        String comm = CommandReader.nextLine();
        String[] commsec = comm.split(" ");
        if(commsec[0].toLowerCase().equals("subscriber")){
            changeStrategy(new AddUserStrategy());
        }else if(commsec[0].toLowerCase().equals("printinfo")){
            changeStrategy(new PrintInfoStrategy());
        }else if(commsec[0].toLowerCase().equals("createmodel")){
            changeStrategy(new NewPublicationStrategy());
        }

        String[] args = new String[commsec.length - 1];
        for (int i = 1; i < commsec.length; i++){
            args[i - 1] = commsec[i];
        }
        executeCommand(args);
        readCommand();
    }

    private void executeCommand(String[] args){
        strategy.executeCommand(args);
    }

    private void changeStrategy(CommandExecutionStrategy strategy){
        this.strategy = strategy;
    }
}
