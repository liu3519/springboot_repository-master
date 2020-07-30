package org.spring.springboot.service;

import com.sun.org.apache.xpath.internal.operations.Mult;
import org.spring.springboot.model.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

public interface CytStarService {
    UserinfoToReturn resignNewUser(Userinfo userinfo);

    UserinfoToReturn login(Userinfo userinfo);

//    List<Articles> selectArticleByAll(Articles articles);
//
//    String publishShortArticle(Articles articles);

//    String publishPicture(PictureUpload pictureUpload, MultipartFile file) throws IOException;
//
//    List<Pictures> selectPictureByAll(Pictures pictures) throws IOException;
//
//    byte[] getPictureByUUID(String uuid) throws IOException;
//
//    List<ArticleTags> selectArticleTagsByArticleId(int id);
//
//    List<ArticleComments> selectByArticleId(int id);
//
//    String insertSelectiveComment(ArticleComments articleComments);
}
