package com.company;

public class L3AS2Runner {
    public static void main(String[] args) {
        Time t1 = new Time();
        t1.checkHour();
        t1.checkMinutes();
        t1.checkSeconds();
        t1.display();
        Time t2 =new Time(03, 20, 36);
        t2.checkHour();
        t2.checkMinutes();
        t2.checkSeconds();
        t2.display();
    }
}
