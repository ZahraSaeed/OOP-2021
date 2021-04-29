package com.company;

import java.util.Objects;

public class Movie {
    protected String movieRating;
    protected double ID_number;
    protected String movieTitle;
    public Movie(String movie_rating, double ID, String movie_title){
        this.movieRating = movie_rating;
        this.ID_number = ID;
        this.movieTitle = movie_title;
    }
    public void setMovieRating(String movieRating) {
        this.movieRating = movieRating;
    }
    public void setID_number(double ID_number) {
        this.ID_number = ID_number;
    }
    public void setMovieTitle(String movieTitle) {
        this.movieTitle = movieTitle;
    }
    public String getMovieRating() {
        return movieRating;
    }
    public double getID_number() {
        return ID_number;
    }
    public String getMovieTitle() {
        return movieTitle;
    }
    public double calcLateFees(int number_of_days){
        return (2 * number_of_days);
    }
    public boolean equals(Movie m){
        if (this.ID_number != m.ID_number){
        return false;
    }
    else {
            return true;
        }
    }
    @Override
    public String toString() {
        return "\nMPAA Rating: " + movieRating + "\nID Number: " + ID_number + "\nMovie Title: " + movieTitle;
    }
}
