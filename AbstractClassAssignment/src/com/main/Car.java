package com.main;

import com.AbtractClass.Vehicle;

public class Car extends Vehicle{
	
	int noOfwheels;
	String colour;
	String brand;
	
	public Car(int noOfwheels, String colour, String brand) {
		super(noOfwheels, colour, brand);
		this.noOfwheels = noOfwheels;
		this.colour = colour;
		this.brand = brand;
	}
	
	

	public Car() {
		super();
		
	}


	public void drive() {
		System.out.println("Inside Drive method in "+brand + " Class. And the Colour of the Car is "+ colour );
	}
	
	public void park() {
		System.out.println("Inside Park method of "+brand + " Car. This is a "+noOfwheels+" wheelers.");
	}

	@Override
	public int getNoOfwheels() {		
		return noOfwheels;
	}

	@Override
	public void setNoOfwheels(int noOfwheels) {
		this.noOfwheels =noOfwheels;
		
	}

	@Override
	public String getColour() {	
		return colour;
	}

	@Override
	public void setColour(String colour) {
		this.colour=colour;
		
	}

	@Override
	public String getBrand() {
		return brand;
	}

	@Override
	public void setBrand(String brand) {
	this.brand=brand;
		
	}
	
	
}
