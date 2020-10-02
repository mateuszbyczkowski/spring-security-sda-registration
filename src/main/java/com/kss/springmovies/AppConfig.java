package com.kss.springmovies;

import com.kss.springmovies.dto.Movie;
import com.kss.springmovies.repository.MovieExistsException;
import com.kss.springmovies.repository.MovieRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean
    public MovieRepository getMovieRepository() throws MovieExistsException {
        MovieRepository movieRepository = new MovieRepository();
        movieRepository.addMovie(new Movie("American Beauty"));

        return movieRepository;
    }
}
