package com.bridgelabz;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeePayRollService {

    private static List<EmployeePayRoll> employeePayRollList;
    private static Scanner input = new Scanner(System.in);

    public EmployeePayRollService(List<EmployeePayRoll> employeePayRollList){
        EmployeePayRollService.employeePayRollList = employeePayRollList;
    }

    public static void main(String[] args) {

        System.out.println("Welcome to Employee Payroll Service.");
        System.out.println("__________________________________________________");
        ArrayList<EmployeePayRoll> employeePayRollList = new ArrayList<EmployeePayRoll>();
        EmployeePayRollService employeePayRollService = new EmployeePayRollService(employeePayRollList);

        employeePayRollService.readEmployeeDetails();
        employeePayRollService.writeEmployeeDetails();
    }

    private void readEmployeeDetails(){
        System.out.println("Enter below details: ");
        System.out.println("Enter Employee ID: ");
        int id = input.nextInt();
        System.out.println("Enter Employee Name: ");
        String name = input.next();
        System.out.println("Enter Employee Salary: ");
        double salary = input.nextDouble();
        EmployeePayRoll employeeDetails = new EmployeePayRoll(id,name,salary);
        employeePayRollList.add(employeeDetails);
        System.out.println("__________________________________________________");
    }

    private void writeEmployeeDetails(){
        System.out.println("Employee Details: "+ employeePayRollList);
    }
}
