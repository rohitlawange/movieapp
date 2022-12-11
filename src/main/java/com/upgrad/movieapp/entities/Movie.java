package com.upgrad.movieapp.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

//to do : annottate this calss with @Entity and make it compataible with datacess
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Movie {

	int id;
	String movieName;
}
