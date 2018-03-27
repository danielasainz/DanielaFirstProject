package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {

    //added a comment here
    @RequestMapping("/loadForm")
    public String loadFormPage () {
        return "formtemplate";
    }
    @RequestMapping("/processForm")
    public String loadFromPage (@RequestParam("loginname") String loginvalue, Model model) {

         //System.out.println(login);
        model.addAttribute("loginval", loginvalue);
        model.addAttribute("Terry", "My name is Terry");
     return "confirm";
    }
}
