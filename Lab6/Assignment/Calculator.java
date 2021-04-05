package com.company;

public class Calculator {
    public static double number_1;
    public static double number_2;
    public static double sum(double number_1, double number_2){
        return (number_1 + number_2);
    }
    public static double multiply(double number_1, double number_2){
        return (number_1 * number_2);
    }
    public static double divide(double number_1, double number_2){
        return (number_1 / number_2);
    }
    public static double modulus(double number_1, double number_2){
        return (number_1 % number_2);
    }
    public static double sin(double s){
        return (Math.sin(s));
    }
    public static double cos(double c){
        return (Math.cos(c));
    }
    public static double tan(double t){
        return (Math.tan(t));
    }
}
