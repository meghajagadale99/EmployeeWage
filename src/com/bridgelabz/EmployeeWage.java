package com.bridgelabz;

public class EmployeeWage {
    public static final int FULL_TIME = 2;
    public static final int PART_TIME = 1;

    private final String  company;
    private final int emp_PER_HOUR;
    private final int num_OF_WORKING_DAYS;
    private final int working_HRS_IN_MONTH;
    private int totalEmpWage;

    public  EmployeeWage(String  company,int emp_PER_HOUR, int num_OF_WORKING_DAYS,int working_HRS_IN_MONTH  ) {
        this.company = company;
        this.emp_PER_HOUR = emp_PER_HOUR;
        this.num_OF_WORKING_DAYS = num_OF_WORKING_DAYS;
        this.working_HRS_IN_MONTH = working_HRS_IN_MONTH;
    }
    public void  computeEmpWage() {
        int empHrs = 0;
        int totalEmpHrs = 0;
        int totalWorkingDays = 0;
        // Computation
        while (totalEmpHrs <= working_HRS_IN_MONTH && totalWorkingDays < num_OF_WORKING_DAYS) {
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
        totalEmpWage = totalEmpHrs * emp_PER_HOUR;
    }
     public String toString () {
        return "Total Emp Wage For Company: " +company+ "is:" + totalEmpWage;
     }


    public static void main(String[] args){
        EmployeeWage dMart =new EmployeeWage("DMart", 20, 2, 10);
        EmployeeWage reliance =new EmployeeWage("Reliance", 10, 4, 20);
        dMart.computeEmpWage();
        System.out.println(dMart);
        reliance.computeEmpWage();
        System.out.println(reliance);

    }

}