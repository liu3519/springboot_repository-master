package org.spring.springboot.service.impl;

import org.spring.springboot.dao.CytStarDao;
import org.spring.springboot.model.Articles;
import org.spring.springboot.model.Person;
import org.spring.springboot.service.CytStarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CytStarServiceImpl implements CytStarService {


    private CytStarDao cytStarDao;

    @Autowired
    public CytStarServiceImpl(CytStarDao cytStarDao) {
        this.cytStarDao = cytStarDao;
    }

    @Override
    public Articles selectByPrimaryKey(Integer id) {
        return cytStarDao.selectByPrimaryKey(id);
    }

}
