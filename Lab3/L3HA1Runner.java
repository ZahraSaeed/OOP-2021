package com.company;

import java.util.concurrent.Callable;

public class L3HA1Runner {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        System.out.println(c1.getCircumference());
        Circle c2 = new Circle(10);
        System.out.println(c2.getCircumference());
    }
}
