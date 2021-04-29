package com.company;
import java.awt.Color;
public class L9HAC3Runner {
    public static void main(String[] args) {
        Circle circle1 = new Circle(5,Color.black,Color.GRAY);
        circle1.Draw();

        Square square1 = new Square(6, Color.BLACK,Color.PINK);
        square1.Draw();

        Triangle triangle1 = new Triangle(4,Color.BLACK,Color.ORANGE);
        triangle1.Draw();
    }
}
