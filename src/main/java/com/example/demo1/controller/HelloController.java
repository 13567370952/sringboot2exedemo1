package com.example.demo1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author yang shen 906318518@qq.com
 * @date 2021/12/15 14:24
 * @desc
 */
@Controller
public class HelloController{
    @ResponseBody
    @RequestMapping("/hello")
    public String hello(){
        System.out.println("Hello World");
        return "Hello World";
    }
    @ResponseBody
    @RequestMapping("/hello2")
//    @PostMapping("/hello2")
    public String hello2(@RequestParam(value = "name") String name){
        System.out.println(name);
        return "Hello World" + name;
    }
}
