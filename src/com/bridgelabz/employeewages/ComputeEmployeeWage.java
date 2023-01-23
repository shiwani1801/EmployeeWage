package com.bridgelabz.employeewages;

public interface ComputeEmployeeWage {
    //Some Variables
    int isPartTimeHour = 4;
    int isFullTimeHour = 8;

    //Some methods
    void addCompanyEmployeeWage(String companyName, int empWagePerHour, int maxWorkingHours, int maxWorkingDays);
    void computeEmpWage();


}
