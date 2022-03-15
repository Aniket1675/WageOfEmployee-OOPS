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

    public static void main(String[] args)
    {
	    EmployeeWage employeeWage = new EmployeeWage();
        employeeWage.isPresentOrAbsent();
    }
}
