package materials;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class inventory extends Sellables {

	public inventory(String name, double price, String slotLocation, int quantity, String snackType) throws FileNotFoundException {
		super(name, price, slotLocation, quantity, snackType);

		
		
		File productFile = new File("vendingmachine.csv");
		Scanner scanner = new Scanner(productFile);

		while (scanner.hasNextLine()) {
			String line = scanner.nextLine();

			int counter = 0;
			if (counter != 0) {
				String[] chipArr = line.split("\\|");
				System.out.println(chipArr[0] + chipArr[1] + chipArr[2] + chipArr[3]);
				counter++;
				
				
				System.out.println(chipArr[0]);
				
			}
		}

	}

}
