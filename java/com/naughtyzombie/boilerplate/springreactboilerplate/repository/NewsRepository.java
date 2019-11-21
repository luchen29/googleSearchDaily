package com.naughtyzombie.boilerplate.springreactboilerplate.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.naughtyzombie.boilerplate.springreactboilerplate.model.News;

@Repository
public interface NewsRepository extends JpaRepository<News, Integer> {

}