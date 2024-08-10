package org.test.sql.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.test.sql.entity.Article;
import org.test.sql.entity.Result;
import org.test.sql.services.ArticleService;

import java.util.List;

@RestController
@RequestMapping("/articles")
public class ArticleController {

    private final ArticleService articleService;

    public ArticleController(ArticleService articleService) {
        this.articleService = articleService;
    }

    @PostMapping("/batch")
    public Result<Boolean> saveBatch(@RequestBody List<Article> articles){
        boolean result = articleService.saveBatch(articles);
        return Result.isSuccess(result,result);
    }
}
