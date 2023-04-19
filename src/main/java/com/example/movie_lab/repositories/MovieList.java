package com.example.movie_lab.repositories;

import com.example.movie_lab.models.Movie;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
@Repository
public class MovieList {
    private List<Movie> movies;
    public MovieList(){
        this.movies = new ArrayList<>();
    }
    public void addMovie (Movie movie){
        this.movies.add(movie);
    }
    public Movie getMovieByID(int id){
        return this.movies.get(id-1);
    }
}
