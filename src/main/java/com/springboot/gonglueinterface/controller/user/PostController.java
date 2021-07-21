package com.springboot.gonglueinterface.controller.user;

import com.springboot.gonglueinterface.entity.Post;
import com.springboot.gonglueinterface.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class PostController {
    // 注入接口
    @Autowired
    private PostService postService;

    /**
     * 通过id获取post帖子
     * @param id 帖子id
     * @return 返回字符串
     */
    @GetMapping("/get_post")
    public String getPost(@RequestParam Integer id){
        return postService.getPost(id);
    }

    /**
     * 上传帖子
     * @param post 帖子
     * @return 返回状态
     */
    @PostMapping("/post_post")
    public String postPost(Post post){
        // 保存数据
        postService.save(post);
        return "上传成功！";
    }

}
