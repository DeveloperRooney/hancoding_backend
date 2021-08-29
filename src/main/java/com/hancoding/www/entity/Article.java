package com.hancoding.www.entity;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Data
public class Article {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "article_idx")
    private Integer idx;

    @Column(name = "article_writer")
    private Integer writer;

    @Column(name = "article_property")
    private Integer property;

    @Column(name = "article_title")
    private String title;

    @Column(name = "article_content")
    private String content;

    @Column(name = "article_regdate")
    private LocalDateTime regdate;

    @Column(name = "article_update")
    private LocalDateTime update;

    @Column(name = "article_like")
    private int like;

    @Column(name = "article_count")
    private int hit;

    @Column(name = "article_report")
    private int report;
    
}
