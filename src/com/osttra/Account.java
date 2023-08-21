package com.osttra;

public class Account {
	
	private int amount = 50;
	
	public int getAmount() {
		return amount;
	}
	
	public void withdraw(int amount) {
		
		this.amount = this.amount - amount;
	}

}
