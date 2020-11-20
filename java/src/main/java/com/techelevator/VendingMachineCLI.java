package com.techelevator;

import java.io.FileNotFoundException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import com.techelevator.view.Menu;

import materials.Funds;
import materials.Inventory;
import materials.Sellables;


public class VendingMachineCLI {

	private static final String MAIN_MENU_OPTION_DISPLAY_ITEMS = "Display Vending Machine Items";
	private static final String MAIN_MENU_OPTION_PURCHASE = "Purchase";
	private static final String MAIN_MENU_OPTION_EXIT = "Exit";
	private static final String[] MAIN_MENU_OPTIONS = { MAIN_MENU_OPTION_DISPLAY_ITEMS, MAIN_MENU_OPTION_PURCHASE,
			MAIN_MENU_OPTION_EXIT };
	private static final String[] PURCHASE_MENU = { "Feed Money", "Select Product", "Finish Transaction", "Back" };
	private static final String[] FEED_MONEY_MENU = { "1", "5", "10" };
	private Menu menu;
	private Funds funds = new Funds();
	Inventory inventoryList = new Inventory();

	public static void main(String[] args) throws FileNotFoundException {
		Menu menu = new Menu(System.in, System.out);
		VendingMachineCLI cli = new VendingMachineCLI(menu);
		cli.run();

	}

	public Object inventoryList() {
		// TODO Auto-generated method stub
		return null;
	}

	public VendingMachineCLI(Menu menu) {
		this.menu = menu;
	}

//	public VendingMachineCLI(String snackType, double price, String snackType2, int quantity, String snackType3) {
//		// TODO Auto-generated constructor stub
//	}

	public void run() {
		while (true) {
			String choice = (String) menu.getChoiceFromOptions(MAIN_MENU_OPTIONS);
			System.out.println("You picked: " + choice);
			
	

			if (choice.equals(MAIN_MENU_OPTION_DISPLAY_ITEMS)) {
		
					List<Sellables> listOfStuff = inventoryList.getSellables();
					for (Sellables groupOfItems : listOfStuff ) {
						System.out.println(groupOfItems.getName());
					}
			
			}if (choice.equals(MAIN_MENU_OPTION_PURCHASE)) {

			}

			if(choice.equals(MAIN_MENU_OPTION_EXIT)) {
			}

			// do purchase

			String selection = "";

			while (!selection.equals("Back")) {
				selection = (String) menu.getChoiceFromOptions(PURCHASE_MENU);

				if (selection.equals("Feed Money")) {
					processMoney();
				}

				System.out.println("You selected from the 2nd level: " + selection);

			}
		}

	}

	public void processMoney() {

		String selection = "";
		while (!selection.equals("Back")) {

			selection = (String) menu.getChoiceFromOptions(FEED_MONEY_MENU);

			if (selection.equals("$1")) {
				funds.setBalance(new BigDecimal(1));

			}

			else if (selection.equals("$5")) {
				funds.setBalance(new BigDecimal(5));

			}

			else if (selection.equals("$10")) {
				funds.setBalance(new BigDecimal(10));

			}

			System.out.println("You have $" + funds.getBalance());
		}

	}

}
