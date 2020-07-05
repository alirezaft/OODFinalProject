package com.alirezaft.OODFinal;

import java.util.LinkedList;
import java.util.List;

//Singleton design patternx
public class Database {
    private LinkedList<Publication> Publications = new LinkedList<>();
    private LinkedList<User> Users = new LinkedList<>();
    private static Database instance;

    private Database(){}

    public static Database getInstance(){
        if(instance == null){
            instance = new Database();
        }
        return instance;
    }

    public int getNumberOfPublications(){
        return Publications.size();
    }

    public int getNumberOfUsers(){
        return Users.size();
    }

    public void addUser(User user){
        Users.add(user);
    }

    public User getUser(int ID){
        return Users.get(ID);
    }

    public void addPublication(Publication pub){
        Publications.add(pub);
    }

    public Publication getPublication(int ID){
        return Publications.get(ID);
    }

    public Publication getPublication(String name){
        for (Publication p : Publications) {
            if(p.getName().equals(name)){
                return p;
            }
        }
        return null;
    }
}
