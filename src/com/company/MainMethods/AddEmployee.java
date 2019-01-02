package com.company.MainMethods;

import com.company.Database.EmployeeDAO;
import com.company.Employee;
import com.company.Inputs.GetEmployeeInput;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AddEmployee {

    public void addEmployee() {

        Scanner scanner = new Scanner(System.in);
        int choice = 0;
        Employee employee;
        EmployeeDAO employeeDAO = new EmployeeDAO();


        //Add employee menu
        System.out.println("\n\n**********ADD EMPLOYEE**********\n\n");
        System.out.println("Select a employee type: " +
                "\n1.Hourly Employee" +
                "\n2.Salary Employee" +
                "\n3.Commission Employee" +
                "\n4.BasePlusCommission Employee");

        choice = scanner.nextInt();

        switch (choice) {

            //HourlyEmployee
            case 1:
                employee = GetEmployeeInput.getHourlyEmployeeData();
                employeeDAO.add(employee);
                break;
            //Salary employee
            case 2:
                employee = GetEmployeeInput.getSalaryEmployeeData();
                employeeDAO.add(employee);
                break;
            //Commission employee
            case 3:
                employee = GetEmployeeInput.getCommissionEmployeeData();
                employeeDAO.add(employee);
                break;
            //BasePlusCommission employee
            case 4:
                employee = GetEmployeeInput.getBasePlusCommissionEmployeeData();
                employeeDAO.add(employee);
                break;
        }

    }
}
