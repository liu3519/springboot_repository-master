package org.spring.springboot.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Tags {
    private Integer id;

    private String tag;

    /**
    * 文章1，图片2
    */
    private Integer type;

    private Integer picOrArtId;
}