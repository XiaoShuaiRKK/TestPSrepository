package org.test.sql.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.test.sql.entity.Article;

@Mapper
public interface ArticleMapper extends BaseMapper<Article> {
}
