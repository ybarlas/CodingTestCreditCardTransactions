package com.coding.test;

import java.sql.Timestamp;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest
public class CodingTestCreditCardTransactionsApplicationTests {

	
	private static final Logger log = LoggerFactory.getLogger(CodingTestCreditCardTransactionsApplicationTests.class);

	
	@Test
	public void contextLoads() {
		
		log.debug(" CodingTestCreditCardTransactionsApplicationTests : contextLoads" );
		
		
	}
	
	@Test
	public void test001() {
		
		Transaction transaction = new Transaction(26, Timestamp.valueOf("2019-07-05 20:15:30"), 101);
		
		
	}
	

}
