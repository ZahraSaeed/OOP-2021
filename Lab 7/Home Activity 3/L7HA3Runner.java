package com.company;

public class L7HA3Runner {
    public static void main(String[] args){
        Point p1 = new Point(15,30);
        Point p2 = new Point(20,40);
        Line l1 = new Line(p1,p2);
        System.out.println("The length of the line1 = " + l1.getLength());

        Point p3 = new Point();
        p3.setX_cord(10);
        p3.setY_cord(5);
        Line l2 = new Line(p2,p3);
        System.out.println("The length of the line2 = " + l2.getLength());
    }
}
