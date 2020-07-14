package com.xiahao.druid.controller;

import com.xiahao.druid.model.User;
import com.xiahao.druid.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by xiahao on 2020/7/14.
 */
@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserService userService;
    @RequestMapping(value = "/getUser")
    @ResponseBody
    public User getUser(){
        return userService.getUserById(1);
    }
}
