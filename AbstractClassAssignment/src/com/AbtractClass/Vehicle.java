package com.AbtractClass;

public abstract class Vehicle {

	int noOfwheels;
	String colour;
	String brand;
	
	
	
	
	public Vehicle(int noOfwheels, String colour, String brand) {
		super();
		this.noOfwheels = noOfwheels;
		this.colour = colour;
		this.brand = brand;
	}
	
	
	public Vehicle() {
	
	}


	public abstract void drive() ;
	public abstract void park();
	public abstract int getNoOfwheels();
	public abstract void setNoOfwheels(int noOfwheels);
	public abstract String getColour();
	
	public abstract void setColour(String colour) ;
	public abstract String getBrand() ;
	public abstract void setBrand(String brand) ;
	
}