/**
 * 
 * @author IanQuain & Paul Lennon
 * @purpose A Bank object that will subtract 1000 from an account in 100 separate transactions
 * @version 1
 * 
 */

package com.ait.exercise;

//Class is runnable so we can create a thread from it
public class Bank implements Runnable {

	// Global uninitialized Account object
	private Account account;

	// Constructor - needs to take in an Account object reference
	public Bank(Account account) {
		// Sets the global account object as a reference to the one read in
		this.account = account;
	}

	@Override
	public void run() {
		// Looping to simulate 1000 transactions where 1000 is removed from the account
		for (int i = 0; i < 100; i++) {
			// Calling the subtractAmount to take the 1000 away
			account.subtractAmount(1000);
		}
	}

}
