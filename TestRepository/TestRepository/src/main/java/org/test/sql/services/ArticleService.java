package org.test.sql.services;


import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import org.test.sql.entity.Article;

import java.util.List;

public interface ArticleService extends IService<Article> {
    void insertBatch(List<Article> articles);
    List<Article> selectBatchIds(List<Integer> ids);
    Page<Article> findArticlesByContent(String target, int pageNum, int pageSize);
}
