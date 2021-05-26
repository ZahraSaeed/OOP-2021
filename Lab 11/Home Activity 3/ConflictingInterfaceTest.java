package com.company;

public class ConflictingInterfaceTest implements I_1,I_2{
    public void show() {
        System.out.println("Interest rate for this year is: " + I_1.interestRate + "%");
        System.out.println("Interest rate for next year will be: " + I_2.interestRate + "%");
    }
}