package org.spring.springboot.service.impl;

import org.spring.springboot.dao.UserInfoDao;
import org.spring.springboot.model.*;
import org.spring.springboot.service.CytStarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class CytStarServiceImpl implements CytStarService {

    @Autowired
    private UserInfoDao userInfoDao;

    @Override
    public UserinfoToReturn resignNewUser(Userinfo userinfo){
        UserinfoToReturn userinfoToReturn=new UserinfoToReturn();
        List<Userinfo> userSelected = userInfoDao.selectAllByUsername(userinfo.getUsername());
        if(userSelected.size()>0)
            userinfoToReturn.setMsg("USERNAME EXIST");
        else{
            userInfoDao.insert(userinfo);
            userSelected = userInfoDao.selectAllByUsername(userinfo.getUsername());
            userinfoToReturn.setId(userSelected.get(0).getId());
            userinfoToReturn.setUsername(userSelected.get(0).getUsername());
            userinfoToReturn.setNickname(userSelected.get(0).getNickname());
            userinfoToReturn.setMsg("OK");
        }
        return userinfoToReturn;
    }

    @Override
    public UserinfoToReturn login(Userinfo userinfo){
        UserinfoToReturn userinfoToReturn=new UserinfoToReturn();
        List<Userinfo> userSelected= userInfoDao.selectAllByUsername(userinfo.getUsername());
        if(userSelected.size()==0)
            userinfoToReturn.setMsg("NO USERNAME");
        else{
            if(userSelected.get(0).getPassword().equals(userinfo.getPassword())){
                userinfoToReturn.setMsg("OK");
                userinfoToReturn.setId(userSelected.get(0).getId());
                userinfoToReturn.setUsername(userSelected.get(0).getUsername());
                userinfoToReturn.setNickname(userSelected.get(0).getNickname());
            }
            else userinfoToReturn.setMsg("PASSWORD ERR");
        }
        return userinfoToReturn;
    }
//    @Autowired
//    private ArticlesMapper articlesMapper;
//
//    @Autowired
//    private ArticleTagsMapper articleTagsMapper;
//
//    @Autowired
//    private ArticleCommentsMapper articleCommentsMapper;
//
//    @Autowired
//    private PicturesMapper picturesMapper;
//
//    @Autowired
//    private PictureTagsMapper pictureTagsMapper;
//
//
//    @Override
//    public List<Articles> selectArticleByAll(Articles articles) {
//        if(articles.getTags()!=null){
//            System.out.println("articles"+articles);
//            List<Articles> selectedArticles = new ArrayList<>();
//            List<ArticleTags> articlesSelectedByTag;
//            Set<Integer> articleIdSet = new HashSet();
//            for(String tag : articles.getTags()){
//                articlesSelectedByTag=articleTagsMapper.selectByTag(tag);
//                for (ArticleTags articletag :articlesSelectedByTag){
//                    articleIdSet.add(articletag.getArticleId());
//                }
//            }
//            for(int id :articleIdSet){
//                Articles atcs=new Articles();
//                atcs.setId(id);
//                selectedArticles.add(articlesMapper.selectByAll(atcs).get(0));
//            }
//
//            return selectedArticles;
//        }
//
//        return articlesMapper.selectByAll(articles);
//    }
//
//    @Override
//    public String publishShortArticle(Articles articles) {
//        ArticleTags articleTags = new ArticleTags();
//        String[] tagsList = articles.getTags();
//        articlesMapper.insert(articles);
//        int aid = articles.getId();
//        for (String tag :tagsList) {
//            articleTags.setArticleId(aid);
//            articleTags.setTag(tag);
//            articleTagsMapper.insertSelective(articleTags);
//        }
//        return "发表成功啦！";
//    }
//
//    @Override
//    public String publishPicture(PictureUpload pictureUpload, MultipartFile file) throws IOException {
//        PictureTags pictureTags=new PictureTags();
//        String[] tagsList=pictureUpload.getTags();
//        Pictures pictures=fileUpload(file,pictureUpload.getName(),pictureUpload.getNameId());
//        int pid=pictures.getId();
//        for (String tag:tagsList){
//            pictureTags.setPictureId(pid);
//            pictureTags.setTag(tag);
//            pictureTagsMapper.insertSelective(pictureTags);
//        }
//        return "ok";
//    }
//
//    private Pictures fileUpload(MultipartFile file,String name,int nameId) throws IOException {
//        String uuid = UUID.randomUUID().toString().trim();
//        String fileName = file.getOriginalFilename();
//        Pictures pictures = new Pictures();
//        Path fileMkdir = Paths.get("E:\\pictures");
//        if(!Files.exists(fileMkdir)) {
//            Files.createDirectory(fileMkdir);
//        }
//        Path copiedFile = Paths.get(fileMkdir.toString(), fileName);
//        Files.copy(file.getInputStream(), copiedFile);
//        pictures.setFilePath(copiedFile.toString());
//        pictures.setNameId(nameId);
//        pictures.setName(name);
//        pictures.setUuId(uuid);
//        pictures.setFileName(fileName);
//        picturesMapper.insert(pictures);
//        return pictures;
//    }
//
//    @Override
//    public List<Pictures> selectPictureByAll(Pictures pictures) {
//        return picturesMapper.selectByAll(pictures);
//    }
//
//    @Override
//    public byte[] getPictureByUUID(String uuid) throws IOException {
//        Pictures pic = new Pictures();
//        pic.setUuId(uuid);
//        List<Pictures> picResult = picturesMapper.selectByAll(pic);
//        if(!picResult.isEmpty()) {
//            String path = picResult.get(0).getFilePath();
//            InputStream in = new FileInputStream(path);
//            return IOUtils.toByteArray(in);
//        };
//
//        return new byte[0];
//
//    }
//
//    @Override
//    public List<ArticleTags> selectArticleTagsByArticleId(int id) {
//        return articleTagsMapper.selectByArticleId(id);
//    }
//
//    @Override
//    public List<ArticleComments> selectByArticleId(int id) {
//        return articleCommentsMapper.selectByArticleId(id);
//    }
//
//    @Override
//    public String insertSelectiveComment(ArticleComments articleComments) {
//         articleCommentsMapper.insertSelective(articleComments);
//         return "OK";
//    }
}
