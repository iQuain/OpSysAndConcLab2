/**
 * 
 * @author IanQuain & Paul Lennon
 * @purpose A Company object that will add 1000 from an account in 100 separate transactions
 * @version 1
 * 
 */

package com.ait.exercise;

//Class is runnable so we can create a thread from it
public class Company implements Runnable {

	private Account account;

	// Constructor - needs to take in an Account object reference
	public Company(Account account) {
		// Sets the global account object as a reference to the one read in
		this.account = account;
	}

	@Override
	public void run() {
		// Looping to simulate 1000 transactions where 1000 is added from the account
		for (int i = 0; i < 100; i++) {
			// Calling the addAmount to take the 1000 away
			account.addAmount(1000);
		}
	}
}
