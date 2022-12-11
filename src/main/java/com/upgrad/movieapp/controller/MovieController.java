package com.upgrad.movieapp.controller;

//import java.awt.PageAttributes.MediaType;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.upgrad.movieapp.dto.MovieDTO;
import com.upgrad.movieapp.entities.Movie;
import com.upgrad.movieapp.service.MovieService;

@RestController
@RequestMapping(value = "/movieapp/v1")
public class MovieController {

	// autowire the service class
	@Autowired
	private MovieService movieService;
	
	@Autowired
	private ModelMapper modelMapper;

	// get all the movies
	@GetMapping(value = "/movies")
	public ResponseEntity getAllMovies() {
		//convert to a DTO object
		List<Movie> movies = movieService.getAllMovies();
		return ResponseEntity.ok(movies);
	}

	// get specififc movie
	@GetMapping(value="/movies/{id}")
	public ResponseEntity<MovieDTO> getMovie(@PathVariable(name = "id") int id) {
		// for now the id is string, later change it to a approproiate type
		Movie movie = movieService.getMovie(id);
		MovieDTO movieDTO = modelMapper.map(movie, MovieDTO.class);
		return ResponseEntity.ok(movieDTO);

	}

	// add a movie
	//add cosumes and produces
	@PostMapping(value="/movies/add", consumes= MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<String> addMovie(@RequestBody MovieDTO movieDTO) {
		Movie movie = modelMapper.map(movieDTO, Movie.class);
		movieService.saveMovie(movie);
		return ResponseEntity.ok("movie added");
	}

	// delete a movie
	// tune it later
	//@DeleteMapping
	//public ResponseEntity<String> deleteMovie() {
		//return null;
	//}

	// update a movie
	// tune this later
	//@PutMapping
	//public ResponseEntity<String> updateMovie() {
		//return null;
	//}

}
