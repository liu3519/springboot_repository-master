package org.spring.springboot.mapper;

import org.spring.springboot.model.GoodTags;

public interface GoodTagsMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(GoodTags record);

    int insertSelective(GoodTags record);

    GoodTags selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(GoodTags record);

    int updateByPrimaryKey(GoodTags record);
}