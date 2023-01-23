package com.bridgelabz.employeewages;

import java.util.ArrayList;
import java.util.List;

public class EmployeeWageBuilder implements ComputeEmployeeWage {
     List<CompanyEmpWage> companyEmpWageList;

    //Define Default Constructor
    public EmployeeWageBuilder() {
        companyEmpWageList = new ArrayList<CompanyEmpWage>();
    }

    //Adding company to an array
    public void addCompanyEmployeeWage(String companyName, int empWagePerHour, int maxWorkingHours, int maxWorkingDays) {
        CompanyEmpWage companyEmpWage = new CompanyEmpWage(companyName, empWagePerHour, maxWorkingHours, maxWorkingDays);
        companyEmpWageList.add(companyEmpWage);
    }

    //Computing employee wage and printing it
    public void computeEmpWage() {
        for (CompanyEmpWage companyEmpWage : companyEmpWageList) {
            companyEmpWage.setMonthlySalary(this.calculateTotalWage(companyEmpWage));
            System.out.println(companyEmpWage);
        }
    }

    //Calculating total wage
    public int calculateTotalWage(CompanyEmpWage companyEmpWage) {
        //Declaring variables
        int randomCheck;
        int salary = 0;
        int monthlySalary = 0;
        int totalWorkingHours = 0;
        int totalWorkingDays = 0;
        System.out.println();
        System.out.println("For Company : " + companyEmpWage.companyName + "...................");
        while (totalWorkingHours < companyEmpWage.maxWorkingHours && totalWorkingDays < companyEmpWage.maxWorkingDays) {
            totalWorkingDays++;
            randomCheck = (int) Math.floor((Math.random() * 10) % 3);
            switch (randomCheck) {
                case 1:

                    System.out.println("Employee is working full-time");
                    salary = companyEmpWage.empWagePerHour * isFullTimeHour;
                    totalWorkingHours = totalWorkingHours + isFullTimeHour;
                    break;

                case 2:

                    System.out.println("Employee is working part-time");
                    salary = companyEmpWage.empWagePerHour * isPartTimeHour;
                    totalWorkingHours = totalWorkingHours + isPartTimeHour;
                    break;

                default:

                    System.out.println("Employee is absent");
                    salary = 0;
                    break;
            }

            System.out.print("Day: " + totalWorkingDays + "\t random : " + randomCheck + "\t");
            System.out.print("Working Hours: " + totalWorkingHours + "\t");
            System.out.print("Salary is: " + salary + "\t");
            System.out.println();
            monthlySalary = monthlySalary + salary;

        }
        return monthlySalary;

    }
}

