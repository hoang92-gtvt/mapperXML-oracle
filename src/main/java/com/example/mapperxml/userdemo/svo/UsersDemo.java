package com.example.mapperxml.userdemo.svo;

import com.example.mapperxml.common.baseModel.NCCommonSVO;
import lombok.Data;

import java.util.Date;

@Data
public class UsersDemo extends NCCommonSVO {
    private Long id;
    private String name;
    private String password;
    private Date time;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }
}
