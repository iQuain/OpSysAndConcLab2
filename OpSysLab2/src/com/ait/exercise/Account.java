/**
 * 
 * @author IanQuain & Paul Lennon
 * @purpose An Account object which will hold the balance and manipulate it as transactions occur
 * @version 1
 * 
 */

package com.ait.exercise;

public class Account {
	private double balance;

	// Constructor method
	public Account() {
		// TODO Auto-generated constructor stub
	}

	// Method for reading the balance of the account
	public double getBalance() {
		// Returning the global variable
		return balance;
	}

	// Method for changing the balance of the account
	synchronized void setBalance(double balance) {
		// Setting the global variable to the one read in
		this.balance = balance;
	}

	// Method for adding to the account
	protected void addAmount(double amount) {
		// Calling our setBalance and adding the amount we take in to it
		setBalance(this.balance + amount);
		// Printing the new balance and noting it is increasing
		System.out.println("Balance Increased: " + getBalance());
		try {
			// Sleeping for 10 milliseconds
			Thread.sleep(10);
			// Catching exceptions
		} catch (InterruptedException e) {
			// Printing any possible exceptions
			e.printStackTrace();
		}

	}

	// Method for subtracting from the account
	protected void subtractAmount(double amount) {
		// Calling our setBalance and subtracting the amount we take in from it
		setBalance(this.balance - amount);
		// Printing the new balance and noting it is decreasing
		System.out.println("Balance Decreased: " + getBalance());
		try {
			// Sleeping for 10 milliseconds
			Thread.sleep(10);
			// Catching exceptions
		} catch (InterruptedException e) {
			// Printing any possible exceptions
			e.printStackTrace();
		}

	}

}
