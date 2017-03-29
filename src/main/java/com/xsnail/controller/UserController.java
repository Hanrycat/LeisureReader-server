package com.xsnail.controller;

import com.xsnail.dto.ReaderResult;
import com.xsnail.entity.User;
import com.xsnail.service.UserService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * Created by Admin on 2017/3/25.
 */
@RestController
@RequestMapping("/user")
public class UserController  {
    @Resource
    private UserService userService;


    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public ReaderResult<User> login(@RequestParam("username") String username, @RequestParam("password") String password){
        User user = new User();
        user.setUserName(username);
        user.setPassWord(password);
        User findUser = userService.login(user);
        if(findUser != null){
            findUser.setPassWord(null);
            return new ReaderResult<User>(true,findUser);
        }else{
            return new ReaderResult<User>(false,"用户名或密码错误");
        }
    }

    @RequestMapping(value = "/register",method = RequestMethod.POST)
    public ReaderResult<User> register(@RequestParam("username") String username, @RequestParam("password") String password){
        User user = new User();
        user.setUserName(username);
        user.setPassWord(password);
        Integer row = userService.register(user);
        if(row != null && row == 1){
            return new ReaderResult(true);
        }else{
            return new ReaderResult(false,"用户名已存在");
        }
    }
}
