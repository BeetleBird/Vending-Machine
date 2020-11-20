package materials;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Chips extends Sellables {

	public Chips(String name, double price, String slotLocation, int quantity, String snackType) {
		super(name, price, slotLocation, quantity, snackType);
		
	}
	
	
	
	
	
	
	
	@Override
	public String getSnackType() {
		snackType = "Munch Munch, Yum!";
		return this.getSnackType();
	}
	
	

}
