package com.springboot.gonglueinterface.controller.user;

import com.springboot.gonglueinterface.result.ResponseResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class PostController {

    @GetMapping("/get_post")
    public ResponseResult getPost(){
        return null;
    }
}
