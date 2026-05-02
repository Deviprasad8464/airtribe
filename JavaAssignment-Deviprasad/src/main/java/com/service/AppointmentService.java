package com.service;

import com.entity.*;
import com.util.*;

import java.util.*;

public class AppointmentService {

    private DataStore<Appointment> store = new DataStore<>();

    // CREATE
    public Appointment create(Patient p, Doctor d) {
        int id = IdGenerator.getInstance().generateId();
        Appointment a = new Appointment(id, p, d);
        store.add(id, a);
        return a;
    }

    // VIEW ALL
    public List<Appointment> getAll() {
        return store.getAll();
    }

    // CANCEL
    public void cancel(int id) {
        Appointment a = store.get(id);
        if (a != null) {
            a.cancel();
        } else {
            System.out.println("Appointment not found");
        }
    }
}