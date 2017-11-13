package com.gzw.bean;


import java.io.Serializable;

public class Code implements Serializable{

    private String mobile;//手机号码

    private String code;//验证码

    private String create_time;//验证码发送的时间

    private String use_time;//验证码使用的时间

    private Integer num;//当天该号码发送验证码的次数

    private String flag;//验证码是否使用的标识，1为已使用，0未使用

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getCreate_time() {
        return create_time;
    }

    public void setCreate_time(String create_time) {
        this.create_time = create_time;
    }

    public String getUse_time() {
        return use_time;
    }

    public void setUse_time(String use_time) {
        this.use_time = use_time;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }

    @Override
    public String toString() {
        return "Code [mobile=" + mobile + ", code=" + code + ", create_time="
                + create_time + ", use_time=" + use_time + ", num=" + num
                + ", flag=" + flag + "]";
    }





}
