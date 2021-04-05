package com.company;
import java.util.Scanner;

public class L6Ass1Runner {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Perform following operations: sum,multiply,divide,modulus,sin,cos,tan");
        System.out.println("Enter numbers:");
        System.out.print("Enter first number: ");
        double number_1 = input.nextInt();
        System.out.print("Enter second number: ");
        double number_2 = input.nextInt();
        System.out.println("Sum of two number = " + Calculator.sum(number_1, number_2));
        System.out.println("Product of two number = " + Calculator.multiply(number_1, number_2));
        System.out.println("Dividing two number =" + Calculator.divide(number_1,number_2));
        System.out.println("Modulus of two number = " + Calculator.modulus(number_1,number_2));
        System.out.println("sin of first number = " + Calculator.sin(number_1));
        System.out.println("sin of second number = " + Calculator.sin(number_2));
        System.out.println("cos of first number = " + Calculator.cos(number_1));
        System.out.println("cos of second number = " + Calculator.cos(number_2));
        System.out.println("tan of first number = " + Calculator.tan(number_1));
        System.out.println("tan of second number = " + Calculator.tan(number_2));
    }
}
