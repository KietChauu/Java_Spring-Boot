package com.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @GetMapping("/")
    public String homepage(Model model) {
        model.addAttribute("message","XIN CHÀO TRƯỜNG ĐẠI HỌC VĂN LANG!");
        model.addAttribute("name","Châu Gia Kiệt");
        model.addAttribute("id","Mã số sinh viên: 2274802010449");
        model.addAttribute("email","kiet.2274802010449@vanlanguni.vn");
        return "index";
    }
}
