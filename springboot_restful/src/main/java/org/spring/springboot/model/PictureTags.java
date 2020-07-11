package org.spring.springboot.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class PictureTags {
    /**
    * 自增键，不要动哦
    */
    private Integer id;

    /**
    * 图片id
    */
    private Integer pictureId;

    /**
    * 标签
    */
    private String tag;
}