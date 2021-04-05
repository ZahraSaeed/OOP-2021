package com.company;

public class L6HA1Runner {
    public static void main(String [] args) {
        SavingsAccount saver1 = new SavingsAccount(2000.00);
        SavingsAccount saver2 = new SavingsAccount(3000.00);
        // setting the annual interest rate to 3% or 0.03
        saver1.Modify_Interest_Rate(0.03);
        saver2.Modify_Interest_Rate(0.03);
        // calculating monthly interest rates
        System.out.println("Total balance for saver1 = " + saver1.calculateMonthlyInterestRate());
        System.out.println("Total balance for saver2 = " + saver2.calculateMonthlyInterestRate());
        // setting the annual interest rate to 4% or 0.04
        saver1.Modify_Interest_Rate(0.04);
        saver2.Modify_Interest_Rate(0.04);
        System.out.println("Total balance for saver1 = " + saver1.calculateMonthlyInterestRate());
        System.out.println("Total balance for saver2 = " + saver2.calculateMonthlyInterestRate());
    }
}
