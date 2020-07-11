package org.spring.springboot.service;

import org.spring.springboot.model.Articles;
import org.spring.springboot.model.Person;

import java.util.List;

/**
 * 城市业务逻辑接口类
 *
 * @author WJ
 * @date 2018/04/22
 */
public interface CytStarService {


    Articles selectByPrimaryKey(Integer id);
}
