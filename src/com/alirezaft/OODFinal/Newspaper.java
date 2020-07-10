package com.alirezaft.OODFinal;

import java.util.ArrayList;
import java.util.Hashtable;

public class Newspaper {
    private int Hashcode;
    private Hashtable<String, Integer> Newspapers = new Hashtable<>();

    public Newspaper(int hashcode, String name){
        Hashcode = hashcode;
    }

    public void addNewPaper(String name){
        Newspapers.put(name, 0);
    }

    public void makeNewIssue(String name){
        Newspapers.put(name, Newspapers.get(name) + 1);
    }
}
