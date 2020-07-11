package org.spring.springboot.dao;

import org.spring.springboot.model.Pictures;

public interface PicturesMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Pictures record);

    int insertSelective(Pictures record);

    Pictures selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Pictures record);

    int updateByPrimaryKey(Pictures record);
}