package com.bridgelabz;

public class EmpWageBuilderArray {

    public static final int FULL_TIME = 2;
    public static final int PART_TIME = 1;

    private int numOfCompany = 0;
    private EmployeeWage[] EmployeeWageArray;

    public EmpWageBuilderArray() {
        EmployeeWageArray = new EmployeeWage[5];
    }

    private void addEmployeeWage(String company, int emp_PER_HOUR, int num_OF_WORKING_DAYS, int working_HRS_IN_MONTH) {
        EmployeeWageArray[numOfCompany] = new EmployeeWage(company, emp_PER_HOUR, num_OF_WORKING_DAYS, working_HRS_IN_MONTH);
        numOfCompany++;
    }

    private void computeEmpWage() {
        for (int i = 0; i < numOfCompany; i++) {
            EmployeeWageArray[i].SetTotalEmpWage(this.computeEmpWage(EmployeeWageArray[i]));
        }
    }

    private int computeEmpWage(EmployeeWage employeeWage) {
        int empHrs = 0;
        int totalEmpHrs = 0;
        int totalWorkingDays = 0;
        // Computation
        while (totalEmpHrs <= employeeWage.working_HRS_IN_MONTH && totalWorkingDays < employeeWage.num_OF_WORKING_DAYS) {
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
        return totalEmpHrs * employeeWage.emp_PER_HOUR;
    }


    public static void main(String[] args) {
        EmpWageBuilderArray empWageBuilderArray = new EmpWageBuilderArray();
        empWageBuilderArray.addEmployeeWage("Dmart", 20, 2, 10);
        empWageBuilderArray.addEmployeeWage("Reliance", 10, 4, 20);
        empWageBuilderArray.computeEmpWage();

    }


    public class EmployeeWage {

        private final String company;
        private final int emp_PER_HOUR;
        private final int num_OF_WORKING_DAYS;
        private final int working_HRS_IN_MONTH;
        private int totalEmpWage;

        public EmployeeWage(String company, int emp_PER_HOUR, int num_OF_WORKING_DAYS, int working_HRS_IN_MONTH) {
            this.company = company;
            this.emp_PER_HOUR = emp_PER_HOUR;
            this.num_OF_WORKING_DAYS = num_OF_WORKING_DAYS;
            this.working_HRS_IN_MONTH = working_HRS_IN_MONTH;
        }

        public void SetTotalEmpWage(int totalEmpWage) {
            this.totalEmpWage = totalEmpWage;
        }

        public String toString() {
            return "Total Emp Wage For Company: " + company + "is:" + totalEmpWage;
        }

    }

}