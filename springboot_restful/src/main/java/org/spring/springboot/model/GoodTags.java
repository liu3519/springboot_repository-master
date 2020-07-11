package org.spring.springboot.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class GoodTags {
    /**
    * 自增id，不要动
    */
    private Integer id;

    /**
    * 商品id
    */
    private Integer goodId;

    /**
    * 标签
    */
    private String tag;
}