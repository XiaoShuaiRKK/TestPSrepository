package org.test.sql.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Date;

@Data
@TableName("articles")
@AllArgsConstructor
@NoArgsConstructor
public class Article implements Serializable {
    @TableId
    private Integer articleId;
    private String title;
    private Integer authorId;
    private String content;
//    @JsonFormat(locale = "zh",timezone = "GMT+8",pattern = "yyyy-MM-ddTHH:mm:ss")
    private Date publishDate;
    private String category;
    private String tags;
    private Integer views;
    private Integer likes;
    private Integer comments;
}
