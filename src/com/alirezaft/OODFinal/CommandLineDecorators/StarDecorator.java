package com.alirezaft.OODFinal.CommandLineDecorators;

public class StarDecorator extends PrintInfoDecorator {
    @Override
    public void printMark() {
        System.out.print("*");
    }
}
