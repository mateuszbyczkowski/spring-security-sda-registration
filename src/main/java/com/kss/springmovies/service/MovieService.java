package com.kss.springmovies.service;

import com.kss.springmovies.dto.Movie;
import com.kss.springmovies.repository.IMovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieService {

    private final IMovieRepository movieRepository;

    @Autowired
    public MovieService(IMovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    public List<Movie> findMovies(){
        return this.movieRepository.findAll();
    }

    public void deleteById(Integer id){
        this.movieRepository.deleteById(id);
    }

    public Movie addMovie(Movie movie){
        return this.movieRepository.save(movie);
    }
}
