package com.hancoding.www.service;

import com.hancoding.www.entity.Article;
import com.hancoding.www.repository.ArticleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class ArticleService {

    @Autowired
    private ArticleRepository articleRepository;

    public Page<Article> articleList(Pageable pageable) {

        return articleRepository.findAll(pageable);
    }

    public void insert(Article article) {

        article.setProperty(1);
        article.setRegdate(LocalDateTime.now());
        article.setUpdate(LocalDateTime.now());
        articleRepository.save(article);

    }

    public Article view(int idx) {

        return articleRepository.findByIdx(idx);
    }

    public void hit(int id) {

        Article article = articleRepository.findById(id).get();
        article.setHit(article.getHit() + 1);
        articleRepository.save(article);

    }
}
