/**
 * 
 * @author IanQuain & Paul Lennon
 * @purpose A transaction simulator to simulate the transactions that occur on the account
 * @version 1
 * 
 */

package com.ait.exercise;

public class Tranaction_Simulator {

	public static void main(String[] args) {
		// Create an Account object and initialize its balance to 1000.
		Account account = new Account();
		account.setBalance(1000);

		// Create a Company object and Thread to run it.
		Company c = new Company(account);
		Thread companyThread = new Thread(c);

		// Create a Bank object and Thread to run it.
		Bank b = new Bank(account);
		Thread bankThread = new Thread(b);

		// Write the initial balance to the console.
		System.out.printf("Account : Initial Balance: %f\n", account.getBalance());

		// Start the threads.
		companyThread.start();
		bankThread.start();

		// Wait for the finalization of the two threads using the join() method and
		// print in the console the final balance of the account.
		try {
			companyThread.join();
			bankThread.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// Printing final balance
		System.out.printf("Account : Final Balance: %f\n", account.getBalance());

	}

}
