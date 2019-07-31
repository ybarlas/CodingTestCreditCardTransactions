package com.coding.test;

import static org.assertj.core.api.Assertions.assertThat;

import java.time.LocalDateTime;

import javax.print.attribute.standard.DateTimeAtProcessing;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import junit.framework.Assert;


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
		
		Transaction transaction = new Transaction(1, LocalDateTime.parse("2019-07-05T20:15:30"), 150.36);
		
		log.debug(" CodingTestCreditCardTransactionsApplicationTests : test001 " );
		
		assertThat(transaction.getAmount()==150.36);
		
		
	}
	

}
