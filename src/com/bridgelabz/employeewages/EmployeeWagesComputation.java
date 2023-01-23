package com.bridgelabz.employeewages;

public class EmployeeWagesComputation {
    // Default Constructor
    public EmployeeWagesComputation()
    {
        System.out.println("Welcome to Employee Wage Computation Program..!");
    }

    public static void main(String[] args) {

        //Initializing the constructor by creating the object of the class.
        EmployeeWagesComputation employee = new EmployeeWagesComputation();

        //Calculating employee wage for different companies.
        System.out.println("Calculating the salary for different companies : ............");
        EmployeeWageBuilder company1 = new EmployeeWageBuilder("Tata",40,100,20);
        company1.calculateTotalWage();
        company1.print();
        System.out.println();
        EmployeeWageBuilder company2 = new EmployeeWageBuilder("Wipro",20,150,18);
        company2.calculateTotalWage();
        company2.print();
        EmployeeWageBuilder company3 = new EmployeeWageBuilder("TCS",60,180,22);
        company3.calculateTotalWage();
        company3.print();
        System.out.println();
        EmployeeWageBuilder company4 = new EmployeeWageBuilder("Apple",30,190,26);
        company4.calculateTotalWage();
        company4.print();

    }

}
