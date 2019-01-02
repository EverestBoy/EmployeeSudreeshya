package com.company.Inputs;

import com.company.Employee;
import com.company.EmployeeFields.*;

import java.util.Scanner;

public class GetEmployeeInput {


    public static SalaryEmployee getSalaryEmployeeData() {

        String name, address, id;
        Double salary;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name, address, id, salary");
        name = sc.next();
        address = sc.next();
        id = sc.next();
        salary = sc.nextDouble();

        SalaryEmployee salaryEmployee = new SalaryEmployee(name, address, id, salary, EmployeeType.SALARY);
        return salaryEmployee;

    }

    public static HourlyEmployee getHourlyEmployeeData() {

        String name, address, id;
        Double hour, ratePerHour;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name, address, id, hour, rate per hour");
        name = sc.next();
        address = sc.next();
        id = sc.next();
        hour = sc.nextDouble();
        ratePerHour = sc.nextDouble();

        HourlyEmployee hourlyEmployee = new HourlyEmployee(
                name,
                address,
                id,
                hour,
                ratePerHour,
                EmployeeType.HOURLY);
        return hourlyEmployee;

    }

    public static CommissionEmployee getCommissionEmployeeData() {

        String name, address, id;
        Double totalSales, ratePerSale;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name, address, id, total sales, rate per sell");
        name = sc.next();
        address = sc.next();
        id = sc.next();
        totalSales = sc.nextDouble();
        ratePerSale = sc.nextDouble();


        CommissionEmployee commissionEmployee = new CommissionEmployee(
                name,
                address,
                id,
                totalSales,
                ratePerSale,
                EmployeeType.COMMISSION);
        return commissionEmployee;

    }

    public static BasePlusCommissionEmployee getBasePlusCommissionEmployeeData() {

        String name, address, id;
        Double totalSales, ratePerSale, basicSalary;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name, address, id, total sales, rate per sell, basic salary");
        name = sc.next();
        address = sc.next();
        id = sc.next();
        totalSales = sc.nextDouble();
        ratePerSale = sc.nextDouble();
        basicSalary = sc.nextDouble();

        BasePlusCommissionEmployee basePlusCommissionEmployee = new BasePlusCommissionEmployee(
                name,
                address,
                id,
                totalSales,
                ratePerSale,
                basicSalary,
                EmployeeType.BASEPLUSCOMMISSION
        );
        return basePlusCommissionEmployee;

    }


}
