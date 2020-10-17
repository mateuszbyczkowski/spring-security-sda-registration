package com.kss.springmovies.repository;

import com.kss.springmovies.dto.Movie;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class MovieRepository {
    private Integer currentId = 1;
    private final Map<Integer, Movie> movies = new TreeMap<>();

    public int addMovie(Movie movie) throws MovieExistsException {
        if (movies.values().stream().anyMatch(m -> m.getTitle().equals(movie.getTitle()))) {
            throw new MovieExistsException();
        }
        movie.setId(currentId);
        movies.put(currentId, movie);
        return currentId++;
    }

    public Movie getMovie(Integer id) throws MovieNotFoundException {
        Movie movie = movies.get(id);
        if (movie == null) throw new MovieNotFoundException();
        return movie;
    }

    public void deleteMovie(Integer id) throws MovieNotFoundException {
        if (movies.remove(id) == null) throw new MovieNotFoundException();
    }

    public List<Movie> getAllMovies() {
        return List.copyOf(movies.values());
    }
}
