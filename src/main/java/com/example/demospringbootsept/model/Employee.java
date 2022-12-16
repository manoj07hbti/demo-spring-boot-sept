package com.example.demospringbootsept.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name="EmployeeDetail_Java")
public class Employee {
    @Id
    @GeneratedValue
    long empid;
    String empName;
    String empDept;
    int deptId;

//    Parameterized Constructor

    public Employee() {
    }

    public Employee(long empid, String empName, String empDept, int deptId) {
        this.empid = empid;
        this.empName = empName;
        this.empDept = empDept;
        this.deptId = deptId;
    }

    public long getEmpid() {
        return empid;
    }

    public void setEmpid(int empid) {
        this.empid = empid;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getEmpDept() {
        return empDept;
    }

    public void setEmpDept(String empDept) {
        this.empDept = empDept;
    }

    public int getDeptId() {
        return deptId;
    }

    public void setDeptId(int deptId) {
        this.deptId = deptId;
    }
}
