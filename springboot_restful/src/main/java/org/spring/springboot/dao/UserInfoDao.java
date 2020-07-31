package org.spring.springboot.dao;

import org.spring.springboot.model.Userinfo;

import java.util.List;

public interface UserInfoDao {

    int insert(Userinfo record);

    List<Userinfo> selectAllByUsername(String username);
}
