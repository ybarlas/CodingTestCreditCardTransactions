package com.coding.test;

import java.sql.Timestamp;

public class Transaction {
	
	private int id ;
	private Timestamp time ;
	private double amount ;

	public Transaction(int id, Timestamp time, double amount) {
		super();
		this.id = id;
		this.time = time;
		this.amount = amount;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Timestamp getTime() {
		return time;
	}
	public void setTime(Timestamp time) {
		this.time = time;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	@Override
	public String toString() {
		return "Transaction [id=" + id + ", time=" + time + ", amount=" + amount + "]";
	}
	
	
}
