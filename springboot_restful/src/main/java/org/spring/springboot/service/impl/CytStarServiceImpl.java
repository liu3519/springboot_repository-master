package org.spring.springboot.service.impl;

import org.spring.springboot.dao.ArticlesMapper;
import org.spring.springboot.model.Articles;
import org.spring.springboot.model.Person;
import org.spring.springboot.service.CytStarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CytStarServiceImpl implements CytStarService {

    @Autowired
    private ArticlesMapper articlesMapper;

    @Override
    public Articles selectArticlePrimaryKey(Integer id) {
        return articlesMapper.selectByPrimaryKey(id);
    }

}
