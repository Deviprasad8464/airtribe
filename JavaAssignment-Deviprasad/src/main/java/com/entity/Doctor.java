package com.entity;

import com.enums.Specialization;

public class Doctor extends Person {
    private Specialization specialization;
    private double fee;

    public Doctor(int id,String name,int age,Specialization specialization,double fee){
        super(id,name,age);
        this.specialization=specialization;
        this.fee=fee;
    }

    public Specialization getSpecialization(){ return specialization;}
    public double getFee(){ return fee;}
}
