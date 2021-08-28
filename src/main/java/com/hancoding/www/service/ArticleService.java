package com.hancoding.www.service;

import com.hancoding.www.entity.Article;
import com.hancoding.www.repository.ArticleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class ArticleService {

    @Autowired
    private ArticleRepository articleRepository;

    public void insert(Article article) {

        article.setWriter(1);
        article.setProperty(1);
        article.setRegdate(LocalDateTime.now());
        article.setUpdate(LocalDateTime.now());
        articleRepository.save(article);

    }

    public Article view(int idx) {

        return articleRepository.findByIdx(idx);
    }
}
