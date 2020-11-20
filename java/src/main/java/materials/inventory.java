package materials;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.techelevator.VendingMachineCLI;

public class inventory {

	
		// Sellables thisSellables = new Sellables (name, price, slotLocation, quantity,
		// snackType);

		File productFile = new File("vendingmachine.csv");
		Scanner scanner = new Scanner(productFile);
		List<Sellables> sellablesList = new ArrayList<Sellables>();

		while (scanner.hasNextLine()) {

			String line = scanner.nextLine();
			String[] snackArr = line.split("\\|");
			
			if (snackArr[3].equals("Chip")) {
				Chips chips = new Chips(snackArr[1],Double.parseDouble(snackArr[2]), snackArr[0], 5, snackArr[3]);
				sellablesList.add(chips);
			}
			if (snackArr[3].equals("Candy")) {
				Candy candy = new Candy(snackArr[1],Double.parseDouble(snackArr[2]), snackArr[0], 5, snackArr[3]);
				sellablesList.add(candy);
			}
			if (snackArr[3].equals("Gum")) {
				Gum gum = new Gum(snackArr[1],Double.parseDouble(snackArr[2]), snackArr[0], 5, snackArr[3]);
				sellablesList.add(gum);
			}
			if (snackArr[3].equals("Beverage")) {
				Beverage beverage = new Beverage(snackArr[1],Double.parseDouble(snackArr[2]), snackArr[0], 5, snackArr[3]);
				sellablesList.add(beverage);
			}


		}
		
		
	}



