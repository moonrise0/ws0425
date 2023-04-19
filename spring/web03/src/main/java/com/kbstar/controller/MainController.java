package com.kbstar.controller;


//서버

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

    // http://127.0.0.1/
    @RequestMapping("/")
    public String main(){
        return "index";
    }



}