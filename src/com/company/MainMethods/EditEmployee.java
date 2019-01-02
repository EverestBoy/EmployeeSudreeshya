package com.company.MainMethods;

import com.company.Employee;
import com.company.EmployeeFields.EmployeeType;
import com.company.Inputs.GetEmployeeInput;

import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class EditEmployee {

    int choice;

    public List<Employee> editEmployee(List<Employee> employeeList){
        int  choiceNext;
        boolean employeeFound;

        Scanner sc = new Scanner(System.in);
        do {
            employeeFound = false;


            //Edit employee menu
            System.out.println("\n\n**********EDIT EMPLOYEE**********\n\n" +
                    "Select employee type: ");
            System.out.println("1.Hourly employee: "
                    +"\n2.Salary employee"
                    +"\n3.Commission employee"
                    +"\n4.Base plus commission employee"
                    + "\n5.Go back");
            choice = sc.nextInt();
            String name, id;

            switch (choice){

                //Commission employee edit
                case 1:

                    System.out.println("\n\nSearch an employee you want to edit by: " +
                            "\n1.Name" +
                            "\n2.ID");
                    choiceNext = sc.nextInt();

                    switch (choiceNext){

                        //Hourly employee edit with NAME search
                        case 1:
                            System.out.println("Enter name: ");
                            name =sc.next();
                            for(Employee employee: employeeList){
                                if(employee.getEmployeeType().equals(EmployeeType.HOURLY)){
                                    if (employee.getName().equals(name)){
                                        employeeFound = true;
                                        System.out.println("Employeee found!!!\n");
                                        System.out.println(employee.toString()+"\n\n" +
                                                "Enter new details fo the employee");
                                        Collections.replaceAll(
                                                employeeList,
                                                employee,
                                                GetEmployeeInput.getHourlyEmployeeData()
                                        );
                                    }
                                }
                            }
                            if(!employeeFound){
                                showNotFound();
                            }
                            break;

                        //Hourly employee edit with ID search
                        case 2:
                            System.out.println("Enter ID: ");
                            id = sc.next();
                            for(Employee employee : employeeList){
                                if(employee.getEmployeeType().equals(EmployeeType.HOURLY)){
                                    if(employee.getId().equals(id)){
                                        employeeFound = true;
                                        System.out.println("Employeee found!!!\n");
                                        System.out.println(employee.toString()+"\n\n" +
                                                "Enter new details fo the employee");
                                        Collections.replaceAll(
                                                employeeList,
                                                employee,
                                                GetEmployeeInput.getHourlyEmployeeData()
                                        );
                                    }
                                }
                            }
                    }
                    break;

                //Salary employee edit
                case 2:

                    System.out.println("\n\nSearch an employee you want to edit by: " +
                            "\n1.Name" +
                            "\n2.ID");
                    choiceNext = sc.nextInt();

                    switch (choiceNext){

                        //Salary employee edit with NAME search
                        case 1:
                            System.out.println("Enter name: ");
                            name =sc.next();
                            for(Employee employee: employeeList){
                                if(employee.getEmployeeType().equals(EmployeeType.SALARY)){
                                    if (employee.getName().equals(name)){
                                        employeeFound = true;
                                        System.out.println("Employeee found!!!\n");
                                        System.out.println(employee.toString()+"\n\n" +
                                                "Enter new details fo the employee");
                                        Collections.replaceAll(
                                                employeeList,
                                                employee,
                                                GetEmployeeInput.getSalaryEmployeeData()
                                        );
                                    }
                                }
                            }
                            if(!employeeFound){
                                showNotFound();
                            }
                            break;

                        //Salary employee edit with ID search
                        case 2:
                            System.out.println("Enter ID: ");
                            id = sc.next();
                            for(Employee employee : employeeList){
                                if(employee.getEmployeeType().equals(EmployeeType.SALARY)){
                                    if(employee.getId().equals(id)){
                                        employeeFound = true;
                                        System.out.println("Employeee found!!!\n");
                                        System.out.println(employee.toString()+"\n\n" +
                                                "Enter new details fo the employee");
                                        Collections.replaceAll(
                                                employeeList,
                                                employee,
                                                GetEmployeeInput.getSalaryEmployeeData()
                                        );
                                    }
                                }
                            }
                    }
                    break;


                //Commission employee edit
                case 3:
                    System.out.println("\n\nSearch an employee you want to edit by: " +
                            "\n1.Name" +
                            "\n2.ID");
                    choiceNext = sc.nextInt();

                    switch (choiceNext){

                        //Commission employee edit with NAME search
                        case 1:
                            System.out.println("Enter name: ");
                            name =sc.next();
                            for(Employee employee: employeeList){
                                if(employee.getEmployeeType().equals(EmployeeType.COMMISSION)){
                                    if (employee.getName().equals(name)){
                                        employeeFound = true;
                                        System.out.println("Employeee found!!!\n");
                                        System.out.println(employee.toString()+"\n\n" +
                                                "Enter new details fo the employee");
                                        Collections.replaceAll(
                                                employeeList,
                                                employee,
                                                GetEmployeeInput.getCommissionEmployeeData()
                                        );
                                    }
                                }
                            }
                            if(!employeeFound){
                                showNotFound();
                            }
                            break;

                        //Commission employee edit with ID search
                        case 2:
                            System.out.println("Enter ID: ");
                            id = sc.next();
                            for(Employee employee : employeeList){
                                if(employee.getEmployeeType().equals(EmployeeType.COMMISSION)){
                                    if(employee.getId().equals(id)){
                                        employeeFound = true;
                                        System.out.println("Employeee found!!!\n");
                                        System.out.println(employee.toString()+"\n\n" +
                                                "Enter new details fo the employee");
                                        Collections.replaceAll(
                                                employeeList,
                                                employee,
                                                GetEmployeeInput.getCommissionEmployeeData()
                                        );
                                    }
                                }
                            }
                    }
                    break;

                //BasePlusCommission employee edit
                case 4:
                    System.out.println("\n\nSearch an employee you want to edit by: " +
                            "\n1.Name" +
                            "\n2.ID");
                    choiceNext = sc.nextInt();

                    switch (choiceNext){

                        //BasePlusCommission employee edit with NAME search
                        case 1:
                            System.out.println("Enter name: ");
                            name =sc.next();
                            for(Employee employee: employeeList){
                                if(employee.getEmployeeType().equals(EmployeeType.BASEPLUSCOMMISSION)){
                                    if (employee.getName().equals(name)){
                                        employeeFound = true;
                                        System.out.println("Employeee found!!!\n");
                                        System.out.println(employee.toString()+"\n\n" +
                                                "Enter new details fo the employee");
                                        Collections.replaceAll(
                                                employeeList,
                                                employee,
                                                GetEmployeeInput.getBasePlusCommissionEmployeeData()
                                        );
                                    }
                                }
                            }
                            if(!employeeFound){
                                showNotFound();
                            }
                            break;

                        //BasePlusCommission employee edit with ID search
                        case 2:
                            System.out.println("Enter ID: ");
                            id = sc.next();
                            for(Employee employee : employeeList){
                                if(employee.getEmployeeType().equals(EmployeeType.HOURLY)){
                                    if(employee.getId().equals(id)){
                                        employeeFound = true;
                                        System.out.println("Employeee found!!!\n");
                                        System.out.println(employee.toString()+"\n\n" +
                                                "Enter new details fo the employee");
                                        Collections.replaceAll(
                                                employeeList,
                                                employee,
                                                GetEmployeeInput.getBasePlusCommissionEmployeeData()
                                        );
                                    }
                                }
                            }
                    }
                    break;

                //Exit of the edit loop
                case 5:
                    System.out.println("EXIT from edit..");
                    break;

                    //On invalid input
                    default:
                        System.out.println("Enter a valid choice...");
            }
        }while (choice != 5);
        return employeeList;
    }



    private void showNotFound() {
        System.out.println("No any employee with given credentials exist...");
    }
}
