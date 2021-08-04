package com.bridgelabz;

public class EmployeeWage
{
    public static void main(String[] args)
    {
        System.out.println("Welcome to Employee Wage Computation Program");
        //constant
        int IS_PRESENT = 1;

        int empCheck = (int) Math.floor(Math.random() * 10) % 2;
        if (empCheck == IS_PRESENT)
            System.out.println(" Employee is Present"); //Employee is present
        else
            System.out.println(" Employee is Absent"); //Employee is absent
    }
}
