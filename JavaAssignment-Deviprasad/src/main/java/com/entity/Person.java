package com.entity;

public abstract class Person {

    protected int id;
    protected String name;
    protected int age;

    public Person(int id, String name, int age)
    {
        this.id=id;
        this.age=age;
        this.name=name;
    }

    public int getId(){return id;}
    public int getAge(){return age;}
    public String getName(){return name;}

}
