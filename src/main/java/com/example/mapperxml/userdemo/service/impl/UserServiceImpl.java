package com.example.mapperxml.userdemo.service.impl;

import com.example.mapperxml.common.baseModel.NCCommonSVO;
import com.example.mapperxml.userdemo.dao.UserDemoDAO;
import com.example.mapperxml.userdemo.service.IUserDemoService;
import com.example.mapperxml.userdemo.svo.UsersDemo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service("userService")
public class UserServiceImpl implements IUserDemoService {
    @Autowired
    private UserDemoDAO dao;

    @Override
    public String getType() {
        return null;
    }

    @Override
    public List<NCCommonSVO> selList(UsersDemo param) {

        return dao.selectList(param);
    }

    @Override
    public UsersDemo getOne(String paramString) {
        return null;
    }
}
