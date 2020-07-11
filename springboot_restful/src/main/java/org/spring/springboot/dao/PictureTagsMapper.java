package org.spring.springboot.dao;

import org.spring.springboot.model.PictureTags;

public interface PictureTagsMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(PictureTags record);

    int insertSelective(PictureTags record);

    PictureTags selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(PictureTags record);

    int updateByPrimaryKey(PictureTags record);
}