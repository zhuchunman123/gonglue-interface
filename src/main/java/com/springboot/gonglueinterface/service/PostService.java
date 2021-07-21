package com.springboot.gonglueinterface.service;


import com.springboot.gonglueinterface.entity.Post;

public interface PostService {
    // 获取一个帖子
    public String getPost(int id);

    void save(Post post);
}
