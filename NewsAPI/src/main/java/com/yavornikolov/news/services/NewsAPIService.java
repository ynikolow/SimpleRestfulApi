package com.yavornikolov.news.services;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yavornikolov.news.domain.Article;
import com.yavornikolov.news.repository.ArticleRepository;

@Service
public class NewsAPIService {
	

	private ArticleRepository articleRepository;

	@Autowired
	public NewsAPIService(ArticleRepository articleRepository) {
		this.articleRepository = articleRepository;
	}

	public Article createArticle(int id, LocalDate publishedDate, String title, String shortDescription,
			String articleText) {
		if (!articleRepository.existsById(id)) {
			articleRepository.save(new Article(id, publishedDate, title, shortDescription, articleText));
		}
		return null;
	}
	
	public Iterable<Article> lookupAllArticles(){
		return articleRepository.findAll();	
	}

}
