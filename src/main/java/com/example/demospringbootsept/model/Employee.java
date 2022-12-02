package com.example.demospringbootsept.model;

public class Employee {
    int empid;
    String empName;
    String empDept;
    int deptId;

//    Parameterized Constructor

    public Employee(int empid, String empName, String empDept, int deptId) {
        this.empid = empid;
        this.empName = empName;
        this.empDept = empDept;
        this.deptId = deptId;
    }

    public int getEmpid() {
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
