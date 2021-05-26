package com.company;

public class Square implements EnhancedShape {
    private double length;

    public Square(double length){
        this.length=length;
    }
    @Override
    public double perimeter() {
        return 4*length;
    }

}
