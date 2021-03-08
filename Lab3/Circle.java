package com.company;

public class Circle {
    public int radius;
    public double pi = 3.14;
    public Circle() {
        radius = 5;
    }
    public Circle(int r) {
        radius = r;
    }
    public double getCircumference() {
        return (2*pi*radius);
    }

}
