package materials;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Chips extends Sellables {

	public Chips(String name, double price, String slotLocation, int quantity, String snackType) {
		super(name, price, slotLocation, quantity, snackType);
		
	}
	
	
	
	private String name;
	private double price;
	private String slotLocation;
	private int quantity = 5;
	String snackType = "";

	
	public static List<Sellables> sellablesList = new ArrayList<Sellables>();
	
	
	File productFile = new File("vendingmachine.csv");
	Scanner scanner = new Scanner(productFile);
	while (scanner.hasNextLine()) {
		String line = scanner.nextLine();
		String[] snackArr = line.split("\\|");

		this.slotLocation = snackArr[0];
		name = snackArr[1];
		price = Double.parseDouble(snackArr[2]);
		snackType = snackArr[3];
		break;
	
	
	
	@Override
	public String getSnackType() {
		snackType = "Munch Munch, Yum!";
		return this.getSnackType();
	}
	
	

}
