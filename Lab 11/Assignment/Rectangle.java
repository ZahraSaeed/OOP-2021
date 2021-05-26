package com.company;

public class Rectangle implements Shape1 {
    private double length;
    private double width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
    @Override
    public double area() {

        return (length * width);
    }
}
