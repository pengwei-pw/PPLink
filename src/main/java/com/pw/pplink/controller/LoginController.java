package com.pw.pplink.controller;

import com.pw.pplink.entity.po.User;
import com.pw.pplink.services.LoginServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class LoginController {
    /**
     * 登录
     */

    @Autowired
    private LoginServices loginServices;

    @GetMapping("login")
    public String login(){
        return "login";
    }

}
