package materials;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import com.techelevator.VendingMachineCLI;

public class inventory {

	private String slotLocation;
	private String name;
	private Double price;
	private int quantity;
	private String snackType;

	public inventory() throws FileNotFoundException {

//		Sellables thisSellables = new Sellables(name, price, slotLocation, quantity, snackType);
//		{
//
//		}
		File productFile = new File("vendingmachine.csv");
		Scanner scanner = new Scanner(productFile);
		while (scanner.hasNextLine()) {
			String line = scanner.nextLine();
			String[] snackArr = line.split("\\|");

			slotLocation = snackArr[0];
			name = snackArr[1];
			price = Double.parseDouble(snackArr[2]);
			snackType = snackArr[3];
			break;
		}

	}
}

//		File productFile = new File("vendingmachine.csv");
//		Scanner scanner = new Scanner(productFile);
//
//		while (scanner.hasNextLine()) {
//			String line = scanner.nextLine();
//
//			int counter = 0;
//			if (counter != 0) {
//				String[] chipArr = line.split("\\|");
//				System.out.println(chipArr[0] + chipArr[1] + chipArr[2] + chipArr[3]);
//				counter++;
//				
//				
