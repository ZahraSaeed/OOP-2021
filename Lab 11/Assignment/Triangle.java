package com.company;

public class Triangle implements Shape1 {
    private double base;
    private double height;

    Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public double area() {
        return (0.5 * base * height);
    }
}
