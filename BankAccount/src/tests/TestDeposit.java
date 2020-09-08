package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Test;

import model.BankAccount;

import org.junit.Before;

public class TestDeposit {
	
	//Create a new Bank Account named account and set a balance of 600
	//Update balance in parathenses to set a new initial balance will break the testDeposit Test though
	BankAccount account = new BankAccount(600);
	
	@Before
	public void setUp() throws Exception {
		
	}

	//This test will deposit 600 dollars into the account and verify that the new balance is 1200
	@Test
	public void testDeposit() {
		account.deposit(600);
		double balance = account.getBalance();
		assertEquals(1200, balance, 0.0);
	}
	
	//This test will deposit 100000 into the account and verify if it meets the threshold for being rich
	@Test
	public void isRichFalse() {
		account.deposit(100000);
		account.isRich(account);
		assertFalse(account.isRich(account));
	}
	
	//This test will deposit 5,000,000 into the account and verify if it meets the threshold for being rich
	@Test
	public void isRichTrue() {
		account.deposit(5000000);
		account.isRich(account);
		assertTrue(account.isRich(account));
	}
	
	
	//This test verifies that the account that was created is not Null
	@Test
	public void accountNull() {
		assertNotNull(account);
		
	}

}
