package com.company;

public class Time {
    public int hour;
    public int minutes;
    public int seconds;
    public Time() {
        hour = 07; minutes = 49; seconds = 55;
    }
    public Time(int h, int m, int s) {
        hour = h; minutes = m; seconds = s;
    }
    public void checkHour(){
        if (hour>24){
            System.out.println( " Invalid hour");
        }
    }
    public void checkMinutes(){
        if (minutes>60){
            System.out.println( " Invalid hour");
        }
    }
    public void checkSeconds(){
        if (seconds>60){
            System.out.println( " Invalid hour");
        }
    }

    public void display() {
        System.out.println(hour + ":" + minutes + ":" + seconds + ":");
    }
}
