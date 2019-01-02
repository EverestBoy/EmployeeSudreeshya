package com.company.MainMethods;

import com.company.Employee;
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.List;
import java.util.Scanner;

public class SearchEmployee {
    public void searchEmployee(List<Employee> employeeList) {

        Scanner sc = new Scanner(System.in);
        int choice;
        boolean employeeFound = false;

        //Search employee menu
        System.out.println("\n\n**********SEARCH EMPLOYEE**********\n\n");
        System.out.println("What do you want to search by: " +
                "\n1.Name" +
                "\n2.ID" +
                "\n3.Address");
        choice = sc.nextInt();


        String ch;
        switch (choice) {
            case 1:
                System.out.println("Enter name: ");
                ch = sc.next();

                for (Employee employee : employeeList) {
                    if (employee.getName().equals(ch)) {
                        employeeFound = true;
                        System.out.println("\nEmployee Found!!!\n");
                        System.out.println(employee.toString());
                    }
                }

                if(!employeeFound){
                    showNotFound();
                }

                break;

            case 2:
                System.out.println("Enter ID: ");
                ch = sc.next();
                for (Employee employee : employeeList) {
                    if (employee.getId().equals(ch)) {
                        employeeFound = true;

                        System.out.println("\nEmployee Found!!!\n");
                        System.out.println(employee.toString());
                    }
                }

                if(!employeeFound){
                    showNotFound();
                }

                break;

            case 3:
                System.out.println("Enter address: ");
                ch = sc.next();
                for (Employee employee : employeeList) {
                    if (employee.getAddress().equals(ch)) {
                        employeeFound = true;
                        System.out.println("\nEmployee Found!!!\n");
                        System.out.println(employee.toString());
                    }
                }

                if(!employeeFound){
                    showNotFound();
                }

            default:
                System.out.println("Enter a valid choice.");
        }


    }

    private void showNotFound() {
        System.out.println("No any employee with given credentials exist...");
    }
}
