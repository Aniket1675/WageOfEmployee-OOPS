package com.bridgelabz.employee;

public class EmployeeWage 
{
    // UC1: Checking if the employee is present or absent
    public void isPresentOrAbsent() 
    {
        int IS_FULL_TIME = 1;
        double empcheck = Math.floor(Math.random() * 10) % 2;
        if (empcheck == IS_FULL_TIME) {
            System.out.println("Employee is Present");
        } else {
            System.out.println("Employee is Absent");
        }
    }
    //UC2: Calculating Daily Employee Wage
    public void dailyWage()
    {
        // Check the employee is present or absent
        int IS_FULL_TIME = 1;
        // Calculating daily employee wage
        final int empWagePerHrs = 20;
        int empHrs = 0;
        int empWage = 0;

        double empcheck = Math.floor(Math.random() * 10) % 2;
        if (empcheck == IS_FULL_TIME)
        {
            empHrs = 8;
            System.out.println("Employee is Present");
        }
        else
        {

            empHrs = 0;
            System.out.println("Employee is Absent");
        }
        empWage = empHrs * empWagePerHrs;
        System.out.println("The Daily Wage of the Employee is :" + " " + empWage);
        System.out.println(" ");
    }
    //UC3: Adding Part time Employee and Wage
    public void partTime()
    {
        int Is_Part_Time = 1;
        int IS_FULL_TIME = 2;
        // Calculating daily employee wage
        final int empWagePerHrs = 20;
        int empHrs = 0;
        int empWage = 0;
        double empcheck = Math.floor(Math.random() * 10) % 3;
        if (empcheck == Is_Part_Time)
        {
            empHrs = 8;
            System.out.println("The Employee Worked Part Time");
        }
        else if (empcheck == IS_FULL_TIME)
        {
            empHrs = 16;
            System.out.println("The Employee Worked Full Time");
        }
        else
            empHrs = 0;

        empWage = empHrs * empWagePerHrs;
        System.out.println("The Wage of the Employee is :" + " " + empWage);
        System.out.println(" ");
    }
    //UC4: Using the Switch Case Statement
    public void switchCase()
    {
        final int Is_Part_Time = 1;
        final int IS_FULL_TIME = 2;
        // Calculating daily employee wage
        final int empWagePerHrs = 20;
        int empHrs = 0;
        int empWage = 0;
        double empcheck = Math.floor(Math.random() * 10) % 3;
        if (empcheck == Is_Part_Time)
        {
            empHrs = 8;
        }
        else if (empcheck == IS_FULL_TIME)
        {
            empHrs = 16;
        }
        else
            empHrs = 0;
        empWage = empHrs * empWagePerHrs;
        System.out.println("EmpWage :" + " " + empWage);

        int empCheck = (int) Math.floor(Math.random() * 10) % 3;
        switch (empCheck)
        {
            case Is_Part_Time:
                empHrs = 4;
                break;
            case IS_FULL_TIME:
                empHrs = 8;
                break;
            default:
                empHrs = 0;
        }
        empWage = empHrs * empHrs;
        System.out.println("The Wage of the Employee is: " + " " + empWage);
        System.out.println(" ");
    }
    //UC5: Calculating Wages for Month
    public void wageForMonth()
    {
        int IS_FULL_TIME = 1;
        int IS_PART_TIME = 2;
        int EMP_RATE_PER_HOUR = 10;
        int WORKING_DAYS_IN_MONTH = 20;

        // Variables
        int empHrs = 0;
        int empWage = 0;

        // Computation
        double empCheck = Math.floor(Math.random() * 10) % 3;

        if (empCheck == IS_PART_TIME)
        {
            empHrs = 4;
            System.out.println("Employee is PartTime");
        }
        else if (empCheck == IS_FULL_TIME)
        {
            empHrs = 8;
            System.out.println("Employee is FullTime");
        }
        else
        {
            System.out.println("Employee is Absent");
        }

        // Formula
        empWage = empHrs * EMP_RATE_PER_HOUR * WORKING_DAYS_IN_MONTH;
        System.out.println("The total Monthly Salary of Employee is: " + empWage);
    }



    public static void main(String[] args)
    {
	    EmployeeWage employeeWage = new EmployeeWage();
        employeeWage.isPresentOrAbsent();
        employeeWage.dailyWage();
        employeeWage.partTime();
        employeeWage.wageForMonth();
    }
}
