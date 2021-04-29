package com.company;

public class Clock {
    protected String hr;
    protected String min;
    protected String sec;
    public Clock(String hour, String minutes, String seconds){
        this.hr = hour;
        this.min = minutes;
        this.sec = seconds;
    }
    public void setHr(String hr) {
        this.hr = hr;
    }
    public String getHr(String hr) {
        return hr;
    }
    public void setMin(String min) {
        this.min = min;
    }
    public String getMin(String min) {
        return min;
    }
    public void setSec(String sec) {
        this.sec = sec;
    }
    public String getSec(String sec) {
        return sec;
    }
    public void Display(){
        System.out.println("hr:min:sec  \n" + hr + ":"+ min + ":" + sec);
    }
}
