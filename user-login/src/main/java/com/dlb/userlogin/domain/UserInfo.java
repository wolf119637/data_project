package com.dlb.userlogin.domain;

import java.io.Serializable;

import com.alibaba.fastjson.annotation.JSONField;
import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 返回用户信息bean
 */
public class UserInfo implements Serializable {


    public Integer getUser_id() {
        return user_id;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getDataType() {
        return dataType;
    }

    public void setDataType(String dataType) {
        this.dataType = dataType;
    }

    public int getDataCondition() {
        return dataCondition;
    }

    public void setDataCondition(int dataCondition) {
        this.dataCondition = dataCondition;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public long getBalance() {
        return balance;
    }

    public void setBalance(long balance) {
        this.balance = balance;
    }

    //用户id
    public Integer user_id;
    //用户名字
    private String username;
    //数据类型
    @JSONField(serialize = false)
    private String dataType;
    //0.代表1个月  ,1代表 半年 ,2代表一年
    @JSONField(serialize = false)
    private int dataCondition;

    private String token;

    @JSONField(serialize = false)
    private long balance; //余额

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    private String address;


    @Override
    public String toString() {
        return "UserInfo{" + "user_id=" + user_id + ", username='" + username + '\'' + '}';
    }
}
