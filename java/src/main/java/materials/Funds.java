package materials;

public class Funds {
	
	private double balance = 0;
	private double getBalance; 
	private double getDeductBalance;
	public double getBalance() {
		
		
		return balance;
	}

	public void setBalance(double amountAdded) {
		this.balance = this.balance + amountAdded;
	}
	
	public void  deductBalance (double amountSubtracted) {
		
	this.balance = this.balance - amountSubtracted;
	}

	
	
}
