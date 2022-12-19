package com.example.demospringbootsept.model1;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Doctor1 {
    @Id
    @GeneratedValue
    int serial_no;
    String Patient_name;
    String Blood_Group;
    int age;

    public Doctor1() {
    }

    public Doctor1(int serial_no, String patient_name, String blood_Group, int age) {
        this.serial_no = serial_no;
        Patient_name = patient_name;
        Blood_Group = blood_Group;
        this.age = age;
    }

    public int getSerial_no() {
        return serial_no;
    }

    public void setSerial_no(int serial_no) {
        this.serial_no = serial_no;
    }

    public String getPatient_name() {
        return Patient_name;
    }

    public void setPatient_name(String patient_name) {
        Patient_name = patient_name;
    }

    public String getBlood_Group() {
        return Blood_Group;
    }

    public void setBlood_Group(String blood_Group) {
        Blood_Group = blood_Group;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
