package com.example.renthaus.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("users")
public class AuthController {

    @GetMapping("/register")
    public String register(){
        return "auth-register.html";
    }

    @GetMapping("/login")
    public String login(){
        return "auth-login.html";
    }

}
