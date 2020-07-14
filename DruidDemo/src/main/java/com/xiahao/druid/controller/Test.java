package com.xiahao.druid.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by xiahao on 2020/7/14.
 */
@Controller
public class Test {
    @RequestMapping(value = "/test")
    @ResponseBody
    String test(){
        return "sd";
    }
}
