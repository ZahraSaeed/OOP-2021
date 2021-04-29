package com.company;
import java.awt.Color;

public class Triangle extends Shapes{
    public Triangle(int NumOfLines, Color PenColour, Color FillColour){
        super(NumOfLines, PenColour, FillColour);
    }
    @Override
    public void Draw() {
        System.out.println("Drawing Triangle");
    }
}
