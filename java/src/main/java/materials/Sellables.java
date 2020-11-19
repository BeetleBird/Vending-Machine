package materials;

import java.io.File;
import java.util.Scanner;

public class Sellables {
	
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
	int counter = 0;
	File productFile = new File("vendingmachine.csv");
	Scanner scanner = new Scanner(productFile);

	String line = scanner.nextLine();


	while (scanner.hasNextLine()) {
	
	if (counter != 0) {
	String[] chipArr = line.split("\\|");
	System.out.println(chipArr[0] + chipArr[1] + chipArr[2] + chipArr[3]);
	}
	counter++;
	}
	
	

	public String getName() {
		return name;
	}

	public double getPrice() {
//		double [] sellablePrice = {3.05, 1.45, 2.75, 3.65 };
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


