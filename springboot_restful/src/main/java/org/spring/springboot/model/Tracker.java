package org.spring.springboot.model;

import java.util.Date;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Tracker {
    /**
    * 自增键，不要动哦
    */
    private Integer id;

    /**
    * name表里的id在这里
    */
    private Integer nameId;

    /**
    * 城市
    */
    private String city;

    /**
    * 活动时间
    */
    private Date time;

    /**
    * 具体活动地点
    */
    private String location;

    /**
    * 活动内容概要
    */
    private String content;

    /**
    * 详细内容哦
    */
    private String description;
}