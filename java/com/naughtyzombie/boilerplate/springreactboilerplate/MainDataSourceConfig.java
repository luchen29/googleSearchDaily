package com.naughtyzombie.boilerplate.springreactboilerplate;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.naughtyzombie.boilerplate.springreactboilerplate.model.Book;
import com.naughtyzombie.boilerplate.springreactboilerplate.model.News;
import com.naughtyzombie.boilerplate.springreactboilerplate.repository.BookRespository;
import com.naughtyzombie.boilerplate.springreactboilerplate.repository.NewsRepository;
import com.naughtyzombie.boilerplate.springreactboilerplate.security.repository.UserRepository;


@Configuration
@ComponentScan(basePackageClasses = {News.class, Book.class})
@EnableJpaRepositories(
		basePackageClasses = {News.class, Book.class, NewsRepository.class, BookRespository.class, UserRepository.class}
		)
public class MainDataSourceConfig {
	
}
