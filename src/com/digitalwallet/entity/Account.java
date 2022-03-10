package com.digitalwallet.entity;

import java.math.BigDecimal;
import java.util.Set;
import java.util.TreeSet;

import com.digitalwallet.util.AccountNumberGenerator;

public class Account {
	private int accountNumber;
	private User user;
	private BigDecimal balance;
	private Set<Transaction> transactions;

	public Account(String name, BigDecimal amount) {
		this.accountNumber = AccountNumberGenerator.getNextAccountNumber();
		this.user = new User(name);
		this.balance = amount;
		this.transactions = new TreeSet<>((a, b) -> a.getDate().compareTo(b.getDate()));
	}

	@Override
	public String toString() {
		return "Account [accountNumber=" + accountNumber + ", name=" + this.user.getName() + ", balance=" + balance
				+ ", tranactions=" + transactions + "]";
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public BigDecimal getBalance() {
		return balance;
	}

	public void setBalance(BigDecimal balance) {
		this.balance = balance;
	}

	public Set<Transaction> getTranactions() {
		return transactions;
	}

	public void setTranactions(TreeSet<Transaction> tranactions) {
		this.transactions = tranactions;
	}
}
