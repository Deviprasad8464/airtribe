package com.service;

import com.entity.Patient;
import com.util.DataStore;

public class PatientService {

    private DataStore<Patient> store=new DataStore<>();

    public void add(Patient p)
    {
        store.add(p.getId(),p);
    }

    public Patient get(int id)
    {
        return store.get(id);
    }
}
