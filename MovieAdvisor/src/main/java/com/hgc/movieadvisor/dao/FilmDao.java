package com.hgc.movieadvisor.dao;

import java.util.Collection;

import com.hgc.movieadvisor.model.Film;

public interface FilmDao {

	public Film findById(long id);
	public Collection<Film> findAll();
	public void insert (Film film);
	public void edit (Film film);
	public void delete(long id);
	
}
