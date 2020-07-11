package org.spring.springboot.dao;

import org.spring.springboot.model.UserFollowed;

public interface UserFollowedMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(UserFollowed record);

    int insertSelective(UserFollowed record);

    UserFollowed selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(UserFollowed record);

    int updateByPrimaryKey(UserFollowed record);
}