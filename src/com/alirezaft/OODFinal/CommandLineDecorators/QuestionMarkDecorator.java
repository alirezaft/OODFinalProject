package com.alirezaft.OODFinal.CommandLineDecorators;

public class QuestionMarkDecorator extends PrintInfoDecorator {
    @Override
    public void printMark() {
        System.out.print("?");
    }
}
