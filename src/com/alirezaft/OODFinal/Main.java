package com.alirezaft.OODFinal;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner scn = new Scanner(new File("comms.txt"));
        CommandLineInterpreter.getInstance().setScanner(scn);

        CommandLineInterpreter.getInstance().readCommand();

    }
}
