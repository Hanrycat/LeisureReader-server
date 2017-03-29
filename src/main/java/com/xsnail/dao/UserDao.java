package com.xsnail.dao;

import com.xsnail.entity.User;

/**
 * Created by Admin on 2017/3/25.
 */
public interface UserDao {
    User login(User user);
    Integer register(User user);
}
