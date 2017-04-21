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
		double totalAmount = 0;
		int frequentRenterPoints = 0;
		Enumeration<Rental> rentals = _rentals.elements();
		String result = "Rental Record for " + getName() + "\n";
		
		while(rentals.hasMoreElements()){
			Rental each = rentals.nextElement();
			
			frequentRenterPoints += each.getFrequentRenterPoints();
			
			
			//show figures for this rental
			result += "\t" + each.get_movie().get_title() + "\t" + String.valueOf(each.getCharge()) + "\n";
			totalAmount += each.getCharge();
			
		}
		
		//add footer lines
		result += "Amount owed is " + String.valueOf(totalAmount) + "\n";
		result += "You earned " + String.valueOf(frequentRenterPoints) + " requent renter points";
		
		return result;
		
	}

	
	
}
