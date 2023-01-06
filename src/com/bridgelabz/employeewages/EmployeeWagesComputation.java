package com.bridgelabz.employeewages;

public class EmployeeWagesComputation {
    static final int WAGES_PER_HOUR = 20;
    static final int FULL_DAY_HOUR = 8;
    static final int PARTTIME_DAY_HOUR = 4;


    public static void main(String[] args) {
        int employeeCheck = (int) Math.floor(Math.random() * 10) % 2;
        System.out.println(employeeCheck);
        int dailyWage = 0;
        if (employeeCheck == 2) {
            dailyWage = FULL_DAY_HOUR * WAGES_PER_HOUR;
            System.out.println("Employee is Present");
            System.out.println("Employee is Full time");
        }
        else if (employeeCheck == 1) {
            dailyWage =PARTTIME_DAY_HOUR * WAGES_PER_HOUR;
            System.out.println("Employee is Present");
            System.out.println("Employee is part time");
        } else {
            System.out.println("Employee is Absent");

        }System.out.println("daily wage for Day="+ dailyWage);
    }
}

