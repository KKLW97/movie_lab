package com.example.movie_lab.repositories;

import com.example.movie_lab.models.Movie;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
@Repository
public class MovieList {
    private ArrayList<Movie> movies;
    public MovieList(){
        this.movies = new ArrayList<>();
    }

    public ArrayList<Movie> getMovies() {
        return movies;
    }

    public void setMovies(ArrayList<Movie> movies) {
        this.movies = movies;
    }
}
