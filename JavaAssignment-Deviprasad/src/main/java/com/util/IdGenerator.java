package com.util;

public class IdGenerator {

    private static IdGenerator instance;
    private int id=1;

    private IdGenerator(){}

    public static IdGenerator getInstance(){
        if(instance==null) instance= new IdGenerator();
        return instance;
    }

    public int generateId(){ return id++;}
}
