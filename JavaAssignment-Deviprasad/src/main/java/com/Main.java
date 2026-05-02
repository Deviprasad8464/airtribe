package com;

import com.entity.*;
import com.enums.Specialization;
import com.service.*;
import com.util.IdGenerator;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        PatientService ps = new PatientService();
        DoctorService ds = new DoctorService();
        AppointmentService as = new AppointmentService();

        while (true) {

            System.out.println("\n===== MediTrack Menu =====");
            System.out.println("1. Add Patient");
            System.out.println("2. View Patients");
            System.out.println("3. Add Doctor");
            System.out.println("4. View Doctors");
            System.out.println("5. Create Appointment");
            System.out.println("6. View Appointments");
            System.out.println("7. Cancel Appointment");
            System.out.println("8. Exit");

            System.out.print("Enter choice: ");
            int ch = sc.nextInt();

            switch (ch) {

                //  ADD PATIENT
                case 1:
                    int pid = IdGenerator.getInstance().generateId();
                    System.out.print("Name: ");
                    String pname = sc.next();
                    System.out.print("Age: ");
                    int page = sc.nextInt();

                    ps.add(new Patient(pid, pname, page));
                    System.out.println(" Patient Added!");
                    break;

                // VIEW PATIENTS
                case 2:
                    ps.getAll().forEach(p ->
                            System.out.println(p.getId() + " | " + p.getName() + " | " + p.getAge())
                    );
                    break;

                // ADD DOCTOR
                case 3:
                    int did = IdGenerator.getInstance().generateId();
                    System.out.print("Doctor Name: ");
                    String dname = sc.next();
                    System.out.print("Age: ");
                    int dage = sc.nextInt();

                    System.out.println("Select Specialization:");
                    System.out.println("1. CARDIOLOGY");
                    System.out.println("2. DERMATOLOGY");
                    System.out.println("3. GENERAL");

                    int sp = sc.nextInt();
                    Specialization specialization;

                    if (sp == 1) specialization = Specialization.CARDIOLOGY;
                    else if (sp == 2) specialization = Specialization.DERMATOLOGY;
                    else specialization = Specialization.GENERAL;

                    System.out.print("Consultation Fee: ");
                    double fee = sc.nextDouble();

                    ds.addDoctor(new Doctor(did, dname, dage, specialization, fee));
                    System.out.println(" Doctor Added!");
                    break;

                // VIEW DOCTORS
                case 4:
                    ds.getAllDoctors().forEach(d ->
                            System.out.println(d.getId() + " | " + d.getName() + " | " +
                                    d.getSpecialization() + " | Fee: " + d.getFee())
                    );
                    break;

                // CREATE APPOINTMENT
                case 5:
                    System.out.print("Enter Patient ID: ");
                    int apid = sc.nextInt();

                    System.out.print("Enter Doctor ID: ");
                    int adid = sc.nextInt();

                    Patient patient = ps.get(apid);
                    Doctor doctor = ds.getDoctor(adid);

                    if (patient == null || doctor == null) {
                        System.out.println(" Invalid Patient or Doctor ID");
                    } else {
                        Appointment a = as.create(patient, doctor);
                        System.out.println(" Appointment Created! ID: " + a.getId());
                    }
                    break;

                // VIEW APPOINTMENTS
                case 6:
                    as.getAll().forEach(a ->
                            System.out.println(
                                    "ID: " + a.getId() +
                                            " | Patient: " + a.getPatient().getName() +
                                            " | Doctor: " + a.getDoctor().getName()
                            )
                    );
                    break;

                // CANCEL APPOINTMENT
                case 7:
                    System.out.print("Enter Appointment ID: ");
                    int cancelId = sc.nextInt();

                    as.cancel(cancelId);
                    System.out.println(" Appointment Cancelled!");
                    break;

                case 8:
                    System.out.println("Exiting...");
                    System.exit(0);

                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}