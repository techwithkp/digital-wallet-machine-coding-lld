package com.digitalwallet.entity;

import java.math.BigDecimal;
import java.util.Date;

public class Transaction {
	private int from;
	private int to;
	private BigDecimal amount;
	private Date date;

	public Transaction(int from, int to, BigDecimal amount, Date date) {
		this.from = from;
		this.to = to;
		this.amount = amount;
		this.date = date;
	}

	@Override
	public String toString() {
		return "Transaction [from=" + from + ", to=" + to + ", amount=" + amount + ", date=" + date + "]";
	}

	public int getFrom() {
		return from;
	}

	public void setFrom(int from) {
		this.from = from;
	}

	public int getTo() {
		return to;
	}

	public void setTo(int to) {
		this.to = to;
	}

	public BigDecimal getAmount() {
		return amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}
}
