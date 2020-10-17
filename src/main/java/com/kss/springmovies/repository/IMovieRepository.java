package com.kss.springmovies.repository;


import com.kss.springmovies.dto.Movie;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface IMovieRepository extends CrudRepository<Movie, Integer> {

    Optional<Movie> findByTitle(String title);

    List<Movie> findAll();
}
