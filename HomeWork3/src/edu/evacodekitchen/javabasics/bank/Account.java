package edu.evacodekitchen.javabasics.bank;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Account {

	String owner;
	String id;
	int balance = 0;
	List<Transaction> transactions = new ArrayList<Transaction>();

	public Account(String owner, String id) {
		this.owner = owner;
		this.id = id;
	}

	public int getBalance() {
		int sum = 0;
		for (Transaction transaction : transactions) {
			sum += transaction.getAmount();
		}
		return sum;
	}

	public void doTransaction(int amount, LocalDate date) {
		if (amount >= 0) {
			transactions.add(new Transaction(amount, date));
		}
		else {
			if ((getBalance() + amount) >= 0) {
				transactions.add(new Transaction(amount, date));
			}
			else {
				throw new TooLowBalanceException();
			}
		}
	}

	public List<Transaction> getTransactionsFor(LocalDate date) {
		List<Transaction> result = new ArrayList<>();
		for (Transaction transaction : transactions) {
			if (transaction.getDate().equals(date)){
				result.add(transaction);
			}
		}
		return result;
	}

}
