package com;


import com.entity.Patient;
import com.service.PatientService;
import com.util.IdGenerator;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        PatientService ps = new PatientService();

        while (true) {
            System.out.println("1. Add Patient");
            System.out.println("2. Exit");

            int ch = sc.nextInt();

            if (ch == 1) {
                int id = IdGenerator.getInstance().generateId();
                System.out.print("Name: ");
                String name = sc.next();
                System.out.print("Age: ");
                int age = sc.nextInt();

                ps.add(new Patient(id, name, age));
                System.out.println("Added!");
            } else {
                break;
            }
        }
    }
}