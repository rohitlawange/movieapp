package com.upgrad.movieapp.dao;

import java.util.List;

import com.upgrad.movieapp.entities.Movie;

//make jpa repo
public interface MovieDao {

	public void saveMovie(Movie movie);
	public Movie getMovie(int movieId);
	public List<Movie> getAllMovies();
}
