package com.example.movie_lab.repositories;

import com.example.movie_lab.models.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
public interface MovieRepository extends JpaRepository<Movie, Integer>{
}
