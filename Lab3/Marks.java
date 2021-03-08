package com.company;

public class Marks {
    public int marks1;
    public int marks2;
    public int marks3;
    public Marks() {
        marks1 = 55; marks2 = 65; marks3 = 70;
    }
    public Marks(int m1, int m2, int m3) {
        marks1 = m1; marks2 = m2; marks3 = m3;
    }
    public int CalculateSum() {
        return(marks1+marks2+marks3);
    }
}
