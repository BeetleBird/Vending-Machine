package materials;

public class Gum extends Sellables{

	public Gum(String name, double price, String slotLocation, int quantity, String snackType, String snackMotto) {
		super(name, price, slotLocation, quantity, snackType, snackMotto);
		// TODO Auto-generated constructor stub
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
		//snackMotto = "Chew Chew, Yum!";
		return this.getsnackMotto();
	}
	
	

}
