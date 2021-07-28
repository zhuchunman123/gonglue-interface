package com.springboot.gonglueinterface.service.impl;

import com.springboot.gonglueinterface.dao.LooperDao;
import com.springboot.gonglueinterface.result.ResponseResult;
import com.springboot.gonglueinterface.service.LooperService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LooperServiceImpl implements LooperService {
    @Autowired
    private LooperDao looperDao;

    @Override
    public ResponseResult getLooper() {

        return null;
    }
}
