package com.company;

public class L9HAC2Runner {
    public static void main(String[] args) {
        Simple s = new Simple(4,9);
        System.out.println("Performing arithmetic operations on two numbers");
        System.out.println("The two numbers are: " + s.number_1 + " and " + s.number_2);
        System.out.println("The sum of two numbers is: " + s.add());
        System.out.println("The difference of two numbers is : " + s.sub());
        System.out.println("The product of two numbers is: " + s.mul());
        System.out.println("Dividing number1 by number2 = " + s.div());


        VerifiedSimple v = new VerifiedSimple(25,5);
        System.out.println("\nPerforming arithmetic operations on two numbers after verification");
        System.out.println("The two numbers are: " + v.number_1 + " and " + v.number_2);
        System.out.println("The sum of two numbers is: " + v.add());
        System.out.println("The difference of two numbers is : " + v.sub());
        System.out.println("The product of two numbers is: " + v.mul());
        System.out.println("Dividing number 1 by number 2 = " + v.div());
    }
}
