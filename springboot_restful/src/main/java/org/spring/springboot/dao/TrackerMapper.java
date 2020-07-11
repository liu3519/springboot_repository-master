package org.spring.springboot.dao;

import org.spring.springboot.model.Tracker;

public interface TrackerMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Tracker record);

    int insertSelective(Tracker record);

    Tracker selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Tracker record);

    int updateByPrimaryKey(Tracker record);
}