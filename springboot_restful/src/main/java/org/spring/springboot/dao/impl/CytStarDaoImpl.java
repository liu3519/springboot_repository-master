package org.spring.springboot.dao.impl;

import org.spring.springboot.dao.CytStarDao;
import org.spring.springboot.mapper.ArticlesMapper;
import org.spring.springboot.model.Articles;
import org.springframework.beans.factory.annotation.Autowired;

public class CytStarDaoImpl implements CytStarDao {

    @Autowired
    ArticlesMapper articlesMapper;

    @Override
    public Articles selectByPrimaryKey(Integer id) {
        return articlesMapper.selectByPrimaryKey(id);
    };
}