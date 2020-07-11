package org.spring.springboot.dao;

import org.spring.springboot.model.Articles;

public interface CytStarDao {
    Articles selectByPrimaryKey(Integer id);
}
