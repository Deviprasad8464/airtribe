package com.entity;

import java.util.Objects;

public class Patient extends Person implements Cloneable {

    public Patient(int id,String name,int age)
    {
        super(id,name,age);
    }

    @Override
    public Patient clone(){
        return new Patient(id,name,age);
    }

    @Override
    public boolean equals(Object o){
        if(this==o) return true;
        if(!(o instanceof Patient)) return false;

        return id==((Patient)o).id;
    }

    @Override
    public int hashCode(){
        return Objects.hash(id);
    }
}
