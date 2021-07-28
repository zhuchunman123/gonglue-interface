package com.springboot.gonglueinterface.dao;

import com.springboot.gonglueinterface.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface PostDao extends JpaRepository<Post,String> ,
        JpaSpecificationExecutor<Post> {

}
