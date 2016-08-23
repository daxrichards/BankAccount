package ssa;

import java.awt.Font;
import java.lang.*;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;

public class Account {

	private int id = (int)Math.ceil(java.lang.Math.random()*100);
	public String description;
	private double balance;

	// Default Constructor
	public Account() {
		// This call will set the initial balance to zero
		setBalance();
	}

	// Constructor to accept 1 String parameter for description
	public Account(String description) {
		this.description = description;

	}

	// Constructor to accept two parameters: for id and description
	public Account(int id, String description) {
		setId(id);
		this.description = description;

	}
	
	public String getDescription() {
	    return this.description;
	  }
	
	  public void setDescription(String description) {
	    this.description = description;
	  }


	private void setId(int id) {
		this.id = id;

	}

	public int getId() {
		return this.id;
	}

	private void setBalance() {

		this.balance = 0.00;
	}

	public double getBalance() {
		return this.balance;
	}

	public double deposit(double deposit) {

		//System.out.println("\nYou have successfully made a deposit of $" + String.format("%.2f", deposit));

		return this.balance += deposit;
	}

	public double withdraw(double withdraw) {
		
		if (withdraw > 0.00 && withdraw <= this.balance) {
			this.balance -= withdraw;
		} 
		return this.balance;
	}
	public void transferFrom(Account account, double amount) {

		if(amount > 0.00 && amount <= account.balance) {
			account.balance -= amount;
			this.balance += amount;
		}
		
		}
			
	public String print(){
		
		return "Account " + getId() + " balance is $" + String.format("%.2f", this.balance);
	}
			

}
