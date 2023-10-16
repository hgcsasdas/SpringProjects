package com.hgc.movieadvisor.dao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Optional;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.hgc.movieadvisor.config.AppConfig;
import com.hgc.movieadvisor.model.Film;

@Repository
public class FilmDaoImplMemory implements FilmDao {

	public List<Film> films = new ArrayList<>();
	
	@Autowired
	private AppConfig appConfig;
	
	@PostConstruct
	public void init() {
		films = UtilFilmFileReader.readFile(appConfig.getFile(), appConfig.getSeparator(), appConfig.getListSeparator());
	}
	
	

	public Film findById(long id) {
		
		Optional<Film> result = films
									.stream()
									.filter(f -> f.getId() == id)
									.findFirst();
		return result.orElse(null);
		
		
	}

	public Collection<Film> findAll() {		
		return films;
	}

	public void insert(Film film) {
		films.add(film);
	}

	public void edit(Film film) {
		int index = getIndexOf(film.getId());
		if (index != -1)
			films.set(index, film);
	}

	public void delete(long id) {
		int index = getIndexOf(id);
		if (index != -1)
			films.remove(index);

	}
	
	private int getIndexOf(long id) {
		boolean encontrado = false;
		int index = 0;
		
		while (!encontrado && index < films.size()) {
			if (films.get(index).getId() == id)
				encontrado = true;
			else
				index++;
		}
		
		return (encontrado) ? index : -1;
	}

}
