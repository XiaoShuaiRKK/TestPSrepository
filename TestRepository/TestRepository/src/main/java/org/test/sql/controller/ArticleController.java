package org.test.sql.controller;

import org.springframework.web.bind.annotation.*;
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

    @GetMapping("/search")
    public Result<List<Article>> searchArticles(@RequestParam("content") String content,
                                                @RequestParam(value = "pageNum",defaultValue = "1")Integer pageNum,
                                                @RequestParam(value = "pageSize",defaultValue = "10")Integer pageSize){
        return Result.isSuccess(articleService.findArticlesByContent(content,pageNum,pageSize).getRecords(),true);
    }
}
