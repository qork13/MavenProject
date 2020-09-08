package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Before;
import org.junit.Test;

import model.BankAccount;



public class TestWithdraw {
	
	BankAccount account = new BankAccount(600);

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testWithdrawPositive() {
		account.withdraw(500);
		double balance = account.getBalance();
		assertEquals(100, balance, 0.0);
	}
	
	@Test
	public void testWithdrawNegative() {
		account.withdraw(700);
		double balance = account.getBalance();
		assertEquals(-100, balance, 0.0);
	}
	
	@Test
	public void testIsNegative() {
		account.withdraw(700);
		account.isAccountNegative(account);
		assertFalse(account.isAccountNegative(account));
	}

}
