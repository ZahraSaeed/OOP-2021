package com.company;

public class Marks {
    private int marks1;
    private int marks2;
    private int marks3;
    public Marks(){
        marks1 = 85;
        marks2 = 75;
        marks3 = 90;
    }
    public Marks(int m1,int m2,int m3) {
        this.marks1 = m1;
        this.marks2 = m2;
        this.marks3 = m3;
    }
    public int getMarks1() {
        return marks1;
    }
    public void setMarks1(int m1) {
        this.marks1 = m1;
    }
    public int getMarks2() {
        return marks2;
    }
    public void setMarks2(int m2) {
        this.marks2 = m2;
    }
    public int getMarks3() {
        return marks3;
    }
    public void setMarks3(int m3) {
        this.marks3 = m3;
    }
    public int CalculateSum() {
        int sum = marks1 + marks2 + marks3;
        return sum;
    }
    public double CalculatePercentage(int sum) {
        double percentage = (sum/300.0)*100;
        System.out.println("Sum = "+sum+" percentage "+percentage);
        return  percentage;
    }

}
