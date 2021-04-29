package com.company;

public class Drama extends Movie{
    public Drama(String movie_rating, double ID, String movie_title){
        super(movie_rating, ID, movie_title);
    }
    public double calcLateFees(int number_of_days){
        return super.calcLateFees(number_of_days);
    }
}
