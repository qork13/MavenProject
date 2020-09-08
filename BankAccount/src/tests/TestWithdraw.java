package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Before;
import org.junit.Test;

import model.BankAccount;



public class TestWithdraw {
	
	//Create a new Bank Account named account and set a balance of 600
	BankAccount account = new BankAccount(600);

	@Before
	public void setUp() throws Exception {
	}
	
	//This test verifies the balance is positive after withdrawal
	@Test
	public void testWithdrawPositive() {
		account.withdraw(500);
		double balance = account.getBalance();
		assertEquals(100, balance, 0.0);
	}
	
	//This test verified the balance is negative after withdrawal
	@Test
	public void testWithdrawNegative() {
		account.withdraw(700);
		double balance = account.getBalance();
		assertEquals(-100, balance, 0.0);
	}
	
	
	//This test verifies the account returns a negative indicator of true
	@Test
	public void testIsNegative() {
		account.withdraw(700);
		account.isAccountNegative(account);
		assertTrue(account.isAccountNegative(account));
	}
	
	//This test verifies the account returns a negative indicator of false
		@Test
		public void testIsPositive() {
			account.withdraw(699);
			account.isAccountNegative(account);
			assertTrue(account.isAccountNegative(account));
		}

}
