package org.spring.springboot.service.impl;

import org.spring.springboot.dao.CytStarDao;
import org.spring.springboot.model.Articles;
import org.spring.springboot.model.Person;
import org.spring.springboot.service.CytStarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 业务逻辑实现层
 *
 * @author WJ
 * @date 2018/04/22
 */
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
