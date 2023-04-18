package com.example.movie_lab.controllers;

import com.example.movie_lab.models.Movie;
import com.example.movie_lab.services.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping(value = "/movies")
public class MovieController {

    @Autowired
    MovieService movieService;

    @PostMapping(value = "/movies")
    public ResponseEntity<Movie> createNewMovie() {
        Movie movie = movieService.createNewMovie();
        return new ResponseEntity<Movie>(movie, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<Movie>


    @GetMapping(value = "/{id}")
    public ResponseEntity<Movie> getMovieById(@PathVariable int id){
        Optional<Movie> movie = movieService.getMovieById(id);
        if (movie.isPresent()) {
            return new ResponseEntity<>(movie.get(), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
        }
    }

}
