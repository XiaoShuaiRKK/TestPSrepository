package org.test.sql.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@TableName("articles")
public class Article {
    @TableId
    private Integer articleId;
    private String title;
    private Integer authorId;
    private String content;
    private LocalDateTime publishDate;
    private String category;
    private String tags;
    private Integer views;
    private Integer likes;
    private Integer comments;
}
