package com.company;

public class SavingsAccount {
    public static double annualInterestRate;
    private double savingsBalance;
    public SavingsAccount(double b){
        this.savingsBalance = b;
    }
    public double calculateMonthlyInterestRate(){
        double monthly_interest_rate = (savingsBalance * annualInterestRate)/12;
        double net_balance = monthly_interest_rate + savingsBalance;
        System.out.print("Total balance = ");
        return net_balance;
    }
    public static double Modify_Interest_Rate(double x){
        annualInterestRate = x;
        return annualInterestRate;
    }
}
