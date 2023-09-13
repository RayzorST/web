package com.mirea.web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class InfoPage {
    @GetMapping("/info")
    public String home(Model model){
        model.addAttribute("information", "Тут есть некоторая информация про МИРЭА");
        return "info";
    }
}
