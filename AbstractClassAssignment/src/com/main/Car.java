package com.main;

import com.AbtractClass.Vehicle;

public class Car extends Vehicle{

	
	public Car(int noOfwheels, String colour, String brand) {
		super(noOfwheels, colour, brand);
	
	}
	
	

	public Car() {		
	}


	public void drive() {
		System.out.println("Inside Drive Method "+toString());
		

	}
	
	public void park() {
		System.out.println("Inside park Method "+toString());
	
	}



	


	
	
}
