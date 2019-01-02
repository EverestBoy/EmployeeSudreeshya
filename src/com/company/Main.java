package com.company;

import com.company.Database.EmployeeDAO;
import com.company.MainMethods.AddEmployee;
import com.company.MainMethods.EditEmployee;
import com.company.MainMethods.SearchEmployee;
import com.company.MainMethods.ViewEmployee;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Employee> employeeList = new ArrayList<>();
        int choice = 0;

        //Creating a loop until choice is not equal to 5
        do {

            System.out.println("\n\n**************Main menu**************");
            System.out.println("What do you want to perform: " +
                    "\n1.Add employee." +
                    "\n2.Edit employee." +
                    "\n3.Search employee." +
                    "\n4.View employee." +
                    "\n5.Remove employee" +
                    "\n6.Add to database"+
                    "\n7.Exit");
            choice = scanner.nextInt();


            switch (choice){

                //Add Employee
                case 1:
                    AddEmployee addEmployee = new AddEmployee();
                    addEmployee.addEmployee();

                    break;

                //Edit Employee
                case 2:
                    EditEmployee editEmployee = new EditEmployee();
                    employeeList =editEmployee.editEmployee(employeeList);
                    break;

                //SearchEmployee
                case 3:
                    SearchEmployee searchEmployee = new SearchEmployee();
                    searchEmployee.searchEmployee(employeeList);
                    break;

                //View Employee
                case 4:
                    ViewEmployee viewEmployee = new ViewEmployee();
                    viewEmployee.viewEmployee(employeeList);
                    break;

                //Remove Employee
                case 5:

                    Connection connection = null;
                    PreparedStatement statement = null;

                    try {
//                        Class.forName("com.mysql.cj.jdbc.Driver");
                        connection = DriverManager.getConnection("jdbc:mysql://localhost:3307/Employee","root","");
                        String sql = "Select * from Hospital";
                        statement = connection.prepareStatement(sql);
                        ResultSet rs = statement.executeQuery();
                        while (rs.next()){
                            System.out.println(rs.getString("hospitalName"));
                        }
                        rs.close();
                        statement.close();
                        connection.close();
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }


                    break;

                case 6:

//                    EmployeeDAO employeeDAO = new EmployeeDAO();
//                    employeeDAO.add(employeeList);

                    break;

                //Exit
                case 7:
                    System.out.println("Thank you");
                    break;

                    default:
                        System.out.println("Enter a valid choice");
                        break;

            }


        }while(choice != 5);




    }
}
