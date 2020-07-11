package org.spring.springboot.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class UserFollowed {
    /**
    * 自增id，不用管哦
    */
    private Integer id;

    /**
    * 用户id
    */
    private Integer userId;

    /**
    * 哥哥的id
    */
    private Integer followedId;
}