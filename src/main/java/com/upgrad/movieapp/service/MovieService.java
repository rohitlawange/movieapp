package com.upgrad.movieapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.upgrad.movieapp.dao.MovieDao;
import com.upgrad.movieapp.entities.Movie;

//todo : implement a interface 
@Service
public class MovieService {

	@Autowired
	private MovieDao movieDao;
	
	public void saveMovie(Movie movie) {
		movieDao.saveMovie(movie);
	}
	
	public Movie getMovie(int movieId) {
		return movieDao.getMovie(movieId);
	}

	public List<Movie> getAllMovies() {
		// TODO Auto-generated method stub
		return movieDao.getAllMovies();
	}
}
