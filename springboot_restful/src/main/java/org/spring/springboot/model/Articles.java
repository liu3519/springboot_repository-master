package org.spring.springboot.model;

import java.util.Date;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Articles {
    private Integer id;

    private Integer userId;

    private Integer idolId;

    private String title;

    private String article;

    private Date publishTime;

    private Integer isShort;

    private Integer commentNum;

    private Integer starNum;
}