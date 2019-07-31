package com.coding.test;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

public class TransactionsData {
	
	public static List<Transaction> getTransactionData() {
		
		
		List<Transaction> transactions = new ArrayList<Transaction>();
		
		transactions.add(new Transaction(26, Timestamp.valueOf("2019-07-05 20:15:30"), 101));
		transactions.add(new Transaction(1, Timestamp.valueOf("2019-07-01 10:15:30"), 102));
		transactions.add(new Transaction(2, Timestamp.valueOf("2019-07-01 11:15:30"), 143));
		transactions.add(new Transaction(3, Timestamp.valueOf("2019-07-01 15:15:30"), 134));
		transactions.add(new Transaction(4, Timestamp.valueOf("2019-07-01 20:15:30"), 116));
		transactions.add(new Transaction(5, Timestamp.valueOf("2019-07-02 08:15:30"), 128));
		transactions.add(new Transaction(6, Timestamp.valueOf("2019-07-02 10:15:30"), 130));
		transactions.add(new Transaction(7, Timestamp.valueOf("2019-07-02 12:15:30"), 140));
		transactions.add(new Transaction(8, Timestamp.valueOf("2019-07-02 13:15:30"), 150));
		transactions.add(new Transaction(9, Timestamp.valueOf("2019-07-02 16:15:30"), 170));
		transactions.add(new Transaction(10, Timestamp.valueOf("2019-07-03 01:15:30"), 300));
		transactions.add(new Transaction(11, Timestamp.valueOf("2019-07-03 03:15:30"), 200));
		transactions.add(new Transaction(12, Timestamp.valueOf("2019-07-03 05:15:30"), 145));
		transactions.add(new Transaction(13, Timestamp.valueOf("2019-07-03 07:15:30"), 143));
		transactions.add(new Transaction(14, Timestamp.valueOf("2019-07-03 10:15:30"), 173));
		transactions.add(new Transaction(15, Timestamp.valueOf("2019-07-03 13:15:30"), 163));
		transactions.add(new Transaction(16, Timestamp.valueOf("2019-07-04 14:15:30"), 275));
		transactions.add(new Transaction(17, Timestamp.valueOf("2019-07-04 16:15:30"), 187));
		transactions.add(new Transaction(18, Timestamp.valueOf("2019-07-04 18:15:30"), 115));
		transactions.add(new Transaction(19, Timestamp.valueOf("2019-07-04 19:15:30"), 122));
		transactions.add(new Transaction(20, Timestamp.valueOf("2019-07-04 02:15:30"), 135));
		transactions.add(new Transaction(21, Timestamp.valueOf("2019-07-04 13:15:30"), 142));
		transactions.add(new Transaction(22, Timestamp.valueOf("2019-07-05 03:15:30"), 153));
		transactions.add(new Transaction(23, Timestamp.valueOf("2019-07-05 09:15:30"), 164));
		transactions.add(new Transaction(24, Timestamp.valueOf("2019-07-05 13:15:30"), 176));
		transactions.add(new Transaction(25, Timestamp.valueOf("2019-07-05 18:15:30"), 188));
		
		return transactions;
		
		
	}

}
