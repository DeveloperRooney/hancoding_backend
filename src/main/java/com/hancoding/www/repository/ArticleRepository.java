package com.hancoding.www.repository;

import com.hancoding.www.entity.Article;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ArticleRepository extends JpaRepository<Article, Integer> {

    Article findByIdx(int idx);
}
