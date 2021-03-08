package com.company;

public class Rectangle1 {
    public int length, width;
    public Rectangle1() {
        length = 5;
        width = 2;
    }
    public Rectangle1(int l, int w) {
        length = l;
        width = w;
    }
    public int CalculateArea() {
        return (length * width);
    }
}