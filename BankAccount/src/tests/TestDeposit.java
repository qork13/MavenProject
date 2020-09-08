package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Test;

import model.BankAccount;

import org.junit.Before;

public class TestDeposit {
	
	BankAccount account = new BankAccount(600);
	
	@Before
	public void setUp() throws Exception {
		
	}

	@Test
	public void testDeposit() {
		account.deposit(600);
		double balance = account.getBalance();
		assertEquals(1200, balance, 0.0);
	}
	
	@Test
	public void isRichFalse() {
		account.deposit(100000);
		account.isRich(account);
		assertFalse(account.isRich(account));
	}
	
	@Test
	public void isRichTrue() {
		account.deposit(5000000);
		account.isRich(account);
		assertTrue(account.isRich(account));
	}
	
	@Test
	public void accountNull() {
		assertNotNull(account);
		
	}

}
