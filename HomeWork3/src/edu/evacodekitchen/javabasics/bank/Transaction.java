package edu.evacodekitchen.javabasics.bank;

import java.time.LocalDate;

public class Transaction {

	LocalDate date;
	int amount = 0;
	
	public Transaction(int amount, LocalDate date ) {
		this.amount = amount;
		this.date = date;
	}
	
	
	public LocalDate getDate() {
		return date;
	}
	
	public int getAmount() {
		return amount;
	}


}
