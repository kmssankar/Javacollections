package org.javacollections.Linkedhashset.implementations;

import java.util.Objects;

public class Movie {

	private String title;
	private int year;
	private String genere;
	private int id;
	public Movie(int id, String title, int year, String genere) {
		super();
		this.id = id;
		this.title = title;
		this.year = year;
		this.genere = genere;
	}
	public int getId(){
		return id;
	}
	public String getTitle() {
		return title;
	}
	public int getYear() {
		return year;
	}
	public String getGenere() {
		return genere;
	}
	@Override
	public String toString() {
		return "Movie [title=" + title + ", year=" + year + ", genere=" + genere + "]\n";
	}

	@Override
	public boolean equals(Object obj) {
		Movie incomingObj = (Movie) obj;
		return this.genere.equals(incomingObj.getGenere())&& this.id == incomingObj.getId();
	}
	@Override
	public int hashCode() {
		return Objects.hash(id, title, year);
	}
}
