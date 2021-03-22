package com.company;

public class L5HA1Runner {
    public static void main(String[] args) {
        Distance d1= new Distance(100, 8.33);
        Distance d2 = new Distance(200,16.6);
        Distance d3 = new Distance();
        Distance d4 = d1.Add(d2,d3);
        d4.display();
    }
}
