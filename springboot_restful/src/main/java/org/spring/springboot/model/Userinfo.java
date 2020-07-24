package org.spring.springboot.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Userinfo {
    private Integer id;

    /**
    * 用户名（邮箱）
    */
    private String username;

    /**
    * 昵称
    */
    private String nickname;

    private String password;
}