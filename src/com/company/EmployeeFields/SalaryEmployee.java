package com.company.EmployeeFields;

import com.company.Employee;

public class SalaryEmployee extends Employee {

    private double salary;
    private EmployeeType employeeType;


    /*
    * Constructor for object of class SalaryEmployee
    * @param name               Name of the salary employee
    * @param address            Address of the salary employee
    * @param id                 ID of the salary employee
    * @param salary             Salary of the salary employee
    * @param employeeType       Employee type of the salary employeee
     */

    public SalaryEmployee(String name, String address, String id, double salary, EmployeeType employeeType) {
        super(name, address, id, employeeType);
        this.salary = salary;
    }

    public double getSalary() {
        return this.salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public double Salary() {
        return getSalary();
    }

    @Override
    public String toString() {
        return super.toString()+
                "\nTotal salary: "+Salary();
    }
}
