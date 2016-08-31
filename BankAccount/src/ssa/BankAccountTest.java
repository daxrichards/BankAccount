package ssa;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class BankAccountTest {
	Account testAccount = new Account();
	Account savings1 = new Account();
	Account checking1 = new Account();
	Account savings2 = new Account();
	Account checking2 = new Account();
	Savings testSavings = new Savings();
	
       
	
     
	
	@Before
	public void setup() {

	}

	@SuppressWarnings("deprecation")
	
		
		/***************************************************/
		/***************************************************/
		/*********** Testing the Account Class *************/
		/***************************************************/
		/***************************************************/
		
	
		
		/***************************************************/
		/*************     setId Method     ****************/
		/***************************************************/
		@Test
		public void testSetId(){
		//Private Method - tested within the constructor
		/*Account testAccount = new Account(111, "New Account");
		assertEquals(111, testAccount.getId());
		Account testAccount = new Account(999, "New Account");
		assertEquals(999, testAccount.getId());
		Account testAccount = new Account(000, "New Account");
		assertEquals(000, testAccount.getId());
		Account testAccount = new Account(111, "New Account");
		assertEquals(234, testAccount.getId()); */
		}
			
		/***************************************************/
		/**************   setDescription    ****************/
		/***************************************************/
		@Test
		public void setDescription(){
		testAccount.setDescription("Account 1");
		assertEquals("Account 1", testAccount.getDescription());
		testAccount.setDescription("Account 2");
		assertEquals("Account 2", testAccount.getDescription());
		testAccount.setDescription("Account 3");
		assertEquals("Account 3", testAccount.getDescription());
		testAccount.setDescription("Account 4");
		assertEquals("Account 4", testAccount.getDescription());
		}
		
		/***************************************************/
		/***********    setBalance & Deposit     ***********/
		/***************************************************/
		@Test
		public void testSetBalDeposit(){
		testAccount.deposit(0.00);
		assertEquals(0.00, testAccount.getBalance(), 0);
		testAccount.withdraw(testAccount.getBalance());
		testAccount.deposit(-10.00);
		assertEquals(0.00, testAccount.getBalance(), 0);
		testAccount.withdraw(testAccount.getBalance());
		testAccount.deposit(110.00);
		assertEquals(110.00, testAccount.getBalance(), 0);
		testAccount.withdraw(testAccount.getBalance());
		testAccount.deposit(2000.01);
		assertEquals(2000.01, testAccount.getBalance(), 0);
		}
		
		/***************************************************/
		/***********      withdraw Method        ***********/
		/***************************************************/
		@Test
		public void testWithdraw(){
		testAccount.deposit(50.00);
		testAccount.withdraw(10.00);
		assertEquals(40.00, testAccount.getBalance(), 0);
		testAccount.withdraw(testAccount.getBalance());
		testAccount.deposit(0.00);
		testAccount.withdraw(10.00);
		assertEquals(0.00, testAccount.getBalance(), 0);
		testAccount.withdraw(testAccount.getBalance());
		testAccount.deposit(50.00);
		testAccount.withdraw(60.00);
		assertEquals(50.00, testAccount.getBalance(), 0);
		testAccount.withdraw(testAccount.getBalance());
		testAccount.deposit(100.00);
		testAccount.withdraw(75.50);
		assertEquals(24.50, testAccount.getBalance(), 0);
		}
		
		/***************************************************/
		/****       transfer Method  (From Savings)     ****/
		/***************************************************/
		@Test
		public void testTransferFromSavings(){
		savings1.deposit(100.00);
		checking1.deposit(100.00);
		checking1.transferFrom(savings1,  50.00);
		assertEquals(50.00,savings1.getBalance(),0);
		assertEquals(150.00,checking1.getBalance(),0);
		savings1.withdraw(savings1.getBalance());
		checking1.withdraw(checking1.getBalance());
		savings1.deposit(100.00);
		checking1.deposit(100.00);
		checking1.transferFrom(savings1,  1000.00);
		assertEquals(100.00,savings1.getBalance(),0);
		assertEquals(100.00,checking1.getBalance(),0);
	
		}
		 @Test
		public void testTransferFromChecking(){
		savings1.deposit(100.00);
		checking1.deposit(100.00);
		savings1.transferFrom(checking1,  50.00);
		assertEquals(150.00,savings1.getBalance(),0);
		assertEquals(50.00,checking1.getBalance(),0);
		savings1.withdraw(savings1.getBalance());
		checking1.withdraw(checking1.getBalance());
		savings1.deposit(100.00);
		checking1.deposit(100.00);
		savings1.transferFrom(checking1,  1000.00);
		assertEquals(100.00,checking1.getBalance(),0);
		assertEquals(100.00,savings1.getBalance(),0);
		}
		

		/***************************************************/
		/***************************************************/
		/***********  Testing the Savings Class  ***********/
		/***************************************************/
		/***************************************************/
		
		/***************************************************/
		/***********      setBelowMin Method     ***********/
		/***************************************************/
	@Test
	public void testSetBelowMin(){
		
		testSavings.setBelowMin(false);
		assertFalse("", testSavings.isBelowMin());
		testSavings.setBelowMin(true);
		assertTrue("", testSavings.isBelowMin());
		testSavings.setBelowMin(true);
		assertTrue("", testSavings.isBelowMin());
		testSavings.setBelowMin(false);
		assertFalse("", testSavings.isBelowMin());
		
		
	}
	
		/***************************************************/
		/***********   setInterestRate Method    ***********/
		/***************************************************/
		@Test
		public void testSetInterestRate(){
			
			testSavings.setInterestRate(1.5);
			assertEquals(1.5,testSavings.getInterestRate(),0);
			testSavings.setInterestRate(0.5);
			assertEquals(0.5,testSavings.getInterestRate(),0);
			testSavings.setInterestRate(2.0);
			assertEquals(2.0,testSavings.getInterestRate(),0);
			testSavings.setInterestRate(3.0);
			assertEquals(3.0,testSavings.getInterestRate(),0);
			
		}
	     
		/***************************************************/
		/******     CalcDepositInterest Method      ********/
		/***************************************************/
		@Test
		public void testCalcDepositInterest(){
		testSavings.setBelowMin(false);
		testSavings.setInterestRate(-1);
		testSavings.deposit(500);
		assertEquals(0, testSavings.CalcDepositInterest(4), 0);
		testSavings.withdraw(testSavings.getBalance());
		testSavings.setBelowMin(false);
		testSavings.setInterestRate(0);
		testSavings.deposit(500);
		assertEquals(0, testSavings.CalcDepositInterest(4), 0);
	    testSavings.withdraw(testSavings.getBalance());
		testSavings.setBelowMin(false);
		testSavings.setInterestRate(0.2);
		testSavings.deposit(100);
		assertEquals(6.67, testSavings.CalcDepositInterest(4), 0.1);
		testSavings.withdraw(testSavings.getBalance());
		testSavings.setBelowMin(false);
		testSavings.setInterestRate(1.0);
		testSavings.deposit(150);
		assertEquals(75.00, testSavings.CalcDepositInterest(6), 0);
		
		
			
			
		
			
		}

		
}
	