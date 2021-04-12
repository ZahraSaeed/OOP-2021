package com.company;

public class L7AC2Runner {
    public static void main(String[] args) {
        Date b = new Date (1,12,1990);
        Date h = new Date (5,6,2016);
        Employee e1=new Employee("xxx", "yyyy",b,h);
        e1.display();
    }
}