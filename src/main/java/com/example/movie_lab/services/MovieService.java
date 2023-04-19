package com.example.movie_lab.services;

import com.example.movie_lab.models.Movie;
import com.example.movie_lab.repositories.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class MovieService {
    @Autowired
    MovieRepository movieRepository;

    private Movie movie;
    private ArrayList<Movie> movies;
    public MovieService(){
        this.movies = new ArrayList<>();
    }
    public void addMovie(Movie movie){
        this.movies.add(movie);
    }
    public ArrayList<Movie> getMovies() {
        return movies;
    }

    public Movie getMovie() {
        return movie;
    }

    public void createNewMovie(){
        Movie movie = new Movie();
        this.movies = new ArrayList<>();
        movieRepository.save(movie);
    }

    public List<Movie> getAllMovies(){
        return movieRepository.findAll();
    }
    public Optional<Movie> getMovieById(int id){
        return movieRepository.findById(id);
    }

}
