package com.tocel.refactor;

public class Rental {
	private Movie _movie;
	
	private int _dayRented;

	public Rental(Movie _movie, int _dayRented) {
		this._movie = _movie;
		this._dayRented = _dayRented;
	}

	public Movie get_movie() {
		return _movie;
	}

	public int get_dayRented() {
		return _dayRented;
	}
	
	
}
