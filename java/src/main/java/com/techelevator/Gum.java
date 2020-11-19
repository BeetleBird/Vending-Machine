package com.techelevator;

import materials.Sellables;

public class Gum implements Sellables {
	private String name;
	private double price;
	private String slotLocation;
	private int quantity = 5;
	
	
	public Gum(String name, double price, String slotLocation, int quantity) {
		super();
		this.name = name;
		this.price = price;
		this.slotLocation = slotLocation;
		this.quantity = quantity;
	}


	@Override
	public String items() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public double price() {
		// TODO Auto-generated method stub
		return 0;
	}
	

}
