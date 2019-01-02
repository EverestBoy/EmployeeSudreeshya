package com.company.EmployeeFields;

public class BasePlusCommissionEmployee extends CommissionEmployee {

    private double basicSalary;
    private EmployeeType employeeType;

    /*
     * Constructor for object of class BasePlusCommission Employee
     * @param name               Name of the base plus commission employee
     * @param address            Address of the base plus commission employee
     * @param id                 ID of the base plus commission employee
     * @param totalSales         Total sales by the base plus commission employee
     * @param commissionRate     Commission rate that the base plus commission employee gets
     * @param basicSalary        Basic salary for base plus commission employee
     * @param employeeType       Employee type of the base plus commission employeee
     */

    public BasePlusCommissionEmployee(String name,
                                      String address,
                                      String department,
                                      double totalSales,
                                      double commissionRate,
                                      double basicSalary,
                                      EmployeeType employeeType) {
        super(name, address, department, totalSales, commissionRate, employeeType);
        this.basicSalary = basicSalary;
    }

    public double getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(double basicSalary) {
        this.basicSalary = basicSalary;
    }

    @Override
    public double Salary() {
        return super.Salary() + getBasicSalary() ;
    }

    @Override
    public String toString() {
        return super.toString()+
                "\nBasic salary: "+getBasicSalary()+
                "\nTotal salary: "+Salary();
    }
}
