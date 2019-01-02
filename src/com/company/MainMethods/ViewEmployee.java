package com.company.MainMethods;

import com.company.Employee;
import com.company.EmployeeFields.EmployeeType;

import java.util.List;
import java.util.Scanner;

public class ViewEmployee {

    int choice = 0;

    public void viewEmployee(List<Employee> employeeList) {

        Scanner scanner = new Scanner(System.in);

        //View employee menu
        System.out.println("\n\n**********View menu**********\n\n" +
                "Select employee type: ");
        System.out.println("1.Hourly employee: "
                +"\n2.Salary employee"
                +"\n3.Commission employee"
                +"\n4.Base plus commission employee");
        choice = scanner.nextInt();

        switch (choice){

            //Hourly Employee view
            case 1:
                for(Employee employee: employeeList){
                    if (employee.getEmployeeType().equals(EmployeeType.HOURLY)){
                        System.out.println("\nEmployee Detail: \n" +
                                employee.toString());
                    }
                }
                break;

            //Salary employee view
            case 2:
                for(Employee employee: employeeList){
                    if (employee.getEmployeeType().equals(EmployeeType.SALARY)){
                        System.out.println("\nEmployee Detail: \n" +
                                employee.toString());
                    }
                }
                break;

            //Commission employee view
            case 3:
                for(Employee employee: employeeList){
                    if (employee.getEmployeeType().equals(EmployeeType.COMMISSION)){
                        System.out.println("\nEmployee Detail: \n" +
                                employee.toString());
                    }
                }
                break;

            //Base plus commission employee view
            case 4:
                for(Employee employee: employeeList){
                    if (employee.getEmployeeType().equals(EmployeeType.BASEPLUSCOMMISSION)){
                        System.out.println("\nEmployee Detail: \n" +
                                employee.toString());
                    }
                }
                break;

                default:
                    System.out.println("No a valid input...");

        }

    }
}
