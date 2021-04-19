package com.company;

public class Tape extends Publication{
    protected String playing_time;
    public Tape(){
    }
    public Tape(String Title,double Price,String PlayingTime){
        super(Title,Price);
        this.playing_time = PlayingTime;
    }
    public void setPlaying_time(String playing_time) {
        this.playing_time = playing_time;
    }
    public String getPlaying_time() {
        return playing_time;
    }
    public void display() {
        super.display();
        System.out.println("Playing time = " + playing_time);
    }
}
