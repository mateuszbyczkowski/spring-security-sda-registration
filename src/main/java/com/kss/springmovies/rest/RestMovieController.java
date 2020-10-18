package com.kss.springmovies.rest;

import com.kss.springmovies.dto.Movie;
import com.kss.springmovies.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/movies")
public class RestMovieController {

    private final MovieService movieService;

    @Autowired
    public RestMovieController(MovieService movieService) {
        this.movieService = movieService;
    }

    // /api/movies
    @GetMapping
    public List<Movie> findMovies(){
        return movieService.findMovies();
    }

    // /api/movies/{id}
    @DeleteMapping("/{id}")
    public void deleteMovie(@PathVariable Integer id){
        movieService.deleteById(id);
    }

    // /api/movies
    @PostMapping
    public Movie addMovie(@RequestBody Movie movie){
        return movieService.addMovie(movie);
    }
}
