package com.bridgelabz;

public class EmployeeWage {
    public static final int FULL_TIME = 2;
    public static final int PART_TIME = 1;

    public static int computeEmpWage(String  company,int EMP_PER_HOUR, int NUM_OF_WORKING_DAYS,int WORKING_HRS_IN_MONTH  ) {
        int empHrs = 0;
        int totalEmpHrs = 0;
        int totalWorkingDays = 0;
        // Computation
        while (totalEmpHrs <= WORKING_HRS_IN_MONTH && totalWorkingDays < NUM_OF_WORKING_DAYS) {
            totalWorkingDays++;
            int empCheck = (int) Math.floor(Math.random() * 10) % 3;
            switch (empCheck) {
                case PART_TIME:
                    empHrs = 4;
                    break;
                case FULL_TIME:
                    empHrs = 8;
                    break;
                default:
                    empHrs = 0;
            }
            totalEmpHrs += empHrs;
            System.out.println("Day#: " + totalWorkingDays + " Emp Hr: " + empHrs);
        }
        int totalEmpWage = totalEmpHrs * EMP_PER_HOUR;
        System.out.println("Total Emp Wage For Company: " +company+" is:" + totalEmpWage);
        return totalEmpWage;
    }

    public static void main(String[] args){
        computeEmpWage("Dmart",20, 2, 10);
        computeEmpWage("Reliance", 10, 4, 20);
    }

}