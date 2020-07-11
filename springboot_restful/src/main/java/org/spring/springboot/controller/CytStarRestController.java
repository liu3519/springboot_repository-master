package org.spring.springboot.controller;

import org.spring.springboot.model.Articles;
import org.spring.springboot.service.CytStarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * 人员PersonController 实现 HTTP服务
 *
 * @author WJ
 * @date 2018/04/22
 */

@RestController
public class CytStarRestController {

    private CytStarService cytStarService;

    @Autowired
    public CytStarRestController(CytStarService cytStarService) {
        this.cytStarService = cytStarService;
    };

    @RequestMapping(value = "/api/select" ,method = RequestMethod.GET)
    public Articles selectByPrimaryKey(Integer id){
        return cytStarService.selectArticlePrimaryKey(id);
    }
}
