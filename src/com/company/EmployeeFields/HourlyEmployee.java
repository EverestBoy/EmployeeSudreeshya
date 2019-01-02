package com.company.EmployeeFields;

import com.company.Employee;

public class HourlyEmployee extends Employee {

    private double hour;
    private double ratePerHour;
    private EmployeeType employeeType;

    /*
     * Constructor for class HourlyEmployee
     * @param name               Name of the hourly employee
     * @param address            Address of the hourly employee
     * @param id                 ID of the hourly employee
     * @param hour               Number of working hours of the hourly employee
     * @param ratePerHour        Rate per hours of working of the hourly employee
     * @param employeeType       Employee type of the hourly employee
     */

    public HourlyEmployee(String name,
                          String address,
                          String id,
                          double hour,
                          double ratePerHour,
                          EmployeeType employeeType) {
        super(name, address, id, employeeType);
        this.hour = hour;
        this.ratePerHour = ratePerHour;
    }

    public double getHour() {
        return hour;
    }

    public void setHour(double hour) {
        this.hour = hour;
    }

    public double getRatePerHour() {
        return ratePerHour;
    }

    public void setRatePerHour(double ratePerHour) {
        this.ratePerHour = ratePerHour;
    }

    @Override
    public double Salary() {
        return getHour()*getRatePerHour();
    }



    @Override
    public String toString() {
        return super.toString()+
                "\nHour: "+getHour()+
                "\nRate per hour: "+getRatePerHour()+
                "\nHourly salary: "+Salary();
    }
}
