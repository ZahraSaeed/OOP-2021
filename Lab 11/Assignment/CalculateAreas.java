package com.company;

public class CalculateAreas {
    public static double[] Area(Shape1[] shapes) {
        double[] a = new double[shapes.length];
        for (int i = 0; i < shapes.length; i++) {
            if (shapes[i] != null) {
                a[i] = shapes[i].area();
            }
        }
        return a;
    }
}
