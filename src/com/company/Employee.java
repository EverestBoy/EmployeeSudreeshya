package com.company;

import com.company.EmployeeFields.EmployeeType;

public abstract class Employee {
    private String name;
    private String address;
    private String id;
    private EmployeeType employeeType;

    /*
    * Constructor for class employee
    * @param name            Name of the employee
    * @param address         Address of the employee
    * @param department      Department of the employee

     */

    public Employee(String name, String address, String department, EmployeeType employeeType) {
        this.name = name;
        this.address = address;
        this.id = department;
        this.employeeType = employeeType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getId() {
        return id;
    }

    public void setId(String department) {
        this.id = department;
    }

    public EmployeeType getEmployeeType() {
        return employeeType;
    }

    public void setEmployeeType(EmployeeType employeeType) {
        this.employeeType = employeeType;
    }

    public abstract double Salary();

    public void getData(){


    }

    @Override
    public String toString() {
        return "Name: "+getName()+
                "\nAddress: "+getAddress()+
                "\nID: "+getId();
    }
}
