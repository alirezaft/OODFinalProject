package com.alirezaft.OODFinal;

import com.alirezaft.OODFinal.MarkStrategy.PrintInfoStrategy;
import com.alirezaft.OODFinal.CommandStrategy.*;

import java.util.Scanner;

//Singleton and Strategy Design Pattern
public class CommandLineInterpreter {
    private static CommandLineInterpreter instance;
    private Scanner CommandReader;
    private CommandExecutionStrategy strategy;
    private PrintInfoStrategy prtinfdec;


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

        for (String s:commsec){
            System.out.println(s);
        }

        if(commsec[0].toLowerCase().equals("printinfo")){
            changeStrategy(new com.alirezaft.OODFinal.CommandStrategy.PrintInfoStrategy(this));
        }else if(commsec[0].toLowerCase().equals("createmodel")){
            changeStrategy(new NewPublicationStrategy());
        }else if(commsec[0].toLowerCase().equals("addq")){
            changeStrategy(new AddQuestionDecoratorStrategy(this));
        }else if(commsec[0].toLowerCase().equals("addstar")){
            changeStrategy(new AddStarDecoratorStrategy(this));
        }else if(commsec[0].toLowerCase().equals("removeq")){
            changeStrategy(new RemoveQuestionDecoratorStrategy(this));
        }else if(commsec[0].toLowerCase().equals("removestar")){
            changeStrategy(new RemoveStarDecoratorStrategy(this));
        }else if(commsec[0].toLowerCase().equals("geteditingprogress")){
            changeStrategy(new GetEditingProgressStrategy());
        }else if(commsec[0].toLowerCase().equals("startprinting")){
            changeStrategy(new StartPrintingStrategy());
        }else if(commsec[0].toLowerCase().equals("startpublishing")){
            changeStrategy(new StartPublishingStrategy());
        }else if(commsec[0].toLowerCase().equals("getprintingprogress")){
            changeStrategy(new GetPrintingPorgressStrategy());
        }else if(commsec[0].toLowerCase().equals("subscribe")){
            changeStrategy(new SubscribeStrategy());
        }else if(commsec[0].toLowerCase().equals("createcharacter")){
            changeStrategy(new CreateCharacterStrategy());
        }

        else{
            changeStrategy(null);
            System.out.println("INVALID COMMAND");
        }

        String[] args = new String[commsec.length - 1];
        for (int i = 1; i < commsec.length; i++){
            args[i - 1] = commsec[i];
        }

        if(strategy != null){
            executeCommand(args);
        }
        readCommand();
    }

    private void executeCommand(String[] args){
        strategy.executeCommand(args);
    }

    private void changeStrategy(CommandExecutionStrategy strategy){
        this.strategy = strategy;
    }

    public void addPrintInfoDecorator(PrintInfoStrategy dec){
        prtinfdec = dec;
    }

    public PrintInfoStrategy getPrintInfoDecorator(){
        return prtinfdec;
    }
}
