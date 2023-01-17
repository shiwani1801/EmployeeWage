package com.bridgelabz.employeewages;

public class EmployeeWagesComputation {
    //static variables
    public static final int IS_FULL_TIME = 1;
    public static final int IS_PART_TIME = 2;

    //instance variables
    public final int empRatePerHr;
    public final int numberOfWorkingDays;
    public final int maxWorkingHrs;

    //constructor
    public EmployeeWagesComputation(int empRaterPerHr,int numOfWorkingDays,int maxWorkingHrs )
    {
        this.empRatePerHr = empRaterPerHr;
        this.numberOfWorkingDays = numOfWorkingDays;
        this.maxWorkingHrs = maxWorkingHrs;
    }
    static void getEmployeeWage() {
        //variables
        int salary=0;
        int empHrs=0;
        int totalWorkingDays=0;
        int totalEmpHrs=0;
        EmployeeWagesComputation employee = new EmployeeWagesComputation(20,20,100);
        while (totalWorkingDays<=employee.numberOfWorkingDays && totalEmpHrs<=employee.maxWorkingHrs)
        {
            totalWorkingDays++;
            double empCheck = Math.floor(Math.random() * 10) % 3;
            switch ((int)empCheck) {
                case IS_FULL_TIME:
                    System.out.println("Employee is full time present");
                    empHrs=8;
                    break;
                case IS_PART_TIME:
                    System.out.println("Employee is part time present");
                    empHrs=4;
                default:
                    System.out.println("Employee is absent");
            }
            totalEmpHrs += empHrs;
        }
        salary = (totalEmpHrs * employee.empRatePerHr);
        System.out.println("Employee Wage for a month is "+salary);
    }
    public static void main(String args[]) {
        System.out.println("Welcome to Employee Computation Program");
        EmployeeWagesComputation.getEmployeeWage();
    }
}
