package com.hancoding.www.controller;

import com.hancoding.www.entity.Article;
import com.hancoding.www.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/article")
public class ArticleController {


    @Autowired
    private ArticleService articleService;

    // 게시글 리스트
    @GetMapping("/list")
    public String articleList() {

        return "article/articlelist";
    }


    // 게시글 작성폼
    @GetMapping("/write")
    public String articleWrite() {

        return "article/articlewrite";
    }

    @PostMapping("/write")
    public String articleWritePro(Article article) {

        articleService.insert(article);

        return "redirect:/article/list";
    }

    // 게시물 상세 보기
    @GetMapping("/view")
    public String articleView(Model model, @RequestParam("id") int idx) {

        model.addAttribute("article", articleService.view(idx));

        return "article/articleview";
    }

    //게시글 수정폼
    @GetMapping("/modify")
    public String articleModify() {

        return "article/articlemodify";
    }
}