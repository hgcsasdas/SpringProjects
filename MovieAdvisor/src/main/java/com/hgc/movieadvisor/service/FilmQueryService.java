package com.hgc.movieadvisor.service;

import java.util.Collection;

import com.hgc.movieadvisor.model.Film;


public interface FilmQueryService {

	//parecido al patrón builder
	//para poder encaenar llamadas
	
	public Collection<Film> exec();
	
	public FilmQueryService anyGenre(String... genres);

	public FilmQueryService allGenres(String... genres);

	public FilmQueryService year(String year);

	public FilmQueryService betweenYears(String from, String to);

	public FilmQueryService titleContains(String title);
	
	
}
