package org.test.sql.DAO;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.test.sql.entity.Author;

@Mapper
public interface AuthorMapper extends BaseMapper<Author> {
}
