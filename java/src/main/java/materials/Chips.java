package materials;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Chips extends Sellables {

	public Chips(String name, double price, String slotLocation, int quantity, String snackType,String snackMotto) {
		super(name, price, slotLocation, quantity, snackType, snackMotto);
		
	}
	
	
	
	@Override
	
	public String getsnackMotto() {
	//	snackMotto = "Munch Munch, Yum!";
		
		return this.getsnackMotto();
		}
	
	
	
	
	

}
