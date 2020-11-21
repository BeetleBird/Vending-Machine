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
	public String getName() {
		// TODO Auto-generated method stub
		return super.getName();
	}

	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		return super.getPrice();
	}

	@Override
	public String getSlotLocation() {
		// TODO Auto-generated method stub
		return super.getSlotLocation();
	}

	@Override
	public int getQuantity() {
		// TODO Auto-generated method stub
		return super.getQuantity();
	}

	@Override
	public String getsnackMotto() {
		return this.getsnackMotto();
	}
	
	
	@Override
	public String getSnackType() {
	return super.getSnackType();
	}
	
}
