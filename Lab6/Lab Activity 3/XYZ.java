package com.company;

public class XYZ {
    public static int i ;
    public String s;
    public static void displayStatic() //Static method
    {
        System.out.println("i:"+i);
    }
    public void display() //non static method
    {
        System.out.println("i:"+i);
        System.out.println("s:"+s);
    }
}
