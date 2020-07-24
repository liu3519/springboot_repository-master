package org.spring.springboot.model;

import java.util.Date;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Comments {
    private Integer id;

    private Integer userId;

    private String comment;

    private Integer picOrArtId;

    private Date publishTime;

    /**
    * 文章为1，图片为2
    */
    private Integer type;

    private Integer starNum;
}