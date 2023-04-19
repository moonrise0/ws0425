package com.kbstar.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

//서버

@Controller
public class MainController {

    // http://127.0.0.1/
    @RequestMapping("/")
    public String main(){
        return "index";
    }


    @RequestMapping("/next")
    public String next(Model model){

        model.addAttribute("mydata","Hi");
        return "next"; //프로그램으로 이동.
    }

    @RequestMapping("/second")
    public String second(Model model){

        return "second"; //
    }
}