package com.uc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {

    @GetMapping("/Login")
    public String showLoginPage(){
        return "Login";
    }
}
