package com.jk.controller;


import com.jk.service.UserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class UserController {


    @Resource
    private UserService userService;

    @RequestMapping("/show")
    public String show(){
        return  userService.show();
    }


}
