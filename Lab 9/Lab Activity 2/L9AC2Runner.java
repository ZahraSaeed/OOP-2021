package com.company;

public class L9AC2Runner {
    public static void main(String[] args) {
        BasePlusCommEmployee b = new BasePlusCommEmployee("Ali","Ahmed","25-kkn", 100, 5.2, 25000);
        double earn = b.earnings();
        System.out.println("Earning of employee is " + earn);
    }
}
