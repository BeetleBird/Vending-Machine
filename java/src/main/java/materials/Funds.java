package materials;

public class Funds {
	
	private double balance = 0;
	private double getBalance; 

	public double getBalance() {
		
		
		return balance;
	}

	public void setBalance(double amountAdded) {
		this.balance = this.balance + amountAdded;
	}
	
	public Double deductBalance (double amountSubtracted) {
		
		return this.balance = this.balance - amountSubtracted;
	}
}
