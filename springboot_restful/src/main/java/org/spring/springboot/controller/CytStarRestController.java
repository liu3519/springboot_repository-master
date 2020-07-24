package org.spring.springboot.controller;

import org.spring.springboot.model.*;
import org.spring.springboot.service.CytStarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

/**
 * 人员PersonController 实现 HTTP服务
 *
 * @author WJ
 * @date 2018/04/22
 */
@RequestMapping(value = "/api")
@RestController
public class CytStarRestController {
    @Autowired
    private CytStarService cytStarService;

    @Autowired
    public CytStarRestController(CytStarService cytStarService) {
        this.cytStarService = cytStarService;
    };

    @RequestMapping(value="/resignNewUser",method = RequestMethod.POST)
    public UserinfoToReturn resignNewUser(@RequestBody Userinfo userinfo){
        return cytStarService.resignNewUser(userinfo);
    }

    @RequestMapping(value="/login",method = RequestMethod.POST)
    public String login(@RequestBody Userinfo userinfo){
        return cytStarService.login(userinfo);
    }

//    @RequestMapping(value = "/selectArticles" ,method = RequestMethod.GET)
//    public List<Articles> selectArticleByAll(Articles articles){
//        return cytStarService.selectArticleByAll(articles);
//    }
//
//    @RequestMapping(value = "/publishShortArticle")
//    public String publishShortArticle(@RequestBody Articles articles){
//        return cytStarService.publishShortArticle(articles);
//    }
//
//    @RequestMapping(value = "/selectPictures" ,method = RequestMethod.GET)
//    public List<Pictures> selectPictureByAll(Pictures pictures) throws IOException {
//        return cytStarService.selectPictureByAll(pictures);
//    }
//    @RequestMapping(value = "/publishPicture")
//    public String publishPicture(PictureUpload pictureUpload, @RequestParam(value="file") MultipartFile file) throws IOException {
//        return cytStarService.publishPicture(pictureUpload,file);
//    }
//
//    @GetMapping(
//            value = "/getPicture",
//            produces = MediaType.IMAGE_JPEG_VALUE
//    )
//    public @ResponseBody byte[] getPictureByUUID(String uuid) throws IOException {
//        return cytStarService.getPictureByUUID(uuid);
//    }
//
//    @RequestMapping(value = "/selectArticleTagsByArticleId" ,method = RequestMethod.GET)
//    public List<ArticleTags> selectArticleTagsByArticleId(int id) {
//        return cytStarService.selectArticleTagsByArticleId(id);
//    }
//
//    @RequestMapping(value = "/selectArticleCommentsByArticleId" ,method = RequestMethod.GET)
//    public List<ArticleComments> selectArticleCommentsByArticleId(int id) {
//        return cytStarService.selectByArticleId(id);
//    }
//
//    @RequestMapping(value = "/publishArticleComment")
//    public String publishArticleComment(@RequestBody ArticleComments articleComments){
//        return cytStarService.insertSelectiveComment(articleComments);
//    }
}
