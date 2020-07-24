package org.spring.springboot.model;

import java.util.Date;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Pictures {
    private Integer id;

    private Integer userId;

    private Integer idolId;

    private String title;

    /**
    * 文件名
    */
    private String filename;

    /**
    * 文件路径
    */
    private String filepath;

    /**
    * 唯一标识
    */
    private String uuid;

    private Date publishTime;

    private Integer commentNum;

    private Integer starNum;
}