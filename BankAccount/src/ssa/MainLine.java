package ssa;

public class MainLine {

	public static void main(String[] args) {

		Account checking1 = new Account();
		Account savings1 = new Account();

		

		// Yesterday's Test
		/*
		 * checking1.deposit(500.00); 
		 * checking1.deposit(200.00);
		 * checking1.withdraw(600.00); 
		 * checking1.deposit(100.00);
		 * checking1.withdraw(300.00); 
		 * checking1.withdraw(200.00);
		 * 
		 *
		  savings1.deposit(1000.00); 
		  savings1.withdraw(750.00);
		  savings1.withdraw(250.00);
		  savings1.deposit(200.00);
		  
		  
		  checking1.transferFrom(savings1, 100.00);
		  
		  */
		 

		// Account 5 Test/*

		//checking1.balance = 800.00;
		checking1.print();

		checking1.deposit(300.00);
		checking1.print();

		checking1.withdraw(699.99);
		checking1.print();

		checking1.deposit(149.99);
		checking1.print();

		checking1.withdraw(950.00);
		checking1.print();

		checking1.withdraw(200.00);
		checking1.print();
////////////////////////////////SAVINGS////////////////////////////////////////////
		savings1.deposit(1000.00);
		checking1.print();

		savings1.deposit(400.00);
		checking1.print();

		savings1.withdraw(750.00);
		checking1.print();

		savings1.withdraw(250.00);
		checking1.print();
		
		savings1.deposit(650.00);
		checking1.print(); 

		checking1.transferFrom(savings1, 100.00); // transfer 100 from savings to checking  */
		
		// another account
		Account checking2 = new Account("My slush fund checking account");
		checking2.deposit(300.00);
		checking2.print();
		checking2.withdraw(150.00);
		checking2.print();
		checking2.deposit(250.00);
		checking2.print();

		
		checking1.print();
		checking2.print();
		savings1.print();
		
		

	}

}
