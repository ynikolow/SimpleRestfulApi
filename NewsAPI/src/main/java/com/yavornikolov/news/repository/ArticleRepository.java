package com.yavornikolov.news.repository;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.yavornikolov.news.domain.Article;

@Repository
public interface ArticleRepository extends JpaRepository<Article, Integer> {

	List<Article> findByTitle(String title, Sort sort);

	List<Article> findByPublishedDate(String publishedDate, Sort sort);

	List<Article> findByTitleAndPublishedDate(String title, String publishedDate, Sort sort);

}
