package org.spring.springboot.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Name {
    /**
    * 自增ID，什么都不用动
    */
    private Integer id;

    /**
    * 哥哥的名字
    */
    private String name;
}