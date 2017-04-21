package com.tocel.refactor;

public class MainTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Customer customer = new Customer("张三");
		Movie _movie = new Movie("驯龙高手", Movie.CHILDRENS);
		Rental rental = new Rental(_movie, 1);
		customer.addRental(rental);
		_movie = new Movie("卢旺达饭店", Movie.NEW_RELEASE);
		rental = new Rental(_movie, 2);
		customer.addRental(rental);
		_movie = new Movie("放牛班的春天", Movie.REGULAR);
		rental = new Rental(_movie, 5);
		customer.addRental(rental);
		_movie = new Movie("教父", Movie.NEW_RELEASE);
		rental = new Rental(_movie, 1);
		customer.addRental(rental);
		_movie = new Movie("逍遥法外", Movie.REGULAR);
		rental = new Rental(_movie, 3);
		customer.addRental(rental);
		
		System.out.println(customer.statement());
	}

}
