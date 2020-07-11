package org.spring.springboot.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Articles {
    /**
    * 自增id，不要动哦
    */
    private Integer id;

    /**
    * 名称表id
    */
    private Integer nameId;

    /**
    * 文章标题哦
    */
    private String title;

    /**
    * 文章内容哦
    */
    private String article;
}