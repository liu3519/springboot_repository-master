package org.spring.springboot.dao.impl;

import org.spring.springboot.dao.UserInfoDao;
import org.spring.springboot.mapper.UserinfoMapper;
import org.spring.springboot.model.Userinfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserInfoDaoImpl implements UserInfoDao {

    @Autowired
    UserinfoMapper userinfoMapper;

    @Override
    public int insert(Userinfo record) {
        return userinfoMapper.insert(record);
    }

    @Override
    public List<Userinfo> selectAllByUsername(String username) {
        return userinfoMapper.selectAllByUsername(username);
    }
}
