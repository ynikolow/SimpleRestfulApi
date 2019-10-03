package com.yavornikolov.news.domain;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
// Just to be extra safe if some database is case sensitive
@Table(name = "ARTICLE")
public class Article {
	@Id
	@Column(name = "ARTICLE_ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
// I think that here should be something more
	@Column(name = "PUBLISHED_DATE")
	private LocalDate publishedDate;

	@Column(name = "TITLE")
	private String title;

	@Column(name = "SHORT_DESCRIPTION")
	private String shortDescription;

	@Column(name = "ARTICLE_TEXT")
	private String articleText;

	public Article(LocalDate publishedDate, String title, String shortDescription, String articleText) {
		this.publishedDate = publishedDate;
		this.title = title;
		this.shortDescription = shortDescription;
		this.articleText = articleText;
	}

	protected Article() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public LocalDate getPublishedDate() {
		return publishedDate;
	}

	public void setPublishedDate(LocalDate publishedDate) {
		this.publishedDate = publishedDate;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getShortDescription() {
		return shortDescription;
	}

	public void setShortDescription(String shortDescription) {
		this.shortDescription = shortDescription;
	}

	public String getArticleText() {
		return articleText;
	}

	public void setArticleText(String articleText) {
		this.articleText = articleText;
	}

}
