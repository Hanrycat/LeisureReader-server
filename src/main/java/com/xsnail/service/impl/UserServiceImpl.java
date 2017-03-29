package com.xsnail.service.impl;

import com.xsnail.dao.UserDao;
import com.xsnail.entity.User;
import com.xsnail.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by Admin on 2017/3/25.
 */
@Service("userService")
public class UserServiceImpl implements UserService {
    @Resource
    private UserDao userDao;

    public User login(User user) {
        return userDao.login(user);
    }

    public Integer register(User user) {
        return userDao.register(user);
    }
}
