package org.spring.springboot.mapper;

import org.spring.springboot.model.Idolinfo;

public interface IdolinfoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Idolinfo record);

    int insertSelective(Idolinfo record);

    Idolinfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Idolinfo record);

    int updateByPrimaryKey(Idolinfo record);
}