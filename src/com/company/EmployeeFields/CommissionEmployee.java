package com.company.EmployeeFields;

import com.company.Employee;

public class CommissionEmployee extends Employee {
    private double totalSales;
    private double commissionRate;

    /*
     * Constructor for object of class Commission Employee
     * @param name               Name of the commission employee
     * @param address            Address of the commission employee
     * @param id                 ID of the commission employee
     * @param totalSales         Total sales by the commission employee
     * @param commissionRate     Commission rate that the commission employee gets
     * @param employeeType       Employee type of the commission employeee
     */

    public CommissionEmployee(String name,
                              String address,
                              String id,
                              double totalSales,
                              double commissionRate,
                              EmployeeType employeeType) {
        super(name, address, id, employeeType);
        this.totalSales = totalSales;
        this.commissionRate = commissionRate;
    }

    public double getTotalSales() {
        return totalSales;
    }

    public void setTotalSales(int totalSales) {
        this.totalSales = totalSales;
    }

    public double getCommissionRate() {
        return commissionRate;
    }

    public void setCommissionRate(int commissionRate) {
        this.commissionRate = commissionRate;
    }

    @Override
    public double Salary() {
        return getTotalSales()*getCommissionRate();
    }

    @Override
    public String toString() {
        return super.toString()+
                "\nTotal sales: "+getTotalSales()+
                "\nCommission rate: "+getCommissionRate()+
                "\nCommission salary: "+getCommissionRate()*getTotalSales();
    }
}