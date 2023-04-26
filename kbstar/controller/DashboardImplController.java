package com.kbstar.controller;


import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
public class DashboardImplController {
    @RequestMapping("/c1")
    public Object c1(){
        JSONObject jo = new JSONObject();
        JSONArray jaCnt = new JSONArray();

        for(int i = 1; i<=19; i++){
            Random r = new Random();
            int cnt = r.nextInt(20000)+1;
            jaCnt.add(cnt);
        }
        JSONArray jaYear = new JSONArray();
        for(int i=2011; i<=2023; i++){
            jaYear.add(i);
        }
        jo.put("category", jaYear);
        jo.put("datas", jaCnt);
        return jo;
    }


        @RequestMapping("/c2")
    public Object c2() {
        JSONArray ka = new JSONArray();
        for (int i = 1; i <= 5; i++) {
            Random r = new Random();
            int num = r.nextInt(20) + 1;
            JSONArray kadate = new JSONArray();
            kadate.add("data" + num);
            kadate.add(num);
            ka.add(kadate);

        }

        return ka;
    }


}