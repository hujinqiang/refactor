package com.tocel.refactor;

public class Movie {

	public static final int CHILDRENS = 2;
	public static final int REGULAR = 0;
	public static final int NEW_RELEASE = 1;
	
	private String _title;
	private int _priceCode;
	private Price _price;
	public Movie(String _title, int _priceCode) {
		this._title = _title;
		set_priceCode(_priceCode);
	}
	public String get_title() {
		return _title;
	}
	public int get_priceCode() {
		return _priceCode;
	}
	public void set_priceCode(int _priceCode) {
		switch (_priceCode) {
		case CHILDRENS:
			_price = new ChildrensPrice();
			break;
		case NEW_RELEASE:
			_price = new NewReleasePrice();
			break;
		case REGULAR:
			_price = new RegularPrice();
			break;
		default:
			throw new IllegalArgumentException("Incorrect Price Code");
		}
	}
	
	public double getCharge(int daysRented) {
		return _price.getCharge(daysRented);
	}
	public int getFrequentRenterPoints(int _dayRented) {
		return _price.getFrequentRenterPoints(_dayRented);
	}
	
}
