package com.company;
import java.awt.Color;

abstract public class Shapes {
    protected int number_of_lines;
    protected Color pen_colour;
    protected Color fill_colour;
    public Shapes(int NumOfLines, Color PenColour, Color FillColour){
        this.number_of_lines = NumOfLines;
        this.pen_colour = PenColour;
        this.fill_colour = FillColour;
    }
    public abstract void Draw();
}
