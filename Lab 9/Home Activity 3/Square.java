package com.company;
import java.awt.Color;

public class Square extends Shapes{
    public Square(int NumOfLines, Color PenColour, Color FillColour){
        super(NumOfLines, PenColour, FillColour);
    }
    @Override
    public void Draw() {
        System.out.print("Drawing Square");
    }
}
