package com.naughtyzombie.boilerplate.springreactboilerplate.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

import org.springframework.lang.Nullable;

@Entity
@Table(name = "news")
@Data
@NoArgsConstructor
public class News {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

	private String title;
    
    @Column(name = "news_url")
	private String newsUrl;
    
    @Column(columnDefinition = "TEXT")
	private String content;
	
    @Column(name = "date_published")
	private LocalDateTime datePublished;

    @Column(name = "news_provider_name")
	private String newsProviderName;

	private String category;
	
	@Column(name = "img_url")
	private String imgUrl;
	
	@Column(name = "img_width")
	private int imgWidth;
	
	@Column(name = "img_height")
	private int imgHeight;
	
	@Column(name = "img_provider_name")
	private String imgProviderName;
	
	@Column(name = "is_breaking_news")
	private boolean isBreakingNews;
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getContent() {
		return content;
	}
	
	public void setContent(String content) {
		this.content = content;
	}
	
	public String getNewsUrl() {
		return newsUrl;
	}
	
	public void setNewsUrl(String newsUrl) {
		this.newsUrl = newsUrl;
	}
	
	public String getNewsProviderName() {
		return newsProviderName;
	}
	
	public void setNewsProviderName(String newsProviderName) {
		this.newsProviderName = newsProviderName;
	}
	
	public LocalDateTime getDatePublished() {
		return datePublished;
	}
	
	public void setDatePublished(LocalDateTime datePublished) {
		this.datePublished = datePublished;
	}
	
	public String getCategory() {
		return category;
	}
	
	public void setCategory(String category) {
		this.category = category;
	}
}