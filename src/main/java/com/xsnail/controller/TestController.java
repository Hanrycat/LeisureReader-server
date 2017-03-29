package com.xsnail.controller;

import com.xsnail.entity.Test;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Admin on 2017/3/27.
 */
@RestController
@RequestMapping("/test")
public class TestController
{
    @RequestMapping(value = "/test1",method = RequestMethod.GET)
    public Test getTest(){
        Test test = new Test();
        test.setName("xhh");
        test.setPassword("123456");
        return test;
    }
}
