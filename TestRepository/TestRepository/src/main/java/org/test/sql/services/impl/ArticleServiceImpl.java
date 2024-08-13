package org.test.sql.services.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import org.test.sql.entity.Article;
import org.test.sql.mapper.ArticleMapper;
import org.test.sql.services.ArticleService;

import java.util.List;

@Service
public class ArticleServiceImpl extends ServiceImpl<ArticleMapper,Article> implements ArticleService {

    final ArticleMapper articleMapper;

    public ArticleServiceImpl(ArticleMapper articleMapper) {
        this.articleMapper = articleMapper;
    }

    @Override
    public void insertBatch(List<Article> articles) {
        saveBatch(articles);
    }

    @Override
    public List<Article> selectBatchIds(List<Integer> ids) {
        return listByIds(ids);
    }

    @Override
    public Page<Article> findArticlesByContent(String target,int pageNum,int pageSize) {
        Page<Article> page = new Page<>(pageNum,pageSize);
        QueryWrapper<Article> queryWrapper = new QueryWrapper<>();
        queryWrapper.like("content",target);
        return articleMapper.selectPage(page,queryWrapper);
    }
}
