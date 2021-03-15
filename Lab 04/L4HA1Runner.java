package com.company;

public class L4HA1Runner {
    public static void main(String[] args) {
        Marks m=new Marks();
        m.setMarks1(50);
        m.setMarks2(80);
        m.setMarks3(70);
        System.out.println("Marks in first subject are: " + m.getMarks1());
        System.out.println("Marks in second subject are: " + m.getMarks2());
        System.out.println("Marks in third subject are: " + m.getMarks3());
        int sum = m.CalculateSum();
        System.out.println("The sum of these marks = " + sum);
        System.out.println("The percentage of these marks are = " + m.CalculatePercentage(sum));
    }
}
