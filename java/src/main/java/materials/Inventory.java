package materials;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.techelevator.VendingMachineCLI;
import com.techelevator.view.Menu;

public class Inventory {

	private List<Sellables> sellablesList = new ArrayList<Sellables>();

	public Inventory () {

		File productFile = new File("vendingmachine.csv");

		try {
		Scanner scanner = new Scanner(productFile);

		while (scanner.hasNextLine()) {

			String line = scanner.nextLine();
			String[] snackArr = line.split("\\|");

			if (snackArr[3].equals("Chip")) {
				Sellables chips = new Chips(snackArr[1], Double.parseDouble(snackArr[2]), snackArr[0], 5, snackArr[3]);
				sellablesList.add(chips);
			}
			if (snackArr[3].equals("Candy")) {
				Sellables candy = new Candy(snackArr[1], Double.parseDouble(snackArr[2]), snackArr[0], 5, snackArr[3]);
				sellablesList.add(candy);
			}
			if (snackArr[3].equals("Gum")) {
				Sellables gum = new Gum(snackArr[1], Double.parseDouble(snackArr[2]), snackArr[0], 5, snackArr[3]);
				sellablesList.add(gum);
			}
			if (snackArr[3].equals("Beverage")) {
				Sellables beverage = new Beverage(snackArr[1], Double.parseDouble(snackArr[2]), snackArr[0], 5, snackArr[3]);
				sellablesList.add(beverage);
			}

		}
		} catch (FileNotFoundException e) {
			System.out.println("file read error");
		}
	}
	
	public List<Sellables> getSellables() {
		return this.sellablesList;
	}
	
	

}
