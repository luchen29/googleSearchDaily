package com.naughtyzombie.boilerplate.springreactboilerplate.service;

import java.util.List;

import org.assertj.core.util.VisibleForTesting;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.naughtyzombie.boilerplate.springreactboilerplate.model.News;
import com.naughtyzombie.boilerplate.springreactboilerplate.repository.NewsRepository;

@Service("newsService")
public class NewsService {
	@Autowired 
	private NewsRepository newsRepository;
	
	@Autowired
	private NewsApiService newsApiService;
	
	@VisibleForTesting
	public void saveNewsFetchedFromApi() throws Exception {
		List<News> allFetchedNews = newsApiService.getGeneralNews();
		newsRepository.saveAll(allFetchedNews);
	}
	
	@VisibleForTesting
	public List<News> findNewsById(Iterable<Integer> ids) {
		return newsRepository.findAllById(ids);
	}
	
}
