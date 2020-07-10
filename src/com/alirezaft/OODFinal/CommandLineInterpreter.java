package com.alirezaft.OODFinal;

import com.alirezaft.OODFinal.MarkStrategy.PrintInfoMarkStrategy;
import com.alirezaft.OODFinal.CommandStrategy.*;

import java.util.Scanner;

//Singleton and Strategy Design Pattern
public class CommandLineInterpreter {
    private static CommandLineInterpreter instance;
    private Scanner CommandReader;
    private CommandExecutionStrategy strategy;
    private PrintInfoMarkStrategy prtinfdec;


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
        String comm;
        String[] commsec = null;

        if(CommandReader.hasNext()){
            comm = CommandReader.nextLine();
            commsec = comm.split(" ");
        }else{
            return;
        }

        switch (commsec[0].toLowerCase()) {
            case "printinfo":
                changeStrategy(new PrintInfoStrategy(this));
                break;
            case "createmodel":
                changeStrategy(new NewPublicationStrategy());
                break;
            case "addq":
                changeStrategy(new AddQuestionMarkStrategy(this));
                break;
            case "addstar":
                changeStrategy(new AddStarMarkStrategy(this));
                break;
            case "removeq":
                changeStrategy(new RemoveQuestionMarkStrategy(this));
                break;
            case "removestar":
                changeStrategy(new RemoveStarMarkStrategy(this));
                break;
            case "geteditingprogress":
                changeStrategy(new GetEditingProgressStrategy());
                break;
            case "startprinting":
                changeStrategy(new StartPrintingStrategy());
                break;
            case "startpublishing":
                changeStrategy(new StartPublishingStrategy());
                break;
            case "getprintingprogress":
                changeStrategy(new GetPrintingPorgressStrategy());
                break;
            case "subscribe":
                changeStrategy(new SubscribeStrategy());
                break;
            case "createcharacter":
                changeStrategy(new CreateCharacterStrategy());
                break;
            case "setpublishingmethod":
                changeStrategy(new SetPublishingMethodStrategy());
                break;
            case "publish":
                changeStrategy(new PublishStrategy());
                break;
            default:
                changeStrategy(null);
                System.out.println("INVALID COMMAND");
                break;
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

    public void addPrintInfoDecorator(PrintInfoMarkStrategy dec){
        prtinfdec = dec;
    }

    public PrintInfoMarkStrategy getPrintInfoMarkStrategy(){
        return prtinfdec;
    }
}
