package org.test.sql.services;

import com.baomidou.mybatisplus.extension.service.IService;
import org.test.sql.entity.Author;

import java.util.List;

public interface AuthorService extends IService<Author> {
    void saveBatch(List<Author> authors);
    List<Author> selectBatchIds(List<Integer> ids);
}
