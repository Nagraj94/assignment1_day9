package com.bridgelabz;

import java.util.Random;

public class EmployeeWages {

    private static final int ABSENT_DAY_HOUR = 0;
    private static final int WAGE_PER_HOUR = 20;
    private static final int FULL_DAY_HOUR = 8;
    private static final int HALF_DAY_HOUR = 4;
    static final int IS_FULL_DAY = 1;
    static final int IS_ABSENT_TODAY = 0;
    static final int IS_HALF_DAY = 2;

    private static final int TOTAL_WORKING_DAYS = 20;

    public static int computeEmpWages() {

        Random random = new Random();
        int attendance;
        int total_working_days = 0;

        int total_emp_hours = 0;
        int total_emp_wage = 0;
        while (total_emp_hours <= 100 && total_working_days < 20) {
            attendance = random.nextInt(3);
            switch (attendance) {
                case IS_FULL_DAY:
                    total_emp_hours += FULL_DAY_HOUR;
                    total_working_days++;
                    break;
                case IS_HALF_DAY:
                    total_emp_hours += HALF_DAY_HOUR;
                    total_working_days++;
                    break;
                case IS_ABSENT_TODAY:
                    total_emp_hours += ABSENT_DAY_HOUR;
                    total_working_days++;
                    break;
                default:
                    total_emp_hours = ABSENT_DAY_HOUR;
            }
        }
        total_emp_wage += WAGE_PER_HOUR * total_emp_hours;
        System.out.println("Total working days " + total_working_days);
        System.out.println("Total working hours " + total_emp_hours);
        System.out.println("Total wage for a month:- " + total_emp_wage);

        return total_emp_wage;
    }

    public static void main(String[] args) {

        computeEmpWages();
    }

}
