package com.xsnail.entity;

import java.util.List;

/**
 * Created by Admin on 2017/3/25.
 */
public class BookShelf {
    private List<String> bookIdList;
    private String userName;

    public List<String> getBookIdList() {
        return bookIdList;
    }

    public void setBookIdList(List<String> bookIdList) {
        this.bookIdList = bookIdList;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
