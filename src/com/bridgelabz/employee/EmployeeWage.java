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


    public static void main(String[] args)
    {
	    EmployeeWage employeeWage = new EmployeeWage();
        employeeWage.isPresentOrAbsent();
        employeeWage.dailyWage();
        employeeWage.partTime();
    }
}
