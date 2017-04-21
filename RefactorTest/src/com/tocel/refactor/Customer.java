package com.tocel.refactor;

import java.util.Enumeration;
import java.util.Vector;

public class Customer {
	private String _name;
	private Vector<Rental> _rentals = new Vector<Rental>();
	public Customer(String name){
		_name = name;
	}
	
	public void addRental(Rental rental){
		_rentals.add(rental);
	}
	public String getName(){
		return _name;
	}
	
	public String statement(){
		Enumeration<Rental> rentals = _rentals.elements();
		String result = "Rental Record for " + getName() + "\n";
		
		while(rentals.hasMoreElements()){
			Rental each = rentals.nextElement();
			//show figures for this rental
			result += "\t" + each.get_movie().get_title() + "\t" + String.valueOf(each.getCharge()) + "\n";
		}
		
		//add footer lines
		result += "Amount owed is " + String.valueOf(getTotalCharge()) + "\n";

		result += "You earned " + String.valueOf(getTotalFrequentRenterPoints()) + " requent renter points";	
		return result;
		
		
	}

	private double getTotalCharge(){
		double result = 0;
		Enumeration<Rental> rentals = _rentals.elements();
		while(rentals.hasMoreElements()){
			Rental each = rentals.nextElement();
			result += each.getCharge();
		}
		return result;
	}
	
	private int getTotalFrequentRenterPoints(){
		int result = 0;
		Enumeration<Rental> rentals = _rentals.elements();
		while(rentals.hasMoreElements()){
			Rental each = rentals.nextElement();
			result += each.getFrequentRenterPoints();
		}
		return result;
	}
	
}
