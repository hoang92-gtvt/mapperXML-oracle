package com.example.mapperxml.userdemo.service;

import com.example.mapperxml.common.baseModel.NCCommonSVO;
import com.example.mapperxml.common.svc.NCCommonSerVice;
import com.example.mapperxml.userdemo.svo.UsersDemo;
import org.springframework.data.domain.Page;

public interface IUserDemoService extends NCCommonSerVice<UsersDemo> {
    UsersDemo getOne(String paramString);

}
