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
	
	public double getCharge() {
		double result = 0;
		//determine amounts for each line
		switch (get_movie().get_priceCode()) {
		case Movie.REGULAR:
			result += 2;
			if(get_dayRented() > 2)
				result += (get_dayRented() -2) * 1.5;
			break;
		case Movie.NEW_RELEASE:
			result += get_dayRented() * 3;
			break;
		case Movie.CHILDRENS:
			result += 1.5;
			if(get_dayRented() > 3)
				result += (get_dayRented() - 3) * 1.5;
			break;
		default:
			break;
		}
		return result;
	}
	
	public int getFrequentRenterPoints() {
		int frequentRenterPoints = 0;
		//add frequent renter points
		frequentRenterPoints ++;
		//add bonus for a two day new release rental
		if((get_movie().get_priceCode() == Movie.NEW_RELEASE) && get_dayRented() > 1)
			frequentRenterPoints ++;
		return frequentRenterPoints;
	}

	
	
}
