package com.xsnail.entity;

import java.io.Serializable;

/**
 * Created by Admin on 2017/3/25.
 */
public class User implements Serializable{

    private String userName;
    private String passWord;
    private String portraitUrl;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public String getPortraitUrl() {
        return portraitUrl;
    }

    public void setPortraitUrl(String portraitUrl) {
        this.portraitUrl = portraitUrl;
    }
}
