package com.music.rica.controller;

import com.music.rica.entity.requestbody.LoginBody;
import com.music.rica.service.UserLoginService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@Controller
@RequestMapping(value = "/api/user")
public class LoginController {

    @Resource
    private UserLoginService userLoginService;

    @RequestMapping(value = "/login")
    public String index(@RequestParam("username") String userName,
                        @RequestParam("password") String password,
                        Model model){
        if(userLoginService.checkLoginUser(userName, password)){
            return "index";
        } else {
            model.addAttribute("msg", "用户名或密码错误");
            return "login";
        }
    }
}
