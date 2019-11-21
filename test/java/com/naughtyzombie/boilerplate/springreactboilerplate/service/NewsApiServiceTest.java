package com.naughtyzombie.boilerplate.springreactboilerplate.service;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class NewsApiServiceTest {
	@Autowired
	private NewsApiService newsApiService;
	
	@Test
	public void getGeneralNewsWillFetchDataCorrectly() {
		try {
			Assert.assertNotNull(newsApiService.getGeneralNews());
		} catch (Exception e) {
			
		}		
	}

}
