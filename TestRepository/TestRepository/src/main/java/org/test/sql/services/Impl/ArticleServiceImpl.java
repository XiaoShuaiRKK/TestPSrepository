package org.test.sql.services.Impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import org.test.sql.DAO.ArticleMapper;
import org.test.sql.entity.Article;
import org.test.sql.services.ArticleService;

import java.util.List;

@Service
public class ArticleServiceImpl extends ServiceImpl<ArticleMapper, Article> implements ArticleService {
    @Override
    public void saveBatch(List<Article> articles) {

    }

    @Override
    public List<Article> selectBatchIds(List<Integer> ids) {
        return null;
    }
}
