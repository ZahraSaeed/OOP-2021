package com.company;

public class Point {
    private double x_cord;
    private double y_cord;

    public Point(){
    }
    public Point(double x,double y){
        this.x_cord = x;
        this.y_cord = y;
    }
    public void setX_cord(double x_cord) {
        this.x_cord = x_cord;
    }
    public void setY_cord(double y_cord) {
        this.y_cord = y_cord;
    }
    public double getX_cord() {
        return x_cord;
    }
    public double getY_cord() {
        return y_cord;
    }
    public void display(){
        System.out.println("x-coordinate = " + x_cord + "\ny-coordinate = " + y_cord);
    }
}
