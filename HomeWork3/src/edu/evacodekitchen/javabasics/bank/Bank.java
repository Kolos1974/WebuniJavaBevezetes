package edu.evacodekitchen.javabasics.bank;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Bank {

	private List<Account> accounts = new ArrayList<Account>();
	
	public void addAccount(Account account) {
		// TODO
		accounts.add(account);
	}

	public List<Account> getAccounts() {
		// TODO
		/*
		List<Account> result = new ArrayList<Account>();
		for (Account account : accounts) {
			result.add(account);
		}
		return result;
		*/
		
		// return accounts.stream().collect(Collectors.toList());
		
		return accounts;
		
	}

	public List<Account> getPremiumAccounts() {
		// TODO
		/*
		List<Account> result = new ArrayList<Account>();
		for (Account account : accounts) {
			if (account.getBalance()>12000) {
				result.add(account);
			}
		}
		return result;
		*/
		
		// return accounts.stream().filter((Predicate<Account>) a -> a.getBalance()>12000).collect(Collectors.toList());
		
		return accounts.stream().filter(a -> a.getBalance()>12000).collect(Collectors.toList());
		
	}

}
