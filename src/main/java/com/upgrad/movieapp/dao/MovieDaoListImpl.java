package com.upgrad.movieapp.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.upgrad.movieapp.entities.Movie;
//import com.upgrad.movieapp.service.MovieService;

public class MovieDaoListImpl implements MovieDao{
	
	Map<Integer,Movie> movies = new HashMap<>();
	int counter =1;

	@Override
	public void saveMovie(Movie movie) {
		// TODO Auto-generated method stub
		movie.setId(counter);
		movies.put(counter,movie);
		counter++;
	}

	@Override
	public Movie getMovie(int movieId) {
		// TODO Auto-generated method stub
		return movies.get(movieId);
	}
	
	@Override
	public List<Movie> getAllMovies(){
		return new ArrayList<Movie>(movies.values());
	}

}
