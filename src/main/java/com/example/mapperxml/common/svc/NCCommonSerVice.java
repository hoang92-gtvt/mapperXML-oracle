package com.example.mapperxml.common.svc;

import com.example.mapperxml.common.baseModel.NCCommonSVO;

import java.util.List;

public interface NCCommonSerVice<T> {
    //phuong thuc chung lay ra loai doi tuong
    String getType();

    //phuong thuc chung lay ra list doi tuong
    List<NCCommonSVO> selList(T param);

}
