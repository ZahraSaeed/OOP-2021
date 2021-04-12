package com.company;

public class Line {
    private Point start_point;
    private Point end_point;
    public Line(Point s, Point e){
        this.start_point = s;
        this.end_point = e;
    }
    public double getLength(){
        return (Math.sqrt(Math.pow((end_point.getX_cord() - start_point.getX_cord()),2)
                + (Math.pow((end_point.getY_cord() - start_point.getY_cord()),2))));
    }
}
