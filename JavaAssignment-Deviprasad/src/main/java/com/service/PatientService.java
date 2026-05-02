package com.service;

import com.entity.Patient;
import com.util.DataStore;

import java.util.*;
import java.util.stream.Collectors;

public class PatientService {

    private DataStore<Patient> store = new DataStore<>();

    // CREATE
    public void add(Patient p) {
        store.add(p.getId(), p);
    }

    // READ
    public Patient get(int id) {
        return store.get(id);
    }

    public List<Patient> getAll() {
        return store.getAll();
    }

    // UPDATE
    public void update(int id, String name, int age) {
        Patient p = store.get(id);
        if (p != null) {
            p.setName(name);
            p.setAge(age);
        }
    }

    // DELETE
    public void delete(int id) {
        store.remove(id);
    }

    // SEARCH
    public List<Patient> searchByName(String name) {
        return store.getAll().stream()
                .filter(p -> p.getName().toLowerCase().contains(name.toLowerCase()))
                .collect(Collectors.toList());
    }
}