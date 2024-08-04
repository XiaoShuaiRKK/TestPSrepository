package org.test.sql.services;

import com.baomidou.mybatisplus.extension.service.IService;
import org.test.sql.entity.Article;

import java.util.List;

public interface ArticleService extends IService<Article> {
    void saveBatch(List<Article> articles);
    List<Article> selectBatchIds(List<Integer> ids);
}
