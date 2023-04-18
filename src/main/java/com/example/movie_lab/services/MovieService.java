package com.example.movie_lab.services;

import com.example.movie_lab.models.Movie;
import com.example.movie_lab.repositories.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class MovieService {
    @Autowired
    MovieRepository movieRepository;
    public MovieService(){

    }

    public Movie createNewMovie(){
        Movie movie = new Movie();
        return new Movie();
    }

    public Optional<Movie> getMovieById(int id){
        return movieRepository.findById(id);
    }

}
