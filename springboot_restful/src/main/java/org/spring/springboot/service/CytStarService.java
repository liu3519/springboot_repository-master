package org.spring.springboot.service;

import org.spring.springboot.model.Articles;
import org.spring.springboot.model.Person;

import java.util.List;

public interface CytStarService {
    Articles selectArticlePrimaryKey(Integer id);
}
