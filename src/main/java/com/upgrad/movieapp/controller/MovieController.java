package com.upgrad.movieapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.upgrad.movieapp.entities.Movie;
import com.upgrad.movieapp.service.MovieService;

@RestController
@RequestMapping(value = "/movieapp/v1")
public class MovieController {

	// autowire the service class
	@Autowired
	private MovieService movieService;

	// get all the movies
	@GetMapping
	public ResponseEntity<List<String>> getAllMovies() {
		return null;
	}

	// get specififc movie
	@GetMapping("/movie/{id}")
	public ResponseEntity<Movie> getMovie(@PathVariable(name = "id") int id) {
		// for now the id is string, later change it to a approproiate type
		return ResponseEntity.ok(movieService.getMovie(id));

	}

	// add a movie
	@PostMapping("/addmovie")
	public ResponseEntity<String> addMovie(@RequestBody Movie movie) {
		movieService.saveMovie(movie);
		return ResponseEntity.ok("movie added");
	}

	// delete a movie
	// tune it later
	@DeleteMapping
	public ResponseEntity<String> deleteMovie() {
		return null;
	}

	// update a movie
	// tune this later
	@PutMapping
	public ResponseEntity<String> updateMovie() {
		return null;
	}

}
