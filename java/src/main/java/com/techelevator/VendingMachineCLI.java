package com.techelevator;

import java.io.FileNotFoundException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.techelevator.view.Menu;

import materials.Funds;
import materials.Inventory;
import materials.Sellables;

public class VendingMachineCLI {

	private static final String MAIN_MENU_OPTION_DISPLAY_ITEMS = "Display Vending Machine Items";
	private static String USER_SELECTED_ITEM = "";
	private static final String MAIN_MENU_OPTION_PURCHASE = "Purchase";// , "Display Vending Machine Items"};
	private static final String MAIN_MENU_OPTION_EXIT = "Exit";
	private static final String[] MAIN_MENU_OPTIONS = { MAIN_MENU_OPTION_DISPLAY_ITEMS, MAIN_MENU_OPTION_PURCHASE,
			MAIN_MENU_OPTION_EXIT };
	private static final String[] PURCHASE_MENU = { "Feed Money", "Select Product", "Finish Transaction", "Back" };
	private static final String[] FEED_MONEY_MENU = { "1", "5", "10", "Back" };
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

	public Object getQuanity() { //////////////

		return null;
	}

	public void run() {
		while (true) {
			String choice = (String) menu.getChoiceFromOptions(MAIN_MENU_OPTIONS);
			System.out.println("You picked: " + choice);

			if (choice.equals(MAIN_MENU_OPTION_DISPLAY_ITEMS)) {

				List<Sellables> listOfStuff = inventoryList.getSellables();
				for (Sellables groupOfItems : listOfStuff) {
					Integer quanity = groupOfItems.getQuantity();
					System.out.println(
							groupOfItems.getName() + "|" + groupOfItems.getSnackType() + quanity + " remaining"); // snacktype
																													// not
																													// printing

				}
			}
			if (choice.equals(MAIN_MENU_OPTION_PURCHASE)) {

				// do purchase

				String selection = "";

				while (!selection.equals("Back")) {
					selection = (String) menu.getChoiceFromOptions(PURCHASE_MENU);

					if (selection.equals("Feed Money")) {
						processMoney();
					}

					if (selection.equals("Select Product")) {

						List<Sellables> listOfStuff = inventoryList.getSellables();

						for (Sellables groupOfItems : listOfStuff) {
							Integer quanity = groupOfItems.getQuantity();
							System.out.println(groupOfItems.getSlotLocation() + "|" + groupOfItems.getName() + "|"
									+ groupOfItems.getPrice() + "|" + groupOfItems.getSnackType() + quanity
									+ " REMAINING");

						}
						
						
						// 1. Let's ask the user what they want.
						Scanner scanner = new Scanner(System.in); 
						System.out.println("Select something");
						String someName = scanner.nextLine(); 

						
						// 2. Loop through the inventory list and see if we can find it.
						for (Sellables items : listOfStuff) {
							
							
							// TODO:
							// - If you don't have enough money, you can't go into this if block.
							
							if (someName.equals (items.getSlotLocation()) ) {
								
								//TODO: 
								// - If the inventory is already zero, you can't deduct the qty, and
								// therefore you can't buy 
								int currentQty = items.getQuantity();
								int newQty = currentQty - 1;
								items.setQuantity(newQty);
								
							}
							
						}
									
					}

					if (selection.contentEquals("Finish Transaction")) {
						// do finish transaction stuff;
					}

				}

			}

			if (choice.equals(MAIN_MENU_OPTION_EXIT)) {

			}

		}
	}


	public void processMoney() {

		String selection = "";
		while (!selection.equals("Back")) {

			selection = (String) menu.getChoiceFromOptions(FEED_MONEY_MENU);

			if (selection.equals("1")) {
				funds.setBalance(new BigDecimal(1));

			}

			else if (selection.equals("5")) {
				funds.setBalance(new BigDecimal(5));

			}

			else if (selection.equals("10")) {
				funds.setBalance(new BigDecimal(10));

			}

			System.out.println("You have $" + funds.getBalance());
		}

	}

}
