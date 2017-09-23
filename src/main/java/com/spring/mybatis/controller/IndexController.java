package com.spring.mybatis.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by ye on 2017/9/21.
 */
@Controller
public class IndexController {
    @RequestMapping("/index/{name}")
    public String index(@PathVariable String name, Model model){
        model.addAttribute("name",name);
        return "index";
    }
}
