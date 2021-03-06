package com.AbtractClass;

public abstract class Vehicle {

	private int noOfwheels;
	private String colour;
	private String brand;
		
	public Vehicle(int noOfwheels, String colour, String brand) {
		super();
		this.noOfwheels = noOfwheels;
		this.colour = colour;
		this.brand = brand;
	}
	
	


	public Vehicle() {
		super();
		// TODO Auto-generated constructor stub
	}




	public abstract void drive() ;
	public abstract void park();




	public int getNoOfwheels() {
		return noOfwheels;
	}




	public void setNoOfwheels(int noOfwheels) {
		this.noOfwheels = noOfwheels;
	}




	public String getColour() {
		return colour;
	}




	public void setColour(String colour) {
		this.colour = colour;
	}




	public String getBrand() {
		return brand;
	}




	public void setBrand(String brand) {
		this.brand = brand;
	}




	@Override
	public String toString() {
		return "Vehicle [noOfwheels=" + noOfwheels + ", colour=" + colour + ", brand=" + brand + ", getNoOfwheels()="
				+ getNoOfwheels() + ", getColour()=" + getColour() + ", getBrand()=" + getBrand() + "]";
	}
	
	
	
}
