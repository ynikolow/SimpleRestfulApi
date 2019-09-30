package com.yavornikolov.news.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.yavornikolov.news.domain.Article;

@Repository
public interface ArticleRepository extends PagingAndSortingRepository<Article, Integer> {

}
