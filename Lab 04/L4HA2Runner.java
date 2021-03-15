package com.company;

public class L4HA2Runner {
    public static void main(String[] args) {
        Account acc = new Account();
        acc.setBalance(50000);
        acc.withdrawCash(2000);
        acc.depoistCash(4000);

        double balance =acc.getBalance();
        acc.setAccountNumber(14589373);
        acc.getAccountNumber();
        acc.display();

        Account acc1 = new Account(14589479, 85000.00);
        acc1.withdrawCash(5000);
        acc1.depoistCash(1000);
        acc1.setBalance(balance);
        acc1.getBalance();
        acc1.display();
    }
}
