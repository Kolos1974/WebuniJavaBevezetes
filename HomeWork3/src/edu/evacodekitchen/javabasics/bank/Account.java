package edu.evacodekitchen.javabasics.bank;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Account {

	// private int balance = 0;
	private String owner;
	private String id;
	private List<Transaction> transactions = new ArrayList<Transaction>();

	public Account(String owner, String id) {
		this.owner = owner;
		this.id = id;
	}

	public int getBalance() {
		/*
		int sum = 0;
		for (Transaction transaction : transactions) {
			sum += transaction.getAmount();
		}
		return sum;
		*/
		
		return transactions.stream().mapToInt(t -> t.getAmount()).sum(); 
		
		
	}

	public void doTransaction(int amount, LocalDate date) {
		
		if ((getBalance() + amount) < 0) {
			throw new TooLowBalanceException();
		}
		else {
			transactions.add(new Transaction(amount, date));
		}
		
	}

	public List<Transaction> getTransactionsFor(LocalDate date) {
		/*
		List<Transaction> result = new ArrayList<>();
		for (Transaction transaction : transactions) {
			if (transaction.getDate().equals(date)){
				result.add(transaction);
			}
		}
		return result;
		*/
		
		// return transactions.stream().filter((Predicate<Transaction>) t -> t.getDate().equals(date)).collect(Collectors.toList());
		
		return transactions.stream().filter(t -> t.getDate().equals(date)).collect(Collectors.toList()); 
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, owner);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Account other = (Account) obj;
		return Objects.equals(id, other.id) && Objects.equals(owner, other.owner);
	}

	
	
}
