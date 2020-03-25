package MyPackage;

import MyExceptions.InsufficientFundsException;

public class ChequingAccount {
	
	private double balance;
	private int number;
	
	public ChequingAccount(int number) {
		this.number=number;
	}
	
	public void deposit(double amount) {
		balance+= amount;
	}
	
	public void withdraw(double amount) throws InsufficientFundsException {
		
		// deducts the withdraw amount from the current balance if the amount is less than or equals to the balance,
		//otherwise it throws an InsufficientFundsException with the amount that is needed to complete the withdraw operation.
		if(amount<=balance) {
			balance-=amount;
		}
		
		else {
			double amountNeeded = amount-balance;
			throw new InsufficientFundsException(amountNeeded);
		
		}
	}
}
