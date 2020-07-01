package com.alirezaft.OODFinal;

import java.util.Date;

public class Publication {
    private String Name;
    private Date DateStablished;
    private int HashCode;
    private String Head;
    private String Category;

    public Publication(String name){
        Name = name;
        DateStablished = new Date((int)(Math.random() * 20000));
    }


    @Override
    public String toString() {
        return ("Publication: " + Name + "\n") +
                "\tFunded on: " + DateStablished + "\n" +
                "\t Hash code: " + HashCode + "\n";
    }

    public String getName() {
        return Name;
    }

    public Date getDateStablished() {
        return DateStablished;
    }

    public int getHashCode() {
        return HashCode;
    }

    public String getHead() {
        return Head;
    }

    public String getCategory() {
        return Category;
    }
}
