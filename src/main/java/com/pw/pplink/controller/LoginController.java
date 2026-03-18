package com.pw.pplink.controller;

import com.pw.pplink.entity.po.User;
import com.pw.pplink.services.LoginServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("login")
public class LoginController {

    @Autowired
    private LoginServices loginServices;

    @GetMapping("user")
    @ResponseBody
    public User selectUserById(){
        User user = loginServices.selectById(1);
        return user;
    }
}
