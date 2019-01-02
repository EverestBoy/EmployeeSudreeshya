package com.company.Database;

import com.company.Employee;
import com.company.EmployeeFields.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import static javafx.scene.input.KeyCode.BEGIN;
import static javax.swing.JFormattedTextField.COMMIT;

public class EmployeeDAO {

    Connection connection = null;
    PreparedStatement statement = null;
    ResultSet resultSet = null;

    public EmployeeDAO() {
    }

    private Connection getConnection() throws SQLException {
        Connection conn;
        conn = DatabaseConnection.getInstance().getConnection();
        return  conn;
    }


    //Adding new employee to the table
    public void add(Employee employee){
        String queryString;

            EmployeeType employeeType = employee.getEmployeeType();

            switch (employeeType){

                case SALARY:

                    try {


                        connection = getConnection();


                        queryString =   "BEGIN";
                        statement.executeQuery(queryString);
                        queryString = "INSERT INTO `MAIN_EMPLOYEE`(`EMPLOYEE_NAME`, `ADDRESS`,`EMP_ID`, `TYPE`) " +
                                "VALUES " +
                                "(?,?,?,?)";
                        statement = connection.prepareStatement(queryString);
                        statement.setString(1,employee.getName());
                        statement.setString(2,employee.getAddress());
                        statement.setInt(3,Integer.parseInt( employee.getId()));
                        statement.setInt(4,1);
                        statement.executeUpdate();

                        queryString = "INSERT INTO `EMPLOYEE_SALARY`(`ID`, `SALARY`, `EMP_ID`) VALUES (?,?,?)";
                        statement = connection.prepareStatement(queryString);
                        statement.setInt(1, Integer.parseInt( employee.getId()));
                        statement.setDouble(2, ((SalaryEmployee)employee).getSalary());
                        statement.setInt(3, Integer.parseInt(employee.getId()));
                        statement.executeUpdate();

                        statement.executeQuery("COMMIT");






//                        queryString = "INSERT INTO `MAIN_EMPLOYEE`(`EMPLOYEE_NAME`, `ADDRESS`,`EMP_ID`, `TYPE`) " +
//                                "VALUES " +
//                                "(?,?,?,?)";
//
//                        statement = connection.prepareStatement(queryString);
//                        statement.setString(1,employee.getName());
//                        statement.setString(2,employee.getAddress());
//                        statement.setInt(3,Integer.parseInt( employee.getId()));
//                        statement.setInt(4,1);
//                        statement.executeUpdate();
//
//                        queryString = "INSERT INTO `EMPLOYEE_SALARY`(`ID`, `SALARY`, `EMP_ID`) VALUES (?,?,?)";
//                        statement = connection.prepareStatement(queryString);
//                        statement.setInt(1, Integer.parseInt( employee.getId()));
//                        statement.setDouble(2, ((SalaryEmployee)employee).getSalary());
//                        statement.setInt(3, Integer.parseInt(employee.getId()));
//                        statement.executeUpdate();

                        connection.close();
                        System.out.println("Successfully inserted salary employee to database....\n\n");
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                    break;

                case HOURLY:
                    try {
                        queryString = "INSERT INTO `EMPLOYEE_HOURLY`(`ID`, `NAME`, `ADDRESS`, `HOUR`, `RATEPERHOUR`) " +
                                "VALUES " +
                                "(?,?,?,?,?)";
                        connection = getConnection();
                        statement = connection.prepareStatement(queryString);
                        statement.setInt(1,Integer.parseInt( employee.getId()));
                        statement.setString(2,employee.getName());
                        statement.setString(3,employee.getAddress());
                        statement.setDouble(4,((HourlyEmployee)employee).getHour());
                        statement.setDouble(5,((HourlyEmployee) employee).getRatePerHour());
                        statement.executeUpdate();
                        connection.close();
                        System.out.println("Successfully inserted hourly employee to database....\n\n");
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                    break;
                case COMMISSION:
                    try {
                        queryString = "INSERT INTO `EMPLOYEE_COMMISSION`(`ID`, `NAME`, `ADDRESS`, `TOTAL_SALES`, `COMMISSION_RATE`) " +
                                "VALUES " +
                                "(?,?,?,?,?)";
                        connection = getConnection();
                        statement = connection.prepareStatement(queryString);
                        statement.setInt(1,Integer.parseInt( employee.getId()));
                        statement.setString(2,employee.getName());
                        statement.setString(3,employee.getAddress());
                        statement.setDouble(4,((CommissionEmployee)employee).getTotalSales());
                        statement.setDouble(5,((CommissionEmployee) employee).getCommissionRate());
                        statement.executeUpdate();
                        connection.close();
                        System.out.println("Successfully inserted commission employee to database....\n\n");
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                    break;

                case BASEPLUSCOMMISSION:
                    try {
                        queryString = "INSERT INTO `EMPLOYEE_COMMISSION`(" +
                                "`ID`, " +
                                "`NAME`, " +
                                "`ADDRESS`, " +
                                "`TOTAL_SALES`, " +
                                "`COMMISSION_RATE`, " +
                                "`BASIC_SALARY`) " +
                                "VALUES " +
                                "(?,?,?,?,?,?)";
                        connection = getConnection();
                        statement = connection.prepareStatement(queryString);
                        statement.setInt(1,Integer.parseInt( employee.getId()));
                        statement.setString(2,employee.getName());
                        statement.setString(3,employee.getAddress());
                        statement.setDouble(4,((BasePlusCommissionEmployee)employee).getTotalSales());
                        statement.setDouble(5,((BasePlusCommissionEmployee) employee).getCommissionRate());
                        statement.setDouble(6,((BasePlusCommissionEmployee) employee).getBasicSalary());
                        statement.executeUpdate();
                        connection.close();
                        System.out.println("Successfully inserted base plus commission to database....\n\n");
                        connection.close();
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                    break;

            }




    }
}
