package com.hgc.movieadvisor.model;

import java.util.List;
import java.util.Objects;

public class Film {

	private long id;
	private String title;
	private String year;
	private List<String> genres;
	
	
	
	
	public Film() {
		super();
	}
	
	
	public Film(long id, String title, String year, List<String> genres) {
		super();
		this.id = id;
		this.title = title;
		this.year = year;
		this.genres = genres;
	}


	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	public List<String> getGenres() {
		return genres;
	}
	public void setGenres(List<String> genres) {
		this.genres = genres;
	}


	@Override
	public int hashCode() {
		return Objects.hash(genres, id, title, year);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Film other = (Film) obj;
		return Objects.equals(genres, other.genres) && id == other.id && Objects.equals(title, other.title)
				&& Objects.equals(year, other.year);
	}


	@Override
	public String toString() {
		return "Film [id=" + id + ", title=" + title + ", year=" + year + ", genres=" + genres + "]";
	}
	
	
}
