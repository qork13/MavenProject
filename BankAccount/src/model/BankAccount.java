package model;

public class BankAccount {
	
	private double balance;
	
	public BankAccount() {
		
	}
	
	public BankAccount(double balance) {
		setBalance(balance);
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	
	//Deposit Method
	public double deposit(double deposit) {
		
		balance = deposit + balance;
		
		return balance;
		
	}
	
	//Withdrawal Method
	public double withdraw(double withdraw) {
		
		balance = balance - withdraw;
		
		return balance;
	}
	
	
	//Boolean method for overdraft
	public boolean isAccountNegative(BankAccount account) {
		boolean funds = false;
		
		if (getBalance() < 0) {
			funds = true;
		}
		
		return funds;
		
		
		}
	
	//Boolean method to find out if member is rich
	public boolean isRich(BankAccount account) {
		boolean rich = false;
		
		if (getBalance() > 1000000) {
			rich = true;
		}
		
		return rich;
	}
	
	//Add a try catch to find out if the withdraw would put account in the negative and assess a $30 fee to it.
}
