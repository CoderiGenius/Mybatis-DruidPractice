package com.example.mybatis.domain;

import org.springframework.boot.autoconfigure.domain.EntityScan;

import java.io.Serializable;

/**
 * Created by 周思成 on  2018/11/24 13:39
 */


public class Student implements Serializable{

    private Integer id;

    private String stuNum;

    private String stuPass;

    private String stuStatus;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStuNum() {
        return stuNum;
    }

    public void setStuNum(String stuNum) {
        this.stuNum = stuNum;
    }

    public String getStuPass() {
        return stuPass;
    }

    public void setStuPass(String stuPass) {
        this.stuPass = stuPass;
    }

    public String getStuStatus() {
        return stuStatus;
    }

    public void setStuStatus(String stuStatus) {
        this.stuStatus = stuStatus;
    }
}
