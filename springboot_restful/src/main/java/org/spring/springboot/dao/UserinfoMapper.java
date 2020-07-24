package org.spring.springboot.dao;
import org.apache.ibatis.annotations.Param;
import java.util.List;

import org.spring.springboot.model.Userinfo;

public interface UserinfoMapper {

    int insert(Userinfo record);

    List<Userinfo> selectAllByUsername(@Param("username")String username);

    Integer selectIdByUsername(@Param("username")String username);



//    String selectPasswordByUsername(@Param("username")String username);

    int insertSelective(Userinfo record);

    Userinfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Userinfo record);

    int updateByPrimaryKey(Userinfo record);

    int deleteByPrimaryKey(Integer id);
}