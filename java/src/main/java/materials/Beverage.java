package materials;

public class Beverage extends Sellables {

	public Beverage(String name, double price, String slotLocation, int quantity, String snackType) {
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
	public String getSnackType() {
		snackType = "Glug Glug, Yum!";
		return this.getSnackType();
	}
	
	
	
	

}
