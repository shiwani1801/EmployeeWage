package com.bridgelabz.employeewages;

public class EmployeeWagesComputation {
    // Default Constructor
    public EmployeeWagesComputation()
    {
        System.out.println("Welcome to Employee Wage Computation Program..!");
    }

    public static void main(String[] args) {

        //Initializing the constructor by creating the object of the class
        EmployeeWagesComputation employee = new EmployeeWagesComputation();

        //Calculating employee wage for different companies.
        System.out.println("Calculating the salary for different companies : ............");
        EmployeeWageBuilder employeeWageBuilder = new EmployeeWageBuilder();
        employeeWageBuilder.addCompanyEmployeeWage("Tata",40,100,20);
        employeeWageBuilder.addCompanyEmployeeWage("Wipro",20,150,18);
        employeeWageBuilder.addCompanyEmployeeWage("TCS",60,180,22);
        employeeWageBuilder.addCompanyEmployeeWage("Apple",30,190,26);
        employeeWageBuilder.computeEmpWage();

    }

}
