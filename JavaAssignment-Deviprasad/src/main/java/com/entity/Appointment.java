package com.entity;

import com.enums.AppointmentStatus;

public class Appointment implements Cloneable{
    private int id;
    private Patient patient;
    private Doctor doctor;
    private AppointmentStatus status;

    public Appointment(int id, Patient patient,Doctor doctor)
    {
        this.id=id;
        this.patient=patient;
        this.doctor=doctor;
        this.status=AppointmentStatus.PENDING;
    }

    public void confirm(){status=AppointmentStatus.CONFIRMED;}
    public void cancel(){status=AppointmentStatus.CANCELLED;}

    public int getId(){ return id;}
    public Patient getPatient(){return patient;}
    public Doctor getDoctor(){return doctor;}

    @Override
    public Appointment clone()
    {
        return new Appointment(id,patient.clone(),doctor);
    }
}
