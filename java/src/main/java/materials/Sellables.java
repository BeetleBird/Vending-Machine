package materials;

import java.io.File;
import java.util.Scanner;

public abstract class Sellables {
	
	private String name;
	private double price;
	private String slotLocation;
	private int quantity = 5;
	String snackType = "";
	public Sellables (String name, double price, String slotLocation, int quantity, String snackType) {
	 
		this.name = name;
		this.price = price;
		this.slotLocation = slotLocation;
		this.quantity = quantity;
		this.snackType = "";
	
	}
	
	
	public String getName() {
		return name;
	}

	public double getPrice() {
		return price;
	}

	public String getSlotLocation() {
		return slotLocation;
	}

	public int getQuantity() {
		return quantity;
	}

	public String getSnackType() {
		return snackType;

	}
}
	


//A1|Potato Crisps|3.05|Chip
//A2|Stackers|1.45|Chip
//A3|Grain Waves|2.75|Chip
//A4|Cloud Popcorn|3.65|Chip
//
//B1|Moonpie|1.80|Candy
//B2|Cowtales|1.50|Candy
//B3|Wonka Bar|1.50|Candy
//B4|Crunchie|1.75|Candy
//
//C1|Cola|1.25|Drink
//C2|Dr. Salt|1.50|Drink
//C3|Mountain Melter|1.50|Drink
//C4|Heavy|1.50|Drink
//
//D1|U-Chews|0.85|Gum
//D2|Little League Chew|0.95|Gum
//D3|Chiclets|0.75|Gum
//D4|Triplemint|0.75|Gum

//		String [] Chip = {"Potato Crisps", "Stackers", "Grain Waves", "Cloud Popcorn"};
//		String [] Candy = {"Moonpie", "Cowtales", "Wonka Bar", "Crunchie"};
//		String [] Beverage = {"Cola", "Dr. Salt", "Mountain Melter", "Heavy"};
//		String [] Gum = {"U-Chews", "Little League Chew", "Chiclets", "Triplemint"};


