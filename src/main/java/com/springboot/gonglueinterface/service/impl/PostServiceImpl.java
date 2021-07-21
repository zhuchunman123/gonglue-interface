package com.springboot.gonglueinterface.service.impl;

import com.springboot.gonglueinterface.dao.ImageDao;
import com.springboot.gonglueinterface.dao.PostDao;
import com.springboot.gonglueinterface.entity.Image;
import com.springboot.gonglueinterface.entity.Post;
import com.springboot.gonglueinterface.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class PostServiceImpl implements PostService {
    // 注入接口
    @Autowired
    private PostDao postDao;
    @Autowired
    private ImageDao imageDao;

    // 根据id获取帖子
    @Override
    public String getPost(int id) {
        // 获取帖子
        Post post = postDao.getById(id);
        // 获取图片
        Image image = imageDao.getById((int) post.getAvatar());
        System.out.println(post.toString().replace("avatar:" + post.getAvatar(), "avatar:" + image.getPath()));
        return post.toString().replace("avatar:"+post.getAvatar(),"avatar:"+image.getPath());
    }

    // 上传帖子
    @Override
    public void save(Post post) {
        // 添加参数
        post.setTotal(0);
        post.setLikeNum(0);
        post.setCollectionNum(0);
        post.setCommentNum(0);
        post.setShareNum(0);
        post.setViewNum(0);
        post.setCreateTime(new Date());
        // 保存数据
        postDao.save(post);
    }
}
