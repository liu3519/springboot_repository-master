package org.spring.springboot.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class UserInfo {
    /**
    * 自增ID，什么都不用动
    */
    private Integer id;

    /**
    * 这里写用户名
    */
    private String username;

    /**
    * 这里写显示的真实姓名，可以是哥哥，也可以是用户/买家呀
    */
    private String displayName;

    /**
    * 密码，如果cyt有需要的话
    */
    private String password;
}