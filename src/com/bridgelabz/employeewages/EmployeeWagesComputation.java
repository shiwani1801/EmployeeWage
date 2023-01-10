package com.bridgelabz.employeewages;

public class EmployeeWagesComputation {
    static final int WAGES_PER_HOUR = 20;
    static final int FULLTIME_DAY_HOUR = 8;
    static final int PARTTIME_DAY_HOUR = 4;
    static final int FULL_TIME = 2;
    static final int PART_TIME = 1;
    static final int WORKING_DAYS_PER_MONTH = 20;
    static final int WORKING_HOUR_MONTH = 100;
    static int MonthlyWage=0;

    public static void main(String[] args) {
        int dayCount = 1;
        int workingHour=0;
        while (dayCount <= WORKING_DAYS_PER_MONTH && workingHour <= WORKING_HOUR_MONTH) {
            int employeeCheck = (int) Math.floor(Math.random() * 10) % 3;//0,1,2
            System.out.println(employeeCheck);
            int dailywage = 0;
            switch (employeeCheck) {
                case FULL_TIME:

                    dailywage = FULLTIME_DAY_HOUR * WAGES_PER_HOUR;
                    workingHour+=FULLTIME_DAY_HOUR;
                    System.out.println("Employee is Present");
                    System.out.println("Employee is Full time");
                    break;
                case PART_TIME:
                    dailywage = PARTTIME_DAY_HOUR * WAGES_PER_HOUR;
                    workingHour+=PARTTIME_DAY_HOUR;

                    System.out.println("Employee is Present ");
                    System.out.println("Employee is Parttime");
                    break;

                default:

                    System.out.println("Employee is Absent");

            }
            System.out.println("daily wage for Day="+dayCount+ "="+ dailywage);
            MonthlyWage= dailywage * workingHour;
            dayCount++;


        }

        System.out.println("Working Hours = " +workingHour);
        System.out.println("monthly wage="+MonthlyWage);

    }
}





