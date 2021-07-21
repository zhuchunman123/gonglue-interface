package com.springboot.gonglueinterface.dao;


import com.springboot.gonglueinterface.entity.Image;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface ImageDao extends JpaRepository<Image,Integer> , JpaSpecificationExecutor<Image> {
}
