package com.example.movie_lab.controllers;

import com.example.movie_lab.models.Movie;
import com.example.movie_lab.repositories.MovieList;
import com.example.movie_lab.repositories.MovieRepository;
import com.example.movie_lab.services.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/movies")
public class MovieController {

    @Autowired
    MovieService movieService;
    @Autowired
    MovieList movieList;

    @Autowired
    MovieRepository movieRepository;

    @PostMapping(value = "/movies")
    public ResponseEntity newMovie(@RequestBody Movie movie) {
        movieService.createNewMovie();
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @GetMapping
    public  ResponseEntity<List<Movie>> getAllMovies(){
        List<Movie> movies = movieService.getAllMovies();
        return new ResponseEntity<>(movies, HttpStatus.OK);
    }



    @GetMapping(value = "/{id}")
    public ResponseEntity<Movie> getMovieById(@PathVariable int id){
        Optional<Movie> movie = movieService.getMovieById(id);
        if (movie.isPresent()) {
            return new ResponseEntity<>(movie.get(), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
        }
    }

    @PatchMapping(value = "/{id}")
    public ResponseEntity updateMovieDuration(@RequestBody Movie movie, @PathVariable int duration) {
        movieService.getMovie().setDuration(duration);
        return new ResponseEntity(HttpStatus.OK);
    }
}
