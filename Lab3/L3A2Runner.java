package com.company;

public class L3A2Runner {
    public static void main(String[] args) {
        Rectangle1 rect1 = new Rectangle1();
        System.out.println(rect1.CalculateArea());
        Rectangle1 rect2 = new Rectangle1(10,20);
        System.out.println(rect2.CalculateArea());
    }
}
