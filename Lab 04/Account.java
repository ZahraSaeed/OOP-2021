package com.company;

public class Account {
    private double balance;
    private int AccountNumber;
    public Account(){
        balance=55000;
        AccountNumber=1195246;
    }
    public Account(int a, double b) {
        AccountNumber = a;
        balance = a;
    }
    public void withdrawCash(double w) {
        setBalance(getBalance() - w);
    }
    public void depoistCash(double d) {
        setBalance(getBalance() + d);
    }
    public void display() {
        System.out.println("Account number= " + getAccountNumber() + "  Balance=  "+ getBalance());
    }
    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
    public int getAccountNumber() {
        return AccountNumber;
    }
    public void setAccountNumber(int AccountNumber) {
        this.AccountNumber = AccountNumber;
    }
}
