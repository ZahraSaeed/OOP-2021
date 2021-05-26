package com.company;

public class L11AS_Runner {
    public static void main(String[] args) {
        Shape1[] shapes = new Shape1[3];
        shapes[0] = new Circle(10);
        shapes[1] = new Rectangle(20, 25);
        shapes[2] = new Triangle(5, 3);

        double area_1[] = CalculateAreas.Area(shapes);
        for (double area : area_1) {
            System.out.println(area);
        }
    }
}
