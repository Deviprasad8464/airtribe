package com.service;

import com.entity.Appointment;
import com.entity.Doctor;
import com.entity.Patient;
import com.exception.AppointmentNotFoundException;
import com.util.DataStore;
import com.util.IdGenerator;

public class AppointmentService {

    private DataStore<Appointment> store=new DataStore<>();

    public Appointment create(Patient p, Doctor d)
    {
        int id= IdGenerator.getInstance().generateId();
        Appointment a=new Appointment(id,p,d);
        store.add(id,a);

        return a;
    }

    public void cancel(int id)
    {
        Appointment a=store.get(id);
        if(a==null) throw new AppointmentNotFoundException("Not Found");
        a.cancel();
    }
}
