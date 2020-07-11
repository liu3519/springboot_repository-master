package org.spring.springboot.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class ArticleTags {
    /**
    * 自增id
    */
    private Integer id;

    /**
    * 文章id
    */
    private Integer articleId;

    private String tag;
}