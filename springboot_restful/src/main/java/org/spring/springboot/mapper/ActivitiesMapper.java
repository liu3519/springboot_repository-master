package org.spring.springboot.mapper;

import org.spring.springboot.model.Activities;

public interface ActivitiesMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Activities record);

    int insertSelective(Activities record);

    Activities selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Activities record);

    int updateByPrimaryKey(Activities record);
}