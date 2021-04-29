package com.company;
import java.awt.Color;

public class Circle extends Shapes{
    public Circle(int NumOfLines, Color PenColour, Color FillColour){
        super(NumOfLines, PenColour, FillColour);
    }
    @Override
    public void Draw() {
        System.out.println("Drawing Circle");
    }
}
