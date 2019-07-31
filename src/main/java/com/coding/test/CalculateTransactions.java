package com.coding.test;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

import javax.print.attribute.standard.DateTimeAtCompleted;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;

public class CalculateTransactions {
	
	private static final Logger log = LoggerFactory.getLogger(CalculateTransactions.class);
	private static int windowSize = 24 ; 		// = 6 hr Size of window 
	private static long totalAmount = 700 ; 

	public List<List<Transaction>> calculate(List<Transaction> transactions){
		transactions = sortByDateTime(transactions);
		long startTime = transactions.get(0).getTime().getTime();
		long endTime = transactions.get(transactions.size()-1).getTime().getTime();
		List<List<Transaction>> result = new ArrayList<List<Transaction>>();
		log.info("Window Size in Hours :" + windowSize);
		log.info("Total Amount of Transaction(s) :" + totalAmount);
		log.info("");
		for (Transaction transaction : transactions) {
			List<Transaction> res = getTransactions(startTime, endTime, transaction.getTime(), totalAmount, transactions);
			if(res!=null)result.add(res);
		}
		return result;
	}

	private List<Transaction> getTransactions(long startTime, long endTime, Timestamp time, long totalAmount, List<Transaction> transactions) {
		List<Transaction> responceList= new ArrayList<Transaction>();
		long sum = 0;
		long windoStart = startTime ;
		long windowEnd = endTime ;
		
		if(time.getTime() - TimeUnit.HOURS.toMillis(windowSize/2) > startTime || time.getTime() + TimeUnit.HOURS.toMillis(windowSize/2) < endTime ) {
			windoStart = time.getTime() - TimeUnit.HOURS.toMillis(windowSize/2) ;
			windowEnd = time.getTime() + TimeUnit.HOURS.toMillis(windowSize/2) ;
		}

		if(time.getTime() - TimeUnit.HOURS.toMillis(windowSize/2) < startTime) {
			windowEnd = startTime + TimeUnit.HOURS.toMillis(windowSize) < endTime ? startTime + TimeUnit.HOURS.toMillis(windowSize) : endTime ; 
		}

		if(time.getTime() + TimeUnit.HOURS.toMillis(windowSize/2) > endTime) {
			windoStart = endTime - TimeUnit.HOURS.toMillis(windowSize) > startTime ? endTime - TimeUnit.HOURS.toMillis(windowSize) : startTime ;
		}
		
		for (Transaction record : transactions) {
			if(record.getTime().getTime() > windoStart && record.getTime().getTime() < windowEnd) {
				sum += record.getAmount();
				responceList.add(record);
			}
		}
		
		if(sum >= totalAmount) {
			log.info("Calculating Winth respect to : "+ time);
			log.info("Time Window Start :" + new Date(windoStart));
			log.info("Time Window End   :" + new Date(windowEnd));
			responceList.forEach(r -> log.info(""+r));
			log.info("Total Amount :" + sum);
			log.info("");
			return responceList;
		}
		return null;
	}

	private List<Transaction> sortByDateTime(List<Transaction> transactions) {
		transactions = transactions.stream().sorted(Comparator.comparing(Transaction::getTime)).collect(Collectors.toList());
		//transactions.forEach(tran -> log.info(tran.toString()));
		return transactions;
	}
	
	
}
