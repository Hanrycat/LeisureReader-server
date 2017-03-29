package com.xsnail.service;

import com.xsnail.entity.User;

/**
 * Created by Admin on 2017/3/25.
 */
public interface UserService {
    User login(User user);
    Integer register(User user);
}
