package org.javacollections.Linkedhashset.implementations;

public class Movie {

	String title;
	int year;
	String genere;
	public Movie(String title, int year, String genere) {
		super();
		this.title = title;
		this.year = year;
		this.genere = genere;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public String getGenere() {
		return genere;
	}
	public void setGenere(String genere) {
		this.genere = genere;
	}
	@Override
	public String toString() {
		return "Movie [title=" + title + ", year=" + year + ", genere=" + genere + "]\n";
	}
	
}
