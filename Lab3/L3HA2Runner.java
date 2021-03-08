package com.company;

public class L3HA2Runner {
    public static void main(String[] args) {
        Account acc1 = new Account();
        System.out.println("Net balance is Rs." + acc1.balance);
        System.out.println("Balance after withdrawal is Rs." + acc1.withdraw(1000));
        System.out.println("Balance after deposit is Rs." + acc1.deposit(2500));
        Account acc2 = new Account(9900);
        System.out.println("Net balance is Rs." + acc2.balance);
        System.out.println("Balance after withdrawal is Rs." + acc2.withdraw(1000));
        System.out.println("Balance after deposit is Rs." + acc2.deposit(2500));
    }
}
