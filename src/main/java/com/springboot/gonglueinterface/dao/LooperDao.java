package com.springboot.gonglueinterface.dao;

import com.springboot.gonglueinterface.entity.Looper;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface LooperDao extends JpaRepository<Looper,String> ,
        JpaSpecificationExecutor<Looper> {
}
