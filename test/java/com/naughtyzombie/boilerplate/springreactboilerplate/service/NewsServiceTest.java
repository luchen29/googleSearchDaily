package com.naughtyzombie.boilerplate.springreactboilerplate.service;

import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.naughtyzombie.boilerplate.springreactboilerplate.model.News;


@RunWith(SpringRunner.class)
@SpringBootTest
public class NewsServiceTest {
	
	@Autowired
	private NewsService newsService;
	
//	@Test
//	public void getAllNews() {
//		Integer idsArr[] = {1};
//		Iterable<Integer> ids = Arrays.asList(idsArr);
//		List<News> allNews = newsService.findNewsById(ids);
//		Assert.assertEquals("test title", allNews.get(0).getTitle());
//	}
	
	@Test
	public void saveAllFetchedData() throws Exception {
		newsService.saveNewsFetchedFromApi();
	}
}
