package com.example.mapperxml.common.ctl;

import com.example.mapperxml.common.Constant;
import com.example.mapperxml.common.baseModel.NCCommonSVO;
import com.example.mapperxml.common.baseModel.ResponseDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

public class BaseRestCTL extends CommonCTL {
    protected ResponseDTO res;

    protected ResponseEntity<?> handleResponse(NCCommonSVO data) {
        if (data != null && res != null) {
            res.setMessage(Constant.API_SUCCESS_MESSAGE);
            res.setSuccess(true);
            res.setData(data);
            return new ResponseEntity<>(res, HttpStatus.OK);
        } else {
            res.setMessage(Constant.API_FAIL_MESSAGE);
            res.setSuccess(false);
            res.setData(null);
            return new ResponseEntity<>(res, HttpStatus.BAD_REQUEST);
        }
    }

    protected ResponseEntity<?> handleResponse(String data) {
        if (data != null && res != null) {
            res.setMessage(Constant.API_SUCCESS_MESSAGE);
            res.setSuccess(true);
            res.setData(data);
            return new ResponseEntity<>(res, HttpStatus.OK);
        } else {
            res.setMessage(Constant.API_FAIL_MESSAGE);
            res.setSuccess(false);
            res.setData(null);
            return new ResponseEntity<>(res, HttpStatus.BAD_REQUEST);
        }
    }


}
