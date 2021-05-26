package com.company;

public class Circle implements Shape1 {
    private double radius;

    Circle(double radius){
        this.radius=radius;

    }
    @Override
    public double area() {
        return (Math.PI * radius*radius);
    }
}
