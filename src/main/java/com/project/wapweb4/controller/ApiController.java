package com.project.wapweb4.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

@Controller
public class ApiController {
    @GetMapping("/sign-in")
    public String signIn(){
        return "sign-in/index";
    }
}