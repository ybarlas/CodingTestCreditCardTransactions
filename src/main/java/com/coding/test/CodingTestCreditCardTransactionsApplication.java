package com.coding.test;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CodingTestCreditCardTransactionsApplication {
	
	private static final Logger log = LoggerFactory.getLogger(CodingTestCreditCardTransactionsApplication.class);
	
		public static void main(String[] args) {
		SpringApplication.run(CodingTestCreditCardTransactionsApplication.class, args);
		
		log.info("-----------CodingTestCreditCardTransactionsApplication----------- START");

		CalculateTransactions calculateTransactions = new CalculateTransactions();
		List<List<Transaction>> resultList = calculateTransactions.calculate(TransactionsData.getTransactionData());
				
		log.info("-----------CodingTestCreditCardTransactionsApplication----------- END");
		
	}

}
