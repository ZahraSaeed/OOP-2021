package com.company;

public class Action extends Movie{
    public Action(String movie_rating, double ID, String movie_title){
        super(movie_rating, ID, movie_title);
    }
    public double calcLateFees(int number_of_days){
        return (number_of_days * 3);
    }
}
