package com.junfeng.tobacco.service.impl;

import com.junfeng.tobacco.mapper.AllTableMapper;
import com.junfeng.tobacco.service.AllTableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AllTableServiceImpl implements AllTableService {

    @Autowired
    private AllTableMapper allTableMapper;

    @Override
    public List<String> selectAllTableName() throws Exception {

        return allTableMapper.selectAllTableName();
    }
}
