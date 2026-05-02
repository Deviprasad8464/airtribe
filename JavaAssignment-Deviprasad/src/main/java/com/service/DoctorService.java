package com.service;

import com.entity.Doctor;
import com.util.DataStore;

import java.util.*;
import java.util.stream.Collectors;

public class DoctorService {

    private DataStore<Doctor> store = new DataStore<>();

    // add doctor
    public void addDoctor(Doctor doctor) {
        store.add(doctor.getId(), doctor);
    }

    // get particular doctor by id
    public Doctor getDoctor(int id) {
        return store.get(id);
    }

    //get all doctors list
    public List<Doctor> getAllDoctors() {
        return store.getAll();
    }

    // update the doctor details
    public void updateDoctor(int id, String name, int age, double fee) {
        Doctor d = store.get(id);
        if (d != null) {
            d.setName(name);
            d.setAge(age);
            d.setFee(fee);
        } else {
            System.out.println("Doctor not found");
        }
    }

    // delete Doctor
    public void deleteDoctor(int id) {
        if (store.get(id) != null) {
            store.remove(id);
        } else {
            System.out.println("Doctor not found");
        }
    }

    //  SEARCH (by name)
    public List<Doctor> searchByName(String name) {
        return store.getAll().stream()
                .filter(d -> d.getName().toLowerCase().contains(name.toLowerCase()))
                .collect(Collectors.toList());
    }
}