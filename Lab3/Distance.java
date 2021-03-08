package com.company;

import java.security.PublicKey;

public class Distance {
    public double feet;
    public double inch;
    public Distance() {
        feet = 15; inch = 180;
    }
    public Distance(double f,double i) {
        feet = f; inch = i;
    }
    public void display() {
        System.out.println("Distance in feet is " + feet + " and in inches is " + inch);
    }
}
