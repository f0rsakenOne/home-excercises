package io.codelex.classesandobjects.exercise;

import java.util.Arrays;

public class Movie {
    private String movieTitle;
    private String movieStudio;
    private String movieRating;

    public Movie(String movieTitle, String movieStudio, String movieRating) {
        this.movieTitle = movieTitle;
        this.movieStudio = movieStudio;
        this.movieRating = movieRating;
    }

    public Movie(String movieTitle, String movieStudio) {
        this.movieTitle = movieTitle;
        this.movieStudio = movieStudio;
        this.movieRating = "PG";
    }

    public static Movie[] getPG(Movie[] movieArr){
        Movie[] moviesArr = new Movie[movieArr.length];
        for (int i = 0; i < movieArr.length;i++){
            if(movieArr[i].movieRating.equals("PG")){
                moviesArr[i] = movieArr[i];
            }
        }
        return moviesArr;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "movieTitle='" + movieTitle + '\'' +
                ", movieStudio='" + movieStudio + '\'' +
                ", movieRating='" + movieRating + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Movie[] moviesArr = {
                new Movie("Casino Royale", "Eon Productions", "PG13"),
                new Movie("Glass", "Buena Vista International", "PG13"),
                new Movie("Spider-Man: Into the Spider-Verse", "Columbia Pictures", "PG")};
        System.out.println(Arrays.toString(Movie.getPG(moviesArr)));
    }
}
