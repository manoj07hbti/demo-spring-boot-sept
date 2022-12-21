package com.example.demospringbootsept.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

public class Doctor_Info {


    @Entity
    public class Doctor {
        @Id
        @GeneratedValue
        @Column(name= "Doctor_Name")
        String name;
        @Column(name= "Doctor_ID")
        long id;
        int age;
        String branch;

        public Doctor() {
        }

        public Doctor(String name, long id, int age, String branch) {
            this.name = name;
            this.id = id;
            this.age = age;
            this.branch = branch;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public long getId() {
            return id;
        }

        public void setId(long id) {
            this.id = id;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public String getBranch() {
            return branch;
        }

        public void setBranch(String branch) {
            this.branch = branch;
        }
    }

}
