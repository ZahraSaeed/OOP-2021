package com.company;

public class Account {
    public double balance;
    public Account() {
        balance = 5500;
    }
    public Account(double b) {
        balance = b;
    }
    public double withdraw (double w) {
        balance = balance - w;
        return balance;
    }
    public double deposit (double d) {
        balance = balance + d;
        return balance;
    }
}
